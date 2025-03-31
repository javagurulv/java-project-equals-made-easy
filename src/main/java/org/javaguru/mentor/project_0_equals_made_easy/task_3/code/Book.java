package org.javaguru.mentor.project_0_equals_made_easy.task_3.code;

class Book {

    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Это дефолтная реализация метода equals() из класса Object
    @Override
    public boolean equals(Object obj) {
        return (this == obj);
    }

}
