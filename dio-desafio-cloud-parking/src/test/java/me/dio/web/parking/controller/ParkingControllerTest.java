package me.dio.web.parking.controller;

import io.restassured.RestAssured;
import me.dio.web.parking.controller.dto.ParkingCreateDTO;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ParkingControllerTest extends AbstractContainerBase {

    @LocalServerPort
    private int randomPort;

    @BeforeEach
    public void setUpTes() {
        RestAssured.port = randomPort;
    }

    @Test
    void whenFindAllThenCheckResult() {
        RestAssured.given()
                //.header("authorization", "Basic dXNlcjpEaW9AMTIzNDU2")
                .auth()
                .basic("admin", "Dio@123456")
                .when()
                .get("/parking")
                .then()
                .statusCode(HttpStatus.OK.value());
    }



    @Test
    void whenCreateThenCheckIsCreated() {
        var createDPO = new ParkingCreateDTO();
        createDPO.setColor("AMARELO");
        createDPO.setLicence("WRT-5555");
        createDPO.setModel("BRASILIA");
        createDPO.setState("SP");

        RestAssured.given()
                .auth()
                .basic("admin", "Dio@123456")
                .when()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body(createDPO)
                .post("/parking")
                .then()
                .statusCode(HttpStatus.CREATED.value())
                .body("licence", Matchers.equalTo(("WRT-5555")))
                .body("color", Matchers.equalTo(("AMARELO")));
    }
}