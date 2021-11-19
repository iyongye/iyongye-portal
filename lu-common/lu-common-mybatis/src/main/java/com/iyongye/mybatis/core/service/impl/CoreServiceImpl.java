package com.iyongye.mybatis.core.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.iyongye.mybatis.core.service.ICoreService;
import lombok.extern.slf4j.Slf4j;

/**
 * 本项目由www.iyongye.com所有，侵权必究
 *
 * @author wangbencheng
 * @version 1.0
 * @className CoreServiceImpl
 * @since 2021/10/9 01:52
 */
@Slf4j
public class CoreServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> implements ICoreService<T> {
}
