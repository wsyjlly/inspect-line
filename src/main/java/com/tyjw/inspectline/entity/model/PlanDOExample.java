package com.tyjw.inspectline.entity.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlanDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PlanDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPlanIdIsNull() {
            addCriterion("plan_id is null");
            return (Criteria) this;
        }

        public Criteria andPlanIdIsNotNull() {
            addCriterion("plan_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlanIdEqualTo(Integer value) {
            addCriterion("plan_id =", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotEqualTo(Integer value) {
            addCriterion("plan_id <>", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThan(Integer value) {
            addCriterion("plan_id >", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("plan_id >=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThan(Integer value) {
            addCriterion("plan_id <", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThanOrEqualTo(Integer value) {
            addCriterion("plan_id <=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdIn(List<Integer> values) {
            addCriterion("plan_id in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotIn(List<Integer> values) {
            addCriterion("plan_id not in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdBetween(Integer value1, Integer value2) {
            addCriterion("plan_id between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("plan_id not between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUavIdIsNull() {
            addCriterion("uav_id is null");
            return (Criteria) this;
        }

        public Criteria andUavIdIsNotNull() {
            addCriterion("uav_id is not null");
            return (Criteria) this;
        }

        public Criteria andUavIdEqualTo(Integer value) {
            addCriterion("uav_id =", value, "uavId");
            return (Criteria) this;
        }

        public Criteria andUavIdNotEqualTo(Integer value) {
            addCriterion("uav_id <>", value, "uavId");
            return (Criteria) this;
        }

        public Criteria andUavIdGreaterThan(Integer value) {
            addCriterion("uav_id >", value, "uavId");
            return (Criteria) this;
        }

        public Criteria andUavIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("uav_id >=", value, "uavId");
            return (Criteria) this;
        }

        public Criteria andUavIdLessThan(Integer value) {
            addCriterion("uav_id <", value, "uavId");
            return (Criteria) this;
        }

        public Criteria andUavIdLessThanOrEqualTo(Integer value) {
            addCriterion("uav_id <=", value, "uavId");
            return (Criteria) this;
        }

        public Criteria andUavIdIn(List<Integer> values) {
            addCriterion("uav_id in", values, "uavId");
            return (Criteria) this;
        }

        public Criteria andUavIdNotIn(List<Integer> values) {
            addCriterion("uav_id not in", values, "uavId");
            return (Criteria) this;
        }

        public Criteria andUavIdBetween(Integer value1, Integer value2) {
            addCriterion("uav_id between", value1, value2, "uavId");
            return (Criteria) this;
        }

        public Criteria andUavIdNotBetween(Integer value1, Integer value2) {
            addCriterion("uav_id not between", value1, value2, "uavId");
            return (Criteria) this;
        }

        public Criteria andUavNameIsNull() {
            addCriterion("uav_name is null");
            return (Criteria) this;
        }

        public Criteria andUavNameIsNotNull() {
            addCriterion("uav_name is not null");
            return (Criteria) this;
        }

        public Criteria andUavNameEqualTo(String value) {
            addCriterion("uav_name =", value, "uavName");
            return (Criteria) this;
        }

        public Criteria andUavNameNotEqualTo(String value) {
            addCriterion("uav_name <>", value, "uavName");
            return (Criteria) this;
        }

        public Criteria andUavNameGreaterThan(String value) {
            addCriterion("uav_name >", value, "uavName");
            return (Criteria) this;
        }

        public Criteria andUavNameGreaterThanOrEqualTo(String value) {
            addCriterion("uav_name >=", value, "uavName");
            return (Criteria) this;
        }

        public Criteria andUavNameLessThan(String value) {
            addCriterion("uav_name <", value, "uavName");
            return (Criteria) this;
        }

        public Criteria andUavNameLessThanOrEqualTo(String value) {
            addCriterion("uav_name <=", value, "uavName");
            return (Criteria) this;
        }

        public Criteria andUavNameLike(String value) {
            addCriterion("uav_name like", value, "uavName");
            return (Criteria) this;
        }

        public Criteria andUavNameNotLike(String value) {
            addCriterion("uav_name not like", value, "uavName");
            return (Criteria) this;
        }

        public Criteria andUavNameIn(List<String> values) {
            addCriterion("uav_name in", values, "uavName");
            return (Criteria) this;
        }

        public Criteria andUavNameNotIn(List<String> values) {
            addCriterion("uav_name not in", values, "uavName");
            return (Criteria) this;
        }

        public Criteria andUavNameBetween(String value1, String value2) {
            addCriterion("uav_name between", value1, value2, "uavName");
            return (Criteria) this;
        }

        public Criteria andUavNameNotBetween(String value1, String value2) {
            addCriterion("uav_name not between", value1, value2, "uavName");
            return (Criteria) this;
        }

        public Criteria andPlanNameIsNull() {
            addCriterion("plan_name is null");
            return (Criteria) this;
        }

        public Criteria andPlanNameIsNotNull() {
            addCriterion("plan_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlanNameEqualTo(String value) {
            addCriterion("plan_name =", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameNotEqualTo(String value) {
            addCriterion("plan_name <>", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameGreaterThan(String value) {
            addCriterion("plan_name >", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameGreaterThanOrEqualTo(String value) {
            addCriterion("plan_name >=", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameLessThan(String value) {
            addCriterion("plan_name <", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameLessThanOrEqualTo(String value) {
            addCriterion("plan_name <=", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameLike(String value) {
            addCriterion("plan_name like", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameNotLike(String value) {
            addCriterion("plan_name not like", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameIn(List<String> values) {
            addCriterion("plan_name in", values, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameNotIn(List<String> values) {
            addCriterion("plan_name not in", values, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameBetween(String value1, String value2) {
            addCriterion("plan_name between", value1, value2, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameNotBetween(String value1, String value2) {
            addCriterion("plan_name not between", value1, value2, "planName");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andFlightStateIsNull() {
            addCriterion("flight_state is null");
            return (Criteria) this;
        }

        public Criteria andFlightStateIsNotNull() {
            addCriterion("flight_state is not null");
            return (Criteria) this;
        }

        public Criteria andFlightStateEqualTo(Integer value) {
            addCriterion("flight_state =", value, "flightState");
            return (Criteria) this;
        }

        public Criteria andFlightStateNotEqualTo(Integer value) {
            addCriterion("flight_state <>", value, "flightState");
            return (Criteria) this;
        }

        public Criteria andFlightStateGreaterThan(Integer value) {
            addCriterion("flight_state >", value, "flightState");
            return (Criteria) this;
        }

        public Criteria andFlightStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("flight_state >=", value, "flightState");
            return (Criteria) this;
        }

        public Criteria andFlightStateLessThan(Integer value) {
            addCriterion("flight_state <", value, "flightState");
            return (Criteria) this;
        }

        public Criteria andFlightStateLessThanOrEqualTo(Integer value) {
            addCriterion("flight_state <=", value, "flightState");
            return (Criteria) this;
        }

        public Criteria andFlightStateIn(List<Integer> values) {
            addCriterion("flight_state in", values, "flightState");
            return (Criteria) this;
        }

        public Criteria andFlightStateNotIn(List<Integer> values) {
            addCriterion("flight_state not in", values, "flightState");
            return (Criteria) this;
        }

        public Criteria andFlightStateBetween(Integer value1, Integer value2) {
            addCriterion("flight_state between", value1, value2, "flightState");
            return (Criteria) this;
        }

        public Criteria andFlightStateNotBetween(Integer value1, Integer value2) {
            addCriterion("flight_state not between", value1, value2, "flightState");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andFlightDurationIsNull() {
            addCriterion("flight_duration is null");
            return (Criteria) this;
        }

        public Criteria andFlightDurationIsNotNull() {
            addCriterion("flight_duration is not null");
            return (Criteria) this;
        }

        public Criteria andFlightDurationEqualTo(Integer value) {
            addCriterion("flight_duration =", value, "flightDuration");
            return (Criteria) this;
        }

        public Criteria andFlightDurationNotEqualTo(Integer value) {
            addCriterion("flight_duration <>", value, "flightDuration");
            return (Criteria) this;
        }

        public Criteria andFlightDurationGreaterThan(Integer value) {
            addCriterion("flight_duration >", value, "flightDuration");
            return (Criteria) this;
        }

        public Criteria andFlightDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("flight_duration >=", value, "flightDuration");
            return (Criteria) this;
        }

        public Criteria andFlightDurationLessThan(Integer value) {
            addCriterion("flight_duration <", value, "flightDuration");
            return (Criteria) this;
        }

        public Criteria andFlightDurationLessThanOrEqualTo(Integer value) {
            addCriterion("flight_duration <=", value, "flightDuration");
            return (Criteria) this;
        }

        public Criteria andFlightDurationIn(List<Integer> values) {
            addCriterion("flight_duration in", values, "flightDuration");
            return (Criteria) this;
        }

        public Criteria andFlightDurationNotIn(List<Integer> values) {
            addCriterion("flight_duration not in", values, "flightDuration");
            return (Criteria) this;
        }

        public Criteria andFlightDurationBetween(Integer value1, Integer value2) {
            addCriterion("flight_duration between", value1, value2, "flightDuration");
            return (Criteria) this;
        }

        public Criteria andFlightDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("flight_duration not between", value1, value2, "flightDuration");
            return (Criteria) this;
        }

        public Criteria andFlightDistanceIsNull() {
            addCriterion("flight_distance is null");
            return (Criteria) this;
        }

        public Criteria andFlightDistanceIsNotNull() {
            addCriterion("flight_distance is not null");
            return (Criteria) this;
        }

        public Criteria andFlightDistanceEqualTo(Double value) {
            addCriterion("flight_distance =", value, "flightDistance");
            return (Criteria) this;
        }

        public Criteria andFlightDistanceNotEqualTo(Double value) {
            addCriterion("flight_distance <>", value, "flightDistance");
            return (Criteria) this;
        }

        public Criteria andFlightDistanceGreaterThan(Double value) {
            addCriterion("flight_distance >", value, "flightDistance");
            return (Criteria) this;
        }

        public Criteria andFlightDistanceGreaterThanOrEqualTo(Double value) {
            addCriterion("flight_distance >=", value, "flightDistance");
            return (Criteria) this;
        }

        public Criteria andFlightDistanceLessThan(Double value) {
            addCriterion("flight_distance <", value, "flightDistance");
            return (Criteria) this;
        }

        public Criteria andFlightDistanceLessThanOrEqualTo(Double value) {
            addCriterion("flight_distance <=", value, "flightDistance");
            return (Criteria) this;
        }

        public Criteria andFlightDistanceIn(List<Double> values) {
            addCriterion("flight_distance in", values, "flightDistance");
            return (Criteria) this;
        }

        public Criteria andFlightDistanceNotIn(List<Double> values) {
            addCriterion("flight_distance not in", values, "flightDistance");
            return (Criteria) this;
        }

        public Criteria andFlightDistanceBetween(Double value1, Double value2) {
            addCriterion("flight_distance between", value1, value2, "flightDistance");
            return (Criteria) this;
        }

        public Criteria andFlightDistanceNotBetween(Double value1, Double value2) {
            addCriterion("flight_distance not between", value1, value2, "flightDistance");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeIsNull() {
            addCriterion("start_longitude is null");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeIsNotNull() {
            addCriterion("start_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeEqualTo(Double value) {
            addCriterion("start_longitude =", value, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeNotEqualTo(Double value) {
            addCriterion("start_longitude <>", value, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeGreaterThan(Double value) {
            addCriterion("start_longitude >", value, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("start_longitude >=", value, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeLessThan(Double value) {
            addCriterion("start_longitude <", value, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("start_longitude <=", value, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeIn(List<Double> values) {
            addCriterion("start_longitude in", values, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeNotIn(List<Double> values) {
            addCriterion("start_longitude not in", values, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeBetween(Double value1, Double value2) {
            addCriterion("start_longitude between", value1, value2, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("start_longitude not between", value1, value2, "startLongitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeIsNull() {
            addCriterion("start_latitude is null");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeIsNotNull() {
            addCriterion("start_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeEqualTo(Double value) {
            addCriterion("start_latitude =", value, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeNotEqualTo(Double value) {
            addCriterion("start_latitude <>", value, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeGreaterThan(Double value) {
            addCriterion("start_latitude >", value, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("start_latitude >=", value, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeLessThan(Double value) {
            addCriterion("start_latitude <", value, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("start_latitude <=", value, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeIn(List<Double> values) {
            addCriterion("start_latitude in", values, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeNotIn(List<Double> values) {
            addCriterion("start_latitude not in", values, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeBetween(Double value1, Double value2) {
            addCriterion("start_latitude between", value1, value2, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andStartLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("start_latitude not between", value1, value2, "startLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeIsNull() {
            addCriterion("end_longitude is null");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeIsNotNull() {
            addCriterion("end_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeEqualTo(Double value) {
            addCriterion("end_longitude =", value, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeNotEqualTo(Double value) {
            addCriterion("end_longitude <>", value, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeGreaterThan(Double value) {
            addCriterion("end_longitude >", value, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("end_longitude >=", value, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeLessThan(Double value) {
            addCriterion("end_longitude <", value, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("end_longitude <=", value, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeIn(List<Double> values) {
            addCriterion("end_longitude in", values, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeNotIn(List<Double> values) {
            addCriterion("end_longitude not in", values, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeBetween(Double value1, Double value2) {
            addCriterion("end_longitude between", value1, value2, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("end_longitude not between", value1, value2, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeIsNull() {
            addCriterion("end_latitude is null");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeIsNotNull() {
            addCriterion("end_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeEqualTo(Double value) {
            addCriterion("end_latitude =", value, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeNotEqualTo(Double value) {
            addCriterion("end_latitude <>", value, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeGreaterThan(Double value) {
            addCriterion("end_latitude >", value, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("end_latitude >=", value, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeLessThan(Double value) {
            addCriterion("end_latitude <", value, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("end_latitude <=", value, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeIn(List<Double> values) {
            addCriterion("end_latitude in", values, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeNotIn(List<Double> values) {
            addCriterion("end_latitude not in", values, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeBetween(Double value1, Double value2) {
            addCriterion("end_latitude between", value1, value2, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("end_latitude not between", value1, value2, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andTaskNumberIsNull() {
            addCriterion("task_number is null");
            return (Criteria) this;
        }

        public Criteria andTaskNumberIsNotNull() {
            addCriterion("task_number is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNumberEqualTo(String value) {
            addCriterion("task_number =", value, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberNotEqualTo(String value) {
            addCriterion("task_number <>", value, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberGreaterThan(String value) {
            addCriterion("task_number >", value, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberGreaterThanOrEqualTo(String value) {
            addCriterion("task_number >=", value, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberLessThan(String value) {
            addCriterion("task_number <", value, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberLessThanOrEqualTo(String value) {
            addCriterion("task_number <=", value, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberLike(String value) {
            addCriterion("task_number like", value, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberNotLike(String value) {
            addCriterion("task_number not like", value, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberIn(List<String> values) {
            addCriterion("task_number in", values, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberNotIn(List<String> values) {
            addCriterion("task_number not in", values, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberBetween(String value1, String value2) {
            addCriterion("task_number between", value1, value2, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberNotBetween(String value1, String value2) {
            addCriterion("task_number not between", value1, value2, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andHasTelemetryIsNull() {
            addCriterion("has_telemetry is null");
            return (Criteria) this;
        }

        public Criteria andHasTelemetryIsNotNull() {
            addCriterion("has_telemetry is not null");
            return (Criteria) this;
        }

        public Criteria andHasTelemetryEqualTo(Integer value) {
            addCriterion("has_telemetry =", value, "hasTelemetry");
            return (Criteria) this;
        }

        public Criteria andHasTelemetryNotEqualTo(Integer value) {
            addCriterion("has_telemetry <>", value, "hasTelemetry");
            return (Criteria) this;
        }

        public Criteria andHasTelemetryGreaterThan(Integer value) {
            addCriterion("has_telemetry >", value, "hasTelemetry");
            return (Criteria) this;
        }

        public Criteria andHasTelemetryGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_telemetry >=", value, "hasTelemetry");
            return (Criteria) this;
        }

        public Criteria andHasTelemetryLessThan(Integer value) {
            addCriterion("has_telemetry <", value, "hasTelemetry");
            return (Criteria) this;
        }

        public Criteria andHasTelemetryLessThanOrEqualTo(Integer value) {
            addCriterion("has_telemetry <=", value, "hasTelemetry");
            return (Criteria) this;
        }

        public Criteria andHasTelemetryIn(List<Integer> values) {
            addCriterion("has_telemetry in", values, "hasTelemetry");
            return (Criteria) this;
        }

        public Criteria andHasTelemetryNotIn(List<Integer> values) {
            addCriterion("has_telemetry not in", values, "hasTelemetry");
            return (Criteria) this;
        }

        public Criteria andHasTelemetryBetween(Integer value1, Integer value2) {
            addCriterion("has_telemetry between", value1, value2, "hasTelemetry");
            return (Criteria) this;
        }

        public Criteria andHasTelemetryNotBetween(Integer value1, Integer value2) {
            addCriterion("has_telemetry not between", value1, value2, "hasTelemetry");
            return (Criteria) this;
        }

        public Criteria andHasVideoIsNull() {
            addCriterion("has_video is null");
            return (Criteria) this;
        }

        public Criteria andHasVideoIsNotNull() {
            addCriterion("has_video is not null");
            return (Criteria) this;
        }

        public Criteria andHasVideoEqualTo(Integer value) {
            addCriterion("has_video =", value, "hasVideo");
            return (Criteria) this;
        }

        public Criteria andHasVideoNotEqualTo(Integer value) {
            addCriterion("has_video <>", value, "hasVideo");
            return (Criteria) this;
        }

        public Criteria andHasVideoGreaterThan(Integer value) {
            addCriterion("has_video >", value, "hasVideo");
            return (Criteria) this;
        }

        public Criteria andHasVideoGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_video >=", value, "hasVideo");
            return (Criteria) this;
        }

        public Criteria andHasVideoLessThan(Integer value) {
            addCriterion("has_video <", value, "hasVideo");
            return (Criteria) this;
        }

        public Criteria andHasVideoLessThanOrEqualTo(Integer value) {
            addCriterion("has_video <=", value, "hasVideo");
            return (Criteria) this;
        }

        public Criteria andHasVideoIn(List<Integer> values) {
            addCriterion("has_video in", values, "hasVideo");
            return (Criteria) this;
        }

        public Criteria andHasVideoNotIn(List<Integer> values) {
            addCriterion("has_video not in", values, "hasVideo");
            return (Criteria) this;
        }

        public Criteria andHasVideoBetween(Integer value1, Integer value2) {
            addCriterion("has_video between", value1, value2, "hasVideo");
            return (Criteria) this;
        }

        public Criteria andHasVideoNotBetween(Integer value1, Integer value2) {
            addCriterion("has_video not between", value1, value2, "hasVideo");
            return (Criteria) this;
        }

        public Criteria andHasHvideoIsNull() {
            addCriterion("has_hvideo is null");
            return (Criteria) this;
        }

        public Criteria andHasHvideoIsNotNull() {
            addCriterion("has_hvideo is not null");
            return (Criteria) this;
        }

        public Criteria andHasHvideoEqualTo(Integer value) {
            addCriterion("has_hvideo =", value, "hasHvideo");
            return (Criteria) this;
        }

        public Criteria andHasHvideoNotEqualTo(Integer value) {
            addCriterion("has_hvideo <>", value, "hasHvideo");
            return (Criteria) this;
        }

        public Criteria andHasHvideoGreaterThan(Integer value) {
            addCriterion("has_hvideo >", value, "hasHvideo");
            return (Criteria) this;
        }

        public Criteria andHasHvideoGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_hvideo >=", value, "hasHvideo");
            return (Criteria) this;
        }

        public Criteria andHasHvideoLessThan(Integer value) {
            addCriterion("has_hvideo <", value, "hasHvideo");
            return (Criteria) this;
        }

        public Criteria andHasHvideoLessThanOrEqualTo(Integer value) {
            addCriterion("has_hvideo <=", value, "hasHvideo");
            return (Criteria) this;
        }

        public Criteria andHasHvideoIn(List<Integer> values) {
            addCriterion("has_hvideo in", values, "hasHvideo");
            return (Criteria) this;
        }

        public Criteria andHasHvideoNotIn(List<Integer> values) {
            addCriterion("has_hvideo not in", values, "hasHvideo");
            return (Criteria) this;
        }

        public Criteria andHasHvideoBetween(Integer value1, Integer value2) {
            addCriterion("has_hvideo between", value1, value2, "hasHvideo");
            return (Criteria) this;
        }

        public Criteria andHasHvideoNotBetween(Integer value1, Integer value2) {
            addCriterion("has_hvideo not between", value1, value2, "hasHvideo");
            return (Criteria) this;
        }

        public Criteria andPilotsIsNull() {
            addCriterion("pilots is null");
            return (Criteria) this;
        }

        public Criteria andPilotsIsNotNull() {
            addCriterion("pilots is not null");
            return (Criteria) this;
        }

        public Criteria andPilotsEqualTo(String value) {
            addCriterion("pilots =", value, "pilots");
            return (Criteria) this;
        }

        public Criteria andPilotsNotEqualTo(String value) {
            addCriterion("pilots <>", value, "pilots");
            return (Criteria) this;
        }

        public Criteria andPilotsGreaterThan(String value) {
            addCriterion("pilots >", value, "pilots");
            return (Criteria) this;
        }

        public Criteria andPilotsGreaterThanOrEqualTo(String value) {
            addCriterion("pilots >=", value, "pilots");
            return (Criteria) this;
        }

        public Criteria andPilotsLessThan(String value) {
            addCriterion("pilots <", value, "pilots");
            return (Criteria) this;
        }

        public Criteria andPilotsLessThanOrEqualTo(String value) {
            addCriterion("pilots <=", value, "pilots");
            return (Criteria) this;
        }

        public Criteria andPilotsLike(String value) {
            addCriterion("pilots like", value, "pilots");
            return (Criteria) this;
        }

        public Criteria andPilotsNotLike(String value) {
            addCriterion("pilots not like", value, "pilots");
            return (Criteria) this;
        }

        public Criteria andPilotsIn(List<String> values) {
            addCriterion("pilots in", values, "pilots");
            return (Criteria) this;
        }

        public Criteria andPilotsNotIn(List<String> values) {
            addCriterion("pilots not in", values, "pilots");
            return (Criteria) this;
        }

        public Criteria andPilotsBetween(String value1, String value2) {
            addCriterion("pilots between", value1, value2, "pilots");
            return (Criteria) this;
        }

        public Criteria andPilotsNotBetween(String value1, String value2) {
            addCriterion("pilots not between", value1, value2, "pilots");
            return (Criteria) this;
        }

        public Criteria andLoadergetIsNull() {
            addCriterion("loadErget is null");
            return (Criteria) this;
        }

        public Criteria andLoadergetIsNotNull() {
            addCriterion("loadErget is not null");
            return (Criteria) this;
        }

        public Criteria andLoadergetEqualTo(String value) {
            addCriterion("loadErget =", value, "loaderget");
            return (Criteria) this;
        }

        public Criteria andLoadergetNotEqualTo(String value) {
            addCriterion("loadErget <>", value, "loaderget");
            return (Criteria) this;
        }

        public Criteria andLoadergetGreaterThan(String value) {
            addCriterion("loadErget >", value, "loaderget");
            return (Criteria) this;
        }

        public Criteria andLoadergetGreaterThanOrEqualTo(String value) {
            addCriterion("loadErget >=", value, "loaderget");
            return (Criteria) this;
        }

        public Criteria andLoadergetLessThan(String value) {
            addCriterion("loadErget <", value, "loaderget");
            return (Criteria) this;
        }

        public Criteria andLoadergetLessThanOrEqualTo(String value) {
            addCriterion("loadErget <=", value, "loaderget");
            return (Criteria) this;
        }

        public Criteria andLoadergetLike(String value) {
            addCriterion("loadErget like", value, "loaderget");
            return (Criteria) this;
        }

        public Criteria andLoadergetNotLike(String value) {
            addCriterion("loadErget not like", value, "loaderget");
            return (Criteria) this;
        }

        public Criteria andLoadergetIn(List<String> values) {
            addCriterion("loadErget in", values, "loaderget");
            return (Criteria) this;
        }

        public Criteria andLoadergetNotIn(List<String> values) {
            addCriterion("loadErget not in", values, "loaderget");
            return (Criteria) this;
        }

        public Criteria andLoadergetBetween(String value1, String value2) {
            addCriterion("loadErget between", value1, value2, "loaderget");
            return (Criteria) this;
        }

        public Criteria andLoadergetNotBetween(String value1, String value2) {
            addCriterion("loadErget not between", value1, value2, "loaderget");
            return (Criteria) this;
        }

        public Criteria andSeetypeIsNull() {
            addCriterion("seeType is null");
            return (Criteria) this;
        }

        public Criteria andSeetypeIsNotNull() {
            addCriterion("seeType is not null");
            return (Criteria) this;
        }

        public Criteria andSeetypeEqualTo(String value) {
            addCriterion("seeType =", value, "seetype");
            return (Criteria) this;
        }

        public Criteria andSeetypeNotEqualTo(String value) {
            addCriterion("seeType <>", value, "seetype");
            return (Criteria) this;
        }

        public Criteria andSeetypeGreaterThan(String value) {
            addCriterion("seeType >", value, "seetype");
            return (Criteria) this;
        }

        public Criteria andSeetypeGreaterThanOrEqualTo(String value) {
            addCriterion("seeType >=", value, "seetype");
            return (Criteria) this;
        }

        public Criteria andSeetypeLessThan(String value) {
            addCriterion("seeType <", value, "seetype");
            return (Criteria) this;
        }

        public Criteria andSeetypeLessThanOrEqualTo(String value) {
            addCriterion("seeType <=", value, "seetype");
            return (Criteria) this;
        }

        public Criteria andSeetypeLike(String value) {
            addCriterion("seeType like", value, "seetype");
            return (Criteria) this;
        }

        public Criteria andSeetypeNotLike(String value) {
            addCriterion("seeType not like", value, "seetype");
            return (Criteria) this;
        }

        public Criteria andSeetypeIn(List<String> values) {
            addCriterion("seeType in", values, "seetype");
            return (Criteria) this;
        }

        public Criteria andSeetypeNotIn(List<String> values) {
            addCriterion("seeType not in", values, "seetype");
            return (Criteria) this;
        }

        public Criteria andSeetypeBetween(String value1, String value2) {
            addCriterion("seeType between", value1, value2, "seetype");
            return (Criteria) this;
        }

        public Criteria andSeetypeNotBetween(String value1, String value2) {
            addCriterion("seeType not between", value1, value2, "seetype");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNull() {
            addCriterion("user_mobile is null");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNotNull() {
            addCriterion("user_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andUserMobileEqualTo(String value) {
            addCriterion("user_mobile =", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotEqualTo(String value) {
            addCriterion("user_mobile <>", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThan(String value) {
            addCriterion("user_mobile >", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThanOrEqualTo(String value) {
            addCriterion("user_mobile >=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThan(String value) {
            addCriterion("user_mobile <", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThanOrEqualTo(String value) {
            addCriterion("user_mobile <=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLike(String value) {
            addCriterion("user_mobile like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotLike(String value) {
            addCriterion("user_mobile not like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileIn(List<String> values) {
            addCriterion("user_mobile in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotIn(List<String> values) {
            addCriterion("user_mobile not in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileBetween(String value1, String value2) {
            addCriterion("user_mobile between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotBetween(String value1, String value2) {
            addCriterion("user_mobile not between", value1, value2, "userMobile");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}