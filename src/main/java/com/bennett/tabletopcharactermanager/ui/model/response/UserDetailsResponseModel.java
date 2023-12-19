package com.bennett.tabletopcharactermanager.ui.model.response;

import lombok.Data;

@Data
public class UserDetailsResponseModel {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
}
