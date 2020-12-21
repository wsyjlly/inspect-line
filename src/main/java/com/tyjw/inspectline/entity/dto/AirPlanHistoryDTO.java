package com.tyjw.inspectline.entity.dto;

import com.tyjw.inspectline.entity.model.MediaDO;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class AirPlanHistoryDTO implements Serializable {

    private String trackString;

    private List<MediaDO> media;

    private List<MediaDO> localMedia;


}
