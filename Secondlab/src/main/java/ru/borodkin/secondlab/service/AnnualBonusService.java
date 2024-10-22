package ru.borodkin.secondlab.service;

import org.springframework.stereotype.Service;
import ru.borodkin.secondlab.model.Positions;

@Service
public interface AnnualBonusService {
    double calculate(Positions positions, double salary, double bonus, int workDays);
    double calculateQuarterlyPremium(Positions positions, double salary, double bonus, int workDays);

}
