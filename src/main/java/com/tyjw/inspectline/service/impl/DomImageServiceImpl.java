package com.tyjw.inspectline.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tyjw.inspectline.common.TyjwEnum;
import com.tyjw.inspectline.dao.DomImageDAO;
import com.tyjw.inspectline.entity.model.DomImageDO;
import com.tyjw.inspectline.service.DomImageService;
import com.tyjw.inspectline.entity.vo.DomImageVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author tianfei
 * @since 2020-02-26
 */
@Service
public class DomImageServiceImpl extends ServiceImpl<DomImageDAO, DomImageDO> implements DomImageService {

    @Override
    public List<DomImageDO> queryList(Integer projectId) {
        QueryWrapper<DomImageDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("id");
        queryWrapper.eq("project_id", projectId);
        queryWrapper.eq("state", TyjwEnum.DELETE_NO);
        return this.list(queryWrapper);
    }

    @Override
    public List<DomImageVO> queryVoList(Integer projectId) {
        List<DomImageVO> listVO = new ArrayList<>();
        QueryWrapper<DomImageDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("id");
        queryWrapper.eq("project_id", projectId);
        queryWrapper.eq("state", TyjwEnum.DELETE_NO);
        queryWrapper.eq("pid", 0);
        queryWrapper.select("name","id");
        List<DomImageDO> list = this.list(queryWrapper);
        if (null != list && list.size() > 0) {
            for (DomImageDO record : list) {
                DomImageVO vo = new DomImageVO();
                vo.setId(record.getId());
                vo.setName(record.getName());
                vo.setList(queryListByPid(record.getId()));
                listVO.add(vo);
            }
        }
        return listVO;
    }


    public List<DomImageDO> queryListByPid(Integer pid) {
        QueryWrapper<DomImageDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("id");
        queryWrapper.eq("pid", pid);
        queryWrapper.eq("state", TyjwEnum.DELETE_NO);
        queryWrapper.select("url");
        return this.list(queryWrapper);
    }

}
