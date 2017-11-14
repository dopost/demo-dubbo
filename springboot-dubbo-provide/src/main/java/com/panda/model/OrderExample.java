package com.panda.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andImeiIsNull() {
            addCriterion("IMEI is null");
            return (Criteria) this;
        }

        public Criteria andImeiIsNotNull() {
            addCriterion("IMEI is not null");
            return (Criteria) this;
        }

        public Criteria andImeiEqualTo(String value) {
            addCriterion("IMEI =", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotEqualTo(String value) {
            addCriterion("IMEI <>", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThan(String value) {
            addCriterion("IMEI >", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThanOrEqualTo(String value) {
            addCriterion("IMEI >=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThan(String value) {
            addCriterion("IMEI <", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThanOrEqualTo(String value) {
            addCriterion("IMEI <=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLike(String value) {
            addCriterion("IMEI like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotLike(String value) {
            addCriterion("IMEI not like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiIn(List<String> values) {
            addCriterion("IMEI in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotIn(List<String> values) {
            addCriterion("IMEI not in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiBetween(String value1, String value2) {
            addCriterion("IMEI between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotBetween(String value1, String value2) {
            addCriterion("IMEI not between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andAppidIsNull() {
            addCriterion("APPID is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("APPID is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(Integer value) {
            addCriterion("APPID =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(Integer value) {
            addCriterion("APPID <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(Integer value) {
            addCriterion("APPID >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(Integer value) {
            addCriterion("APPID >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(Integer value) {
            addCriterion("APPID <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(Integer value) {
            addCriterion("APPID <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<Integer> values) {
            addCriterion("APPID in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<Integer> values) {
            addCriterion("APPID not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(Integer value1, Integer value2) {
            addCriterion("APPID between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(Integer value1, Integer value2) {
            addCriterion("APPID not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("CHANNEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("CHANNEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(Integer value) {
            addCriterion("CHANNEL_ID =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(Integer value) {
            addCriterion("CHANNEL_ID <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(Integer value) {
            addCriterion("CHANNEL_ID >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHANNEL_ID >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(Integer value) {
            addCriterion("CHANNEL_ID <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(Integer value) {
            addCriterion("CHANNEL_ID <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<Integer> values) {
            addCriterion("CHANNEL_ID in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<Integer> values) {
            addCriterion("CHANNEL_ID not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(Integer value1, Integer value2) {
            addCriterion("CHANNEL_ID between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CHANNEL_ID not between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andCpOrderIdIsNull() {
            addCriterion("CP_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCpOrderIdIsNotNull() {
            addCriterion("CP_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCpOrderIdEqualTo(String value) {
            addCriterion("CP_ORDER_ID =", value, "cpOrderId");
            return (Criteria) this;
        }

        public Criteria andCpOrderIdNotEqualTo(String value) {
            addCriterion("CP_ORDER_ID <>", value, "cpOrderId");
            return (Criteria) this;
        }

        public Criteria andCpOrderIdGreaterThan(String value) {
            addCriterion("CP_ORDER_ID >", value, "cpOrderId");
            return (Criteria) this;
        }

        public Criteria andCpOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("CP_ORDER_ID >=", value, "cpOrderId");
            return (Criteria) this;
        }

        public Criteria andCpOrderIdLessThan(String value) {
            addCriterion("CP_ORDER_ID <", value, "cpOrderId");
            return (Criteria) this;
        }

        public Criteria andCpOrderIdLessThanOrEqualTo(String value) {
            addCriterion("CP_ORDER_ID <=", value, "cpOrderId");
            return (Criteria) this;
        }

        public Criteria andCpOrderIdLike(String value) {
            addCriterion("CP_ORDER_ID like", value, "cpOrderId");
            return (Criteria) this;
        }

        public Criteria andCpOrderIdNotLike(String value) {
            addCriterion("CP_ORDER_ID not like", value, "cpOrderId");
            return (Criteria) this;
        }

        public Criteria andCpOrderIdIn(List<String> values) {
            addCriterion("CP_ORDER_ID in", values, "cpOrderId");
            return (Criteria) this;
        }

        public Criteria andCpOrderIdNotIn(List<String> values) {
            addCriterion("CP_ORDER_ID not in", values, "cpOrderId");
            return (Criteria) this;
        }

        public Criteria andCpOrderIdBetween(String value1, String value2) {
            addCriterion("CP_ORDER_ID between", value1, value2, "cpOrderId");
            return (Criteria) this;
        }

        public Criteria andCpOrderIdNotBetween(String value1, String value2) {
            addCriterion("CP_ORDER_ID not between", value1, value2, "cpOrderId");
            return (Criteria) this;
        }

        public Criteria andChannelOrderIdIsNull() {
            addCriterion("CHANNEL_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andChannelOrderIdIsNotNull() {
            addCriterion("CHANNEL_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChannelOrderIdEqualTo(String value) {
            addCriterion("CHANNEL_ORDER_ID =", value, "channelOrderId");
            return (Criteria) this;
        }

        public Criteria andChannelOrderIdNotEqualTo(String value) {
            addCriterion("CHANNEL_ORDER_ID <>", value, "channelOrderId");
            return (Criteria) this;
        }

        public Criteria andChannelOrderIdGreaterThan(String value) {
            addCriterion("CHANNEL_ORDER_ID >", value, "channelOrderId");
            return (Criteria) this;
        }

        public Criteria andChannelOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_ORDER_ID >=", value, "channelOrderId");
            return (Criteria) this;
        }

        public Criteria andChannelOrderIdLessThan(String value) {
            addCriterion("CHANNEL_ORDER_ID <", value, "channelOrderId");
            return (Criteria) this;
        }

        public Criteria andChannelOrderIdLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_ORDER_ID <=", value, "channelOrderId");
            return (Criteria) this;
        }

        public Criteria andChannelOrderIdLike(String value) {
            addCriterion("CHANNEL_ORDER_ID like", value, "channelOrderId");
            return (Criteria) this;
        }

        public Criteria andChannelOrderIdNotLike(String value) {
            addCriterion("CHANNEL_ORDER_ID not like", value, "channelOrderId");
            return (Criteria) this;
        }

        public Criteria andChannelOrderIdIn(List<String> values) {
            addCriterion("CHANNEL_ORDER_ID in", values, "channelOrderId");
            return (Criteria) this;
        }

        public Criteria andChannelOrderIdNotIn(List<String> values) {
            addCriterion("CHANNEL_ORDER_ID not in", values, "channelOrderId");
            return (Criteria) this;
        }

        public Criteria andChannelOrderIdBetween(String value1, String value2) {
            addCriterion("CHANNEL_ORDER_ID between", value1, value2, "channelOrderId");
            return (Criteria) this;
        }

        public Criteria andChannelOrderIdNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_ORDER_ID not between", value1, value2, "channelOrderId");
            return (Criteria) this;
        }

        public Criteria andBuyAmountIsNull() {
            addCriterion("BUY_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBuyAmountIsNotNull() {
            addCriterion("BUY_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBuyAmountEqualTo(Integer value) {
            addCriterion("BUY_AMOUNT =", value, "buyAmount");
            return (Criteria) this;
        }

        public Criteria andBuyAmountNotEqualTo(Integer value) {
            addCriterion("BUY_AMOUNT <>", value, "buyAmount");
            return (Criteria) this;
        }

        public Criteria andBuyAmountGreaterThan(Integer value) {
            addCriterion("BUY_AMOUNT >", value, "buyAmount");
            return (Criteria) this;
        }

        public Criteria andBuyAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("BUY_AMOUNT >=", value, "buyAmount");
            return (Criteria) this;
        }

        public Criteria andBuyAmountLessThan(Integer value) {
            addCriterion("BUY_AMOUNT <", value, "buyAmount");
            return (Criteria) this;
        }

        public Criteria andBuyAmountLessThanOrEqualTo(Integer value) {
            addCriterion("BUY_AMOUNT <=", value, "buyAmount");
            return (Criteria) this;
        }

        public Criteria andBuyAmountIn(List<Integer> values) {
            addCriterion("BUY_AMOUNT in", values, "buyAmount");
            return (Criteria) this;
        }

        public Criteria andBuyAmountNotIn(List<Integer> values) {
            addCriterion("BUY_AMOUNT not in", values, "buyAmount");
            return (Criteria) this;
        }

        public Criteria andBuyAmountBetween(Integer value1, Integer value2) {
            addCriterion("BUY_AMOUNT between", value1, value2, "buyAmount");
            return (Criteria) this;
        }

        public Criteria andBuyAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("BUY_AMOUNT not between", value1, value2, "buyAmount");
            return (Criteria) this;
        }

        public Criteria andProductPerPriceIsNull() {
            addCriterion("PRODUCT_PER_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andProductPerPriceIsNotNull() {
            addCriterion("PRODUCT_PER_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andProductPerPriceEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_PER_PRICE =", value, "productPerPrice");
            return (Criteria) this;
        }

        public Criteria andProductPerPriceNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_PER_PRICE <>", value, "productPerPrice");
            return (Criteria) this;
        }

        public Criteria andProductPerPriceGreaterThan(BigDecimal value) {
            addCriterion("PRODUCT_PER_PRICE >", value, "productPerPrice");
            return (Criteria) this;
        }

        public Criteria andProductPerPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_PER_PRICE >=", value, "productPerPrice");
            return (Criteria) this;
        }

        public Criteria andProductPerPriceLessThan(BigDecimal value) {
            addCriterion("PRODUCT_PER_PRICE <", value, "productPerPrice");
            return (Criteria) this;
        }

        public Criteria andProductPerPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_PER_PRICE <=", value, "productPerPrice");
            return (Criteria) this;
        }

        public Criteria andProductPerPriceIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_PER_PRICE in", values, "productPerPrice");
            return (Criteria) this;
        }

        public Criteria andProductPerPriceNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_PER_PRICE not in", values, "productPerPrice");
            return (Criteria) this;
        }

        public Criteria andProductPerPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_PER_PRICE between", value1, value2, "productPerPrice");
            return (Criteria) this;
        }

        public Criteria andProductPerPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_PER_PRICE not between", value1, value2, "productPerPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("TOTAL_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("TOTAL_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(BigDecimal value) {
            addCriterion("TOTAL_PRICE =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_PRICE <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_PRICE >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_PRICE >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(BigDecimal value) {
            addCriterion("TOTAL_PRICE <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_PRICE <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<BigDecimal> values) {
            addCriterion("TOTAL_PRICE in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_PRICE not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_PRICE between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_PRICE not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDeliverStatusIsNull() {
            addCriterion("DELIVER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andDeliverStatusIsNotNull() {
            addCriterion("DELIVER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverStatusEqualTo(Boolean value) {
            addCriterion("DELIVER_STATUS =", value, "deliverStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverStatusNotEqualTo(Boolean value) {
            addCriterion("DELIVER_STATUS <>", value, "deliverStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverStatusGreaterThan(Boolean value) {
            addCriterion("DELIVER_STATUS >", value, "deliverStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DELIVER_STATUS >=", value, "deliverStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverStatusLessThan(Boolean value) {
            addCriterion("DELIVER_STATUS <", value, "deliverStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("DELIVER_STATUS <=", value, "deliverStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverStatusIn(List<Boolean> values) {
            addCriterion("DELIVER_STATUS in", values, "deliverStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverStatusNotIn(List<Boolean> values) {
            addCriterion("DELIVER_STATUS not in", values, "deliverStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("DELIVER_STATUS between", value1, value2, "deliverStatus");
            return (Criteria) this;
        }

        public Criteria andDeliverStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DELIVER_STATUS not between", value1, value2, "deliverStatus");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("PRODUCT_NAME =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("PRODUCT_NAME <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("PRODUCT_NAME >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("PRODUCT_NAME <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("PRODUCT_NAME like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("PRODUCT_NAME not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("PRODUCT_NAME in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("PRODUCT_NAME not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductDescIsNull() {
            addCriterion("PRODUCT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andProductDescIsNotNull() {
            addCriterion("PRODUCT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescEqualTo(String value) {
            addCriterion("PRODUCT_DESC =", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotEqualTo(String value) {
            addCriterion("PRODUCT_DESC <>", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescGreaterThan(String value) {
            addCriterion("PRODUCT_DESC >", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_DESC >=", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLessThan(String value) {
            addCriterion("PRODUCT_DESC <", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_DESC <=", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLike(String value) {
            addCriterion("PRODUCT_DESC like", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotLike(String value) {
            addCriterion("PRODUCT_DESC not like", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescIn(List<String> values) {
            addCriterion("PRODUCT_DESC in", values, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotIn(List<String> values) {
            addCriterion("PRODUCT_DESC not in", values, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescBetween(String value1, String value2) {
            addCriterion("PRODUCT_DESC between", value1, value2, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_DESC not between", value1, value2, "productDesc");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("UID is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("UID is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("UID =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("UID <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("UID >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("UID >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("UID <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("UID <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("UID like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("UID not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("UID in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("UID not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("UID between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("UID not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesIsNull() {
            addCriterion("NOTIFY_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesIsNotNull() {
            addCriterion("NOTIFY_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesEqualTo(Byte value) {
            addCriterion("NOTIFY_TIMES =", value, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesNotEqualTo(Byte value) {
            addCriterion("NOTIFY_TIMES <>", value, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesGreaterThan(Byte value) {
            addCriterion("NOTIFY_TIMES >", value, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesGreaterThanOrEqualTo(Byte value) {
            addCriterion("NOTIFY_TIMES >=", value, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesLessThan(Byte value) {
            addCriterion("NOTIFY_TIMES <", value, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesLessThanOrEqualTo(Byte value) {
            addCriterion("NOTIFY_TIMES <=", value, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesIn(List<Byte> values) {
            addCriterion("NOTIFY_TIMES in", values, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesNotIn(List<Byte> values) {
            addCriterion("NOTIFY_TIMES not in", values, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesBetween(Byte value1, Byte value2) {
            addCriterion("NOTIFY_TIMES between", value1, value2, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andNotifyTimesNotBetween(Byte value1, Byte value2) {
            addCriterion("NOTIFY_TIMES not between", value1, value2, "notifyTimes");
            return (Criteria) this;
        }

        public Criteria andExtendParamIsNull() {
            addCriterion("EXTEND_PARAM is null");
            return (Criteria) this;
        }

        public Criteria andExtendParamIsNotNull() {
            addCriterion("EXTEND_PARAM is not null");
            return (Criteria) this;
        }

        public Criteria andExtendParamEqualTo(String value) {
            addCriterion("EXTEND_PARAM =", value, "extendParam");
            return (Criteria) this;
        }

        public Criteria andExtendParamNotEqualTo(String value) {
            addCriterion("EXTEND_PARAM <>", value, "extendParam");
            return (Criteria) this;
        }

        public Criteria andExtendParamGreaterThan(String value) {
            addCriterion("EXTEND_PARAM >", value, "extendParam");
            return (Criteria) this;
        }

        public Criteria andExtendParamGreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_PARAM >=", value, "extendParam");
            return (Criteria) this;
        }

        public Criteria andExtendParamLessThan(String value) {
            addCriterion("EXTEND_PARAM <", value, "extendParam");
            return (Criteria) this;
        }

        public Criteria andExtendParamLessThanOrEqualTo(String value) {
            addCriterion("EXTEND_PARAM <=", value, "extendParam");
            return (Criteria) this;
        }

        public Criteria andExtendParamLike(String value) {
            addCriterion("EXTEND_PARAM like", value, "extendParam");
            return (Criteria) this;
        }

        public Criteria andExtendParamNotLike(String value) {
            addCriterion("EXTEND_PARAM not like", value, "extendParam");
            return (Criteria) this;
        }

        public Criteria andExtendParamIn(List<String> values) {
            addCriterion("EXTEND_PARAM in", values, "extendParam");
            return (Criteria) this;
        }

        public Criteria andExtendParamNotIn(List<String> values) {
            addCriterion("EXTEND_PARAM not in", values, "extendParam");
            return (Criteria) this;
        }

        public Criteria andExtendParamBetween(String value1, String value2) {
            addCriterion("EXTEND_PARAM between", value1, value2, "extendParam");
            return (Criteria) this;
        }

        public Criteria andExtendParamNotBetween(String value1, String value2) {
            addCriterion("EXTEND_PARAM not between", value1, value2, "extendParam");
            return (Criteria) this;
        }

        public Criteria andChannelCtimeIsNull() {
            addCriterion("CHANNEL_CTIME is null");
            return (Criteria) this;
        }

        public Criteria andChannelCtimeIsNotNull() {
            addCriterion("CHANNEL_CTIME is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCtimeEqualTo(Long value) {
            addCriterion("CHANNEL_CTIME =", value, "channelCtime");
            return (Criteria) this;
        }

        public Criteria andChannelCtimeNotEqualTo(Long value) {
            addCriterion("CHANNEL_CTIME <>", value, "channelCtime");
            return (Criteria) this;
        }

        public Criteria andChannelCtimeGreaterThan(Long value) {
            addCriterion("CHANNEL_CTIME >", value, "channelCtime");
            return (Criteria) this;
        }

        public Criteria andChannelCtimeGreaterThanOrEqualTo(Long value) {
            addCriterion("CHANNEL_CTIME >=", value, "channelCtime");
            return (Criteria) this;
        }

        public Criteria andChannelCtimeLessThan(Long value) {
            addCriterion("CHANNEL_CTIME <", value, "channelCtime");
            return (Criteria) this;
        }

        public Criteria andChannelCtimeLessThanOrEqualTo(Long value) {
            addCriterion("CHANNEL_CTIME <=", value, "channelCtime");
            return (Criteria) this;
        }

        public Criteria andChannelCtimeIn(List<Long> values) {
            addCriterion("CHANNEL_CTIME in", values, "channelCtime");
            return (Criteria) this;
        }

        public Criteria andChannelCtimeNotIn(List<Long> values) {
            addCriterion("CHANNEL_CTIME not in", values, "channelCtime");
            return (Criteria) this;
        }

        public Criteria andChannelCtimeBetween(Long value1, Long value2) {
            addCriterion("CHANNEL_CTIME between", value1, value2, "channelCtime");
            return (Criteria) this;
        }

        public Criteria andChannelCtimeNotBetween(Long value1, Long value2) {
            addCriterion("CHANNEL_CTIME not between", value1, value2, "channelCtime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeIsNull() {
            addCriterion("SUCCESS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeIsNotNull() {
            addCriterion("SUCCESS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeEqualTo(Long value) {
            addCriterion("SUCCESS_TIME =", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeNotEqualTo(Long value) {
            addCriterion("SUCCESS_TIME <>", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeGreaterThan(Long value) {
            addCriterion("SUCCESS_TIME >", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("SUCCESS_TIME >=", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeLessThan(Long value) {
            addCriterion("SUCCESS_TIME <", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeLessThanOrEqualTo(Long value) {
            addCriterion("SUCCESS_TIME <=", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeIn(List<Long> values) {
            addCriterion("SUCCESS_TIME in", values, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeNotIn(List<Long> values) {
            addCriterion("SUCCESS_TIME not in", values, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeBetween(Long value1, Long value2) {
            addCriterion("SUCCESS_TIME between", value1, value2, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeNotBetween(Long value1, Long value2) {
            addCriterion("SUCCESS_TIME not between", value1, value2, "successTime");
            return (Criteria) this;
        }

        public Criteria andNotifySuccessTimeIsNull() {
            addCriterion("NOTIFY_SUCCESS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andNotifySuccessTimeIsNotNull() {
            addCriterion("NOTIFY_SUCCESS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andNotifySuccessTimeEqualTo(Long value) {
            addCriterion("NOTIFY_SUCCESS_TIME =", value, "notifySuccessTime");
            return (Criteria) this;
        }

        public Criteria andNotifySuccessTimeNotEqualTo(Long value) {
            addCriterion("NOTIFY_SUCCESS_TIME <>", value, "notifySuccessTime");
            return (Criteria) this;
        }

        public Criteria andNotifySuccessTimeGreaterThan(Long value) {
            addCriterion("NOTIFY_SUCCESS_TIME >", value, "notifySuccessTime");
            return (Criteria) this;
        }

        public Criteria andNotifySuccessTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("NOTIFY_SUCCESS_TIME >=", value, "notifySuccessTime");
            return (Criteria) this;
        }

        public Criteria andNotifySuccessTimeLessThan(Long value) {
            addCriterion("NOTIFY_SUCCESS_TIME <", value, "notifySuccessTime");
            return (Criteria) this;
        }

        public Criteria andNotifySuccessTimeLessThanOrEqualTo(Long value) {
            addCriterion("NOTIFY_SUCCESS_TIME <=", value, "notifySuccessTime");
            return (Criteria) this;
        }

        public Criteria andNotifySuccessTimeIn(List<Long> values) {
            addCriterion("NOTIFY_SUCCESS_TIME in", values, "notifySuccessTime");
            return (Criteria) this;
        }

        public Criteria andNotifySuccessTimeNotIn(List<Long> values) {
            addCriterion("NOTIFY_SUCCESS_TIME not in", values, "notifySuccessTime");
            return (Criteria) this;
        }

        public Criteria andNotifySuccessTimeBetween(Long value1, Long value2) {
            addCriterion("NOTIFY_SUCCESS_TIME between", value1, value2, "notifySuccessTime");
            return (Criteria) this;
        }

        public Criteria andNotifySuccessTimeNotBetween(Long value1, Long value2) {
            addCriterion("NOTIFY_SUCCESS_TIME not between", value1, value2, "notifySuccessTime");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("CTIME is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("CTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Integer value) {
            addCriterion("CTIME =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Integer value) {
            addCriterion("CTIME <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Integer value) {
            addCriterion("CTIME >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CTIME >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Integer value) {
            addCriterion("CTIME <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Integer value) {
            addCriterion("CTIME <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Integer> values) {
            addCriterion("CTIME in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Integer> values) {
            addCriterion("CTIME not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Integer value1, Integer value2) {
            addCriterion("CTIME between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("CTIME not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andGameServerIdIsNull() {
            addCriterion("GAME_SERVER_ID is null");
            return (Criteria) this;
        }

        public Criteria andGameServerIdIsNotNull() {
            addCriterion("GAME_SERVER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGameServerIdEqualTo(String value) {
            addCriterion("GAME_SERVER_ID =", value, "gameServerId");
            return (Criteria) this;
        }

        public Criteria andGameServerIdNotEqualTo(String value) {
            addCriterion("GAME_SERVER_ID <>", value, "gameServerId");
            return (Criteria) this;
        }

        public Criteria andGameServerIdGreaterThan(String value) {
            addCriterion("GAME_SERVER_ID >", value, "gameServerId");
            return (Criteria) this;
        }

        public Criteria andGameServerIdGreaterThanOrEqualTo(String value) {
            addCriterion("GAME_SERVER_ID >=", value, "gameServerId");
            return (Criteria) this;
        }

        public Criteria andGameServerIdLessThan(String value) {
            addCriterion("GAME_SERVER_ID <", value, "gameServerId");
            return (Criteria) this;
        }

        public Criteria andGameServerIdLessThanOrEqualTo(String value) {
            addCriterion("GAME_SERVER_ID <=", value, "gameServerId");
            return (Criteria) this;
        }

        public Criteria andGameServerIdLike(String value) {
            addCriterion("GAME_SERVER_ID like", value, "gameServerId");
            return (Criteria) this;
        }

        public Criteria andGameServerIdNotLike(String value) {
            addCriterion("GAME_SERVER_ID not like", value, "gameServerId");
            return (Criteria) this;
        }

        public Criteria andGameServerIdIn(List<String> values) {
            addCriterion("GAME_SERVER_ID in", values, "gameServerId");
            return (Criteria) this;
        }

        public Criteria andGameServerIdNotIn(List<String> values) {
            addCriterion("GAME_SERVER_ID not in", values, "gameServerId");
            return (Criteria) this;
        }

        public Criteria andGameServerIdBetween(String value1, String value2) {
            addCriterion("GAME_SERVER_ID between", value1, value2, "gameServerId");
            return (Criteria) this;
        }

        public Criteria andGameServerIdNotBetween(String value1, String value2) {
            addCriterion("GAME_SERVER_ID not between", value1, value2, "gameServerId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("PRODUCT_ID like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("PRODUCT_ID not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
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