package com.czj.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "baseQuery", description = "围栏基本信息")
public class BaseQuery implements Serializable {

	@ApiModelProperty(value = "第几页", dataType = "Integer")
	private int page = 0;
	@ApiModelProperty(value = "每页显示数(默认是每页10条数据)", dataType = "Integer")
	private int pageSize = 10;
	@ApiModelProperty(value = "开始行", dataType = "Integer", hidden = true)
	private int startRow;

	public int getStartRow() {
		return this.startRow = this. page * this.pageSize;
	}
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPage() {
		return this.page;
	}
	public void setPage(int page) {
		this.page = page <= 1 ? 0 : page - 1;
	}

}
