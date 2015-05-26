package recom.action;

import javax.annotation.Resource;

import org.seasar.framework.util.IntegerConversionUtil;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import recom.constant.RecomemberStatusConstant;
import recom.dto.RecomemberInfoDto;
import recom.form.SearchRecomemberInfoForm;
import recom.service.RecomemberService;

/**
 * 検索用アクションクラス
 * @author masayuki
 *
 */
public class SearchRecomemberInfoAction {

	@ActionForm
	@Resource
	protected SearchRecomemberInfoForm searchRecomemberInfoForm;

	@Resource
	public RecomemberService recomemberService;

	@Resource
	public RecomemberInfoDto recomemberInfoDto;

	//総件数
	public long total;


	public boolean hasNext;

	public boolean hasPrev;

	/**
	 * 検索ワードから当てはまるメンバーを取り出す
	 * @return 検索結果を反映した一覧画面
	 */
	@Execute(input="/recomemberList/showList?redirect=true")
	public String  searchRecomemberInfomation(){


		int page = IntegerConversionUtil.toPrimitiveInt(this.searchRecomemberInfoForm.page);

		//総件数を取得
		total = recomemberService.countSearchResults(searchRecomemberInfoForm.searchText);

		if(page != 0){
			hasPrev = true;
		}

		if((page + 1) * RecomemberStatusConstant.LIMIT < total){
		   hasNext = true;
		}

		recomemberInfoDto = recomemberService.searchRecomember(searchRecomemberInfoForm.searchText);
		return "../recomemberList/recomemberlist.jsp";
	}

}
