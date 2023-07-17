package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ForumStatsTest {

    @Test
    void getAverageForOlder_shouldReturnZero() {

        List<User> users = new ArrayList<>();
        double expected = 0;

        double actual = ForumStats.getAverageForOlderOrEqual(users);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getAverageForOlder() {

        List<User> users = new ArrayList<>();
        users.add(new User("test1", 40, 20, "gr1"));
        users.add(new User("test1", 41, 30, "gr1"));
        double expected = 25;

        double actual = ForumStats.getAverageForOlderOrEqual(users);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getAverageForYounger_shouldReturnZero() {

        List<User> users = new ArrayList<>();
        double expected = 0;

        double actual = ForumStats.getAverageForYounger(users);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void getAverageForYounger() {

        List<User> users = new ArrayList<>();
        users.add(new User("test1", 40, 20, "gr1"));
        users.add(new User("test1", 39, 30, "gr1"));
        users.add(new User("test1", 38, 40, "gr1"));
        double expected =35;

        double actual = ForumStats.getAverageForYounger(users);

        Assertions.assertEquals(expected, actual);
    }

}