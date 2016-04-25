package com.CAQAS.model;

public class QuestionsResultModel {
	private Integer quesId;//问题Id
	private String quesTitle;//问题标题
	private Integer searchNum;//查询次数
	private String quesCreateTime;//问题创建时间
	private String answTitle;
	private String answContent;//答复内容
	private String answTime;//答复时间
	
	public Integer getQuesId() {
		return quesId;
	}
	public void setQuesId(Integer quesId) {
		this.quesId = quesId;
	}
	public String getQuesTitle() {
		return quesTitle;
	}
	public void setQuesTitle(String quesTitle) {
		this.quesTitle = quesTitle;
	}
	public Integer getSearchNum() {
		return searchNum;
	}
	public void setSearchNum(Integer searchNum) {
		this.searchNum = searchNum;
	}
	public String getQuesCreateTime() {
		return quesCreateTime;
	}
	public void setQuesCreateTime(String quesCreateTime) {
		this.quesCreateTime = quesCreateTime;
	}
	public String getAnswTitle() {
		return answTitle;
	}
	public void setAnswTitle(String answTitle) {
		this.answTitle = answTitle;
	}
	public String getAnswContent() {
		return answContent;
	}
	public void setAnswContent(String answContent) {
		this.answContent = answContent;
	}
	public String getAnswTime() {
		return answTime;
	}
	public void setAnswTime(String answTime) {
		this.answTime = answTime;
	}
	
}