package pers.wangshun.supermarketserver.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GoodsTransferInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsTransferInfoExample() {
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

        public Criteria andGoodsTransferInfoIdIsNull() {
            addCriterion("goods_transfer_info_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTransferInfoIdIsNotNull() {
            addCriterion("goods_transfer_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTransferInfoIdEqualTo(Long value) {
            addCriterion("goods_transfer_info_id =", value, "goodsTransferInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsTransferInfoIdNotEqualTo(Long value) {
            addCriterion("goods_transfer_info_id <>", value, "goodsTransferInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsTransferInfoIdGreaterThan(Long value) {
            addCriterion("goods_transfer_info_id >", value, "goodsTransferInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsTransferInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_transfer_info_id >=", value, "goodsTransferInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsTransferInfoIdLessThan(Long value) {
            addCriterion("goods_transfer_info_id <", value, "goodsTransferInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsTransferInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_transfer_info_id <=", value, "goodsTransferInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsTransferInfoIdIn(List<Long> values) {
            addCriterion("goods_transfer_info_id in", values, "goodsTransferInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsTransferInfoIdNotIn(List<Long> values) {
            addCriterion("goods_transfer_info_id not in", values, "goodsTransferInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsTransferInfoIdBetween(Long value1, Long value2) {
            addCriterion("goods_transfer_info_id between", value1, value2, "goodsTransferInfoId");
            return (Criteria) this;
        }

        public Criteria andGoodsTransferInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_transfer_info_id not between", value1, value2, "goodsTransferInfoId");
            return (Criteria) this;
        }

        public Criteria andMerchandiserIsNull() {
            addCriterion("merchandiser is null");
            return (Criteria) this;
        }

        public Criteria andMerchandiserIsNotNull() {
            addCriterion("merchandiser is not null");
            return (Criteria) this;
        }

        public Criteria andMerchandiserEqualTo(Long value) {
            addCriterion("merchandiser =", value, "merchandiser");
            return (Criteria) this;
        }

        public Criteria andMerchandiserNotEqualTo(Long value) {
            addCriterion("merchandiser <>", value, "merchandiser");
            return (Criteria) this;
        }

        public Criteria andMerchandiserGreaterThan(Long value) {
            addCriterion("merchandiser >", value, "merchandiser");
            return (Criteria) this;
        }

        public Criteria andMerchandiserGreaterThanOrEqualTo(Long value) {
            addCriterion("merchandiser >=", value, "merchandiser");
            return (Criteria) this;
        }

        public Criteria andMerchandiserLessThan(Long value) {
            addCriterion("merchandiser <", value, "merchandiser");
            return (Criteria) this;
        }

        public Criteria andMerchandiserLessThanOrEqualTo(Long value) {
            addCriterion("merchandiser <=", value, "merchandiser");
            return (Criteria) this;
        }

        public Criteria andMerchandiserIn(List<Long> values) {
            addCriterion("merchandiser in", values, "merchandiser");
            return (Criteria) this;
        }

        public Criteria andMerchandiserNotIn(List<Long> values) {
            addCriterion("merchandiser not in", values, "merchandiser");
            return (Criteria) this;
        }

        public Criteria andMerchandiserBetween(Long value1, Long value2) {
            addCriterion("merchandiser between", value1, value2, "merchandiser");
            return (Criteria) this;
        }

        public Criteria andMerchandiserNotBetween(Long value1, Long value2) {
            addCriterion("merchandiser not between", value1, value2, "merchandiser");
            return (Criteria) this;
        }

        public Criteria andCommodityInspectorIsNull() {
            addCriterion("commodity_inspector is null");
            return (Criteria) this;
        }

        public Criteria andCommodityInspectorIsNotNull() {
            addCriterion("commodity_inspector is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityInspectorEqualTo(Long value) {
            addCriterion("commodity_inspector =", value, "commodityInspector");
            return (Criteria) this;
        }

        public Criteria andCommodityInspectorNotEqualTo(Long value) {
            addCriterion("commodity_inspector <>", value, "commodityInspector");
            return (Criteria) this;
        }

        public Criteria andCommodityInspectorGreaterThan(Long value) {
            addCriterion("commodity_inspector >", value, "commodityInspector");
            return (Criteria) this;
        }

        public Criteria andCommodityInspectorGreaterThanOrEqualTo(Long value) {
            addCriterion("commodity_inspector >=", value, "commodityInspector");
            return (Criteria) this;
        }

        public Criteria andCommodityInspectorLessThan(Long value) {
            addCriterion("commodity_inspector <", value, "commodityInspector");
            return (Criteria) this;
        }

        public Criteria andCommodityInspectorLessThanOrEqualTo(Long value) {
            addCriterion("commodity_inspector <=", value, "commodityInspector");
            return (Criteria) this;
        }

        public Criteria andCommodityInspectorIn(List<Long> values) {
            addCriterion("commodity_inspector in", values, "commodityInspector");
            return (Criteria) this;
        }

        public Criteria andCommodityInspectorNotIn(List<Long> values) {
            addCriterion("commodity_inspector not in", values, "commodityInspector");
            return (Criteria) this;
        }

        public Criteria andCommodityInspectorBetween(Long value1, Long value2) {
            addCriterion("commodity_inspector between", value1, value2, "commodityInspector");
            return (Criteria) this;
        }

        public Criteria andCommodityInspectorNotBetween(Long value1, Long value2) {
            addCriterion("commodity_inspector not between", value1, value2, "commodityInspector");
            return (Criteria) this;
        }

        public Criteria andTransferToWarehouseIsNull() {
            addCriterion("transfer_to_warehouse is null");
            return (Criteria) this;
        }

        public Criteria andTransferToWarehouseIsNotNull() {
            addCriterion("transfer_to_warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andTransferToWarehouseEqualTo(Long value) {
            addCriterion("transfer_to_warehouse =", value, "transferToWarehouse");
            return (Criteria) this;
        }

        public Criteria andTransferToWarehouseNotEqualTo(Long value) {
            addCriterion("transfer_to_warehouse <>", value, "transferToWarehouse");
            return (Criteria) this;
        }

        public Criteria andTransferToWarehouseGreaterThan(Long value) {
            addCriterion("transfer_to_warehouse >", value, "transferToWarehouse");
            return (Criteria) this;
        }

        public Criteria andTransferToWarehouseGreaterThanOrEqualTo(Long value) {
            addCriterion("transfer_to_warehouse >=", value, "transferToWarehouse");
            return (Criteria) this;
        }

        public Criteria andTransferToWarehouseLessThan(Long value) {
            addCriterion("transfer_to_warehouse <", value, "transferToWarehouse");
            return (Criteria) this;
        }

        public Criteria andTransferToWarehouseLessThanOrEqualTo(Long value) {
            addCriterion("transfer_to_warehouse <=", value, "transferToWarehouse");
            return (Criteria) this;
        }

        public Criteria andTransferToWarehouseIn(List<Long> values) {
            addCriterion("transfer_to_warehouse in", values, "transferToWarehouse");
            return (Criteria) this;
        }

        public Criteria andTransferToWarehouseNotIn(List<Long> values) {
            addCriterion("transfer_to_warehouse not in", values, "transferToWarehouse");
            return (Criteria) this;
        }

        public Criteria andTransferToWarehouseBetween(Long value1, Long value2) {
            addCriterion("transfer_to_warehouse between", value1, value2, "transferToWarehouse");
            return (Criteria) this;
        }

        public Criteria andTransferToWarehouseNotBetween(Long value1, Long value2) {
            addCriterion("transfer_to_warehouse not between", value1, value2, "transferToWarehouse");
            return (Criteria) this;
        }

        public Criteria andCallOutWarehouseIsNull() {
            addCriterion("call_out_warehouse is null");
            return (Criteria) this;
        }

        public Criteria andCallOutWarehouseIsNotNull() {
            addCriterion("call_out_warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andCallOutWarehouseEqualTo(Long value) {
            addCriterion("call_out_warehouse =", value, "callOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andCallOutWarehouseNotEqualTo(Long value) {
            addCriterion("call_out_warehouse <>", value, "callOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andCallOutWarehouseGreaterThan(Long value) {
            addCriterion("call_out_warehouse >", value, "callOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andCallOutWarehouseGreaterThanOrEqualTo(Long value) {
            addCriterion("call_out_warehouse >=", value, "callOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andCallOutWarehouseLessThan(Long value) {
            addCriterion("call_out_warehouse <", value, "callOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andCallOutWarehouseLessThanOrEqualTo(Long value) {
            addCriterion("call_out_warehouse <=", value, "callOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andCallOutWarehouseIn(List<Long> values) {
            addCriterion("call_out_warehouse in", values, "callOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andCallOutWarehouseNotIn(List<Long> values) {
            addCriterion("call_out_warehouse not in", values, "callOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andCallOutWarehouseBetween(Long value1, Long value2) {
            addCriterion("call_out_warehouse between", value1, value2, "callOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andCallOutWarehouseNotBetween(Long value1, Long value2) {
            addCriterion("call_out_warehouse not between", value1, value2, "callOutWarehouse");
            return (Criteria) this;
        }

        public Criteria andCallOutDateIsNull() {
            addCriterion("call_out_date is null");
            return (Criteria) this;
        }

        public Criteria andCallOutDateIsNotNull() {
            addCriterion("call_out_date is not null");
            return (Criteria) this;
        }

        public Criteria andCallOutDateEqualTo(Date value) {
            addCriterionForJDBCDate("call_out_date =", value, "callOutDate");
            return (Criteria) this;
        }

        public Criteria andCallOutDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("call_out_date <>", value, "callOutDate");
            return (Criteria) this;
        }

        public Criteria andCallOutDateGreaterThan(Date value) {
            addCriterionForJDBCDate("call_out_date >", value, "callOutDate");
            return (Criteria) this;
        }

        public Criteria andCallOutDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("call_out_date >=", value, "callOutDate");
            return (Criteria) this;
        }

        public Criteria andCallOutDateLessThan(Date value) {
            addCriterionForJDBCDate("call_out_date <", value, "callOutDate");
            return (Criteria) this;
        }

        public Criteria andCallOutDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("call_out_date <=", value, "callOutDate");
            return (Criteria) this;
        }

        public Criteria andCallOutDateIn(List<Date> values) {
            addCriterionForJDBCDate("call_out_date in", values, "callOutDate");
            return (Criteria) this;
        }

        public Criteria andCallOutDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("call_out_date not in", values, "callOutDate");
            return (Criteria) this;
        }

        public Criteria andCallOutDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("call_out_date between", value1, value2, "callOutDate");
            return (Criteria) this;
        }

        public Criteria andCallOutDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("call_out_date not between", value1, value2, "callOutDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateIsNull() {
            addCriterion("acceptance_date is null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateIsNotNull() {
            addCriterion("acceptance_date is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateEqualTo(Date value) {
            addCriterionForJDBCDate("acceptance_date =", value, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("acceptance_date <>", value, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateGreaterThan(Date value) {
            addCriterionForJDBCDate("acceptance_date >", value, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("acceptance_date >=", value, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateLessThan(Date value) {
            addCriterionForJDBCDate("acceptance_date <", value, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("acceptance_date <=", value, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateIn(List<Date> values) {
            addCriterionForJDBCDate("acceptance_date in", values, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("acceptance_date not in", values, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("acceptance_date between", value1, value2, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("acceptance_date not between", value1, value2, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andGoodsTransferStateIsNull() {
            addCriterion("goods_transfer_state is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTransferStateIsNotNull() {
            addCriterion("goods_transfer_state is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTransferStateEqualTo(String value) {
            addCriterion("goods_transfer_state =", value, "goodsTransferState");
            return (Criteria) this;
        }

        public Criteria andGoodsTransferStateNotEqualTo(String value) {
            addCriterion("goods_transfer_state <>", value, "goodsTransferState");
            return (Criteria) this;
        }

        public Criteria andGoodsTransferStateGreaterThan(String value) {
            addCriterion("goods_transfer_state >", value, "goodsTransferState");
            return (Criteria) this;
        }

        public Criteria andGoodsTransferStateGreaterThanOrEqualTo(String value) {
            addCriterion("goods_transfer_state >=", value, "goodsTransferState");
            return (Criteria) this;
        }

        public Criteria andGoodsTransferStateLessThan(String value) {
            addCriterion("goods_transfer_state <", value, "goodsTransferState");
            return (Criteria) this;
        }

        public Criteria andGoodsTransferStateLessThanOrEqualTo(String value) {
            addCriterion("goods_transfer_state <=", value, "goodsTransferState");
            return (Criteria) this;
        }

        public Criteria andGoodsTransferStateLike(String value) {
            addCriterion("goods_transfer_state like", value, "goodsTransferState");
            return (Criteria) this;
        }

        public Criteria andGoodsTransferStateNotLike(String value) {
            addCriterion("goods_transfer_state not like", value, "goodsTransferState");
            return (Criteria) this;
        }

        public Criteria andGoodsTransferStateIn(List<String> values) {
            addCriterion("goods_transfer_state in", values, "goodsTransferState");
            return (Criteria) this;
        }

        public Criteria andGoodsTransferStateNotIn(List<String> values) {
            addCriterion("goods_transfer_state not in", values, "goodsTransferState");
            return (Criteria) this;
        }

        public Criteria andGoodsTransferStateBetween(String value1, String value2) {
            addCriterion("goods_transfer_state between", value1, value2, "goodsTransferState");
            return (Criteria) this;
        }

        public Criteria andGoodsTransferStateNotBetween(String value1, String value2) {
            addCriterion("goods_transfer_state not between", value1, value2, "goodsTransferState");
            return (Criteria) this;
        }

        public Criteria andProductTransferRemarksIsNull() {
            addCriterion("product_transfer_remarks is null");
            return (Criteria) this;
        }

        public Criteria andProductTransferRemarksIsNotNull() {
            addCriterion("product_transfer_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andProductTransferRemarksEqualTo(String value) {
            addCriterion("product_transfer_remarks =", value, "productTransferRemarks");
            return (Criteria) this;
        }

        public Criteria andProductTransferRemarksNotEqualTo(String value) {
            addCriterion("product_transfer_remarks <>", value, "productTransferRemarks");
            return (Criteria) this;
        }

        public Criteria andProductTransferRemarksGreaterThan(String value) {
            addCriterion("product_transfer_remarks >", value, "productTransferRemarks");
            return (Criteria) this;
        }

        public Criteria andProductTransferRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("product_transfer_remarks >=", value, "productTransferRemarks");
            return (Criteria) this;
        }

        public Criteria andProductTransferRemarksLessThan(String value) {
            addCriterion("product_transfer_remarks <", value, "productTransferRemarks");
            return (Criteria) this;
        }

        public Criteria andProductTransferRemarksLessThanOrEqualTo(String value) {
            addCriterion("product_transfer_remarks <=", value, "productTransferRemarks");
            return (Criteria) this;
        }

        public Criteria andProductTransferRemarksLike(String value) {
            addCriterion("product_transfer_remarks like", value, "productTransferRemarks");
            return (Criteria) this;
        }

        public Criteria andProductTransferRemarksNotLike(String value) {
            addCriterion("product_transfer_remarks not like", value, "productTransferRemarks");
            return (Criteria) this;
        }

        public Criteria andProductTransferRemarksIn(List<String> values) {
            addCriterion("product_transfer_remarks in", values, "productTransferRemarks");
            return (Criteria) this;
        }

        public Criteria andProductTransferRemarksNotIn(List<String> values) {
            addCriterion("product_transfer_remarks not in", values, "productTransferRemarks");
            return (Criteria) this;
        }

        public Criteria andProductTransferRemarksBetween(String value1, String value2) {
            addCriterion("product_transfer_remarks between", value1, value2, "productTransferRemarks");
            return (Criteria) this;
        }

        public Criteria andProductTransferRemarksNotBetween(String value1, String value2) {
            addCriterion("product_transfer_remarks not between", value1, value2, "productTransferRemarks");
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