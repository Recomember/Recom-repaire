package recom.action;

import javax.annotation.Resource;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.framework.util.StringUtil;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import recom.dto.RecomemberEditDto;
import recom.form.RecomemberEditForm;
import recom.service.RecomemberService;

/**
 * 編集用アクションクラス
 * @author masayuki
 *
 */
public class RecomemberEditAction {

	@ActionForm
	@Resource
	protected RecomemberEditForm recomemberEditForm;

	@Resource
	public RecomemberEditDto recomemberEditDto;

	@Resource
	protected RecomemberService recomemberService;

	/**
	 * トップ画面にリダイレクト
	 *
	 * @return トップ画面
	 */
	@Execute(validator = false)
	@RemoveSession(name = "recomemberEditDto")
	public String goTop() {
		return "/recomTop/goTop?redirect=true";
	}

	/**
	 * 一覧表示画面へリダイレクト
	 *
	 * @return 一覧画面
	 */
	@Execute(validator = false)
	@RemoveSession(name = "recomemberEditDto")
	public String showList() {
		return "/recomemberList/showList?redirect=true";
	}

	/**
	 * 登録画面へ遷移
	 *
	 * @return 登録画面
	 */
	@Execute(validator = false)
	@RemoveSession(name = "recomemberEditDto")
	public String newRegisterRecomember() {
		return "/recomemberRegister/newRegisterRecomember";
	}

	/**
	 * 編集画面へ遷移
	 *
	 * @return 編集画面
	 */
	@RemoveSession(name = "recomemberEditDto")
	@Execute(validator = false)
	public String editRecomember() {
		recomemberEditDto = recomemberService
				.getEditDto(recomemberEditForm.recomemberId);
		return "edit.jsp";
	}

	/**
	 * 編集確認画面へ遷移
	 *
	 * @return 編集確認画面
	 */
	@Execute(validator = false)
	public String editConfirm() {
		recomemberEditDto.talkStatus = recomemberEditForm.talkStatus;

		recomemberEditDto.memberName = recomemberEditForm.memberName;

		recomemberEditDto.phoneNumber = recomemberEditForm.phoneNumber;

		recomemberEditDto.favoriteFood = recomemberEditForm.favoriteFood;

		recomemberEditDto.birthYear = recomemberEditForm.birthYear;

		recomemberEditDto.birthMonth = recomemberEditForm.birthMonth;

		recomemberEditDto.birthDay = recomemberEditForm.birthDay;

		recomemberEditDto.note = recomemberEditForm.Note;

		return "editConfirm.jsp";
	}

	/**
	 * 編集完了画面へリダイレクト
	 *
	 * @return 編集完了画面
	 */

	@Execute(validator = false)
	public String editComplete() {

		recomemberEditDto.talkStatus = recomemberEditForm.talkStatus;

		recomemberEditDto.memberName = recomemberEditForm.memberName;

		recomemberEditDto.phoneNumber = recomemberEditForm.phoneNumber;

		recomemberEditDto.favoriteFood = recomemberEditForm.favoriteFood;

		recomemberEditDto.birthYear = recomemberEditForm.birthYear;

		recomemberEditDto.birthMonth = recomemberEditForm.birthMonth;

		recomemberEditDto.birthDay = recomemberEditForm.birthDay;

		recomemberEditDto.note = recomemberEditForm.Note;

		if (StringUtil.isNotBlank(recomemberEditDto.memberName)) {
			recomemberService.updateRecomember(recomemberEditDto,
					recomemberEditForm.recomemberId);
		}

		return "editComplete.jsp";
	}

	@Execute(validator = false)
	public String backEdit(){

		return "edit.jsp";
	}
}
