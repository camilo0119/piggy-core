/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.piggy.v1.controller;

import com.piggy.v1.model.DTO.CoinDTO;
import com.piggy.v1.service.CoinService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author camil
 */
@RestController
public class CoinController {
    
    @Autowired
    CoinService coinService;
        
    @GetMapping("/find-all")
    public List<CoinDTO> getCoins() {
        List<CoinDTO> listCoins = coinService.getAllCoin();
        return listCoins;
    }
    
    @PostMapping
    public CoinDTO createCoin(@RequestBody CoinDTO coinDTO) {
        CoinDTO coinDTO1 = coinService.saveCoin(coinDTO);
        return coinDTO1;
    }
    
}
