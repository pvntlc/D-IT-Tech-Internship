package com.bnk.java.io.objectio;

public class Customer implements java.io.Serializable {
	String name;
	String address;
	transient int age;

	public String toString() {
		return "이름 : " + name + "\t주소 : " + address + "\t나이 : " + age;
	}
}
