package edu.cu.cs6156_order.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import edu.cu.cs6156_order.controller.utils.R;
import edu.cu.cs6156_order.pojo.OrderProfile;
import edu.cu.cs6156_order.pojo.OrderedDish;
import edu.cu.cs6156_order.service.impl.OrderProfileServiceImpl;
import edu.cu.cs6156_order.service.impl.OrderedDishesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/orderProfile")
public class OrderProfileController {
    @Autowired
    private OrderProfileServiceImpl profileService;

    /**
     * return all element
     * @return
     */
    @GetMapping
    public R getAll() {
        return new R(true, profileService.list());
    }

    /**
     * return an element by its id
     * @return
     */
    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id) {
        return new R(true, profileService.getById(id));
    }

    /**
     * add an element to the corresponding table
     * @return
     */
    @PostMapping
    public R insert(@RequestBody OrderProfile profile) {
        return new R(profileService.save(profile), profile.getOrderId());
    }

    /**
     * update(change) an element by its id
     * this method REQUIRES to set Model's id
     * @return
     */
    @PutMapping
    public R updateById(@RequestBody OrderProfile profile) {
        return new R(profileService.updateById(profile));
    }

    /**
     * Delete an element by its id
     * @return
     */
    @DeleteMapping("/{id}")
    public R deleteById(@PathVariable Integer id) {
        return new R(profileService.removeById(id));
    }

    @GetMapping("/{currentPage}/{pageSize}")
    public R getPage(@PathVariable Integer currentPage, @PathVariable Integer pageSize) {
        Page<OrderProfile> pageProfile = new Page<>(currentPage, pageSize);
        profileService.page(pageProfile);
        List<OrderProfile> profiles = pageProfile.getRecords();
        return new R(true, profiles);
    }

    @GetMapping("/account/{accountId}")
    public Map<String, Object> getAllByAccountIdAndPage(@PathVariable String accountId,
                                                        @RequestParam("page") Integer currentPage,
                                                        @RequestParam("per_page") Integer pageSize) {
        Page<OrderProfile> pageProfile = new Page<>(currentPage, pageSize);
        LambdaQueryWrapper<OrderProfile> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(OrderProfile::getAccountId, accountId);
        profileService.page(pageProfile, queryWrapper);
        List<OrderProfile> profiles = pageProfile.getRecords();
        long pages = pageProfile.getPages();
        HashMap<String, Object> res = new HashMap<>();
        res.put("flag", true);
        res.put("data", profiles);
        res.put("numberPages", pages);
        return res;
    }

    @GetMapping("/{accountId}/all")
    public R getAllByAccountId(@PathVariable String accountId) {
        List<OrderProfile> profiles = profileService.getAllByAccountId(accountId);
        return new R(true, profiles);
    }



}
