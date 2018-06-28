package com.briup.apps.poll.bean.extend;

import com.briup.apps.poll.bean.Grade;
import com.briup.apps.poll.bean.User;
//自动生成的尽量不要更改，因为改代码后要重新生成，自己改的无效了。
//包含clazz，并把clazz中的两个外键做成关系映射
public class ClazzVM {
	 private Long id;
	 private String name;
	 private String description;
	 private Grade grade;
	 private User charge;
	 public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public User getCharge() {
		return charge;
	}
	public void setCharge(User charge) {
		this.charge = charge;
	}
	
}
