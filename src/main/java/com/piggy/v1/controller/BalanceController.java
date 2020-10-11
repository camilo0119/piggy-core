/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.piggy.v1.controller;

import com.piggy.v1.model.DTO.BalanceDTO;
import com.piggy.v1.service.BalanceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author camil
 */
@RestController
@RequestMapping("/balance")
public class BalanceController {
    
    @Autowired
    BalanceService balanceService;
    
    @GetMapping("/get-all")
    public List<BalanceDTO> getBalance () {
        List<BalanceDTO> listBalance = balanceService.getBalance();
        return listBalance;
    }
    
    @PostMapping
    public List<BalanceDTO> saveBalance(@RequestBody List<BalanceDTO> balanceDTO) {
        List<BalanceDTO> balanceDTO1 = balanceService.saveBalance(balanceDTO);
        return balanceDTO1;
    }
    
}
