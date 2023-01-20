package ColdWar.Semicolon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CodeTest {
    private Code code;
    @BeforeEach
    void setUp() {
        code = new Code();
    }

    @Test
    void OddOutlierWillbeDetected(){
        int[] arr = {3, 5, 9, 7, 11, 10};
        code.checkForOddAndEven(arr);
       assertEquals(10, code.getResult());
    }





}