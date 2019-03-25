package com.praveen.gupta.sentimental_analysis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {

    EditText name , password;
    Button signin;
    String login_name,login_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        name = (EditText)findViewById(R.id.signinname);
        password = (EditText)findViewById(R.id.signinpassword);
        signin = (Button)findViewById(R.id.btn_signin);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                login_name = name.getText().toString();
                login_password = password.getText().toString();

                Bundle extras =getIntent().getExtras();
                if(extras != null)
                {
                    String gotname = extras.getString("tfname");
                    String gotpass = extras.getString("tfpass");

                    if(login_name.equals(gotname)&&login_password.equals(gotpass))
                    {
                        Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_LONG).show();
                    }else {
                        Toast.makeText(getApplicationContext(),"Login unSuccessful",Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(),"Error getting credentials",Toast.LENGTH_LONG).show();
                }



            }


        });

    }
}
