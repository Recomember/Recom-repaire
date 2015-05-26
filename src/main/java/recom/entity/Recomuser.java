package recom.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class Recomuser {

	public static final int USERACTIVE = 0;
	public static final int USERDELETE = 1;

	@Id
	@Column(name = "user_Id", length = 15,  nullable = false, unique = true)
    public String userId;

	@Column(name = "password", nullable = false)
	public String password;

	@Column(name = "delete_status", nullable = false)
	public String deleteStatus;
}
