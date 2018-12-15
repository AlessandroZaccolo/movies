package tech.bts.movies.model;

public class Movie {

    private String title;
    private int length;
    private boolean adult;


    public Movie(String title, int length, boolean adult) {
        this.title = title;
        this.length = length;
        this.adult = adult;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.length + ": "+ this.adult;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

}
