package com.inwalker.inwalker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EmergencyContactEdit extends AppCompatActivity {

    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_contact_edit);


        final EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
        final EditText emailEditText = (EditText) findViewById(R.id.emailEditText);
        final EditText phoneEditText = (EditText) findViewById(R.id.phoneEditText);

        bt = (Button) findViewById(R.id.saveButton);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String nameString = nameEditText.getText().toString();
                String emailString = emailEditText.getText().toString();
                String phoneString = phoneEditText.getText().toString();

                Intent intent = new Intent(EmergencyContactEdit.this, EmergencyContact.class);
                intent.putExtra("NAME", nameString);
                intent.putExtra("EMAIL", emailString);
                intent.putExtra("PHONE", phoneString);
                startActivity(intent);
            }
        });
    }
}
