package com.kclm.owep.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @fieldName: serialVersionUID
 * @author caolz
 * @fieldType: long
 * @Description:
 */
public class SysLogDTO implements java.io.Serializable{

	private static final long serialVersionUID = 3684561205904739338L;
	private Integer logId;// 日志id
	private Integer userId;//用户id
	private String name;//姓名
	private String username;//用户名
	private String title;// 日志主题
	private String ipaddr;// ip地址
	private String method;// 请求方式
	private String requrl;// 请求地址
	private int type;// 日志类型 0：web端 1：学生端
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date createtime;// 创建时间
	private String starttime;// 创建时间
	private String endtime;// 创建时间
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getLogId() {
		return logId;
	}
	public void setLogId(Integer logId) {
		this.logId = logId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIpaddr() {
		return ipaddr;
	}
	public void setIpaddr(String ipaddr) {
		this.ipaddr = ipaddr;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getRequrl() {
		return requrl;
	}
	public void setRequrl(String requrl) {
		this.requrl = requrl;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	
	
}
