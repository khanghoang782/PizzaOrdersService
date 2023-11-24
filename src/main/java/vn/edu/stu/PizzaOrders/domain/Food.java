package vn.edu.stu.PizzaOrders.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;


@Document(collection = "Food")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Food {
    @Id
    private ObjectId id;
    private String name;
    private String category;
    private String description;
    private List<String> unit;
    private Map<String,Integer>prices;
}
