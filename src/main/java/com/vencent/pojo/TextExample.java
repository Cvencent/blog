package com.vencent.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TextExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TextExample() {
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

        public Criteria andTextlineIsNull() {
            addCriterion("textline is null");
            return (Criteria) this;
        }

        public Criteria andTextlineIsNotNull() {
            addCriterion("textline is not null");
            return (Criteria) this;
        }

        public Criteria andTextlineEqualTo(String value) {
            addCriterion("textline =", value, "textline");
            return (Criteria) this;
        }

        public Criteria andTextlineNotEqualTo(String value) {
            addCriterion("textline <>", value, "textline");
            return (Criteria) this;
        }

        public Criteria andTextlineGreaterThan(String value) {
            addCriterion("textline >", value, "textline");
            return (Criteria) this;
        }

        public Criteria andTextlineGreaterThanOrEqualTo(String value) {
            addCriterion("textline >=", value, "textline");
            return (Criteria) this;
        }

        public Criteria andTextlineLessThan(String value) {
            addCriterion("textline <", value, "textline");
            return (Criteria) this;
        }

        public Criteria andTextlineLessThanOrEqualTo(String value) {
            addCriterion("textline <=", value, "textline");
            return (Criteria) this;
        }

        public Criteria andTextlineLike(String value) {
            addCriterion("textline like", value, "textline");
            return (Criteria) this;
        }

        public Criteria andTextlineNotLike(String value) {
            addCriterion("textline not like", value, "textline");
            return (Criteria) this;
        }

        public Criteria andTextlineIn(List<String> values) {
            addCriterion("textline in", values, "textline");
            return (Criteria) this;
        }

        public Criteria andTextlineNotIn(List<String> values) {
            addCriterion("textline not in", values, "textline");
            return (Criteria) this;
        }

        public Criteria andTextlineBetween(String value1, String value2) {
            addCriterion("textline between", value1, value2, "textline");
            return (Criteria) this;
        }

        public Criteria andTextlineNotBetween(String value1, String value2) {
            addCriterion("textline not between", value1, value2, "textline");
            return (Criteria) this;
        }

        public Criteria andTextTypeIsNull() {
            addCriterion("text_type is null");
            return (Criteria) this;
        }

        public Criteria andTextTypeIsNotNull() {
            addCriterion("text_type is not null");
            return (Criteria) this;
        }

        public Criteria andTextTypeEqualTo(String value) {
            addCriterion("text_type =", value, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeNotEqualTo(String value) {
            addCriterion("text_type <>", value, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeGreaterThan(String value) {
            addCriterion("text_type >", value, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeGreaterThanOrEqualTo(String value) {
            addCriterion("text_type >=", value, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeLessThan(String value) {
            addCriterion("text_type <", value, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeLessThanOrEqualTo(String value) {
            addCriterion("text_type <=", value, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeLike(String value) {
            addCriterion("text_type like", value, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeNotLike(String value) {
            addCriterion("text_type not like", value, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeIn(List<String> values) {
            addCriterion("text_type in", values, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeNotIn(List<String> values) {
            addCriterion("text_type not in", values, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeBetween(String value1, String value2) {
            addCriterion("text_type between", value1, value2, "textType");
            return (Criteria) this;
        }

        public Criteria andTextTypeNotBetween(String value1, String value2) {
            addCriterion("text_type not between", value1, value2, "textType");
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

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
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