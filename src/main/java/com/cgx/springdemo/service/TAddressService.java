package com.cgx.springdemo.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cgx.springdemo.entity.TAddress;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cgx.springdemo.mapper.TAddressMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cgx
 * @since 2020-04-27
 */
@Service
public class TAddressService extends ServiceImpl<TAddressMapper,TAddress> {

    @Transactional(rollbackFor = Exception.class)
    public void addAddress(TAddress address){
        this.save(address);
    }
}
