package pers.wangshun.supermarketserver.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EmployeeUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeUserExample() {
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

        public Criteria andEmployeeCodeIsNull() {
            addCriterion("employee_code is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeIsNotNull() {
            addCriterion("employee_code is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeEqualTo(Long value) {
            addCriterion("employee_code =", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeNotEqualTo(Long value) {
            addCriterion("employee_code <>", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeGreaterThan(Long value) {
            addCriterion("employee_code >", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("employee_code >=", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeLessThan(Long value) {
            addCriterion("employee_code <", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeLessThanOrEqualTo(Long value) {
            addCriterion("employee_code <=", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeIn(List<Long> values) {
            addCriterion("employee_code in", values, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeNotIn(List<Long> values) {
            addCriterion("employee_code not in", values, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeBetween(Long value1, Long value2) {
            addCriterion("employee_code between", value1, value2, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeNotBetween(Long value1, Long value2) {
            addCriterion("employee_code not between", value1, value2, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderIsNull() {
            addCriterion("employee_gender is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderIsNotNull() {
            addCriterion("employee_gender is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderEqualTo(String value) {
            addCriterion("employee_gender =", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotEqualTo(String value) {
            addCriterion("employee_gender <>", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderGreaterThan(String value) {
            addCriterion("employee_gender >", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderGreaterThanOrEqualTo(String value) {
            addCriterion("employee_gender >=", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderLessThan(String value) {
            addCriterion("employee_gender <", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderLessThanOrEqualTo(String value) {
            addCriterion("employee_gender <=", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderLike(String value) {
            addCriterion("employee_gender like", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotLike(String value) {
            addCriterion("employee_gender not like", value, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderIn(List<String> values) {
            addCriterion("employee_gender in", values, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotIn(List<String> values) {
            addCriterion("employee_gender not in", values, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderBetween(String value1, String value2) {
            addCriterion("employee_gender between", value1, value2, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeeGenderNotBetween(String value1, String value2) {
            addCriterion("employee_gender not between", value1, value2, "employeeGender");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneIsNull() {
            addCriterion("employee_phone is null");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneIsNotNull() {
            addCriterion("employee_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneEqualTo(String value) {
            addCriterion("employee_phone =", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotEqualTo(String value) {
            addCriterion("employee_phone <>", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneGreaterThan(String value) {
            addCriterion("employee_phone >", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("employee_phone >=", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneLessThan(String value) {
            addCriterion("employee_phone <", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneLessThanOrEqualTo(String value) {
            addCriterion("employee_phone <=", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneLike(String value) {
            addCriterion("employee_phone like", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotLike(String value) {
            addCriterion("employee_phone not like", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneIn(List<String> values) {
            addCriterion("employee_phone in", values, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotIn(List<String> values) {
            addCriterion("employee_phone not in", values, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneBetween(String value1, String value2) {
            addCriterion("employee_phone between", value1, value2, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotBetween(String value1, String value2) {
            addCriterion("employee_phone not between", value1, value2, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeeLocationIsNull() {
            addCriterion("employee_location is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeLocationIsNotNull() {
            addCriterion("employee_location is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeLocationEqualTo(String value) {
            addCriterion("employee_location =", value, "employeeLocation");
            return (Criteria) this;
        }

        public Criteria andEmployeeLocationNotEqualTo(String value) {
            addCriterion("employee_location <>", value, "employeeLocation");
            return (Criteria) this;
        }

        public Criteria andEmployeeLocationGreaterThan(String value) {
            addCriterion("employee_location >", value, "employeeLocation");
            return (Criteria) this;
        }

        public Criteria andEmployeeLocationGreaterThanOrEqualTo(String value) {
            addCriterion("employee_location >=", value, "employeeLocation");
            return (Criteria) this;
        }

        public Criteria andEmployeeLocationLessThan(String value) {
            addCriterion("employee_location <", value, "employeeLocation");
            return (Criteria) this;
        }

        public Criteria andEmployeeLocationLessThanOrEqualTo(String value) {
            addCriterion("employee_location <=", value, "employeeLocation");
            return (Criteria) this;
        }

        public Criteria andEmployeeLocationLike(String value) {
            addCriterion("employee_location like", value, "employeeLocation");
            return (Criteria) this;
        }

        public Criteria andEmployeeLocationNotLike(String value) {
            addCriterion("employee_location not like", value, "employeeLocation");
            return (Criteria) this;
        }

        public Criteria andEmployeeLocationIn(List<String> values) {
            addCriterion("employee_location in", values, "employeeLocation");
            return (Criteria) this;
        }

        public Criteria andEmployeeLocationNotIn(List<String> values) {
            addCriterion("employee_location not in", values, "employeeLocation");
            return (Criteria) this;
        }

        public Criteria andEmployeeLocationBetween(String value1, String value2) {
            addCriterion("employee_location between", value1, value2, "employeeLocation");
            return (Criteria) this;
        }

        public Criteria andEmployeeLocationNotBetween(String value1, String value2) {
            addCriterion("employee_location not between", value1, value2, "employeeLocation");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthdayIsNull() {
            addCriterion("employee_birthday is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthdayIsNotNull() {
            addCriterion("employee_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("employee_birthday =", value, "employeeBirthday");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("employee_birthday <>", value, "employeeBirthday");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("employee_birthday >", value, "employeeBirthday");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("employee_birthday >=", value, "employeeBirthday");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("employee_birthday <", value, "employeeBirthday");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("employee_birthday <=", value, "employeeBirthday");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("employee_birthday in", values, "employeeBirthday");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("employee_birthday not in", values, "employeeBirthday");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("employee_birthday between", value1, value2, "employeeBirthday");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("employee_birthday not between", value1, value2, "employeeBirthday");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntryDateIsNull() {
            addCriterion("employee_entry_date is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntryDateIsNotNull() {
            addCriterion("employee_entry_date is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntryDateEqualTo(Date value) {
            addCriterionForJDBCDate("employee_entry_date =", value, "employeeEntryDate");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("employee_entry_date <>", value, "employeeEntryDate");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("employee_entry_date >", value, "employeeEntryDate");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("employee_entry_date >=", value, "employeeEntryDate");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntryDateLessThan(Date value) {
            addCriterionForJDBCDate("employee_entry_date <", value, "employeeEntryDate");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("employee_entry_date <=", value, "employeeEntryDate");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntryDateIn(List<Date> values) {
            addCriterionForJDBCDate("employee_entry_date in", values, "employeeEntryDate");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("employee_entry_date not in", values, "employeeEntryDate");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("employee_entry_date between", value1, value2, "employeeEntryDate");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("employee_entry_date not between", value1, value2, "employeeEntryDate");
            return (Criteria) this;
        }

        public Criteria andEmployeeBankcardIsNull() {
            addCriterion("employee_bankcard is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeBankcardIsNotNull() {
            addCriterion("employee_bankcard is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeBankcardEqualTo(String value) {
            addCriterion("employee_bankcard =", value, "employeeBankcard");
            return (Criteria) this;
        }

        public Criteria andEmployeeBankcardNotEqualTo(String value) {
            addCriterion("employee_bankcard <>", value, "employeeBankcard");
            return (Criteria) this;
        }

        public Criteria andEmployeeBankcardGreaterThan(String value) {
            addCriterion("employee_bankcard >", value, "employeeBankcard");
            return (Criteria) this;
        }

        public Criteria andEmployeeBankcardGreaterThanOrEqualTo(String value) {
            addCriterion("employee_bankcard >=", value, "employeeBankcard");
            return (Criteria) this;
        }

        public Criteria andEmployeeBankcardLessThan(String value) {
            addCriterion("employee_bankcard <", value, "employeeBankcard");
            return (Criteria) this;
        }

        public Criteria andEmployeeBankcardLessThanOrEqualTo(String value) {
            addCriterion("employee_bankcard <=", value, "employeeBankcard");
            return (Criteria) this;
        }

        public Criteria andEmployeeBankcardLike(String value) {
            addCriterion("employee_bankcard like", value, "employeeBankcard");
            return (Criteria) this;
        }

        public Criteria andEmployeeBankcardNotLike(String value) {
            addCriterion("employee_bankcard not like", value, "employeeBankcard");
            return (Criteria) this;
        }

        public Criteria andEmployeeBankcardIn(List<String> values) {
            addCriterion("employee_bankcard in", values, "employeeBankcard");
            return (Criteria) this;
        }

        public Criteria andEmployeeBankcardNotIn(List<String> values) {
            addCriterion("employee_bankcard not in", values, "employeeBankcard");
            return (Criteria) this;
        }

        public Criteria andEmployeeBankcardBetween(String value1, String value2) {
            addCriterion("employee_bankcard between", value1, value2, "employeeBankcard");
            return (Criteria) this;
        }

        public Criteria andEmployeeBankcardNotBetween(String value1, String value2) {
            addCriterion("employee_bankcard not between", value1, value2, "employeeBankcard");
            return (Criteria) this;
        }

        public Criteria andEmployeeIsHeadquarterIsNull() {
            addCriterion("employee_is_headquarter is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIsHeadquarterIsNotNull() {
            addCriterion("employee_is_headquarter is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIsHeadquarterEqualTo(String value) {
            addCriterion("employee_is_headquarter =", value, "employeeIsHeadquarter");
            return (Criteria) this;
        }

        public Criteria andEmployeeIsHeadquarterNotEqualTo(String value) {
            addCriterion("employee_is_headquarter <>", value, "employeeIsHeadquarter");
            return (Criteria) this;
        }

        public Criteria andEmployeeIsHeadquarterGreaterThan(String value) {
            addCriterion("employee_is_headquarter >", value, "employeeIsHeadquarter");
            return (Criteria) this;
        }

        public Criteria andEmployeeIsHeadquarterGreaterThanOrEqualTo(String value) {
            addCriterion("employee_is_headquarter >=", value, "employeeIsHeadquarter");
            return (Criteria) this;
        }

        public Criteria andEmployeeIsHeadquarterLessThan(String value) {
            addCriterion("employee_is_headquarter <", value, "employeeIsHeadquarter");
            return (Criteria) this;
        }

        public Criteria andEmployeeIsHeadquarterLessThanOrEqualTo(String value) {
            addCriterion("employee_is_headquarter <=", value, "employeeIsHeadquarter");
            return (Criteria) this;
        }

        public Criteria andEmployeeIsHeadquarterLike(String value) {
            addCriterion("employee_is_headquarter like", value, "employeeIsHeadquarter");
            return (Criteria) this;
        }

        public Criteria andEmployeeIsHeadquarterNotLike(String value) {
            addCriterion("employee_is_headquarter not like", value, "employeeIsHeadquarter");
            return (Criteria) this;
        }

        public Criteria andEmployeeIsHeadquarterIn(List<String> values) {
            addCriterion("employee_is_headquarter in", values, "employeeIsHeadquarter");
            return (Criteria) this;
        }

        public Criteria andEmployeeIsHeadquarterNotIn(List<String> values) {
            addCriterion("employee_is_headquarter not in", values, "employeeIsHeadquarter");
            return (Criteria) this;
        }

        public Criteria andEmployeeIsHeadquarterBetween(String value1, String value2) {
            addCriterion("employee_is_headquarter between", value1, value2, "employeeIsHeadquarter");
            return (Criteria) this;
        }

        public Criteria andEmployeeIsHeadquarterNotBetween(String value1, String value2) {
            addCriterion("employee_is_headquarter not between", value1, value2, "employeeIsHeadquarter");
            return (Criteria) this;
        }

        public Criteria andEmployeeSalaryIsNull() {
            addCriterion("employee_salary is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeSalaryIsNotNull() {
            addCriterion("employee_salary is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeSalaryEqualTo(BigDecimal value) {
            addCriterion("employee_salary =", value, "employeeSalary");
            return (Criteria) this;
        }

        public Criteria andEmployeeSalaryNotEqualTo(BigDecimal value) {
            addCriterion("employee_salary <>", value, "employeeSalary");
            return (Criteria) this;
        }

        public Criteria andEmployeeSalaryGreaterThan(BigDecimal value) {
            addCriterion("employee_salary >", value, "employeeSalary");
            return (Criteria) this;
        }

        public Criteria andEmployeeSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_salary >=", value, "employeeSalary");
            return (Criteria) this;
        }

        public Criteria andEmployeeSalaryLessThan(BigDecimal value) {
            addCriterion("employee_salary <", value, "employeeSalary");
            return (Criteria) this;
        }

        public Criteria andEmployeeSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("employee_salary <=", value, "employeeSalary");
            return (Criteria) this;
        }

        public Criteria andEmployeeSalaryIn(List<BigDecimal> values) {
            addCriterion("employee_salary in", values, "employeeSalary");
            return (Criteria) this;
        }

        public Criteria andEmployeeSalaryNotIn(List<BigDecimal> values) {
            addCriterion("employee_salary not in", values, "employeeSalary");
            return (Criteria) this;
        }

        public Criteria andEmployeeSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_salary between", value1, value2, "employeeSalary");
            return (Criteria) this;
        }

        public Criteria andEmployeeSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("employee_salary not between", value1, value2, "employeeSalary");
            return (Criteria) this;
        }

        public Criteria andEmployeeShopIdIsNull() {
            addCriterion("employee_shop_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeShopIdIsNotNull() {
            addCriterion("employee_shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeShopIdEqualTo(Long value) {
            addCriterion("employee_shop_id =", value, "employeeShopId");
            return (Criteria) this;
        }

        public Criteria andEmployeeShopIdNotEqualTo(Long value) {
            addCriterion("employee_shop_id <>", value, "employeeShopId");
            return (Criteria) this;
        }

        public Criteria andEmployeeShopIdGreaterThan(Long value) {
            addCriterion("employee_shop_id >", value, "employeeShopId");
            return (Criteria) this;
        }

        public Criteria andEmployeeShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("employee_shop_id >=", value, "employeeShopId");
            return (Criteria) this;
        }

        public Criteria andEmployeeShopIdLessThan(Long value) {
            addCriterion("employee_shop_id <", value, "employeeShopId");
            return (Criteria) this;
        }

        public Criteria andEmployeeShopIdLessThanOrEqualTo(Long value) {
            addCriterion("employee_shop_id <=", value, "employeeShopId");
            return (Criteria) this;
        }

        public Criteria andEmployeeShopIdIn(List<Long> values) {
            addCriterion("employee_shop_id in", values, "employeeShopId");
            return (Criteria) this;
        }

        public Criteria andEmployeeShopIdNotIn(List<Long> values) {
            addCriterion("employee_shop_id not in", values, "employeeShopId");
            return (Criteria) this;
        }

        public Criteria andEmployeeShopIdBetween(Long value1, Long value2) {
            addCriterion("employee_shop_id between", value1, value2, "employeeShopId");
            return (Criteria) this;
        }

        public Criteria andEmployeeShopIdNotBetween(Long value1, Long value2) {
            addCriterion("employee_shop_id not between", value1, value2, "employeeShopId");
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