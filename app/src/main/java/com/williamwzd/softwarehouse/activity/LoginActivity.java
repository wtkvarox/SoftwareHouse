package com.williamwzd.softwarehouse.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.williamwzd.softwarehouse.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        // Ocultar Actionbar
        if (getSupportActionBar() != null)
            getSupportActionBar().hide();

        // Referenciar
        final TextView txtInfo = findViewById(R.id.txt_account_info);

        // Poblar
        txtInfo.setText(Html.fromHtml("Don't have an account? <b>Sign Up</b>"));
    }

    /**
     * Navegar hacia la siguiente actividad de Tabs
     *
     * @param view Vista que ha causado la accion
     */
    public void loginOnClickListener(View view) {
        startActivity(new Intent(this, TabsActivity.class));
        finish();
    }
}