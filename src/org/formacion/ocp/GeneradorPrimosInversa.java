package org.formacion.ocp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.formacion.ocp.PrimosUtil.esPrimo;

public class GeneradorPrimosInversa extends GeneradorPrimos {

	@Override
	protected Comparator<Integer> getOrdenacion() {
		return (a, b) -> a > b ? -1 : 1;
	}
}
