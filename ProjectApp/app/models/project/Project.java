package models.project;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.experimental.Accessors;
import models.accessUser.AccessUser;
import models.project.vo.DeadlineDate;
import models.project.vo.ProjectName;
import play.data.format.Formats;
import play.db.ebean.Model;

@Entity
@Getter
@Accessors(fluent = true)
public class Project extends Model {

	@Id
	public Long id;

	@ManyToOne
	@JoinColumn(name = "userId")
	public AccessUser accessUser;

	@Embedded
	public ProjectName projectName;

	@Embedded
	public DeadlineDate deadlineDate;

	@Formats.DateTime(pattern = "yyyy/MM/dd")
	public Date createDate;

	public Project(AccessUser accessUser, ProjectName projectName,
			DeadlineDate deadlineDate) {
		this.accessUser = accessUser;
		this.projectName = projectName;
		this.deadlineDate = deadlineDate;
		this.createDate = new Date();
	}
}
