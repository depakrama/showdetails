package com.showdetails.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
"response","error"
})
public class ShowDetailsResponse {

@JsonProperty("response")
private List<Response> response = null;

@JsonProperty("response")
public List<Response> getResponse() {
return response;
}

@JsonProperty("response")
public void setResponse(List<Response> response) {
this.response = response;
}

@JsonProperty("error")
private String error;

public String getError() {
	return error;
}

public void setError(String error) {
	this.error = error;
}

}
