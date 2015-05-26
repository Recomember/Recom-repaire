package recom.action;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.Execute;

/**
 * ログアウトクラス
 *
 * @author masayuki
 *
 */
public class LogoutAction {

	/**
	 * ログアウト処理
	 *
	 * @return ログイン画面
	 */
	@Execute(validator = false)
	@RemoveSession(name = "userInfoDto")
	public String logout() {
		return "/login?redirect=true";
	}

}
