package com.example.rjwm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.rjwm.entity.OrderDetail;
import com.example.rjwm.mapper.OrderDetailMapper;
import com.example.rjwm.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}