package com.controllers;

import com.models.Book;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
@AutoConfigureMockMvc(addFilters = false)
public class BookControllerTest extends AbstractTest{

    String uri = "/book";

    Long testId = 9999L;

    Book testBook = new Book(testId, "Test Book Title", "Test Author", new ArrayList<>(), true, "The Tests");
    Book resultBook;
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

        String bookJson = super.mapToJson(testBook);

        MvcResult mvcRS = mockMvc.perform(MockMvcRequestBuilders.post(uri+"/save")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(bookJson)).andReturn();

        int status = mvcRS.getResponse().getStatus();

        String content = mvcRS.getResponse().getContentAsString();

        resultBook = super.mapFromJson(content, Book.class);
        testBook.setId(resultBook.getId());

        assertEquals(testBook, resultBook);
        assertEquals(201, status);
    }

    @Test
    @Order(2)
    @DisplayName("Update Book")
    void testUpdateBook() throws Exception {
        MvcResult mvcRS = mockMvc.perform(MockMvcRequestBuilders.put(uri+"/")
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andReturn();
    }

    @Test
    @Order(3)
    @DisplayName("Delete Book from database")
    void testDeleteBook() throws Exception {
        Long id = testBook.getId();
        System.out.println(testBook.getId());

        MvcResult mvcRS = mockMvc.perform(MockMvcRequestBuilders.delete(uri+"/"+id)
                .contentType(MediaType.APPLICATION_JSON_VALUE))
                .andReturn();

        int status = mvcRS.getResponse().getStatus();
        assertEquals(200,status);
    }
}
