package com.cos.baseball.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Baseball {
	private int id;
	private String name;
	private int num;
	private String position;
	private String team;
}
