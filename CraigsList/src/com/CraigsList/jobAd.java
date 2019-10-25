package com.CraigsList;

public class jobAd {
	private String job_title;
	private String job_desc;
	private String job_exp;
	private String job_location;
	private String job_contact;

	public jobAd(String job_title, String job_desc, String job_exp, String job_location, String job_contact) {
		super();
		this.job_title = job_title;
		this.job_desc = job_desc;
		this.job_exp = job_exp;
		this.job_location = job_location;
		this.job_contact = job_contact;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public String getJob_desc() {
		return job_desc;
	}

	public void setJob_desc(String job_desc) {
		this.job_desc = job_desc;
	}

	public String getJob_exp() {
		return job_exp;
	}

	public void setJob_exp(String job_exp) {
		this.job_exp = job_exp;
	}

	public String getJob_location() {
		return job_location;
	}

	public void setJob_location(String job_location) {
		this.job_location = job_location;
	}

	public String getJob_contact() {
		return job_contact;
	}

	public void setJob_contact(String job_contact) {
		this.job_contact = job_contact;
	}
}
