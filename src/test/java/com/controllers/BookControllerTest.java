package com.controllers;

import com.models.Book;
import org.junit.jupiter.api.*;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
public class BookControllerTest extends AbstractTest{

    String uri = "/book";

    Long testId = 9999L;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    protected void setUp() {super.setUp();}

    @AfterEach
    protected void tearDown() throws Exception {}

    @Test
    @Order(1)
    @DisplayName("Save Book to Database")
    void testSaveBook() throws Exception {
        Book testBook = new Book(testId, "Test Book Title", "Test Author", new ArrayList<>(), true, "The Tests");
        String bookJson = super.mapToJson(testBook);

        MvcResult mvcRS = mockMvc.perform(MockMvcRequestBuilders.post(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(bookJson)).andReturn();
        int status = mvcRS.getResponse().getStatus();

        String content = mvcRS.getResponse().getContentAsString();

        Book resultBook = super.mapFromJson(content, Book.class);

        assertEquals(testBook, resultBook);
        assertEquals(201, status);
    }

}
