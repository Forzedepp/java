package ru.borodkin.secondlab.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.borodkin.secondlab.exception.UnsupportedCodeException;
import ru.borodkin.secondlab.model.Request;
import ru.borodkin.secondlab.model.Response;
@Slf4j
@Service
public class RequestCodeExceptionService implements CodeExceptionService {

    @Override
    public void isSupported(Request request) throws UnsupportedCodeException {
        log.error("request: {}", request);
        if (request.getUid().equals("123")){
            throw new UnsupportedCodeException("e");
        }
    }
}
