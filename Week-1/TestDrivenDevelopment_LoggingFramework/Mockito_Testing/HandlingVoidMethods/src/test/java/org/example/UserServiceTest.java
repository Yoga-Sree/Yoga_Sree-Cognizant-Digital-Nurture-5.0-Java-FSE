package org.example;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    void testVoidMethod() {

        // Create Mock
        NotificationService mockService =
                mock(NotificationService.class);

        // Stub Void Method
        doNothing().when(mockService)
                .sendNotification(anyString());

        // Inject Mock
        UserService userService =
                new UserService(mockService);

        // Call Method
        userService.notifyUser("Welcome to Mockito!");

        // Verify Method Call
        verify(mockService)
                .sendNotification("Welcome to Mockito!");
    }
}