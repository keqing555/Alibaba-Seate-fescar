package com.psi.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "item")
//@RequestMapping("/itemInfo")
public interface ItemInfoFeign {

    @PostMapping(value = "/itemInfo/decrCount")
    public String decrCount(@RequestParam(value = "id") int id,
                            @RequestParam(value = "count") int count);
}
