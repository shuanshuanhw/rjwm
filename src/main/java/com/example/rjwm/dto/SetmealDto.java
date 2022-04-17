package com.example.rjwm.dto;

import com.example.rjwm.entity.Setmeal;
import com.example.rjwm.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
