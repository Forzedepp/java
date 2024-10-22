package ru.borodkin.secondlab.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.borodkin.secondlab.exception.UnsupportedCodeException;
import ru.borodkin.secondlab.exception.ValidationFailedException;

@Service
public interface ValidationService {
    void isValid(BindingResult bindingResult) throws ValidationFailedException;

    void isSupportedUid(String Uid) throws UnsupportedCodeException;
}
