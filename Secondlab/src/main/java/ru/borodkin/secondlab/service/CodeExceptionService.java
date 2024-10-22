package ru.borodkin.secondlab.service;


import org.springframework.stereotype.Service;
import ru.borodkin.secondlab.exception.UnsupportedCodeException;
import ru.borodkin.secondlab.model.Request;
import ru.borodkin.secondlab.model.Response;

@Service
public interface CodeExceptionService {

        void isSupported(Request request) throws UnsupportedCodeException;

}
