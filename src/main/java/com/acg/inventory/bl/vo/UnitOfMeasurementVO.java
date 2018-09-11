package com.acg.inventory.bl.vo;

import java.io.Serializable;

public class UnitOfMeasurementVO implements Serializable {
	private String id;
	private String name;

	public UnitOfMeasurementVO() {
		super();
	}

	public String getId() {
		return this.id;
	}

	public UnitOfMeasurementVO(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
