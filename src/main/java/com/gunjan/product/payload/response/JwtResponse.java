package com.gunjan.product.payload.response;

public class JwtResponse {
	private String token;
	private String id;
	private String username;
	
	public JwtResponse(String accessToken, String id, String username) {
		this.token = accessToken;
		this.id = id;
		this.username = username;
	}
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
