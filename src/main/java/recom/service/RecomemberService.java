package recom.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.service.S2AbstractService;
import org.seasar.extension.jdbc.where.ComplexWhere;
import org.seasar.extension.jdbc.where.SimpleWhere;

import recom.constant.RecomemberStatusConstant;
import recom.dto.RecomemberDeleteDto;
import recom.dto.RecomemberEditDto;
import recom.dto.RecomemberInfoDto;
import recom.dto.RecomemberRegisterDto;
import recom.entity.Recomember;

public class RecomemberService extends S2AbstractService<Recomember> {

	@Resource
	protected RecomemberEditDto recomemberEditDto;

	/**
	 * DBにユーザーからの情報を登録する
	 *
	 * @param recomDto
	 *            登録情報を保持するDto
	 * @return
	 */
	public int insert(RecomemberRegisterDto recomDto) {
		Recomember entity = new Recomember();
		entity.recomemberName = recomDto.memberName;
		entity.phoneNumber = recomDto.phoneNumber;
		entity.favoriteFood = recomDto.favoriteFood;
		entity.birthYear = recomDto.birthYear;
		entity.birthMonth = recomDto.birthMonth;
		entity.birthDay = recomDto.birthDay;
		entity.note = recomDto.note;
		entity.deleteStatus = RecomemberStatusConstant.UNDELETE;
		if (recomDto.talkStatus.equals(RecomemberStatusConstant.NOTTALK)) {
			entity.talkStatus = RecomemberStatusConstant.UNTALKED;
		} else {
			entity.talkStatus = RecomemberStatusConstant.TALKED;
		}
		return insert(entity);
	}

	/**
	 * DBからdeleteStatusが 0のrecomemberの情報（エンティティ）を全件取得する
	 *
	 * @return 存在するメンバーの情報を保持するDto
	 */
	public RecomemberInfoDto getAllRecomemberDto(int page) {
		RecomemberInfoDto recomDto = new RecomemberInfoDto();

		List<Recomember> recomembers = select()
				.where(new SimpleWhere().eq("deleteStatus",
						RecomemberStatusConstant.UNDELETE))
				.limit(RecomemberStatusConstant.LIMIT)
				.offset(page * RecomemberStatusConstant.LIMIT).getResultList();
		recomDto = createDto(recomembers);
		return recomDto;
	}

	/**
	 * 一覧用DtoにEntityの値を入れる処理
	 *
	 * @param recomembers
	 *            メンバー用エンティティ
	 * @return DBから取得したエンティティを保持するDto
	 **/
	private RecomemberInfoDto createDto(List<Recomember> recomembers) {
		RecomemberInfoDto recomemberInfoDto = new RecomemberInfoDto();

		for (Recomember recomember : recomembers) {
			RecomemberInfoDto recomDisp = new RecomemberInfoDto(
					recomember.recomemberId, recomember.recomemberName,
					recomember.phoneNumber, recomember.birthYear,
					recomember.birthMonth, recomember.birthDay,
					recomember.note, recomember.favoriteFood);
			if (recomember.talkStatus == 0) {
				recomDisp.talkStatus = RecomemberStatusConstant.NOTTALK;
			} else {
				recomDisp.talkStatus = RecomemberStatusConstant.TALKCOMPLITE;
			}
			recomemberInfoDto.recomemberInfoDtos.add(recomDisp);
		}
		return recomemberInfoDto;
	}

	/**
	 * DeleteDtoにエンティティを入れる処理
	 *
	 * @param recomembers
	 *            DBの値を格納するリスト
	 * @return 削除用Dto
	 */
	private RecomemberDeleteDto createDeleteDto(List<Recomember> recomembers) {
		RecomemberDeleteDto recomemberDeleteDto = new RecomemberDeleteDto();
		for (Recomember recomember : recomembers) {
			RecomemberDeleteDto recomDisp = new RecomemberDeleteDto(
					recomember.recomemberName, recomember.phoneNumber,
					recomember.birthYear, recomember.birthMonth,
					recomember.birthDay, recomember.note,
					recomember.recomemberId, recomember.favoriteFood);
			if(recomember.talkStatus == RecomemberStatusConstant.UNTALKED){
				recomDisp.talkStatus = RecomemberStatusConstant.NOTTALK;
			}else{
				recomDisp.talkStatus = RecomemberStatusConstant.TALKCOMPLITE;
			}
			recomemberDeleteDto.recomemberDeleteDtos.add(recomDisp);
		}
		return recomemberDeleteDto;
	}

	/**
	 * 削除するメンバーのエンティティをDtoに格納する
	 *
	 * @return 削除用Dto
	 */
	public RecomemberDeleteDto getDeleteDto(Integer recomemberId) {
		List<Recomember> recomembers = findDeleteRecomember(recomemberId);
		RecomemberDeleteDto recomemberDeleteDto = createDeleteDto(recomembers);
		return recomemberDeleteDto;
	}

