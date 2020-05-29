package com.chenjl.service;

import com.chenjl.config.ShopCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StoreService {

    private ShopCart shopCart;

    @Autowired
    public void setShopCart(ShopCart shopCart) {
        this.shopCart = shopCart;
    }

}
