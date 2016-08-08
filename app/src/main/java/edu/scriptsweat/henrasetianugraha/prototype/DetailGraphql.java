package edu.scriptsweat.henrasetianugraha.prototype;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

import edu.scriptsweat.henrasetianugraha.prototype.utils.Requester;

public class DetailGraphql extends AppCompatActivity {

    String url;
    private TextView textContent;
    private TextView textTitle;
    private Button requestButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_graphql);
        textContent=(TextView)findViewById(R.id.graphql_response);
        textTitle=(TextView)findViewById(R.id.graphql_title);
        requestButton=(Button)findViewById(R.id.graphql_request);

        url=getIntent().getStringExtra("url");
        textTitle.setText(getIntent().getStringExtra("title"));

        requestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Requester requester;
                if (getIntent().getStringExtra("tag").equals("get")){
                    requester=new Requester();
                    try {
                        String response=requester.run(url);
                        System.out.println(response);
                        textContent.setText(response);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }else {
                    requester=new Requester();

                    try {
                        String response=requester.graphql(url);
                        System.out.println(requester);
                        textContent.setText(response);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}
 