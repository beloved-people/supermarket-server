package pers.wangshun.supermarketserver.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PurchaseAccountingEntryInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseAccountingEntryInfoExample() {
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

        public Criteria andPurchaseAccountingEntryIdIsNull() {
            addCriterion("purchase_accounting_entry_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryIdIsNotNull() {
            addCriterion("purchase_accounting_entry_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryIdEqualTo(Long value) {
            addCriterion("purchase_accounting_entry_id =", value, "purchaseAccountingEntryId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryIdNotEqualTo(Long value) {
            addCriterion("purchase_accounting_entry_id <>", value, "purchaseAccountingEntryId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryIdGreaterThan(Long value) {
            addCriterion("purchase_accounting_entry_id >", value, "purchaseAccountingEntryId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("purchase_accounting_entry_id >=", value, "purchaseAccountingEntryId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryIdLessThan(Long value) {
            addCriterion("purchase_accounting_entry_id <", value, "purchaseAccountingEntryId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryIdLessThanOrEqualTo(Long value) {
            addCriterion("purchase_accounting_entry_id <=", value, "purchaseAccountingEntryId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryIdIn(List<Long> values) {
            addCriterion("purchase_accounting_entry_id in", values, "purchaseAccountingEntryId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryIdNotIn(List<Long> values) {
            addCriterion("purchase_accounting_entry_id not in", values, "purchaseAccountingEntryId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryIdBetween(Long value1, Long value2) {
            addCriterion("purchase_accounting_entry_id between", value1, value2, "purchaseAccountingEntryId");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryIdNotBetween(Long value1, Long value2) {
            addCriterion("purchase_accounting_entry_id not between", value1, value2, "purchaseAccountingEntryId");
            return (Criteria) this;
        }

        public Criteria andAccountingUserIsNull() {
            addCriterion("accounting_user is null");
            return (Criteria) this;
        }

        public Criteria andAccountingUserIsNotNull() {
            addCriterion("accounting_user is not null");
            return (Criteria) this;
        }

        public Criteria andAccountingUserEqualTo(Long value) {
            addCriterion("accounting_user =", value, "accountingUser");
            return (Criteria) this;
        }

        public Criteria andAccountingUserNotEqualTo(Long value) {
            addCriterion("accounting_user <>", value, "accountingUser");
            return (Criteria) this;
        }

        public Criteria andAccountingUserGreaterThan(Long value) {
            addCriterion("accounting_user >", value, "accountingUser");
            return (Criteria) this;
        }

        public Criteria andAccountingUserGreaterThanOrEqualTo(Long value) {
            addCriterion("accounting_user >=", value, "accountingUser");
            return (Criteria) this;
        }

        public Criteria andAccountingUserLessThan(Long value) {
            addCriterion("accounting_user <", value, "accountingUser");
            return (Criteria) this;
        }

        public Criteria andAccountingUserLessThanOrEqualTo(Long value) {
            addCriterion("accounting_user <=", value, "accountingUser");
            return (Criteria) this;
        }

        public Criteria andAccountingUserIn(List<Long> values) {
            addCriterion("accounting_user in", values, "accountingUser");
            return (Criteria) this;
        }

        public Criteria andAccountingUserNotIn(List<Long> values) {
            addCriterion("accounting_user not in", values, "accountingUser");
            return (Criteria) this;
        }

        public Criteria andAccountingUserBetween(Long value1, Long value2) {
            addCriterion("accounting_user between", value1, value2, "accountingUser");
            return (Criteria) this;
        }

        public Criteria andAccountingUserNotBetween(Long value1, Long value2) {
            addCriterion("accounting_user not between", value1, value2, "accountingUser");
            return (Criteria) this;
        }

        public Criteria andReviewUserIsNull() {
            addCriterion("review_user is null");
            return (Criteria) this;
        }

        public Criteria andReviewUserIsNotNull() {
            addCriterion("review_user is not null");
            return (Criteria) this;
        }

        public Criteria andReviewUserEqualTo(Long value) {
            addCriterion("review_user =", value, "reviewUser");
            return (Criteria) this;
        }

        public Criteria andReviewUserNotEqualTo(Long value) {
            addCriterion("review_user <>", value, "reviewUser");
            return (Criteria) this;
        }

        public Criteria andReviewUserGreaterThan(Long value) {
            addCriterion("review_user >", value, "reviewUser");
            return (Criteria) this;
        }

        public Criteria andReviewUserGreaterThanOrEqualTo(Long value) {
            addCriterion("review_user >=", value, "reviewUser");
            return (Criteria) this;
        }

        public Criteria andReviewUserLessThan(Long value) {
            addCriterion("review_user <", value, "reviewUser");
            return (Criteria) this;
        }

        public Criteria andReviewUserLessThanOrEqualTo(Long value) {
            addCriterion("review_user <=", value, "reviewUser");
            return (Criteria) this;
        }

        public Criteria andReviewUserIn(List<Long> values) {
            addCriterion("review_user in", values, "reviewUser");
            return (Criteria) this;
        }

        public Criteria andReviewUserNotIn(List<Long> values) {
            addCriterion("review_user not in", values, "reviewUser");
            return (Criteria) this;
        }

        public Criteria andReviewUserBetween(Long value1, Long value2) {
            addCriterion("review_user between", value1, value2, "reviewUser");
            return (Criteria) this;
        }

        public Criteria andReviewUserNotBetween(Long value1, Long value2) {
            addCriterion("review_user not between", value1, value2, "reviewUser");
            return (Criteria) this;
        }

        public Criteria andBookKeepingDateIsNull() {
            addCriterion("book_keeping_date is null");
            return (Criteria) this;
        }

        public Criteria andBookKeepingDateIsNotNull() {
            addCriterion("book_keeping_date is not null");
            return (Criteria) this;
        }

        public Criteria andBookKeepingDateEqualTo(Date value) {
            addCriterionForJDBCDate("book_keeping_date =", value, "bookKeepingDate");
            return (Criteria) this;
        }

        public Criteria andBookKeepingDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("book_keeping_date <>", value, "bookKeepingDate");
            return (Criteria) this;
        }

        public Criteria andBookKeepingDateGreaterThan(Date value) {
            addCriterionForJDBCDate("book_keeping_date >", value, "bookKeepingDate");
            return (Criteria) this;
        }

        public Criteria andBookKeepingDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("book_keeping_date >=", value, "bookKeepingDate");
            return (Criteria) this;
        }

        public Criteria andBookKeepingDateLessThan(Date value) {
            addCriterionForJDBCDate("book_keeping_date <", value, "bookKeepingDate");
            return (Criteria) this;
        }

        public Criteria andBookKeepingDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("book_keeping_date <=", value, "bookKeepingDate");
            return (Criteria) this;
        }

        public Criteria andBookKeepingDateIn(List<Date> values) {
            addCriterionForJDBCDate("book_keeping_date in", values, "bookKeepingDate");
            return (Criteria) this;
        }

        public Criteria andBookKeepingDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("book_keeping_date not in", values, "bookKeepingDate");
            return (Criteria) this;
        }

        public Criteria andBookKeepingDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("book_keeping_date between", value1, value2, "bookKeepingDate");
            return (Criteria) this;
        }

        public Criteria andBookKeepingDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("book_keeping_date not between", value1, value2, "bookKeepingDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateIsNull() {
            addCriterion("review_date is null");
            return (Criteria) this;
        }

        public Criteria andReviewDateIsNotNull() {
            addCriterion("review_date is not null");
            return (Criteria) this;
        }

        public Criteria andReviewDateEqualTo(Date value) {
            addCriterionForJDBCDate("review_date =", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("review_date <>", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateGreaterThan(Date value) {
            addCriterionForJDBCDate("review_date >", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("review_date >=", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateLessThan(Date value) {
            addCriterionForJDBCDate("review_date <", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("review_date <=", value, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateIn(List<Date> values) {
            addCriterionForJDBCDate("review_date in", values, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("review_date not in", values, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("review_date between", value1, value2, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andReviewDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("review_date not between", value1, value2, "reviewDate");
            return (Criteria) this;
        }

        public Criteria andFinishLoadingIsNull() {
            addCriterion("finish_loading is null");
            return (Criteria) this;
        }

        public Criteria andFinishLoadingIsNotNull() {
            addCriterion("finish_loading is not null");
            return (Criteria) this;
        }

        public Criteria andFinishLoadingEqualTo(String value) {
            addCriterion("finish_loading =", value, "finishLoading");
            return (Criteria) this;
        }

        public Criteria andFinishLoadingNotEqualTo(String value) {
            addCriterion("finish_loading <>", value, "finishLoading");
            return (Criteria) this;
        }

        public Criteria andFinishLoadingGreaterThan(String value) {
            addCriterion("finish_loading >", value, "finishLoading");
            return (Criteria) this;
        }

        public Criteria andFinishLoadingGreaterThanOrEqualTo(String value) {
            addCriterion("finish_loading >=", value, "finishLoading");
            return (Criteria) this;
        }

        public Criteria andFinishLoadingLessThan(String value) {
            addCriterion("finish_loading <", value, "finishLoading");
            return (Criteria) this;
        }

        public Criteria andFinishLoadingLessThanOrEqualTo(String value) {
            addCriterion("finish_loading <=", value, "finishLoading");
            return (Criteria) this;
        }

        public Criteria andFinishLoadingLike(String value) {
            addCriterion("finish_loading like", value, "finishLoading");
            return (Criteria) this;
        }

        public Criteria andFinishLoadingNotLike(String value) {
            addCriterion("finish_loading not like", value, "finishLoading");
            return (Criteria) this;
        }

        public Criteria andFinishLoadingIn(List<String> values) {
            addCriterion("finish_loading in", values, "finishLoading");
            return (Criteria) this;
        }

        public Criteria andFinishLoadingNotIn(List<String> values) {
            addCriterion("finish_loading not in", values, "finishLoading");
            return (Criteria) this;
        }

        public Criteria andFinishLoadingBetween(String value1, String value2) {
            addCriterion("finish_loading between", value1, value2, "finishLoading");
            return (Criteria) this;
        }

        public Criteria andFinishLoadingNotBetween(String value1, String value2) {
            addCriterion("finish_loading not between", value1, value2, "finishLoading");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryRemarksIsNull() {
            addCriterion("purchase_accounting_entry_remarks is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryRemarksIsNotNull() {
            addCriterion("purchase_accounting_entry_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryRemarksEqualTo(String value) {
            addCriterion("purchase_accounting_entry_remarks =", value, "purchaseAccountingEntryRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryRemarksNotEqualTo(String value) {
            addCriterion("purchase_accounting_entry_remarks <>", value, "purchaseAccountingEntryRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryRemarksGreaterThan(String value) {
            addCriterion("purchase_accounting_entry_remarks >", value, "purchaseAccountingEntryRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_accounting_entry_remarks >=", value, "purchaseAccountingEntryRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryRemarksLessThan(String value) {
            addCriterion("purchase_accounting_entry_remarks <", value, "purchaseAccountingEntryRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryRemarksLessThanOrEqualTo(String value) {
            addCriterion("purchase_accounting_entry_remarks <=", value, "purchaseAccountingEntryRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryRemarksLike(String value) {
            addCriterion("purchase_accounting_entry_remarks like", value, "purchaseAccountingEntryRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryRemarksNotLike(String value) {
            addCriterion("purchase_accounting_entry_remarks not like", value, "purchaseAccountingEntryRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryRemarksIn(List<String> values) {
            addCriterion("purchase_accounting_entry_remarks in", values, "purchaseAccountingEntryRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryRemarksNotIn(List<String> values) {
            addCriterion("purchase_accounting_entry_remarks not in", values, "purchaseAccountingEntryRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryRemarksBetween(String value1, String value2) {
            addCriterion("purchase_accounting_entry_remarks between", value1, value2, "purchaseAccountingEntryRemarks");
            return (Criteria) this;
        }

        public Criteria andPurchaseAccountingEntryRemarksNotBetween(String value1, String value2) {
            addCriterion("purchase_accounting_entry_remarks not between", value1, value2, "purchaseAccountingEntryRemarks");
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