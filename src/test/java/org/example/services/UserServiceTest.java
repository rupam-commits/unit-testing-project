package org.example.services;



import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class) // Enables Mockito in JUnit 5
public class UserServiceTest {

    @Mock
    NotificationService notificationService; // Fake dependency

    @InjectMocks
    UserService userService; // Class under test

    @Test
    void registerUserTest() {
        // Step 1: Tell Mockito what to return when sendEmail is called
        when(notificationService.sendEmail("Welcome Rupam"))
                .thenReturn("Email sent");

        // Step 2: Call the method we want to test
        String result = userService.registerUser("Rupam");
        System.out.println(result);

        // Step 3: Verify the result
        assertEquals("Email sent", result);
    }
}

