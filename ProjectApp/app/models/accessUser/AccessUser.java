package models.accessUser;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.experimental.Accessors;
import models.accessUser.vo.Password;
import models.accessUser.vo.UserName;
import play.db.ebean.Model;

@Entity
@Getter
@Accessors(fluent = true)
@Table(name = "accessUser")
public class AccessUser extends Model {

	@Id
	@Getter
	public Long id;

	@Embedded
	@Getter
	public UserName userName;

	@Embedded
	public Password password;

	public AccessUser(UserName userName, Password password) {
		this.userName = userName;
		this.password = password;
	}

	public UserName getUserName() {
		return userName;
	}

}
