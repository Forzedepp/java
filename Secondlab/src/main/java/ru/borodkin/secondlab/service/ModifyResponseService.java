package ru.borodkin.secondlab.service;

import org.springframework.stereotype.Service;
import ru.borodkin.secondlab.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}
