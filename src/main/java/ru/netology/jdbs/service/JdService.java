package ru.netology.jdbs.service;

import org.springframework.stereotype.Service;
import ru.netology.jdbs.repository.JdRepository;

import java.util.List;

@Service
public class JdService {
    private final JdRepository jdRepository;

    public JdService(JdRepository jdRepository) {
        this.jdRepository = jdRepository;
    }

    public List<String> getProductName(String name) {
        return jdRepository.getProductName(name);
    }
}
