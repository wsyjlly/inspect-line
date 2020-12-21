package com.tyjw.inspectline.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tyjw.inspectline.entity.dto.ValveRoomDTO;
import com.tyjw.inspectline.entity.model.SysDict;
import com.tyjw.inspectline.entity.model.ValveRoomDO;
import com.tyjw.inspectline.entity.pojo.ResultInfo;
import com.tyjw.inspectline.entity.vo.ValveRoomVO;

import java.util.List;

/**
 * <p>
 * 阀室 服务类
 * </p>
 *
 * @author tianfei
 * @since 2019-12-24
 */
public interface ValveRoomService extends IService<ValveRoomDO> {

    ResultInfo<ValveRoomDO> insert(ValveRoomDO record);

    ResultInfo<Page<ValveRoomVO>> pageList(ValveRoomDTO dto);

    ResultInfo modify(ValveRoomDO record);

    ResultInfo delete(Integer id);

    List<SysDict> queryValveType(Integer projectId);
}
