package com.hong.mapper;

import com.hong.commons.util.MyMapper;
import com.hong.domain.Permission;

import java.util.List;

public interface PermissionMapper extends MyMapper<Permission> {

    List<Permission> getPermissionByUserId(Integer id);
}