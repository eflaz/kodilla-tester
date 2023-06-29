package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    @Test
    void filterChemistGroupUsernames() {
        List<String> result = UsersManager.filterChemistGroupUsernames();
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Walter White");
        expectedList.add("Gale Boetticher");

        assertEquals(expectedList, result);
    }

    @Test
    void filterOlderUsernames() {
        List<User> result = UsersManager.filterOlderUsernames(40);
        for (User user : result) {
            assertTrue(user.getAge()>40);
        }
    }

    @Test
    void filterNumberOfPostUsernames() {
        List<User> result = UsersManager.filterNumberOfPostUsernames(100);
        for (User user : result) {
            assertTrue(user.getNumberOfPost()>100);
        }
    }
}