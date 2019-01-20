package com.call.permiss.bean;

import java.util.ArrayList;
import java.util.List;

public class PermissExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PermissExample() {
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

        public Criteria andPeidIsNull() {
            addCriterion("peid is null");
            return (Criteria) this;
        }

        public Criteria andPeidIsNotNull() {
            addCriterion("peid is not null");
            return (Criteria) this;
        }

        public Criteria andPeidEqualTo(Integer value) {
            addCriterion("peid =", value, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidNotEqualTo(Integer value) {
            addCriterion("peid <>", value, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidGreaterThan(Integer value) {
            addCriterion("peid >", value, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("peid >=", value, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidLessThan(Integer value) {
            addCriterion("peid <", value, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidLessThanOrEqualTo(Integer value) {
            addCriterion("peid <=", value, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidIn(List<Integer> values) {
            addCriterion("peid in", values, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidNotIn(List<Integer> values) {
            addCriterion("peid not in", values, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidBetween(Integer value1, Integer value2) {
            addCriterion("peid between", value1, value2, "peid");
            return (Criteria) this;
        }

        public Criteria andPeidNotBetween(Integer value1, Integer value2) {
            addCriterion("peid not between", value1, value2, "peid");
            return (Criteria) this;
        }

        public Criteria andPenameIsNull() {
            addCriterion("pename is null");
            return (Criteria) this;
        }

        public Criteria andPenameIsNotNull() {
            addCriterion("pename is not null");
            return (Criteria) this;
        }

        public Criteria andPenameEqualTo(String value) {
            addCriterion("pename =", value, "pename");
            return (Criteria) this;
        }

        public Criteria andPenameNotEqualTo(String value) {
            addCriterion("pename <>", value, "pename");
            return (Criteria) this;
        }

        public Criteria andPenameGreaterThan(String value) {
            addCriterion("pename >", value, "pename");
            return (Criteria) this;
        }

        public Criteria andPenameGreaterThanOrEqualTo(String value) {
            addCriterion("pename >=", value, "pename");
            return (Criteria) this;
        }

        public Criteria andPenameLessThan(String value) {
            addCriterion("pename <", value, "pename");
            return (Criteria) this;
        }

        public Criteria andPenameLessThanOrEqualTo(String value) {
            addCriterion("pename <=", value, "pename");
            return (Criteria) this;
        }

        public Criteria andPenameLike(String value) {
            addCriterion("pename like", value, "pename");
            return (Criteria) this;
        }

        public Criteria andPenameNotLike(String value) {
            addCriterion("pename not like", value, "pename");
            return (Criteria) this;
        }

        public Criteria andPenameIn(List<String> values) {
            addCriterion("pename in", values, "pename");
            return (Criteria) this;
        }

        public Criteria andPenameNotIn(List<String> values) {
            addCriterion("pename not in", values, "pename");
            return (Criteria) this;
        }

        public Criteria andPenameBetween(String value1, String value2) {
            addCriterion("pename between", value1, value2, "pename");
            return (Criteria) this;
        }

        public Criteria andPenameNotBetween(String value1, String value2) {
            addCriterion("pename not between", value1, value2, "pename");
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