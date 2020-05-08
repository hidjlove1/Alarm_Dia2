package com.example.alarm_dia;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;raw
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    AlarmManager alarm_manager;
    TimePicker alarm_timepicker;
    Context context;
    PendingIntent pendingIntent;


    long now = System.currentTimeMillis();
    Date date = new Date(now);
    SimpleDateFormat sdfNow = new SimpleDateFormat("HH:mm");
    String formatData = sdfNow.format(date);
    TextView TextView_now;


    Button Button_21;
    Button Button_22;
    Button Button_23;
    Button Button_24;
    Button Button_25;
    Button Button_26;
    Button Button_27;
    Button Button_28;
    Button Button_29;
    Button Button_30;
    Button Button_31;
    Button Button_32;
    Button Button_33;
    Button Button_34;
    Button Button_35;
    Button Button_36;
    Button Button_37;
    Button Button_38;
    Button Button_39;
    Button Button_40;
    Button Button_41;
    Button Button_42;
    Button Button_43;
    Button Button_44;
    Button Button_45;
    Button Button_46;
    Button Button_47;
    Button Button_48;
    Button Button_49;
    Button Button_50;
    Button Button_51;
    Button Button_52;
    Button Button_53;
    Button Button_54;
    Button Button_55;
    Button Button_56;
    Button Button_57;
    Button Button_58;
    Button Button_59;
    Button Button_60;
    Button Button_61;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.context = this;

        //알람매니저 설정
        alarm_manager = (AlarmManager) getSystemService(ALARM_SERVICE);

        //타임피커 설정 (24시간으로)
      //  alarm_timepicker = findViewById(R.id.time_picker);
       // alarm_timepicker.setIs24HourView(true);

        // Calendar 객체 생성
        final Calendar calendar = Calendar.getInstance();

        //알람 리시버 intent 생성
        final Intent my_intent = new Intent(this.context, Alarm_Reciver.class);

        //알람 시작 버튼
        Button alarm_on = findViewById(R.id.btn_start);
        alarm_on.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                calendar.set(Calendar.HOUR_OF_DAY, alarm_timepicker.getHour());
                calendar.set(Calendar.MINUTE, alarm_timepicker.getMinute());

                // 시간 가져옴
                int hour = alarm_timepicker.getHour();
                int minute = alarm_timepicker.getMinute();
                Toast.makeText(MainActivity.this, "Alarm 예정" + hour + "시 " + minute + "분", Toast.LENGTH_SHORT).show();

                // resevier에 string 값 넘겨주기
                my_intent.putExtra("state", "alarmon");

                pendingIntent = PendingIntent.getBroadcast(MainActivity.this, 0, my_intent, PendingIntent.FLAG_UPDATE_CURRENT);

                // 알람 셋팅
                alarm_manager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);

            }
        });


        //알람 정지 버튼
        Button alarm_off = findViewById(R.id.btn_finish);
        alarm_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Alarm 종료",Toast.LENGTH_SHORT).show();
                // 알람매니저 취소
                alarm_manager.cancel(pendingIntent);

                my_intent.putExtra("state","alarm off");

                // 알람취소
                sendBroadcast(my_intent);
            }
        });







        TextView_now =(TextView) findViewById(R.id.textView_now);
        TextView_now.setText(formatData);

        Button_21 = findViewById(R.id.Button_21);
        Button_22 = findViewById(R.id.Button_22);
        Button_23 = findViewById(R.id.Button_23);
        Button_24 = findViewById(R.id.Button_24);
        Button_25 = findViewById(R.id.Button_25);
        Button_26 = findViewById(R.id.Button_26);
        Button_27 = findViewById(R.id.Button_27);
        Button_28 = findViewById(R.id.Button_28);
        Button_29 = findViewById(R.id.Button_29);
        Button_30 = findViewById(R.id.Button_30);
        Button_31 = findViewById(R.id.Button_31);
        Button_32 = findViewById(R.id.Button_32);
        Button_33 = findViewById(R.id.Button_33);
        Button_34 = findViewById(R.id.Button_34);
        Button_35 = findViewById(R.id.Button_35);
        Button_36 = findViewById(R.id.Button_36);
        Button_37 = findViewById(R.id.Button_37);
        Button_38 = findViewById(R.id.Button_38);
        Button_39 = findViewById(R.id.Button_39);
        Button_40 = findViewById(R.id.Button_40);
        Button_41 = findViewById(R.id.Button_41);
        Button_42 = findViewById(R.id.Button_42);
        Button_43 = findViewById(R.id.Button_43);
        Button_44 = findViewById(R.id.Button_44);
        Button_45 = findViewById(R.id.Button_45);
        Button_46 = findViewById(R.id.Button_46);
        Button_47 = findViewById(R.id.Button_47);
        Button_48 = findViewById(R.id.Button_48);
        Button_49 = findViewById(R.id.Button_49);
        Button_50 = findViewById(R.id.Button_50);
        Button_51 = findViewById(R.id.Button_51);
        Button_52 = findViewById(R.id.Button_52);
        Button_53 = findViewById(R.id.Button_53);
        Button_54 = findViewById(R.id.Button_54);
        Button_55 = findViewById(R.id.Button_55);
        Button_56 = findViewById(R.id.Button_56);
        Button_57 = findViewById(R.id.Button_57);
        Button_58 = findViewById(R.id.Button_58);
        Button_59 = findViewById(R.id.Button_59);
        Button_60 = findViewById(R.id.Button_60);
        Button_61 = findViewById(R.id.Button_61);
    }
}
