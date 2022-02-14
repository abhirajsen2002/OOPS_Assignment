package Prog_10;

enum metrix {
	ktom, mtok;
}

public class ConversionFactory {
	private static ConversionFactory single_instance = null;

	ConversionFactory() {
	}

	public static ConversionFactory getInstance() {
		if (single_instance == null) {
			single_instance = new ConversionFactory();
		}

		return single_instance;
	}

	public Converter getConverter(metrix x) throws Exception {
		switch (x) {
		case ktom:
			return new KtoMConverter();
		case mtok:
			return new MtoKConverter();
		default:
			return null;

		}
	}
}
