package pers.wangshun.supermarketserver.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GoodsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsInfoExample() {
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

        public Criteria andGoodsCategoryNumberIsNull() {
            addCriterion("goods_category_number is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryNumberIsNotNull() {
            addCriterion("goods_category_number is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryNumberEqualTo(Integer value) {
            addCriterion("goods_category_number =", value, "goodsCategoryNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryNumberNotEqualTo(Integer value) {
            addCriterion("goods_category_number <>", value, "goodsCategoryNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryNumberGreaterThan(Integer value) {
            addCriterion("goods_category_number >", value, "goodsCategoryNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_category_number >=", value, "goodsCategoryNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryNumberLessThan(Integer value) {
            addCriterion("goods_category_number <", value, "goodsCategoryNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryNumberLessThanOrEqualTo(Integer value) {
            addCriterion("goods_category_number <=", value, "goodsCategoryNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryNumberIn(List<Integer> values) {
            addCriterion("goods_category_number in", values, "goodsCategoryNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryNumberNotIn(List<Integer> values) {
            addCriterion("goods_category_number not in", values, "goodsCategoryNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryNumberBetween(Integer value1, Integer value2) {
            addCriterion("goods_category_number between", value1, value2, "goodsCategoryNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsCategoryNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_category_number not between", value1, value2, "goodsCategoryNumber");
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

        public Criteria andGoodsPurchasePriceIsNull() {
            addCriterion("goods_purchase_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPurchasePriceIsNotNull() {
            addCriterion("goods_purchase_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPurchasePriceEqualTo(BigDecimal value) {
            addCriterion("goods_purchase_price =", value, "goodsPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPurchasePriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_purchase_price <>", value, "goodsPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPurchasePriceGreaterThan(BigDecimal value) {
            addCriterion("goods_purchase_price >", value, "goodsPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPurchasePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_purchase_price >=", value, "goodsPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPurchasePriceLessThan(BigDecimal value) {
            addCriterion("goods_purchase_price <", value, "goodsPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPurchasePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_purchase_price <=", value, "goodsPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPurchasePriceIn(List<BigDecimal> values) {
            addCriterion("goods_purchase_price in", values, "goodsPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPurchasePriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_purchase_price not in", values, "goodsPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPurchasePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_purchase_price between", value1, value2, "goodsPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPurchasePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_purchase_price not between", value1, value2, "goodsPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginIsNull() {
            addCriterion("goods_origin is null");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginIsNotNull() {
            addCriterion("goods_origin is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginEqualTo(String value) {
            addCriterion("goods_origin =", value, "goodsOrigin");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginNotEqualTo(String value) {
            addCriterion("goods_origin <>", value, "goodsOrigin");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginGreaterThan(String value) {
            addCriterion("goods_origin >", value, "goodsOrigin");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginGreaterThanOrEqualTo(String value) {
            addCriterion("goods_origin >=", value, "goodsOrigin");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginLessThan(String value) {
            addCriterion("goods_origin <", value, "goodsOrigin");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginLessThanOrEqualTo(String value) {
            addCriterion("goods_origin <=", value, "goodsOrigin");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginLike(String value) {
            addCriterion("goods_origin like", value, "goodsOrigin");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginNotLike(String value) {
            addCriterion("goods_origin not like", value, "goodsOrigin");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginIn(List<String> values) {
            addCriterion("goods_origin in", values, "goodsOrigin");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginNotIn(List<String> values) {
            addCriterion("goods_origin not in", values, "goodsOrigin");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginBetween(String value1, String value2) {
            addCriterion("goods_origin between", value1, value2, "goodsOrigin");
            return (Criteria) this;
        }

        public Criteria andGoodsOriginNotBetween(String value1, String value2) {
            addCriterion("goods_origin not between", value1, value2, "goodsOrigin");
            return (Criteria) this;
        }

        public Criteria andGoodsProductionDateIsNull() {
            addCriterion("goods_production_date is null");
            return (Criteria) this;
        }

        public Criteria andGoodsProductionDateIsNotNull() {
            addCriterion("goods_production_date is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsProductionDateEqualTo(Date value) {
            addCriterionForJDBCDate("goods_production_date =", value, "goodsProductionDate");
            return (Criteria) this;
        }

        public Criteria andGoodsProductionDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("goods_production_date <>", value, "goodsProductionDate");
            return (Criteria) this;
        }

        public Criteria andGoodsProductionDateGreaterThan(Date value) {
            addCriterionForJDBCDate("goods_production_date >", value, "goodsProductionDate");
            return (Criteria) this;
        }

        public Criteria andGoodsProductionDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("goods_production_date >=", value, "goodsProductionDate");
            return (Criteria) this;
        }

        public Criteria andGoodsProductionDateLessThan(Date value) {
            addCriterionForJDBCDate("goods_production_date <", value, "goodsProductionDate");
            return (Criteria) this;
        }

        public Criteria andGoodsProductionDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("goods_production_date <=", value, "goodsProductionDate");
            return (Criteria) this;
        }

        public Criteria andGoodsProductionDateIn(List<Date> values) {
            addCriterionForJDBCDate("goods_production_date in", values, "goodsProductionDate");
            return (Criteria) this;
        }

        public Criteria andGoodsProductionDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("goods_production_date not in", values, "goodsProductionDate");
            return (Criteria) this;
        }

        public Criteria andGoodsProductionDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("goods_production_date between", value1, value2, "goodsProductionDate");
            return (Criteria) this;
        }

        public Criteria andGoodsProductionDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("goods_production_date not between", value1, value2, "goodsProductionDate");
            return (Criteria) this;
        }

        public Criteria andGoodsExpiryDateIsNull() {
            addCriterion("goods_expiry_date is null");
            return (Criteria) this;
        }

        public Criteria andGoodsExpiryDateIsNotNull() {
            addCriterion("goods_expiry_date is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsExpiryDateEqualTo(Integer value) {
            addCriterion("goods_expiry_date =", value, "goodsExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGoodsExpiryDateNotEqualTo(Integer value) {
            addCriterion("goods_expiry_date <>", value, "goodsExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGoodsExpiryDateGreaterThan(Integer value) {
            addCriterion("goods_expiry_date >", value, "goodsExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGoodsExpiryDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_expiry_date >=", value, "goodsExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGoodsExpiryDateLessThan(Integer value) {
            addCriterion("goods_expiry_date <", value, "goodsExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGoodsExpiryDateLessThanOrEqualTo(Integer value) {
            addCriterion("goods_expiry_date <=", value, "goodsExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGoodsExpiryDateIn(List<Integer> values) {
            addCriterion("goods_expiry_date in", values, "goodsExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGoodsExpiryDateNotIn(List<Integer> values) {
            addCriterion("goods_expiry_date not in", values, "goodsExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGoodsExpiryDateBetween(Integer value1, Integer value2) {
            addCriterion("goods_expiry_date between", value1, value2, "goodsExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGoodsExpiryDateNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_expiry_date not between", value1, value2, "goodsExpiryDate");
            return (Criteria) this;
        }

        public Criteria andGoodsRawMaterialIsNull() {
            addCriterion("goods_raw_material is null");
            return (Criteria) this;
        }

        public Criteria andGoodsRawMaterialIsNotNull() {
            addCriterion("goods_raw_material is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsRawMaterialEqualTo(String value) {
            addCriterion("goods_raw_material =", value, "goodsRawMaterial");
            return (Criteria) this;
        }

        public Criteria andGoodsRawMaterialNotEqualTo(String value) {
            addCriterion("goods_raw_material <>", value, "goodsRawMaterial");
            return (Criteria) this;
        }

        public Criteria andGoodsRawMaterialGreaterThan(String value) {
            addCriterion("goods_raw_material >", value, "goodsRawMaterial");
            return (Criteria) this;
        }

        public Criteria andGoodsRawMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("goods_raw_material >=", value, "goodsRawMaterial");
            return (Criteria) this;
        }

        public Criteria andGoodsRawMaterialLessThan(String value) {
            addCriterion("goods_raw_material <", value, "goodsRawMaterial");
            return (Criteria) this;
        }

        public Criteria andGoodsRawMaterialLessThanOrEqualTo(String value) {
            addCriterion("goods_raw_material <=", value, "goodsRawMaterial");
            return (Criteria) this;
        }

        public Criteria andGoodsRawMaterialLike(String value) {
            addCriterion("goods_raw_material like", value, "goodsRawMaterial");
            return (Criteria) this;
        }

        public Criteria andGoodsRawMaterialNotLike(String value) {
            addCriterion("goods_raw_material not like", value, "goodsRawMaterial");
            return (Criteria) this;
        }

        public Criteria andGoodsRawMaterialIn(List<String> values) {
            addCriterion("goods_raw_material in", values, "goodsRawMaterial");
            return (Criteria) this;
        }

        public Criteria andGoodsRawMaterialNotIn(List<String> values) {
            addCriterion("goods_raw_material not in", values, "goodsRawMaterial");
            return (Criteria) this;
        }

        public Criteria andGoodsRawMaterialBetween(String value1, String value2) {
            addCriterion("goods_raw_material between", value1, value2, "goodsRawMaterial");
            return (Criteria) this;
        }

        public Criteria andGoodsRawMaterialNotBetween(String value1, String value2) {
            addCriterion("goods_raw_material not between", value1, value2, "goodsRawMaterial");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationIsNull() {
            addCriterion("goods_specification is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationIsNotNull() {
            addCriterion("goods_specification is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationEqualTo(String value) {
            addCriterion("goods_specification =", value, "goodsSpecification");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationNotEqualTo(String value) {
            addCriterion("goods_specification <>", value, "goodsSpecification");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationGreaterThan(String value) {
            addCriterion("goods_specification >", value, "goodsSpecification");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("goods_specification >=", value, "goodsSpecification");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationLessThan(String value) {
            addCriterion("goods_specification <", value, "goodsSpecification");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationLessThanOrEqualTo(String value) {
            addCriterion("goods_specification <=", value, "goodsSpecification");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationLike(String value) {
            addCriterion("goods_specification like", value, "goodsSpecification");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationNotLike(String value) {
            addCriterion("goods_specification not like", value, "goodsSpecification");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationIn(List<String> values) {
            addCriterion("goods_specification in", values, "goodsSpecification");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationNotIn(List<String> values) {
            addCriterion("goods_specification not in", values, "goodsSpecification");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationBetween(String value1, String value2) {
            addCriterion("goods_specification between", value1, value2, "goodsSpecification");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationNotBetween(String value1, String value2) {
            addCriterion("goods_specification not between", value1, value2, "goodsSpecification");
            return (Criteria) this;
        }

        public Criteria andGoodsManufacturerIsNull() {
            addCriterion("goods_manufacturer is null");
            return (Criteria) this;
        }

        public Criteria andGoodsManufacturerIsNotNull() {
            addCriterion("goods_manufacturer is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsManufacturerEqualTo(String value) {
            addCriterion("goods_manufacturer =", value, "goodsManufacturer");
            return (Criteria) this;
        }

        public Criteria andGoodsManufacturerNotEqualTo(String value) {
            addCriterion("goods_manufacturer <>", value, "goodsManufacturer");
            return (Criteria) this;
        }

        public Criteria andGoodsManufacturerGreaterThan(String value) {
            addCriterion("goods_manufacturer >", value, "goodsManufacturer");
            return (Criteria) this;
        }

        public Criteria andGoodsManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("goods_manufacturer >=", value, "goodsManufacturer");
            return (Criteria) this;
        }

        public Criteria andGoodsManufacturerLessThan(String value) {
            addCriterion("goods_manufacturer <", value, "goodsManufacturer");
            return (Criteria) this;
        }

        public Criteria andGoodsManufacturerLessThanOrEqualTo(String value) {
            addCriterion("goods_manufacturer <=", value, "goodsManufacturer");
            return (Criteria) this;
        }

        public Criteria andGoodsManufacturerLike(String value) {
            addCriterion("goods_manufacturer like", value, "goodsManufacturer");
            return (Criteria) this;
        }

        public Criteria andGoodsManufacturerNotLike(String value) {
            addCriterion("goods_manufacturer not like", value, "goodsManufacturer");
            return (Criteria) this;
        }

        public Criteria andGoodsManufacturerIn(List<String> values) {
            addCriterion("goods_manufacturer in", values, "goodsManufacturer");
            return (Criteria) this;
        }

        public Criteria andGoodsManufacturerNotIn(List<String> values) {
            addCriterion("goods_manufacturer not in", values, "goodsManufacturer");
            return (Criteria) this;
        }

        public Criteria andGoodsManufacturerBetween(String value1, String value2) {
            addCriterion("goods_manufacturer between", value1, value2, "goodsManufacturer");
            return (Criteria) this;
        }

        public Criteria andGoodsManufacturerNotBetween(String value1, String value2) {
            addCriterion("goods_manufacturer not between", value1, value2, "goodsManufacturer");
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