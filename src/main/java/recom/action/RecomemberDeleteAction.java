package recom.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import recom.dto.RecomemberDeleteDto;
import recom.form.RecomemberDeleteForm;
import recom.service.RecomemberService;

/**
 * 削除用アクションクラス
 * @author masayuki
 *
 */
public class RecomemberDeleteAction {

	@ActionForm
	@Resource
	protected RecomemberDeleteForm recomemberdeleteForm;

	@Resource
	public RecomemberService recomemberService;

	@Resource
	public RecomemberDeleteDto recomemberdeleteDto;

	/**
	 * トップ画面に遷移
	 * @return トップ画面
	 */
	@Execute(validator = false)
	public String goTop() {
		return "/recomTop/goTop?redirect=true";
	}

	/**
	 * 一覧表示画面へリダイレクト
	 * @return 一覧画面
	 */
	@Execute(validator = false)
	public String showList(){
		return "/recomemberList/showList?redirect = true";
	}

	/**
	 * 登録画面へ遷移
	 * @return 登録画面
	 */
	@Execute(validator = false)
	public String newRegisterRecomember(){
		return "../recomemberRegister/register.jsp";
	}

	/**
	 * 削除確認画面へ遷移
	 * @return 削除確認画面
	 */
	@Execute(validator = false)
	public String deleteConfirm(){
		recomemberdeleteDto = recomemberService.getDeleteDto(recomemberdeleteForm.recomemberId);
		return "deleteConfirm.jsp";
	}

	/**
	 * 削除完了画面へ遷移
	 * @return 削除完了画面
	 */
	@Execute(validator = false)
	public String deleteComplete(){
		recomemberService.changeDeleteStatus(recomemberdeleteForm.recomemberId);
		return "deleteComplete.jsp";
	}
}
