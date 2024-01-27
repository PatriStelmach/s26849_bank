package com.example.s26849_bank;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


public class ClientTest {
    @SpringBootTest
    class TestID {
        @Autowired
        private Client client;

        @Test
        void checkIDNumbers()
        {
            assertThat(ID.length).isEqualTo(10);
        }



    }
}
