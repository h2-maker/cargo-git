package com.h2.entity;

import lombok.*;
import org.beetl.sql.core.TailBean;
import org.beetl.sql.core.annotatoin.Table;
import java.io.Serializable;

/**
 * (Cargo)实体类
 *
 * @author hh
 * create on 2019-09-05 15:25:54
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Table(name = "cargo")
public class Cargo extends TailBean implements Serializable {
    private static final long serialVersionUID = 978554998693927269L;
    /**
     * 记录id(主键)
     */
    private Integer id;
    /**
     * 物品编号
     */
    private String number;
    /**
     * 物品名称
     */
    private String name;
    /**
     * 入库数量
     */
    private Integer amount;
    /**
     * 计量单位
     */
    private String unit;
    /**
     * 入库时间
     */
    private String datetime;
    /**
     * 是否为危险品 1--是，0否
     */
    private Integer risk;
    /**
     * 经办人
     */
    private String creuser;

}