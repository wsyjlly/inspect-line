package com.tyjw.inspectline.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tyjw.inspectline.common.TyjwEnum;
import com.tyjw.inspectline.dao.HighConsequencesTypeMappingDAO;
import com.tyjw.inspectline.entity.model.HighConsequencesTypeMappingDO;
import com.tyjw.inspectline.entity.model.SysDict;
import com.tyjw.inspectline.service.HighConsequencesTypeMappingService;
import com.tyjw.inspectline.service.SysDictService;
import com.tyjw.inspectline.entity.vo.HighConsequencesTypeMappingVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 高后果区类型关系表id（1对N） 服务实现类
 * </p>
 *
 * @author tianfei
 * @since 2020-02-17
 */
@Service
@Slf4j
@Transactional
public class HighConsequencesTypeMappingServiceImpl extends ServiceImpl<HighConsequencesTypeMappingDAO, HighConsequencesTypeMappingDO> implements HighConsequencesTypeMappingService {

    @Autowired
    private SysDictService dictService;

    @Override
    public List<HighConsequencesTypeMappingVO> queryListByHighId(Integer highId, Integer projectId) {
        List<HighConsequencesTypeMappingVO> listVO = new ArrayList<>();
        QueryWrapper<HighConsequencesTypeMappingDO> queryWrapper = new QueryWrapper<>();
        try {
            queryWrapper.eq("high_id", highId);
            List<HighConsequencesTypeMappingDO> list = this.list(queryWrapper);
            //查询高后果区类型
            Map<Integer, SysDict> highTypeMap = dictService.queryListByProjectIdAndType(projectId, TyjwEnum.DICT_TYPE_HIGH_CONSEQUENCES_TYPE.getValue());
            for (HighConsequencesTypeMappingDO item : list) {
                HighConsequencesTypeMappingVO vo = new HighConsequencesTypeMappingVO();
                BeanUtils.copyProperties(item,vo);
                vo.setHighTypeName(highTypeMap.get(item.getTypeId()).getName());
                listVO.add(vo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return listVO;
        }
        return listVO;
    }
}
