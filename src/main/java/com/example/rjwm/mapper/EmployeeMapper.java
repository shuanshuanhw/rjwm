package com.example.rjwm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.rjwm.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
