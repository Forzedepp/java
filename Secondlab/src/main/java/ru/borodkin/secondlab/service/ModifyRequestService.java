package ru.borodkin.secondlab.service;

import org.springframework.stereotype.Service;
import ru.borodkin.secondlab.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);
}
