package models.message;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.experimental.Accessors;
import models.accessUser.AccessUser;
import models.message.vo.Contents;
import models.project.Project;
import models.task.Task;
import play.data.format.Formats;
import play.db.ebean.Model;

@Entity
@Getter
@Accessors(fluent = true)
public class Message extends Model {

	@Id
	public Long id;

	@ManyToOne
	@JoinColumn(name = "userId")
	public AccessUser accessUser;

	@ManyToOne
	@JoinColumn(name = "projectId")
	public Project project;

	@ManyToOne
	@JoinColumn(name = "taskId")
	public Task task;

	@Embedded
	public Contents contents;

	@Formats.DateTime(pattern = "yyyy/MM/dd")
	public Date createDate;

	public Message(AccessUser accessUser, Project project, Task task,
			Contents contents) {
		this.accessUser = accessUser;
		this.project = project;
		this.task = task;
		this.contents = contents;
		this.createDate = new Date();
	}

}
