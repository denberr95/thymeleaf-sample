package thymeleaf.webapp.sample.service;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import thymeleaf.webapp.sample.mapper.IBooksMapper;
import thymeleaf.webapp.sample.repository.IBooksRepository;

@Service
@RequiredArgsConstructor
public class BooksService {

    private final IBooksRepository iBooksRepository;
    private final IBooksMapper iBooksMapper;
}
