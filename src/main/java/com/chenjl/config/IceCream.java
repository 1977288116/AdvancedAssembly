package com.chenjl.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
//@Qualifier("cold")
@Cold
@Creamy
public class IceCream implements Dessert{
}
