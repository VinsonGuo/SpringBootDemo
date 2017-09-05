package com.example.demo.dao;

import com.example.demo.model.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by dell on 2017/9/5.
 */
public interface CityDao {

    /**
     * 获取城市信息列表
     *
     * @return
     */
    List<City> findAllCity();

    /**
     * 根据城市 ID，获取城市信息
     *
     * @param id
     * @return
     */
    City findById(@Param("id") Long id);

    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCity(Long id);
}