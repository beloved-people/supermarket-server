package pers.wangshun.supermarketserver.model;

import java.util.ArrayList;
import java.util.List;

public class FourthLevelAdministrativeDivisionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FourthLevelAdministrativeDivisionExample() {
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

        public Criteria andFourthLevelIdIsNull() {
            addCriterion("fourth_level_id is null");
            return (Criteria) this;
        }

        public Criteria andFourthLevelIdIsNotNull() {
            addCriterion("fourth_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andFourthLevelIdEqualTo(Integer value) {
            addCriterion("fourth_level_id =", value, "fourthLevelId");
            return (Criteria) this;
        }

        public Criteria andFourthLevelIdNotEqualTo(Integer value) {
            addCriterion("fourth_level_id <>", value, "fourthLevelId");
            return (Criteria) this;
        }

        public Criteria andFourthLevelIdGreaterThan(Integer value) {
            addCriterion("fourth_level_id >", value, "fourthLevelId");
            return (Criteria) this;
        }

        public Criteria andFourthLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fourth_level_id >=", value, "fourthLevelId");
            return (Criteria) this;
        }

        public Criteria andFourthLevelIdLessThan(Integer value) {
            addCriterion("fourth_level_id <", value, "fourthLevelId");
            return (Criteria) this;
        }

        public Criteria andFourthLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("fourth_level_id <=", value, "fourthLevelId");
            return (Criteria) this;
        }

        public Criteria andFourthLevelIdIn(List<Integer> values) {
            addCriterion("fourth_level_id in", values, "fourthLevelId");
            return (Criteria) this;
        }

        public Criteria andFourthLevelIdNotIn(List<Integer> values) {
            addCriterion("fourth_level_id not in", values, "fourthLevelId");
            return (Criteria) this;
        }

        public Criteria andFourthLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("fourth_level_id between", value1, value2, "fourthLevelId");
            return (Criteria) this;
        }

        public Criteria andFourthLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fourth_level_id not between", value1, value2, "fourthLevelId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelIdIsNull() {
            addCriterion("first_level_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstLevelIdIsNotNull() {
            addCriterion("first_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstLevelIdEqualTo(Integer value) {
            addCriterion("first_level_id =", value, "firstLevelId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelIdNotEqualTo(Integer value) {
            addCriterion("first_level_id <>", value, "firstLevelId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelIdGreaterThan(Integer value) {
            addCriterion("first_level_id >", value, "firstLevelId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_level_id >=", value, "firstLevelId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelIdLessThan(Integer value) {
            addCriterion("first_level_id <", value, "firstLevelId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("first_level_id <=", value, "firstLevelId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelIdIn(List<Integer> values) {
            addCriterion("first_level_id in", values, "firstLevelId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelIdNotIn(List<Integer> values) {
            addCriterion("first_level_id not in", values, "firstLevelId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("first_level_id between", value1, value2, "firstLevelId");
            return (Criteria) this;
        }

        public Criteria andFirstLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("first_level_id not between", value1, value2, "firstLevelId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelIdIsNull() {
            addCriterion("second_level_id is null");
            return (Criteria) this;
        }

        public Criteria andSecondLevelIdIsNotNull() {
            addCriterion("second_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecondLevelIdEqualTo(Integer value) {
            addCriterion("second_level_id =", value, "secondLevelId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelIdNotEqualTo(Integer value) {
            addCriterion("second_level_id <>", value, "secondLevelId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelIdGreaterThan(Integer value) {
            addCriterion("second_level_id >", value, "secondLevelId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("second_level_id >=", value, "secondLevelId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelIdLessThan(Integer value) {
            addCriterion("second_level_id <", value, "secondLevelId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("second_level_id <=", value, "secondLevelId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelIdIn(List<Integer> values) {
            addCriterion("second_level_id in", values, "secondLevelId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelIdNotIn(List<Integer> values) {
            addCriterion("second_level_id not in", values, "secondLevelId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("second_level_id between", value1, value2, "secondLevelId");
            return (Criteria) this;
        }

        public Criteria andSecondLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("second_level_id not between", value1, value2, "secondLevelId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelIdIsNull() {
            addCriterion("third_level_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdLevelIdIsNotNull() {
            addCriterion("third_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdLevelIdEqualTo(Integer value) {
            addCriterion("third_level_id =", value, "thirdLevelId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelIdNotEqualTo(Integer value) {
            addCriterion("third_level_id <>", value, "thirdLevelId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelIdGreaterThan(Integer value) {
            addCriterion("third_level_id >", value, "thirdLevelId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("third_level_id >=", value, "thirdLevelId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelIdLessThan(Integer value) {
            addCriterion("third_level_id <", value, "thirdLevelId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("third_level_id <=", value, "thirdLevelId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelIdIn(List<Integer> values) {
            addCriterion("third_level_id in", values, "thirdLevelId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelIdNotIn(List<Integer> values) {
            addCriterion("third_level_id not in", values, "thirdLevelId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("third_level_id between", value1, value2, "thirdLevelId");
            return (Criteria) this;
        }

        public Criteria andThirdLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("third_level_id not between", value1, value2, "thirdLevelId");
            return (Criteria) this;
        }

        public Criteria andFourthLevelNameIsNull() {
            addCriterion("fourth_level_name is null");
            return (Criteria) this;
        }

        public Criteria andFourthLevelNameIsNotNull() {
            addCriterion("fourth_level_name is not null");
            return (Criteria) this;
        }

        public Criteria andFourthLevelNameEqualTo(String value) {
            addCriterion("fourth_level_name =", value, "fourthLevelName");
            return (Criteria) this;
        }

        public Criteria andFourthLevelNameNotEqualTo(String value) {
            addCriterion("fourth_level_name <>", value, "fourthLevelName");
            return (Criteria) this;
        }

        public Criteria andFourthLevelNameGreaterThan(String value) {
            addCriterion("fourth_level_name >", value, "fourthLevelName");
            return (Criteria) this;
        }

        public Criteria andFourthLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("fourth_level_name >=", value, "fourthLevelName");
            return (Criteria) this;
        }

        public Criteria andFourthLevelNameLessThan(String value) {
            addCriterion("fourth_level_name <", value, "fourthLevelName");
            return (Criteria) this;
        }

        public Criteria andFourthLevelNameLessThanOrEqualTo(String value) {
            addCriterion("fourth_level_name <=", value, "fourthLevelName");
            return (Criteria) this;
        }

        public Criteria andFourthLevelNameLike(String value) {
            addCriterion("fourth_level_name like", value, "fourthLevelName");
            return (Criteria) this;
        }

        public Criteria andFourthLevelNameNotLike(String value) {
            addCriterion("fourth_level_name not like", value, "fourthLevelName");
            return (Criteria) this;
        }

        public Criteria andFourthLevelNameIn(List<String> values) {
            addCriterion("fourth_level_name in", values, "fourthLevelName");
            return (Criteria) this;
        }

        public Criteria andFourthLevelNameNotIn(List<String> values) {
            addCriterion("fourth_level_name not in", values, "fourthLevelName");
            return (Criteria) this;
        }

        public Criteria andFourthLevelNameBetween(String value1, String value2) {
            addCriterion("fourth_level_name between", value1, value2, "fourthLevelName");
            return (Criteria) this;
        }

        public Criteria andFourthLevelNameNotBetween(String value1, String value2) {
            addCriterion("fourth_level_name not between", value1, value2, "fourthLevelName");
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