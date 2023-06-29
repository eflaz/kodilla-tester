package com.kodilla.stream;

import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        processUsersStream();
    }

    private static void processUsersStream() {
        UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}



