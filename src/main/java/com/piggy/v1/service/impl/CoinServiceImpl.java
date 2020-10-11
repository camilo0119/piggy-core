/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.piggy.v1.service.impl;

import com.piggy.v1.mapper.CoinMapper;
import com.piggy.v1.model.Coin;
import com.piggy.v1.model.DTO.CoinDTO;
import com.piggy.v1.repository.CoinRepository;
import com.piggy.v1.service.CoinService;
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
public class CoinServiceImpl implements CoinService {
    
    @Autowired
    CoinRepository coinRepository;
    
    CoinMapper coinMapper = Mappers.getMapper(CoinMapper.class);
    
    public List<CoinDTO> getAllCoin() {
        
        List<Coin> listCoins = coinRepository.findAll();
        List<CoinDTO> listCoinsDto = new ArrayList<>();
        listCoins.forEach(coin -> {
            listCoinsDto.add(coinMapper.coinToCoinDto(coin));
        });
        return listCoinsDto;
    }

    @Override
    public CoinDTO saveCoin(CoinDTO coinDTO) {
        Coin coin = coinMapper.coinDtoToCoin(coinDTO);
        coinRepository.save(coin);
        return coinDTO;
    }
    
    
}
