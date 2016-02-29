package com.domvit.android.androidlesson9;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by HiMan on 29.02.2016.
 */
public class MainActivity extends Activity {

    private Button button1, button2;
    private TextView textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        button1 = (Button) findViewById(R.id.button2);
        textView1 = (TextView) findViewById(R.id.textView2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                Configuration configuration = getResources().getConfiguration();

                if (configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
                    Toast.makeText(context,"Альбомная ориентация",Toast.LENGTH_LONG).show();
                    textView1.setText("Альбомная ориентация");
                }
                if (configuration.orientation == Configuration.ORIENTATION_PORTRAIT){
                    Toast.makeText(context,"Портретная ориентация",Toast.LENGTH_SHORT).show();
                    textView1.setText("Портретная ориентация");
                }
            }
        });
    }
}
