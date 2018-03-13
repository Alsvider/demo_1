package com.example.demo.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.DatePicker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.date_pick)
    DatePicker datePick;

    private int year;
    private int month;
    private int day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //初始数据
        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH) + 1;
        day = calendar.get(Calendar.DAY_OF_MONTH);
        initView();
    }

    /**
     * 获取系统的前一天，date类型的
     *
     * @param
     * @return
     */
    public static Date getYesterday() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        Date date = calendar.getTime();
        return date;
    }

    private static SimpleDateFormat sdf = new SimpleDateFormat();
    public final static String FORMAT_DATE = "yyyy-MM-dd";
    public final static String FORMAT_DATE_TIME = "yyyy-MM-dd hh:mm";

    public static Date getTimeFromString(String timeStr, String format) {
        if (format == null || format.trim().equals("")) {
            sdf.applyPattern(FORMAT_DATE_TIME);
        } else {
            sdf.applyPattern(format);
        }
        try {
            return sdf.parse(timeStr);
        } catch (ParseException e) {
            return new Date();
        }
    }

    private void initView() {
        datePick.setMaxDate(getTimeFromString("2010-02-01",FORMAT_DATE).getTime());
//        datePick.setMaxDate(getYesterday().getTime());
//        datePick.setMaxDate(System.currentTimeMillis());
        datePick.init(year, month, day, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year1, int monthOfYear, int dayOfMonth) {
                year = year1;
                String month1 = monthOfYear + 1 + "";
                String day1 = dayOfMonth + "";

                if (month1.length() == 1) {
                    month1 = "0" + month1;
                }
                if (day1.length() == 1) {
                    day1 = "0" + day1;
                }
            }
        });
    }

}
