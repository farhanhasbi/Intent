package windows.example.m.tugas_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.bitrupiah);
        btn2 = findViewById(R.id.bitsatoshi);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn1_intent = new Intent(MainActivity.this, BitcoinRupiah.class);
                startActivity(btn1_intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn2_intent = new Intent(MainActivity.this, BitcoinSatoshi.class);
                startActivity(btn2_intent);
            }
        });
    }
}
