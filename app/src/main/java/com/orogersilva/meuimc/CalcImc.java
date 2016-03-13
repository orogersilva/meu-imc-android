package com.orogersilva.meuimc;

/**
 * Created by orogersilva on 3/13/2016.
 */
public class CalcImc {

    // region STATIC METHODS

    public static double calc(double weight, double height) {

        if (weight <= 0 || height <= 0) {
            throw new IllegalArgumentException();
        }

        return weight / (height * height);
    }

    // endregion
}
