package org.formacion.ocp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.formacion.ocp.PrimosUtil.esPrimo;

public class GeneradorPrimos {

	public List<Integer> generarPrimos(int limit) {
		List<Integer> primos = new ArrayList<>();
		for (int i = 2; i < limit; i++) {
			if (esPrimo(i)) {
				primos.add(i);
			}
		}

		primos.sort(getOrdenacion());
		return primos;
	}

	protected Comparator<Integer> getOrdenacion() {
		return (a, b) -> a > b ? 1 : -1;
	}

}
