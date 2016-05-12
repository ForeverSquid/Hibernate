package com.Forever.po;

/**
 * DrUser entity. @author MyEclipse Persistence Tools
 */
public class DrUser extends AbstractDrUser implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DrUser() {
	}

	/** full constructor */
	public DrUser(String username, String password, String nickname,
			String email, String sex, Integer rank, String online) {
		super(username, password, nickname, email, sex, rank, online);
	}

}
