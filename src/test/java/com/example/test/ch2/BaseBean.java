package com.example.test.ch2;

public class BaseBean {

	private String baseName;

	private String baseId;

	public String getBaseId() {
		return baseId;
	}

	public String getBaseName() {
		return baseName;
	}

	public void setBaseId(String baseId) {
		this.baseId = baseId;
	}

	public void setBaseName(String baseName) {
		this.baseName = baseName;
	}

	@Override
	public String toString() {
		return "BaseBean{" +
				"baseName='" + baseName + '\'' +
				", baseId='" + baseId + '\'' +
				'}';
	}
}
