package com.chacha;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test // 테스트 메서드
    @DisplayName("1 + 2 == 3") // 실행 결과에 표시될 이름
    void t1() {
        App app = new App();
        int rs = app.plus(1, 2);

        assertEquals(3, rs); // 두 값이 같은 지 비교(기대값, 실제값)
    }

    @Test // 테스트 메서드
    @DisplayName("10 + 20 == 30") // 실행 결과에 표시될 이름
    void t2() {
        App app = new App();
        int rs = app.plus(10, 20);

        assertEquals(30, rs); // 두 값이 같은 지 비교(기대값, 실제값)
    }
}
