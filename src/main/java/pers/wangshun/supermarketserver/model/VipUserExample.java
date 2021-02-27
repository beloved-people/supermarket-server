package pers.wangshun.supermarketserver.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VipUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VipUserExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andVipGenderIsNull() {
            addCriterion("vip_gender is null");
            return (Criteria) this;
        }

        public Criteria andVipGenderIsNotNull() {
            addCriterion("vip_gender is not null");
            return (Criteria) this;
        }

        public Criteria andVipGenderEqualTo(String value) {
            addCriterion("vip_gender =", value, "vipGender");
            return (Criteria) this;
        }

        public Criteria andVipGenderNotEqualTo(String value) {
            addCriterion("vip_gender <>", value, "vipGender");
            return (Criteria) this;
        }

        public Criteria andVipGenderGreaterThan(String value) {
            addCriterion("vip_gender >", value, "vipGender");
            return (Criteria) this;
        }

        public Criteria andVipGenderGreaterThanOrEqualTo(String value) {
            addCriterion("vip_gender >=", value, "vipGender");
            return (Criteria) this;
        }

        public Criteria andVipGenderLessThan(String value) {
            addCriterion("vip_gender <", value, "vipGender");
            return (Criteria) this;
        }

        public Criteria andVipGenderLessThanOrEqualTo(String value) {
            addCriterion("vip_gender <=", value, "vipGender");
            return (Criteria) this;
        }

        public Criteria andVipGenderLike(String value) {
            addCriterion("vip_gender like", value, "vipGender");
            return (Criteria) this;
        }

        public Criteria andVipGenderNotLike(String value) {
            addCriterion("vip_gender not like", value, "vipGender");
            return (Criteria) this;
        }

        public Criteria andVipGenderIn(List<String> values) {
            addCriterion("vip_gender in", values, "vipGender");
            return (Criteria) this;
        }

        public Criteria andVipGenderNotIn(List<String> values) {
            addCriterion("vip_gender not in", values, "vipGender");
            return (Criteria) this;
        }

        public Criteria andVipGenderBetween(String value1, String value2) {
            addCriterion("vip_gender between", value1, value2, "vipGender");
            return (Criteria) this;
        }

        public Criteria andVipGenderNotBetween(String value1, String value2) {
            addCriterion("vip_gender not between", value1, value2, "vipGender");
            return (Criteria) this;
        }

        public Criteria andVipNumberIsNull() {
            addCriterion("vip_number is null");
            return (Criteria) this;
        }

        public Criteria andVipNumberIsNotNull() {
            addCriterion("vip_number is not null");
            return (Criteria) this;
        }

        public Criteria andVipNumberEqualTo(String value) {
            addCriterion("vip_number =", value, "vipNumber");
            return (Criteria) this;
        }

        public Criteria andVipNumberNotEqualTo(String value) {
            addCriterion("vip_number <>", value, "vipNumber");
            return (Criteria) this;
        }

        public Criteria andVipNumberGreaterThan(String value) {
            addCriterion("vip_number >", value, "vipNumber");
            return (Criteria) this;
        }

        public Criteria andVipNumberGreaterThanOrEqualTo(String value) {
            addCriterion("vip_number >=", value, "vipNumber");
            return (Criteria) this;
        }

        public Criteria andVipNumberLessThan(String value) {
            addCriterion("vip_number <", value, "vipNumber");
            return (Criteria) this;
        }

        public Criteria andVipNumberLessThanOrEqualTo(String value) {
            addCriterion("vip_number <=", value, "vipNumber");
            return (Criteria) this;
        }

        public Criteria andVipNumberLike(String value) {
            addCriterion("vip_number like", value, "vipNumber");
            return (Criteria) this;
        }

        public Criteria andVipNumberNotLike(String value) {
            addCriterion("vip_number not like", value, "vipNumber");
            return (Criteria) this;
        }

        public Criteria andVipNumberIn(List<String> values) {
            addCriterion("vip_number in", values, "vipNumber");
            return (Criteria) this;
        }

        public Criteria andVipNumberNotIn(List<String> values) {
            addCriterion("vip_number not in", values, "vipNumber");
            return (Criteria) this;
        }

        public Criteria andVipNumberBetween(String value1, String value2) {
            addCriterion("vip_number between", value1, value2, "vipNumber");
            return (Criteria) this;
        }

        public Criteria andVipNumberNotBetween(String value1, String value2) {
            addCriterion("vip_number not between", value1, value2, "vipNumber");
            return (Criteria) this;
        }

        public Criteria andVipBirthdayIsNull() {
            addCriterion("vip_birthday is null");
            return (Criteria) this;
        }

        public Criteria andVipBirthdayIsNotNull() {
            addCriterion("vip_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andVipBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("vip_birthday =", value, "vipBirthday");
            return (Criteria) this;
        }

        public Criteria andVipBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("vip_birthday <>", value, "vipBirthday");
            return (Criteria) this;
        }

        public Criteria andVipBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("vip_birthday >", value, "vipBirthday");
            return (Criteria) this;
        }

        public Criteria andVipBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vip_birthday >=", value, "vipBirthday");
            return (Criteria) this;
        }

        public Criteria andVipBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("vip_birthday <", value, "vipBirthday");
            return (Criteria) this;
        }

        public Criteria andVipBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vip_birthday <=", value, "vipBirthday");
            return (Criteria) this;
        }

        public Criteria andVipBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("vip_birthday in", values, "vipBirthday");
            return (Criteria) this;
        }

        public Criteria andVipBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("vip_birthday not in", values, "vipBirthday");
            return (Criteria) this;
        }

        public Criteria andVipBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vip_birthday between", value1, value2, "vipBirthday");
            return (Criteria) this;
        }

        public Criteria andVipBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vip_birthday not between", value1, value2, "vipBirthday");
            return (Criteria) this;
        }

        public Criteria andVipPlaceIsNull() {
            addCriterion("vip_place is null");
            return (Criteria) this;
        }

        public Criteria andVipPlaceIsNotNull() {
            addCriterion("vip_place is not null");
            return (Criteria) this;
        }

        public Criteria andVipPlaceEqualTo(String value) {
            addCriterion("vip_place =", value, "vipPlace");
            return (Criteria) this;
        }

        public Criteria andVipPlaceNotEqualTo(String value) {
            addCriterion("vip_place <>", value, "vipPlace");
            return (Criteria) this;
        }

        public Criteria andVipPlaceGreaterThan(String value) {
            addCriterion("vip_place >", value, "vipPlace");
            return (Criteria) this;
        }

        public Criteria andVipPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("vip_place >=", value, "vipPlace");
            return (Criteria) this;
        }

        public Criteria andVipPlaceLessThan(String value) {
            addCriterion("vip_place <", value, "vipPlace");
            return (Criteria) this;
        }

        public Criteria andVipPlaceLessThanOrEqualTo(String value) {
            addCriterion("vip_place <=", value, "vipPlace");
            return (Criteria) this;
        }

        public Criteria andVipPlaceLike(String value) {
            addCriterion("vip_place like", value, "vipPlace");
            return (Criteria) this;
        }

        public Criteria andVipPlaceNotLike(String value) {
            addCriterion("vip_place not like", value, "vipPlace");
            return (Criteria) this;
        }

        public Criteria andVipPlaceIn(List<String> values) {
            addCriterion("vip_place in", values, "vipPlace");
            return (Criteria) this;
        }

        public Criteria andVipPlaceNotIn(List<String> values) {
            addCriterion("vip_place not in", values, "vipPlace");
            return (Criteria) this;
        }

        public Criteria andVipPlaceBetween(String value1, String value2) {
            addCriterion("vip_place between", value1, value2, "vipPlace");
            return (Criteria) this;
        }

        public Criteria andVipPlaceNotBetween(String value1, String value2) {
            addCriterion("vip_place not between", value1, value2, "vipPlace");
            return (Criteria) this;
        }

        public Criteria andVipShopIdIsNull() {
            addCriterion("vip_shop_id is null");
            return (Criteria) this;
        }

        public Criteria andVipShopIdIsNotNull() {
            addCriterion("vip_shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andVipShopIdEqualTo(Long value) {
            addCriterion("vip_shop_id =", value, "vipShopId");
            return (Criteria) this;
        }

        public Criteria andVipShopIdNotEqualTo(Integer value) {
            addCriterion("vip_shop_id <>", value, "vipShopId");
            return (Criteria) this;
        }

        public Criteria andVipShopIdGreaterThan(Integer value) {
            addCriterion("vip_shop_id >", value, "vipShopId");
            return (Criteria) this;
        }

        public Criteria andVipShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_shop_id >=", value, "vipShopId");
            return (Criteria) this;
        }

        public Criteria andVipShopIdLessThan(Integer value) {
            addCriterion("vip_shop_id <", value, "vipShopId");
            return (Criteria) this;
        }

        public Criteria andVipShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("vip_shop_id <=", value, "vipShopId");
            return (Criteria) this;
        }

        public Criteria andVipShopIdIn(List<Integer> values) {
            addCriterion("vip_shop_id in", values, "vipShopId");
            return (Criteria) this;
        }

        public Criteria andVipShopIdNotIn(List<Integer> values) {
            addCriterion("vip_shop_id not in", values, "vipShopId");
            return (Criteria) this;
        }

        public Criteria andVipShopIdBetween(Integer value1, Integer value2) {
            addCriterion("vip_shop_id between", value1, value2, "vipShopId");
            return (Criteria) this;
        }

        public Criteria andVipShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_shop_id not between", value1, value2, "vipShopId");
            return (Criteria) this;
        }

        public Criteria andVipCardCodeIsNull() {
            addCriterion("vip_card_code is null");
            return (Criteria) this;
        }

        public Criteria andVipCardCodeIsNotNull() {
            addCriterion("vip_card_code is not null");
            return (Criteria) this;
        }

        public Criteria andVipCardCodeEqualTo(String value) {
            addCriterion("vip_card_code =", value, "vipCardCode");
            return (Criteria) this;
        }

        public Criteria andVipCardCodeNotEqualTo(String value) {
            addCriterion("vip_card_code <>", value, "vipCardCode");
            return (Criteria) this;
        }

        public Criteria andVipCardCodeGreaterThan(String value) {
            addCriterion("vip_card_code >", value, "vipCardCode");
            return (Criteria) this;
        }

        public Criteria andVipCardCodeGreaterThanOrEqualTo(String value) {
            addCriterion("vip_card_code >=", value, "vipCardCode");
            return (Criteria) this;
        }

        public Criteria andVipCardCodeLessThan(String value) {
            addCriterion("vip_card_code <", value, "vipCardCode");
            return (Criteria) this;
        }

        public Criteria andVipCardCodeLessThanOrEqualTo(String value) {
            addCriterion("vip_card_code <=", value, "vipCardCode");
            return (Criteria) this;
        }

        public Criteria andVipCardCodeLike(String value) {
            addCriterion("vip_card_code like", value, "vipCardCode");
            return (Criteria) this;
        }

        public Criteria andVipCardCodeNotLike(String value) {
            addCriterion("vip_card_code not like", value, "vipCardCode");
            return (Criteria) this;
        }

        public Criteria andVipCardCodeIn(List<String> values) {
            addCriterion("vip_card_code in", values, "vipCardCode");
            return (Criteria) this;
        }

        public Criteria andVipCardCodeNotIn(List<String> values) {
            addCriterion("vip_card_code not in", values, "vipCardCode");
            return (Criteria) this;
        }

        public Criteria andVipCardCodeBetween(String value1, String value2) {
            addCriterion("vip_card_code between", value1, value2, "vipCardCode");
            return (Criteria) this;
        }

        public Criteria andVipCardCodeNotBetween(String value1, String value2) {
            addCriterion("vip_card_code not between", value1, value2, "vipCardCode");
            return (Criteria) this;
        }

        public Criteria andVipIntegrationIsNull() {
            addCriterion("vip_integration is null");
            return (Criteria) this;
        }

        public Criteria andVipIntegrationIsNotNull() {
            addCriterion("vip_integration is not null");
            return (Criteria) this;
        }

        public Criteria andVipIntegrationEqualTo(Integer value) {
            addCriterion("vip_integration =", value, "vipIntegration");
            return (Criteria) this;
        }

        public Criteria andVipIntegrationNotEqualTo(Integer value) {
            addCriterion("vip_integration <>", value, "vipIntegration");
            return (Criteria) this;
        }

        public Criteria andVipIntegrationGreaterThan(Integer value) {
            addCriterion("vip_integration >", value, "vipIntegration");
            return (Criteria) this;
        }

        public Criteria andVipIntegrationGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_integration >=", value, "vipIntegration");
            return (Criteria) this;
        }

        public Criteria andVipIntegrationLessThan(Integer value) {
            addCriterion("vip_integration <", value, "vipIntegration");
            return (Criteria) this;
        }

        public Criteria andVipIntegrationLessThanOrEqualTo(Integer value) {
            addCriterion("vip_integration <=", value, "vipIntegration");
            return (Criteria) this;
        }

        public Criteria andVipIntegrationIn(List<Integer> values) {
            addCriterion("vip_integration in", values, "vipIntegration");
            return (Criteria) this;
        }

        public Criteria andVipIntegrationNotIn(List<Integer> values) {
            addCriterion("vip_integration not in", values, "vipIntegration");
            return (Criteria) this;
        }

        public Criteria andVipIntegrationBetween(Integer value1, Integer value2) {
            addCriterion("vip_integration between", value1, value2, "vipIntegration");
            return (Criteria) this;
        }

        public Criteria andVipIntegrationNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_integration not between", value1, value2, "vipIntegration");
            return (Criteria) this;
        }

        public Criteria andVipRegisterDateIsNull() {
            addCriterion("vip_register_date is null");
            return (Criteria) this;
        }

        public Criteria andVipRegisterDateIsNotNull() {
            addCriterion("vip_register_date is not null");
            return (Criteria) this;
        }

        public Criteria andVipRegisterDateEqualTo(Date value) {
            addCriterionForJDBCDate("vip_register_date =", value, "vipRegisterDate");
            return (Criteria) this;
        }

        public Criteria andVipRegisterDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("vip_register_date <>", value, "vipRegisterDate");
            return (Criteria) this;
        }

        public Criteria andVipRegisterDateGreaterThan(Date value) {
            addCriterionForJDBCDate("vip_register_date >", value, "vipRegisterDate");
            return (Criteria) this;
        }

        public Criteria andVipRegisterDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vip_register_date >=", value, "vipRegisterDate");
            return (Criteria) this;
        }

        public Criteria andVipRegisterDateLessThan(Date value) {
            addCriterionForJDBCDate("vip_register_date <", value, "vipRegisterDate");
            return (Criteria) this;
        }

        public Criteria andVipRegisterDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("vip_register_date <=", value, "vipRegisterDate");
            return (Criteria) this;
        }

        public Criteria andVipRegisterDateIn(List<Date> values) {
            addCriterionForJDBCDate("vip_register_date in", values, "vipRegisterDate");
            return (Criteria) this;
        }

        public Criteria andVipRegisterDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("vip_register_date not in", values, "vipRegisterDate");
            return (Criteria) this;
        }

        public Criteria andVipRegisterDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vip_register_date between", value1, value2, "vipRegisterDate");
            return (Criteria) this;
        }

        public Criteria andVipRegisterDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("vip_register_date not between", value1, value2, "vipRegisterDate");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(Boolean value) {
            addCriterion("enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(Boolean value) {
            addCriterion("enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(Boolean value) {
            addCriterion("enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(Boolean value) {
            addCriterion("enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(Boolean value) {
            addCriterion("enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<Boolean> values) {
            addCriterion("enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<Boolean> values) {
            addCriterion("enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(Boolean value1, Boolean value2) {
            addCriterion("enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andLockedIsNull() {
            addCriterion("locked is null");
            return (Criteria) this;
        }

        public Criteria andLockedIsNotNull() {
            addCriterion("locked is not null");
            return (Criteria) this;
        }

        public Criteria andLockedEqualTo(Boolean value) {
            addCriterion("locked =", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotEqualTo(Boolean value) {
            addCriterion("locked <>", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThan(Boolean value) {
            addCriterion("locked >", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("locked >=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThan(Boolean value) {
            addCriterion("locked <", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThanOrEqualTo(Boolean value) {
            addCriterion("locked <=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedIn(List<Boolean> values) {
            addCriterion("locked in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotIn(List<Boolean> values) {
            addCriterion("locked not in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedBetween(Boolean value1, Boolean value2) {
            addCriterion("locked between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("locked not between", value1, value2, "locked");
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