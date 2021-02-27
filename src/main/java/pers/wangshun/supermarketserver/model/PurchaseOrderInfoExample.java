package pers.wangshun.supermarketserver.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PurchaseOrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseOrderInfoExample() {
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

        public Criteria andPurchaseOrderNumberIsNull() {
            addCriterion("purchase_order_number is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNumberIsNotNull() {
            addCriterion("purchase_order_number is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNumberEqualTo(Long value) {
            addCriterion("purchase_order_number =", value, "purchaseOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNumberNotEqualTo(Long value) {
            addCriterion("purchase_order_number <>", value, "purchaseOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNumberGreaterThan(Long value) {
            addCriterion("purchase_order_number >", value, "purchaseOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("purchase_order_number >=", value, "purchaseOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNumberLessThan(Long value) {
            addCriterion("purchase_order_number <", value, "purchaseOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNumberLessThanOrEqualTo(Long value) {
            addCriterion("purchase_order_number <=", value, "purchaseOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNumberIn(List<Long> values) {
            addCriterion("purchase_order_number in", values, "purchaseOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNumberNotIn(List<Long> values) {
            addCriterion("purchase_order_number not in", values, "purchaseOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNumberBetween(Long value1, Long value2) {
            addCriterion("purchase_order_number between", value1, value2, "purchaseOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNumberNotBetween(Long value1, Long value2) {
            addCriterion("purchase_order_number not between", value1, value2, "purchaseOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderSupplierIsNull() {
            addCriterion("purchase_order_supplier is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderSupplierIsNotNull() {
            addCriterion("purchase_order_supplier is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderSupplierEqualTo(Integer value) {
            addCriterion("purchase_order_supplier =", value, "purchaseOrderSupplier");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderSupplierNotEqualTo(Integer value) {
            addCriterion("purchase_order_supplier <>", value, "purchaseOrderSupplier");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderSupplierGreaterThan(Integer value) {
            addCriterion("purchase_order_supplier >", value, "purchaseOrderSupplier");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderSupplierGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase_order_supplier >=", value, "purchaseOrderSupplier");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderSupplierLessThan(Integer value) {
            addCriterion("purchase_order_supplier <", value, "purchaseOrderSupplier");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderSupplierLessThanOrEqualTo(Integer value) {
            addCriterion("purchase_order_supplier <=", value, "purchaseOrderSupplier");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderSupplierIn(List<Integer> values) {
            addCriterion("purchase_order_supplier in", values, "purchaseOrderSupplier");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderSupplierNotIn(List<Integer> values) {
            addCriterion("purchase_order_supplier not in", values, "purchaseOrderSupplier");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderSupplierBetween(Integer value1, Integer value2) {
            addCriterion("purchase_order_supplier between", value1, value2, "purchaseOrderSupplier");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderSupplierNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase_order_supplier not between", value1, value2, "purchaseOrderSupplier");
            return (Criteria) this;
        }

        public Criteria andPurchaserIsNull() {
            addCriterion("purchaser is null");
            return (Criteria) this;
        }

        public Criteria andPurchaserIsNotNull() {
            addCriterion("purchaser is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaserEqualTo(Long value) {
            addCriterion("purchaser =", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserNotEqualTo(Long value) {
            addCriterion("purchaser <>", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserGreaterThan(Long value) {
            addCriterion("purchaser >", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserGreaterThanOrEqualTo(Long value) {
            addCriterion("purchaser >=", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserLessThan(Long value) {
            addCriterion("purchaser <", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserLessThanOrEqualTo(Long value) {
            addCriterion("purchaser <=", value, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserIn(List<Long> values) {
            addCriterion("purchaser in", values, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserNotIn(List<Long> values) {
            addCriterion("purchaser not in", values, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserBetween(Long value1, Long value2) {
            addCriterion("purchaser between", value1, value2, "purchaser");
            return (Criteria) this;
        }

        public Criteria andPurchaserNotBetween(Long value1, Long value2) {
            addCriterion("purchaser not between", value1, value2, "purchaser");
            return (Criteria) this;
        }

        public Criteria andOrdererIsNull() {
            addCriterion("orderer is null");
            return (Criteria) this;
        }

        public Criteria andOrdererIsNotNull() {
            addCriterion("orderer is not null");
            return (Criteria) this;
        }

        public Criteria andOrdererEqualTo(Long value) {
            addCriterion("orderer =", value, "orderer");
            return (Criteria) this;
        }

        public Criteria andOrdererNotEqualTo(Long value) {
            addCriterion("orderer <>", value, "orderer");
            return (Criteria) this;
        }

        public Criteria andOrdererGreaterThan(Long value) {
            addCriterion("orderer >", value, "orderer");
            return (Criteria) this;
        }

        public Criteria andOrdererGreaterThanOrEqualTo(Long value) {
            addCriterion("orderer >=", value, "orderer");
            return (Criteria) this;
        }

        public Criteria andOrdererLessThan(Long value) {
            addCriterion("orderer <", value, "orderer");
            return (Criteria) this;
        }

        public Criteria andOrdererLessThanOrEqualTo(Long value) {
            addCriterion("orderer <=", value, "orderer");
            return (Criteria) this;
        }

        public Criteria andOrdererIn(List<Long> values) {
            addCriterion("orderer in", values, "orderer");
            return (Criteria) this;
        }

        public Criteria andOrdererNotIn(List<Long> values) {
            addCriterion("orderer not in", values, "orderer");
            return (Criteria) this;
        }

        public Criteria andOrdererBetween(Long value1, Long value2) {
            addCriterion("orderer between", value1, value2, "orderer");
            return (Criteria) this;
        }

        public Criteria andOrdererNotBetween(Long value1, Long value2) {
            addCriterion("orderer not between", value1, value2, "orderer");
            return (Criteria) this;
        }

        public Criteria andAcceptorIsNull() {
            addCriterion("acceptor is null");
            return (Criteria) this;
        }

        public Criteria andAcceptorIsNotNull() {
            addCriterion("acceptor is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptorEqualTo(Long value) {
            addCriterion("acceptor =", value, "acceptor");
            return (Criteria) this;
        }

        public Criteria andAcceptorNotEqualTo(Long value) {
            addCriterion("acceptor <>", value, "acceptor");
            return (Criteria) this;
        }

        public Criteria andAcceptorGreaterThan(Long value) {
            addCriterion("acceptor >", value, "acceptor");
            return (Criteria) this;
        }

        public Criteria andAcceptorGreaterThanOrEqualTo(Long value) {
            addCriterion("acceptor >=", value, "acceptor");
            return (Criteria) this;
        }

        public Criteria andAcceptorLessThan(Long value) {
            addCriterion("acceptor <", value, "acceptor");
            return (Criteria) this;
        }

        public Criteria andAcceptorLessThanOrEqualTo(Long value) {
            addCriterion("acceptor <=", value, "acceptor");
            return (Criteria) this;
        }

        public Criteria andAcceptorIn(List<Long> values) {
            addCriterion("acceptor in", values, "acceptor");
            return (Criteria) this;
        }

        public Criteria andAcceptorNotIn(List<Long> values) {
            addCriterion("acceptor not in", values, "acceptor");
            return (Criteria) this;
        }

        public Criteria andAcceptorBetween(Long value1, Long value2) {
            addCriterion("acceptor between", value1, value2, "acceptor");
            return (Criteria) this;
        }

        public Criteria andAcceptorNotBetween(Long value1, Long value2) {
            addCriterion("acceptor not between", value1, value2, "acceptor");
            return (Criteria) this;
        }

        public Criteria andCashManagerIsNull() {
            addCriterion("cash_manager is null");
            return (Criteria) this;
        }

        public Criteria andCashManagerIsNotNull() {
            addCriterion("cash_manager is not null");
            return (Criteria) this;
        }

        public Criteria andCashManagerEqualTo(Long value) {
            addCriterion("cash_manager =", value, "cashManager");
            return (Criteria) this;
        }

        public Criteria andCashManagerNotEqualTo(Long value) {
            addCriterion("cash_manager <>", value, "cashManager");
            return (Criteria) this;
        }

        public Criteria andCashManagerGreaterThan(Long value) {
            addCriterion("cash_manager >", value, "cashManager");
            return (Criteria) this;
        }

        public Criteria andCashManagerGreaterThanOrEqualTo(Long value) {
            addCriterion("cash_manager >=", value, "cashManager");
            return (Criteria) this;
        }

        public Criteria andCashManagerLessThan(Long value) {
            addCriterion("cash_manager <", value, "cashManager");
            return (Criteria) this;
        }

        public Criteria andCashManagerLessThanOrEqualTo(Long value) {
            addCriterion("cash_manager <=", value, "cashManager");
            return (Criteria) this;
        }

        public Criteria andCashManagerIn(List<Long> values) {
            addCriterion("cash_manager in", values, "cashManager");
            return (Criteria) this;
        }

        public Criteria andCashManagerNotIn(List<Long> values) {
            addCriterion("cash_manager not in", values, "cashManager");
            return (Criteria) this;
        }

        public Criteria andCashManagerBetween(Long value1, Long value2) {
            addCriterion("cash_manager between", value1, value2, "cashManager");
            return (Criteria) this;
        }

        public Criteria andCashManagerNotBetween(Long value1, Long value2) {
            addCriterion("cash_manager not between", value1, value2, "cashManager");
            return (Criteria) this;
        }

        public Criteria andShippingAddressIsNull() {
            addCriterion("shipping_address is null");
            return (Criteria) this;
        }

        public Criteria andShippingAddressIsNotNull() {
            addCriterion("shipping_address is not null");
            return (Criteria) this;
        }

        public Criteria andShippingAddressEqualTo(String value) {
            addCriterion("shipping_address =", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotEqualTo(String value) {
            addCriterion("shipping_address <>", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressGreaterThan(String value) {
            addCriterion("shipping_address >", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_address >=", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressLessThan(String value) {
            addCriterion("shipping_address <", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressLessThanOrEqualTo(String value) {
            addCriterion("shipping_address <=", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressLike(String value) {
            addCriterion("shipping_address like", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotLike(String value) {
            addCriterion("shipping_address not like", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressIn(List<String> values) {
            addCriterion("shipping_address in", values, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotIn(List<String> values) {
            addCriterion("shipping_address not in", values, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressBetween(String value1, String value2) {
            addCriterion("shipping_address between", value1, value2, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotBetween(String value1, String value2) {
            addCriterion("shipping_address not between", value1, value2, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andWarehouseIsNull() {
            addCriterion("warehouse is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIsNotNull() {
            addCriterion("warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseEqualTo(Long value) {
            addCriterion("warehouse =", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotEqualTo(Long value) {
            addCriterion("warehouse <>", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseGreaterThan(Long value) {
            addCriterion("warehouse >", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseGreaterThanOrEqualTo(Long value) {
            addCriterion("warehouse >=", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseLessThan(Long value) {
            addCriterion("warehouse <", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseLessThanOrEqualTo(Long value) {
            addCriterion("warehouse <=", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseIn(List<Long> values) {
            addCriterion("warehouse in", values, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotIn(List<Long> values) {
            addCriterion("warehouse not in", values, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseBetween(Long value1, Long value2) {
            addCriterion("warehouse between", value1, value2, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotBetween(Long value1, Long value2) {
            addCriterion("warehouse not between", value1, value2, "warehouse");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderDateIsNull() {
            addCriterion("purchase_order_date is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderDateIsNotNull() {
            addCriterion("purchase_order_date is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderDateEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_order_date =", value, "purchaseOrderDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_order_date <>", value, "purchaseOrderDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderDateGreaterThan(Date value) {
            addCriterionForJDBCDate("purchase_order_date >", value, "purchaseOrderDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_order_date >=", value, "purchaseOrderDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderDateLessThan(Date value) {
            addCriterionForJDBCDate("purchase_order_date <", value, "purchaseOrderDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_order_date <=", value, "purchaseOrderDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderDateIn(List<Date> values) {
            addCriterionForJDBCDate("purchase_order_date in", values, "purchaseOrderDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("purchase_order_date not in", values, "purchaseOrderDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("purchase_order_date between", value1, value2, "purchaseOrderDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("purchase_order_date not between", value1, value2, "purchaseOrderDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderArrivalDateIsNull() {
            addCriterion("purchase_order_arrival_date is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderArrivalDateIsNotNull() {
            addCriterion("purchase_order_arrival_date is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderArrivalDateEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_order_arrival_date =", value, "purchaseOrderArrivalDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderArrivalDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_order_arrival_date <>", value, "purchaseOrderArrivalDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderArrivalDateGreaterThan(Date value) {
            addCriterionForJDBCDate("purchase_order_arrival_date >", value, "purchaseOrderArrivalDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderArrivalDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_order_arrival_date >=", value, "purchaseOrderArrivalDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderArrivalDateLessThan(Date value) {
            addCriterionForJDBCDate("purchase_order_arrival_date <", value, "purchaseOrderArrivalDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderArrivalDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_order_arrival_date <=", value, "purchaseOrderArrivalDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderArrivalDateIn(List<Date> values) {
            addCriterionForJDBCDate("purchase_order_arrival_date in", values, "purchaseOrderArrivalDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderArrivalDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("purchase_order_arrival_date not in", values, "purchaseOrderArrivalDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderArrivalDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("purchase_order_arrival_date between", value1, value2, "purchaseOrderArrivalDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderArrivalDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("purchase_order_arrival_date not between", value1, value2, "purchaseOrderArrivalDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderFinishedConditionIsNull() {
            addCriterion("purchase_order_finished_condition is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderFinishedConditionIsNotNull() {
            addCriterion("purchase_order_finished_condition is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderFinishedConditionEqualTo(String value) {
            addCriterion("purchase_order_finished_condition =", value, "purchaseOrderFinishedCondition");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderFinishedConditionNotEqualTo(String value) {
            addCriterion("purchase_order_finished_condition <>", value, "purchaseOrderFinishedCondition");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderFinishedConditionGreaterThan(String value) {
            addCriterion("purchase_order_finished_condition >", value, "purchaseOrderFinishedCondition");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderFinishedConditionGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_order_finished_condition >=", value, "purchaseOrderFinishedCondition");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderFinishedConditionLessThan(String value) {
            addCriterion("purchase_order_finished_condition <", value, "purchaseOrderFinishedCondition");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderFinishedConditionLessThanOrEqualTo(String value) {
            addCriterion("purchase_order_finished_condition <=", value, "purchaseOrderFinishedCondition");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderFinishedConditionLike(String value) {
            addCriterion("purchase_order_finished_condition like", value, "purchaseOrderFinishedCondition");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderFinishedConditionNotLike(String value) {
            addCriterion("purchase_order_finished_condition not like", value, "purchaseOrderFinishedCondition");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderFinishedConditionIn(List<String> values) {
            addCriterion("purchase_order_finished_condition in", values, "purchaseOrderFinishedCondition");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderFinishedConditionNotIn(List<String> values) {
            addCriterion("purchase_order_finished_condition not in", values, "purchaseOrderFinishedCondition");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderFinishedConditionBetween(String value1, String value2) {
            addCriterion("purchase_order_finished_condition between", value1, value2, "purchaseOrderFinishedCondition");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderFinishedConditionNotBetween(String value1, String value2) {
            addCriterion("purchase_order_finished_condition not between", value1, value2, "purchaseOrderFinishedCondition");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderRemarksIsNull() {
            addCriterion("purchase_order_remarks is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderRemarksIsNotNull() {
            addCriterion("purchase_order_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderRemarksEqualTo(String value) {
            addCriterion("purchase_order_remarks =", value, "purchaseOrderRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderRemarksNotEqualTo(String value) {
            addCriterion("purchase_order_remarks <>", value, "purchaseOrderRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderRemarksGreaterThan(String value) {
            addCriterion("purchase_order_remarks >", value, "purchaseOrderRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_order_remarks >=", value, "purchaseOrderRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderRemarksLessThan(String value) {
            addCriterion("purchase_order_remarks <", value, "purchaseOrderRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderRemarksLessThanOrEqualTo(String value) {
            addCriterion("purchase_order_remarks <=", value, "purchaseOrderRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderRemarksLike(String value) {
            addCriterion("purchase_order_remarks like", value, "purchaseOrderRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderRemarksNotLike(String value) {
            addCriterion("purchase_order_remarks not like", value, "purchaseOrderRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderRemarksIn(List<String> values) {
            addCriterion("purchase_order_remarks in", values, "purchaseOrderRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderRemarksNotIn(List<String> values) {
            addCriterion("purchase_order_remarks not in", values, "purchaseOrderRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderRemarksBetween(String value1, String value2) {
            addCriterion("purchase_order_remarks between", value1, value2, "purchaseOrderRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderRemarksNotBetween(String value1, String value2) {
            addCriterion("purchase_order_remarks not between", value1, value2, "purchaseOrderRemarks");
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