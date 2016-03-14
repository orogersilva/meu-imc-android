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

    @Test(expected = IllegalArgumentException.class)
    public void calc_whenWeightIsInvalid_throwsIllegalArgumentException() {

        // ARRANGE
        final double INVALID_WEIGHT = 0;
        final double VALID_HEIGHT = 1.94;

        // ACT / ASSERT
        CalcImc.calc(INVALID_WEIGHT, VALID_HEIGHT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calc_whenHeightIsInvalid_throwsIllegalArgumentException() {

        // ARRANGE
        final double VALID_WEIGHT = 91;
        final double INVALID_HEIGHT = 0;

        // ACT / ASSERT
        CalcImc.calc(VALID_WEIGHT, INVALID_HEIGHT);
    }

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
