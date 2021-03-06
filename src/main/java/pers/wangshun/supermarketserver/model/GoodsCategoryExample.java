package pers.wangshun.supermarketserver.model;

import java.util.ArrayList;
import java.util.List;

public class GoodsCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsCategoryExample() {
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

        public Criteria andCategoryNumberIsNull() {
            addCriterion("category_number is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNumberIsNotNull() {
            addCriterion("category_number is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNumberEqualTo(Integer value) {
            addCriterion("category_number =", value, "categoryNumber");
            return (Criteria) this;
        }

        public Criteria andCategoryNumberNotEqualTo(Integer value) {
            addCriterion("category_number <>", value, "categoryNumber");
            return (Criteria) this;
        }

        public Criteria andCategoryNumberGreaterThan(Integer value) {
            addCriterion("category_number >", value, "categoryNumber");
            return (Criteria) this;
        }

        public Criteria andCategoryNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_number >=", value, "categoryNumber");
            return (Criteria) this;
        }

        public Criteria andCategoryNumberLessThan(Integer value) {
            addCriterion("category_number <", value, "categoryNumber");
            return (Criteria) this;
        }

        public Criteria andCategoryNumberLessThanOrEqualTo(Integer value) {
            addCriterion("category_number <=", value, "categoryNumber");
            return (Criteria) this;
        }

        public Criteria andCategoryNumberIn(List<Integer> values) {
            addCriterion("category_number in", values, "categoryNumber");
            return (Criteria) this;
        }

        public Criteria andCategoryNumberNotIn(List<Integer> values) {
            addCriterion("category_number not in", values, "categoryNumber");
            return (Criteria) this;
        }

        public Criteria andCategoryNumberBetween(Integer value1, Integer value2) {
            addCriterion("category_number between", value1, value2, "categoryNumber");
            return (Criteria) this;
        }

        public Criteria andCategoryNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("category_number not between", value1, value2, "categoryNumber");
            return (Criteria) this;
        }

        public Criteria andParentIndexIsNull() {
            addCriterion("parent_index is null");
            return (Criteria) this;
        }

        public Criteria andParentIndexIsNotNull() {
            addCriterion("parent_index is not null");
            return (Criteria) this;
        }

        public Criteria andParentIndexEqualTo(Integer value) {
            addCriterion("parent_index =", value, "parentIndex");
            return (Criteria) this;
        }

        public Criteria andParentIndexNotEqualTo(Integer value) {
            addCriterion("parent_index <>", value, "parentIndex");
            return (Criteria) this;
        }

        public Criteria andParentIndexGreaterThan(Integer value) {
            addCriterion("parent_index >", value, "parentIndex");
            return (Criteria) this;
        }

        public Criteria andParentIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_index >=", value, "parentIndex");
            return (Criteria) this;
        }

        public Criteria andParentIndexLessThan(Integer value) {
            addCriterion("parent_index <", value, "parentIndex");
            return (Criteria) this;
        }

        public Criteria andParentIndexLessThanOrEqualTo(Integer value) {
            addCriterion("parent_index <=", value, "parentIndex");
            return (Criteria) this;
        }

        public Criteria andParentIndexIn(List<Integer> values) {
            addCriterion("parent_index in", values, "parentIndex");
            return (Criteria) this;
        }

        public Criteria andParentIndexNotIn(List<Integer> values) {
            addCriterion("parent_index not in", values, "parentIndex");
            return (Criteria) this;
        }

        public Criteria andParentIndexBetween(Integer value1, Integer value2) {
            addCriterion("parent_index between", value1, value2, "parentIndex");
            return (Criteria) this;
        }

        public Criteria andParentIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_index not between", value1, value2, "parentIndex");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNull() {
            addCriterion("category_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNotNull() {
            addCriterion("category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameEqualTo(String value) {
            addCriterion("category_name =", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotEqualTo(String value) {
            addCriterion("category_name <>", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThan(String value) {
            addCriterion("category_name >", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("category_name >=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThan(String value) {
            addCriterion("category_name <", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("category_name <=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLike(String value) {
            addCriterion("category_name like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotLike(String value) {
            addCriterion("category_name not like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIn(List<String> values) {
            addCriterion("category_name in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotIn(List<String> values) {
            addCriterion("category_name not in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameBetween(String value1, String value2) {
            addCriterion("category_name between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotBetween(String value1, String value2) {
            addCriterion("category_name not between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionIsNull() {
            addCriterion("category_description is null");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionIsNotNull() {
            addCriterion("category_description is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionEqualTo(String value) {
            addCriterion("category_description =", value, "categoryDescription");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionNotEqualTo(String value) {
            addCriterion("category_description <>", value, "categoryDescription");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionGreaterThan(String value) {
            addCriterion("category_description >", value, "categoryDescription");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("category_description >=", value, "categoryDescription");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionLessThan(String value) {
            addCriterion("category_description <", value, "categoryDescription");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionLessThanOrEqualTo(String value) {
            addCriterion("category_description <=", value, "categoryDescription");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionLike(String value) {
            addCriterion("category_description like", value, "categoryDescription");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionNotLike(String value) {
            addCriterion("category_description not like", value, "categoryDescription");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionIn(List<String> values) {
            addCriterion("category_description in", values, "categoryDescription");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionNotIn(List<String> values) {
            addCriterion("category_description not in", values, "categoryDescription");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionBetween(String value1, String value2) {
            addCriterion("category_description between", value1, value2, "categoryDescription");
            return (Criteria) this;
        }

        public Criteria andCategoryDescriptionNotBetween(String value1, String value2) {
            addCriterion("category_description not between", value1, value2, "categoryDescription");
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