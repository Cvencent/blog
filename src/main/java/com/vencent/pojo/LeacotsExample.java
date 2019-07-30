package com.vencent.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LeacotsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LeacotsExample() {
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

        public Criteria andLeacotsIdIsNull() {
            addCriterion("leacots_id is null");
            return (Criteria) this;
        }

        public Criteria andLeacotsIdIsNotNull() {
            addCriterion("leacots_id is not null");
            return (Criteria) this;
        }

        public Criteria andLeacotsIdEqualTo(Integer value) {
            addCriterion("leacots_id =", value, "leacotsId");
            return (Criteria) this;
        }

        public Criteria andLeacotsIdNotEqualTo(Integer value) {
            addCriterion("leacots_id <>", value, "leacotsId");
            return (Criteria) this;
        }

        public Criteria andLeacotsIdGreaterThan(Integer value) {
            addCriterion("leacots_id >", value, "leacotsId");
            return (Criteria) this;
        }

        public Criteria andLeacotsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("leacots_id >=", value, "leacotsId");
            return (Criteria) this;
        }

        public Criteria andLeacotsIdLessThan(Integer value) {
            addCriterion("leacots_id <", value, "leacotsId");
            return (Criteria) this;
        }

        public Criteria andLeacotsIdLessThanOrEqualTo(Integer value) {
            addCriterion("leacots_id <=", value, "leacotsId");
            return (Criteria) this;
        }

        public Criteria andLeacotsIdIn(List<Integer> values) {
            addCriterion("leacots_id in", values, "leacotsId");
            return (Criteria) this;
        }

        public Criteria andLeacotsIdNotIn(List<Integer> values) {
            addCriterion("leacots_id not in", values, "leacotsId");
            return (Criteria) this;
        }

        public Criteria andLeacotsIdBetween(Integer value1, Integer value2) {
            addCriterion("leacots_id between", value1, value2, "leacotsId");
            return (Criteria) this;
        }

        public Criteria andLeacotsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("leacots_id not between", value1, value2, "leacotsId");
            return (Criteria) this;
        }

        public Criteria andLeacotsDateIsNull() {
            addCriterion("leacots_date is null");
            return (Criteria) this;
        }

        public Criteria andLeacotsDateIsNotNull() {
            addCriterion("leacots_date is not null");
            return (Criteria) this;
        }

        public Criteria andLeacotsDateEqualTo(Date value) {
            addCriterion("leacots_date =", value, "leacotsDate");
            return (Criteria) this;
        }

        public Criteria andLeacotsDateNotEqualTo(Date value) {
            addCriterion("leacots_date <>", value, "leacotsDate");
            return (Criteria) this;
        }

        public Criteria andLeacotsDateGreaterThan(Date value) {
            addCriterion("leacots_date >", value, "leacotsDate");
            return (Criteria) this;
        }

        public Criteria andLeacotsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("leacots_date >=", value, "leacotsDate");
            return (Criteria) this;
        }

        public Criteria andLeacotsDateLessThan(Date value) {
            addCriterion("leacots_date <", value, "leacotsDate");
            return (Criteria) this;
        }

        public Criteria andLeacotsDateLessThanOrEqualTo(Date value) {
            addCriterion("leacots_date <=", value, "leacotsDate");
            return (Criteria) this;
        }

        public Criteria andLeacotsDateIn(List<Date> values) {
            addCriterion("leacots_date in", values, "leacotsDate");
            return (Criteria) this;
        }

        public Criteria andLeacotsDateNotIn(List<Date> values) {
            addCriterion("leacots_date not in", values, "leacotsDate");
            return (Criteria) this;
        }

        public Criteria andLeacotsDateBetween(Date value1, Date value2) {
            addCriterion("leacots_date between", value1, value2, "leacotsDate");
            return (Criteria) this;
        }

        public Criteria andLeacotsDateNotBetween(Date value1, Date value2) {
            addCriterion("leacots_date not between", value1, value2, "leacotsDate");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUsernickIsNull() {
            addCriterion("usernick is null");
            return (Criteria) this;
        }

        public Criteria andUsernickIsNotNull() {
            addCriterion("usernick is not null");
            return (Criteria) this;
        }

        public Criteria andUsernickEqualTo(String value) {
            addCriterion("usernick =", value, "usernick");
            return (Criteria) this;
        }

        public Criteria andUsernickNotEqualTo(String value) {
            addCriterion("usernick <>", value, "usernick");
            return (Criteria) this;
        }

        public Criteria andUsernickGreaterThan(String value) {
            addCriterion("usernick >", value, "usernick");
            return (Criteria) this;
        }

        public Criteria andUsernickGreaterThanOrEqualTo(String value) {
            addCriterion("usernick >=", value, "usernick");
            return (Criteria) this;
        }

        public Criteria andUsernickLessThan(String value) {
            addCriterion("usernick <", value, "usernick");
            return (Criteria) this;
        }

        public Criteria andUsernickLessThanOrEqualTo(String value) {
            addCriterion("usernick <=", value, "usernick");
            return (Criteria) this;
        }

        public Criteria andUsernickLike(String value) {
            addCriterion("usernick like", value, "usernick");
            return (Criteria) this;
        }

        public Criteria andUsernickNotLike(String value) {
            addCriterion("usernick not like", value, "usernick");
            return (Criteria) this;
        }

        public Criteria andUsernickIn(List<String> values) {
            addCriterion("usernick in", values, "usernick");
            return (Criteria) this;
        }

        public Criteria andUsernickNotIn(List<String> values) {
            addCriterion("usernick not in", values, "usernick");
            return (Criteria) this;
        }

        public Criteria andUsernickBetween(String value1, String value2) {
            addCriterion("usernick between", value1, value2, "usernick");
            return (Criteria) this;
        }

        public Criteria andUsernickNotBetween(String value1, String value2) {
            addCriterion("usernick not between", value1, value2, "usernick");
            return (Criteria) this;
        }

        public Criteria andLeacotsToIsNull() {
            addCriterion("leacots_to is null");
            return (Criteria) this;
        }

        public Criteria andLeacotsToIsNotNull() {
            addCriterion("leacots_to is not null");
            return (Criteria) this;
        }

        public Criteria andLeacotsToEqualTo(Integer value) {
            addCriterion("leacots_to =", value, "leacotsTo");
            return (Criteria) this;
        }

        public Criteria andLeacotsToNotEqualTo(Integer value) {
            addCriterion("leacots_to <>", value, "leacotsTo");
            return (Criteria) this;
        }

        public Criteria andLeacotsToGreaterThan(Integer value) {
            addCriterion("leacots_to >", value, "leacotsTo");
            return (Criteria) this;
        }

        public Criteria andLeacotsToGreaterThanOrEqualTo(Integer value) {
            addCriterion("leacots_to >=", value, "leacotsTo");
            return (Criteria) this;
        }

        public Criteria andLeacotsToLessThan(Integer value) {
            addCriterion("leacots_to <", value, "leacotsTo");
            return (Criteria) this;
        }

        public Criteria andLeacotsToLessThanOrEqualTo(Integer value) {
            addCriterion("leacots_to <=", value, "leacotsTo");
            return (Criteria) this;
        }

        public Criteria andLeacotsToIn(List<Integer> values) {
            addCriterion("leacots_to in", values, "leacotsTo");
            return (Criteria) this;
        }

        public Criteria andLeacotsToNotIn(List<Integer> values) {
            addCriterion("leacots_to not in", values, "leacotsTo");
            return (Criteria) this;
        }

        public Criteria andLeacotsToBetween(Integer value1, Integer value2) {
            addCriterion("leacots_to between", value1, value2, "leacotsTo");
            return (Criteria) this;
        }

        public Criteria andLeacotsToNotBetween(Integer value1, Integer value2) {
            addCriterion("leacots_to not between", value1, value2, "leacotsTo");
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