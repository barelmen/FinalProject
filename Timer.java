package com.example.registration;
import android.os.Handler;
public class Timer {

    private Handler handler;
    private boolean paused;

    private int interval;

    private Runnable task = new Runnable () {
        @Override
        public void run() {
            if (!paused) {
                runnable.run ();
                Timer.this.handler.postDelayed (this, interval);
            }
        }
    };

    private Runnable runnable;

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public void startTimer () {
        paused = false;
        handler.postDelayed (task, interval);
    }

    public void stopTimer () {
        paused = true;
    }

    public Timer (Runnable runnable, int interval, boolean started) {
        handler = new Handler ();
        this.runnable = runnable;
        this.interval = interval;
        if (started)
            startTimer ();
    }
    Timer timer = new Timer(new Runnable() {
        public void run() {
            System.out.println("the kid needs to eat");
        }
    }, 10800, true);
}
//
//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.os.CountDownTimer;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import java.util.Locale;
//import java.util.concurrent.TimeUnit;
//
//public class Timer  extends AppCompatActivity {
//
//    //initialize variables
//    TextView textView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_timer);
//
//        //assign variable
//        textView = findViewById(R.id.text_view);
//
//        //initialize timer duration
//        long duration = TimeUnit.MINUTES.toMillis(1);
//        //initialize countdown timer
//        new CountDownTimer(duration, countDownInterval:1000){
//
//        }
//    }
//            public void onTick(long l){
//                //when tick
//                //convert millisecond to minute and second
//                String sDuration = String.format(Locale.ENGLISH, "%02d:%02d", TimeUnit.MILLISECONDS.toMinutes(1), TimeUnit.MILLISECONDS.toSeconds(1) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(1)));
//                //set converted string on text view
//                textView.setText(sDuration);
//            }
//            public void onFinish(){
//                //when finish
//                //hide text view
//                textView.setVisibility(View.GONE);
//                //display toast
//                Toast.makeText(getApplicationContext(),"countdown ended", Toast.LENGTH_LONG).show();
//
//            }
//
//            }




