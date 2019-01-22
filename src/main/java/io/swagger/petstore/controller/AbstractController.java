package io.swagger.petstore.controller;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;

public abstract class AbstractController {
    static {
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .addHeader("apikey", "3030705530")
                .setBaseUri("http://petstore.swagger.io")
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL).build();
    }
}
