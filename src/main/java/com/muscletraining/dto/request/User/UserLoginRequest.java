package com.muscletraining.dto.request.User;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserLoginRequest {

    /**
     * ユーザー名
     */
    @NotBlank
    @Size(min = 1, max = 50)
    private String userName;

    /**
     * パスワード
     */
    @NotBlank
    @Size(min = 8, max = 64)
    private String password;
    
}
