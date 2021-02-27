package pers.wangshun.supermarketserver.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DailyDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DailyDataExample() {
        oredCriteria = new ArrayList<>();
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

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andVolumeIdIsNull() {
            addCriterion("volume_id is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIdIsNotNull() {
            addCriterion("volume_id is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeIdEqualTo(Integer value) {
            addCriterion("volume_id =", value, "volumeId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdNotEqualTo(Integer value) {
            addCriterion("volume_id <>", value, "volumeId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdGreaterThan(Integer value) {
            addCriterion("volume_id >", value, "volumeId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("volume_id >=", value, "volumeId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdLessThan(Integer value) {
            addCriterion("volume_id <", value, "volumeId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdLessThanOrEqualTo(Integer value) {
            addCriterion("volume_id <=", value, "volumeId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdIn(List<Integer> values) {
            addCriterion("volume_id in", values, "volumeId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdNotIn(List<Integer> values) {
            addCriterion("volume_id not in", values, "volumeId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdBetween(Integer value1, Integer value2) {
            addCriterion("volume_id between", value1, value2, "volumeId");
            return (Criteria) this;
        }

        public Criteria andVolumeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("volume_id not between", value1, value2, "volumeId");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Long value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Long value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Long value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Long value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Long value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Long> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Long> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Long value1, Long value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Long value1, Long value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andTodayIsNull() {
            addCriterion("today is null");
            return (Criteria) this;
        }

        public Criteria andTodayIsNotNull() {
            addCriterion("today is not null");
            return (Criteria) this;
        }

        public Criteria andTodayEqualTo(Date value) {
            addCriterion("today =", value, "today");
            return (Criteria) this;
        }

        public Criteria andTodayNotEqualTo(Date value) {
            addCriterion("today <>", value, "today");
            return (Criteria) this;
        }

        public Criteria andTodayGreaterThan(Date value) {
            addCriterion("today >", value, "today");
            return (Criteria) this;
        }

        public Criteria andTodayGreaterThanOrEqualTo(Date value) {
            addCriterion("today >=", value, "today");
            return (Criteria) this;
        }

        public Criteria andTodayLessThan(Date value) {
            addCriterion("today <", value, "today");
            return (Criteria) this;
        }

        public Criteria andTodayLessThanOrEqualTo(Date value) {
            addCriterion("today <=", value, "today");
            return (Criteria) this;
        }

        public Criteria andTodayIn(List<Date> values) {
            addCriterion("today in", values, "today");
            return (Criteria) this;
        }

        public Criteria andTodayNotIn(List<Date> values) {
            addCriterion("today not in", values, "today");
            return (Criteria) this;
        }

        public Criteria andTodayBetween(Date value1, Date value2) {
            addCriterion("today between", value1, value2, "today");
            return (Criteria) this;
        }

        public Criteria andTodayNotBetween(Date value1, Date value2) {
            addCriterion("today not between", value1, value2, "today");
            return (Criteria) this;
        }

        public Criteria andTodayTurnoverIsNull() {
            addCriterion("today_turnover is null");
            return (Criteria) this;
        }

        public Criteria andTodayTurnoverIsNotNull() {
            addCriterion("today_turnover is not null");
            return (Criteria) this;
        }

        public Criteria andTodayTurnoverEqualTo(BigDecimal value) {
            addCriterion("today_turnover =", value, "todayTurnover");
            return (Criteria) this;
        }

        public Criteria andTodayTurnoverNotEqualTo(BigDecimal value) {
            addCriterion("today_turnover <>", value, "todayTurnover");
            return (Criteria) this;
        }

        public Criteria andTodayTurnoverGreaterThan(BigDecimal value) {
            addCriterion("today_turnover >", value, "todayTurnover");
            return (Criteria) this;
        }

        public Criteria andTodayTurnoverGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("today_turnover >=", value, "todayTurnover");
            return (Criteria) this;
        }

        public Criteria andTodayTurnoverLessThan(BigDecimal value) {
            addCriterion("today_turnover <", value, "todayTurnover");
            return (Criteria) this;
        }

        public Criteria andTodayTurnoverLessThanOrEqualTo(BigDecimal value) {
            addCriterion("today_turnover <=", value, "todayTurnover");
            return (Criteria) this;
        }

        public Criteria andTodayTurnoverIn(List<BigDecimal> values) {
            addCriterion("today_turnover in", values, "todayTurnover");
            return (Criteria) this;
        }

        public Criteria andTodayTurnoverNotIn(List<BigDecimal> values) {
            addCriterion("today_turnover not in", values, "todayTurnover");
            return (Criteria) this;
        }

        public Criteria andTodayTurnoverBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_turnover between", value1, value2, "todayTurnover");
            return (Criteria) this;
        }

        public Criteria andTodayTurnoverNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("today_turnover not between", value1, value2, "todayTurnover");
            return (Criteria) this;
        }

        public Criteria andTodayPassengerFlowIsNull() {
            addCriterion("today_passenger_flow is null");
            return (Criteria) this;
        }

        public Criteria andTodayPassengerFlowIsNotNull() {
            addCriterion("today_passenger_flow is not null");
            return (Criteria) this;
        }

        public Criteria andTodayPassengerFlowEqualTo(Integer value) {
            addCriterion("today_passenger_flow =", value, "todayPassengerFlow");
            return (Criteria) this;
        }

        public Criteria andTodayPassengerFlowNotEqualTo(Integer value) {
            addCriterion("today_passenger_flow <>", value, "todayPassengerFlow");
            return (Criteria) this;
        }

        public Criteria andTodayPassengerFlowGreaterThan(Integer value) {
            addCriterion("today_passenger_flow >", value, "todayPassengerFlow");
            return (Criteria) this;
        }

        public Criteria andTodayPassengerFlowGreaterThanOrEqualTo(Integer value) {
            addCriterion("today_passenger_flow >=", value, "todayPassengerFlow");
            return (Criteria) this;
        }

        public Criteria andTodayPassengerFlowLessThan(Integer value) {
            addCriterion("today_passenger_flow <", value, "todayPassengerFlow");
            return (Criteria) this;
        }

        public Criteria andTodayPassengerFlowLessThanOrEqualTo(Integer value) {
            addCriterion("today_passenger_flow <=", value, "todayPassengerFlow");
            return (Criteria) this;
        }

        public Criteria andTodayPassengerFlowIn(List<Integer> values) {
            addCriterion("today_passenger_flow in", values, "todayPassengerFlow");
            return (Criteria) this;
        }

        public Criteria andTodayPassengerFlowNotIn(List<Integer> values) {
            addCriterion("today_passenger_flow not in", values, "todayPassengerFlow");
            return (Criteria) this;
        }

        public Criteria andTodayPassengerFlowBetween(Integer value1, Integer value2) {
            addCriterion("today_passenger_flow between", value1, value2, "todayPassengerFlow");
            return (Criteria) this;
        }

        public Criteria andTodayPassengerFlowNotBetween(Integer value1, Integer value2) {
            addCriterion("today_passenger_flow not between", value1, value2, "todayPassengerFlow");
            return (Criteria) this;
        }
    }

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