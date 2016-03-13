package carcassonneplay.polytech.com.carcassonneplay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by CIA-agency on 13/03/2016.
 */
public class intro2 extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accueil2);

        final Button loginButton = (Button) findViewById(R.id.button3);
        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(intro2.this,intro3.class);
                startActivity(intent);
            }
        });
    }
}
