package com.example.javawebapp.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@AllArgsConstructor
@ToString
public class AppUserRegistrationRequest {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
}
