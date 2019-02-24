package com.union.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description
 * @Author ChengXiang
 * @Date 2019/2/23 10:40
 */
@Data
@NoArgsConstructor
public class Dept implements Serializable{
    private static final long serialVersionUID = 8718234646694126456L;
    private Long 	deptno; // 主键
    private String 	dname; // 部门名称
    private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname)
    {
        super();
        this.dname = dname;
    }
}