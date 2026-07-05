package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    void testArgumentMatcher() {

        // Create Mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub using Argument Matcher
        when(mockApi.getUserData(anyString()))
                .thenReturn("Mock User");

        // Inject Mock
        UserService service = new UserService(mockApi);

        // Call Service
        String result = service.fetchUser("U101");

        // Verify Result
        assertEquals("Mock User", result);

        // Verify Interaction
        verify(mockApi).getUserData(anyString());
    }
}