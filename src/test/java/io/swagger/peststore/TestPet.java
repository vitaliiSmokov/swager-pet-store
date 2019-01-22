package io.swagger.peststore;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.swagger.petstore.model.pet.PetModel;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;

public class TestPet {

    PetModel pet;

    @Test
    public void petTest() {
        int id = Integer.parseInt(RandomStringUtils.randomNumeric(5));
        String testPetName = RandomStringUtils.randomAlphabetic(8) + id;
        final String API_KEY = "3030705530";
        pet = new PetModel(id, null, testPetName, null, null, "AVAIBLE");
        RestAssured
                .given()
                .baseUri("https://petstore.swagger.io/")
                .basePath("/v2/pet")
                .contentType(ContentType.JSON)
                .header("api_key", API_KEY)
                .body(pet)
                .log().all()
                .when().post()
                .then()
                .statusCode(200)
                .body("id", equalTo(id))
                .body("name", equalTo(testPetName))
//                .body(equalTo(pet))
                .extract().response()
                .prettyPrint();
    }
}
