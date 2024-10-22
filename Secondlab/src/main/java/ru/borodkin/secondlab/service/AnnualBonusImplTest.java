package ru.borodkin.secondlab.service;

import org.testng.annotations.Test;
import ru.borodkin.secondlab.model.Positions;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class AnnualBonusServiceImplTest {

    @Test
    void calculate() {
        Positions positions = Positions.HR;
        double bonus = 2.0;
        int workDays  = 243;
        double salary = 100000.00;

        double result = new AnnualBonusServiceImpl().calculate(positions,salary, bonus, workDays);

        double expected = 360493.8271604938;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void calculateQuarterlyPremium() {
        Positions positions = Positions.HR;
        double bonus = 2.0;
        int workDays  = 58;
        double salary = 100000.00;

        double result = new AnnualBonusServiceImpl().calculateQuarterlyPremium(positions,salary, bonus, workDays);

        double expected = 0.0;
        assertThat(result).isEqualTo(expected);

        positions = Positions.PM;
        salary = 160000.00;

        result = new AnnualBonusServiceImpl().calculateQuarterlyPremium(positions,salary, bonus, workDays);

        expected = 46344.8275862069;
        assertThat(result).isEqualTo(expected);
    }
}