package com.swf.attence.service.impl;

import com.swf.attence.entity.AttenceMsg;
import com.swf.attence.mapper.AttenceMsgMapper;
import com.swf.attence.service.IAttenceMsgService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author auto-genergator
 * @since 2018-12-30
 */
@Service
public class AttenceMsgServiceImpl extends ServiceImpl<AttenceMsgMapper, AttenceMsg> implements IAttenceMsgService {
    @Autowired
   private AttenceMsgMapper attenceMsgMapper;

    @Override
    public boolean attenceMsgExist(AttenceMsg attenceMsg) {
        AttenceMsg attenceMsg1 = attenceMsgMapper.selectOne(attenceMsg);
        return attenceMsg1 != null;

    }
}