	/**
	 * DBから削除するRecomemberのエンティティを取得する
	 *
	 * @return 削除するRecomemberのエンティティ
	 */
	private List<Recomember> findDeleteRecomember(Integer recomemberId) {
		return select().where(
				new SimpleWhere().eq("recomemberId", recomemberId))
				.getResultList();
	}

	/**
	 * DBからRecomemberのIDを取得する
	 *
	 * @return 検索したIdを返す
	 */
	private Recomember findRecomemberById(Integer recomemberId) {
		return select().id(recomemberId).getSingleResult();
	}

	/**
	 * DBのdelete_statusを切り替える
	 *
	 * @param recomemberId
	 *            レコメンバーのID
	 * @return
	 */
	public int changeDeleteStatus(Integer recomemberId) {
		Recomember entity = findRecomemberById(recomemberId);
		entity.recomemberId = recomemberId;
		entity.updateDay = new Timestamp(System.currentTimeMillis());
		if (entity.deleteStatus == RecomemberStatusConstant.UNDELETE) {
			entity.deleteStatus = RecomemberStatusConstant.DELETE;
		} else {
			entity.deleteStatus = RecomemberStatusConstant.UNDELETE;
		}
		return update(entity);
	}

	/**
	 * DBから編集するRecomemberのエンティティを取得する
	 *
	 * @return 編集するRecomemberのエンティティ
	 */
	private Recomember findEditRecomember(Integer recomemberId) {
		return select().where(
				new SimpleWhere().eq("recomemberId", recomemberId))
				.getSingleResult();
	}

	/**
	 * 編集するメンバーのエンティティをDtoに格納する
	 *
	 * @return 編集用Dto
	 */
	public RecomemberEditDto getEditDto(Integer recomemberId) {
		Recomember recomembers = findEditRecomember(recomemberId); // DBから取得したエンティティをエンティティクラス型のリストに入れる
		RecomemberEditDto recomemberEditDto = createEditDto(recomembers); // エンティティクラス型のリストを引数にして編集用DtoにDBの値を入れる。
		return recomemberEditDto; // 編集用のDtoをリターンする
	}

	/**
	 * EditDtoにエンティティを入れる処理
	 *
	 * @param recomembers
	 *            DBの値を格納するリスト
	 * @return 編集用Dto
	 */
	private RecomemberEditDto createEditDto(Recomember recomembers) {

		recomemberEditDto.memberName = recomembers.recomemberName;
		recomemberEditDto.phoneNumber = recomembers.phoneNumber;
		recomemberEditDto.birthYear = recomembers.birthYear;
		recomemberEditDto.birthMonth = recomembers.birthMonth;
		recomemberEditDto.birthDay = recomembers.birthDay;
		recomemberEditDto.note = recomembers.note;
		recomemberEditDto.favoriteFood = recomembers.favoriteFood;
		if(recomembers.talkStatus == RecomemberStatusConstant.UNTALKED){
			recomemberEditDto.talkStatus = RecomemberStatusConstant.NOTTALK;
		}else{
			recomemberEditDto.talkStatus = RecomemberStatusConstant.TALKCOMPLITE;
		}

		return recomemberEditDto;
	}

	/**
	 * 編集結果を更新。
	 *
	 * @param recomemberEditDto
	 *            編集後の値を入れたDto
	 * @param recomemberId
	 *            画面で選択したメンバーのId
	 * @return
	 */
	public int updateRecomember(RecomemberEditDto recomemberEditDto, Integer recomemberId) {

		Recomember entity = findRecomemberById(recomemberId);
		entity.recomemberName = recomemberEditDto.memberName;
		entity.phoneNumber = recomemberEditDto.phoneNumber;
		entity.birthYear = recomemberEditDto.birthYear;
		entity.birthMonth = recomemberEditDto.birthMonth;
		entity.birthDay = recomemberEditDto.birthDay;
		entity.note = recomemberEditDto.note;
		entity.favoriteFood = recomemberEditDto.favoriteFood;
		entity.updateDay = new Timestamp(System.currentTimeMillis());
		if (recomemberEditDto.talkStatus
				.equals(RecomemberStatusConstant.NOTTALK)) {
			entity.talkStatus = RecomemberStatusConstant.UNTALKED;
		} else {
			entity.talkStatus = RecomemberStatusConstant.TALKED;
		}
		return update(entity);
	}

	/**
	 * 取得したエンティティをDtoに入れて検索用アクションにDtoを返す
	 *
	 * @return 検索に当てはまるメンバー情報
	 */
	public RecomemberInfoDto searchRecomember(String searchText) {
		List<String> searchWordList = deleteMultiWord(searchText);
		List<Recomember> searchResult = findRecomemberByWords(searchWordList); // エンティティのリスト
		RecomemberInfoDto searchResultDto = createSearchDto(searchResult); // エンティティをDtoに格納
		return searchResultDto;
	}

