package fr.iutmindfuck.adapterviewexercise.data;

public class Celebrity {

    private String celebrityGender;
    private String celebrityName;
    private String quote;

    public Celebrity(String celebrityGender, String celebrityName, String quote) {
        this.celebrityGender = celebrityGender;
        this.celebrityName = celebrityName;
        this.quote = quote;
    }

    public String getCelebrityGender() {
        return celebrityGender;
    }

    public String getCelebrityName() {
        return celebrityName;
    }

    public String getQuote() {
        return quote;
    }
}
