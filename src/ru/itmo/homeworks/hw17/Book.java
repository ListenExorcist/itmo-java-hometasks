package ru.itmo.homeworks.hw17;

public class Book {
    private String title;
    private int pageCount;
    private Author author;
    public String[] awards;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", author=" + author.toString() +
                '}';
    }

    public Book(String title, int pageCount, Author author, String[] awards) {
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
        this.awards = awards;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String[] getAwards() {
        return awards;
    }

    public void setAwards(String[] awards) {
        this.awards = awards;
    }
}
