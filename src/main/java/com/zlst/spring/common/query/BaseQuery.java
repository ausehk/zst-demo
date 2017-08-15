package com.zlst.spring.common.query;

import java.io.Serializable;

public class BaseQuery implements Serializable {
	  private static final long serialVersionUID = 1L;
	    private int pageNumber = 1;
	    private int pageSize = 10;
	    private String sortName;
	    private String sortOrder;

	    public BaseQuery() {
	    }

	    public void setPageNumber(Integer pageNumber) {
	        if(pageNumber != null && pageNumber.intValue() > 0) {
	            this.pageNumber = pageNumber.intValue();
	        }

	    }

	    public void setCurPage(Integer pageNumber) {
	        if(pageNumber != null && pageNumber.intValue() > 0) {
	            this.pageNumber = pageNumber.intValue();
	        }

	    }

	    public int getPageNumber() {
	        return this.pageNumber;
	    }

	    public void setPageSize(Integer pageSize) {
	        if(pageSize != null && pageSize.intValue() > 0) {
	            this.pageSize = pageSize.intValue();
	        }

	    }

	    public int getPageSize() {
	        return this.pageSize;
	    }

	    protected boolean isBlank(String value) {
	        return null == value || "".equals(value.trim());
	    }

	    public String getSortName() {
	        return this.sortName;
	    }

	    public void setSortName(String sortName) {
	        this.sortName = sortName;
	    }

	    public String getSortOrder() {
	        return this.sortOrder != null && !"".equals(this.sortOrder.trim())?this.sortOrder:"DESC";
	    }

	    public void setSortOrder(String sortOrder) {
	        this.sortOrder = sortOrder;
	    }
}
