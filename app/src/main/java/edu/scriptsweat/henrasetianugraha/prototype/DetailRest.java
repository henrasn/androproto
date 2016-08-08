package edu.scriptsweat.henrasetianugraha.prototype;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

import edu.scriptsweat.henrasetianugraha.prototype.utils.Requester;

public class DetailRest extends AppCompatActivity {

    TextView textContent;
    TextView textTitle;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_rest);

        url = getIntent().getStringExtra("url");

        textContent = (TextView) findViewById(R.id.rest_response);
        textTitle = (TextView) findViewById(R.id.rest_title);
        textTitle.setText(getIntent().getStringExtra("title"));

        Button button = (Button) findViewById(R.id.button12);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Requester requester;
                if (getIntent().getStringExtra("tag").equals("get")) {
                    requester = new Requester();
                    try {
                        String response = requester.run(url);
                        System.out.println(response);
                        textContent.setText(response);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    requester = new Requester();
                    try {
                        String response = requester.post(url, getIntent().getStringExtra("req"));
                        System.out.println(response);
                        textContent.setText(response);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}
