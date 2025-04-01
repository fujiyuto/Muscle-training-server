package com.muscletraining.dto.request;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.context.MessageSource;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
public class UserCreateRequest {
    private final MessageSource messageSource;

    public UserCreateRequest(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @NotBlank
    @Size(min = 1, max = 50)
    private String userName;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min = 8, max = 64)
    private String password;

    @NotBlank
    @Size(min = 1, max = 20)
    private String lastName;

    @NotBlank 
    @Size(min = 1, max = 20)
    private String firstName;

    @NotBlank
    @Pattern(regexp = "1|2")
    private String sex;

    @NotBlank
    @Pattern(regexp = "^(090|080|070)-\\d{4}-\\d{4}")
    private String phoneNumber;

    @Min(value = 0)
    @Max(value = 999)
    private BigDecimal bodyHeight;

    @Min(value = 0)
    @Max(value = 999)
    private BigDecimal bodyWeight;

    @NotBlank
    @Past
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
}
