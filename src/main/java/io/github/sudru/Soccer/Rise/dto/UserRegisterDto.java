package io.github.sudru.Soccer.Rise.dto;

import lombok.Data;

import java.io.Serializable;

@Data

public class UserRegisterDto  implements Serializable {
    private String name;
    private String email;
    private String password;
    private String confirmPassword;
}
