package recom.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

@Component(instance = InstanceType.SESSION)
public class UserInfoDto implements Serializable {

	private static final long serialVersionUID = 1L;

	public UserInfoDto(){}

	public String userId;

	public String password;

}
