package org.example;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testVerifyInteraction() {

        // Create Mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Inject Mock
        MyService service = new MyService(mockApi);

        // Call method
        service.processData("Hello Mockito");

        // Verify interaction
        verify(mockApi).sendData("Hello Mockito");
    }
}