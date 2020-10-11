/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.piggy.v1.model.DTO;

import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author camil
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BalanceDTO {
    
    @Id
    private long id;
    
    private long currency;
    
    private long balance;
    
}
