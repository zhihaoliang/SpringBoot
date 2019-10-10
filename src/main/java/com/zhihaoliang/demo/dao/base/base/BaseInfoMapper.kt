package com.zhihaoliang.demo.dao.base.base

/**
 *
 * @author zhihaoliang
 * @date 2019/10/91:59 PM
 * @version：1.0.0
 */
import tk.mybatis.mapper.common.Mapper
import tk.mybatis.mapper.common.MySqlMapper

interface BaseInfoMapper<T> : Mapper<T>, MySqlMapper<T>// 特别注意，该接口不能被扫描到，否则会出错
