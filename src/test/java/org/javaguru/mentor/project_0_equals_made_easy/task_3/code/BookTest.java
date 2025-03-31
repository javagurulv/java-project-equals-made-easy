package org.javaguru.mentor.project_0_equals_made_easy.task_3.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BookTest {

    @Test
    public void shouldBeEqualsToItself() {
        Book book = new Book("A", "B");
        assertTrue(book.equals(book));
    }

    @Test
    public void shouldNotBeEqualsToNull() {
        Book book = new Book("A", "B");
        assertFalse(book.equals(null));
    }

    @Test
    public void shouldNotBeEquals() {
        Book book1 = new Book("A", "B");
        Book book2 = new Book("A", "B");
        assertFalse(book1.equals(book2));
    }

}