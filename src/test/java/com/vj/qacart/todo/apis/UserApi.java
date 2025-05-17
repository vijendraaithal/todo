package com.vj.qacart.todo.apis;

import com.vj.qacart.todo.models.User;
import com.vj.qacart.todo.utils.ConfigUtils;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserApi {
    public static void main(String[] args) {
        // Given, When, Then
        User user = new User();
        Response response = given()
            .baseUri(ConfigUtils.getInstance().getBaseUrl())
            .contentType(ContentType.JSON)
//            .body("{\"email\":\"super.vj.007c@email.com\",\"password\":\"Simple1!\",\"firstName\":\"John\",\"lastName\":\"Smith\"}")
            .body(user)
        .when()
            .post("/api/v1/users/register")
        .then()
//            .log().all();
            .extract().response();

        String access_token = response.path("access_token");
        String firstName = response.path("firstName");
        String userId = response.path("userID");
        System.out.println(response.body().prettyPrint());
        System.out.println(firstName);
        System.out.println(access_token);
        System.out.println(userId);
    }
}