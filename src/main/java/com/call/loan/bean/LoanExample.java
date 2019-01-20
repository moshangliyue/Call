package com.call.loan.bean;

import java.util.ArrayList;
import java.util.List;

public class LoanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoanExample() {
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

        public Criteria andLidIsNull() {
            addCriterion("lid is null");
            return (Criteria) this;
        }

        public Criteria andLidIsNotNull() {
            addCriterion("lid is not null");
            return (Criteria) this;
        }

        public Criteria andLidEqualTo(Integer value) {
            addCriterion("lid =", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotEqualTo(Integer value) {
            addCriterion("lid <>", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThan(Integer value) {
            addCriterion("lid >", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lid >=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThan(Integer value) {
            addCriterion("lid <", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThanOrEqualTo(Integer value) {
            addCriterion("lid <=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidIn(List<Integer> values) {
            addCriterion("lid in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotIn(List<Integer> values) {
            addCriterion("lid not in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidBetween(Integer value1, Integer value2) {
            addCriterion("lid between", value1, value2, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotBetween(Integer value1, Integer value2) {
            addCriterion("lid not between", value1, value2, "lid");
            return (Criteria) this;
        }

        public Criteria andLnumberIsNull() {
            addCriterion("lnumber is null");
            return (Criteria) this;
        }

        public Criteria andLnumberIsNotNull() {
            addCriterion("lnumber is not null");
            return (Criteria) this;
        }

        public Criteria andLnumberEqualTo(Integer value) {
            addCriterion("lnumber =", value, "lnumber");
            return (Criteria) this;
        }

        public Criteria andLnumberNotEqualTo(Integer value) {
            addCriterion("lnumber <>", value, "lnumber");
            return (Criteria) this;
        }

        public Criteria andLnumberGreaterThan(Integer value) {
            addCriterion("lnumber >", value, "lnumber");
            return (Criteria) this;
        }

        public Criteria andLnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("lnumber >=", value, "lnumber");
            return (Criteria) this;
        }

        public Criteria andLnumberLessThan(Integer value) {
            addCriterion("lnumber <", value, "lnumber");
            return (Criteria) this;
        }

        public Criteria andLnumberLessThanOrEqualTo(Integer value) {
            addCriterion("lnumber <=", value, "lnumber");
            return (Criteria) this;
        }

        public Criteria andLnumberIn(List<Integer> values) {
            addCriterion("lnumber in", values, "lnumber");
            return (Criteria) this;
        }

        public Criteria andLnumberNotIn(List<Integer> values) {
            addCriterion("lnumber not in", values, "lnumber");
            return (Criteria) this;
        }

        public Criteria andLnumberBetween(Integer value1, Integer value2) {
            addCriterion("lnumber between", value1, value2, "lnumber");
            return (Criteria) this;
        }

        public Criteria andLnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("lnumber not between", value1, value2, "lnumber");
            return (Criteria) this;
        }

        public Criteria andLqishuIsNull() {
            addCriterion("lqishu is null");
            return (Criteria) this;
        }

        public Criteria andLqishuIsNotNull() {
            addCriterion("lqishu is not null");
            return (Criteria) this;
        }

        public Criteria andLqishuEqualTo(Integer value) {
            addCriterion("lqishu =", value, "lqishu");
            return (Criteria) this;
        }

        public Criteria andLqishuNotEqualTo(Integer value) {
            addCriterion("lqishu <>", value, "lqishu");
            return (Criteria) this;
        }

        public Criteria andLqishuGreaterThan(Integer value) {
            addCriterion("lqishu >", value, "lqishu");
            return (Criteria) this;
        }

        public Criteria andLqishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("lqishu >=", value, "lqishu");
            return (Criteria) this;
        }

        public Criteria andLqishuLessThan(Integer value) {
            addCriterion("lqishu <", value, "lqishu");
            return (Criteria) this;
        }

        public Criteria andLqishuLessThanOrEqualTo(Integer value) {
            addCriterion("lqishu <=", value, "lqishu");
            return (Criteria) this;
        }

        public Criteria andLqishuIn(List<Integer> values) {
            addCriterion("lqishu in", values, "lqishu");
            return (Criteria) this;
        }

        public Criteria andLqishuNotIn(List<Integer> values) {
            addCriterion("lqishu not in", values, "lqishu");
            return (Criteria) this;
        }

        public Criteria andLqishuBetween(Integer value1, Integer value2) {
            addCriterion("lqishu between", value1, value2, "lqishu");
            return (Criteria) this;
        }

        public Criteria andLqishuNotBetween(Integer value1, Integer value2) {
            addCriterion("lqishu not between", value1, value2, "lqishu");
            return (Criteria) this;
        }

        public Criteria andLzhuangtaiIsNull() {
            addCriterion("lzhuangtai is null");
            return (Criteria) this;
        }

        public Criteria andLzhuangtaiIsNotNull() {
            addCriterion("lzhuangtai is not null");
            return (Criteria) this;
        }

        public Criteria andLzhuangtaiEqualTo(Integer value) {
            addCriterion("lzhuangtai =", value, "lzhuangtai");
            return (Criteria) this;
        }

        public Criteria andLzhuangtaiNotEqualTo(Integer value) {
            addCriterion("lzhuangtai <>", value, "lzhuangtai");
            return (Criteria) this;
        }

        public Criteria andLzhuangtaiGreaterThan(Integer value) {
            addCriterion("lzhuangtai >", value, "lzhuangtai");
            return (Criteria) this;
        }

        public Criteria andLzhuangtaiGreaterThanOrEqualTo(Integer value) {
            addCriterion("lzhuangtai >=", value, "lzhuangtai");
            return (Criteria) this;
        }

        public Criteria andLzhuangtaiLessThan(Integer value) {
            addCriterion("lzhuangtai <", value, "lzhuangtai");
            return (Criteria) this;
        }

        public Criteria andLzhuangtaiLessThanOrEqualTo(Integer value) {
            addCriterion("lzhuangtai <=", value, "lzhuangtai");
            return (Criteria) this;
        }

        public Criteria andLzhuangtaiIn(List<Integer> values) {
            addCriterion("lzhuangtai in", values, "lzhuangtai");
            return (Criteria) this;
        }

        public Criteria andLzhuangtaiNotIn(List<Integer> values) {
            addCriterion("lzhuangtai not in", values, "lzhuangtai");
            return (Criteria) this;
        }

        public Criteria andLzhuangtaiBetween(Integer value1, Integer value2) {
            addCriterion("lzhuangtai between", value1, value2, "lzhuangtai");
            return (Criteria) this;
        }

        public Criteria andLzhuangtaiNotBetween(Integer value1, Integer value2) {
            addCriterion("lzhuangtai not between", value1, value2, "lzhuangtai");
            return (Criteria) this;
        }

        public Criteria andLpersonIsNull() {
            addCriterion("lperson is null");
            return (Criteria) this;
        }

        public Criteria andLpersonIsNotNull() {
            addCriterion("lperson is not null");
            return (Criteria) this;
        }

        public Criteria andLpersonEqualTo(String value) {
            addCriterion("lperson =", value, "lperson");
            return (Criteria) this;
        }

        public Criteria andLpersonNotEqualTo(String value) {
            addCriterion("lperson <>", value, "lperson");
            return (Criteria) this;
        }

        public Criteria andLpersonGreaterThan(String value) {
            addCriterion("lperson >", value, "lperson");
            return (Criteria) this;
        }

        public Criteria andLpersonGreaterThanOrEqualTo(String value) {
            addCriterion("lperson >=", value, "lperson");
            return (Criteria) this;
        }

        public Criteria andLpersonLessThan(String value) {
            addCriterion("lperson <", value, "lperson");
            return (Criteria) this;
        }

        public Criteria andLpersonLessThanOrEqualTo(String value) {
            addCriterion("lperson <=", value, "lperson");
            return (Criteria) this;
        }

        public Criteria andLpersonLike(String value) {
            addCriterion("lperson like", value, "lperson");
            return (Criteria) this;
        }

        public Criteria andLpersonNotLike(String value) {
            addCriterion("lperson not like", value, "lperson");
            return (Criteria) this;
        }

        public Criteria andLpersonIn(List<String> values) {
            addCriterion("lperson in", values, "lperson");
            return (Criteria) this;
        }

        public Criteria andLpersonNotIn(List<String> values) {
            addCriterion("lperson not in", values, "lperson");
            return (Criteria) this;
        }

        public Criteria andLpersonBetween(String value1, String value2) {
            addCriterion("lperson between", value1, value2, "lperson");
            return (Criteria) this;
        }

        public Criteria andLpersonNotBetween(String value1, String value2) {
            addCriterion("lperson not between", value1, value2, "lperson");
            return (Criteria) this;
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