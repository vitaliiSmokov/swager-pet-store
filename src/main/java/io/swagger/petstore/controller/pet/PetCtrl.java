package io.swagger.petstore.controller.pet;

import io.restassured.RestAssured;
import io.swagger.petstore.controller.AbstractController;
import io.swagger.petstore.model.pet.PetModel;

import static io.restassured.RestAssured.given;

public class PetCtrl extends AbstractController {

    public PetCtrl() {
//        RestAssured.requestSpecification.basePath("/v2/pet");
//        RestAssured.requestSpecification = new RequestSpecBuilder().setBasePath("/v2/pet").build();
        RestAssured.basePath = "/v2/pet";
    }

    public PetModel addNewPet(PetModel pet) {
        return given().body(pet)
                .when().post()
                .as(PetModel.class);
    }
}
