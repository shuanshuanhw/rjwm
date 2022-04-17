package com.example.rjwm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.rjwm.entity.DishFlavor;
import com.example.rjwm.mapper.DishFlavorMapper;
import com.example.rjwm.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
