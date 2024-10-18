package com.baeldung.test;

import com.baeldung.config.UiApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = UiApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class UiIntegrationTest {

    @Test
    void whenLoadApplication_thenSuccess() {

    }
}
