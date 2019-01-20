package com.call.peisong.bean;

import java.util.ArrayList;
import java.util.List;

public class PeisongExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PeisongExample() {
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

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDzhuangtaiIsNull() {
            addCriterion("dzhuangtai is null");
            return (Criteria) this;
        }

        public Criteria andDzhuangtaiIsNotNull() {
            addCriterion("dzhuangtai is not null");
            return (Criteria) this;
        }

        public Criteria andDzhuangtaiEqualTo(Integer value) {
            addCriterion("dzhuangtai =", value, "dzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDzhuangtaiNotEqualTo(Integer value) {
            addCriterion("dzhuangtai <>", value, "dzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDzhuangtaiGreaterThan(Integer value) {
            addCriterion("dzhuangtai >", value, "dzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDzhuangtaiGreaterThanOrEqualTo(Integer value) {
            addCriterion("dzhuangtai >=", value, "dzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDzhuangtaiLessThan(Integer value) {
            addCriterion("dzhuangtai <", value, "dzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDzhuangtaiLessThanOrEqualTo(Integer value) {
            addCriterion("dzhuangtai <=", value, "dzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDzhuangtaiIn(List<Integer> values) {
            addCriterion("dzhuangtai in", values, "dzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDzhuangtaiNotIn(List<Integer> values) {
            addCriterion("dzhuangtai not in", values, "dzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDzhuangtaiBetween(Integer value1, Integer value2) {
            addCriterion("dzhuangtai between", value1, value2, "dzhuangtai");
            return (Criteria) this;
        }

        public Criteria andDzhuangtaiNotBetween(Integer value1, Integer value2) {
            addCriterion("dzhuangtai not between", value1, value2, "dzhuangtai");
            return (Criteria) this;
        }

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andPidFkIsNull() {
            addCriterion("pid_fk is null");
            return (Criteria) this;
        }

        public Criteria andPidFkIsNotNull() {
            addCriterion("pid_fk is not null");
            return (Criteria) this;
        }

        public Criteria andPidFkEqualTo(Integer value) {
            addCriterion("pid_fk =", value, "pidFk");
            return (Criteria) this;
        }

        public Criteria andPidFkNotEqualTo(Integer value) {
            addCriterion("pid_fk <>", value, "pidFk");
            return (Criteria) this;
        }

        public Criteria andPidFkGreaterThan(Integer value) {
            addCriterion("pid_fk >", value, "pidFk");
            return (Criteria) this;
        }

        public Criteria andPidFkGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid_fk >=", value, "pidFk");
            return (Criteria) this;
        }

        public Criteria andPidFkLessThan(Integer value) {
            addCriterion("pid_fk <", value, "pidFk");
            return (Criteria) this;
        }

        public Criteria andPidFkLessThanOrEqualTo(Integer value) {
            addCriterion("pid_fk <=", value, "pidFk");
            return (Criteria) this;
        }

        public Criteria andPidFkIn(List<Integer> values) {
            addCriterion("pid_fk in", values, "pidFk");
            return (Criteria) this;
        }

        public Criteria andPidFkNotIn(List<Integer> values) {
            addCriterion("pid_fk not in", values, "pidFk");
            return (Criteria) this;
        }

        public Criteria andPidFkBetween(Integer value1, Integer value2) {
            addCriterion("pid_fk between", value1, value2, "pidFk");
            return (Criteria) this;
        }

        public Criteria andPidFkNotBetween(Integer value1, Integer value2) {
            addCriterion("pid_fk not between", value1, value2, "pidFk");
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