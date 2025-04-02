package com.muscletraining.dto.request;

import com.muscletraining.validation.PasswordMatches.PasswordMatches;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@PasswordMatches(fieldName = "password", checkFieldName = "passwordConfirm")
public class UserEditPasswordRequest {
    /**
     * パスワード
     */
    @NotBlank
    @Size(min = 8, max = 64)
    private String password;

    /**
     * パスワード（確認用）
     */
    @NotBlank
    @Size(min = 8, max = 64)
    private String passwordConfirm;
}
