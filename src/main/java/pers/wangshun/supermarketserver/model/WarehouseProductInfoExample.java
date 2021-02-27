package pers.wangshun.supermarketserver.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WarehouseProductInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarehouseProductInfoExample() {
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

        public Criteria andPurchasePriceIsNull() {
            addCriterion("purchase_price is null");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIsNotNull() {
            addCriterion("purchase_price is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceEqualTo(BigDecimal value) {
            addCriterion("purchase_price =", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotEqualTo(BigDecimal value) {
            addCriterion("purchase_price <>", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceGreaterThan(BigDecimal value) {
            addCriterion("purchase_price >", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_price >=", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceLessThan(BigDecimal value) {
            addCriterion("purchase_price <", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_price <=", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIn(List<BigDecimal> values) {
            addCriterion("purchase_price in", values, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotIn(List<BigDecimal> values) {
            addCriterion("purchase_price not in", values, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_price between", value1, value2, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_price not between", value1, value2, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsQuantityIsNull() {
            addCriterion("purchase_details_quantity is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsQuantityIsNotNull() {
            addCriterion("purchase_details_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsQuantityEqualTo(Integer value) {
            addCriterion("purchase_details_quantity =", value, "purchaseDetailsQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsQuantityNotEqualTo(Integer value) {
            addCriterion("purchase_details_quantity <>", value, "purchaseDetailsQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsQuantityGreaterThan(Integer value) {
            addCriterion("purchase_details_quantity >", value, "purchaseDetailsQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase_details_quantity >=", value, "purchaseDetailsQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsQuantityLessThan(Integer value) {
            addCriterion("purchase_details_quantity <", value, "purchaseDetailsQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("purchase_details_quantity <=", value, "purchaseDetailsQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsQuantityIn(List<Integer> values) {
            addCriterion("purchase_details_quantity in", values, "purchaseDetailsQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsQuantityNotIn(List<Integer> values) {
            addCriterion("purchase_details_quantity not in", values, "purchaseDetailsQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsQuantityBetween(Integer value1, Integer value2) {
            addCriterion("purchase_details_quantity between", value1, value2, "purchaseDetailsQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase_details_quantity not between", value1, value2, "purchaseDetailsQuantity");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsQuantityUnitIsNull() {
            addCriterion("purchase_details_quantity_unit is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsQuantityUnitIsNotNull() {
            addCriterion("purchase_details_quantity_unit is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsQuantityUnitEqualTo(String value) {
            addCriterion("purchase_details_quantity_unit =", value, "purchaseDetailsQuantityUnit");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsQuantityUnitNotEqualTo(String value) {
            addCriterion("purchase_details_quantity_unit <>", value, "purchaseDetailsQuantityUnit");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsQuantityUnitGreaterThan(String value) {
            addCriterion("purchase_details_quantity_unit >", value, "purchaseDetailsQuantityUnit");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsQuantityUnitGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_details_quantity_unit >=", value, "purchaseDetailsQuantityUnit");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsQuantityUnitLessThan(String value) {
            addCriterion("purchase_details_quantity_unit <", value, "purchaseDetailsQuantityUnit");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsQuantityUnitLessThanOrEqualTo(String value) {
            addCriterion("purchase_details_quantity_unit <=", value, "purchaseDetailsQuantityUnit");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsQuantityUnitLike(String value) {
            addCriterion("purchase_details_quantity_unit like", value, "purchaseDetailsQuantityUnit");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsQuantityUnitNotLike(String value) {
            addCriterion("purchase_details_quantity_unit not like", value, "purchaseDetailsQuantityUnit");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsQuantityUnitIn(List<String> values) {
            addCriterion("purchase_details_quantity_unit in", values, "purchaseDetailsQuantityUnit");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsQuantityUnitNotIn(List<String> values) {
            addCriterion("purchase_details_quantity_unit not in", values, "purchaseDetailsQuantityUnit");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsQuantityUnitBetween(String value1, String value2) {
            addCriterion("purchase_details_quantity_unit between", value1, value2, "purchaseDetailsQuantityUnit");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsQuantityUnitNotBetween(String value1, String value2) {
            addCriterion("purchase_details_quantity_unit not between", value1, value2, "purchaseDetailsQuantityUnit");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsAmountIsNull() {
            addCriterion("purchase_details_amount is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsAmountIsNotNull() {
            addCriterion("purchase_details_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsAmountEqualTo(BigDecimal value) {
            addCriterion("purchase_details_amount =", value, "purchaseDetailsAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsAmountNotEqualTo(BigDecimal value) {
            addCriterion("purchase_details_amount <>", value, "purchaseDetailsAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsAmountGreaterThan(BigDecimal value) {
            addCriterion("purchase_details_amount >", value, "purchaseDetailsAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_details_amount >=", value, "purchaseDetailsAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsAmountLessThan(BigDecimal value) {
            addCriterion("purchase_details_amount <", value, "purchaseDetailsAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_details_amount <=", value, "purchaseDetailsAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsAmountIn(List<BigDecimal> values) {
            addCriterion("purchase_details_amount in", values, "purchaseDetailsAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsAmountNotIn(List<BigDecimal> values) {
            addCriterion("purchase_details_amount not in", values, "purchaseDetailsAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_details_amount between", value1, value2, "purchaseDetailsAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_details_amount not between", value1, value2, "purchaseDetailsAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsExpirationDateIsNull() {
            addCriterion("purchase_details_expiration_date is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsExpirationDateIsNotNull() {
            addCriterion("purchase_details_expiration_date is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsExpirationDateEqualTo(Integer value) {
            addCriterion("purchase_details_expiration_date =", value, "purchaseDetailsExpirationDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsExpirationDateNotEqualTo(Integer value) {
            addCriterion("purchase_details_expiration_date <>", value, "purchaseDetailsExpirationDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsExpirationDateGreaterThan(Integer value) {
            addCriterion("purchase_details_expiration_date >", value, "purchaseDetailsExpirationDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsExpirationDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase_details_expiration_date >=", value, "purchaseDetailsExpirationDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsExpirationDateLessThan(Integer value) {
            addCriterion("purchase_details_expiration_date <", value, "purchaseDetailsExpirationDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsExpirationDateLessThanOrEqualTo(Integer value) {
            addCriterion("purchase_details_expiration_date <=", value, "purchaseDetailsExpirationDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsExpirationDateIn(List<Integer> values) {
            addCriterion("purchase_details_expiration_date in", values, "purchaseDetailsExpirationDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsExpirationDateNotIn(List<Integer> values) {
            addCriterion("purchase_details_expiration_date not in", values, "purchaseDetailsExpirationDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsExpirationDateBetween(Integer value1, Integer value2) {
            addCriterion("purchase_details_expiration_date between", value1, value2, "purchaseDetailsExpirationDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailsExpirationDateNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase_details_expiration_date not between", value1, value2, "purchaseDetailsExpirationDate");
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