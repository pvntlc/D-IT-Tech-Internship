package com.bnk.ws02.dto;

public class UserDto {
	public int userSeq;
	public String name;
	public String email;
	public String phone;
	public boolean isSleep;

	public UserDto() {
	}

	public UserDto(int userSeq, String name, String email, String phone, boolean isSleep) {
		this.userSeq = userSeq;
		this.email = email;
		this.name = name;
		this.phone = phone;
		this.isSleep = isSleep;
	}

	@Override
	public String toString() {
		return "UserDto [userSeq=" + userSeq + ", name=" + name + ", email=" + email + ", phone=" + phone + ", isSleep="
				+ isSleep + "]";
	}

}
