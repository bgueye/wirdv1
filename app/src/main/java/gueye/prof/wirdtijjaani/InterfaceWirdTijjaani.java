package gueye.prof.wirdtijjaani;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class InterfaceWirdTijjaani extends Activity implements View.OnClickListener {

    Button bWazifa;
    Button bLazim;
    Button bAsrou;
    TextView lblPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface_wird_tijjaani);

        bWazifa=(Button)findViewById(R.id.button);
        bLazim=(Button)findViewById(R.id.button2);
        bAsrou=(Button)findViewById(R.id.button3);
        lblPage=(TextView)findViewById(R.id.textView);

        bWazifa.setOnClickListener(this);
        bLazim.setOnClickListener(this);
        bAsrou.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_interface_wird_tijjaani, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        lblPage.setText("Bienvenue dans la page de Wazifa.");
    }
}
