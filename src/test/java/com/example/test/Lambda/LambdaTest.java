package com.example.test.Lambda;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * lambda测试
 *
 * @author lumingming
 * @version 1.0
 * @create 2018-11-26 10:56
 **/
public class LambdaTest {
    @Test
    public void test1() {
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer", "Roger Federer",
                "Andy Murray", "Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players = Arrays.asList(atp);

        // 使用 lambda 表达式以及函数操作(functional operation)
        players.forEach((player) -> System.out.print(player + "; "));
        players.forEach(System.out::println);
    }
}
