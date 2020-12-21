package com.tyjw.inspectline.common;

public enum TyjwEnum {
    /**
     * 是否删除
     */
    DELETE_NO("否", 0),
    DELETE_YES("是", 1),

    //任务状态，共有4种，-1(作废)，0(未开始)，1(飞行中)，2(飞行结束)
    FLIGHT_STATE_CANCEL("作废", -1),
    FLIGHT_STATE_UNSTART("未开始", 0),
    FLIGHT_STATE_START("飞行中", 1),
    FLIGHT_STATE_FINISH("飞行结束", 2),

    PERIL_STATE_WZP("未指派", 0),
    PERIL_STATE_CLZ("处理中", 1),
    PERIL_STATE_YJJ("已解决", 2),

    ROLE_SUPER("超级管理员", 1),
    ROLE_ADMIN("管理员", 2),
    ROLE_COMMON("普通用户", 3),
    ROLE_COMPANY("企业用户", 4),
    ROLE_PATROL("巡线人", 5),


    AI_CHECK_UNSTART("AI未开始检测", 0),
    AI_CHECK_START("AI开始检测", 1),
    AI_CHECK_FINISH("AI完成检测", 2),

    /**
     * 险情处理状态 0未指派 1处理中 2已解决
     */
    DANGER_STATUS_UNASSIGN("未指派", 0),
    DANGER_STATUS_START("处理中", 1),
    DANGER_STATUS_FINISH("已解决", 2),

    /**
     * 险情类型 1变化检测 2目标检测 3手动标注
     */
    DANGET_TYPE_CHANGE("变化检测", 1),
    DANGET_TYPE_TARGET("目标检测", 2),
    DANGET_TYPE_MANUAL("手动标注", 3),

    /**
     * 字典类型
     */
    DICT_TYPE_ROLE("角色", 1),

    DICT_TYPE_FACILITIES("基础设施类型", 2),

    DICT_TYPE_FACILITIES_CONSTRUCTION_UNIT("第三方施工", 5),
    DICT_TYPE_FACILITIES_HIGH_CONSEQUENCES("高后果区", 6),
    DICT_TYPE_FACILITIES_THROUGH_POINT("穿跨越点", 7),
    DICT_TYPE_FACILITIES_VALVE_ROOM("阀室", 8),
    DICT_TYPE_FACILITIES_TYJW_STATION("场站/保护站", 9),
    DICT_TYPE_FACILITIES_PIPELINE_CARD("桩牌", 10),

    DICT_TYPE_PIPE_CARD_TYPE("桩牌类型", 3),

    DICT_TYPE_HIGH_CONSEQUENCES_TYPE("高后果区类型", 4),

    DICT_TYPE_VALVE_ROOM("阀室类型",11),
    DICT_TYPE_CONSTRUCTION_UNIT("第三方施工类型",12),

    //下拉查询全部
    SELECT_OPTION_ALL("查询全部",-1),

    //AI识别险情类型
    AI_DANGER_PEDESTRIAN("pedestrian",1),
    AI_DANGER_PEOPLE("people",2),
    AI_DANGER_BICYCLE("bicycle",3),
    AI_DANGER_CAR("car",4),
    AI_DANGER_VAN("van",5),
    AI_DANGER_TRUCK("truck",6),
    AI_DANGER_TRICYCLE("tricycle",7),
    AI_DANGER_AWNINGTRICYCLE("awning-tricycle",8),
    AI_DANGER_BUS("bus",9),
    AI_DANGER_MOTOR("motor",10),

    ;


    private int value;
    private String message;

    private TyjwEnum(String message, int value) {
        this.message = message;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setValue(int value) {
        this.value = value;
    }


}
