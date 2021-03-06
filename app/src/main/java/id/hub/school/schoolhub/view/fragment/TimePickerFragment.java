package id.hub.school.schoolhub.view.fragment;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.format.DateFormat;
import android.widget.TimePicker;

import java.util.Calendar;

import id.hub.school.schoolhub.view.widget.TimePickerView;

public class TimePickerFragment extends DialogFragment implements
        TimePickerDialog.OnTimeSetListener {

    private TimePickerView timePickerView;

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        timePickerView.setHour(hourOfDay);
        timePickerView.setMinute(minute);
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        int hour = timePickerView.getHour();
        int minute = timePickerView.getMinute();

        // Create a new instance of TimePickerDialog and return it
        return new TimePickerDialog(getActivity(), this, hour, minute,
                DateFormat.is24HourFormat(getActivity()));
    }

    public void setTime(TimePickerView timePickerView) {
        this.timePickerView = timePickerView;

    }
}
