package com.sykang.swaggertest.vo;

import lombok.Data;

@Data
public class describeAlarmsVo {
    private String alarmName;
    private String stateValue;
    private String actionsEnabled;
    private String alarmUpdatedTimestamp;
    private String comparisonOperator;
    private String statistic;
}
