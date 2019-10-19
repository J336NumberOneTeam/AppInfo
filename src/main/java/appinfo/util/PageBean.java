package appinfo.util;

import java.util.List;

/**
 * 分页工具类
 * @author Tequila
 *
 */
public class PageBean<T> {
	private int currentPage;//当前页
	private int pageSize;//每页显示的条数
	private int totalPage;//总页数
	private int totalCount;//总记录数(多少数据)
	private List<T> result;//每页显示的内容 <T>任意类型
	private int startIndex; //起始页
	
	public int getStartIndex() {
		return (currentPage-1)*pageSize;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalPage() {

		return totalPage=totalCount%pageSize==0?totalCount/pageSize:(totalCount/pageSize)+1;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public List<T> getResult() {
		return result;
	}
	public void setResult(List<T> result) {
		this.result = result;
	}
	

}
