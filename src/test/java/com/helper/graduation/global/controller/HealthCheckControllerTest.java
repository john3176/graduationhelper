package com.helper.graduation.global.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class HealthCheckControllerTest {

    @Test
    @DisplayName("헬스체크 컨트롤러 테스트")
    void testHealthCheckController(){
        //given
        HealthCheckController healthCheckController = new HealthCheckController();

        //when
        String result = healthCheckController.healthCheck();

        //then
        assertThat(result).isEqualTo("Healthy");

    }

}