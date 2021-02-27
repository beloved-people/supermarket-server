package pers.wangshun.supermarketserver.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ActivityDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityDataExample() {
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

        public Criteria andActivityNameIsNull() {
            addCriterion("activity_name is null");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNotNull() {
            addCriterion("activity_name is not null");
            return (Criteria) this;
        }

        public Criteria andActivityNameEqualTo(String value) {
            addCriterion("activity_name =", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotEqualTo(String value) {
            addCriterion("activity_name <>", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThan(String value) {
            addCriterion("activity_name >", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThanOrEqualTo(String value) {
            addCriterion("activity_name >=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThan(String value) {
            addCriterion("activity_name <", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThanOrEqualTo(String value) {
            addCriterion("activity_name <=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLike(String value) {
            addCriterion("activity_name like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotLike(String value) {
            addCriterion("activity_name not like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameIn(List<String> values) {
            addCriterion("activity_name in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotIn(List<String> values) {
            addCriterion("activity_name not in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameBetween(String value1, String value2) {
            addCriterion("activity_name between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotBetween(String value1, String value2) {
            addCriterion("activity_name not between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityTotalCostIsNull() {
            addCriterion("activity_total_cost is null");
            return (Criteria) this;
        }

        public Criteria andActivityTotalCostIsNotNull() {
            addCriterion("activity_total_cost is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTotalCostEqualTo(BigDecimal value) {
            addCriterion("activity_total_cost =", value, "activityTotalCost");
            return (Criteria) this;
        }

        public Criteria andActivityTotalCostNotEqualTo(BigDecimal value) {
            addCriterion("activity_total_cost <>", value, "activityTotalCost");
            return (Criteria) this;
        }

        public Criteria andActivityTotalCostGreaterThan(BigDecimal value) {
            addCriterion("activity_total_cost >", value, "activityTotalCost");
            return (Criteria) this;
        }

        public Criteria andActivityTotalCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("activity_total_cost >=", value, "activityTotalCost");
            return (Criteria) this;
        }

        public Criteria andActivityTotalCostLessThan(BigDecimal value) {
            addCriterion("activity_total_cost <", value, "activityTotalCost");
            return (Criteria) this;
        }

        public Criteria andActivityTotalCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("activity_total_cost <=", value, "activityTotalCost");
            return (Criteria) this;
        }

        public Criteria andActivityTotalCostIn(List<BigDecimal> values) {
            addCriterion("activity_total_cost in", values, "activityTotalCost");
            return (Criteria) this;
        }

        public Criteria andActivityTotalCostNotIn(List<BigDecimal> values) {
            addCriterion("activity_total_cost not in", values, "activityTotalCost");
            return (Criteria) this;
        }

        public Criteria andActivityTotalCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("activity_total_cost between", value1, value2, "activityTotalCost");
            return (Criteria) this;
        }

        public Criteria andActivityTotalCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("activity_total_cost not between", value1, value2, "activityTotalCost");
            return (Criteria) this;
        }

        public Criteria andActivityDescriptionIsNull() {
            addCriterion("activity_description is null");
            return (Criteria) this;
        }

        public Criteria andActivityDescriptionIsNotNull() {
            addCriterion("activity_description is not null");
            return (Criteria) this;
        }

        public Criteria andActivityDescriptionEqualTo(String value) {
            addCriterion("activity_description =", value, "activityDescription");
            return (Criteria) this;
        }

        public Criteria andActivityDescriptionNotEqualTo(String value) {
            addCriterion("activity_description <>", value, "activityDescription");
            return (Criteria) this;
        }

        public Criteria andActivityDescriptionGreaterThan(String value) {
            addCriterion("activity_description >", value, "activityDescription");
            return (Criteria) this;
        }

        public Criteria andActivityDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("activity_description >=", value, "activityDescription");
            return (Criteria) this;
        }

        public Criteria andActivityDescriptionLessThan(String value) {
            addCriterion("activity_description <", value, "activityDescription");
            return (Criteria) this;
        }

        public Criteria andActivityDescriptionLessThanOrEqualTo(String value) {
            addCriterion("activity_description <=", value, "activityDescription");
            return (Criteria) this;
        }

        public Criteria andActivityDescriptionLike(String value) {
            addCriterion("activity_description like", value, "activityDescription");
            return (Criteria) this;
        }

        public Criteria andActivityDescriptionNotLike(String value) {
            addCriterion("activity_description not like", value, "activityDescription");
            return (Criteria) this;
        }

        public Criteria andActivityDescriptionIn(List<String> values) {
            addCriterion("activity_description in", values, "activityDescription");
            return (Criteria) this;
        }

        public Criteria andActivityDescriptionNotIn(List<String> values) {
            addCriterion("activity_description not in", values, "activityDescription");
            return (Criteria) this;
        }

        public Criteria andActivityDescriptionBetween(String value1, String value2) {
            addCriterion("activity_description between", value1, value2, "activityDescription");
            return (Criteria) this;
        }

        public Criteria andActivityDescriptionNotBetween(String value1, String value2) {
            addCriterion("activity_description not between", value1, value2, "activityDescription");
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