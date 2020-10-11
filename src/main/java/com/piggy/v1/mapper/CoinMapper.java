/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.piggy.v1.mapper;

import com.piggy.v1.model.Coin;
import com.piggy.v1.model.DTO.CoinDTO;
import org.mapstruct.Mapper;

/**
 *
 * @author camil
 */
@Mapper
public interface CoinMapper {
    
    CoinDTO coinToCoinDto (Coin coin);
    
    Coin coinDtoToCoin (CoinDTO coinDTO);
    
}
