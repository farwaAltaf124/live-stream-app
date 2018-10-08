package io.antmedia.android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class FirstEnterIp extends AppCompatActivity {

    Button nextBtn;
    EditText enterIpInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(io.antmedia.android.liveVideoBroadcaster.R.layout.activity_first_enter_ip);
        nextBtn = (Button) findViewById(io.antmedia.android.liveVideoBroadcaster.R.id.next_btn);
        enterIpInput = (EditText) findViewById(io.antmedia.android.liveVideoBroadcaster.R.id.enter_ip);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstEnterIp.this, MainActivity.class);
                intent.putExtra("ip_address", enterIpInput.getText().toString());
                startActivity(intent);
            }
        });

    }
}
