package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	//  TODO: deklarasikan variabel di sini
	private EditText data;
	private Button submit, reset;
	private int datarandom;
	private int max = 100;
	private int min = 1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		data = findViewById(R.id.number_input);
		submit = findViewById(R.id.guess_button);
//		reset = findViewById(R.id.reset_button);
		// TODO: bind layout di sini
		initRandomNumber();
	}


	// TODO: generate angka random di sini
	private void initRandomNumber() {
		datarandom = new Random().nextInt(100 - 1) + 1;

	}

	public void handleGuess(View view) {
		// TODO: Tambahkan logika untuk melakukan pengecekan angka
		int cekdata = Integer.parseInt(data.getText().toString());
		if (cekdata > datarandom ) {
			Toast.makeText(this, "Tebakan anda terlalu besar!", Toast.LENGTH_SHORT).show();
		} else if (cekdata < datarandom){
			Toast.makeText(this, "Tebakan anda terlalu kecil!", Toast.LENGTH_SHORT).show();
		}
		else {
			Toast.makeText(this, "Tebakan anda benar!", Toast.LENGTH_SHORT).show();
			submit.setEnabled(false);
		}

	}

	public void handleReset(View view) {
		// TODO: Reset tampilan
		data.setText("");
		submit.setEnabled(true);
		initRandomNumber();

	}
}
