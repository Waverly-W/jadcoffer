package com.waverly.jadcoffer.mapper;

import com.waverly.jadcoffer.pojo.entity.Auth;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Waverly
 * @version 1.0
 * @className AuthMapper
 * @date 2023/8/11 20:23
 * @description TODO
 */
@Mapper
public interface AuthMapper {

    Auth selectAuthByIdentifier(String identifier);

    int insert(Auth auth);
}
