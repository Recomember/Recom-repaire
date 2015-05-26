package recom.form;


import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Required;


public class RecomemberRegisterForm {

	public String talkStatus;

	@Required
	public String memberName;

	@Mask(mask = "\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d")
	public String phoneNumber;

	public String birthYear;

	public String birthMonth;

	public String birthDay;

	public String favoriteFood;

	public String Note;


}
