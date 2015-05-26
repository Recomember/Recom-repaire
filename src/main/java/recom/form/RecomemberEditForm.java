package recom.form;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;
import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Required;

@Component(instance = InstanceType.SESSION)
public class RecomemberEditForm implements Serializable {

	private static final long serialVersionUID = 1L;

	@Required
	public String memberName;

	@Mask(mask = "\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d")
	public String phoneNumber;

	public String favoriteFood;

	public String birthYear;

	public String birthMonth;

	public String birthDay;

	public String Note;

	public Integer recomemberId;

	public String talkStatus;

}
