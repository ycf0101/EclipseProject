package cn.ssm.po.sys;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class QxMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QxMenuExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMenunoIsNull() {
            addCriterion("MENUNO is null");
            return (Criteria) this;
        }

        public Criteria andMenunoIsNotNull() {
            addCriterion("MENUNO is not null");
            return (Criteria) this;
        }

        public Criteria andMenunoEqualTo(String value) {
            addCriterion("MENUNO =", value, "menuno");
            return (Criteria) this;
        }

        public Criteria andMenunoNotEqualTo(String value) {
            addCriterion("MENUNO <>", value, "menuno");
            return (Criteria) this;
        }

        public Criteria andMenunoGreaterThan(String value) {
            addCriterion("MENUNO >", value, "menuno");
            return (Criteria) this;
        }

        public Criteria andMenunoGreaterThanOrEqualTo(String value) {
            addCriterion("MENUNO >=", value, "menuno");
            return (Criteria) this;
        }

        public Criteria andMenunoLessThan(String value) {
            addCriterion("MENUNO <", value, "menuno");
            return (Criteria) this;
        }

        public Criteria andMenunoLessThanOrEqualTo(String value) {
            addCriterion("MENUNO <=", value, "menuno");
            return (Criteria) this;
        }

        public Criteria andMenunoLike(String value) {
            addCriterion("MENUNO like", value, "menuno");
            return (Criteria) this;
        }

        public Criteria andMenunoNotLike(String value) {
            addCriterion("MENUNO not like", value, "menuno");
            return (Criteria) this;
        }

        public Criteria andMenunoIn(List<String> values) {
            addCriterion("MENUNO in", values, "menuno");
            return (Criteria) this;
        }

        public Criteria andMenunoNotIn(List<String> values) {
            addCriterion("MENUNO not in", values, "menuno");
            return (Criteria) this;
        }

        public Criteria andMenunoBetween(String value1, String value2) {
            addCriterion("MENUNO between", value1, value2, "menuno");
            return (Criteria) this;
        }

        public Criteria andMenunoNotBetween(String value1, String value2) {
            addCriterion("MENUNO not between", value1, value2, "menuno");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNull() {
            addCriterion("MENUNAME is null");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNotNull() {
            addCriterion("MENUNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMenunameEqualTo(String value) {
            addCriterion("MENUNAME =", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotEqualTo(String value) {
            addCriterion("MENUNAME <>", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThan(String value) {
            addCriterion("MENUNAME >", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThanOrEqualTo(String value) {
            addCriterion("MENUNAME >=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThan(String value) {
            addCriterion("MENUNAME <", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThanOrEqualTo(String value) {
            addCriterion("MENUNAME <=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLike(String value) {
            addCriterion("MENUNAME like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotLike(String value) {
            addCriterion("MENUNAME not like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameIn(List<String> values) {
            addCriterion("MENUNAME in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotIn(List<String> values) {
            addCriterion("MENUNAME not in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameBetween(String value1, String value2) {
            addCriterion("MENUNAME between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotBetween(String value1, String value2) {
            addCriterion("MENUNAME not between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenuurlIsNull() {
            addCriterion("MENUURL is null");
            return (Criteria) this;
        }

        public Criteria andMenuurlIsNotNull() {
            addCriterion("MENUURL is not null");
            return (Criteria) this;
        }

        public Criteria andMenuurlEqualTo(String value) {
            addCriterion("MENUURL =", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotEqualTo(String value) {
            addCriterion("MENUURL <>", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlGreaterThan(String value) {
            addCriterion("MENUURL >", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlGreaterThanOrEqualTo(String value) {
            addCriterion("MENUURL >=", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlLessThan(String value) {
            addCriterion("MENUURL <", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlLessThanOrEqualTo(String value) {
            addCriterion("MENUURL <=", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlLike(String value) {
            addCriterion("MENUURL like", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotLike(String value) {
            addCriterion("MENUURL not like", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlIn(List<String> values) {
            addCriterion("MENUURL in", values, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotIn(List<String> values) {
            addCriterion("MENUURL not in", values, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlBetween(String value1, String value2) {
            addCriterion("MENUURL between", value1, value2, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotBetween(String value1, String value2) {
            addCriterion("MENUURL not between", value1, value2, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenutypeIsNull() {
            addCriterion("MENUTYPE is null");
            return (Criteria) this;
        }

        public Criteria andMenutypeIsNotNull() {
            addCriterion("MENUTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMenutypeEqualTo(BigDecimal value) {
            addCriterion("MENUTYPE =", value, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeNotEqualTo(BigDecimal value) {
            addCriterion("MENUTYPE <>", value, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeGreaterThan(BigDecimal value) {
            addCriterion("MENUTYPE >", value, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MENUTYPE >=", value, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeLessThan(BigDecimal value) {
            addCriterion("MENUTYPE <", value, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MENUTYPE <=", value, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeIn(List<BigDecimal> values) {
            addCriterion("MENUTYPE in", values, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeNotIn(List<BigDecimal> values) {
            addCriterion("MENUTYPE not in", values, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MENUTYPE between", value1, value2, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MENUTYPE not between", value1, value2, "menutype");
            return (Criteria) this;
        }

        public Criteria andFatheridIsNull() {
            addCriterion("FATHERID is null");
            return (Criteria) this;
        }

        public Criteria andFatheridIsNotNull() {
            addCriterion("FATHERID is not null");
            return (Criteria) this;
        }

        public Criteria andFatheridEqualTo(String value) {
            addCriterion("FATHERID =", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridNotEqualTo(String value) {
            addCriterion("FATHERID <>", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridGreaterThan(String value) {
            addCriterion("FATHERID >", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridGreaterThanOrEqualTo(String value) {
            addCriterion("FATHERID >=", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridLessThan(String value) {
            addCriterion("FATHERID <", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridLessThanOrEqualTo(String value) {
            addCriterion("FATHERID <=", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridLike(String value) {
            addCriterion("FATHERID like", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridNotLike(String value) {
            addCriterion("FATHERID not like", value, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridIn(List<String> values) {
            addCriterion("FATHERID in", values, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridNotIn(List<String> values) {
            addCriterion("FATHERID not in", values, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridBetween(String value1, String value2) {
            addCriterion("FATHERID between", value1, value2, "fatherid");
            return (Criteria) this;
        }

        public Criteria andFatheridNotBetween(String value1, String value2) {
            addCriterion("FATHERID not between", value1, value2, "fatherid");
            return (Criteria) this;
        }

        public Criteria andIscommonIsNull() {
            addCriterion("ISCOMMON is null");
            return (Criteria) this;
        }

        public Criteria andIscommonIsNotNull() {
            addCriterion("ISCOMMON is not null");
            return (Criteria) this;
        }

        public Criteria andIscommonEqualTo(BigDecimal value) {
            addCriterion("ISCOMMON =", value, "iscommon");
            return (Criteria) this;
        }

        public Criteria andIscommonNotEqualTo(BigDecimal value) {
            addCriterion("ISCOMMON <>", value, "iscommon");
            return (Criteria) this;
        }

        public Criteria andIscommonGreaterThan(BigDecimal value) {
            addCriterion("ISCOMMON >", value, "iscommon");
            return (Criteria) this;
        }

        public Criteria andIscommonGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISCOMMON >=", value, "iscommon");
            return (Criteria) this;
        }

        public Criteria andIscommonLessThan(BigDecimal value) {
            addCriterion("ISCOMMON <", value, "iscommon");
            return (Criteria) this;
        }

        public Criteria andIscommonLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISCOMMON <=", value, "iscommon");
            return (Criteria) this;
        }

        public Criteria andIscommonIn(List<BigDecimal> values) {
            addCriterion("ISCOMMON in", values, "iscommon");
            return (Criteria) this;
        }

        public Criteria andIscommonNotIn(List<BigDecimal> values) {
            addCriterion("ISCOMMON not in", values, "iscommon");
            return (Criteria) this;
        }

        public Criteria andIscommonBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISCOMMON between", value1, value2, "iscommon");
            return (Criteria) this;
        }

        public Criteria andIscommonNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISCOMMON not between", value1, value2, "iscommon");
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