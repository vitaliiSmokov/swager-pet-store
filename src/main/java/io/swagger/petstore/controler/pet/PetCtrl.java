package io.swagger.petstore.controler.pet;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.swagger.petstore.model.pet.PetModel;

import static io.restassured.RestAssured.given;

public class PetCtrl {

    public PetCtrl() {
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .addHeader("apikey", "3030705530")
                .setBaseUri("http://petstore.swagger.io")
                .setBasePath("/v2/pet")
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL).build();
    }

    public PetModel addNewPet(PetModel pet) {
        return given().body(pet)
                .when().post()
                .as(PetModel.class);
    }
}
