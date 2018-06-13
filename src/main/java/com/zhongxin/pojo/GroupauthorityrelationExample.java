package com.zhongxin.pojo;

import java.util.ArrayList;
import java.util.List;

public class GroupauthorityrelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupauthorityrelationExample() {
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

        public Criteria andGroupAuthorityRelationIdIsNull() {
            addCriterion("group_authority_relation_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupAuthorityRelationIdIsNotNull() {
            addCriterion("group_authority_relation_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupAuthorityRelationIdEqualTo(Long value) {
            addCriterion("group_authority_relation_id =", value, "groupAuthorityRelationId");
            return (Criteria) this;
        }

        public Criteria andGroupAuthorityRelationIdNotEqualTo(Long value) {
            addCriterion("group_authority_relation_id <>", value, "groupAuthorityRelationId");
            return (Criteria) this;
        }

        public Criteria andGroupAuthorityRelationIdGreaterThan(Long value) {
            addCriterion("group_authority_relation_id >", value, "groupAuthorityRelationId");
            return (Criteria) this;
        }

        public Criteria andGroupAuthorityRelationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("group_authority_relation_id >=", value, "groupAuthorityRelationId");
            return (Criteria) this;
        }

        public Criteria andGroupAuthorityRelationIdLessThan(Long value) {
            addCriterion("group_authority_relation_id <", value, "groupAuthorityRelationId");
            return (Criteria) this;
        }

        public Criteria andGroupAuthorityRelationIdLessThanOrEqualTo(Long value) {
            addCriterion("group_authority_relation_id <=", value, "groupAuthorityRelationId");
            return (Criteria) this;
        }

        public Criteria andGroupAuthorityRelationIdIn(List<Long> values) {
            addCriterion("group_authority_relation_id in", values, "groupAuthorityRelationId");
            return (Criteria) this;
        }

        public Criteria andGroupAuthorityRelationIdNotIn(List<Long> values) {
            addCriterion("group_authority_relation_id not in", values, "groupAuthorityRelationId");
            return (Criteria) this;
        }

        public Criteria andGroupAuthorityRelationIdBetween(Long value1, Long value2) {
            addCriterion("group_authority_relation_id between", value1, value2, "groupAuthorityRelationId");
            return (Criteria) this;
        }

        public Criteria andGroupAuthorityRelationIdNotBetween(Long value1, Long value2) {
            addCriterion("group_authority_relation_id not between", value1, value2, "groupAuthorityRelationId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Long value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Long value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Long value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Long value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Long> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Long> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Long value1, Long value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdIsNull() {
            addCriterion("authority_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdIsNotNull() {
            addCriterion("authority_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdEqualTo(Long value) {
            addCriterion("authority_id =", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotEqualTo(Long value) {
            addCriterion("authority_id <>", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdGreaterThan(Long value) {
            addCriterion("authority_id >", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("authority_id >=", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdLessThan(Long value) {
            addCriterion("authority_id <", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdLessThanOrEqualTo(Long value) {
            addCriterion("authority_id <=", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdIn(List<Long> values) {
            addCriterion("authority_id in", values, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotIn(List<Long> values) {
            addCriterion("authority_id not in", values, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdBetween(Long value1, Long value2) {
            addCriterion("authority_id between", value1, value2, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotBetween(Long value1, Long value2) {
            addCriterion("authority_id not between", value1, value2, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeIsNull() {
            addCriterion("authority_type is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeIsNotNull() {
            addCriterion("authority_type is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeEqualTo(Integer value) {
            addCriterion("authority_type =", value, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeNotEqualTo(Integer value) {
            addCriterion("authority_type <>", value, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeGreaterThan(Integer value) {
            addCriterion("authority_type >", value, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("authority_type >=", value, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeLessThan(Integer value) {
            addCriterion("authority_type <", value, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeLessThanOrEqualTo(Integer value) {
            addCriterion("authority_type <=", value, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeIn(List<Integer> values) {
            addCriterion("authority_type in", values, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeNotIn(List<Integer> values) {
            addCriterion("authority_type not in", values, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeBetween(Integer value1, Integer value2) {
            addCriterion("authority_type between", value1, value2, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("authority_type not between", value1, value2, "authorityType");
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