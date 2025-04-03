package com.muscletraining.dto.request.User;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserEditEmailRequest {
    /**
     * メールアドレス
     */
    @NotBlank
    @Email
    private String email;
}
