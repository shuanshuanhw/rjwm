package com.example.rjwm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.rjwm.entity.Employee;
import com.example.rjwm.mapper.EmployeeMapper;
import com.example.rjwm.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
