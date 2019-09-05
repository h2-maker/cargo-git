package com.h2.dao;

import com.h2.entity.Cargo;
import org.beetl.sql.core.mapper.BaseMapper;
import org.beetl.sql.core.engine.PageQuery;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.springframework.stereotype.Repository;

/**
 * (Cargo)表数据库访问层
 *
 * @author hh
 * create on 2019-09-05 15:25:54
 */
@Repository
@SqlResource("Cargo")
public interface CargoDao extends BaseMapper<Cargo> {
    /**
     * 分页查询
     */
    void queryByPage(PageQuery<Cargo> pageQuery);
}