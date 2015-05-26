package recom.dto;

import org.seasar.struts.annotation.Required;


/**
 * ログイン時の入力値を保持するDto
 * @author masayuki
 *
 */
public class LoginInfoDto  {

	@Required
	public String userId;

	@Required
	public String password;



}
