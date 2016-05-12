package com.Forever.po;

/**
 * AbstractDrUser entity provides the base persistence definition of the DrUser
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDrUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String password;
	private String nickname;
	private String email;
	private String sex;
	private Integer rank;
	private String online;

	// Constructors

	/** default constructor */
	public AbstractDrUser() {
	}

	/** full constructor */
	public AbstractDrUser(String username, String password, String nickname,
			String email, String sex, Integer rank, String online) {
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.email = email;
		this.sex = sex;
		this.rank = rank;
		this.online = online;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getRank() {
		return this.rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public String getOnline() {
		return this.online;
	}

	public void setOnline(String online) {
		this.online = online;
	}

}