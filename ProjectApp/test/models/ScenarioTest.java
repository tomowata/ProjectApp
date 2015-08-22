package models;

import models.accessUser.AccessUser;
import models.accessUser.vo.Password;
import models.accessUser.vo.UserName;
import models.message.Message;
import models.message.vo.Contents;
import models.project.Project;
import models.project.vo.DeadlineDate;
import models.project.vo.ProjectName;
import models.task.Task;
import models.task.vo.TaskName;

import org.joda.time.DateTime;

public class ScenarioTest {

	public void entityTest() {
		UserName userName1 = new UserName("aaa");
		UserName userName2 = new UserName("bbb");
		UserName userName3 = new UserName("ccc");

		Password password1 = new Password("AAA");
		Password password2 = new Password("BBB");
		Password password3 = new Password("CCC");

		AccessUser accessUser1 = new AccessUser(userName1, password1);
		AccessUser accessUser2 = new AccessUser(userName2, password2);
		AccessUser accessUser3 = new AccessUser(userName3, password3);

		accessUser1.save();
		accessUser2.save();
		accessUser3.save();

		ProjectName projectName1 = new ProjectName("projectName1");
		ProjectName projectName2 = new ProjectName("projectName2");
		ProjectName projectName3 = new ProjectName("projectName3");

		DeadlineDate deadlineDate1 = new DeadlineDate(
				new DateTime("2015-08-25"));
		DeadlineDate deadlineDate2 = new DeadlineDate(
				new DateTime("2015-08-30"));

		Project project1 = new Project(accessUser1, projectName1, deadlineDate1);
		Project project2 = new Project(accessUser2, projectName2, deadlineDate1);
		Project project3 = new Project(accessUser3, projectName3, deadlineDate1);

		project1.save();
		project2.save();
		project3.save();

		TaskName taskName1 = new TaskName("taskName1");
		TaskName taskName2 = new TaskName("taskName2");
		TaskName taskName3 = new TaskName("taskName3");
		TaskName taskName4 = new TaskName("taskName4");
		TaskName taskName5 = new TaskName("taskName5");
		TaskName taskName6 = new TaskName("taskName6");

		Task task1 = new Task(project1, accessUser1, taskName1, deadlineDate2);
		Task task2 = new Task(project1, accessUser1, taskName2, deadlineDate2);
		Task task3 = new Task(project2, accessUser2, taskName3, deadlineDate2);
		Task task4 = new Task(project2, accessUser2, taskName4, deadlineDate2);
		Task task5 = new Task(project3, accessUser3, taskName5, deadlineDate2);
		Task task6 = new Task(project3, accessUser3, taskName6, deadlineDate2);

		task1.save();
		task2.save();
		task3.save();
		task4.save();
		task5.save();
		task6.save();

		Contents contents1 = new Contents("contents1");
		Contents contents2 = new Contents("contents2");
		Contents contents3 = new Contents("contents3");
		Contents contents4 = new Contents("contents4");
		Contents contents5 = new Contents("contents5");
		Contents contents6 = new Contents("contents6");

		Message message1 = new Message(accessUser1, project1, task1, contents1);
		Message message2 = new Message(accessUser1, project1, task1, contents2);
		Message message3 = new Message(accessUser2, project2, task1, contents3);
		Message message4 = new Message(accessUser2, project3, task1, contents4);
		Message message5 = new Message(accessUser3, project2, null, contents5);
		Message message6 = new Message(accessUser3, project3, null, contents6);

		message1.save();
		message2.save();
		message3.save();
		message4.save();
		message5.save();
		message6.save();

	}
}
