package Intefaceandgenerics;

import java.util.Comparator;

public class CarpriceComparator implements Comparator<Car> {

	@Override
	public int compare(Car tcar, Car ocar) {
		return ocar.price - tcar.price;
	}

}
