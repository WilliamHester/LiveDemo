package me.williamhester.livedemo.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by William on 3/18/14.
 */
public class ButtActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_example);
        Bundle extras = getIntent().getExtras();
        TextView t = (TextView) findViewById(R.id.centered);
        t.setText(extras.getString("text"));
    }

}
