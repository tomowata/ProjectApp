package models.project.vo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Value;
import lombok.experimental.Accessors;

@Embeddable
@Value
@Accessors(fluent = true)
public class ProjectName {

	@Column(name = "projectName", nullable = false, length = 20)
	@Getter
	private String value;

	public ProjectName(String value) {
		this.value = value;
	}
}
