package com.worstcode.creationkit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import io.fusionauth.domain .*;
import io.fusionauth.domain.api .*;
import io.fusionauth.domain.api.user .*;
import io.fusionauth.javaclient .*;
import io.fusionauth.javaclient.domain .*;


public class HelloController {
    @FXML
    private Label welcomeText;


    public void onLoginButtonClick(ActionEvent actionEvent) {
    }

    public void onLoginButtonClick(ActionEvent actionEvent) {
        FusionAuthClient client = new FusionAuthClient("{FusionAuth-api-key}", "{FusionAuth-URL}", (tenantId));

        LoginRequest request = new LoginRequest("ApplicationId");
        request.loginId = "email@example.com";
        request.password = "password";

        try {
            ClientResponse<LoginResponse, Errors> response = client.login(request);

            if (response.wasSuccessful()) {
                // login successful
                // Do something

            } else {
                // login failed
                // handle errors
                System.out.println(response.errorResponse);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

