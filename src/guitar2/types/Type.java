package guitar2.types;

public enum Type {
	ACOUSTIC,
	ELECTRIC,
	UNKNOWN;

	public String toString() {
		switch (this) {
			case ACOUSTIC:
				return "acoustic";
			case ELECTRIC:
				return "electric";
			default:
				return "";
		}
	}
}