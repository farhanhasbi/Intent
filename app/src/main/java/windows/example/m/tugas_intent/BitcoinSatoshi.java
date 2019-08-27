package windows.example.m.tugas_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BitcoinSatoshi extends AppCompatActivity implements View.OnClickListener {

    private Button hasilst;
    private EditText sato;
    private TextView shi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bitcoin_to_satoshi);

        hasilst = findViewById(R.id.idhasilrs);
        sato = findViewById(R.id.rs);
        shi = findViewById(R.id.mrs);
        hasilst.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int rumus = 100000000;
        if (v.getId() == R.id.idhasilrs) {

            String total = sato.getText().toString().trim();

            boolean isInvalidFields = false;

            int hl = toInt(total);

            if (total == null) {
                isInvalidFields = true;
                sato.setError("Tidak Boleh Kosong!");
            }
            if (!isInvalidFields) {

                int hasil = hl * rumus;
                shi.setText("Total Konversi\n" + String.valueOf(hasil));
                Intent Data = new Intent();
                Data.setData(Uri.parse(String.valueOf(hasil)));
                setResult(RESULT_OK, Data);

            }
        }


    }

    private Integer toInt(String str) {
        try {
            return Integer.valueOf(str);
        } catch (Exception ae) {
            return null;
        }
    }
}
