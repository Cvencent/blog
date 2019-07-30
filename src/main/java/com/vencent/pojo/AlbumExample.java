package com.vencent.pojo;

import java.util.ArrayList;
import java.util.List;

public class AlbumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlbumExample() {
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

        public Criteria andPhotoIdIsNull() {
            addCriterion("photo_id is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIdIsNotNull() {
            addCriterion("photo_id is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoIdEqualTo(Integer value) {
            addCriterion("photo_id =", value, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdNotEqualTo(Integer value) {
            addCriterion("photo_id <>", value, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdGreaterThan(Integer value) {
            addCriterion("photo_id >", value, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("photo_id >=", value, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdLessThan(Integer value) {
            addCriterion("photo_id <", value, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdLessThanOrEqualTo(Integer value) {
            addCriterion("photo_id <=", value, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdIn(List<Integer> values) {
            addCriterion("photo_id in", values, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdNotIn(List<Integer> values) {
            addCriterion("photo_id not in", values, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdBetween(Integer value1, Integer value2) {
            addCriterion("photo_id between", value1, value2, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("photo_id not between", value1, value2, "photoId");
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

        public Criteria andPlaceIsNull() {
            addCriterion("place is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNotNull() {
            addCriterion("place is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceEqualTo(String value) {
            addCriterion("place =", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotEqualTo(String value) {
            addCriterion("place <>", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThan(String value) {
            addCriterion("place >", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("place >=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThan(String value) {
            addCriterion("place <", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThanOrEqualTo(String value) {
            addCriterion("place <=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLike(String value) {
            addCriterion("place like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotLike(String value) {
            addCriterion("place not like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceIn(List<String> values) {
            addCriterion("place in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotIn(List<String> values) {
            addCriterion("place not in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceBetween(String value1, String value2) {
            addCriterion("place between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotBetween(String value1, String value2) {
            addCriterion("place not between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPhotoDateIsNull() {
            addCriterion("photo_date is null");
            return (Criteria) this;
        }

        public Criteria andPhotoDateIsNotNull() {
            addCriterion("photo_date is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoDateEqualTo(String value) {
            addCriterion("photo_date =", value, "photoDate");
            return (Criteria) this;
        }

        public Criteria andPhotoDateNotEqualTo(String value) {
            addCriterion("photo_date <>", value, "photoDate");
            return (Criteria) this;
        }

        public Criteria andPhotoDateGreaterThan(String value) {
            addCriterion("photo_date >", value, "photoDate");
            return (Criteria) this;
        }

        public Criteria andPhotoDateGreaterThanOrEqualTo(String value) {
            addCriterion("photo_date >=", value, "photoDate");
            return (Criteria) this;
        }

        public Criteria andPhotoDateLessThan(String value) {
            addCriterion("photo_date <", value, "photoDate");
            return (Criteria) this;
        }

        public Criteria andPhotoDateLessThanOrEqualTo(String value) {
            addCriterion("photo_date <=", value, "photoDate");
            return (Criteria) this;
        }

        public Criteria andPhotoDateLike(String value) {
            addCriterion("photo_date like", value, "photoDate");
            return (Criteria) this;
        }

        public Criteria andPhotoDateNotLike(String value) {
            addCriterion("photo_date not like", value, "photoDate");
            return (Criteria) this;
        }

        public Criteria andPhotoDateIn(List<String> values) {
            addCriterion("photo_date in", values, "photoDate");
            return (Criteria) this;
        }

        public Criteria andPhotoDateNotIn(List<String> values) {
            addCriterion("photo_date not in", values, "photoDate");
            return (Criteria) this;
        }

        public Criteria andPhotoDateBetween(String value1, String value2) {
            addCriterion("photo_date between", value1, value2, "photoDate");
            return (Criteria) this;
        }

        public Criteria andPhotoDateNotBetween(String value1, String value2) {
            addCriterion("photo_date not between", value1, value2, "photoDate");
            return (Criteria) this;
        }

        public Criteria andPhotoDetailIsNull() {
            addCriterion("photo_detail is null");
            return (Criteria) this;
        }

        public Criteria andPhotoDetailIsNotNull() {
            addCriterion("photo_detail is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoDetailEqualTo(String value) {
            addCriterion("photo_detail =", value, "photoDetail");
            return (Criteria) this;
        }

        public Criteria andPhotoDetailNotEqualTo(String value) {
            addCriterion("photo_detail <>", value, "photoDetail");
            return (Criteria) this;
        }

        public Criteria andPhotoDetailGreaterThan(String value) {
            addCriterion("photo_detail >", value, "photoDetail");
            return (Criteria) this;
        }

        public Criteria andPhotoDetailGreaterThanOrEqualTo(String value) {
            addCriterion("photo_detail >=", value, "photoDetail");
            return (Criteria) this;
        }

        public Criteria andPhotoDetailLessThan(String value) {
            addCriterion("photo_detail <", value, "photoDetail");
            return (Criteria) this;
        }

        public Criteria andPhotoDetailLessThanOrEqualTo(String value) {
            addCriterion("photo_detail <=", value, "photoDetail");
            return (Criteria) this;
        }

        public Criteria andPhotoDetailLike(String value) {
            addCriterion("photo_detail like", value, "photoDetail");
            return (Criteria) this;
        }

        public Criteria andPhotoDetailNotLike(String value) {
            addCriterion("photo_detail not like", value, "photoDetail");
            return (Criteria) this;
        }

        public Criteria andPhotoDetailIn(List<String> values) {
            addCriterion("photo_detail in", values, "photoDetail");
            return (Criteria) this;
        }

        public Criteria andPhotoDetailNotIn(List<String> values) {
            addCriterion("photo_detail not in", values, "photoDetail");
            return (Criteria) this;
        }

        public Criteria andPhotoDetailBetween(String value1, String value2) {
            addCriterion("photo_detail between", value1, value2, "photoDetail");
            return (Criteria) this;
        }

        public Criteria andPhotoDetailNotBetween(String value1, String value2) {
            addCriterion("photo_detail not between", value1, value2, "photoDetail");
            return (Criteria) this;
        }

        public Criteria andSrcIsNull() {
            addCriterion("src is null");
            return (Criteria) this;
        }

        public Criteria andSrcIsNotNull() {
            addCriterion("src is not null");
            return (Criteria) this;
        }

        public Criteria andSrcEqualTo(String value) {
            addCriterion("src =", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcNotEqualTo(String value) {
            addCriterion("src <>", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcGreaterThan(String value) {
            addCriterion("src >", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcGreaterThanOrEqualTo(String value) {
            addCriterion("src >=", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcLessThan(String value) {
            addCriterion("src <", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcLessThanOrEqualTo(String value) {
            addCriterion("src <=", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcLike(String value) {
            addCriterion("src like", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcNotLike(String value) {
            addCriterion("src not like", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcIn(List<String> values) {
            addCriterion("src in", values, "src");
            return (Criteria) this;
        }

        public Criteria andSrcNotIn(List<String> values) {
            addCriterion("src not in", values, "src");
            return (Criteria) this;
        }

        public Criteria andSrcBetween(String value1, String value2) {
            addCriterion("src between", value1, value2, "src");
            return (Criteria) this;
        }

        public Criteria andSrcNotBetween(String value1, String value2) {
            addCriterion("src not between", value1, value2, "src");
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