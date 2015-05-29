package org.wonderland.dev.levi9.springboot.betservices;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wonderland.dev.levi9.springboot.betservices.datamodel.Bookie;
import org.wonderland.dev.levi9.springboot.betservices.utils.RandomDataGenerator;

@Controller
@RequestMapping("/api/winnerbet/matches")
public class WinnerBetController {

    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody Bookie getMatches() {
        return RandomDataGenerator.generateRandomBettingWinnerBet();
    }
}
