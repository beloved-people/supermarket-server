package pers.wangshun.supermarketserver.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InventoryCountingInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InventoryCountingInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andInventoryCountingInfoNumberIsNull() {
            addCriterion("inventory_counting_info_number is null");
            return (Criteria) this;
        }

        public Criteria andInventoryCountingInfoNumberIsNotNull() {
            addCriterion("inventory_counting_info_number is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryCountingInfoNumberEqualTo(Long value) {
            addCriterion("inventory_counting_info_number =", value, "inventoryCountingInfoNumber");
            return (Criteria) this;
        }

        public Criteria andInventoryCountingInfoNumberNotEqualTo(Long value) {
            addCriterion("inventory_counting_info_number <>", value, "inventoryCountingInfoNumber");
            return (Criteria) this;
        }

        public Criteria andInventoryCountingInfoNumberGreaterThan(Long value) {
            addCriterion("inventory_counting_info_number >", value, "inventoryCountingInfoNumber");
            return (Criteria) this;
        }

        public Criteria andInventoryCountingInfoNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("inventory_counting_info_number >=", value, "inventoryCountingInfoNumber");
            return (Criteria) this;
        }

        public Criteria andInventoryCountingInfoNumberLessThan(Long value) {
            addCriterion("inventory_counting_info_number <", value, "inventoryCountingInfoNumber");
            return (Criteria) this;
        }

        public Criteria andInventoryCountingInfoNumberLessThanOrEqualTo(Long value) {
            addCriterion("inventory_counting_info_number <=", value, "inventoryCountingInfoNumber");
            return (Criteria) this;
        }

        public Criteria andInventoryCountingInfoNumberIn(List<Long> values) {
            addCriterion("inventory_counting_info_number in", values, "inventoryCountingInfoNumber");
            return (Criteria) this;
        }

        public Criteria andInventoryCountingInfoNumberNotIn(List<Long> values) {
            addCriterion("inventory_counting_info_number not in", values, "inventoryCountingInfoNumber");
            return (Criteria) this;
        }

        public Criteria andInventoryCountingInfoNumberBetween(Long value1, Long value2) {
            addCriterion("inventory_counting_info_number between", value1, value2, "inventoryCountingInfoNumber");
            return (Criteria) this;
        }

        public Criteria andInventoryCountingInfoNumberNotBetween(Long value1, Long value2) {
            addCriterion("inventory_counting_info_number not between", value1, value2, "inventoryCountingInfoNumber");
            return (Criteria) this;
        }

        public Criteria andInventoryUserIsNull() {
            addCriterion("inventory_user is null");
            return (Criteria) this;
        }

        public Criteria andInventoryUserIsNotNull() {
            addCriterion("inventory_user is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryUserEqualTo(Long value) {
            addCriterion("inventory_user =", value, "inventoryUser");
            return (Criteria) this;
        }

        public Criteria andInventoryUserNotEqualTo(Long value) {
            addCriterion("inventory_user <>", value, "inventoryUser");
            return (Criteria) this;
        }

        public Criteria andInventoryUserGreaterThan(Long value) {
            addCriterion("inventory_user >", value, "inventoryUser");
            return (Criteria) this;
        }

        public Criteria andInventoryUserGreaterThanOrEqualTo(Long value) {
            addCriterion("inventory_user >=", value, "inventoryUser");
            return (Criteria) this;
        }

        public Criteria andInventoryUserLessThan(Long value) {
            addCriterion("inventory_user <", value, "inventoryUser");
            return (Criteria) this;
        }

        public Criteria andInventoryUserLessThanOrEqualTo(Long value) {
            addCriterion("inventory_user <=", value, "inventoryUser");
            return (Criteria) this;
        }

        public Criteria andInventoryUserIn(List<Long> values) {
            addCriterion("inventory_user in", values, "inventoryUser");
            return (Criteria) this;
        }

        public Criteria andInventoryUserNotIn(List<Long> values) {
            addCriterion("inventory_user not in", values, "inventoryUser");
            return (Criteria) this;
        }

        public Criteria andInventoryUserBetween(Long value1, Long value2) {
            addCriterion("inventory_user between", value1, value2, "inventoryUser");
            return (Criteria) this;
        }

        public Criteria andInventoryUserNotBetween(Long value1, Long value2) {
            addCriterion("inventory_user not between", value1, value2, "inventoryUser");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNull() {
            addCriterion("warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNotNull() {
            addCriterion("warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdEqualTo(Long value) {
            addCriterion("warehouse_id =", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotEqualTo(Long value) {
            addCriterion("warehouse_id <>", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThan(Long value) {
            addCriterion("warehouse_id >", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("warehouse_id >=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThan(Long value) {
            addCriterion("warehouse_id <", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThanOrEqualTo(Long value) {
            addCriterion("warehouse_id <=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIn(List<Long> values) {
            addCriterion("warehouse_id in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotIn(List<Long> values) {
            addCriterion("warehouse_id not in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdBetween(Long value1, Long value2) {
            addCriterion("warehouse_id between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotBetween(Long value1, Long value2) {
            addCriterion("warehouse_id not between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andInventoryDateIsNull() {
            addCriterion("inventory_date is null");
            return (Criteria) this;
        }

        public Criteria andInventoryDateIsNotNull() {
            addCriterion("inventory_date is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryDateEqualTo(Date value) {
            addCriterionForJDBCDate("inventory_date =", value, "inventoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("inventory_date <>", value, "inventoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("inventory_date >", value, "inventoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("inventory_date >=", value, "inventoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryDateLessThan(Date value) {
            addCriterionForJDBCDate("inventory_date <", value, "inventoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("inventory_date <=", value, "inventoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryDateIn(List<Date> values) {
            addCriterionForJDBCDate("inventory_date in", values, "inventoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("inventory_date not in", values, "inventoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("inventory_date between", value1, value2, "inventoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("inventory_date not between", value1, value2, "inventoryDate");
            return (Criteria) this;
        }

        public Criteria andInventoryStateIsNull() {
            addCriterion("inventory_state is null");
            return (Criteria) this;
        }

        public Criteria andInventoryStateIsNotNull() {
            addCriterion("inventory_state is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryStateEqualTo(String value) {
            addCriterion("inventory_state =", value, "inventoryState");
            return (Criteria) this;
        }

        public Criteria andInventoryStateNotEqualTo(String value) {
            addCriterion("inventory_state <>", value, "inventoryState");
            return (Criteria) this;
        }

        public Criteria andInventoryStateGreaterThan(String value) {
            addCriterion("inventory_state >", value, "inventoryState");
            return (Criteria) this;
        }

        public Criteria andInventoryStateGreaterThanOrEqualTo(String value) {
            addCriterion("inventory_state >=", value, "inventoryState");
            return (Criteria) this;
        }

        public Criteria andInventoryStateLessThan(String value) {
            addCriterion("inventory_state <", value, "inventoryState");
            return (Criteria) this;
        }

        public Criteria andInventoryStateLessThanOrEqualTo(String value) {
            addCriterion("inventory_state <=", value, "inventoryState");
            return (Criteria) this;
        }

        public Criteria andInventoryStateLike(String value) {
            addCriterion("inventory_state like", value, "inventoryState");
            return (Criteria) this;
        }

        public Criteria andInventoryStateNotLike(String value) {
            addCriterion("inventory_state not like", value, "inventoryState");
            return (Criteria) this;
        }

        public Criteria andInventoryStateIn(List<String> values) {
            addCriterion("inventory_state in", values, "inventoryState");
            return (Criteria) this;
        }

        public Criteria andInventoryStateNotIn(List<String> values) {
            addCriterion("inventory_state not in", values, "inventoryState");
            return (Criteria) this;
        }

        public Criteria andInventoryStateBetween(String value1, String value2) {
            addCriterion("inventory_state between", value1, value2, "inventoryState");
            return (Criteria) this;
        }

        public Criteria andInventoryStateNotBetween(String value1, String value2) {
            addCriterion("inventory_state not between", value1, value2, "inventoryState");
            return (Criteria) this;
        }

        public Criteria andInventoryRemarksIsNull() {
            addCriterion("inventory_remarks is null");
            return (Criteria) this;
        }

        public Criteria andInventoryRemarksIsNotNull() {
            addCriterion("inventory_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryRemarksEqualTo(String value) {
            addCriterion("inventory_remarks =", value, "inventoryRemarks");
            return (Criteria) this;
        }

        public Criteria andInventoryRemarksNotEqualTo(String value) {
            addCriterion("inventory_remarks <>", value, "inventoryRemarks");
            return (Criteria) this;
        }

        public Criteria andInventoryRemarksGreaterThan(String value) {
            addCriterion("inventory_remarks >", value, "inventoryRemarks");
            return (Criteria) this;
        }

        public Criteria andInventoryRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("inventory_remarks >=", value, "inventoryRemarks");
            return (Criteria) this;
        }

        public Criteria andInventoryRemarksLessThan(String value) {
            addCriterion("inventory_remarks <", value, "inventoryRemarks");
            return (Criteria) this;
        }

        public Criteria andInventoryRemarksLessThanOrEqualTo(String value) {
            addCriterion("inventory_remarks <=", value, "inventoryRemarks");
            return (Criteria) this;
        }

        public Criteria andInventoryRemarksLike(String value) {
            addCriterion("inventory_remarks like", value, "inventoryRemarks");
            return (Criteria) this;
        }

        public Criteria andInventoryRemarksNotLike(String value) {
            addCriterion("inventory_remarks not like", value, "inventoryRemarks");
            return (Criteria) this;
        }

        public Criteria andInventoryRemarksIn(List<String> values) {
            addCriterion("inventory_remarks in", values, "inventoryRemarks");
            return (Criteria) this;
        }

        public Criteria andInventoryRemarksNotIn(List<String> values) {
            addCriterion("inventory_remarks not in", values, "inventoryRemarks");
            return (Criteria) this;
        }

        public Criteria andInventoryRemarksBetween(String value1, String value2) {
            addCriterion("inventory_remarks between", value1, value2, "inventoryRemarks");
            return (Criteria) this;
        }

        public Criteria andInventoryRemarksNotBetween(String value1, String value2) {
            addCriterion("inventory_remarks not between", value1, value2, "inventoryRemarks");
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