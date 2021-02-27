package pers.wangshun.supermarketserver.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShopInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopInfoExample() {
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

        public Criteria andShopSizeIsNull() {
            addCriterion("shop_size is null");
            return (Criteria) this;
        }

        public Criteria andShopSizeIsNotNull() {
            addCriterion("shop_size is not null");
            return (Criteria) this;
        }

        public Criteria andShopSizeEqualTo(BigDecimal value) {
            addCriterion("shop_size =", value, "shopSize");
            return (Criteria) this;
        }

        public Criteria andShopSizeNotEqualTo(BigDecimal value) {
            addCriterion("shop_size <>", value, "shopSize");
            return (Criteria) this;
        }

        public Criteria andShopSizeGreaterThan(BigDecimal value) {
            addCriterion("shop_size >", value, "shopSize");
            return (Criteria) this;
        }

        public Criteria andShopSizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_size >=", value, "shopSize");
            return (Criteria) this;
        }

        public Criteria andShopSizeLessThan(BigDecimal value) {
            addCriterion("shop_size <", value, "shopSize");
            return (Criteria) this;
        }

        public Criteria andShopSizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_size <=", value, "shopSize");
            return (Criteria) this;
        }

        public Criteria andShopSizeIn(List<BigDecimal> values) {
            addCriterion("shop_size in", values, "shopSize");
            return (Criteria) this;
        }

        public Criteria andShopSizeNotIn(List<BigDecimal> values) {
            addCriterion("shop_size not in", values, "shopSize");
            return (Criteria) this;
        }

        public Criteria andShopSizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_size between", value1, value2, "shopSize");
            return (Criteria) this;
        }

        public Criteria andShopSizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_size not between", value1, value2, "shopSize");
            return (Criteria) this;
        }

        public Criteria andWorkersNumberIsNull() {
            addCriterion("workers_number is null");
            return (Criteria) this;
        }

        public Criteria andWorkersNumberIsNotNull() {
            addCriterion("workers_number is not null");
            return (Criteria) this;
        }

        public Criteria andWorkersNumberEqualTo(Integer value) {
            addCriterion("workers_number =", value, "workersNumber");
            return (Criteria) this;
        }

        public Criteria andWorkersNumberNotEqualTo(Integer value) {
            addCriterion("workers_number <>", value, "workersNumber");
            return (Criteria) this;
        }

        public Criteria andWorkersNumberGreaterThan(Integer value) {
            addCriterion("workers_number >", value, "workersNumber");
            return (Criteria) this;
        }

        public Criteria andWorkersNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("workers_number >=", value, "workersNumber");
            return (Criteria) this;
        }

        public Criteria andWorkersNumberLessThan(Integer value) {
            addCriterion("workers_number <", value, "workersNumber");
            return (Criteria) this;
        }

        public Criteria andWorkersNumberLessThanOrEqualTo(Integer value) {
            addCriterion("workers_number <=", value, "workersNumber");
            return (Criteria) this;
        }

        public Criteria andWorkersNumberIn(List<Integer> values) {
            addCriterion("workers_number in", values, "workersNumber");
            return (Criteria) this;
        }

        public Criteria andWorkersNumberNotIn(List<Integer> values) {
            addCriterion("workers_number not in", values, "workersNumber");
            return (Criteria) this;
        }

        public Criteria andWorkersNumberBetween(Integer value1, Integer value2) {
            addCriterion("workers_number between", value1, value2, "workersNumber");
            return (Criteria) this;
        }

        public Criteria andWorkersNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("workers_number not between", value1, value2, "workersNumber");
            return (Criteria) this;
        }

        public Criteria andShopLocationIsNull() {
            addCriterion("shop_location is null");
            return (Criteria) this;
        }

        public Criteria andShopLocationIsNotNull() {
            addCriterion("shop_location is not null");
            return (Criteria) this;
        }

        public Criteria andShopLocationEqualTo(String value) {
            addCriterion("shop_location =", value, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationNotEqualTo(String value) {
            addCriterion("shop_location <>", value, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationGreaterThan(String value) {
            addCriterion("shop_location >", value, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationGreaterThanOrEqualTo(String value) {
            addCriterion("shop_location >=", value, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationLessThan(String value) {
            addCriterion("shop_location <", value, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationLessThanOrEqualTo(String value) {
            addCriterion("shop_location <=", value, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationLike(String value) {
            addCriterion("shop_location like", value, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationNotLike(String value) {
            addCriterion("shop_location not like", value, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationIn(List<String> values) {
            addCriterion("shop_location in", values, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationNotIn(List<String> values) {
            addCriterion("shop_location not in", values, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationBetween(String value1, String value2) {
            addCriterion("shop_location between", value1, value2, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andShopLocationNotBetween(String value1, String value2) {
            addCriterion("shop_location not between", value1, value2, "shopLocation");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentIsNull() {
            addCriterion("monthly_rent is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentIsNotNull() {
            addCriterion("monthly_rent is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentEqualTo(BigDecimal value) {
            addCriterion("monthly_rent =", value, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentNotEqualTo(BigDecimal value) {
            addCriterion("monthly_rent <>", value, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentGreaterThan(BigDecimal value) {
            addCriterion("monthly_rent >", value, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("monthly_rent >=", value, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentLessThan(BigDecimal value) {
            addCriterion("monthly_rent <", value, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("monthly_rent <=", value, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentIn(List<BigDecimal> values) {
            addCriterion("monthly_rent in", values, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentNotIn(List<BigDecimal> values) {
            addCriterion("monthly_rent not in", values, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("monthly_rent between", value1, value2, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andMonthlyRentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("monthly_rent not between", value1, value2, "monthlyRent");
            return (Criteria) this;
        }

        public Criteria andShopDepositIsNull() {
            addCriterion("shop_deposit is null");
            return (Criteria) this;
        }

        public Criteria andShopDepositIsNotNull() {
            addCriterion("shop_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andShopDepositEqualTo(BigDecimal value) {
            addCriterion("shop_deposit =", value, "shopDeposit");
            return (Criteria) this;
        }

        public Criteria andShopDepositNotEqualTo(BigDecimal value) {
            addCriterion("shop_deposit <>", value, "shopDeposit");
            return (Criteria) this;
        }

        public Criteria andShopDepositGreaterThan(BigDecimal value) {
            addCriterion("shop_deposit >", value, "shopDeposit");
            return (Criteria) this;
        }

        public Criteria andShopDepositGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_deposit >=", value, "shopDeposit");
            return (Criteria) this;
        }

        public Criteria andShopDepositLessThan(BigDecimal value) {
            addCriterion("shop_deposit <", value, "shopDeposit");
            return (Criteria) this;
        }

        public Criteria andShopDepositLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_deposit <=", value, "shopDeposit");
            return (Criteria) this;
        }

        public Criteria andShopDepositIn(List<BigDecimal> values) {
            addCriterion("shop_deposit in", values, "shopDeposit");
            return (Criteria) this;
        }

        public Criteria andShopDepositNotIn(List<BigDecimal> values) {
            addCriterion("shop_deposit not in", values, "shopDeposit");
            return (Criteria) this;
        }

        public Criteria andShopDepositBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_deposit between", value1, value2, "shopDeposit");
            return (Criteria) this;
        }

        public Criteria andShopDepositNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_deposit not between", value1, value2, "shopDeposit");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionIsNull() {
            addCriterion("shop_description is null");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionIsNotNull() {
            addCriterion("shop_description is not null");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionEqualTo(String value) {
            addCriterion("shop_description =", value, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionNotEqualTo(String value) {
            addCriterion("shop_description <>", value, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionGreaterThan(String value) {
            addCriterion("shop_description >", value, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("shop_description >=", value, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionLessThan(String value) {
            addCriterion("shop_description <", value, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionLessThanOrEqualTo(String value) {
            addCriterion("shop_description <=", value, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionLike(String value) {
            addCriterion("shop_description like", value, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionNotLike(String value) {
            addCriterion("shop_description not like", value, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionIn(List<String> values) {
            addCriterion("shop_description in", values, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionNotIn(List<String> values) {
            addCriterion("shop_description not in", values, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionBetween(String value1, String value2) {
            addCriterion("shop_description between", value1, value2, "shopDescription");
            return (Criteria) this;
        }

        public Criteria andShopDescriptionNotBetween(String value1, String value2) {
            addCriterion("shop_description not between", value1, value2, "shopDescription");
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