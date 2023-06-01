package com.atguigu.auth.mapper;

import com.atguigu.model.system.SysRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository // 处理注入报错，交给spring管理
// SysRole 泛型实体类
public interface SysRoleMapper extends BaseMapper<SysRole> {
}
