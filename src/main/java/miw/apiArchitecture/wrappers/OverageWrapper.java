package miw.apiArchitecture.wrappers;

public class OverageWrapper {
	private double overage;

	public double getOverage() {
		return overage;
	}

	public void setOverage(double overage) {
		this.overage = overage;
	}

	@Override
	public String toString() {
		return "{\"overage\":" + overage + "}";
	}

}