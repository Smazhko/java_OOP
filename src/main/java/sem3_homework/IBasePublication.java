package sem3_homework;

import java.util.ArrayList;

public interface IBasePublication {

    String getType();
    // printed
    // digital
    // audio

    String getTitle();

    void setAvailabilityON();

    void setAvailabilityOFF();

    boolean getAvailability();

}
