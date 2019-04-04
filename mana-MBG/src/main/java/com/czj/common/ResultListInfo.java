package com.czj.common;


import com.czj.base.BaseQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

@ApiModel( value = "resultListInfo", description = "分页通用应答消息体")
public class ResultListInfo<T> implements Serializable{

	@ApiModelProperty(value = "回显参数")
	private BaseQuery baseQuery;  //参数回显

	@ApiModelProperty(value = "数据列表", dataType = "List")
	private List<T> results; // 数据

	@ApiModelProperty(value = "总条数", dataType = "Long")
	private Long totalCount; // 总条数

	@ApiModelProperty(value = "总页数", dataType = "Long")
	private Long totalPage; //总页数

	public BaseQuery getBaseQuery() {
		return baseQuery;
	}
	public void setBaseQuery(BaseQuery baseQuery) {
		this.baseQuery = baseQuery;
	}
	public List<T> getResults() {
		return results;
	}
	public void setResults(List<T> results) {
		this.results = results;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getTotalPage() {
		return this.getTotalCount()%this.getBaseQuery().getPageSize()==0 ?
				this.getTotalCount()/this.getBaseQuery().getPageSize()
				:this.getTotalCount()/this.getBaseQuery().getPageSize()+1;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}

	@Override
	public String toString() {
		return "ResultListInfo{" +
				"baseQuery=" + baseQuery +
				", results=" + results +
				", totalCount=" + totalCount +
				", totalPage=" + totalPage +
				'}';
	}
}
