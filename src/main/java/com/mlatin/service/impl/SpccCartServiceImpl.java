package com.mlatin.service.impl;

import com.mlatin.codegen.entity.SpccCart;
import com.mlatin.codegen.dao.SpccCartDao;
import com.mlatin.service.SpccCartService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *  服务实现类
 * @author Lu Fu
 * @since 2020-11-19
 */
@Service
@Transactional
public class SpccCartServiceImpl extends ServiceImpl<SpccCartDao, SpccCart> implements SpccCartService {

}
