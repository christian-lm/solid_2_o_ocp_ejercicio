package org.formacion.ocp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.formacion.ocp.PrimosUtil.esPrimo;

public class GeneradorPrimosInversa implements Primos {

	@Override
	public List<Integer> generarPrimos(int limit) {
		List<Integer> primos = new ArrayList<>();
		for (int i = 2; i < limit; i++) {
			if (esPrimo(i)) {
				primos.add(i);
			}
		}

		Collections.reverse(primos);
		return primos;
	}
}
