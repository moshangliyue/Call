package com.call.project.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
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

        public Criteria andPintroIsNull() {
            addCriterion("pintro is null");
            return (Criteria) this;
        }

        public Criteria andPintroIsNotNull() {
            addCriterion("pintro is not null");
            return (Criteria) this;
        }

        public Criteria andPintroEqualTo(String value) {
            addCriterion("pintro =", value, "pintro");
            return (Criteria) this;
        }

        public Criteria andPintroNotEqualTo(String value) {
            addCriterion("pintro <>", value, "pintro");
            return (Criteria) this;
        }

        public Criteria andPintroGreaterThan(String value) {
            addCriterion("pintro >", value, "pintro");
            return (Criteria) this;
        }

        public Criteria andPintroGreaterThanOrEqualTo(String value) {
            addCriterion("pintro >=", value, "pintro");
            return (Criteria) this;
        }

        public Criteria andPintroLessThan(String value) {
            addCriterion("pintro <", value, "pintro");
            return (Criteria) this;
        }

        public Criteria andPintroLessThanOrEqualTo(String value) {
            addCriterion("pintro <=", value, "pintro");
            return (Criteria) this;
        }

        public Criteria andPintroLike(String value) {
            addCriterion("pintro like", value, "pintro");
            return (Criteria) this;
        }

        public Criteria andPintroNotLike(String value) {
            addCriterion("pintro not like", value, "pintro");
            return (Criteria) this;
        }

        public Criteria andPintroIn(List<String> values) {
            addCriterion("pintro in", values, "pintro");
            return (Criteria) this;
        }

        public Criteria andPintroNotIn(List<String> values) {
            addCriterion("pintro not in", values, "pintro");
            return (Criteria) this;
        }

        public Criteria andPintroBetween(String value1, String value2) {
            addCriterion("pintro between", value1, value2, "pintro");
            return (Criteria) this;
        }

        public Criteria andPintroNotBetween(String value1, String value2) {
            addCriterion("pintro not between", value1, value2, "pintro");
            return (Criteria) this;
        }

        public Criteria andPtypesIsNull() {
            addCriterion("ptypes is null");
            return (Criteria) this;
        }

        public Criteria andPtypesIsNotNull() {
            addCriterion("ptypes is not null");
            return (Criteria) this;
        }

        public Criteria andPtypesEqualTo(String value) {
            addCriterion("ptypes =", value, "ptypes");
            return (Criteria) this;
        }

        public Criteria andPtypesNotEqualTo(String value) {
            addCriterion("ptypes <>", value, "ptypes");
            return (Criteria) this;
        }

        public Criteria andPtypesGreaterThan(String value) {
            addCriterion("ptypes >", value, "ptypes");
            return (Criteria) this;
        }

        public Criteria andPtypesGreaterThanOrEqualTo(String value) {
            addCriterion("ptypes >=", value, "ptypes");
            return (Criteria) this;
        }

        public Criteria andPtypesLessThan(String value) {
            addCriterion("ptypes <", value, "ptypes");
            return (Criteria) this;
        }

        public Criteria andPtypesLessThanOrEqualTo(String value) {
            addCriterion("ptypes <=", value, "ptypes");
            return (Criteria) this;
        }

        public Criteria andPtypesLike(String value) {
            addCriterion("ptypes like", value, "ptypes");
            return (Criteria) this;
        }

        public Criteria andPtypesNotLike(String value) {
            addCriterion("ptypes not like", value, "ptypes");
            return (Criteria) this;
        }

        public Criteria andPtypesIn(List<String> values) {
            addCriterion("ptypes in", values, "ptypes");
            return (Criteria) this;
        }

        public Criteria andPtypesNotIn(List<String> values) {
            addCriterion("ptypes not in", values, "ptypes");
            return (Criteria) this;
        }

        public Criteria andPtypesBetween(String value1, String value2) {
            addCriterion("ptypes between", value1, value2, "ptypes");
            return (Criteria) this;
        }

        public Criteria andPtypesNotBetween(String value1, String value2) {
            addCriterion("ptypes not between", value1, value2, "ptypes");
            return (Criteria) this;
        }

        public Criteria andPamountIsNull() {
            addCriterion("pamount is null");
            return (Criteria) this;
        }

        public Criteria andPamountIsNotNull() {
            addCriterion("pamount is not null");
            return (Criteria) this;
        }

        public Criteria andPamountEqualTo(Integer value) {
            addCriterion("pamount =", value, "pamount");
            return (Criteria) this;
        }

        public Criteria andPamountNotEqualTo(Integer value) {
            addCriterion("pamount <>", value, "pamount");
            return (Criteria) this;
        }

        public Criteria andPamountGreaterThan(Integer value) {
            addCriterion("pamount >", value, "pamount");
            return (Criteria) this;
        }

        public Criteria andPamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pamount >=", value, "pamount");
            return (Criteria) this;
        }

        public Criteria andPamountLessThan(Integer value) {
            addCriterion("pamount <", value, "pamount");
            return (Criteria) this;
        }

        public Criteria andPamountLessThanOrEqualTo(Integer value) {
            addCriterion("pamount <=", value, "pamount");
            return (Criteria) this;
        }

        public Criteria andPamountIn(List<Integer> values) {
            addCriterion("pamount in", values, "pamount");
            return (Criteria) this;
        }

        public Criteria andPamountNotIn(List<Integer> values) {
            addCriterion("pamount not in", values, "pamount");
            return (Criteria) this;
        }

        public Criteria andPamountBetween(Integer value1, Integer value2) {
            addCriterion("pamount between", value1, value2, "pamount");
            return (Criteria) this;
        }

        public Criteria andPamountNotBetween(Integer value1, Integer value2) {
            addCriterion("pamount not between", value1, value2, "pamount");
            return (Criteria) this;
        }

        public Criteria andPstartIsNull() {
            addCriterion("pstart is null");
            return (Criteria) this;
        }

        public Criteria andPstartIsNotNull() {
            addCriterion("pstart is not null");
            return (Criteria) this;
        }

        public Criteria andPstartEqualTo(Date value) {
            addCriterion("pstart =", value, "pstart");
            return (Criteria) this;
        }

        public Criteria andPstartNotEqualTo(Date value) {
            addCriterion("pstart <>", value, "pstart");
            return (Criteria) this;
        }

        public Criteria andPstartGreaterThan(Date value) {
            addCriterion("pstart >", value, "pstart");
            return (Criteria) this;
        }

        public Criteria andPstartGreaterThanOrEqualTo(Date value) {
            addCriterion("pstart >=", value, "pstart");
            return (Criteria) this;
        }

        public Criteria andPstartLessThan(Date value) {
            addCriterion("pstart <", value, "pstart");
            return (Criteria) this;
        }

        public Criteria andPstartLessThanOrEqualTo(Date value) {
            addCriterion("pstart <=", value, "pstart");
            return (Criteria) this;
        }

        public Criteria andPstartIn(List<Date> values) {
            addCriterion("pstart in", values, "pstart");
            return (Criteria) this;
        }

        public Criteria andPstartNotIn(List<Date> values) {
            addCriterion("pstart not in", values, "pstart");
            return (Criteria) this;
        }

        public Criteria andPstartBetween(Date value1, Date value2) {
            addCriterion("pstart between", value1, value2, "pstart");
            return (Criteria) this;
        }

        public Criteria andPstartNotBetween(Date value1, Date value2) {
            addCriterion("pstart not between", value1, value2, "pstart");
            return (Criteria) this;
        }

        public Criteria andPendIsNull() {
            addCriterion("pend is null");
            return (Criteria) this;
        }

        public Criteria andPendIsNotNull() {
            addCriterion("pend is not null");
            return (Criteria) this;
        }

        public Criteria andPendEqualTo(Date value) {
            addCriterion("pend =", value, "pend");
            return (Criteria) this;
        }

        public Criteria andPendNotEqualTo(Date value) {
            addCriterion("pend <>", value, "pend");
            return (Criteria) this;
        }

        public Criteria andPendGreaterThan(Date value) {
            addCriterion("pend >", value, "pend");
            return (Criteria) this;
        }

        public Criteria andPendGreaterThanOrEqualTo(Date value) {
            addCriterion("pend >=", value, "pend");
            return (Criteria) this;
        }

        public Criteria andPendLessThan(Date value) {
            addCriterion("pend <", value, "pend");
            return (Criteria) this;
        }

        public Criteria andPendLessThanOrEqualTo(Date value) {
            addCriterion("pend <=", value, "pend");
            return (Criteria) this;
        }

        public Criteria andPendIn(List<Date> values) {
            addCriterion("pend in", values, "pend");
            return (Criteria) this;
        }

        public Criteria andPendNotIn(List<Date> values) {
            addCriterion("pend not in", values, "pend");
            return (Criteria) this;
        }

        public Criteria andPendBetween(Date value1, Date value2) {
            addCriterion("pend between", value1, value2, "pend");
            return (Criteria) this;
        }

        public Criteria andPendNotBetween(Date value1, Date value2) {
            addCriterion("pend not between", value1, value2, "pend");
            return (Criteria) this;
        }

        public Criteria andPimgIsNull() {
            addCriterion("pimg is null");
            return (Criteria) this;
        }

        public Criteria andPimgIsNotNull() {
            addCriterion("pimg is not null");
            return (Criteria) this;
        }

        public Criteria andPimgEqualTo(String value) {
            addCriterion("pimg =", value, "pimg");
            return (Criteria) this;
        }

        public Criteria andPimgNotEqualTo(String value) {
            addCriterion("pimg <>", value, "pimg");
            return (Criteria) this;
        }

        public Criteria andPimgGreaterThan(String value) {
            addCriterion("pimg >", value, "pimg");
            return (Criteria) this;
        }

        public Criteria andPimgGreaterThanOrEqualTo(String value) {
            addCriterion("pimg >=", value, "pimg");
            return (Criteria) this;
        }

        public Criteria andPimgLessThan(String value) {
            addCriterion("pimg <", value, "pimg");
            return (Criteria) this;
        }

        public Criteria andPimgLessThanOrEqualTo(String value) {
            addCriterion("pimg <=", value, "pimg");
            return (Criteria) this;
        }

        public Criteria andPimgLike(String value) {
            addCriterion("pimg like", value, "pimg");
            return (Criteria) this;
        }

        public Criteria andPimgNotLike(String value) {
            addCriterion("pimg not like", value, "pimg");
            return (Criteria) this;
        }

        public Criteria andPimgIn(List<String> values) {
            addCriterion("pimg in", values, "pimg");
            return (Criteria) this;
        }

        public Criteria andPimgNotIn(List<String> values) {
            addCriterion("pimg not in", values, "pimg");
            return (Criteria) this;
        }

        public Criteria andPimgBetween(String value1, String value2) {
            addCriterion("pimg between", value1, value2, "pimg");
            return (Criteria) this;
        }

        public Criteria andPimgNotBetween(String value1, String value2) {
            addCriterion("pimg not between", value1, value2, "pimg");
            return (Criteria) this;
        }

        public Criteria andPdetailIsNull() {
            addCriterion("pdetail is null");
            return (Criteria) this;
        }

        public Criteria andPdetailIsNotNull() {
            addCriterion("pdetail is not null");
            return (Criteria) this;
        }

        public Criteria andPdetailEqualTo(String value) {
            addCriterion("pdetail =", value, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailNotEqualTo(String value) {
            addCriterion("pdetail <>", value, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailGreaterThan(String value) {
            addCriterion("pdetail >", value, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailGreaterThanOrEqualTo(String value) {
            addCriterion("pdetail >=", value, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailLessThan(String value) {
            addCriterion("pdetail <", value, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailLessThanOrEqualTo(String value) {
            addCriterion("pdetail <=", value, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailLike(String value) {
            addCriterion("pdetail like", value, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailNotLike(String value) {
            addCriterion("pdetail not like", value, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailIn(List<String> values) {
            addCriterion("pdetail in", values, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailNotIn(List<String> values) {
            addCriterion("pdetail not in", values, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailBetween(String value1, String value2) {
            addCriterion("pdetail between", value1, value2, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailNotBetween(String value1, String value2) {
            addCriterion("pdetail not between", value1, value2, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPcomnameIsNull() {
            addCriterion("pcomname is null");
            return (Criteria) this;
        }

        public Criteria andPcomnameIsNotNull() {
            addCriterion("pcomname is not null");
            return (Criteria) this;
        }

        public Criteria andPcomnameEqualTo(String value) {
            addCriterion("pcomname =", value, "pcomname");
            return (Criteria) this;
        }

        public Criteria andPcomnameNotEqualTo(String value) {
            addCriterion("pcomname <>", value, "pcomname");
            return (Criteria) this;
        }

        public Criteria andPcomnameGreaterThan(String value) {
            addCriterion("pcomname >", value, "pcomname");
            return (Criteria) this;
        }

        public Criteria andPcomnameGreaterThanOrEqualTo(String value) {
            addCriterion("pcomname >=", value, "pcomname");
            return (Criteria) this;
        }

        public Criteria andPcomnameLessThan(String value) {
            addCriterion("pcomname <", value, "pcomname");
            return (Criteria) this;
        }

        public Criteria andPcomnameLessThanOrEqualTo(String value) {
            addCriterion("pcomname <=", value, "pcomname");
            return (Criteria) this;
        }

        public Criteria andPcomnameLike(String value) {
            addCriterion("pcomname like", value, "pcomname");
            return (Criteria) this;
        }

        public Criteria andPcomnameNotLike(String value) {
            addCriterion("pcomname not like", value, "pcomname");
            return (Criteria) this;
        }

        public Criteria andPcomnameIn(List<String> values) {
            addCriterion("pcomname in", values, "pcomname");
            return (Criteria) this;
        }

        public Criteria andPcomnameNotIn(List<String> values) {
            addCriterion("pcomname not in", values, "pcomname");
            return (Criteria) this;
        }

        public Criteria andPcomnameBetween(String value1, String value2) {
            addCriterion("pcomname between", value1, value2, "pcomname");
            return (Criteria) this;
        }

        public Criteria andPcomnameNotBetween(String value1, String value2) {
            addCriterion("pcomname not between", value1, value2, "pcomname");
            return (Criteria) this;
        }

        public Criteria andPcomphonIsNull() {
            addCriterion("pcomphon is null");
            return (Criteria) this;
        }

        public Criteria andPcomphonIsNotNull() {
            addCriterion("pcomphon is not null");
            return (Criteria) this;
        }

        public Criteria andPcomphonEqualTo(String value) {
            addCriterion("pcomphon =", value, "pcomphon");
            return (Criteria) this;
        }

        public Criteria andPcomphonNotEqualTo(String value) {
            addCriterion("pcomphon <>", value, "pcomphon");
            return (Criteria) this;
        }

        public Criteria andPcomphonGreaterThan(String value) {
            addCriterion("pcomphon >", value, "pcomphon");
            return (Criteria) this;
        }

        public Criteria andPcomphonGreaterThanOrEqualTo(String value) {
            addCriterion("pcomphon >=", value, "pcomphon");
            return (Criteria) this;
        }

        public Criteria andPcomphonLessThan(String value) {
            addCriterion("pcomphon <", value, "pcomphon");
            return (Criteria) this;
        }

        public Criteria andPcomphonLessThanOrEqualTo(String value) {
            addCriterion("pcomphon <=", value, "pcomphon");
            return (Criteria) this;
        }

        public Criteria andPcomphonLike(String value) {
            addCriterion("pcomphon like", value, "pcomphon");
            return (Criteria) this;
        }

        public Criteria andPcomphonNotLike(String value) {
            addCriterion("pcomphon not like", value, "pcomphon");
            return (Criteria) this;
        }

        public Criteria andPcomphonIn(List<String> values) {
            addCriterion("pcomphon in", values, "pcomphon");
            return (Criteria) this;
        }

        public Criteria andPcomphonNotIn(List<String> values) {
            addCriterion("pcomphon not in", values, "pcomphon");
            return (Criteria) this;
        }

        public Criteria andPcomphonBetween(String value1, String value2) {
            addCriterion("pcomphon between", value1, value2, "pcomphon");
            return (Criteria) this;
        }

        public Criteria andPcomphonNotBetween(String value1, String value2) {
            addCriterion("pcomphon not between", value1, value2, "pcomphon");
            return (Criteria) this;
        }

        public Criteria andPbankIsNull() {
            addCriterion("pbank is null");
            return (Criteria) this;
        }

        public Criteria andPbankIsNotNull() {
            addCriterion("pbank is not null");
            return (Criteria) this;
        }

        public Criteria andPbankEqualTo(String value) {
            addCriterion("pbank =", value, "pbank");
            return (Criteria) this;
        }

        public Criteria andPbankNotEqualTo(String value) {
            addCriterion("pbank <>", value, "pbank");
            return (Criteria) this;
        }

        public Criteria andPbankGreaterThan(String value) {
            addCriterion("pbank >", value, "pbank");
            return (Criteria) this;
        }

        public Criteria andPbankGreaterThanOrEqualTo(String value) {
            addCriterion("pbank >=", value, "pbank");
            return (Criteria) this;
        }

        public Criteria andPbankLessThan(String value) {
            addCriterion("pbank <", value, "pbank");
            return (Criteria) this;
        }

        public Criteria andPbankLessThanOrEqualTo(String value) {
            addCriterion("pbank <=", value, "pbank");
            return (Criteria) this;
        }

        public Criteria andPbankLike(String value) {
            addCriterion("pbank like", value, "pbank");
            return (Criteria) this;
        }

        public Criteria andPbankNotLike(String value) {
            addCriterion("pbank not like", value, "pbank");
            return (Criteria) this;
        }

        public Criteria andPbankIn(List<String> values) {
            addCriterion("pbank in", values, "pbank");
            return (Criteria) this;
        }

        public Criteria andPbankNotIn(List<String> values) {
            addCriterion("pbank not in", values, "pbank");
            return (Criteria) this;
        }

        public Criteria andPbankBetween(String value1, String value2) {
            addCriterion("pbank between", value1, value2, "pbank");
            return (Criteria) this;
        }

        public Criteria andPbankNotBetween(String value1, String value2) {
            addCriterion("pbank not between", value1, value2, "pbank");
            return (Criteria) this;
        }

        public Criteria andPbanknumberIsNull() {
            addCriterion("pbanknumber is null");
            return (Criteria) this;
        }

        public Criteria andPbanknumberIsNotNull() {
            addCriterion("pbanknumber is not null");
            return (Criteria) this;
        }

        public Criteria andPbanknumberEqualTo(String value) {
            addCriterion("pbanknumber =", value, "pbanknumber");
            return (Criteria) this;
        }

        public Criteria andPbanknumberNotEqualTo(String value) {
            addCriterion("pbanknumber <>", value, "pbanknumber");
            return (Criteria) this;
        }

        public Criteria andPbanknumberGreaterThan(String value) {
            addCriterion("pbanknumber >", value, "pbanknumber");
            return (Criteria) this;
        }

        public Criteria andPbanknumberGreaterThanOrEqualTo(String value) {
            addCriterion("pbanknumber >=", value, "pbanknumber");
            return (Criteria) this;
        }

        public Criteria andPbanknumberLessThan(String value) {
            addCriterion("pbanknumber <", value, "pbanknumber");
            return (Criteria) this;
        }

        public Criteria andPbanknumberLessThanOrEqualTo(String value) {
            addCriterion("pbanknumber <=", value, "pbanknumber");
            return (Criteria) this;
        }

        public Criteria andPbanknumberLike(String value) {
            addCriterion("pbanknumber like", value, "pbanknumber");
            return (Criteria) this;
        }

        public Criteria andPbanknumberNotLike(String value) {
            addCriterion("pbanknumber not like", value, "pbanknumber");
            return (Criteria) this;
        }

        public Criteria andPbanknumberIn(List<String> values) {
            addCriterion("pbanknumber in", values, "pbanknumber");
            return (Criteria) this;
        }

        public Criteria andPbanknumberNotIn(List<String> values) {
            addCriterion("pbanknumber not in", values, "pbanknumber");
            return (Criteria) this;
        }

        public Criteria andPbanknumberBetween(String value1, String value2) {
            addCriterion("pbanknumber between", value1, value2, "pbanknumber");
            return (Criteria) this;
        }

        public Criteria andPbanknumberNotBetween(String value1, String value2) {
            addCriterion("pbanknumber not between", value1, value2, "pbanknumber");
            return (Criteria) this;
        }

        public Criteria andPhtypesIsNull() {
            addCriterion("phtypes is null");
            return (Criteria) this;
        }

        public Criteria andPhtypesIsNotNull() {
            addCriterion("phtypes is not null");
            return (Criteria) this;
        }

        public Criteria andPhtypesEqualTo(String value) {
            addCriterion("phtypes =", value, "phtypes");
            return (Criteria) this;
        }

        public Criteria andPhtypesNotEqualTo(String value) {
            addCriterion("phtypes <>", value, "phtypes");
            return (Criteria) this;
        }

        public Criteria andPhtypesGreaterThan(String value) {
            addCriterion("phtypes >", value, "phtypes");
            return (Criteria) this;
        }

        public Criteria andPhtypesGreaterThanOrEqualTo(String value) {
            addCriterion("phtypes >=", value, "phtypes");
            return (Criteria) this;
        }

        public Criteria andPhtypesLessThan(String value) {
            addCriterion("phtypes <", value, "phtypes");
            return (Criteria) this;
        }

        public Criteria andPhtypesLessThanOrEqualTo(String value) {
            addCriterion("phtypes <=", value, "phtypes");
            return (Criteria) this;
        }

        public Criteria andPhtypesLike(String value) {
            addCriterion("phtypes like", value, "phtypes");
            return (Criteria) this;
        }

        public Criteria andPhtypesNotLike(String value) {
            addCriterion("phtypes not like", value, "phtypes");
            return (Criteria) this;
        }

        public Criteria andPhtypesIn(List<String> values) {
            addCriterion("phtypes in", values, "phtypes");
            return (Criteria) this;
        }

        public Criteria andPhtypesNotIn(List<String> values) {
            addCriterion("phtypes not in", values, "phtypes");
            return (Criteria) this;
        }

        public Criteria andPhtypesBetween(String value1, String value2) {
            addCriterion("phtypes between", value1, value2, "phtypes");
            return (Criteria) this;
        }

        public Criteria andPhtypesNotBetween(String value1, String value2) {
            addCriterion("phtypes not between", value1, value2, "phtypes");
            return (Criteria) this;
        }

        public Criteria andPhamountIsNull() {
            addCriterion("phamount is null");
            return (Criteria) this;
        }

        public Criteria andPhamountIsNotNull() {
            addCriterion("phamount is not null");
            return (Criteria) this;
        }

        public Criteria andPhamountEqualTo(Integer value) {
            addCriterion("phamount =", value, "phamount");
            return (Criteria) this;
        }

        public Criteria andPhamountNotEqualTo(Integer value) {
            addCriterion("phamount <>", value, "phamount");
            return (Criteria) this;
        }

        public Criteria andPhamountGreaterThan(Integer value) {
            addCriterion("phamount >", value, "phamount");
            return (Criteria) this;
        }

        public Criteria andPhamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("phamount >=", value, "phamount");
            return (Criteria) this;
        }

        public Criteria andPhamountLessThan(Integer value) {
            addCriterion("phamount <", value, "phamount");
            return (Criteria) this;
        }

        public Criteria andPhamountLessThanOrEqualTo(Integer value) {
            addCriterion("phamount <=", value, "phamount");
            return (Criteria) this;
        }

        public Criteria andPhamountIn(List<Integer> values) {
            addCriterion("phamount in", values, "phamount");
            return (Criteria) this;
        }

        public Criteria andPhamountNotIn(List<Integer> values) {
            addCriterion("phamount not in", values, "phamount");
            return (Criteria) this;
        }

        public Criteria andPhamountBetween(Integer value1, Integer value2) {
            addCriterion("phamount between", value1, value2, "phamount");
            return (Criteria) this;
        }

        public Criteria andPhamountNotBetween(Integer value1, Integer value2) {
            addCriterion("phamount not between", value1, value2, "phamount");
            return (Criteria) this;
        }

        public Criteria andPhcontentIsNull() {
            addCriterion("phcontent is null");
            return (Criteria) this;
        }

        public Criteria andPhcontentIsNotNull() {
            addCriterion("phcontent is not null");
            return (Criteria) this;
        }

        public Criteria andPhcontentEqualTo(String value) {
            addCriterion("phcontent =", value, "phcontent");
            return (Criteria) this;
        }

        public Criteria andPhcontentNotEqualTo(String value) {
            addCriterion("phcontent <>", value, "phcontent");
            return (Criteria) this;
        }

        public Criteria andPhcontentGreaterThan(String value) {
            addCriterion("phcontent >", value, "phcontent");
            return (Criteria) this;
        }

        public Criteria andPhcontentGreaterThanOrEqualTo(String value) {
            addCriterion("phcontent >=", value, "phcontent");
            return (Criteria) this;
        }

        public Criteria andPhcontentLessThan(String value) {
            addCriterion("phcontent <", value, "phcontent");
            return (Criteria) this;
        }

        public Criteria andPhcontentLessThanOrEqualTo(String value) {
            addCriterion("phcontent <=", value, "phcontent");
            return (Criteria) this;
        }

        public Criteria andPhcontentLike(String value) {
            addCriterion("phcontent like", value, "phcontent");
            return (Criteria) this;
        }

        public Criteria andPhcontentNotLike(String value) {
            addCriterion("phcontent not like", value, "phcontent");
            return (Criteria) this;
        }

        public Criteria andPhcontentIn(List<String> values) {
            addCriterion("phcontent in", values, "phcontent");
            return (Criteria) this;
        }

        public Criteria andPhcontentNotIn(List<String> values) {
            addCriterion("phcontent not in", values, "phcontent");
            return (Criteria) this;
        }

        public Criteria andPhcontentBetween(String value1, String value2) {
            addCriterion("phcontent between", value1, value2, "phcontent");
            return (Criteria) this;
        }

        public Criteria andPhcontentNotBetween(String value1, String value2) {
            addCriterion("phcontent not between", value1, value2, "phcontent");
            return (Criteria) this;
        }

        public Criteria andPhnumberpeopleIsNull() {
            addCriterion("phnumberpeople is null");
            return (Criteria) this;
        }

        public Criteria andPhnumberpeopleIsNotNull() {
            addCriterion("phnumberpeople is not null");
            return (Criteria) this;
        }

        public Criteria andPhnumberpeopleEqualTo(Integer value) {
            addCriterion("phnumberpeople =", value, "phnumberpeople");
            return (Criteria) this;
        }

        public Criteria andPhnumberpeopleNotEqualTo(Integer value) {
            addCriterion("phnumberpeople <>", value, "phnumberpeople");
            return (Criteria) this;
        }

        public Criteria andPhnumberpeopleGreaterThan(Integer value) {
            addCriterion("phnumberpeople >", value, "phnumberpeople");
            return (Criteria) this;
        }

        public Criteria andPhnumberpeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("phnumberpeople >=", value, "phnumberpeople");
            return (Criteria) this;
        }

        public Criteria andPhnumberpeopleLessThan(Integer value) {
            addCriterion("phnumberpeople <", value, "phnumberpeople");
            return (Criteria) this;
        }

        public Criteria andPhnumberpeopleLessThanOrEqualTo(Integer value) {
            addCriterion("phnumberpeople <=", value, "phnumberpeople");
            return (Criteria) this;
        }

        public Criteria andPhnumberpeopleIn(List<Integer> values) {
            addCriterion("phnumberpeople in", values, "phnumberpeople");
            return (Criteria) this;
        }

        public Criteria andPhnumberpeopleNotIn(List<Integer> values) {
            addCriterion("phnumberpeople not in", values, "phnumberpeople");
            return (Criteria) this;
        }

        public Criteria andPhnumberpeopleBetween(Integer value1, Integer value2) {
            addCriterion("phnumberpeople between", value1, value2, "phnumberpeople");
            return (Criteria) this;
        }

        public Criteria andPhnumberpeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("phnumberpeople not between", value1, value2, "phnumberpeople");
            return (Criteria) this;
        }

        public Criteria andPhdayIsNull() {
            addCriterion("phday is null");
            return (Criteria) this;
        }

        public Criteria andPhdayIsNotNull() {
            addCriterion("phday is not null");
            return (Criteria) this;
        }

        public Criteria andPhdayEqualTo(Integer value) {
            addCriterion("phday =", value, "phday");
            return (Criteria) this;
        }

        public Criteria andPhdayNotEqualTo(Integer value) {
            addCriterion("phday <>", value, "phday");
            return (Criteria) this;
        }

        public Criteria andPhdayGreaterThan(Integer value) {
            addCriterion("phday >", value, "phday");
            return (Criteria) this;
        }

        public Criteria andPhdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("phday >=", value, "phday");
            return (Criteria) this;
        }

        public Criteria andPhdayLessThan(Integer value) {
            addCriterion("phday <", value, "phday");
            return (Criteria) this;
        }

        public Criteria andPhdayLessThanOrEqualTo(Integer value) {
            addCriterion("phday <=", value, "phday");
            return (Criteria) this;
        }

        public Criteria andPhdayIn(List<Integer> values) {
            addCriterion("phday in", values, "phday");
            return (Criteria) this;
        }

        public Criteria andPhdayNotIn(List<Integer> values) {
            addCriterion("phday not in", values, "phday");
            return (Criteria) this;
        }

        public Criteria andPhdayBetween(Integer value1, Integer value2) {
            addCriterion("phday between", value1, value2, "phday");
            return (Criteria) this;
        }

        public Criteria andPhdayNotBetween(Integer value1, Integer value2) {
            addCriterion("phday not between", value1, value2, "phday");
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