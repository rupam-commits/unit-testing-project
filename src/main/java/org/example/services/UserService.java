package org.example.services;


public class UserService {

    private NotificationService notificationService;

    // Constructor injection
    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    // Method we want to test
    public String registerUser(String name) {
        // calls NotificationService
        String result = notificationService.sendEmail("Welcome " + name);
        return result;
    }

    // Another simple method
    public void welcomeUser(String name) {
        notificationService.logNotification("User " + name + " joined");
    }
}

