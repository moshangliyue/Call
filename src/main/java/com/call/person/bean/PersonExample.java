package com.call.person.bean;

import java.util.ArrayList;
import java.util.List;

public class PersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPlocationIsNull() {
            addCriterion("plocation is null");
            return (Criteria) this;
        }

        public Criteria andPlocationIsNotNull() {
            addCriterion("plocation is not null");
            return (Criteria) this;
        }

        public Criteria andPlocationEqualTo(String value) {
            addCriterion("plocation =", value, "plocation");
            return (Criteria) this;
        }

        public Criteria andPlocationNotEqualTo(String value) {
            addCriterion("plocation <>", value, "plocation");
            return (Criteria) this;
        }

        public Criteria andPlocationGreaterThan(String value) {
            addCriterion("plocation >", value, "plocation");
            return (Criteria) this;
        }

        public Criteria andPlocationGreaterThanOrEqualTo(String value) {
            addCriterion("plocation >=", value, "plocation");
            return (Criteria) this;
        }

        public Criteria andPlocationLessThan(String value) {
            addCriterion("plocation <", value, "plocation");
            return (Criteria) this;
        }

        public Criteria andPlocationLessThanOrEqualTo(String value) {
            addCriterion("plocation <=", value, "plocation");
            return (Criteria) this;
        }

        public Criteria andPlocationLike(String value) {
            addCriterion("plocation like", value, "plocation");
            return (Criteria) this;
        }

        public Criteria andPlocationNotLike(String value) {
            addCriterion("plocation not like", value, "plocation");
            return (Criteria) this;
        }

        public Criteria andPlocationIn(List<String> values) {
            addCriterion("plocation in", values, "plocation");
            return (Criteria) this;
        }

        public Criteria andPlocationNotIn(List<String> values) {
            addCriterion("plocation not in", values, "plocation");
            return (Criteria) this;
        }

        public Criteria andPlocationBetween(String value1, String value2) {
            addCriterion("plocation between", value1, value2, "plocation");
            return (Criteria) this;
        }

        public Criteria andPlocationNotBetween(String value1, String value2) {
            addCriterion("plocation not between", value1, value2, "plocation");
            return (Criteria) this;
        }

        public Criteria andPaddressIsNull() {
            addCriterion("paddress is null");
            return (Criteria) this;
        }

        public Criteria andPaddressIsNotNull() {
            addCriterion("paddress is not null");
            return (Criteria) this;
        }

        public Criteria andPaddressEqualTo(String value) {
            addCriterion("paddress =", value, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressNotEqualTo(String value) {
            addCriterion("paddress <>", value, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressGreaterThan(String value) {
            addCriterion("paddress >", value, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressGreaterThanOrEqualTo(String value) {
            addCriterion("paddress >=", value, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressLessThan(String value) {
            addCriterion("paddress <", value, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressLessThanOrEqualTo(String value) {
            addCriterion("paddress <=", value, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressLike(String value) {
            addCriterion("paddress like", value, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressNotLike(String value) {
            addCriterion("paddress not like", value, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressIn(List<String> values) {
            addCriterion("paddress in", values, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressNotIn(List<String> values) {
            addCriterion("paddress not in", values, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressBetween(String value1, String value2) {
            addCriterion("paddress between", value1, value2, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressNotBetween(String value1, String value2) {
            addCriterion("paddress not between", value1, value2, "paddress");
            return (Criteria) this;
        }

        public Criteria andPzipcodeIsNull() {
            addCriterion("pzipcode is null");
            return (Criteria) this;
        }

        public Criteria andPzipcodeIsNotNull() {
            addCriterion("pzipcode is not null");
            return (Criteria) this;
        }

        public Criteria andPzipcodeEqualTo(String value) {
            addCriterion("pzipcode =", value, "pzipcode");
            return (Criteria) this;
        }

        public Criteria andPzipcodeNotEqualTo(String value) {
            addCriterion("pzipcode <>", value, "pzipcode");
            return (Criteria) this;
        }

        public Criteria andPzipcodeGreaterThan(String value) {
            addCriterion("pzipcode >", value, "pzipcode");
            return (Criteria) this;
        }

        public Criteria andPzipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("pzipcode >=", value, "pzipcode");
            return (Criteria) this;
        }

        public Criteria andPzipcodeLessThan(String value) {
            addCriterion("pzipcode <", value, "pzipcode");
            return (Criteria) this;
        }

        public Criteria andPzipcodeLessThanOrEqualTo(String value) {
            addCriterion("pzipcode <=", value, "pzipcode");
            return (Criteria) this;
        }

        public Criteria andPzipcodeLike(String value) {
            addCriterion("pzipcode like", value, "pzipcode");
            return (Criteria) this;
        }

        public Criteria andPzipcodeNotLike(String value) {
            addCriterion("pzipcode not like", value, "pzipcode");
            return (Criteria) this;
        }

        public Criteria andPzipcodeIn(List<String> values) {
            addCriterion("pzipcode in", values, "pzipcode");
            return (Criteria) this;
        }

        public Criteria andPzipcodeNotIn(List<String> values) {
            addCriterion("pzipcode not in", values, "pzipcode");
            return (Criteria) this;
        }

        public Criteria andPzipcodeBetween(String value1, String value2) {
            addCriterion("pzipcode between", value1, value2, "pzipcode");
            return (Criteria) this;
        }

        public Criteria andPzipcodeNotBetween(String value1, String value2) {
            addCriterion("pzipcode not between", value1, value2, "pzipcode");
            return (Criteria) this;
        }

        public Criteria andPnameIsNull() {
            addCriterion("pname is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pname is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pname =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pname <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pname >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pname >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pname <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pname <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pname like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pname not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pname in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pname not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pname between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pname not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPphonIsNull() {
            addCriterion("pphon is null");
            return (Criteria) this;
        }

        public Criteria andPphonIsNotNull() {
            addCriterion("pphon is not null");
            return (Criteria) this;
        }

        public Criteria andPphonEqualTo(String value) {
            addCriterion("pphon =", value, "pphon");
            return (Criteria) this;
        }

        public Criteria andPphonNotEqualTo(String value) {
            addCriterion("pphon <>", value, "pphon");
            return (Criteria) this;
        }

        public Criteria andPphonGreaterThan(String value) {
            addCriterion("pphon >", value, "pphon");
            return (Criteria) this;
        }

        public Criteria andPphonGreaterThanOrEqualTo(String value) {
            addCriterion("pphon >=", value, "pphon");
            return (Criteria) this;
        }

        public Criteria andPphonLessThan(String value) {
            addCriterion("pphon <", value, "pphon");
            return (Criteria) this;
        }

        public Criteria andPphonLessThanOrEqualTo(String value) {
            addCriterion("pphon <=", value, "pphon");
            return (Criteria) this;
        }

        public Criteria andPphonLike(String value) {
            addCriterion("pphon like", value, "pphon");
            return (Criteria) this;
        }

        public Criteria andPphonNotLike(String value) {
            addCriterion("pphon not like", value, "pphon");
            return (Criteria) this;
        }

        public Criteria andPphonIn(List<String> values) {
            addCriterion("pphon in", values, "pphon");
            return (Criteria) this;
        }

        public Criteria andPphonNotIn(List<String> values) {
            addCriterion("pphon not in", values, "pphon");
            return (Criteria) this;
        }

        public Criteria andPphonBetween(String value1, String value2) {
            addCriterion("pphon between", value1, value2, "pphon");
            return (Criteria) this;
        }

        public Criteria andPphonNotBetween(String value1, String value2) {
            addCriterion("pphon not between", value1, value2, "pphon");
            return (Criteria) this;
        }

        public Criteria andPdianhuaIsNull() {
            addCriterion("pdianhua is null");
            return (Criteria) this;
        }

        public Criteria andPdianhuaIsNotNull() {
            addCriterion("pdianhua is not null");
            return (Criteria) this;
        }

        public Criteria andPdianhuaEqualTo(String value) {
            addCriterion("pdianhua =", value, "pdianhua");
            return (Criteria) this;
        }

        public Criteria andPdianhuaNotEqualTo(String value) {
            addCriterion("pdianhua <>", value, "pdianhua");
            return (Criteria) this;
        }

        public Criteria andPdianhuaGreaterThan(String value) {
            addCriterion("pdianhua >", value, "pdianhua");
            return (Criteria) this;
        }

        public Criteria andPdianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("pdianhua >=", value, "pdianhua");
            return (Criteria) this;
        }

        public Criteria andPdianhuaLessThan(String value) {
            addCriterion("pdianhua <", value, "pdianhua");
            return (Criteria) this;
        }

        public Criteria andPdianhuaLessThanOrEqualTo(String value) {
            addCriterion("pdianhua <=", value, "pdianhua");
            return (Criteria) this;
        }

        public Criteria andPdianhuaLike(String value) {
            addCriterion("pdianhua like", value, "pdianhua");
            return (Criteria) this;
        }

        public Criteria andPdianhuaNotLike(String value) {
            addCriterion("pdianhua not like", value, "pdianhua");
            return (Criteria) this;
        }

        public Criteria andPdianhuaIn(List<String> values) {
            addCriterion("pdianhua in", values, "pdianhua");
            return (Criteria) this;
        }

        public Criteria andPdianhuaNotIn(List<String> values) {
            addCriterion("pdianhua not in", values, "pdianhua");
            return (Criteria) this;
        }

        public Criteria andPdianhuaBetween(String value1, String value2) {
            addCriterion("pdianhua between", value1, value2, "pdianhua");
            return (Criteria) this;
        }

        public Criteria andPdianhuaNotBetween(String value1, String value2) {
            addCriterion("pdianhua not between", value1, value2, "pdianhua");
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