// 
// Decompiled by Procyon v0.5.30
// 

package com.newrelic.agent.android.measurement.producer;

import com.newrelic.agent.android.measurement.Measurement;
import com.newrelic.agent.android.measurement.ActivityMeasurement;
import com.newrelic.agent.android.activity.MeasuredActivity;
import com.newrelic.agent.android.measurement.MeasurementType;

public class ActivityMeasurementProducer extends BaseMeasurementProducer
{
    public ActivityMeasurementProducer() {
        super(MeasurementType.Activity);
    }
    
    public void produceMeasurement(final MeasuredActivity measuredActivity) {
        super.produceMeasurement(new ActivityMeasurement(measuredActivity.getMetricName(), measuredActivity.getStartTime(), measuredActivity.getEndTime()));
        super.produceMeasurement(new ActivityMeasurement(measuredActivity.getBackgroundMetricName(), measuredActivity.getStartTime(), measuredActivity.getEndTime()));
    }
}
