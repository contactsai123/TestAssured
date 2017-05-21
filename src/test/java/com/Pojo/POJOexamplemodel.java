package com.Pojo;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"name",
"price",
"tags"
})
public class POJOexamplemodel {

@JsonProperty("id")
public Integer id;
@JsonProperty("name")
public String name;
@JsonProperty("price")
public int price;
@JsonProperty("tags")
public List<String> tags = null;

}