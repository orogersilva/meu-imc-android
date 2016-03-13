package com.orogersilva.meuimc.calc;

import android.test.suitebuilder.annotation.SmallTest;

import com.orogersilva.meuimc.CalcImc;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by orogersilva on 3/13/2016.
 */
@SmallTest
public class CalcImcTest {

    // region TEST METHODS

    @Test
    public void calc_whenInputIsValid_calcIsSuccessful() {

        // ARRANGE
        final double VALID_WEIGHT = 91;
        final double VALID_HEIGHT = 1.94;

        final double EXPECTED_IMC = 24.17897757;
        final double ERROR_MARGIN = 0.0001;

        // ACT
        double calculatedImc = CalcImc.calc(VALID_WEIGHT, VALID_HEIGHT);

        // ASSERT
        assertTrue(Math.abs(EXPECTED_IMC - calculatedImc) < ERROR_MARGIN);
    }

    // endregion
}
