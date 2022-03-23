package com.douglashdezt.library.models.dtos;

public class TimeResponseDTO {
	public String time;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public TimeResponseDTO(String time) {
		super();
		this.time = time;
	}
}
