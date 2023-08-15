package sem6_homework;

public abstract class Publication implements IBasePublication {
	private String title;
	private MEDIUM_TYPE type;
	private boolean availability;

	public enum MEDIUM_TYPE { // тип носителя
		PRINTED,
		PAPERLESS
	}

	public Publication(String title, MEDIUM_TYPE type, boolean availability) {
		this.title = title;
		this.type = type;
		this.availability = availability;
	}

	public String getTitle() {
		return title;
	}


	@Override
	public String getType() {
		return switch (type) {
			case PRINTED -> "Печатное издание";
			case PAPERLESS -> "Электронное издание";
		};
	}

	public boolean getAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
}
