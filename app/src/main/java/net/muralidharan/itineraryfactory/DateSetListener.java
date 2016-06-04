package net.muralidharan.itineraryfactory;

import android.widget.TextView;

import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;

/**
 * Created by muralidharan on 6/4/16.
 */
public class DateSetListener implements DatePickerDialog.OnDateSetListener {

    protected TextView dateTextView;

    public DateSetListener(TextView dateTextView) {
        this.dateTextView = dateTextView;
    }

    @Override
    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
        dateTextView.setText(getDateString(year, monthOfYear, dayOfMonth));
    }

    protected String getDateString(int year, int month, int day_of_month) {
        StringBuilder sb = new StringBuilder();
        sb.append(year);
        sb.append('-');
        if (month < 10) {
            sb.append('0');
        }
        sb.append(month);
        sb.append('-');
        if (day_of_month < 10) {
            sb.append('0');
        }
        sb.append(day_of_month);

        return sb.toString();
    }
}
