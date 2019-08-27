package windows.example.m.tugas_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BitcoinRupiah extends AppCompatActivity implements View.OnClickListener {

    private Button hasilrp;
    private EditText nilaiX;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bitcoin_to_rupiah);

        hasilrp = findViewById(R.id.idhasilrb);
        nilaiX = findViewById(R.id.rb);
        result = findViewById(R.id.mrb);
        hasilrp.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        int rumus = 149674442;
        if (v.getId() == R.id.idhasilrb) {

            String nilai = nilaiX.getText().toString().trim();

            boolean isInvalidFields = false;

            int hsl = toInt(nilai);

            if (nilai == null) {
                isInvalidFields = true;
                nilaiX.setError("Tidak Boleh Kosong!");
            }
            if (!isInvalidFields) {

                int hasil = hsl * rumus;
                result.setText("Total Konversi\n"+String.valueOf(hasil));
                Intent Data = new Intent();
                Data.setData(Uri.parse(String.valueOf(hasil)));
                setResult(RESULT_OK, Data);


                finish();

            }
        }


    }

    private Integer toInt(String str) {
        try {
            return Integer.valueOf(str);
        }catch (Exception ae){
            return null;
        }
    }
}

