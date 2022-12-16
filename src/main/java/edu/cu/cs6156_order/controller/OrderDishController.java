package edu.cu.cs6156_order.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import edu.cu.cs6156_order.controller.utils.R;
import edu.cu.cs6156_order.pojo.OrderedDish;
import edu.cu.cs6156_order.service.impl.OrderedDishesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderDish")
public class OrderDishController {
    @Autowired
    private OrderedDishesServiceImpl dishesService;

    /**
     * return all element
     * @return
     */
    @GetMapping
    public R getAll() {
        return new R(true, dishesService.list());
    }

    /**
     * return an element by its id
     * @return
     */
    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id) {
        return new R(true, dishesService.getById(id));
    }

    /**
     * add an element to the corresponding table
     * @return
     */
    @PostMapping
    public R insert(@RequestBody OrderedDish dish) {
        return new R(dishesService.save(dish));
    }

    /**
     * update(change) an element by its id
     * this method REQUIRES to set Model's id
     * @return
     */
    @PutMapping
    public R updateById(@RequestBody OrderedDish dish) {
        return new R(dishesService.updateById(dish));
    }

    /**
     * Delete an element by its id
     * @return
     */
    @DeleteMapping("/{id}")
    public R deleteById(@PathVariable Integer id) {
        return new R(dishesService.removeById(id));
    }

    @GetMapping("/{currentPage}/{pageSize}")
    public R getPage(@PathVariable Integer currentPage, @PathVariable Integer pageSize) {
        Page<OrderedDish> pageDish = new Page<>(currentPage, pageSize);
        dishesService.page(pageDish);
        List<OrderedDish> dishes = pageDish.getRecords();
        return new R(true, dishes);
    }

    @GetMapping("/Profile/{pid}")
    public R getAllByProfileId(@PathVariable Integer pid) {
        List<OrderedDish> orderedDishes = dishesService.selectDishByProfileId(pid);
        return new R(true, orderedDishes);
    }
}
