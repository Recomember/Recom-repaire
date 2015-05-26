package recom.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

@Component(instance = InstanceType.SESSION)
public class RecomemberRegisterDto implements Serializable {

	private static final long serialVersionUID = 1L;

	public String talkStatus;

	public String memberName;

	public String phoneNumber;

	public String birthYear;

	public String birthMonth;

	public String birthDay;

	public String favoriteFood;

	public String note;

}
