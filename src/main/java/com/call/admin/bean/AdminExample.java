package com.call.admin.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAtypesIsNull() {
            addCriterion("atypes is null");
            return (Criteria) this;
        }

        public Criteria andAtypesIsNotNull() {
            addCriterion("atypes is not null");
            return (Criteria) this;
        }

        public Criteria andAtypesEqualTo(Integer value) {
            addCriterion("atypes =", value, "atypes");
            return (Criteria) this;
        }

        public Criteria andAtypesNotEqualTo(Integer value) {
            addCriterion("atypes <>", value, "atypes");
            return (Criteria) this;
        }

        public Criteria andAtypesGreaterThan(Integer value) {
            addCriterion("atypes >", value, "atypes");
            return (Criteria) this;
        }

        public Criteria andAtypesGreaterThanOrEqualTo(Integer value) {
            addCriterion("atypes >=", value, "atypes");
            return (Criteria) this;
        }

        public Criteria andAtypesLessThan(Integer value) {
            addCriterion("atypes <", value, "atypes");
            return (Criteria) this;
        }

        public Criteria andAtypesLessThanOrEqualTo(Integer value) {
            addCriterion("atypes <=", value, "atypes");
            return (Criteria) this;
        }

        public Criteria andAtypesIn(List<Integer> values) {
            addCriterion("atypes in", values, "atypes");
            return (Criteria) this;
        }

        public Criteria andAtypesNotIn(List<Integer> values) {
            addCriterion("atypes not in", values, "atypes");
            return (Criteria) this;
        }

        public Criteria andAtypesBetween(Integer value1, Integer value2) {
            addCriterion("atypes between", value1, value2, "atypes");
            return (Criteria) this;
        }

        public Criteria andAtypesNotBetween(Integer value1, Integer value2) {
            addCriterion("atypes not between", value1, value2, "atypes");
            return (Criteria) this;
        }

        public Criteria andAstarttimeIsNull() {
            addCriterion("astarttime is null");
            return (Criteria) this;
        }

        public Criteria andAstarttimeIsNotNull() {
            addCriterion("astarttime is not null");
            return (Criteria) this;
        }

        public Criteria andAstarttimeEqualTo(Date value) {
            addCriterion("astarttime =", value, "astarttime");
            return (Criteria) this;
        }

        public Criteria andAstarttimeNotEqualTo(Date value) {
            addCriterion("astarttime <>", value, "astarttime");
            return (Criteria) this;
        }

        public Criteria andAstarttimeGreaterThan(Date value) {
            addCriterion("astarttime >", value, "astarttime");
            return (Criteria) this;
        }

        public Criteria andAstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("astarttime >=", value, "astarttime");
            return (Criteria) this;
        }

        public Criteria andAstarttimeLessThan(Date value) {
            addCriterion("astarttime <", value, "astarttime");
            return (Criteria) this;
        }

        public Criteria andAstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("astarttime <=", value, "astarttime");
            return (Criteria) this;
        }

        public Criteria andAstarttimeIn(List<Date> values) {
            addCriterion("astarttime in", values, "astarttime");
            return (Criteria) this;
        }

        public Criteria andAstarttimeNotIn(List<Date> values) {
            addCriterion("astarttime not in", values, "astarttime");
            return (Criteria) this;
        }

        public Criteria andAstarttimeBetween(Date value1, Date value2) {
            addCriterion("astarttime between", value1, value2, "astarttime");
            return (Criteria) this;
        }

        public Criteria andAstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("astarttime not between", value1, value2, "astarttime");
            return (Criteria) this;
        }

        public Criteria andAendtimeIsNull() {
            addCriterion("aendtime is null");
            return (Criteria) this;
        }

        public Criteria andAendtimeIsNotNull() {
            addCriterion("aendtime is not null");
            return (Criteria) this;
        }

        public Criteria andAendtimeEqualTo(Date value) {
            addCriterion("aendtime =", value, "aendtime");
            return (Criteria) this;
        }

        public Criteria andAendtimeNotEqualTo(Date value) {
            addCriterion("aendtime <>", value, "aendtime");
            return (Criteria) this;
        }

        public Criteria andAendtimeGreaterThan(Date value) {
            addCriterion("aendtime >", value, "aendtime");
            return (Criteria) this;
        }

        public Criteria andAendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("aendtime >=", value, "aendtime");
            return (Criteria) this;
        }

        public Criteria andAendtimeLessThan(Date value) {
            addCriterion("aendtime <", value, "aendtime");
            return (Criteria) this;
        }

        public Criteria andAendtimeLessThanOrEqualTo(Date value) {
            addCriterion("aendtime <=", value, "aendtime");
            return (Criteria) this;
        }

        public Criteria andAendtimeIn(List<Date> values) {
            addCriterion("aendtime in", values, "aendtime");
            return (Criteria) this;
        }

        public Criteria andAendtimeNotIn(List<Date> values) {
            addCriterion("aendtime not in", values, "aendtime");
            return (Criteria) this;
        }

        public Criteria andAendtimeBetween(Date value1, Date value2) {
            addCriterion("aendtime between", value1, value2, "aendtime");
            return (Criteria) this;
        }

        public Criteria andAendtimeNotBetween(Date value1, Date value2) {
            addCriterion("aendtime not between", value1, value2, "aendtime");
            return (Criteria) this;
        }

        public Criteria andAphonIsNull() {
            addCriterion("aphon is null");
            return (Criteria) this;
        }

        public Criteria andAphonIsNotNull() {
            addCriterion("aphon is not null");
            return (Criteria) this;
        }

        public Criteria andAphonEqualTo(Integer value) {
            addCriterion("aphon =", value, "aphon");
            return (Criteria) this;
        }

        public Criteria andAphonNotEqualTo(Integer value) {
            addCriterion("aphon <>", value, "aphon");
            return (Criteria) this;
        }

        public Criteria andAphonGreaterThan(Integer value) {
            addCriterion("aphon >", value, "aphon");
            return (Criteria) this;
        }

        public Criteria andAphonGreaterThanOrEqualTo(Integer value) {
            addCriterion("aphon >=", value, "aphon");
            return (Criteria) this;
        }

        public Criteria andAphonLessThan(Integer value) {
            addCriterion("aphon <", value, "aphon");
            return (Criteria) this;
        }

        public Criteria andAphonLessThanOrEqualTo(Integer value) {
            addCriterion("aphon <=", value, "aphon");
            return (Criteria) this;
        }

        public Criteria andAphonIn(List<Integer> values) {
            addCriterion("aphon in", values, "aphon");
            return (Criteria) this;
        }

        public Criteria andAphonNotIn(List<Integer> values) {
            addCriterion("aphon not in", values, "aphon");
            return (Criteria) this;
        }

        public Criteria andAphonBetween(Integer value1, Integer value2) {
            addCriterion("aphon between", value1, value2, "aphon");
            return (Criteria) this;
        }

        public Criteria andAphonNotBetween(Integer value1, Integer value2) {
            addCriterion("aphon not between", value1, value2, "aphon");
            return (Criteria) this;
        }

        public Criteria andAperIsNull() {
            addCriterion("aper is null");
            return (Criteria) this;
        }

        public Criteria andAperIsNotNull() {
            addCriterion("aper is not null");
            return (Criteria) this;
        }

        public Criteria andAperEqualTo(Integer value) {
            addCriterion("aper =", value, "aper");
            return (Criteria) this;
        }

        public Criteria andAperNotEqualTo(Integer value) {
            addCriterion("aper <>", value, "aper");
            return (Criteria) this;
        }

        public Criteria andAperGreaterThan(Integer value) {
            addCriterion("aper >", value, "aper");
            return (Criteria) this;
        }

        public Criteria andAperGreaterThanOrEqualTo(Integer value) {
            addCriterion("aper >=", value, "aper");
            return (Criteria) this;
        }

        public Criteria andAperLessThan(Integer value) {
            addCriterion("aper <", value, "aper");
            return (Criteria) this;
        }

        public Criteria andAperLessThanOrEqualTo(Integer value) {
            addCriterion("aper <=", value, "aper");
            return (Criteria) this;
        }

        public Criteria andAperIn(List<Integer> values) {
            addCriterion("aper in", values, "aper");
            return (Criteria) this;
        }

        public Criteria andAperNotIn(List<Integer> values) {
            addCriterion("aper not in", values, "aper");
            return (Criteria) this;
        }

        public Criteria andAperBetween(Integer value1, Integer value2) {
            addCriterion("aper between", value1, value2, "aper");
            return (Criteria) this;
        }

        public Criteria andAperNotBetween(Integer value1, Integer value2) {
            addCriterion("aper not between", value1, value2, "aper");
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