package com.alif.myapplication.users;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.alif.myapplication.R;
import com.alif.myapplication.regis;

public class LoginActivity extends AppCompatActivity {

    Button btnpindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();
        btnpindah =(Button) findViewById(R.id.btnpindah);
        btnpindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, regis.class);
                startActivity(i);
                finish();
            }
        });
    }
}
