package com.example.administrator.intent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button btn_web = (Button) findViewById(R.id.btn_web);
        btn_web.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText editText =(EditText)findViewById(R.id.edit_url);
                final String edit_url="http://"+editText.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(edit_url));
                Bundle bundle=new Bundle();
                bundle.putString("URL", edit_url);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
