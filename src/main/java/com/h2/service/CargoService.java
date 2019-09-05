package com.h2.service;

import com.h2.entity.Cargo;
import com.h2.dao.CargoDao;
import com.liuzhousteel.swallow.extension.service.BaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * (Cargo)表服务
 *
 * @author hh
 * create on 2019-09-05 15:25:54
 */
@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class CargoService extends BaseService<CargoDao, Cargo>{
    
}