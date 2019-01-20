package com.call.order.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOnumberIsNull() {
            addCriterion("onumber is null");
            return (Criteria) this;
        }

        public Criteria andOnumberIsNotNull() {
            addCriterion("onumber is not null");
            return (Criteria) this;
        }

        public Criteria andOnumberEqualTo(Integer value) {
            addCriterion("onumber =", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberNotEqualTo(Integer value) {
            addCriterion("onumber <>", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberGreaterThan(Integer value) {
            addCriterion("onumber >", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("onumber >=", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberLessThan(Integer value) {
            addCriterion("onumber <", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberLessThanOrEqualTo(Integer value) {
            addCriterion("onumber <=", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberIn(List<Integer> values) {
            addCriterion("onumber in", values, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberNotIn(List<Integer> values) {
            addCriterion("onumber not in", values, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberBetween(Integer value1, Integer value2) {
            addCriterion("onumber between", value1, value2, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("onumber not between", value1, value2, "onumber");
            return (Criteria) this;
        }

        public Criteria andOaddressIsNull() {
            addCriterion("oaddress is null");
            return (Criteria) this;
        }

        public Criteria andOaddressIsNotNull() {
            addCriterion("oaddress is not null");
            return (Criteria) this;
        }

        public Criteria andOaddressEqualTo(String value) {
            addCriterion("oaddress =", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressNotEqualTo(String value) {
            addCriterion("oaddress <>", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressGreaterThan(String value) {
            addCriterion("oaddress >", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressGreaterThanOrEqualTo(String value) {
            addCriterion("oaddress >=", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressLessThan(String value) {
            addCriterion("oaddress <", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressLessThanOrEqualTo(String value) {
            addCriterion("oaddress <=", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressLike(String value) {
            addCriterion("oaddress like", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressNotLike(String value) {
            addCriterion("oaddress not like", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressIn(List<String> values) {
            addCriterion("oaddress in", values, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressNotIn(List<String> values) {
            addCriterion("oaddress not in", values, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressBetween(String value1, String value2) {
            addCriterion("oaddress between", value1, value2, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressNotBetween(String value1, String value2) {
            addCriterion("oaddress not between", value1, value2, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOphonIsNull() {
            addCriterion("ophon is null");
            return (Criteria) this;
        }

        public Criteria andOphonIsNotNull() {
            addCriterion("ophon is not null");
            return (Criteria) this;
        }

        public Criteria andOphonEqualTo(String value) {
            addCriterion("ophon =", value, "ophon");
            return (Criteria) this;
        }

        public Criteria andOphonNotEqualTo(String value) {
            addCriterion("ophon <>", value, "ophon");
            return (Criteria) this;
        }

        public Criteria andOphonGreaterThan(String value) {
            addCriterion("ophon >", value, "ophon");
            return (Criteria) this;
        }

        public Criteria andOphonGreaterThanOrEqualTo(String value) {
            addCriterion("ophon >=", value, "ophon");
            return (Criteria) this;
        }

        public Criteria andOphonLessThan(String value) {
            addCriterion("ophon <", value, "ophon");
            return (Criteria) this;
        }

        public Criteria andOphonLessThanOrEqualTo(String value) {
            addCriterion("ophon <=", value, "ophon");
            return (Criteria) this;
        }

        public Criteria andOphonLike(String value) {
            addCriterion("ophon like", value, "ophon");
            return (Criteria) this;
        }

        public Criteria andOphonNotLike(String value) {
            addCriterion("ophon not like", value, "ophon");
            return (Criteria) this;
        }

        public Criteria andOphonIn(List<String> values) {
            addCriterion("ophon in", values, "ophon");
            return (Criteria) this;
        }

        public Criteria andOphonNotIn(List<String> values) {
            addCriterion("ophon not in", values, "ophon");
            return (Criteria) this;
        }

        public Criteria andOphonBetween(String value1, String value2) {
            addCriterion("ophon between", value1, value2, "ophon");
            return (Criteria) this;
        }

        public Criteria andOphonNotBetween(String value1, String value2) {
            addCriterion("ophon not between", value1, value2, "ophon");
            return (Criteria) this;
        }

        public Criteria andOrmbIsNull() {
            addCriterion("ormb is null");
            return (Criteria) this;
        }

        public Criteria andOrmbIsNotNull() {
            addCriterion("ormb is not null");
            return (Criteria) this;
        }

        public Criteria andOrmbEqualTo(String value) {
            addCriterion("ormb =", value, "ormb");
            return (Criteria) this;
        }

        public Criteria andOrmbNotEqualTo(String value) {
            addCriterion("ormb <>", value, "ormb");
            return (Criteria) this;
        }

        public Criteria andOrmbGreaterThan(String value) {
            addCriterion("ormb >", value, "ormb");
            return (Criteria) this;
        }

        public Criteria andOrmbGreaterThanOrEqualTo(String value) {
            addCriterion("ormb >=", value, "ormb");
            return (Criteria) this;
        }

        public Criteria andOrmbLessThan(String value) {
            addCriterion("ormb <", value, "ormb");
            return (Criteria) this;
        }

        public Criteria andOrmbLessThanOrEqualTo(String value) {
            addCriterion("ormb <=", value, "ormb");
            return (Criteria) this;
        }

        public Criteria andOrmbLike(String value) {
            addCriterion("ormb like", value, "ormb");
            return (Criteria) this;
        }

        public Criteria andOrmbNotLike(String value) {
            addCriterion("ormb not like", value, "ormb");
            return (Criteria) this;
        }

        public Criteria andOrmbIn(List<String> values) {
            addCriterion("ormb in", values, "ormb");
            return (Criteria) this;
        }

        public Criteria andOrmbNotIn(List<String> values) {
            addCriterion("ormb not in", values, "ormb");
            return (Criteria) this;
        }

        public Criteria andOrmbBetween(String value1, String value2) {
            addCriterion("ormb between", value1, value2, "ormb");
            return (Criteria) this;
        }

        public Criteria andOrmbNotBetween(String value1, String value2) {
            addCriterion("ormb not between", value1, value2, "ormb");
            return (Criteria) this;
        }

        public Criteria andOzhuangtaiIsNull() {
            addCriterion("ozhuangtai is null");
            return (Criteria) this;
        }

        public Criteria andOzhuangtaiIsNotNull() {
            addCriterion("ozhuangtai is not null");
            return (Criteria) this;
        }

        public Criteria andOzhuangtaiEqualTo(Integer value) {
            addCriterion("ozhuangtai =", value, "ozhuangtai");
            return (Criteria) this;
        }

        public Criteria andOzhuangtaiNotEqualTo(Integer value) {
            addCriterion("ozhuangtai <>", value, "ozhuangtai");
            return (Criteria) this;
        }

        public Criteria andOzhuangtaiGreaterThan(Integer value) {
            addCriterion("ozhuangtai >", value, "ozhuangtai");
            return (Criteria) this;
        }

        public Criteria andOzhuangtaiGreaterThanOrEqualTo(Integer value) {
            addCriterion("ozhuangtai >=", value, "ozhuangtai");
            return (Criteria) this;
        }

        public Criteria andOzhuangtaiLessThan(Integer value) {
            addCriterion("ozhuangtai <", value, "ozhuangtai");
            return (Criteria) this;
        }

        public Criteria andOzhuangtaiLessThanOrEqualTo(Integer value) {
            addCriterion("ozhuangtai <=", value, "ozhuangtai");
            return (Criteria) this;
        }

        public Criteria andOzhuangtaiIn(List<Integer> values) {
            addCriterion("ozhuangtai in", values, "ozhuangtai");
            return (Criteria) this;
        }

        public Criteria andOzhuangtaiNotIn(List<Integer> values) {
            addCriterion("ozhuangtai not in", values, "ozhuangtai");
            return (Criteria) this;
        }

        public Criteria andOzhuangtaiBetween(Integer value1, Integer value2) {
            addCriterion("ozhuangtai between", value1, value2, "ozhuangtai");
            return (Criteria) this;
        }

        public Criteria andOzhuangtaiNotBetween(Integer value1, Integer value2) {
            addCriterion("ozhuangtai not between", value1, value2, "ozhuangtai");
            return (Criteria) this;
        }

        public Criteria andOtimeIsNull() {
            addCriterion("otime is null");
            return (Criteria) this;
        }

        public Criteria andOtimeIsNotNull() {
            addCriterion("otime is not null");
            return (Criteria) this;
        }

        public Criteria andOtimeEqualTo(Date value) {
            addCriterion("otime =", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeNotEqualTo(Date value) {
            addCriterion("otime <>", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeGreaterThan(Date value) {
            addCriterion("otime >", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("otime >=", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeLessThan(Date value) {
            addCriterion("otime <", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeLessThanOrEqualTo(Date value) {
            addCriterion("otime <=", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeIn(List<Date> values) {
            addCriterion("otime in", values, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeNotIn(List<Date> values) {
            addCriterion("otime not in", values, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeBetween(Date value1, Date value2) {
            addCriterion("otime between", value1, value2, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeNotBetween(Date value1, Date value2) {
            addCriterion("otime not between", value1, value2, "otime");
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