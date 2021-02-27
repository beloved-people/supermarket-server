package pers.wangshun.supermarketserver.model;

import java.util.ArrayList;
import java.util.List;

public class InventoryWarningInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InventoryWarningInfoExample() {
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

        public Criteria andGoodsBarCodeIsNull() {
            addCriterion("goods_bar_code is null");
            return (Criteria) this;
        }

        public Criteria andGoodsBarCodeIsNotNull() {
            addCriterion("goods_bar_code is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsBarCodeEqualTo(Long value) {
            addCriterion("goods_bar_code =", value, "goodsBarCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBarCodeNotEqualTo(Long value) {
            addCriterion("goods_bar_code <>", value, "goodsBarCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBarCodeGreaterThan(Long value) {
            addCriterion("goods_bar_code >", value, "goodsBarCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBarCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_bar_code >=", value, "goodsBarCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBarCodeLessThan(Long value) {
            addCriterion("goods_bar_code <", value, "goodsBarCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBarCodeLessThanOrEqualTo(Long value) {
            addCriterion("goods_bar_code <=", value, "goodsBarCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBarCodeIn(List<Long> values) {
            addCriterion("goods_bar_code in", values, "goodsBarCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBarCodeNotIn(List<Long> values) {
            addCriterion("goods_bar_code not in", values, "goodsBarCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBarCodeBetween(Long value1, Long value2) {
            addCriterion("goods_bar_code between", value1, value2, "goodsBarCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBarCodeNotBetween(Long value1, Long value2) {
            addCriterion("goods_bar_code not between", value1, value2, "goodsBarCode");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andInventoryMaxIsNull() {
            addCriterion("inventory_max is null");
            return (Criteria) this;
        }

        public Criteria andInventoryMaxIsNotNull() {
            addCriterion("inventory_max is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryMaxEqualTo(Integer value) {
            addCriterion("inventory_max =", value, "inventoryMax");
            return (Criteria) this;
        }

        public Criteria andInventoryMaxNotEqualTo(Integer value) {
            addCriterion("inventory_max <>", value, "inventoryMax");
            return (Criteria) this;
        }

        public Criteria andInventoryMaxGreaterThan(Integer value) {
            addCriterion("inventory_max >", value, "inventoryMax");
            return (Criteria) this;
        }

        public Criteria andInventoryMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("inventory_max >=", value, "inventoryMax");
            return (Criteria) this;
        }

        public Criteria andInventoryMaxLessThan(Integer value) {
            addCriterion("inventory_max <", value, "inventoryMax");
            return (Criteria) this;
        }

        public Criteria andInventoryMaxLessThanOrEqualTo(Integer value) {
            addCriterion("inventory_max <=", value, "inventoryMax");
            return (Criteria) this;
        }

        public Criteria andInventoryMaxIn(List<Integer> values) {
            addCriterion("inventory_max in", values, "inventoryMax");
            return (Criteria) this;
        }

        public Criteria andInventoryMaxNotIn(List<Integer> values) {
            addCriterion("inventory_max not in", values, "inventoryMax");
            return (Criteria) this;
        }

        public Criteria andInventoryMaxBetween(Integer value1, Integer value2) {
            addCriterion("inventory_max between", value1, value2, "inventoryMax");
            return (Criteria) this;
        }

        public Criteria andInventoryMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("inventory_max not between", value1, value2, "inventoryMax");
            return (Criteria) this;
        }

        public Criteria andInventoryMinIsNull() {
            addCriterion("inventory_min is null");
            return (Criteria) this;
        }

        public Criteria andInventoryMinIsNotNull() {
            addCriterion("inventory_min is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryMinEqualTo(Integer value) {
            addCriterion("inventory_min =", value, "inventoryMin");
            return (Criteria) this;
        }

        public Criteria andInventoryMinNotEqualTo(Integer value) {
            addCriterion("inventory_min <>", value, "inventoryMin");
            return (Criteria) this;
        }

        public Criteria andInventoryMinGreaterThan(Integer value) {
            addCriterion("inventory_min >", value, "inventoryMin");
            return (Criteria) this;
        }

        public Criteria andInventoryMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("inventory_min >=", value, "inventoryMin");
            return (Criteria) this;
        }

        public Criteria andInventoryMinLessThan(Integer value) {
            addCriterion("inventory_min <", value, "inventoryMin");
            return (Criteria) this;
        }

        public Criteria andInventoryMinLessThanOrEqualTo(Integer value) {
            addCriterion("inventory_min <=", value, "inventoryMin");
            return (Criteria) this;
        }

        public Criteria andInventoryMinIn(List<Integer> values) {
            addCriterion("inventory_min in", values, "inventoryMin");
            return (Criteria) this;
        }

        public Criteria andInventoryMinNotIn(List<Integer> values) {
            addCriterion("inventory_min not in", values, "inventoryMin");
            return (Criteria) this;
        }

        public Criteria andInventoryMinBetween(Integer value1, Integer value2) {
            addCriterion("inventory_min between", value1, value2, "inventoryMin");
            return (Criteria) this;
        }

        public Criteria andInventoryMinNotBetween(Integer value1, Integer value2) {
            addCriterion("inventory_min not between", value1, value2, "inventoryMin");
            return (Criteria) this;
        }

        public Criteria andInventoryQuantityIsNull() {
            addCriterion("inventory_quantity is null");
            return (Criteria) this;
        }

        public Criteria andInventoryQuantityIsNotNull() {
            addCriterion("inventory_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryQuantityEqualTo(Integer value) {
            addCriterion("inventory_quantity =", value, "inventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andInventoryQuantityNotEqualTo(Integer value) {
            addCriterion("inventory_quantity <>", value, "inventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andInventoryQuantityGreaterThan(Integer value) {
            addCriterion("inventory_quantity >", value, "inventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andInventoryQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("inventory_quantity >=", value, "inventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andInventoryQuantityLessThan(Integer value) {
            addCriterion("inventory_quantity <", value, "inventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andInventoryQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("inventory_quantity <=", value, "inventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andInventoryQuantityIn(List<Integer> values) {
            addCriterion("inventory_quantity in", values, "inventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andInventoryQuantityNotIn(List<Integer> values) {
            addCriterion("inventory_quantity not in", values, "inventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andInventoryQuantityBetween(Integer value1, Integer value2) {
            addCriterion("inventory_quantity between", value1, value2, "inventoryQuantity");
            return (Criteria) this;
        }

        public Criteria andInventoryQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("inventory_quantity not between", value1, value2, "inventoryQuantity");
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