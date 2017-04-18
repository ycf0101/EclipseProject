package cn.ssm.commons.utils;

import java.util.List;

public class SplitPageInfo {

	private int totalRowsAmount; //������
	private boolean rowsAmountSet;  //
	private int pageSize;  //ҳ���С
	private int currentPage;  //��ǰҳ
	private int nextPage;  //��һҳ
	private int previousPage;  //��һҳ
	private int totalPages;  //��ҳ��
	private int pageRowBegin;  //ҳ��ʼ��
	private int pageRowEnd;   //ҳ������
	private boolean hasToFirstPage;  //�����ҳ
	private boolean hasNext;  //�Ƿ�����һҳ
	private boolean hasPrevious;  //�Ƿ�����һҳ
	private boolean hasLastPage;  //���βҳ
	private String description;  //����
	private boolean listIsEmpty;  //�ռ���
	private String sbSqlWhere;  //������
	private List<?> listInfo; //�����
	
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
