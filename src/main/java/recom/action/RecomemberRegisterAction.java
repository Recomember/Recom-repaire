package recom.action;

import javax.annotation.Resource;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.framework.util.StringUtil;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import recom.dto.RecomemberRegisterDto;
import recom.form.RecomemberRegisterForm;
import recom.service.RecomemberService;

/**
 * 登録画面用アクションクラス
 * @author masayuki
 *
 */
public class RecomemberRegisterAction {

	@ActionForm
	@Resource
	public RecomemberRegisterForm recomemberRegisterForm;

	@Resource
	public RecomemberService recomemberService;

	@Resource
	public RecomemberRegisterDto recomemberRegisterDto;

	/**
	 * トップ画面を表示
	 *
	 * @return トップ画面
	 */
	@RemoveSession(name="recomemberRegisterDto")
	@Execute(validator = false)
	public String goTop() {
		return "../recomTop/goTop?redirect=true";
	}

	/**
	 * 一覧画面を出力する
	 *
	 * @return 一覧画面
	 */
	@RemoveSession(name="recomemberRegisterDto")
	@Execute(validator = false)
	public String showList() {
		return "/recomemberList/showList?redirect = true";
	}

	/**
	 * 登録画面を出力する
	 *
	 * @return 登録画面
	 */
	@RemoveSession(name="recomemberRegisterDto")
	@Execute(validator = false)
	public String newRegisterRecomember() {
		return "register.jsp";
	}

	/**
	 * 登録確認画面に遷移する
	 * @return 登録確認画面
	 */
	@Execute(input = "register.jsp")
	public String registerConfirm() {

		recomemberRegisterDto.talkStatus = recomemberRegisterForm.talkStatus;

		recomemberRegisterDto.memberName = recomemberRegisterForm.memberName;

		recomemberRegisterDto.phoneNumber = recomemberRegisterForm.phoneNumber;

		recomemberRegisterDto.birthYear = recomemberRegisterForm.birthYear;

		recomemberRegisterDto.birthMonth = recomemberRegisterForm.birthMonth;

		recomemberRegisterDto.birthDay = recomemberRegisterForm.birthDay;

		recomemberRegisterDto.favoriteFood = recomemberRegisterForm.favoriteFood;

		recomemberRegisterDto.note = recomemberRegisterForm.Note;

		return "registerConfirm.jsp";

	}

	/**
	 * Dbにデータを登録し、登録完了画面へ遷移する
	 * @return 登録完了画面
	 */
	@RemoveSession(name="recomemberRegisterDto")
	@Execute(validator = false)
	public String registerComplete() {

		if (StringUtil.isNotBlank(recomemberRegisterDto.memberName)) {
			recomemberService.insert(recomemberRegisterDto);
		}
		return "registerComplete.jsp";
	}

}