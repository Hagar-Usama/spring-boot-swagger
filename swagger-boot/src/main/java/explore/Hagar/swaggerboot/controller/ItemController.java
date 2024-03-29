package explore.Hagar.swaggerboot.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    private List<String> itemList = new ArrayList<>();

    @GetMapping
    public List<String> getAllItems() {
        return itemList;
    }

    @GetMapping("/{id}")
    public String getItemById(@PathVariable int id) {
        if (id >= 0 && id < itemList.size()) {
            return itemList.get(id);
        } else {
            throw new IllegalArgumentException("Invalid item ID");
        }
    }

    @PostMapping
    public String addItem(@RequestBody String item) {
        itemList.add(item);
        return "Item added successfully";
    }

    @PutMapping("/{id}")
    public String updateItem(@PathVariable int id, @RequestBody String updatedItem) {
        if (id >= 0 && id < itemList.size()) {
            itemList.set(id, updatedItem);
            return "Item updated successfully";
        } else {
            throw new IllegalArgumentException("Invalid item ID");
        }
    }

    @DeleteMapping("/{id}")
    public String deleteItem(@PathVariable int id) {
        if (id >= 0 && id < itemList.size()) {
            itemList.remove(id);
            return "Item deleted successfully";
        } else {
            throw new IllegalArgumentException("Invalid item ID");
        }
    }
}
