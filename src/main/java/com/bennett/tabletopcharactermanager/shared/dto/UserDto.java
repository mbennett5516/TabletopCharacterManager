package com.bennett.tabletopcharactermanager.shared.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class UserDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 103065364035629760L;

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String encryptedPassword;
}
