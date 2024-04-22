package org.formacion.ocp;

public class PrimosUtil {

    public static boolean esPrimo (int candidato) {
        for (int i = 2; i < candidato; i++) {
            if (candidato % i == 0) {
                return false;
            }
        }

        return true;
    }
}
