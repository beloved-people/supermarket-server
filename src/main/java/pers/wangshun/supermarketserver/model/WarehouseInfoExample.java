package pers.wangshun.supermarketserver.model;

import java.util.ArrayList;
import java.util.List;

public class WarehouseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehouseInfoExample() {
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

        public Criteria andWarehouseCodeIsNull() {
            addCriterion("warehouse_code is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeIsNotNull() {
            addCriterion("warehouse_code is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeEqualTo(Long value) {
            addCriterion("warehouse_code =", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotEqualTo(Long value) {
            addCriterion("warehouse_code <>", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeGreaterThan(Long value) {
            addCriterion("warehouse_code >", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("warehouse_code >=", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeLessThan(Long value) {
            addCriterion("warehouse_code <", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeLessThanOrEqualTo(Long value) {
            addCriterion("warehouse_code <=", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeIn(List<Long> values) {
            addCriterion("warehouse_code in", values, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotIn(List<Long> values) {
            addCriterion("warehouse_code not in", values, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeBetween(Long value1, Long value2) {
            addCriterion("warehouse_code between", value1, value2, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotBetween(Long value1, Long value2) {
            addCriterion("warehouse_code not between", value1, value2, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameIsNull() {
            addCriterion("warehouse_name is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameIsNotNull() {
            addCriterion("warehouse_name is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameEqualTo(String value) {
            addCriterion("warehouse_name =", value, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameNotEqualTo(String value) {
            addCriterion("warehouse_name <>", value, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameGreaterThan(String value) {
            addCriterion("warehouse_name >", value, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_name >=", value, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameLessThan(String value) {
            addCriterion("warehouse_name <", value, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameLessThanOrEqualTo(String value) {
            addCriterion("warehouse_name <=", value, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameLike(String value) {
            addCriterion("warehouse_name like", value, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameNotLike(String value) {
            addCriterion("warehouse_name not like", value, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameIn(List<String> values) {
            addCriterion("warehouse_name in", values, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameNotIn(List<String> values) {
            addCriterion("warehouse_name not in", values, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameBetween(String value1, String value2) {
            addCriterion("warehouse_name between", value1, value2, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseNameNotBetween(String value1, String value2) {
            addCriterion("warehouse_name not between", value1, value2, "warehouseName");
            return (Criteria) this;
        }

        public Criteria andWarehouseLocationIsNull() {
            addCriterion("warehouse_location is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseLocationIsNotNull() {
            addCriterion("warehouse_location is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseLocationEqualTo(String value) {
            addCriterion("warehouse_location =", value, "warehouseLocation");
            return (Criteria) this;
        }

        public Criteria andWarehouseLocationNotEqualTo(String value) {
            addCriterion("warehouse_location <>", value, "warehouseLocation");
            return (Criteria) this;
        }

        public Criteria andWarehouseLocationGreaterThan(String value) {
            addCriterion("warehouse_location >", value, "warehouseLocation");
            return (Criteria) this;
        }

        public Criteria andWarehouseLocationGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_location >=", value, "warehouseLocation");
            return (Criteria) this;
        }

        public Criteria andWarehouseLocationLessThan(String value) {
            addCriterion("warehouse_location <", value, "warehouseLocation");
            return (Criteria) this;
        }

        public Criteria andWarehouseLocationLessThanOrEqualTo(String value) {
            addCriterion("warehouse_location <=", value, "warehouseLocation");
            return (Criteria) this;
        }

        public Criteria andWarehouseLocationLike(String value) {
            addCriterion("warehouse_location like", value, "warehouseLocation");
            return (Criteria) this;
        }

        public Criteria andWarehouseLocationNotLike(String value) {
            addCriterion("warehouse_location not like", value, "warehouseLocation");
            return (Criteria) this;
        }

        public Criteria andWarehouseLocationIn(List<String> values) {
            addCriterion("warehouse_location in", values, "warehouseLocation");
            return (Criteria) this;
        }

        public Criteria andWarehouseLocationNotIn(List<String> values) {
            addCriterion("warehouse_location not in", values, "warehouseLocation");
            return (Criteria) this;
        }

        public Criteria andWarehouseLocationBetween(String value1, String value2) {
            addCriterion("warehouse_location between", value1, value2, "warehouseLocation");
            return (Criteria) this;
        }

        public Criteria andWarehouseLocationNotBetween(String value1, String value2) {
            addCriterion("warehouse_location not between", value1, value2, "warehouseLocation");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescriptionIsNull() {
            addCriterion("warehouse_description is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescriptionIsNotNull() {
            addCriterion("warehouse_description is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescriptionEqualTo(String value) {
            addCriterion("warehouse_description =", value, "warehouseDescription");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescriptionNotEqualTo(String value) {
            addCriterion("warehouse_description <>", value, "warehouseDescription");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescriptionGreaterThan(String value) {
            addCriterion("warehouse_description >", value, "warehouseDescription");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_description >=", value, "warehouseDescription");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescriptionLessThan(String value) {
            addCriterion("warehouse_description <", value, "warehouseDescription");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescriptionLessThanOrEqualTo(String value) {
            addCriterion("warehouse_description <=", value, "warehouseDescription");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescriptionLike(String value) {
            addCriterion("warehouse_description like", value, "warehouseDescription");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescriptionNotLike(String value) {
            addCriterion("warehouse_description not like", value, "warehouseDescription");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescriptionIn(List<String> values) {
            addCriterion("warehouse_description in", values, "warehouseDescription");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescriptionNotIn(List<String> values) {
            addCriterion("warehouse_description not in", values, "warehouseDescription");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescriptionBetween(String value1, String value2) {
            addCriterion("warehouse_description between", value1, value2, "warehouseDescription");
            return (Criteria) this;
        }

        public Criteria andWarehouseDescriptionNotBetween(String value1, String value2) {
            addCriterion("warehouse_description not between", value1, value2, "warehouseDescription");
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