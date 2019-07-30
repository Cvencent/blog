package com.vencent.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplyExample() {
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

        public Criteria andReplyIdIsNull() {
            addCriterion("reply_id is null");
            return (Criteria) this;
        }

        public Criteria andReplyIdIsNotNull() {
            addCriterion("reply_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplyIdEqualTo(Integer value) {
            addCriterion("reply_id =", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotEqualTo(Integer value) {
            addCriterion("reply_id <>", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdGreaterThan(Integer value) {
            addCriterion("reply_id >", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_id >=", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLessThan(Integer value) {
            addCriterion("reply_id <", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("reply_id <=", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdIn(List<Integer> values) {
            addCriterion("reply_id in", values, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotIn(List<Integer> values) {
            addCriterion("reply_id not in", values, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdBetween(Integer value1, Integer value2) {
            addCriterion("reply_id between", value1, value2, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_id not between", value1, value2, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyFromIsNull() {
            addCriterion("reply_from is null");
            return (Criteria) this;
        }

        public Criteria andReplyFromIsNotNull() {
            addCriterion("reply_from is not null");
            return (Criteria) this;
        }

        public Criteria andReplyFromEqualTo(Integer value) {
            addCriterion("reply_from =", value, "replyFrom");
            return (Criteria) this;
        }

        public Criteria andReplyFromNotEqualTo(Integer value) {
            addCriterion("reply_from <>", value, "replyFrom");
            return (Criteria) this;
        }

        public Criteria andReplyFromGreaterThan(Integer value) {
            addCriterion("reply_from >", value, "replyFrom");
            return (Criteria) this;
        }

        public Criteria andReplyFromGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_from >=", value, "replyFrom");
            return (Criteria) this;
        }

        public Criteria andReplyFromLessThan(Integer value) {
            addCriterion("reply_from <", value, "replyFrom");
            return (Criteria) this;
        }

        public Criteria andReplyFromLessThanOrEqualTo(Integer value) {
            addCriterion("reply_from <=", value, "replyFrom");
            return (Criteria) this;
        }

        public Criteria andReplyFromIn(List<Integer> values) {
            addCriterion("reply_from in", values, "replyFrom");
            return (Criteria) this;
        }

        public Criteria andReplyFromNotIn(List<Integer> values) {
            addCriterion("reply_from not in", values, "replyFrom");
            return (Criteria) this;
        }

        public Criteria andReplyFromBetween(Integer value1, Integer value2) {
            addCriterion("reply_from between", value1, value2, "replyFrom");
            return (Criteria) this;
        }

        public Criteria andReplyFromNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_from not between", value1, value2, "replyFrom");
            return (Criteria) this;
        }

        public Criteria andReplyDateIsNull() {
            addCriterion("reply_date is null");
            return (Criteria) this;
        }

        public Criteria andReplyDateIsNotNull() {
            addCriterion("reply_date is not null");
            return (Criteria) this;
        }

        public Criteria andReplyDateEqualTo(Date value) {
            addCriterion("reply_date =", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateNotEqualTo(Date value) {
            addCriterion("reply_date <>", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateGreaterThan(Date value) {
            addCriterion("reply_date >", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("reply_date >=", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateLessThan(Date value) {
            addCriterion("reply_date <", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateLessThanOrEqualTo(Date value) {
            addCriterion("reply_date <=", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateIn(List<Date> values) {
            addCriterion("reply_date in", values, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateNotIn(List<Date> values) {
            addCriterion("reply_date not in", values, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateBetween(Date value1, Date value2) {
            addCriterion("reply_date between", value1, value2, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateNotBetween(Date value1, Date value2) {
            addCriterion("reply_date not between", value1, value2, "replyDate");
            return (Criteria) this;
        }

        public Criteria andTextIdIsNull() {
            addCriterion("text_id is null");
            return (Criteria) this;
        }

        public Criteria andTextIdIsNotNull() {
            addCriterion("text_id is not null");
            return (Criteria) this;
        }

        public Criteria andTextIdEqualTo(Integer value) {
            addCriterion("text_id =", value, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdNotEqualTo(Integer value) {
            addCriterion("text_id <>", value, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdGreaterThan(Integer value) {
            addCriterion("text_id >", value, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("text_id >=", value, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdLessThan(Integer value) {
            addCriterion("text_id <", value, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdLessThanOrEqualTo(Integer value) {
            addCriterion("text_id <=", value, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdIn(List<Integer> values) {
            addCriterion("text_id in", values, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdNotIn(List<Integer> values) {
            addCriterion("text_id not in", values, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdBetween(Integer value1, Integer value2) {
            addCriterion("text_id between", value1, value2, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdNotBetween(Integer value1, Integer value2) {
            addCriterion("text_id not between", value1, value2, "textId");
            return (Criteria) this;
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