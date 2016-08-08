package edu.scriptsweat.henrasetianugraha.prototype;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
    }

    public void intentGraphql(View view){
        Intent intent=new Intent(MainActivity.this,Graphql.class);
        startActivity(intent);
    }

    public void intentRest(View view){
        Intent intent=new Intent(MainActivity.this,Rest.class);
        startActivity(intent);
    }
}