	/**
	 * 入力値のスペースを切り取り、入力値をリストに格納する
	 * @param searchText
	 * @return 入力値を格納したリスト
	 */
	private List<String> deleteMultiWord(String searchText) {
		searchText = searchText.trim();
		searchText = searchText.replaceAll("　", " ");
		searchText = searchText.replaceAll(" {2}", "");
		String[] searchWords = searchText.split("\\s", 0);
		List<String> wordList = new ArrayList<>();
		for (String word : searchWords) {
			if (!(wordList.contains(word))) {
				wordList.add(word);
			}
		}
		return wordList;
	}

	/**
	 * 検索ワードに引っ掛かるデータをSQLから取得する
	 * @param searchText
	 *            検索画面の入力値
	 * @return 検索結果のエンティティをリストコレクションに格納したもの
	 *
	 */
	private List<Recomember> findRecomemberByWords(List<String> searchWordList) {

		List<Recomember> searchResult = new ArrayList<>();
		Map<Integer, Recomember> mapResult = new HashMap<>();
		if (isSeachTextNotNull(searchWordList)) {
			for (String searchWord : searchWordList) {
				searchResult = jdbcManager.selectBySql(Recomember.class,
						"select * " + "from recomember " + "where "
								+ "delete_status = 0 and ("
								+ "recomember_name like '%' ? '%'"
								+ " or " +  "phone_number like '%' ? '%'"
								+ " or " +  "birth_year like '%' ? '%'"
								+ " or " +  "birth_month like '%' ? '%'"
								+ " or " +  "birth_day like '%' ? '%'"
								+ " or " +  "favorite_food like '%' ? '%'"
								+ " or " +  "info_note like '%' ? '%');"
								, searchWord, searchWord, searchWord, searchWord, searchWord, searchWord, searchWord)
								.getResultList();
				for (Recomember result : searchResult) {
					mapResult.put(result.recomemberId, result);
				}
			}
		}

			List<Recomember> searchResults = new ArrayList<>(mapResult.values());

			return searchResults;
	}

	/**
	 * 検索結果の件数とページを管理するメソッド
	 * @param searchText 検索ワード
	 * @param page ページ
	 * @return 検索件数
	 */
	public long countSearchResults(String searchText){
		List<String> searchWordList = deleteMultiWord(searchText);
		List<Recomember> searchResult = findRecomemberByWords(searchWordList);
		long countResult = searchResult.size();
		return countResult;
	}

	/**
	 * 渡された文字列が空文字列(長さ＝０)ならば、nullを返します。 そうでなければ、渡された文字列をそのまま返します。
	 *
	 * @param searchText
	 * @return
	 */
	private boolean isSeachTextNotNull(List<String> searchWordList) {
		return (!(searchWordList.isEmpty())) ? true : false;
	}

	/**
	 * 取得したエンティティをDtoに入れる処理
	 *
	 * @param searchResult
	 * @return エンティティから取得したデータを入れたDto
	 */
	private RecomemberInfoDto createSearchDto(List<Recomember> searchResult) {
		RecomemberInfoDto searchRecomemberInfoDto = new RecomemberInfoDto();

			for (Recomember recomember : searchResult) {
				RecomemberInfoDto recomDisp = new RecomemberInfoDto(
						recomember.recomemberId, recomember.recomemberName,
						recomember.phoneNumber, recomember.birthYear,
						recomember.birthMonth, recomember.birthDay,
						recomember.note, recomember.favoriteFood);
				if (recomember.talkStatus == RecomemberStatusConstant.UNTALKED) {
					recomDisp.talkStatus = RecomemberStatusConstant.NOTTALK;
				} else {
					recomDisp.talkStatus = RecomemberStatusConstant.TALKCOMPLITE;
				}
				searchRecomemberInfoDto.recomemberInfoDtos.add(recomDisp);
			}

		return searchRecomemberInfoDto;
	}

	/**
	 * 未削除のRecomemberを除く全Recomemberの人数
	 *
	 * @return 全Recomemberの人数
	 */
	public long countAllRecomemeber() {
		long allRecomemberSize = select().where(
				new SimpleWhere().eq("deleteStatus",
						RecomemberStatusConstant.UNDELETE)).getCount();
		return allRecomemberSize;
	}

	/**
	 * 未削除のRecomemberの内、会話したRecomemberの人数を取得する
	 *
	 * @return 会話したRecomemberの人数
	 */
	public long countTalkRecomember() {
		ComplexWhere complexWhere = new ComplexWhere();
		long talkedRecomember = select().where(
				complexWhere.eq("deleteStatus",
						RecomemberStatusConstant.UNTALKED),
				complexWhere.eq("talkStatus", RecomemberStatusConstant.TALKED))
				.getCount();
		return talkedRecomember;
	}
}
