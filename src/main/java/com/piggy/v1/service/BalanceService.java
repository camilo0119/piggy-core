/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.piggy.v1.service;

import com.piggy.v1.model.DTO.BalanceDTO;
import java.util.List;

/**
 *
 * @author camil
 */
public interface BalanceService {
 
    List<BalanceDTO> getBalance();
    
    List<BalanceDTO> saveBalance (List<BalanceDTO> balanceDTO);
    
}
