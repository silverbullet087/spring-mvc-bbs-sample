package com.baekmin.smbs.test.model;

public class Test {
	
	private String apiMethodName;
	private String aclIp;
	private String primaryContact;
	private String deputy;
	
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getApiMethodName() {
		return apiMethodName;
	}
	public void setApiMethodName(String apiMethodName) {
		this.apiMethodName = apiMethodName;
	}
	public String getAclIp() {
		return aclIp;
	}
	public void setAclIp(String aclIp) {
		this.aclIp = aclIp;
	}
	public String getPrimaryContact() {
		return primaryContact;
	}
	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}
	public String getDeputy() {
		return deputy;
	}
	public void setDeputy(String deputy) {
		this.deputy = deputy;
	}

	@Override
	public String toString() {
		return "Test [apiMethodName=" + apiMethodName + ", aclIp=" + aclIp + ", primaryContact=" + primaryContact
				+ ", deputy=" + deputy + "]";
	}
	
}
