package io.swagger.peststore;

import io.swagger.petstore.model.pet.PetModel;
import io.swagger.petstore.controller.pet.PetCtrl;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

public class PetObjectTest {

    @Test
    public void testCanAddNewPetToStore() {
        int id = Integer.parseInt(RandomStringUtils.randomNumeric(5));
        String testPetName = RandomStringUtils.randomAlphabetic(8) + id;
        PetModel testPet = new PetModel(id, null,testPetName, null, null, "AVAIBLE");

        PetModel pet = new PetCtrl().addNewPet(testPet);
        System.out.println(pet);
    }

}
