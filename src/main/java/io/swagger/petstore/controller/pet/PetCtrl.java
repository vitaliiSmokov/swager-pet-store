package io.swagger.petstore.controller.pet;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.swagger.petstore.controller.AbstractController;
import io.swagger.petstore.model.pet.PetModel;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class PetCtrl extends AbstractController {

    private RequestSpecBuilder petSpec = new RequestSpecBuilder()
            .addCookie("coockie")
            .addHeaders(new HashMap<>());


    public PetCtrl() {
//        RestAssured.requestSpecification.basePath("/v2/pet");
        RestAssured.basePath = "/v2/pet";
    }

    public PetModel addNewPet(PetModel pet) {
        return given(petSpec.build())
                .body(pet)
                .when().post()
                .as(PetModel.class);
    }
}
