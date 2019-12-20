package com.videocomm.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * @author[wengCJ]
 * @version[创建日期，2019/12/20 0020]
 * @function[功能简介]
 **/
public class City extends DataSupport {
    private int id;
    private String cityName;//记录市的名字
    private int cityCode;//记录市的代码
    private int provinceId;//记录当前市所属省的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
