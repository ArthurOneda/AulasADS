package Enums;

public enum FillSide {
	RIGHT(0),
	LEFT(1);
	
	private int ValEnum;
	
	FillSide(int i) {
		this.ValEnum = i;
	}
	
	public int getValue() {
		return this.ValEnum;
	}
}
