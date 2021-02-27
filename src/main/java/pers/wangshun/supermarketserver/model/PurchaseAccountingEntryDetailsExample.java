package pers.wangshun.supermarketserver.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PurchaseAccountingEntryDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseAccountingEntryDetailsExample() {
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

        public Criteria andPurchaseAccountingEntryDetailsIdIsNull() {
            addCriterion("purchase_accounting_entry_details_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryDetailsIdIsNotNull() {
            addCriterion("purchase_accounting_entry_details_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryDetailsIdEqualTo(Long value) {
            addCriterion("purchase_accounting_entry_details_id =", value, "purchaseAccountingEntryDetailsId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryDetailsIdNotEqualTo(Long value) {
            addCriterion("purchase_accounting_entry_details_id <>", value, "purchaseAccountingEntryDetailsId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryDetailsIdGreaterThan(Long value) {
            addCriterion("purchase_accounting_entry_details_id >", value, "purchaseAccountingEntryDetailsId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryDetailsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("purchase_accounting_entry_details_id >=", value, "purchaseAccountingEntryDetailsId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryDetailsIdLessThan(Long value) {
            addCriterion("purchase_accounting_entry_details_id <", value, "purchaseAccountingEntryDetailsId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryDetailsIdLessThanOrEqualTo(Long value) {
            addCriterion("purchase_accounting_entry_details_id <=", value, "purchaseAccountingEntryDetailsId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryDetailsIdIn(List<Long> values) {
            addCriterion("purchase_accounting_entry_details_id in", values, "purchaseAccountingEntryDetailsId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryDetailsIdNotIn(List<Long> values) {
            addCriterion("purchase_accounting_entry_details_id not in", values, "purchaseAccountingEntryDetailsId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryDetailsIdBetween(Long value1, Long value2) {
            addCriterion("purchase_accounting_entry_details_id between", value1, value2, "purchaseAccountingEntryDetailsId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryDetailsIdNotBetween(Long value1, Long value2) {
            addCriterion("purchase_accounting_entry_details_id not between", value1, value2, "purchaseAccountingEntryDetailsId");
            return (Criteria) this;
        }

        public Criteria andLendingSignIsNull() {
            addCriterion("lending_sign is null");
            return (Criteria) this;
        }

        public Criteria andLendingSignIsNotNull() {
            addCriterion("lending_sign is not null");
            return (Criteria) this;
        }

        public Criteria andLendingSignEqualTo(String value) {
            addCriterion("lending_sign =", value, "lendingSign");
            return (Criteria) this;
        }

        public Criteria andLendingSignNotEqualTo(String value) {
            addCriterion("lending_sign <>", value, "lendingSign");
            return (Criteria) this;
        }

        public Criteria andLendingSignGreaterThan(String value) {
            addCriterion("lending_sign >", value, "lendingSign");
            return (Criteria) this;
        }

        public Criteria andLendingSignGreaterThanOrEqualTo(String value) {
            addCriterion("lending_sign >=", value, "lendingSign");
            return (Criteria) this;
        }

        public Criteria andLendingSignLessThan(String value) {
            addCriterion("lending_sign <", value, "lendingSign");
            return (Criteria) this;
        }

        public Criteria andLendingSignLessThanOrEqualTo(String value) {
            addCriterion("lending_sign <=", value, "lendingSign");
            return (Criteria) this;
        }

        public Criteria andLendingSignLike(String value) {
            addCriterion("lending_sign like", value, "lendingSign");
            return (Criteria) this;
        }

        public Criteria andLendingSignNotLike(String value) {
            addCriterion("lending_sign not like", value, "lendingSign");
            return (Criteria) this;
        }

        public Criteria andLendingSignIn(List<String> values) {
            addCriterion("lending_sign in", values, "lendingSign");
            return (Criteria) this;
        }

        public Criteria andLendingSignNotIn(List<String> values) {
            addCriterion("lending_sign not in", values, "lendingSign");
            return (Criteria) this;
        }

        public Criteria andLendingSignBetween(String value1, String value2) {
            addCriterion("lending_sign between", value1, value2, "lendingSign");
            return (Criteria) this;
        }

        public Criteria andLendingSignNotBetween(String value1, String value2) {
            addCriterion("lending_sign not between", value1, value2, "lendingSign");
            return (Criteria) this;
        }

        public Criteria andAccountingSubjectsIsNull() {
            addCriterion("accounting_subjects is null");
            return (Criteria) this;
        }

        public Criteria andAccountingSubjectsIsNotNull() {
            addCriterion("accounting_subjects is not null");
            return (Criteria) this;
        }

        public Criteria andAccountingSubjectsEqualTo(String value) {
            addCriterion("accounting_subjects =", value, "accountingSubjects");
            return (Criteria) this;
        }

        public Criteria andAccountingSubjectsNotEqualTo(String value) {
            addCriterion("accounting_subjects <>", value, "accountingSubjects");
            return (Criteria) this;
        }

        public Criteria andAccountingSubjectsGreaterThan(String value) {
            addCriterion("accounting_subjects >", value, "accountingSubjects");
            return (Criteria) this;
        }

        public Criteria andAccountingSubjectsGreaterThanOrEqualTo(String value) {
            addCriterion("accounting_subjects >=", value, "accountingSubjects");
            return (Criteria) this;
        }

        public Criteria andAccountingSubjectsLessThan(String value) {
            addCriterion("accounting_subjects <", value, "accountingSubjects");
            return (Criteria) this;
        }

        public Criteria andAccountingSubjectsLessThanOrEqualTo(String value) {
            addCriterion("accounting_subjects <=", value, "accountingSubjects");
            return (Criteria) this;
        }

        public Criteria andAccountingSubjectsLike(String value) {
            addCriterion("accounting_subjects like", value, "accountingSubjects");
            return (Criteria) this;
        }

        public Criteria andAccountingSubjectsNotLike(String value) {
            addCriterion("accounting_subjects not like", value, "accountingSubjects");
            return (Criteria) this;
        }

        public Criteria andAccountingSubjectsIn(List<String> values) {
            addCriterion("accounting_subjects in", values, "accountingSubjects");
            return (Criteria) this;
        }

        public Criteria andAccountingSubjectsNotIn(List<String> values) {
            addCriterion("accounting_subjects not in", values, "accountingSubjects");
            return (Criteria) this;
        }

        public Criteria andAccountingSubjectsBetween(String value1, String value2) {
            addCriterion("accounting_subjects between", value1, value2, "accountingSubjects");
            return (Criteria) this;
        }

        public Criteria andAccountingSubjectsNotBetween(String value1, String value2) {
            addCriterion("accounting_subjects not between", value1, value2, "accountingSubjects");
            return (Criteria) this;
        }

        public Criteria andIncurredAmountIsNull() {
            addCriterion("incurred_amount is null");
            return (Criteria) this;
        }

        public Criteria andIncurredAmountIsNotNull() {
            addCriterion("incurred_amount is not null");
            return (Criteria) this;
        }

        public Criteria andIncurredAmountEqualTo(BigDecimal value) {
            addCriterion("incurred_amount =", value, "incurredAmount");
            return (Criteria) this;
        }

        public Criteria andIncurredAmountNotEqualTo(BigDecimal value) {
            addCriterion("incurred_amount <>", value, "incurredAmount");
            return (Criteria) this;
        }

        public Criteria andIncurredAmountGreaterThan(BigDecimal value) {
            addCriterion("incurred_amount >", value, "incurredAmount");
            return (Criteria) this;
        }

        public Criteria andIncurredAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("incurred_amount >=", value, "incurredAmount");
            return (Criteria) this;
        }

        public Criteria andIncurredAmountLessThan(BigDecimal value) {
            addCriterion("incurred_amount <", value, "incurredAmount");
            return (Criteria) this;
        }

        public Criteria andIncurredAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("incurred_amount <=", value, "incurredAmount");
            return (Criteria) this;
        }

        public Criteria andIncurredAmountIn(List<BigDecimal> values) {
            addCriterion("incurred_amount in", values, "incurredAmount");
            return (Criteria) this;
        }

        public Criteria andIncurredAmountNotIn(List<BigDecimal> values) {
            addCriterion("incurred_amount not in", values, "incurredAmount");
            return (Criteria) this;
        }

        public Criteria andIncurredAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("incurred_amount between", value1, value2, "incurredAmount");
            return (Criteria) this;
        }

        public Criteria andIncurredAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("incurred_amount not between", value1, value2, "incurredAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowingBalanceIsNull() {
            addCriterion("borrowing_balance is null");
            return (Criteria) this;
        }

        public Criteria andBorrowingBalanceIsNotNull() {
            addCriterion("borrowing_balance is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowingBalanceEqualTo(BigDecimal value) {
            addCriterion("borrowing_balance =", value, "borrowingBalance");
            return (Criteria) this;
        }

        public Criteria andBorrowingBalanceNotEqualTo(BigDecimal value) {
            addCriterion("borrowing_balance <>", value, "borrowingBalance");
            return (Criteria) this;
        }

        public Criteria andBorrowingBalanceGreaterThan(BigDecimal value) {
            addCriterion("borrowing_balance >", value, "borrowingBalance");
            return (Criteria) this;
        }

        public Criteria andBorrowingBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("borrowing_balance >=", value, "borrowingBalance");
            return (Criteria) this;
        }

        public Criteria andBorrowingBalanceLessThan(BigDecimal value) {
            addCriterion("borrowing_balance <", value, "borrowingBalance");
            return (Criteria) this;
        }

        public Criteria andBorrowingBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("borrowing_balance <=", value, "borrowingBalance");
            return (Criteria) this;
        }

        public Criteria andBorrowingBalanceIn(List<BigDecimal> values) {
            addCriterion("borrowing_balance in", values, "borrowingBalance");
            return (Criteria) this;
        }

        public Criteria andBorrowingBalanceNotIn(List<BigDecimal> values) {
            addCriterion("borrowing_balance not in", values, "borrowingBalance");
            return (Criteria) this;
        }

        public Criteria andBorrowingBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrowing_balance between", value1, value2, "borrowingBalance");
            return (Criteria) this;
        }

        public Criteria andBorrowingBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrowing_balance not between", value1, value2, "borrowingBalance");
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