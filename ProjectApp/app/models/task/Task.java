package models.task;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.experimental.Accessors;
import models.accessUser.AccessUser;
import models.project.Project;
import models.project.vo.DeadlineDate;
import models.task.vo.TaskName;
import play.data.format.Formats;
import play.db.ebean.Model;

@Entity
@Getter
@Accessors(fluent = true)
public class Task extends Model {

	@Id
	public Long id;

	@ManyToOne
	@JoinColumn(name = "projectId")
	public Project project;

	@ManyToOne
	@JoinColumn(name = "userId")
	public AccessUser accessUser;

	@Embedded
	public TaskName taskName;

	@Embedded
	public DeadlineDate deadlineDate;

	@Formats.DateTime(pattern = "yyyy/MM/dd")
	public Date createDate;

	public Task(Project project, AccessUser accessUser, TaskName taskName,
			DeadlineDate deadlineDate) {
		this.project = project;
		this.accessUser = accessUser;
		this.taskName = taskName;
		this.deadlineDate = deadlineDate;
		this.createDate = new Date();
	}
}
