package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {

        double averageForOlder = getAverageForOlderOrEqual(UsersRepository.getUsersList());
        double averageForYounger = getAverageForYounger(UsersRepository.getUsersList());

        System.out.println("Average for older: " + averageForOlder);
        System.out.println("Average for younger: " + averageForYounger);
    }

    public static double getAverageForOlderOrEqual(List<User> userList) {
        return userList.stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }

    public static double getAverageForYounger(List<User> userList) {
        return userList.stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }
}
