package manjuu.mbg.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MachineDataExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MACHINE_DATA
     *
     * @mbggenerated Sat May 21 15:42:04 JST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MACHINE_DATA
     *
     * @mbggenerated Sat May 21 15:42:04 JST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MACHINE_DATA
     *
     * @mbggenerated Sat May 21 15:42:04 JST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MACHINE_DATA
     *
     * @mbggenerated Sat May 21 15:42:04 JST 2016
     */
    public MachineDataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MACHINE_DATA
     *
     * @mbggenerated Sat May 21 15:42:04 JST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MACHINE_DATA
     *
     * @mbggenerated Sat May 21 15:42:04 JST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MACHINE_DATA
     *
     * @mbggenerated Sat May 21 15:42:04 JST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MACHINE_DATA
     *
     * @mbggenerated Sat May 21 15:42:04 JST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MACHINE_DATA
     *
     * @mbggenerated Sat May 21 15:42:04 JST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MACHINE_DATA
     *
     * @mbggenerated Sat May 21 15:42:04 JST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MACHINE_DATA
     *
     * @mbggenerated Sat May 21 15:42:04 JST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MACHINE_DATA
     *
     * @mbggenerated Sat May 21 15:42:04 JST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MACHINE_DATA
     *
     * @mbggenerated Sat May 21 15:42:04 JST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MACHINE_DATA
     *
     * @mbggenerated Sat May 21 15:42:04 JST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table MACHINE_DATA
     *
     * @mbggenerated Sat May 21 15:42:04 JST 2016
     */
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSyutokubiIsNull() {
            addCriterion("SYUTOKUBI is null");
            return (Criteria) this;
        }

        public Criteria andSyutokubiIsNotNull() {
            addCriterion("SYUTOKUBI is not null");
            return (Criteria) this;
        }

        public Criteria andSyutokubiEqualTo(Date value) {
            addCriterionForJDBCDate("SYUTOKUBI =", value, "syutokubi");
            return (Criteria) this;
        }

        public Criteria andSyutokubiNotEqualTo(Date value) {
            addCriterionForJDBCDate("SYUTOKUBI <>", value, "syutokubi");
            return (Criteria) this;
        }

        public Criteria andSyutokubiGreaterThan(Date value) {
            addCriterionForJDBCDate("SYUTOKUBI >", value, "syutokubi");
            return (Criteria) this;
        }

        public Criteria andSyutokubiGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SYUTOKUBI >=", value, "syutokubi");
            return (Criteria) this;
        }

        public Criteria andSyutokubiLessThan(Date value) {
            addCriterionForJDBCDate("SYUTOKUBI <", value, "syutokubi");
            return (Criteria) this;
        }

        public Criteria andSyutokubiLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SYUTOKUBI <=", value, "syutokubi");
            return (Criteria) this;
        }

        public Criteria andSyutokubiIn(List<Date> values) {
            addCriterionForJDBCDate("SYUTOKUBI in", values, "syutokubi");
            return (Criteria) this;
        }

        public Criteria andSyutokubiNotIn(List<Date> values) {
            addCriterionForJDBCDate("SYUTOKUBI not in", values, "syutokubi");
            return (Criteria) this;
        }

        public Criteria andSyutokubiBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SYUTOKUBI between", value1, value2, "syutokubi");
            return (Criteria) this;
        }

        public Criteria andSyutokubiNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SYUTOKUBI not between", value1, value2, "syutokubi");
            return (Criteria) this;
        }

        public Criteria andMachineNoIsNull() {
            addCriterion("MACHINE_NO is null");
            return (Criteria) this;
        }

        public Criteria andMachineNoIsNotNull() {
            addCriterion("MACHINE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMachineNoEqualTo(String value) {
            addCriterion("MACHINE_NO =", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoNotEqualTo(String value) {
            addCriterion("MACHINE_NO <>", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoGreaterThan(String value) {
            addCriterion("MACHINE_NO >", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoGreaterThanOrEqualTo(String value) {
            addCriterion("MACHINE_NO >=", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoLessThan(String value) {
            addCriterion("MACHINE_NO <", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoLessThanOrEqualTo(String value) {
            addCriterion("MACHINE_NO <=", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoLike(String value) {
            addCriterion("MACHINE_NO like", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoNotLike(String value) {
            addCriterion("MACHINE_NO not like", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoIn(List<String> values) {
            addCriterion("MACHINE_NO in", values, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoNotIn(List<String> values) {
            addCriterion("MACHINE_NO not in", values, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoBetween(String value1, String value2) {
            addCriterion("MACHINE_NO between", value1, value2, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoNotBetween(String value1, String value2) {
            addCriterion("MACHINE_NO not between", value1, value2, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNameIsNull() {
            addCriterion("MACHINE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMachineNameIsNotNull() {
            addCriterion("MACHINE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMachineNameEqualTo(String value) {
            addCriterion("MACHINE_NAME =", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameNotEqualTo(String value) {
            addCriterion("MACHINE_NAME <>", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameGreaterThan(String value) {
            addCriterion("MACHINE_NAME >", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameGreaterThanOrEqualTo(String value) {
            addCriterion("MACHINE_NAME >=", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameLessThan(String value) {
            addCriterion("MACHINE_NAME <", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameLessThanOrEqualTo(String value) {
            addCriterion("MACHINE_NAME <=", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameLike(String value) {
            addCriterion("MACHINE_NAME like", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameNotLike(String value) {
            addCriterion("MACHINE_NAME not like", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameIn(List<String> values) {
            addCriterion("MACHINE_NAME in", values, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameNotIn(List<String> values) {
            addCriterion("MACHINE_NAME not in", values, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameBetween(String value1, String value2) {
            addCriterion("MACHINE_NAME between", value1, value2, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameNotBetween(String value1, String value2) {
            addCriterion("MACHINE_NAME not between", value1, value2, "machineName");
            return (Criteria) this;
        }

        public Criteria andGamesIsNull() {
            addCriterion("GAMES is null");
            return (Criteria) this;
        }

        public Criteria andGamesIsNotNull() {
            addCriterion("GAMES is not null");
            return (Criteria) this;
        }

        public Criteria andGamesEqualTo(Integer value) {
            addCriterion("GAMES =", value, "games");
            return (Criteria) this;
        }

        public Criteria andGamesNotEqualTo(Integer value) {
            addCriterion("GAMES <>", value, "games");
            return (Criteria) this;
        }

        public Criteria andGamesGreaterThan(Integer value) {
            addCriterion("GAMES >", value, "games");
            return (Criteria) this;
        }

        public Criteria andGamesGreaterThanOrEqualTo(Integer value) {
            addCriterion("GAMES >=", value, "games");
            return (Criteria) this;
        }

        public Criteria andGamesLessThan(Integer value) {
            addCriterion("GAMES <", value, "games");
            return (Criteria) this;
        }

        public Criteria andGamesLessThanOrEqualTo(Integer value) {
            addCriterion("GAMES <=", value, "games");
            return (Criteria) this;
        }

        public Criteria andGamesIn(List<Integer> values) {
            addCriterion("GAMES in", values, "games");
            return (Criteria) this;
        }

        public Criteria andGamesNotIn(List<Integer> values) {
            addCriterion("GAMES not in", values, "games");
            return (Criteria) this;
        }

        public Criteria andGamesBetween(Integer value1, Integer value2) {
            addCriterion("GAMES between", value1, value2, "games");
            return (Criteria) this;
        }

        public Criteria andGamesNotBetween(Integer value1, Integer value2) {
            addCriterion("GAMES not between", value1, value2, "games");
            return (Criteria) this;
        }

        public Criteria andPayoutIsNull() {
            addCriterion("PAYOUT is null");
            return (Criteria) this;
        }

        public Criteria andPayoutIsNotNull() {
            addCriterion("PAYOUT is not null");
            return (Criteria) this;
        }

        public Criteria andPayoutEqualTo(Integer value) {
            addCriterion("PAYOUT =", value, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutNotEqualTo(Integer value) {
            addCriterion("PAYOUT <>", value, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutGreaterThan(Integer value) {
            addCriterion("PAYOUT >", value, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAYOUT >=", value, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutLessThan(Integer value) {
            addCriterion("PAYOUT <", value, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutLessThanOrEqualTo(Integer value) {
            addCriterion("PAYOUT <=", value, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutIn(List<Integer> values) {
            addCriterion("PAYOUT in", values, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutNotIn(List<Integer> values) {
            addCriterion("PAYOUT not in", values, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutBetween(Integer value1, Integer value2) {
            addCriterion("PAYOUT between", value1, value2, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutNotBetween(Integer value1, Integer value2) {
            addCriterion("PAYOUT not between", value1, value2, "payout");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table MACHINE_DATA
     *
     * @mbggenerated do_not_delete_during_merge Sat May 21 15:42:04 JST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table MACHINE_DATA
     *
     * @mbggenerated Sat May 21 15:42:04 JST 2016
     */
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