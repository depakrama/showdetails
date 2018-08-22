package com.showdetails.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"payload",
"skip",
"take",
"totalRecords"
})
public class ShowDetailsRequest {

@JsonProperty("payload")
private List<Payload> payload = null;
@JsonProperty("skip")
private Long skip;
@JsonProperty("take")
private Long take;
@JsonProperty("totalRecords")
private Long totalRecords;

@JsonProperty("payload")
public List<Payload> getPayload() {
return payload;
}

@JsonProperty("payload")
public void setPayload(List<Payload> payload) {
this.payload = payload;
}

@JsonProperty("skip")
public Long getSkip() {
return skip;
}

@JsonProperty("skip")
public void setSkip(Long skip) {
this.skip = skip;
}

@JsonProperty("take")
public Long getTake() {
return take;
}

@JsonProperty("take")
public void setTake(Long take) {
this.take = take;
}

@JsonProperty("totalRecords")
public Long getTotalRecords() {
return totalRecords;
}

@JsonProperty("totalRecords")
public void setTotalRecords(Long totalRecords) {
this.totalRecords = totalRecords;
}


}
