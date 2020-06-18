package edu.sicnu.jerry.dao;

import edu.sicnu.jerry.pojo.TbShop;

public interface TbShopMapper {
    int insert(TbShop record);

    int insertSelective(TbShop record);
}