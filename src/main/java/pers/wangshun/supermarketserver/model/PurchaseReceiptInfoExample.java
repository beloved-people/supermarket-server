package pers.wangshun.supermarketserver.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PurchaseReceiptInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseReceiptInfoExample() {
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

        public Criteria andPurchaseReceiptNumberIsNull() {
            addCriterion("purchase_receipt_number is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseReceiptNumberIsNotNull() {
            addCriterion("purchase_receipt_number is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseReceiptNumberEqualTo(Long value) {
            addCriterion("purchase_receipt_number =", value, "purchaseReceiptNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseReceiptNumberNotEqualTo(Long value) {
            addCriterion("purchase_receipt_number <>", value, "purchaseReceiptNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseReceiptNumberGreaterThan(Long value) {
            addCriterion("purchase_receipt_number >", value, "purchaseReceiptNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseReceiptNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("purchase_receipt_number >=", value, "purchaseReceiptNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseReceiptNumberLessThan(Long value) {
            addCriterion("purchase_receipt_number <", value, "purchaseReceiptNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseReceiptNumberLessThanOrEqualTo(Long value) {
            addCriterion("purchase_receipt_number <=", value, "purchaseReceiptNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseReceiptNumberIn(List<Long> values) {
            addCriterion("purchase_receipt_number in", values, "purchaseReceiptNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseReceiptNumberNotIn(List<Long> values) {
            addCriterion("purchase_receipt_number not in", values, "purchaseReceiptNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseReceiptNumberBetween(Long value1, Long value2) {
            addCriterion("purchase_receipt_number between", value1, value2, "purchaseReceiptNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseReceiptNumberNotBetween(Long value1, Long value2) {
            addCriterion("purchase_receipt_number not between", value1, value2, "purchaseReceiptNumber");
            return (Criteria) this;
        }

        public Criteria andAssociatedTicketIdIsNull() {
            addCriterion("associated_ticket_id is null");
            return (Criteria) this;
        }

        public Criteria andAssociatedTicketIdIsNotNull() {
            addCriterion("associated_ticket_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssociatedTicketIdEqualTo(Integer value) {
            addCriterion("associated_ticket_id =", value, "associatedTicketId");
            return (Criteria) this;
        }

        public Criteria andAssociatedTicketIdNotEqualTo(Integer value) {
            addCriterion("associated_ticket_id <>", value, "associatedTicketId");
            return (Criteria) this;
        }

        public Criteria andAssociatedTicketIdGreaterThan(Integer value) {
            addCriterion("associated_ticket_id >", value, "associatedTicketId");
            return (Criteria) this;
        }

        public Criteria andAssociatedTicketIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("associated_ticket_id >=", value, "associatedTicketId");
            return (Criteria) this;
        }

        public Criteria andAssociatedTicketIdLessThan(Integer value) {
            addCriterion("associated_ticket_id <", value, "associatedTicketId");
            return (Criteria) this;
        }

        public Criteria andAssociatedTicketIdLessThanOrEqualTo(Integer value) {
            addCriterion("associated_ticket_id <=", value, "associatedTicketId");
            return (Criteria) this;
        }

        public Criteria andAssociatedTicketIdIn(List<Integer> values) {
            addCriterion("associated_ticket_id in", values, "associatedTicketId");
            return (Criteria) this;
        }

        public Criteria andAssociatedTicketIdNotIn(List<Integer> values) {
            addCriterion("associated_ticket_id not in", values, "associatedTicketId");
            return (Criteria) this;
        }

        public Criteria andAssociatedTicketIdBetween(Integer value1, Integer value2) {
            addCriterion("associated_ticket_id between", value1, value2, "associatedTicketId");
            return (Criteria) this;
        }

        public Criteria andAssociatedTicketIdNotBetween(Integer value1, Integer value2) {
            addCriterion("associated_ticket_id not between", value1, value2, "associatedTicketId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountIsNull() {
            addCriterion("purchase_amount is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountIsNotNull() {
            addCriterion("purchase_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountEqualTo(BigDecimal value) {
            addCriterion("purchase_amount =", value, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountNotEqualTo(BigDecimal value) {
            addCriterion("purchase_amount <>", value, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountGreaterThan(BigDecimal value) {
            addCriterion("purchase_amount >", value, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_amount >=", value, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountLessThan(BigDecimal value) {
            addCriterion("purchase_amount <", value, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_amount <=", value, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountIn(List<BigDecimal> values) {
            addCriterion("purchase_amount in", values, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountNotIn(List<BigDecimal> values) {
            addCriterion("purchase_amount not in", values, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_amount between", value1, value2, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_amount not between", value1, value2, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNull() {
            addCriterion("supplier_name is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("supplier_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(Integer value) {
            addCriterion("supplier_name =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(Integer value) {
            addCriterion("supplier_name <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(Integer value) {
            addCriterion("supplier_name >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_name >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(Integer value) {
            addCriterion("supplier_name <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_name <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<Integer> values) {
            addCriterion("supplier_name in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<Integer> values) {
            addCriterion("supplier_name not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(Integer value1, Integer value2) {
            addCriterion("supplier_name between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_name not between", value1, value2, "supplierName");
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

        public Criteria andPurchaseReceiptUsernameIsNull() {
            addCriterion("purchase_receipt_username is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseReceiptUsernameIsNotNull() {
            addCriterion("purchase_receipt_username is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseReceiptUsernameEqualTo(String value) {
            addCriterion("purchase_receipt_username =", value, "purchaseReceiptUsername");
            return (Criteria) this;
        }

        public Criteria andPurchaseReceiptUsernameNotEqualTo(String value) {
            addCriterion("purchase_receipt_username <>", value, "purchaseReceiptUsername");
            return (Criteria) this;
        }

        public Criteria andPurchaseReceiptUsernameGreaterThan(String value) {
            addCriterion("purchase_receipt_username >", value, "purchaseReceiptUsername");
            return (Criteria) this;
        }

        public Criteria andPurchaseReceiptUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_receipt_username >=", value, "purchaseReceiptUsername");
            return (Criteria) this;
        }

        public Criteria andPurchaseReceiptUsernameLessThan(String value) {
            addCriterion("purchase_receipt_username <", value, "purchaseReceiptUsername");
            return (Criteria) this;
        }

        public Criteria andPurchaseReceiptUsernameLessThanOrEqualTo(String value) {
            addCriterion("purchase_receipt_username <=", value, "purchaseReceiptUsername");
            return (Criteria) this;
        }

        public Criteria andPurchaseReceiptUsernameLike(String value) {
            addCriterion("purchase_receipt_username like", value, "purchaseReceiptUsername");
            return (Criteria) this;
        }

        public Criteria andPurchaseReceiptUsernameNotLike(String value) {
            addCriterion("purchase_receipt_username not like", value, "purchaseReceiptUsername");
            return (Criteria) this;
        }

        public Criteria andPurchaseReceiptUsernameIn(List<String> values) {
            addCriterion("purchase_receipt_username in", values, "purchaseReceiptUsername");
            return (Criteria) this;
        }

        public Criteria andPurchaseReceiptUsernameNotIn(List<String> values) {
            addCriterion("purchase_receipt_username not in", values, "purchaseReceiptUsername");
            return (Criteria) this;
        }

        public Criteria andPurchaseReceiptUsernameBetween(String value1, String value2) {
            addCriterion("purchase_receipt_username between", value1, value2, "purchaseReceiptUsername");
            return (Criteria) this;
        }

        public Criteria andPurchaseReceiptUsernameNotBetween(String value1, String value2) {
            addCriterion("purchase_receipt_username not between", value1, value2, "purchaseReceiptUsername");
            return (Criteria) this;
        }

        public Criteria andCashManagerNameIsNull() {
            addCriterion("cash_manager_name is null");
            return (Criteria) this;
        }

        public Criteria andCashManagerNameIsNotNull() {
            addCriterion("cash_manager_name is not null");
            return (Criteria) this;
        }

        public Criteria andCashManagerNameEqualTo(Long value) {
            addCriterion("cash_manager_name =", value, "cashManagerName");
            return (Criteria) this;
        }

        public Criteria andCashManagerNameNotEqualTo(Long value) {
            addCriterion("cash_manager_name <>", value, "cashManagerName");
            return (Criteria) this;
        }

        public Criteria andCashManagerNameGreaterThan(Long value) {
            addCriterion("cash_manager_name >", value, "cashManagerName");
            return (Criteria) this;
        }

        public Criteria andCashManagerNameGreaterThanOrEqualTo(Long value) {
            addCriterion("cash_manager_name >=", value, "cashManagerName");
            return (Criteria) this;
        }

        public Criteria andCashManagerNameLessThan(Long value) {
            addCriterion("cash_manager_name <", value, "cashManagerName");
            return (Criteria) this;
        }

        public Criteria andCashManagerNameLessThanOrEqualTo(Long value) {
            addCriterion("cash_manager_name <=", value, "cashManagerName");
            return (Criteria) this;
        }

        public Criteria andCashManagerNameIn(List<Long> values) {
            addCriterion("cash_manager_name in", values, "cashManagerName");
            return (Criteria) this;
        }

        public Criteria andCashManagerNameNotIn(List<Long> values) {
            addCriterion("cash_manager_name not in", values, "cashManagerName");
            return (Criteria) this;
        }

        public Criteria andCashManagerNameBetween(Long value1, Long value2) {
            addCriterion("cash_manager_name between", value1, value2, "cashManagerName");
            return (Criteria) this;
        }

        public Criteria andCashManagerNameNotBetween(Long value1, Long value2) {
            addCriterion("cash_manager_name not between", value1, value2, "cashManagerName");
            return (Criteria) this;
        }

        public Criteria andPurchaseBillingDateIsNull() {
            addCriterion("purchase_billing_date is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseBillingDateIsNotNull() {
            addCriterion("purchase_billing_date is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseBillingDateEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_billing_date =", value, "purchaseBillingDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseBillingDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_billing_date <>", value, "purchaseBillingDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseBillingDateGreaterThan(Date value) {
            addCriterionForJDBCDate("purchase_billing_date >", value, "purchaseBillingDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseBillingDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_billing_date >=", value, "purchaseBillingDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseBillingDateLessThan(Date value) {
            addCriterionForJDBCDate("purchase_billing_date <", value, "purchaseBillingDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseBillingDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_billing_date <=", value, "purchaseBillingDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseBillingDateIn(List<Date> values) {
            addCriterionForJDBCDate("purchase_billing_date in", values, "purchaseBillingDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseBillingDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("purchase_billing_date not in", values, "purchaseBillingDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseBillingDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("purchase_billing_date between", value1, value2, "purchaseBillingDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseBillingDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("purchase_billing_date not between", value1, value2, "purchaseBillingDate");
            return (Criteria) this;
        }

        public Criteria andPurchasePaymentDateIsNull() {
            addCriterion("purchase_payment_date is null");
            return (Criteria) this;
        }

        public Criteria andPurchasePaymentDateIsNotNull() {
            addCriterion("purchase_payment_date is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasePaymentDateEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_payment_date =", value, "purchasePaymentDate");
            return (Criteria) this;
        }

        public Criteria andPurchasePaymentDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_payment_date <>", value, "purchasePaymentDate");
            return (Criteria) this;
        }

        public Criteria andPurchasePaymentDateGreaterThan(Date value) {
            addCriterionForJDBCDate("purchase_payment_date >", value, "purchasePaymentDate");
            return (Criteria) this;
        }

        public Criteria andPurchasePaymentDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_payment_date >=", value, "purchasePaymentDate");
            return (Criteria) this;
        }

        public Criteria andPurchasePaymentDateLessThan(Date value) {
            addCriterionForJDBCDate("purchase_payment_date <", value, "purchasePaymentDate");
            return (Criteria) this;
        }

        public Criteria andPurchasePaymentDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("purchase_payment_date <=", value, "purchasePaymentDate");
            return (Criteria) this;
        }

        public Criteria andPurchasePaymentDateIn(List<Date> values) {
            addCriterionForJDBCDate("purchase_payment_date in", values, "purchasePaymentDate");
            return (Criteria) this;
        }

        public Criteria andPurchasePaymentDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("purchase_payment_date not in", values, "purchasePaymentDate");
            return (Criteria) this;
        }

        public Criteria andPurchasePaymentDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("purchase_payment_date between", value1, value2, "purchasePaymentDate");
            return (Criteria) this;
        }

        public Criteria andPurchasePaymentDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("purchase_payment_date not between", value1, value2, "purchasePaymentDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseFinishedConditionIsNull() {
            addCriterion("purchase_finished_condition is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseFinishedConditionIsNotNull() {
            addCriterion("purchase_finished_condition is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseFinishedConditionEqualTo(String value) {
            addCriterion("purchase_finished_condition =", value, "purchaseFinishedCondition");
            return (Criteria) this;
        }

        public Criteria andPurchaseFinishedConditionNotEqualTo(String value) {
            addCriterion("purchase_finished_condition <>", value, "purchaseFinishedCondition");
            return (Criteria) this;
        }

        public Criteria andPurchaseFinishedConditionGreaterThan(String value) {
            addCriterion("purchase_finished_condition >", value, "purchaseFinishedCondition");
            return (Criteria) this;
        }

        public Criteria andPurchaseFinishedConditionGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_finished_condition >=", value, "purchaseFinishedCondition");
            return (Criteria) this;
        }

        public Criteria andPurchaseFinishedConditionLessThan(String value) {
            addCriterion("purchase_finished_condition <", value, "purchaseFinishedCondition");
            return (Criteria) this;
        }

        public Criteria andPurchaseFinishedConditionLessThanOrEqualTo(String value) {
            addCriterion("purchase_finished_condition <=", value, "purchaseFinishedCondition");
            return (Criteria) this;
        }

        public Criteria andPurchaseFinishedConditionLike(String value) {
            addCriterion("purchase_finished_condition like", value, "purchaseFinishedCondition");
            return (Criteria) this;
        }

        public Criteria andPurchaseFinishedConditionNotLike(String value) {
            addCriterion("purchase_finished_condition not like", value, "purchaseFinishedCondition");
            return (Criteria) this;
        }

        public Criteria andPurchaseFinishedConditionIn(List<String> values) {
            addCriterion("purchase_finished_condition in", values, "purchaseFinishedCondition");
            return (Criteria) this;
        }

        public Criteria andPurchaseFinishedConditionNotIn(List<String> values) {
            addCriterion("purchase_finished_condition not in", values, "purchaseFinishedCondition");
            return (Criteria) this;
        }

        public Criteria andPurchaseFinishedConditionBetween(String value1, String value2) {
            addCriterion("purchase_finished_condition between", value1, value2, "purchaseFinishedCondition");
            return (Criteria) this;
        }

        public Criteria andPurchaseFinishedConditionNotBetween(String value1, String value2) {
            addCriterion("purchase_finished_condition not between", value1, value2, "purchaseFinishedCondition");
            return (Criteria) this;
        }

        public Criteria andPurchaseRemarksIsNull() {
            addCriterion("purchase_remarks is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseRemarksIsNotNull() {
            addCriterion("purchase_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseRemarksEqualTo(String value) {
            addCriterion("purchase_remarks =", value, "purchaseRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseRemarksNotEqualTo(String value) {
            addCriterion("purchase_remarks <>", value, "purchaseRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseRemarksGreaterThan(String value) {
            addCriterion("purchase_remarks >", value, "purchaseRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_remarks >=", value, "purchaseRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseRemarksLessThan(String value) {
            addCriterion("purchase_remarks <", value, "purchaseRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseRemarksLessThanOrEqualTo(String value) {
            addCriterion("purchase_remarks <=", value, "purchaseRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseRemarksLike(String value) {
            addCriterion("purchase_remarks like", value, "purchaseRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseRemarksNotLike(String value) {
            addCriterion("purchase_remarks not like", value, "purchaseRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseRemarksIn(List<String> values) {
            addCriterion("purchase_remarks in", values, "purchaseRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseRemarksNotIn(List<String> values) {
            addCriterion("purchase_remarks not in", values, "purchaseRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseRemarksBetween(String value1, String value2) {
            addCriterion("purchase_remarks between", value1, value2, "purchaseRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseRemarksNotBetween(String value1, String value2) {
            addCriterion("purchase_remarks not between", value1, value2, "purchaseRemarks");
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