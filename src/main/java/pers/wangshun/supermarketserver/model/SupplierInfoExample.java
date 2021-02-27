package pers.wangshun.supermarketserver.model;

import java.util.ArrayList;
import java.util.List;

public class SupplierInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierInfoExample() {
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

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Integer value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Integer value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Integer value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Integer value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Integer> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Integer> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
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

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("supplier_name =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("supplier_name <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("supplier_name >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_name >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("supplier_name <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("supplier_name <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("supplier_name like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("supplier_name not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("supplier_name in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("supplier_name not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("supplier_name between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("supplier_name not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierAreaIsNull() {
            addCriterion("supplier_area is null");
            return (Criteria) this;
        }

        public Criteria andSupplierAreaIsNotNull() {
            addCriterion("supplier_area is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierAreaEqualTo(String value) {
            addCriterion("supplier_area =", value, "supplierArea");
            return (Criteria) this;
        }

        public Criteria andSupplierAreaNotEqualTo(String value) {
            addCriterion("supplier_area <>", value, "supplierArea");
            return (Criteria) this;
        }

        public Criteria andSupplierAreaGreaterThan(String value) {
            addCriterion("supplier_area >", value, "supplierArea");
            return (Criteria) this;
        }

        public Criteria andSupplierAreaGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_area >=", value, "supplierArea");
            return (Criteria) this;
        }

        public Criteria andSupplierAreaLessThan(String value) {
            addCriterion("supplier_area <", value, "supplierArea");
            return (Criteria) this;
        }

        public Criteria andSupplierAreaLessThanOrEqualTo(String value) {
            addCriterion("supplier_area <=", value, "supplierArea");
            return (Criteria) this;
        }

        public Criteria andSupplierAreaLike(String value) {
            addCriterion("supplier_area like", value, "supplierArea");
            return (Criteria) this;
        }

        public Criteria andSupplierAreaNotLike(String value) {
            addCriterion("supplier_area not like", value, "supplierArea");
            return (Criteria) this;
        }

        public Criteria andSupplierAreaIn(List<String> values) {
            addCriterion("supplier_area in", values, "supplierArea");
            return (Criteria) this;
        }

        public Criteria andSupplierAreaNotIn(List<String> values) {
            addCriterion("supplier_area not in", values, "supplierArea");
            return (Criteria) this;
        }

        public Criteria andSupplierAreaBetween(String value1, String value2) {
            addCriterion("supplier_area between", value1, value2, "supplierArea");
            return (Criteria) this;
        }

        public Criteria andSupplierAreaNotBetween(String value1, String value2) {
            addCriterion("supplier_area not between", value1, value2, "supplierArea");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNumberIsNull() {
            addCriterion("supplier_contact_number is null");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNumberIsNotNull() {
            addCriterion("supplier_contact_number is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNumberEqualTo(String value) {
            addCriterion("supplier_contact_number =", value, "supplierContactNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNumberNotEqualTo(String value) {
            addCriterion("supplier_contact_number <>", value, "supplierContactNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNumberGreaterThan(String value) {
            addCriterion("supplier_contact_number >", value, "supplierContactNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNumberGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_contact_number >=", value, "supplierContactNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNumberLessThan(String value) {
            addCriterion("supplier_contact_number <", value, "supplierContactNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNumberLessThanOrEqualTo(String value) {
            addCriterion("supplier_contact_number <=", value, "supplierContactNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNumberLike(String value) {
            addCriterion("supplier_contact_number like", value, "supplierContactNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNumberNotLike(String value) {
            addCriterion("supplier_contact_number not like", value, "supplierContactNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNumberIn(List<String> values) {
            addCriterion("supplier_contact_number in", values, "supplierContactNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNumberNotIn(List<String> values) {
            addCriterion("supplier_contact_number not in", values, "supplierContactNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNumberBetween(String value1, String value2) {
            addCriterion("supplier_contact_number between", value1, value2, "supplierContactNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierContactNumberNotBetween(String value1, String value2) {
            addCriterion("supplier_contact_number not between", value1, value2, "supplierContactNumber");
            return (Criteria) this;
        }

        public Criteria andSupplierContactPersonIsNull() {
            addCriterion("supplier_contact_person is null");
            return (Criteria) this;
        }

        public Criteria andSupplierContactPersonIsNotNull() {
            addCriterion("supplier_contact_person is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierContactPersonEqualTo(String value) {
            addCriterion("supplier_contact_person =", value, "supplierContactPerson");
            return (Criteria) this;
        }

        public Criteria andSupplierContactPersonNotEqualTo(String value) {
            addCriterion("supplier_contact_person <>", value, "supplierContactPerson");
            return (Criteria) this;
        }

        public Criteria andSupplierContactPersonGreaterThan(String value) {
            addCriterion("supplier_contact_person >", value, "supplierContactPerson");
            return (Criteria) this;
        }

        public Criteria andSupplierContactPersonGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_contact_person >=", value, "supplierContactPerson");
            return (Criteria) this;
        }

        public Criteria andSupplierContactPersonLessThan(String value) {
            addCriterion("supplier_contact_person <", value, "supplierContactPerson");
            return (Criteria) this;
        }

        public Criteria andSupplierContactPersonLessThanOrEqualTo(String value) {
            addCriterion("supplier_contact_person <=", value, "supplierContactPerson");
            return (Criteria) this;
        }

        public Criteria andSupplierContactPersonLike(String value) {
            addCriterion("supplier_contact_person like", value, "supplierContactPerson");
            return (Criteria) this;
        }

        public Criteria andSupplierContactPersonNotLike(String value) {
            addCriterion("supplier_contact_person not like", value, "supplierContactPerson");
            return (Criteria) this;
        }

        public Criteria andSupplierContactPersonIn(List<String> values) {
            addCriterion("supplier_contact_person in", values, "supplierContactPerson");
            return (Criteria) this;
        }

        public Criteria andSupplierContactPersonNotIn(List<String> values) {
            addCriterion("supplier_contact_person not in", values, "supplierContactPerson");
            return (Criteria) this;
        }

        public Criteria andSupplierContactPersonBetween(String value1, String value2) {
            addCriterion("supplier_contact_person between", value1, value2, "supplierContactPerson");
            return (Criteria) this;
        }

        public Criteria andSupplierContactPersonNotBetween(String value1, String value2) {
            addCriterion("supplier_contact_person not between", value1, value2, "supplierContactPerson");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneIsNull() {
            addCriterion("supplier_phone is null");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneIsNotNull() {
            addCriterion("supplier_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneEqualTo(String value) {
            addCriterion("supplier_phone =", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneNotEqualTo(String value) {
            addCriterion("supplier_phone <>", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneGreaterThan(String value) {
            addCriterion("supplier_phone >", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_phone >=", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneLessThan(String value) {
            addCriterion("supplier_phone <", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneLessThanOrEqualTo(String value) {
            addCriterion("supplier_phone <=", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneLike(String value) {
            addCriterion("supplier_phone like", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneNotLike(String value) {
            addCriterion("supplier_phone not like", value, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneIn(List<String> values) {
            addCriterion("supplier_phone in", values, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneNotIn(List<String> values) {
            addCriterion("supplier_phone not in", values, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneBetween(String value1, String value2) {
            addCriterion("supplier_phone between", value1, value2, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierPhoneNotBetween(String value1, String value2) {
            addCriterion("supplier_phone not between", value1, value2, "supplierPhone");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailIsNull() {
            addCriterion("supplier_email is null");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailIsNotNull() {
            addCriterion("supplier_email is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailEqualTo(String value) {
            addCriterion("supplier_email =", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailNotEqualTo(String value) {
            addCriterion("supplier_email <>", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailGreaterThan(String value) {
            addCriterion("supplier_email >", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_email >=", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailLessThan(String value) {
            addCriterion("supplier_email <", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailLessThanOrEqualTo(String value) {
            addCriterion("supplier_email <=", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailLike(String value) {
            addCriterion("supplier_email like", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailNotLike(String value) {
            addCriterion("supplier_email not like", value, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailIn(List<String> values) {
            addCriterion("supplier_email in", values, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailNotIn(List<String> values) {
            addCriterion("supplier_email not in", values, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailBetween(String value1, String value2) {
            addCriterion("supplier_email between", value1, value2, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierEmailNotBetween(String value1, String value2) {
            addCriterion("supplier_email not between", value1, value2, "supplierEmail");
            return (Criteria) this;
        }

        public Criteria andSupplierTelephoneIsNull() {
            addCriterion("supplier_telephone is null");
            return (Criteria) this;
        }

        public Criteria andSupplierTelephoneIsNotNull() {
            addCriterion("supplier_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierTelephoneEqualTo(String value) {
            addCriterion("supplier_telephone =", value, "supplierTelephone");
            return (Criteria) this;
        }

        public Criteria andSupplierTelephoneNotEqualTo(String value) {
            addCriterion("supplier_telephone <>", value, "supplierTelephone");
            return (Criteria) this;
        }

        public Criteria andSupplierTelephoneGreaterThan(String value) {
            addCriterion("supplier_telephone >", value, "supplierTelephone");
            return (Criteria) this;
        }

        public Criteria andSupplierTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_telephone >=", value, "supplierTelephone");
            return (Criteria) this;
        }

        public Criteria andSupplierTelephoneLessThan(String value) {
            addCriterion("supplier_telephone <", value, "supplierTelephone");
            return (Criteria) this;
        }

        public Criteria andSupplierTelephoneLessThanOrEqualTo(String value) {
            addCriterion("supplier_telephone <=", value, "supplierTelephone");
            return (Criteria) this;
        }

        public Criteria andSupplierTelephoneLike(String value) {
            addCriterion("supplier_telephone like", value, "supplierTelephone");
            return (Criteria) this;
        }

        public Criteria andSupplierTelephoneNotLike(String value) {
            addCriterion("supplier_telephone not like", value, "supplierTelephone");
            return (Criteria) this;
        }

        public Criteria andSupplierTelephoneIn(List<String> values) {
            addCriterion("supplier_telephone in", values, "supplierTelephone");
            return (Criteria) this;
        }

        public Criteria andSupplierTelephoneNotIn(List<String> values) {
            addCriterion("supplier_telephone not in", values, "supplierTelephone");
            return (Criteria) this;
        }

        public Criteria andSupplierTelephoneBetween(String value1, String value2) {
            addCriterion("supplier_telephone between", value1, value2, "supplierTelephone");
            return (Criteria) this;
        }

        public Criteria andSupplierTelephoneNotBetween(String value1, String value2) {
            addCriterion("supplier_telephone not between", value1, value2, "supplierTelephone");
            return (Criteria) this;
        }

        public Criteria andSupplierDepositBankIsNull() {
            addCriterion("supplier_deposit_bank is null");
            return (Criteria) this;
        }

        public Criteria andSupplierDepositBankIsNotNull() {
            addCriterion("supplier_deposit_bank is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierDepositBankEqualTo(String value) {
            addCriterion("supplier_deposit_bank =", value, "supplierDepositBank");
            return (Criteria) this;
        }

        public Criteria andSupplierDepositBankNotEqualTo(String value) {
            addCriterion("supplier_deposit_bank <>", value, "supplierDepositBank");
            return (Criteria) this;
        }

        public Criteria andSupplierDepositBankGreaterThan(String value) {
            addCriterion("supplier_deposit_bank >", value, "supplierDepositBank");
            return (Criteria) this;
        }

        public Criteria andSupplierDepositBankGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_deposit_bank >=", value, "supplierDepositBank");
            return (Criteria) this;
        }

        public Criteria andSupplierDepositBankLessThan(String value) {
            addCriterion("supplier_deposit_bank <", value, "supplierDepositBank");
            return (Criteria) this;
        }

        public Criteria andSupplierDepositBankLessThanOrEqualTo(String value) {
            addCriterion("supplier_deposit_bank <=", value, "supplierDepositBank");
            return (Criteria) this;
        }

        public Criteria andSupplierDepositBankLike(String value) {
            addCriterion("supplier_deposit_bank like", value, "supplierDepositBank");
            return (Criteria) this;
        }

        public Criteria andSupplierDepositBankNotLike(String value) {
            addCriterion("supplier_deposit_bank not like", value, "supplierDepositBank");
            return (Criteria) this;
        }

        public Criteria andSupplierDepositBankIn(List<String> values) {
            addCriterion("supplier_deposit_bank in", values, "supplierDepositBank");
            return (Criteria) this;
        }

        public Criteria andSupplierDepositBankNotIn(List<String> values) {
            addCriterion("supplier_deposit_bank not in", values, "supplierDepositBank");
            return (Criteria) this;
        }

        public Criteria andSupplierDepositBankBetween(String value1, String value2) {
            addCriterion("supplier_deposit_bank between", value1, value2, "supplierDepositBank");
            return (Criteria) this;
        }

        public Criteria andSupplierDepositBankNotBetween(String value1, String value2) {
            addCriterion("supplier_deposit_bank not between", value1, value2, "supplierDepositBank");
            return (Criteria) this;
        }

        public Criteria andSupplierBankAccountIsNull() {
            addCriterion("supplier_bank_account is null");
            return (Criteria) this;
        }

        public Criteria andSupplierBankAccountIsNotNull() {
            addCriterion("supplier_bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierBankAccountEqualTo(String value) {
            addCriterion("supplier_bank_account =", value, "supplierBankAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierBankAccountNotEqualTo(String value) {
            addCriterion("supplier_bank_account <>", value, "supplierBankAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierBankAccountGreaterThan(String value) {
            addCriterion("supplier_bank_account >", value, "supplierBankAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_bank_account >=", value, "supplierBankAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierBankAccountLessThan(String value) {
            addCriterion("supplier_bank_account <", value, "supplierBankAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierBankAccountLessThanOrEqualTo(String value) {
            addCriterion("supplier_bank_account <=", value, "supplierBankAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierBankAccountLike(String value) {
            addCriterion("supplier_bank_account like", value, "supplierBankAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierBankAccountNotLike(String value) {
            addCriterion("supplier_bank_account not like", value, "supplierBankAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierBankAccountIn(List<String> values) {
            addCriterion("supplier_bank_account in", values, "supplierBankAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierBankAccountNotIn(List<String> values) {
            addCriterion("supplier_bank_account not in", values, "supplierBankAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierBankAccountBetween(String value1, String value2) {
            addCriterion("supplier_bank_account between", value1, value2, "supplierBankAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierBankAccountNotBetween(String value1, String value2) {
            addCriterion("supplier_bank_account not between", value1, value2, "supplierBankAccount");
            return (Criteria) this;
        }

        public Criteria andSupplierSiteIsNull() {
            addCriterion("supplier_site is null");
            return (Criteria) this;
        }

        public Criteria andSupplierSiteIsNotNull() {
            addCriterion("supplier_site is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierSiteEqualTo(String value) {
            addCriterion("supplier_site =", value, "supplierSite");
            return (Criteria) this;
        }

        public Criteria andSupplierSiteNotEqualTo(String value) {
            addCriterion("supplier_site <>", value, "supplierSite");
            return (Criteria) this;
        }

        public Criteria andSupplierSiteGreaterThan(String value) {
            addCriterion("supplier_site >", value, "supplierSite");
            return (Criteria) this;
        }

        public Criteria andSupplierSiteGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_site >=", value, "supplierSite");
            return (Criteria) this;
        }

        public Criteria andSupplierSiteLessThan(String value) {
            addCriterion("supplier_site <", value, "supplierSite");
            return (Criteria) this;
        }

        public Criteria andSupplierSiteLessThanOrEqualTo(String value) {
            addCriterion("supplier_site <=", value, "supplierSite");
            return (Criteria) this;
        }

        public Criteria andSupplierSiteLike(String value) {
            addCriterion("supplier_site like", value, "supplierSite");
            return (Criteria) this;
        }

        public Criteria andSupplierSiteNotLike(String value) {
            addCriterion("supplier_site not like", value, "supplierSite");
            return (Criteria) this;
        }

        public Criteria andSupplierSiteIn(List<String> values) {
            addCriterion("supplier_site in", values, "supplierSite");
            return (Criteria) this;
        }

        public Criteria andSupplierSiteNotIn(List<String> values) {
            addCriterion("supplier_site not in", values, "supplierSite");
            return (Criteria) this;
        }

        public Criteria andSupplierSiteBetween(String value1, String value2) {
            addCriterion("supplier_site between", value1, value2, "supplierSite");
            return (Criteria) this;
        }

        public Criteria andSupplierSiteNotBetween(String value1, String value2) {
            addCriterion("supplier_site not between", value1, value2, "supplierSite");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarksIsNull() {
            addCriterion("supplier_remarks is null");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarksIsNotNull() {
            addCriterion("supplier_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarksEqualTo(String value) {
            addCriterion("supplier_remarks =", value, "supplierRemarks");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarksNotEqualTo(String value) {
            addCriterion("supplier_remarks <>", value, "supplierRemarks");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarksGreaterThan(String value) {
            addCriterion("supplier_remarks >", value, "supplierRemarks");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_remarks >=", value, "supplierRemarks");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarksLessThan(String value) {
            addCriterion("supplier_remarks <", value, "supplierRemarks");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarksLessThanOrEqualTo(String value) {
            addCriterion("supplier_remarks <=", value, "supplierRemarks");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarksLike(String value) {
            addCriterion("supplier_remarks like", value, "supplierRemarks");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarksNotLike(String value) {
            addCriterion("supplier_remarks not like", value, "supplierRemarks");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarksIn(List<String> values) {
            addCriterion("supplier_remarks in", values, "supplierRemarks");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarksNotIn(List<String> values) {
            addCriterion("supplier_remarks not in", values, "supplierRemarks");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarksBetween(String value1, String value2) {
            addCriterion("supplier_remarks between", value1, value2, "supplierRemarks");
            return (Criteria) this;
        }

        public Criteria andSupplierRemarksNotBetween(String value1, String value2) {
            addCriterion("supplier_remarks not between", value1, value2, "supplierRemarks");
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