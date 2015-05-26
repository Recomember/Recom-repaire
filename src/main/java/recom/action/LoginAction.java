package recom.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import recom.dto.LoginInfoDto;
import recom.dto.UserInfoDto;
import recom.form.LoginForm;
import recom.service.LoginService;

/**
 * ログイン用のクラス
 *
 * @author masayuki
 *
 */
public class LoginAction {

	@ActionForm
	@Resource
	protected LoginForm loginForm;

	@Resource
	public LoginInfoDto loginInfoDto;

	public UserInfoDto userInfoDto;

	public LoginService loginService;

	/**
	 * ログイン画面表示
	 *
	 * @return ログイン画面
	 */
	@Execute(validator = false)
	public String index() {
		return "login.jsp";
	}

	/**
	 * トップ画面へリダイレクト
	 *
	 * @return トップ画面
	 */
	@Execute(input = "login.jsp")
	public String goTop() {
		loginInfoDto = new LoginInfoDto();

		loginInfoDto.userId = loginForm.userId;
		loginInfoDto.password = loginForm.password;

		if (loginService.matchLoginInfo(loginInfoDto.userId, loginInfoDto.password)) {
			userInfoDto.userId = loginInfoDto.userId;
			userInfoDto.password = loginInfoDto.password;
			return "/recomTop/goTop?redirect=true";

		} else {
			return "login.jsp";
		}
	}

}
