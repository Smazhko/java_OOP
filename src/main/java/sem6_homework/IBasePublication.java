package sem6_homework;

public interface IBasePublication {

    String getType();
//    PRINTED,
//    PAPERLESS

    String getTitle();

    void setAvailabilityON();

    void setAvailabilityOFF();

    boolean getAvailability();

}
