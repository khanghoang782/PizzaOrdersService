package vn.edu.stu.PizzaOrders.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.stu.PizzaOrders.domain.Food;
import vn.edu.stu.PizzaOrders.repository.MenuRepository;

import java.util.List;

@Service
public class MenuServices {
    @Autowired
    private MenuRepository menuRepo;
    public List<Food>getMenu(){
        return menuRepo.findAll();
    }
}
