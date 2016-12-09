package yt.com.testkotlin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.orhanobut.logger.Logger;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger.d("hello1");
        Logger.d("hello %s %d", "world", 5);
        Logger.d("hello2");
        Logger.e("hello3");
        Logger.w("hello4");
        Logger.v("hello5");
        Logger.d("hello %s", "world");
    }
}
