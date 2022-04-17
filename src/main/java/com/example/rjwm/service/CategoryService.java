package com.example.rjwm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.rjwm.entity.Category;


public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}
