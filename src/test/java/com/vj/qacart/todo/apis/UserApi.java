package com.vj.qacart.todo.apis;

import com.vj.qacart.todo.models.User;
import com.vj.qacart.todo.utils.ConfigUtils;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class UserApi {
    public static void main(String[] args) {
        // Given, When, Then
        User user = new User();
        given()
            .baseUri(ConfigUtils.getInstance().getBaseUrl())
            .contentType(ContentType.JSON)
//            .body("{\"email\":\"super.vj.007c@email.com\",\"password\":\"Simple1!\",\"firstName\":\"John\",\"lastName\":\"Smith\"}")
            .body(user)
        .when()
            .post("/api/v1/users/register")
        .then()
            .log().all();
    }
}