package com.h2.controller;


import com.liuzhousteel.swallow.extension.controller.BaseController;
import lombok.RequiredArgsConstructor;
import io.swagger.annotations.Api;
import com.h2.entity.Cargo;
import com.h2.service.CargoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author hh
 * create on 2019-09-05 15:25:54
 */
@RestController
@Api(value = "/cargo", description = "$tableInfo.comment接口")
@RequestMapping("/cargo")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class CargoController extends BaseController<CargoService, Cargo>{
    
}