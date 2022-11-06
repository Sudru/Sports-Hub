package io.github.sudru.Soccer.Rise.dto;

import lombok.Data;

import javax.validation.constraints.*;
import java.io.Serializable;

@Data

public class UserRegisterDto  implements Serializable {
    @NotBlank(message = "Field Cannot be empty")
    private String name;
    @NotBlank(message = "Email cannot be empty")
    @Email(message = "Invalid email")
    private String email;
    @Size(min = 8 ,message = "Password must be at least 8 characters long")
    private String password;
    @Min(8)
    private String confirmPassword;
}
