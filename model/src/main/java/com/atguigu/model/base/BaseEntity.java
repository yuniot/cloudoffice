package com.atguigu.model.base;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
// 公共类
@Data
public class BaseEntity implements Serializable {

    // 主键自动增长
    @TableId(type = IdType.AUTO)
    private Long id;

    @TableField("create_time") // 对应的字段
    private Date createTime;

    @TableField("update_time")
    private Date updateTime;

    @TableLogic //逻辑删除 在数据库不会真的删除
    @TableField("is_deleted")
    private Integer isDeleted;

    // 表示表中不必须要有对应的字段
    @TableField(exist = false)
    private Map<String,Object> param = new HashMap<>();
}
