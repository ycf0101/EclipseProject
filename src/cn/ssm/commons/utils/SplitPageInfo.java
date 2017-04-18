package cn.ssm.commons.utils;

import java.util.List;

public class SplitPageInfo {

	private int totalRowsAmount; //总行数
	private boolean rowsAmountSet;  //
	private int pageSize;  //页面大小
	private int currentPage;  //当前页
	private int nextPage;  //下一页
	private int previousPage;  //上一页
	private int totalPages;  //总页数
	private int pageRowBegin;  //页起始行
	private int pageRowEnd;   //页结束行
	private boolean hasToFirstPage;  //点击首页
	private boolean hasNext;  //是否含有下一页
	private boolean hasPrevious;  //是否含有上一页
	private boolean hasLastPage;  //点击尾页
	private String description;  //描述
	private boolean listIsEmpty;  //空集合
	private String sbSqlWhere;  //带条件
	private List<?> listInfo; //结果集
	
	public SplitPageInfo(){
		this.pageSize = 5;
	    this.currentPage = 1;
	    this.listIsEmpty = true;
	    this.sbSqlWhere = null;
	    this.listInfo = null;
	}
	
	public SplitPageInfo(int pageSize)
	{
	  this.currentPage = 1;
	  this.listIsEmpty = true;
	  this.sbSqlWhere = null;
	  this.pageSize = pageSize;
	  this.rowsAmountSet = false;
	  this.listInfo = null;
	}
	  
	public int getTotalRowsAmount() {
		return totalRowsAmount;
	}
	public void setTotalRowsAmount(int totalRowsAmount) {
		this.totalRowsAmount = totalRowsAmount;
	}
	public boolean isRowsAmountSet() {
		return rowsAmountSet;
	}
	public void setRowsAmountSet(boolean rowsAmountSet) {
		this.rowsAmountSet = rowsAmountSet;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getNextPage() {
		return nextPage;
	}
	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}
	public int getPreviousPage() {
		return previousPage;
	}
	public void setPreviousPage(int previousPage) {
		this.previousPage = previousPage;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public int getPageRowBegin() {
		return pageRowBegin;
	}
	public void setPageRowBegin(int pageRowBegin) {
		this.pageRowBegin = pageRowBegin;
	}
	public int getPageRowEnd() {
		return pageRowEnd;
	}
	public void setPageRowEnd(int pageRowEnd) {
		this.pageRowEnd = pageRowEnd;
	}
	public boolean isHasToFirstPage() {
		return hasToFirstPage;
	}
	public void setHasToFirstPage(boolean hasToFirstPage) {
		this.hasToFirstPage = hasToFirstPage;
	}
	public boolean isHasNext() {
		return hasNext;
	}
	public void setHasNext(boolean hasNext) {
		this.hasNext = hasNext;
	}
	public boolean isHasPrevious() {
		return hasPrevious;
	}
	public void setHasPrevious(boolean hasPrevious) {
		this.hasPrevious = hasPrevious;
	}
	public boolean isHasLastPage() {
		return hasLastPage;
	}
	public void setHasLastPage(boolean hasLastPage) {
		this.hasLastPage = hasLastPage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isListIsEmpty() {
		return listIsEmpty;
	}
	public void setListIsEmpty(boolean listIsEmpty) {
		this.listIsEmpty = listIsEmpty;
	}
	public String getSbSqlWhere() {
		return sbSqlWhere;
	}
	public void setSbSqlWhere(String sbSqlWhere) {
		this.sbSqlWhere = sbSqlWhere;
	}

	public List<?> getListInfo() {
		return listInfo;
	}

	public void setListInfo(List<?> listInfo) {
		this.listInfo = listInfo;
	}
}
