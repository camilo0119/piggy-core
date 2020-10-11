/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.piggy.v1.repository;

import com.piggy.v1.model.Coin;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author camil
 */
public interface CoinRepository extends JpaRepository<Coin, Long>{
        
}
