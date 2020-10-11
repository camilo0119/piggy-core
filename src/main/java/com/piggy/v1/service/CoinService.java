/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.piggy.v1.service;

import com.piggy.v1.model.Coin;
import com.piggy.v1.model.DTO.CoinDTO;
import java.util.List;

/**
 *
 * @author camil
 */
public interface CoinService {
    
    List<CoinDTO> getAllCoin();
    
    CoinDTO saveCoin (CoinDTO coinDTO);
    
}
