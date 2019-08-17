package com.zhb.bean.customers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCustomersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCustomersExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andWechatIsNull() {
            addCriterion("wechat is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("wechat is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("wechat =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("wechat <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("wechat >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("wechat >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("wechat <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("wechat <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("wechat like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("wechat not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("wechat in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("wechat not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("wechat between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("wechat not between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andExpendPerdayIsNull() {
            addCriterion("expend_perday is null");
            return (Criteria) this;
        }

        public Criteria andExpendPerdayIsNotNull() {
            addCriterion("expend_perday is not null");
            return (Criteria) this;
        }

        public Criteria andExpendPerdayEqualTo(Integer value) {
            addCriterion("expend_perday =", value, "expendPerday");
            return (Criteria) this;
        }

        public Criteria andExpendPerdayNotEqualTo(Integer value) {
            addCriterion("expend_perday <>", value, "expendPerday");
            return (Criteria) this;
        }

        public Criteria andExpendPerdayGreaterThan(Integer value) {
            addCriterion("expend_perday >", value, "expendPerday");
            return (Criteria) this;
        }

        public Criteria andExpendPerdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("expend_perday >=", value, "expendPerday");
            return (Criteria) this;
        }

        public Criteria andExpendPerdayLessThan(Integer value) {
            addCriterion("expend_perday <", value, "expendPerday");
            return (Criteria) this;
        }

        public Criteria andExpendPerdayLessThanOrEqualTo(Integer value) {
            addCriterion("expend_perday <=", value, "expendPerday");
            return (Criteria) this;
        }

        public Criteria andExpendPerdayIn(List<Integer> values) {
            addCriterion("expend_perday in", values, "expendPerday");
            return (Criteria) this;
        }

        public Criteria andExpendPerdayNotIn(List<Integer> values) {
            addCriterion("expend_perday not in", values, "expendPerday");
            return (Criteria) this;
        }

        public Criteria andExpendPerdayBetween(Integer value1, Integer value2) {
            addCriterion("expend_perday between", value1, value2, "expendPerday");
            return (Criteria) this;
        }

        public Criteria andExpendPerdayNotBetween(Integer value1, Integer value2) {
            addCriterion("expend_perday not between", value1, value2, "expendPerday");
            return (Criteria) this;
        }

        public Criteria andFeddingPatternIsNull() {
            addCriterion("fedding_pattern is null");
            return (Criteria) this;
        }

        public Criteria andFeddingPatternIsNotNull() {
            addCriterion("fedding_pattern is not null");
            return (Criteria) this;
        }

        public Criteria andFeddingPatternEqualTo(String value) {
            addCriterion("fedding_pattern =", value, "feddingPattern");
            return (Criteria) this;
        }

        public Criteria andFeddingPatternNotEqualTo(String value) {
            addCriterion("fedding_pattern <>", value, "feddingPattern");
            return (Criteria) this;
        }

        public Criteria andFeddingPatternGreaterThan(String value) {
            addCriterion("fedding_pattern >", value, "feddingPattern");
            return (Criteria) this;
        }

        public Criteria andFeddingPatternGreaterThanOrEqualTo(String value) {
            addCriterion("fedding_pattern >=", value, "feddingPattern");
            return (Criteria) this;
        }

        public Criteria andFeddingPatternLessThan(String value) {
            addCriterion("fedding_pattern <", value, "feddingPattern");
            return (Criteria) this;
        }

        public Criteria andFeddingPatternLessThanOrEqualTo(String value) {
            addCriterion("fedding_pattern <=", value, "feddingPattern");
            return (Criteria) this;
        }

        public Criteria andFeddingPatternLike(String value) {
            addCriterion("fedding_pattern like", value, "feddingPattern");
            return (Criteria) this;
        }

        public Criteria andFeddingPatternNotLike(String value) {
            addCriterion("fedding_pattern not like", value, "feddingPattern");
            return (Criteria) this;
        }

        public Criteria andFeddingPatternIn(List<String> values) {
            addCriterion("fedding_pattern in", values, "feddingPattern");
            return (Criteria) this;
        }

        public Criteria andFeddingPatternNotIn(List<String> values) {
            addCriterion("fedding_pattern not in", values, "feddingPattern");
            return (Criteria) this;
        }

        public Criteria andFeddingPatternBetween(String value1, String value2) {
            addCriterion("fedding_pattern between", value1, value2, "feddingPattern");
            return (Criteria) this;
        }

        public Criteria andFeddingPatternNotBetween(String value1, String value2) {
            addCriterion("fedding_pattern not between", value1, value2, "feddingPattern");
            return (Criteria) this;
        }

        public Criteria andIsTrialIsNull() {
            addCriterion("is_trial is null");
            return (Criteria) this;
        }

        public Criteria andIsTrialIsNotNull() {
            addCriterion("is_trial is not null");
            return (Criteria) this;
        }

        public Criteria andIsTrialEqualTo(String value) {
            addCriterion("is_trial =", value, "isTrial");
            return (Criteria) this;
        }

        public Criteria andIsTrialNotEqualTo(String value) {
            addCriterion("is_trial <>", value, "isTrial");
            return (Criteria) this;
        }

        public Criteria andIsTrialGreaterThan(String value) {
            addCriterion("is_trial >", value, "isTrial");
            return (Criteria) this;
        }

        public Criteria andIsTrialGreaterThanOrEqualTo(String value) {
            addCriterion("is_trial >=", value, "isTrial");
            return (Criteria) this;
        }

        public Criteria andIsTrialLessThan(String value) {
            addCriterion("is_trial <", value, "isTrial");
            return (Criteria) this;
        }

        public Criteria andIsTrialLessThanOrEqualTo(String value) {
            addCriterion("is_trial <=", value, "isTrial");
            return (Criteria) this;
        }

        public Criteria andIsTrialLike(String value) {
            addCriterion("is_trial like", value, "isTrial");
            return (Criteria) this;
        }

        public Criteria andIsTrialNotLike(String value) {
            addCriterion("is_trial not like", value, "isTrial");
            return (Criteria) this;
        }

        public Criteria andIsTrialIn(List<String> values) {
            addCriterion("is_trial in", values, "isTrial");
            return (Criteria) this;
        }

        public Criteria andIsTrialNotIn(List<String> values) {
            addCriterion("is_trial not in", values, "isTrial");
            return (Criteria) this;
        }

        public Criteria andIsTrialBetween(String value1, String value2) {
            addCriterion("is_trial between", value1, value2, "isTrial");
            return (Criteria) this;
        }

        public Criteria andIsTrialNotBetween(String value1, String value2) {
            addCriterion("is_trial not between", value1, value2, "isTrial");
            return (Criteria) this;
        }

        public Criteria andPurchaseIntentionIsNull() {
            addCriterion("purchase_intention is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseIntentionIsNotNull() {
            addCriterion("purchase_intention is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseIntentionEqualTo(String value) {
            addCriterion("purchase_intention =", value, "purchaseIntention");
            return (Criteria) this;
        }

        public Criteria andPurchaseIntentionNotEqualTo(String value) {
            addCriterion("purchase_intention <>", value, "purchaseIntention");
            return (Criteria) this;
        }

        public Criteria andPurchaseIntentionGreaterThan(String value) {
            addCriterion("purchase_intention >", value, "purchaseIntention");
            return (Criteria) this;
        }

        public Criteria andPurchaseIntentionGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_intention >=", value, "purchaseIntention");
            return (Criteria) this;
        }

        public Criteria andPurchaseIntentionLessThan(String value) {
            addCriterion("purchase_intention <", value, "purchaseIntention");
            return (Criteria) this;
        }

        public Criteria andPurchaseIntentionLessThanOrEqualTo(String value) {
            addCriterion("purchase_intention <=", value, "purchaseIntention");
            return (Criteria) this;
        }

        public Criteria andPurchaseIntentionLike(String value) {
            addCriterion("purchase_intention like", value, "purchaseIntention");
            return (Criteria) this;
        }

        public Criteria andPurchaseIntentionNotLike(String value) {
            addCriterion("purchase_intention not like", value, "purchaseIntention");
            return (Criteria) this;
        }

        public Criteria andPurchaseIntentionIn(List<String> values) {
            addCriterion("purchase_intention in", values, "purchaseIntention");
            return (Criteria) this;
        }

        public Criteria andPurchaseIntentionNotIn(List<String> values) {
            addCriterion("purchase_intention not in", values, "purchaseIntention");
            return (Criteria) this;
        }

        public Criteria andPurchaseIntentionBetween(String value1, String value2) {
            addCriterion("purchase_intention between", value1, value2, "purchaseIntention");
            return (Criteria) this;
        }

        public Criteria andPurchaseIntentionNotBetween(String value1, String value2) {
            addCriterion("purchase_intention not between", value1, value2, "purchaseIntention");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andGuideIdIsNull() {
            addCriterion("guide_id is null");
            return (Criteria) this;
        }

        public Criteria andGuideIdIsNotNull() {
            addCriterion("guide_id is not null");
            return (Criteria) this;
        }

        public Criteria andGuideIdEqualTo(String value) {
            addCriterion("guide_id =", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdNotEqualTo(String value) {
            addCriterion("guide_id <>", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdGreaterThan(String value) {
            addCriterion("guide_id >", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdGreaterThanOrEqualTo(String value) {
            addCriterion("guide_id >=", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdLessThan(String value) {
            addCriterion("guide_id <", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdLessThanOrEqualTo(String value) {
            addCriterion("guide_id <=", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdLike(String value) {
            addCriterion("guide_id like", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdNotLike(String value) {
            addCriterion("guide_id not like", value, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdIn(List<String> values) {
            addCriterion("guide_id in", values, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdNotIn(List<String> values) {
            addCriterion("guide_id not in", values, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdBetween(String value1, String value2) {
            addCriterion("guide_id between", value1, value2, "guideId");
            return (Criteria) this;
        }

        public Criteria andGuideIdNotBetween(String value1, String value2) {
            addCriterion("guide_id not between", value1, value2, "guideId");
            return (Criteria) this;
        }

        public Criteria andBuyIntentionIsNull() {
            addCriterion("buy_intention is null");
            return (Criteria) this;
        }

        public Criteria andBuyIntentionIsNotNull() {
            addCriterion("buy_intention is not null");
            return (Criteria) this;
        }

        public Criteria andBuyIntentionEqualTo(String value) {
            addCriterion("buy_intention =", value, "buyIntention");
            return (Criteria) this;
        }

        public Criteria andBuyIntentionNotEqualTo(String value) {
            addCriterion("buy_intention <>", value, "buyIntention");
            return (Criteria) this;
        }

        public Criteria andBuyIntentionGreaterThan(String value) {
            addCriterion("buy_intention >", value, "buyIntention");
            return (Criteria) this;
        }

        public Criteria andBuyIntentionGreaterThanOrEqualTo(String value) {
            addCriterion("buy_intention >=", value, "buyIntention");
            return (Criteria) this;
        }

        public Criteria andBuyIntentionLessThan(String value) {
            addCriterion("buy_intention <", value, "buyIntention");
            return (Criteria) this;
        }

        public Criteria andBuyIntentionLessThanOrEqualTo(String value) {
            addCriterion("buy_intention <=", value, "buyIntention");
            return (Criteria) this;
        }

        public Criteria andBuyIntentionLike(String value) {
            addCriterion("buy_intention like", value, "buyIntention");
            return (Criteria) this;
        }

        public Criteria andBuyIntentionNotLike(String value) {
            addCriterion("buy_intention not like", value, "buyIntention");
            return (Criteria) this;
        }

        public Criteria andBuyIntentionIn(List<String> values) {
            addCriterion("buy_intention in", values, "buyIntention");
            return (Criteria) this;
        }

        public Criteria andBuyIntentionNotIn(List<String> values) {
            addCriterion("buy_intention not in", values, "buyIntention");
            return (Criteria) this;
        }

        public Criteria andBuyIntentionBetween(String value1, String value2) {
            addCriterion("buy_intention between", value1, value2, "buyIntention");
            return (Criteria) this;
        }

        public Criteria andBuyIntentionNotBetween(String value1, String value2) {
            addCriterion("buy_intention not between", value1, value2, "buyIntention");
            return (Criteria) this;
        }

        public Criteria andIsCommunicationIsNull() {
            addCriterion("is_communication is null");
            return (Criteria) this;
        }

        public Criteria andIsCommunicationIsNotNull() {
            addCriterion("is_communication is not null");
            return (Criteria) this;
        }

        public Criteria andIsCommunicationEqualTo(String value) {
            addCriterion("is_communication =", value, "isCommunication");
            return (Criteria) this;
        }

        public Criteria andIsCommunicationNotEqualTo(String value) {
            addCriterion("is_communication <>", value, "isCommunication");
            return (Criteria) this;
        }

        public Criteria andIsCommunicationGreaterThan(String value) {
            addCriterion("is_communication >", value, "isCommunication");
            return (Criteria) this;
        }

        public Criteria andIsCommunicationGreaterThanOrEqualTo(String value) {
            addCriterion("is_communication >=", value, "isCommunication");
            return (Criteria) this;
        }

        public Criteria andIsCommunicationLessThan(String value) {
            addCriterion("is_communication <", value, "isCommunication");
            return (Criteria) this;
        }

        public Criteria andIsCommunicationLessThanOrEqualTo(String value) {
            addCriterion("is_communication <=", value, "isCommunication");
            return (Criteria) this;
        }

        public Criteria andIsCommunicationLike(String value) {
            addCriterion("is_communication like", value, "isCommunication");
            return (Criteria) this;
        }

        public Criteria andIsCommunicationNotLike(String value) {
            addCriterion("is_communication not like", value, "isCommunication");
            return (Criteria) this;
        }

        public Criteria andIsCommunicationIn(List<String> values) {
            addCriterion("is_communication in", values, "isCommunication");
            return (Criteria) this;
        }

        public Criteria andIsCommunicationNotIn(List<String> values) {
            addCriterion("is_communication not in", values, "isCommunication");
            return (Criteria) this;
        }

        public Criteria andIsCommunicationBetween(String value1, String value2) {
            addCriterion("is_communication between", value1, value2, "isCommunication");
            return (Criteria) this;
        }

        public Criteria andIsCommunicationNotBetween(String value1, String value2) {
            addCriterion("is_communication not between", value1, value2, "isCommunication");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(Integer value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(Integer value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(Integer value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(Integer value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(Integer value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<Integer> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<Integer> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(Integer value1, Integer value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(Integer value1, Integer value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andDsIsNull() {
            addCriterion("ds is null");
            return (Criteria) this;
        }

        public Criteria andDsIsNotNull() {
            addCriterion("ds is not null");
            return (Criteria) this;
        }

        public Criteria andDsEqualTo(String value) {
            addCriterion("ds =", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsNotEqualTo(String value) {
            addCriterion("ds <>", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsGreaterThan(String value) {
            addCriterion("ds >", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsGreaterThanOrEqualTo(String value) {
            addCriterion("ds >=", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsLessThan(String value) {
            addCriterion("ds <", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsLessThanOrEqualTo(String value) {
            addCriterion("ds <=", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsLike(String value) {
            addCriterion("ds like", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsNotLike(String value) {
            addCriterion("ds not like", value, "ds");
            return (Criteria) this;
        }

        public Criteria andDsIn(List<String> values) {
            addCriterion("ds in", values, "ds");
            return (Criteria) this;
        }

        public Criteria andDsNotIn(List<String> values) {
            addCriterion("ds not in", values, "ds");
            return (Criteria) this;
        }

        public Criteria andDsBetween(String value1, String value2) {
            addCriterion("ds between", value1, value2, "ds");
            return (Criteria) this;
        }

        public Criteria andDsNotBetween(String value1, String value2) {
            addCriterion("ds not between", value1, value2, "ds");
            return (Criteria) this;
        }

        public Criteria andIsStatusIsNull() {
            addCriterion("is_status is null");
            return (Criteria) this;
        }

        public Criteria andIsStatusIsNotNull() {
            addCriterion("is_status is not null");
            return (Criteria) this;
        }

        public Criteria andIsStatusEqualTo(String value) {
            addCriterion("is_status =", value, "isStatus");
            return (Criteria) this;
        }

        public Criteria andIsStatusNotEqualTo(String value) {
            addCriterion("is_status <>", value, "isStatus");
            return (Criteria) this;
        }

        public Criteria andIsStatusGreaterThan(String value) {
            addCriterion("is_status >", value, "isStatus");
            return (Criteria) this;
        }

        public Criteria andIsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("is_status >=", value, "isStatus");
            return (Criteria) this;
        }

        public Criteria andIsStatusLessThan(String value) {
            addCriterion("is_status <", value, "isStatus");
            return (Criteria) this;
        }

        public Criteria andIsStatusLessThanOrEqualTo(String value) {
            addCriterion("is_status <=", value, "isStatus");
            return (Criteria) this;
        }

        public Criteria andIsStatusLike(String value) {
            addCriterion("is_status like", value, "isStatus");
            return (Criteria) this;
        }

        public Criteria andIsStatusNotLike(String value) {
            addCriterion("is_status not like", value, "isStatus");
            return (Criteria) this;
        }

        public Criteria andIsStatusIn(List<String> values) {
            addCriterion("is_status in", values, "isStatus");
            return (Criteria) this;
        }

        public Criteria andIsStatusNotIn(List<String> values) {
            addCriterion("is_status not in", values, "isStatus");
            return (Criteria) this;
        }

        public Criteria andIsStatusBetween(String value1, String value2) {
            addCriterion("is_status between", value1, value2, "isStatus");
            return (Criteria) this;
        }

        public Criteria andIsStatusNotBetween(String value1, String value2) {
            addCriterion("is_status not between", value1, value2, "isStatus");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNull() {
            addCriterion("creat_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(Date value) {
            addCriterion("creat_time =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(Date value) {
            addCriterion("creat_time <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(Date value) {
            addCriterion("creat_time >", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creat_time >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThan(Date value) {
            addCriterion("creat_time <", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("creat_time <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIn(List<Date> values) {
            addCriterion("creat_time in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotIn(List<Date> values) {
            addCriterion("creat_time not in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(Date value1, Date value2) {
            addCriterion("creat_time between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("creat_time not between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDataFromIsNull() {
            addCriterion("data_from is null");
            return (Criteria) this;
        }

        public Criteria andDataFromIsNotNull() {
            addCriterion("data_from is not null");
            return (Criteria) this;
        }

        public Criteria andDataFromEqualTo(String value) {
            addCriterion("data_from =", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromNotEqualTo(String value) {
            addCriterion("data_from <>", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromGreaterThan(String value) {
            addCriterion("data_from >", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromGreaterThanOrEqualTo(String value) {
            addCriterion("data_from >=", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromLessThan(String value) {
            addCriterion("data_from <", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromLessThanOrEqualTo(String value) {
            addCriterion("data_from <=", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromLike(String value) {
            addCriterion("data_from like", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromNotLike(String value) {
            addCriterion("data_from not like", value, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromIn(List<String> values) {
            addCriterion("data_from in", values, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromNotIn(List<String> values) {
            addCriterion("data_from not in", values, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromBetween(String value1, String value2) {
            addCriterion("data_from between", value1, value2, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andDataFromNotBetween(String value1, String value2) {
            addCriterion("data_from not between", value1, value2, "dataFrom");
            return (Criteria) this;
        }

        public Criteria andCrmIdIsNull() {
            addCriterion("crm_id is null");
            return (Criteria) this;
        }

        public Criteria andCrmIdIsNotNull() {
            addCriterion("crm_id is not null");
            return (Criteria) this;
        }

        public Criteria andCrmIdEqualTo(Integer value) {
            addCriterion("crm_id =", value, "crmId");
            return (Criteria) this;
        }

        public Criteria andCrmIdNotEqualTo(Integer value) {
            addCriterion("crm_id <>", value, "crmId");
            return (Criteria) this;
        }

        public Criteria andCrmIdGreaterThan(Integer value) {
            addCriterion("crm_id >", value, "crmId");
            return (Criteria) this;
        }

        public Criteria andCrmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("crm_id >=", value, "crmId");
            return (Criteria) this;
        }

        public Criteria andCrmIdLessThan(Integer value) {
            addCriterion("crm_id <", value, "crmId");
            return (Criteria) this;
        }

        public Criteria andCrmIdLessThanOrEqualTo(Integer value) {
            addCriterion("crm_id <=", value, "crmId");
            return (Criteria) this;
        }

        public Criteria andCrmIdIn(List<Integer> values) {
            addCriterion("crm_id in", values, "crmId");
            return (Criteria) this;
        }

        public Criteria andCrmIdNotIn(List<Integer> values) {
            addCriterion("crm_id not in", values, "crmId");
            return (Criteria) this;
        }

        public Criteria andCrmIdBetween(Integer value1, Integer value2) {
            addCriterion("crm_id between", value1, value2, "crmId");
            return (Criteria) this;
        }

        public Criteria andCrmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("crm_id not between", value1, value2, "crmId");
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