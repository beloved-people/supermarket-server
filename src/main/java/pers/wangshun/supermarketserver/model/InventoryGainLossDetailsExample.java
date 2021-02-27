package pers.wangshun.supermarketserver.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class InventoryGainLossDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InventoryGainLossDetailsExample() {
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

        public Criteria andInventoryCountingDetailsIdIsNull() {
            addCriterion("inventory_counting_details_id is null");
            return (Criteria) this;
        }

        public Criteria andInventoryCountingDetailsIdIsNotNull() {
            addCriterion("inventory_counting_details_id is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryCountingDetailsIdEqualTo(Long value) {
            addCriterion("inventory_counting_details_id =", value, "inventoryCountingDetailsId");
            return (Criteria) this;
        }

        public Criteria andInventoryCountingDetailsIdNotEqualTo(Long value) {
            addCriterion("inventory_counting_details_id <>", value, "inventoryCountingDetailsId");
            return (Criteria) this;
        }

        public Criteria andInventoryCountingDetailsIdGreaterThan(Long value) {
            addCriterion("inventory_counting_details_id >", value, "inventoryCountingDetailsId");
            return (Criteria) this;
        }

        public Criteria andInventoryCountingDetailsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("inventory_counting_details_id >=", value, "inventoryCountingDetailsId");
            return (Criteria) this;
        }

        public Criteria andInventoryCountingDetailsIdLessThan(Long value) {
            addCriterion("inventory_counting_details_id <", value, "inventoryCountingDetailsId");
            return (Criteria) this;
        }

        public Criteria andInventoryCountingDetailsIdLessThanOrEqualTo(Long value) {
            addCriterion("inventory_counting_details_id <=", value, "inventoryCountingDetailsId");
            return (Criteria) this;
        }

        public Criteria andInventoryCountingDetailsIdIn(List<Long> values) {
            addCriterion("inventory_counting_details_id in", values, "inventoryCountingDetailsId");
            return (Criteria) this;
        }

        public Criteria andInventoryCountingDetailsIdNotIn(List<Long> values) {
            addCriterion("inventory_counting_details_id not in", values, "inventoryCountingDetailsId");
            return (Criteria) this;
        }

        public Criteria andInventoryCountingDetailsIdBetween(Long value1, Long value2) {
            addCriterion("inventory_counting_details_id between", value1, value2, "inventoryCountingDetailsId");
            return (Criteria) this;
        }

        public Criteria andInventoryCountingDetailsIdNotBetween(Long value1, Long value2) {
            addCriterion("inventory_counting_details_id not between", value1, value2, "inventoryCountingDetailsId");
            return (Criteria) this;
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

        public Criteria andRevenueLossIsNull() {
            addCriterion("revenue_loss is null");
            return (Criteria) this;
        }

        public Criteria andRevenueLossIsNotNull() {
            addCriterion("revenue_loss is not null");
            return (Criteria) this;
        }

        public Criteria andRevenueLossEqualTo(Integer value) {
            addCriterion("revenue_loss =", value, "revenueLoss");
            return (Criteria) this;
        }

        public Criteria andRevenueLossNotEqualTo(Integer value) {
            addCriterion("revenue_loss <>", value, "revenueLoss");
            return (Criteria) this;
        }

        public Criteria andRevenueLossGreaterThan(Integer value) {
            addCriterion("revenue_loss >", value, "revenueLoss");
            return (Criteria) this;
        }

        public Criteria andRevenueLossGreaterThanOrEqualTo(Integer value) {
            addCriterion("revenue_loss >=", value, "revenueLoss");
            return (Criteria) this;
        }

        public Criteria andRevenueLossLessThan(Integer value) {
            addCriterion("revenue_loss <", value, "revenueLoss");
            return (Criteria) this;
        }

        public Criteria andRevenueLossLessThanOrEqualTo(Integer value) {
            addCriterion("revenue_loss <=", value, "revenueLoss");
            return (Criteria) this;
        }

        public Criteria andRevenueLossIn(List<Integer> values) {
            addCriterion("revenue_loss in", values, "revenueLoss");
            return (Criteria) this;
        }

        public Criteria andRevenueLossNotIn(List<Integer> values) {
            addCriterion("revenue_loss not in", values, "revenueLoss");
            return (Criteria) this;
        }

        public Criteria andRevenueLossBetween(Integer value1, Integer value2) {
            addCriterion("revenue_loss between", value1, value2, "revenueLoss");
            return (Criteria) this;
        }

        public Criteria andRevenueLossNotBetween(Integer value1, Integer value2) {
            addCriterion("revenue_loss not between", value1, value2, "revenueLoss");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountIsNull() {
            addCriterion("inventory_amount is null");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountIsNotNull() {
            addCriterion("inventory_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountEqualTo(BigDecimal value) {
            addCriterion("inventory_amount =", value, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountNotEqualTo(BigDecimal value) {
            addCriterion("inventory_amount <>", value, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountGreaterThan(BigDecimal value) {
            addCriterion("inventory_amount >", value, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("inventory_amount >=", value, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountLessThan(BigDecimal value) {
            addCriterion("inventory_amount <", value, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("inventory_amount <=", value, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountIn(List<BigDecimal> values) {
            addCriterion("inventory_amount in", values, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountNotIn(List<BigDecimal> values) {
            addCriterion("inventory_amount not in", values, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("inventory_amount between", value1, value2, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("inventory_amount not between", value1, value2, "inventoryAmount");
            return (Criteria) this;
        }

        public Criteria andInventoryExpirationDateIsNull() {
            addCriterion("inventory_expiration_date is null");
            return (Criteria) this;
        }

        public Criteria andInventoryExpirationDateIsNotNull() {
            addCriterion("inventory_expiration_date is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryExpirationDateEqualTo(Integer value) {
            addCriterion("inventory_expiration_date =", value, "inventoryExpirationDate");
            return (Criteria) this;
        }

        public Criteria andInventoryExpirationDateNotEqualTo(Integer value) {
            addCriterion("inventory_expiration_date <>", value, "inventoryExpirationDate");
            return (Criteria) this;
        }

        public Criteria andInventoryExpirationDateGreaterThan(Integer value) {
            addCriterion("inventory_expiration_date >", value, "inventoryExpirationDate");
            return (Criteria) this;
        }

        public Criteria andInventoryExpirationDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("inventory_expiration_date >=", value, "inventoryExpirationDate");
            return (Criteria) this;
        }

        public Criteria andInventoryExpirationDateLessThan(Integer value) {
            addCriterion("inventory_expiration_date <", value, "inventoryExpirationDate");
            return (Criteria) this;
        }

        public Criteria andInventoryExpirationDateLessThanOrEqualTo(Integer value) {
            addCriterion("inventory_expiration_date <=", value, "inventoryExpirationDate");
            return (Criteria) this;
        }

        public Criteria andInventoryExpirationDateIn(List<Integer> values) {
            addCriterion("inventory_expiration_date in", values, "inventoryExpirationDate");
            return (Criteria) this;
        }

        public Criteria andInventoryExpirationDateNotIn(List<Integer> values) {
            addCriterion("inventory_expiration_date not in", values, "inventoryExpirationDate");
            return (Criteria) this;
        }

        public Criteria andInventoryExpirationDateBetween(Integer value1, Integer value2) {
            addCriterion("inventory_expiration_date between", value1, value2, "inventoryExpirationDate");
            return (Criteria) this;
        }

        public Criteria andInventoryExpirationDateNotBetween(Integer value1, Integer value2) {
            addCriterion("inventory_expiration_date not between", value1, value2, "inventoryExpirationDate");
            return (Criteria) this;
        }

        public Criteria andInventoryGainLossTotalPriceIsNull() {
            addCriterion("inventory_gain_loss_total_price is null");
            return (Criteria) this;
        }

        public Criteria andInventoryGainLossTotalPriceIsNotNull() {
            addCriterion("inventory_gain_loss_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryGainLossTotalPriceEqualTo(BigDecimal value) {
            addCriterion("inventory_gain_loss_total_price =", value, "inventoryGainLossTotalPrice");
            return (Criteria) this;
        }

        public Criteria andInventoryGainLossTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("inventory_gain_loss_total_price <>", value, "inventoryGainLossTotalPrice");
            return (Criteria) this;
        }

        public Criteria andInventoryGainLossTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("inventory_gain_loss_total_price >", value, "inventoryGainLossTotalPrice");
            return (Criteria) this;
        }

        public Criteria andInventoryGainLossTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("inventory_gain_loss_total_price >=", value, "inventoryGainLossTotalPrice");
            return (Criteria) this;
        }

        public Criteria andInventoryGainLossTotalPriceLessThan(BigDecimal value) {
            addCriterion("inventory_gain_loss_total_price <", value, "inventoryGainLossTotalPrice");
            return (Criteria) this;
        }

        public Criteria andInventoryGainLossTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("inventory_gain_loss_total_price <=", value, "inventoryGainLossTotalPrice");
            return (Criteria) this;
        }

        public Criteria andInventoryGainLossTotalPriceIn(List<BigDecimal> values) {
            addCriterion("inventory_gain_loss_total_price in", values, "inventoryGainLossTotalPrice");
            return (Criteria) this;
        }

        public Criteria andInventoryGainLossTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("inventory_gain_loss_total_price not in", values, "inventoryGainLossTotalPrice");
            return (Criteria) this;
        }

        public Criteria andInventoryGainLossTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("inventory_gain_loss_total_price between", value1, value2, "inventoryGainLossTotalPrice");
            return (Criteria) this;
        }

        public Criteria andInventoryGainLossTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("inventory_gain_loss_total_price not between", value1, value2, "inventoryGainLossTotalPrice");
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