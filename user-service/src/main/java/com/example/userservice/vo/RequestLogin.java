package com.example.userservice.vo;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RequestLogin {
    @NotNull(message = "Email cannot be null")
    @Size(min = 2, message = "cannot be less than 2 characters")
    private String email;
    @NotNull(message = "Password cannot be null")
    @Size(min = 8, message = "cannot be less than 8 characters")
    private String password;
}
