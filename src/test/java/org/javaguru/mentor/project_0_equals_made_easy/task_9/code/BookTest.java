package org.javaguru.mentor.project_0_equals_made_easy.task_9.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
    public void shouldBeEquals() {
        Book book1 = new Book("A", "B");
        Book book2 = new Book("A", "B");
        assertTrue(book1.equals(book2));
    }

    @Test
    public void compareToInstanceOfDifferentClass() {
        Book book = new Book("A", "B");
        Car car = new Car("Porsche", "911");
        assertFalse(book.equals(car));
    }

    @Test
    public void instanceofTrue() {
        Book book = new Book("A", "B");
        assertTrue(book instanceof Book);
        assertTrue((Object)book instanceof Book);
    }

    @Test
    public void instanceofFalse() {
        Book book = new Book("A", "B");
        assertFalse((Object)book instanceof Car);
    }

    @Test
    public void instanceofPlusConvert() {
        Object object = new Book("A", "B");
        if (object instanceof Book book) {
            assertEquals(book.getAuthor(), "A");
            assertEquals(book.getTitle(), "B");
        }
    }

    @Test
    public void equalsTrue() {
        Book book1 = new Book("A", "B");
        Book book2 = new Book("A", "B");
        assertTrue(book1.equals(book2));
    }

    @Test
    public void equalsFalseAuthorsAreDifferent() {
        Book book1 = new Book("A", "B");
        Book book2 = new Book("B", "B");
        assertFalse(book1.equals(book2));
    }

    @Test
    public void equalsFalseTitlesAreDifferent() {
        Book book1 = new Book("A", "A");
        Book book2 = new Book("A", "B");
        assertFalse(book1.equals(book2));
    }

    @Test
    public void equalsFalseAuthorsAreDifferentNull() {
        Book book1 = new Book("A", "A");
        Book book2 = new Book(null, "B");
        assertFalse(book1.equals(book2));
    }

    @Test
    public void equalsFalseTitlesAreDifferentNull() {
        Book book1 = new Book("A", "A");
        Book book2 = new Book("A", null);
        assertFalse(book1.equals(book2));
    }

    @Test
    public void equalsFalse() {
        Book book1 = new Book("A", "A");
        Book book2 = new Book("Y", "Z");
        assertFalse(book1.equals(book2));
    }

}