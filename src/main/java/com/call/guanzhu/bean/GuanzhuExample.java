package com.call.guanzhu.bean;

import java.util.ArrayList;
import java.util.List;

public class GuanzhuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GuanzhuExample() {
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

        public Criteria andGuanzhuidIsNull() {
            addCriterion("guanzhuid is null");
            return (Criteria) this;
        }

        public Criteria andGuanzhuidIsNotNull() {
            addCriterion("guanzhuid is not null");
            return (Criteria) this;
        }

        public Criteria andGuanzhuidEqualTo(Integer value) {
            addCriterion("guanzhuid =", value, "guanzhuid");
            return (Criteria) this;
        }

        public Criteria andGuanzhuidNotEqualTo(Integer value) {
            addCriterion("guanzhuid <>", value, "guanzhuid");
            return (Criteria) this;
        }

        public Criteria andGuanzhuidGreaterThan(Integer value) {
            addCriterion("guanzhuid >", value, "guanzhuid");
            return (Criteria) this;
        }

        public Criteria andGuanzhuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("guanzhuid >=", value, "guanzhuid");
            return (Criteria) this;
        }

        public Criteria andGuanzhuidLessThan(Integer value) {
            addCriterion("guanzhuid <", value, "guanzhuid");
            return (Criteria) this;
        }

        public Criteria andGuanzhuidLessThanOrEqualTo(Integer value) {
            addCriterion("guanzhuid <=", value, "guanzhuid");
            return (Criteria) this;
        }

        public Criteria andGuanzhuidIn(List<Integer> values) {
            addCriterion("guanzhuid in", values, "guanzhuid");
            return (Criteria) this;
        }

        public Criteria andGuanzhuidNotIn(List<Integer> values) {
            addCriterion("guanzhuid not in", values, "guanzhuid");
            return (Criteria) this;
        }

        public Criteria andGuanzhuidBetween(Integer value1, Integer value2) {
            addCriterion("guanzhuid between", value1, value2, "guanzhuid");
            return (Criteria) this;
        }

        public Criteria andGuanzhuidNotBetween(Integer value1, Integer value2) {
            addCriterion("guanzhuid not between", value1, value2, "guanzhuid");
            return (Criteria) this;
        }

        public Criteria andCUidIsNull() {
            addCriterion("c_uid is null");
            return (Criteria) this;
        }

        public Criteria andCUidIsNotNull() {
            addCriterion("c_uid is not null");
            return (Criteria) this;
        }

        public Criteria andCUidEqualTo(Integer value) {
            addCriterion("c_uid =", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidNotEqualTo(Integer value) {
            addCriterion("c_uid <>", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidGreaterThan(Integer value) {
            addCriterion("c_uid >", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_uid >=", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidLessThan(Integer value) {
            addCriterion("c_uid <", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidLessThanOrEqualTo(Integer value) {
            addCriterion("c_uid <=", value, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidIn(List<Integer> values) {
            addCriterion("c_uid in", values, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidNotIn(List<Integer> values) {
            addCriterion("c_uid not in", values, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidBetween(Integer value1, Integer value2) {
            addCriterion("c_uid between", value1, value2, "cUid");
            return (Criteria) this;
        }

        public Criteria andCUidNotBetween(Integer value1, Integer value2) {
            addCriterion("c_uid not between", value1, value2, "cUid");
            return (Criteria) this;
        }

        public Criteria andPPidIsNull() {
            addCriterion("p_pid is null");
            return (Criteria) this;
        }

        public Criteria andPPidIsNotNull() {
            addCriterion("p_pid is not null");
            return (Criteria) this;
        }

        public Criteria andPPidEqualTo(Integer value) {
            addCriterion("p_pid =", value, "pPid");
            return (Criteria) this;
        }

        public Criteria andPPidNotEqualTo(Integer value) {
            addCriterion("p_pid <>", value, "pPid");
            return (Criteria) this;
        }

        public Criteria andPPidGreaterThan(Integer value) {
            addCriterion("p_pid >", value, "pPid");
            return (Criteria) this;
        }

        public Criteria andPPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_pid >=", value, "pPid");
            return (Criteria) this;
        }

        public Criteria andPPidLessThan(Integer value) {
            addCriterion("p_pid <", value, "pPid");
            return (Criteria) this;
        }

        public Criteria andPPidLessThanOrEqualTo(Integer value) {
            addCriterion("p_pid <=", value, "pPid");
            return (Criteria) this;
        }

        public Criteria andPPidIn(List<Integer> values) {
            addCriterion("p_pid in", values, "pPid");
            return (Criteria) this;
        }

        public Criteria andPPidNotIn(List<Integer> values) {
            addCriterion("p_pid not in", values, "pPid");
            return (Criteria) this;
        }

        public Criteria andPPidBetween(Integer value1, Integer value2) {
            addCriterion("p_pid between", value1, value2, "pPid");
            return (Criteria) this;
        }

        public Criteria andPPidNotBetween(Integer value1, Integer value2) {
            addCriterion("p_pid not between", value1, value2, "pPid");
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