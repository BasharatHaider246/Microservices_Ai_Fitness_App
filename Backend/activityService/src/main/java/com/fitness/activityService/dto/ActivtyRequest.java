package com.fitness.activityService.dto;

import com.fitness.activityService.models.ActivityType;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Map;

@Data
import java.time.LocalDateTime;
import java.util.Map;

public class ActivtyRequest {
    private String userId;
    private ActivityType type;
    private Integer duration;
    private Integer caloriesBurned;
    private LocalDateTime startTime;
    private Map<String,Object> additionalMetrics;


}
