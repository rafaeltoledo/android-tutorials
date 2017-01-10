package net.rafaeltoledo.tutorial;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Log.d("MA::Action", intent.getAction());
        for (String category : intent.getCategories()) {
            Log.d("MA::Category", category);
        }
        Log.d("MA::Component", intent.getComponent().getClassName());
    }
}
