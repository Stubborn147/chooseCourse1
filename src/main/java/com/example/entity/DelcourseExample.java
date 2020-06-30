package com.example.entity;

import java.util.ArrayList;
import java.util.List;

public class DelcourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DelcourseExample() {
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

        public Criteria andDelidIsNull() {
            addCriterion("delid is null");
            return (Criteria) this;
        }

        public Criteria andDelidIsNotNull() {
            addCriterion("delid is not null");
            return (Criteria) this;
        }

        public Criteria andDelidEqualTo(Integer value) {
            addCriterion("delid =", value, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidNotEqualTo(Integer value) {
            addCriterion("delid <>", value, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidGreaterThan(Integer value) {
            addCriterion("delid >", value, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("delid >=", value, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidLessThan(Integer value) {
            addCriterion("delid <", value, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidLessThanOrEqualTo(Integer value) {
            addCriterion("delid <=", value, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidIn(List<Integer> values) {
            addCriterion("delid in", values, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidNotIn(List<Integer> values) {
            addCriterion("delid not in", values, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidBetween(Integer value1, Integer value2) {
            addCriterion("delid between", value1, value2, "delid");
            return (Criteria) this;
        }

        public Criteria andDelidNotBetween(Integer value1, Integer value2) {
            addCriterion("delid not between", value1, value2, "delid");
            return (Criteria) this;
        }

        public Criteria andDelsidIsNull() {
            addCriterion("delsid is null");
            return (Criteria) this;
        }

        public Criteria andDelsidIsNotNull() {
            addCriterion("delsid is not null");
            return (Criteria) this;
        }

        public Criteria andDelsidEqualTo(String value) {
            addCriterion("delsid =", value, "delsid");
            return (Criteria) this;
        }

        public Criteria andDelsidNotEqualTo(String value) {
            addCriterion("delsid <>", value, "delsid");
            return (Criteria) this;
        }

        public Criteria andDelsidGreaterThan(String value) {
            addCriterion("delsid >", value, "delsid");
            return (Criteria) this;
        }

        public Criteria andDelsidGreaterThanOrEqualTo(String value) {
            addCriterion("delsid >=", value, "delsid");
            return (Criteria) this;
        }

        public Criteria andDelsidLessThan(String value) {
            addCriterion("delsid <", value, "delsid");
            return (Criteria) this;
        }

        public Criteria andDelsidLessThanOrEqualTo(String value) {
            addCriterion("delsid <=", value, "delsid");
            return (Criteria) this;
        }

        public Criteria andDelsidLike(String value) {
            addCriterion("delsid like", value, "delsid");
            return (Criteria) this;
        }

        public Criteria andDelsidNotLike(String value) {
            addCriterion("delsid not like", value, "delsid");
            return (Criteria) this;
        }

        public Criteria andDelsidIn(List<String> values) {
            addCriterion("delsid in", values, "delsid");
            return (Criteria) this;
        }

        public Criteria andDelsidNotIn(List<String> values) {
            addCriterion("delsid not in", values, "delsid");
            return (Criteria) this;
        }

        public Criteria andDelsidBetween(String value1, String value2) {
            addCriterion("delsid between", value1, value2, "delsid");
            return (Criteria) this;
        }

        public Criteria andDelsidNotBetween(String value1, String value2) {
            addCriterion("delsid not between", value1, value2, "delsid");
            return (Criteria) this;
        }

        public Criteria andDeltidIsNull() {
            addCriterion("deltid is null");
            return (Criteria) this;
        }

        public Criteria andDeltidIsNotNull() {
            addCriterion("deltid is not null");
            return (Criteria) this;
        }

        public Criteria andDeltidEqualTo(String value) {
            addCriterion("deltid =", value, "deltid");
            return (Criteria) this;
        }

        public Criteria andDeltidNotEqualTo(String value) {
            addCriterion("deltid <>", value, "deltid");
            return (Criteria) this;
        }

        public Criteria andDeltidGreaterThan(String value) {
            addCriterion("deltid >", value, "deltid");
            return (Criteria) this;
        }

        public Criteria andDeltidGreaterThanOrEqualTo(String value) {
            addCriterion("deltid >=", value, "deltid");
            return (Criteria) this;
        }

        public Criteria andDeltidLessThan(String value) {
            addCriterion("deltid <", value, "deltid");
            return (Criteria) this;
        }

        public Criteria andDeltidLessThanOrEqualTo(String value) {
            addCriterion("deltid <=", value, "deltid");
            return (Criteria) this;
        }

        public Criteria andDeltidLike(String value) {
            addCriterion("deltid like", value, "deltid");
            return (Criteria) this;
        }

        public Criteria andDeltidNotLike(String value) {
            addCriterion("deltid not like", value, "deltid");
            return (Criteria) this;
        }

        public Criteria andDeltidIn(List<String> values) {
            addCriterion("deltid in", values, "deltid");
            return (Criteria) this;
        }

        public Criteria andDeltidNotIn(List<String> values) {
            addCriterion("deltid not in", values, "deltid");
            return (Criteria) this;
        }

        public Criteria andDeltidBetween(String value1, String value2) {
            addCriterion("deltid between", value1, value2, "deltid");
            return (Criteria) this;
        }

        public Criteria andDeltidNotBetween(String value1, String value2) {
            addCriterion("deltid not between", value1, value2, "deltid");
            return (Criteria) this;
        }

        public Criteria andDelcidIsNull() {
            addCriterion("delcid is null");
            return (Criteria) this;
        }

        public Criteria andDelcidIsNotNull() {
            addCriterion("delcid is not null");
            return (Criteria) this;
        }

        public Criteria andDelcidEqualTo(String value) {
            addCriterion("delcid =", value, "delcid");
            return (Criteria) this;
        }

        public Criteria andDelcidNotEqualTo(String value) {
            addCriterion("delcid <>", value, "delcid");
            return (Criteria) this;
        }

        public Criteria andDelcidGreaterThan(String value) {
            addCriterion("delcid >", value, "delcid");
            return (Criteria) this;
        }

        public Criteria andDelcidGreaterThanOrEqualTo(String value) {
            addCriterion("delcid >=", value, "delcid");
            return (Criteria) this;
        }

        public Criteria andDelcidLessThan(String value) {
            addCriterion("delcid <", value, "delcid");
            return (Criteria) this;
        }

        public Criteria andDelcidLessThanOrEqualTo(String value) {
            addCriterion("delcid <=", value, "delcid");
            return (Criteria) this;
        }

        public Criteria andDelcidLike(String value) {
            addCriterion("delcid like", value, "delcid");
            return (Criteria) this;
        }

        public Criteria andDelcidNotLike(String value) {
            addCriterion("delcid not like", value, "delcid");
            return (Criteria) this;
        }

        public Criteria andDelcidIn(List<String> values) {
            addCriterion("delcid in", values, "delcid");
            return (Criteria) this;
        }

        public Criteria andDelcidNotIn(List<String> values) {
            addCriterion("delcid not in", values, "delcid");
            return (Criteria) this;
        }

        public Criteria andDelcidBetween(String value1, String value2) {
            addCriterion("delcid between", value1, value2, "delcid");
            return (Criteria) this;
        }

        public Criteria andDelcidNotBetween(String value1, String value2) {
            addCriterion("delcid not between", value1, value2, "delcid");
            return (Criteria) this;
        }

        public Criteria andDelcontentIsNull() {
            addCriterion("delcontent is null");
            return (Criteria) this;
        }

        public Criteria andDelcontentIsNotNull() {
            addCriterion("delcontent is not null");
            return (Criteria) this;
        }

        public Criteria andDelcontentEqualTo(String value) {
            addCriterion("delcontent =", value, "delcontent");
            return (Criteria) this;
        }

        public Criteria andDelcontentNotEqualTo(String value) {
            addCriterion("delcontent <>", value, "delcontent");
            return (Criteria) this;
        }

        public Criteria andDelcontentGreaterThan(String value) {
            addCriterion("delcontent >", value, "delcontent");
            return (Criteria) this;
        }

        public Criteria andDelcontentGreaterThanOrEqualTo(String value) {
            addCriterion("delcontent >=", value, "delcontent");
            return (Criteria) this;
        }

        public Criteria andDelcontentLessThan(String value) {
            addCriterion("delcontent <", value, "delcontent");
            return (Criteria) this;
        }

        public Criteria andDelcontentLessThanOrEqualTo(String value) {
            addCriterion("delcontent <=", value, "delcontent");
            return (Criteria) this;
        }

        public Criteria andDelcontentLike(String value) {
            addCriterion("delcontent like", value, "delcontent");
            return (Criteria) this;
        }

        public Criteria andDelcontentNotLike(String value) {
            addCriterion("delcontent not like", value, "delcontent");
            return (Criteria) this;
        }

        public Criteria andDelcontentIn(List<String> values) {
            addCriterion("delcontent in", values, "delcontent");
            return (Criteria) this;
        }

        public Criteria andDelcontentNotIn(List<String> values) {
            addCriterion("delcontent not in", values, "delcontent");
            return (Criteria) this;
        }

        public Criteria andDelcontentBetween(String value1, String value2) {
            addCriterion("delcontent between", value1, value2, "delcontent");
            return (Criteria) this;
        }

        public Criteria andDelcontentNotBetween(String value1, String value2) {
            addCriterion("delcontent not between", value1, value2, "delcontent");
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