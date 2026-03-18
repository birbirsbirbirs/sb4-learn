package co.ptm.first.controller;

import co.ptm.first.model.Hero;
import co.ptm.first.service.HeroService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hero")
@Slf4j
@RequiredArgsConstructor
public class HeroController {
    private final HeroService heroService;

    @GetMapping("/gethero")
    public Hero getHero(){
        Hero hero = heroService.getHero();
        log.info("getHero hero: {}", hero);
        return hero;
    }
}
