package me.williamhester.livedemo.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context c = this;

        final EditText enteredText = (EditText) findViewById(R.id.entered_text);
        Button pressMe = (Button) findViewById(R.id.butt);

        pressMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(c, ButtActivity.class);
                Bundle b = new Bundle();
                b.putString("text", enteredText.getText().toString());
                i.putExtras(b);
                c.startActivity(i);
            }
        });

    }
}
