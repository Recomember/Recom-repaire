package recom.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import recom.dto.RecomemberInfoDto;
import recom.service.RecomemberService;

/**
 * トップ画面用アクションクラス
 * @author masayukis
 *
 */
public class RecomTopAction {

	@Resource
	public RecomemberService recomemberService;

	@Resource
	public RecomemberInfoDto recomemberinfoDto;

	//会話済みRecomember
	public long countTalkRecomember;

	//全Recomember
	public long countAllRecomember;

	//会話してないRecomember
	public long countNotTalkRecomember;

	//会話率
	public long ratioOfTalkedRecomember;

	/**
	 * トップ画面を表示
	 *
	 * @return トップ画面
	 */
	@Execute(validator = false)
	public String goTop() {
		countTalkRecomember = recomemberService.countTalkRecomember();
		countAllRecomember = recomemberService.countAllRecomemeber();
		countNotTalkRecomember = countAllRecomember - countTalkRecomember;
		ratioOfTalkedRecomember = (countTalkRecomember * 100) / (countAllRecomember);

		return "recomTop.jsp";
	}

	/**
	 * 一覧画面を出力する
	 *
	 * @return 一覧画面
	 */
	@Execute(validator = false)
	public String showList() {
		return "/recomemberList/showList?redirect = true";
	}

	/**
	 * 新規登録画面出力
	 *
	 * @return 新規登録画面
	 */
	@Execute(validator = false)
	public String newRegisterRecomember() {
		return "../recomemberRegister/register.jsp";
	}
}
