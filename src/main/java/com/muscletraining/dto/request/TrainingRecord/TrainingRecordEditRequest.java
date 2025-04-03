package com.muscletraining.dto.request.TrainingRecord;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.Data;

@Data
public class TrainingRecordEditRequest {
    /**
     * トレーニング記録ID
     */
    @NotNull
    private BigInteger trainingRecordId;

    /**
     * トレーニング日
     */
    @NotBlank
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Past
    private LocalDate trainingDate;

    /**
     * トレーニング時間
     */
    @NotBlank
    @JsonFormat(pattern = "HH:mm")
    private LocalTime trainingTime;

    /**
     * トレーニングメニューID
     */
    @NotNull
    private Integer trainingMenu;

    /**
     * 回数
     */
    @NotNull
    private Integer repetitions;

    /**
     * 重量
     */
    @NotNull
    @DecimalMin(value = "0.25", inclusive = true)
    @DecimalMax(value = "999.99", inclusive = true)
    private Double weight;
}
