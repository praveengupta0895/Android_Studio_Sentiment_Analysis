package com.praveen.gupta.sentimental_analysis;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        Button fk=(Button)findViewById(R.id.btn_signup);
    final    EditText name = (EditText)findViewById(R.id.input_name);
      final EditText email = (EditText)findViewById(R.id.input_email);
     final EditText  password = (EditText)findViewById(R.id.input_password);

        fk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String text_name = name.getText().toString();
              String  text_email = email.getText().toString();
               String  text_password = password.getText().toString();

                Intent intent = new Intent(RegisterPage.this, SignIn.class);
                intent.putExtra("tfname",text_name);
                intent.putExtra("tfemail",text_email);
                intent.putExtra("tfpass",text_password);
                startActivity(intent);

                Toast.makeText(getApplicationContext(),"Account Created Successfully",Toast.LENGTH_LONG).show();
            }
        });


    }
}