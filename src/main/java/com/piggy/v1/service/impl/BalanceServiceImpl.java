/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.piggy.v1.service.impl;

import com.piggy.v1.mapper.BalanceMapper;
import com.piggy.v1.model.Balance;
import com.piggy.v1.model.Coin;
import com.piggy.v1.model.DTO.BalanceDTO;
import com.piggy.v1.repository.BalanceRepository;
import com.piggy.v1.service.BalanceService;
import java.util.ArrayList;
import java.util.List;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author camil
 */
@Service
public class BalanceServiceImpl implements BalanceService{
    
    @Autowired
    BalanceRepository balanceRepository;        
            
    BalanceMapper balanceMapper = Mappers.getMapper(BalanceMapper.class);;

    @Override
    public List<BalanceDTO> getBalance() {
    List<Balance> listBalances = balanceRepository.findAll();
        List<BalanceDTO> listBalanceDto = new ArrayList<>();
        listBalances.forEach(balance -> {
            listBalanceDto.add(balanceMapper.balanceToBalanceDto(balance));
        });
        return listBalanceDto;
    }

    @Override
    public List<BalanceDTO> saveBalance(List<BalanceDTO> balanceDTO) {
        balanceDTO.forEach(bal -> {
            Balance balance = balanceMapper.balanceDtoToBalance(bal);
            balanceRepository.save(balance);
        });
        return balanceDTO;
    }
    
}
