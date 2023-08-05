package sem3_homework;

public abstract class Periodical extends Publication implements IMedia {

    private String releaseDate;

    protected Periodical(String title, MediumType type, boolean availability) {
        super(title, type, availability);
    }

    public String getPeriod(){
    // DAILY
    // WEEKLY
    // MONTHLY
    // YEARLY
    return null;
    }

    @Override
    public String getReleaseDate() {
        return releaseDate;
    }

}
