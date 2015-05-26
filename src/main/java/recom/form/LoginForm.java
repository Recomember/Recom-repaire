package recom.form;

import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Required;

public class LoginForm {

	@Required
	@Mask(mask = "masayuki.toyama")
	public String userId;

	@Required
	@Mask(mask = "masa0127")
	public String password;

}
