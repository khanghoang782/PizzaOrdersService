package vn.edu.stu.PizzaOrders.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.stu.PizzaOrders.domain.Food;
import vn.edu.stu.PizzaOrders.services.MenuServices;

import java.util.List;

@RestController
public class MenuController {
    @Autowired
    private MenuServices menuServices;

    @CrossOrigin
    @GetMapping("/menu")
    public ResponseEntity<List<Food>>getMenu(){
        return new ResponseEntity<List<Food>>(menuServices.getMenu(), HttpStatus.OK);
    }
}
