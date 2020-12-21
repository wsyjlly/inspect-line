package com.tyjw.inspectline.entity.vo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.tyjw.inspectline.entity.model.PlanDO;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class PlanVO extends PlanDO implements Comparable<PlanVO>{

    private int dangerNum;//险情数量


    @Override
    public int compareTo(PlanVO vo) {
        return vo.getDangerNum()-this.getDangerNum();
    }

    @Override
    public String getPilots() {
        String pilotsStr = super.getPilots();
        if (StringUtils.isNotBlank(pilotsStr)){
            try {
                JSONArray jsonArray = JSON.parseArray(pilotsStr);
                String pilotName = jsonArray.getJSONObject(0).getString("name");
                return pilotName;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
