package com.muscletraining.dto.request;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserEditRequest {
    
    /**
     * ユーザー名
     */
    @NotBlank
    @Size(min = 1, max = 50)
    private String userName;

    /**
     * 姓
     */
    @NotBlank
    @Size(min = 1, max = 20)
    private String lastName;

    /**
     * 名
     */
    @NotBlank 
    @Size(min = 1, max = 20)
    private String firstName;

    /**
     * 性別（1:男、2:女）
     */
    @NotBlank
    @Pattern(regexp = "1|2")
    private String sex;

    /**
     * 電話番号
     */
    @NotBlank
    @Pattern(regexp = "^(090|080|070)-\\d{4}-\\d{4}")
    private String phoneNumber;

    /**
     * 身長
     */
    @Min(value = 0)
    @Max(value = 999)
    private BigDecimal bodyHeight;

    /**
     * 体重
     */
    @Min(value = 0)
    @Max(value = 999)
    private BigDecimal bodyWeight;

    /**
     * 生年月日
     */
    @NotBlank
    @Past
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

}
