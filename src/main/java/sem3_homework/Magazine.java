package sem3_homework;

public class Magazine extends Periodical {


    protected Magazine(String title, MediumType type, boolean availability) {
        super(title, type, availability);
    }

    @Override
    public boolean getRegularity() {
        return false;
    }

    @Override
    String getInfo() {
        return null;
    }
}
