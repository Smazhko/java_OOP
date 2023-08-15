package sem6_homework;

public abstract class Periodical extends Publication implements IMedia, IGetPeriodicalInfo, Comparable<Periodical> {

    private String releaseDate;
    private PERIODICITY period;
    private String kind; // журнал, газета, альманах и др

    public enum PERIODICITY { // периодичность издания
        DAILY,
        WEEKLY,
        MONTHLY,
        YEARLY,
        OTHER,
        IRREGULAR
    }

    // конструктор
    protected Periodical(String title, String kind, String releaseDate, PERIODICITY period, MEDIUM_TYPE type, boolean availability) {
        super(title, type, availability);
        this.kind = kind;
        this.releaseDate = releaseDate;
        this.period = period;
    }


    public String getPeriod(){
        return switch (period) {
            case DAILY -> "ежедневный";
            case WEEKLY -> "еженедельный";
            case MONTHLY -> "ежемесячный";
            case YEARLY -> "ежегодный";
            case OTHER -> "другая период-ть";
            case IRREGULAR -> "нерегулярный";
        };
    }

    @Override
    public String getReleaseDate() {
        return releaseDate;
    }


    @Override
    public int compareTo(Periodical o){
        return (this.getTitle() + this.getReleaseDate()).compareTo(o.getTitle() + o.getReleaseDate());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Periodical anotherPub = (Periodical) obj;

        return this.getTitle().equals(anotherPub.getTitle()) &&
                this.getReleaseDate().equals(anotherPub.getReleaseDate());
    }

}
