/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.piggy.v1.mapper;

import com.piggy.v1.model.Balance;
import com.piggy.v1.model.DTO.BalanceDTO;
import org.mapstruct.Mapper;

/**
 *
 * @author camil
 */
@Mapper
public interface BalanceMapper {
    
    BalanceDTO balanceToBalanceDto(Balance balance);

    Balance balanceDtoToBalance(BalanceDTO balanceDTO);

    
}
