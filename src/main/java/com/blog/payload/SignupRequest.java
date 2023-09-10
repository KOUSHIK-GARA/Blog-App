package com.blog.payload;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SignupRequest {
    private String username;
    private String password;
    private String role;
    private String about;
}
