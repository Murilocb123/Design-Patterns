package enums;

public enum CarEnums {
	CORROLA(1),
	CIVIC(1),
	FUSCA(1);
	
	public int value;
	
	CarEnums(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	
	
}
