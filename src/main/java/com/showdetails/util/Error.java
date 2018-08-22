package com.showdetails.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//import lombok.Getter;
//import lombok.RequiredArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
	"message" 
})

public class Error {

	@JsonProperty("error")
	private final String error;

	public String getError() {
		return error;
	}

	public Error(String error) {
		super();
		this.error = error;
	}

}
