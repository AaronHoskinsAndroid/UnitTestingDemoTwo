package examples.aaronhoskins.com.unittestingdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvOutput;
    EditText etUserInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOutput = findViewById(R.id.tvOutput);
        etUserInput = findViewById(R.id.etUserInput);

    }

    public void onClick(View view) {
        final String userInput = etUserInput.getText().toString();
        tvOutput.setText(userInput);
    }
}
