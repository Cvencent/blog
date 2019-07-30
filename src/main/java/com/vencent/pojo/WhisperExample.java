package com.vencent.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WhisperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WhisperExample() {
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

        public Criteria andWhisperIdIsNull() {
            addCriterion("whisper_id is null");
            return (Criteria) this;
        }

        public Criteria andWhisperIdIsNotNull() {
            addCriterion("whisper_id is not null");
            return (Criteria) this;
        }

        public Criteria andWhisperIdEqualTo(Integer value) {
            addCriterion("whisper_id =", value, "whisperId");
            return (Criteria) this;
        }

        public Criteria andWhisperIdNotEqualTo(Integer value) {
            addCriterion("whisper_id <>", value, "whisperId");
            return (Criteria) this;
        }

        public Criteria andWhisperIdGreaterThan(Integer value) {
            addCriterion("whisper_id >", value, "whisperId");
            return (Criteria) this;
        }

        public Criteria andWhisperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("whisper_id >=", value, "whisperId");
            return (Criteria) this;
        }

        public Criteria andWhisperIdLessThan(Integer value) {
            addCriterion("whisper_id <", value, "whisperId");
            return (Criteria) this;
        }

        public Criteria andWhisperIdLessThanOrEqualTo(Integer value) {
            addCriterion("whisper_id <=", value, "whisperId");
            return (Criteria) this;
        }

        public Criteria andWhisperIdIn(List<Integer> values) {
            addCriterion("whisper_id in", values, "whisperId");
            return (Criteria) this;
        }

        public Criteria andWhisperIdNotIn(List<Integer> values) {
            addCriterion("whisper_id not in", values, "whisperId");
            return (Criteria) this;
        }

        public Criteria andWhisperIdBetween(Integer value1, Integer value2) {
            addCriterion("whisper_id between", value1, value2, "whisperId");
            return (Criteria) this;
        }

        public Criteria andWhisperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("whisper_id not between", value1, value2, "whisperId");
            return (Criteria) this;
        }

        public Criteria andWhisperDateIsNull() {
            addCriterion("whisper_date is null");
            return (Criteria) this;
        }

        public Criteria andWhisperDateIsNotNull() {
            addCriterion("whisper_date is not null");
            return (Criteria) this;
        }

        public Criteria andWhisperDateEqualTo(Date value) {
            addCriterion("whisper_date =", value, "whisperDate");
            return (Criteria) this;
        }

        public Criteria andWhisperDateNotEqualTo(Date value) {
            addCriterion("whisper_date <>", value, "whisperDate");
            return (Criteria) this;
        }

        public Criteria andWhisperDateGreaterThan(Date value) {
            addCriterion("whisper_date >", value, "whisperDate");
            return (Criteria) this;
        }

        public Criteria andWhisperDateGreaterThanOrEqualTo(Date value) {
            addCriterion("whisper_date >=", value, "whisperDate");
            return (Criteria) this;
        }

        public Criteria andWhisperDateLessThan(Date value) {
            addCriterion("whisper_date <", value, "whisperDate");
            return (Criteria) this;
        }

        public Criteria andWhisperDateLessThanOrEqualTo(Date value) {
            addCriterion("whisper_date <=", value, "whisperDate");
            return (Criteria) this;
        }

        public Criteria andWhisperDateIn(List<Date> values) {
            addCriterion("whisper_date in", values, "whisperDate");
            return (Criteria) this;
        }

        public Criteria andWhisperDateNotIn(List<Date> values) {
            addCriterion("whisper_date not in", values, "whisperDate");
            return (Criteria) this;
        }

        public Criteria andWhisperDateBetween(Date value1, Date value2) {
            addCriterion("whisper_date between", value1, value2, "whisperDate");
            return (Criteria) this;
        }

        public Criteria andWhisperDateNotBetween(Date value1, Date value2) {
            addCriterion("whisper_date not between", value1, value2, "whisperDate");
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

        public Criteria andClickIsNull() {
            addCriterion("click is null");
            return (Criteria) this;
        }

        public Criteria andClickIsNotNull() {
            addCriterion("click is not null");
            return (Criteria) this;
        }

        public Criteria andClickEqualTo(Integer value) {
            addCriterion("click =", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotEqualTo(Integer value) {
            addCriterion("click <>", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickGreaterThan(Integer value) {
            addCriterion("click >", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickGreaterThanOrEqualTo(Integer value) {
            addCriterion("click >=", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickLessThan(Integer value) {
            addCriterion("click <", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickLessThanOrEqualTo(Integer value) {
            addCriterion("click <=", value, "click");
            return (Criteria) this;
        }

        public Criteria andClickIn(List<Integer> values) {
            addCriterion("click in", values, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotIn(List<Integer> values) {
            addCriterion("click not in", values, "click");
            return (Criteria) this;
        }

        public Criteria andClickBetween(Integer value1, Integer value2) {
            addCriterion("click between", value1, value2, "click");
            return (Criteria) this;
        }

        public Criteria andClickNotBetween(Integer value1, Integer value2) {
            addCriterion("click not between", value1, value2, "click");
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