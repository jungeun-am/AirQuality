package com.example.jungeun.airquality.airquality;

import com.example.jungeun.airquality.airquality.service.AirQualityService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirQualityServiceTest {
    
    private AirQualityService airQualityService;
    
    @BeforeEach 
    public void setUp() { 
        airQualityService = new AirQualityService();
    }
    
    @Test
    @DisplayName("testAirQualityServiceBasic")
    public void testAirQualityServiceBasic() throws Exception {
        
        // 테스트 실행(메서드 호출)
        String result = airQualityService.getAirQualityDataBasic();

        // 결과 검증 - 제대로 실행된면 null 이 아니어야 함.
        assertNotNull(result); // 응답이 Null 인지 여부 확인
        assertFalse(result.isEmpty()); // 응답이 비었는지 여부 확인
        
        // JSON 응답이 유효한지 여부 확인
        // 즉, 올바른 JSON 형태의 데이터인지 확인
        assertDoesNotThrow(() -> new ObjectMapper().readTree(result));

    } 
    
}
