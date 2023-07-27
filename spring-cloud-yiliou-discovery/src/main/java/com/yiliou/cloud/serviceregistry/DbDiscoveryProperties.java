package com.yiliou.cloud.serviceregistry;

import java.util.Objects;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by yiliou on 2023/7/27.
 */
@ConfigurationProperties(DbDiscoveryProperties.PREFIX)
public class DbDiscoveryProperties {


	/**
	 * DB Discovery Properties prefix.
	 */
	public static final String PREFIX = "spring.cloud.db.discovery";

	private String useName;

	private String password;

	private String url;

	static String getPREFIX() {
		return PREFIX;
	}

	String getUseName() {
		return useName;
	}

	void setUseName(String useName) {
		this.useName = useName;
	}

	String getPassword() {
		return password;
	}

	void setPassword(String password) {
		this.password = password;
	}

	String getUrl() {
		return url;
	}

	void setUrl(String url) {
		this.url = url;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		DbDiscoveryProperties that = (DbDiscoveryProperties) o;
		return Objects.equals(useName, that.useName) &&
				Objects.equals(password, that.password) &&
				Objects.equals(url, that.url);
	}

	@Override
	public int hashCode() {
		return Objects.hash(useName, password, url);
	}

	@Override
	public String toString() {
		return "DbDiscoveryProperties{" +
				"useName='" + useName + '\'' +
				", password='" + password + '\'' +
				", url='" + url + '\'' +
				'}';
	}
}
