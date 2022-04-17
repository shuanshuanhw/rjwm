package com.example.rjwm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.rjwm.entity.ShoppingCart;
import com.example.rjwm.mapper.ShoppingCartMapper;
import com.example.rjwm.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

}
