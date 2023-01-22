package org.example.foodStore;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class MenuItemTest {
    @DisplayName("메뉴 아이템 객체 생성을 확인한다.")
    @Test
    void createTest() {
        assertThatCode(()-> new MenuItem("만두", 5000)).doesNotThrowAnyException();
    }


}
