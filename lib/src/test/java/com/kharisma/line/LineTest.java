package com.kharisma.line;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class LineTest {

    @Test
    public void getLengthShouldReturnResult() {
        double answer = 5;
        int x1 = 0;
        int y1 = 3;
        int x2 = 4;
        int y2 = 0;
        Line line = new Line(x1, y1, x2, y2);

        Assertions.assertEquals(answer, line.getLength(), 0.0001);
    }
}
