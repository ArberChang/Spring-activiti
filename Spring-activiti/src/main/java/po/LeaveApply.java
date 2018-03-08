package po;

import java.io.Serializable;

import org.activiti.engine.task.Task;

/**
 * 
* <p>Title: LeaveApply<／p>
* <p>Description:假期实体类 <／p>
* <p>Company: want-want<／p> 
* @author 00319159
* @date 2018年3月8日 下午4:56:13
------\(˙<>˙)/------
 */
public class LeaveApply implements Serializable{
	
	int id;
	String process_instance_id;
	String user_id;//申请人id
	String start_time;//开始时间
	String end_time;//结束时间
	String leave_type;//假期类型
	String reason;//申请原因
	String apply_time;//批准时间
	String reality_start_time;//实际开始时间
	String reality_end_time;//实际结束时间
	Task task;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProcess_instance_id() {
		return process_instance_id;
	}
	public void setProcess_instance_id(String process_instance_id) {
		this.process_instance_id = process_instance_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getLeave_type() {
		return leave_type;
	}
	public void setLeave_type(String leave_type) {
		this.leave_type = leave_type;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getApply_time() {
		return apply_time;
	}
	public void setApply_time(String apply_time) {
		this.apply_time = apply_time;
	}
	public String getReality_start_time() {
		return reality_start_time;
	}
	public void setReality_start_time(String reality_start_time) {
		this.reality_start_time = reality_start_time;
	}
	public String getReality_end_time() {
		return reality_end_time;
	}
	public void setReality_end_time(String reality_end_time) {
		this.reality_end_time = reality_end_time;
	}
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
	
}
