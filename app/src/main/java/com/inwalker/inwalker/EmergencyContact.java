package com.inwalker.inwalker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EmergencyContact extends AppCompatActivity {

    Button bt;
    String Name;
    String Phone;
    String Email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_contact);

        Name = getIntent().getExtras().getString("NAME");
        Phone = getIntent().getExtras().getString("PHONE");
        Email = getIntent().getExtras().getString("EMAIL");

        TextView eName = (TextView)findViewById(R.id.eName);
        TextView ePhone = (TextView)findViewById(R.id.ePhone);
        TextView eEmail = (TextView)findViewById(R.id.eEmail);

        eName.setText(""+Name);
        ePhone.setText(""+Phone);
        eEmail.setText(""+Email);


        bt = (Button) findViewById(R.id.btEdit);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EmergencyContact.this, EmergencyContactEdit.class);
                startActivity(intent);
            }
        });
    }
}
