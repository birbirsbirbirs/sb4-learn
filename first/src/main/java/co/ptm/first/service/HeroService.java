package co.ptm.first.service;


import co.ptm.first.model.Hero;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class HeroService {

    public Hero getHero() {
        return Hero.builder()
                .name(UUID.randomUUID().toString())
                .title(UUID.randomUUID().toString())
                .build();
    }
}
