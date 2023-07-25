package com.hrms.hrms_app.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Attendance {
	
	private Long attendanceId;
    private Long employeeId;
    private LocalDate checkInDate;
    private LocalTime checkInTime;
    private LocalTime checkOutTime;
	public Long getAttendanceId() {
		return attendanceId;
	}
	public void setAttendanceId(Long attendanceId) {
		this.attendanceId = attendanceId;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public LocalDate getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(LocalDate checkInDate) {
		this.checkInDate = checkInDate;
	}
	public LocalTime getCheckInTime() {
		return checkInTime;
	}
	public void setCheckInTime(LocalTime checkInTime) {
		this.checkInTime = checkInTime;
	}
	public LocalTime getCheckOutTime() {
		return checkOutTime;
	}
	public void setCheckOutTime(LocalTime checkOutTime) {
		this.checkOutTime = checkOutTime;
	}
	@Override
	public String toString() {
		return "Attendance [attendanceId=" + attendanceId + ", employeeId=" + employeeId + ", checkInDate="
				+ checkInDate + ", checkInTime=" + checkInTime + ", checkOutTime=" + checkOutTime + "]";
	}
    
    

}
