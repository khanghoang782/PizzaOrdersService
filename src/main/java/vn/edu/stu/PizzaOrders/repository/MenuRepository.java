package vn.edu.stu.PizzaOrders.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import vn.edu.stu.PizzaOrders.domain.Food;

public interface MenuRepository extends MongoRepository<Food, ObjectId> {
}
