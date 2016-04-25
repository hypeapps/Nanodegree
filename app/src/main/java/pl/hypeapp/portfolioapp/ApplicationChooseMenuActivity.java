package pl.hypeapp.portfolioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ApplicationChooseMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_choose_menu);
    }

    public void LaunchApplication(View view){
        Button button = (Button) findViewById(view.getId());
        Toast.makeText(this, "This button will lanuch my " + button.getText() + " application", Toast.LENGTH_SHORT).show();
    }
}
