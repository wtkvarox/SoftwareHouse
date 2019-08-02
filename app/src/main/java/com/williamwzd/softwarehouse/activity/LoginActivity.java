package com.williamwzd.softwarehouse.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.williamwzd.softwarehouse.R;

import java.lang.reflect.Field;

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

        final Typeface regular = Typeface.createFromAsset(getAssets(), "sanfrancisco.ttf");
        replaceFont("sanfrancisco.ttf", regular);
    }

    /**
     * Navegar hacia la siguiente actividad de Tabs
     *
     * @param view Vista que ha causado la accion
     */
    public void loginOnClickListener(View view) {
        startActivity(new Intent(this, TabsActivity.class));
    }

    protected static void replaceFont(final String staticTypefaceFieldName
            , final Typeface newTypeface) {

        try {
            final Field staticField = Typeface.class.getDeclaredField(staticTypefaceFieldName);
            staticField.setAccessible(true);
            staticField.set(null, newTypeface);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}