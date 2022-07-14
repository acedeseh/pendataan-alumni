package pnj.uts.danielc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import pnj.uts.danielc.databinding.ActivityLoginBinding;
import pnj.uts.danielc.sharedPreference.Preferences;

public class Login extends AppCompatActivity {
    private ActivityLoginBinding binding;
    private final String email = "daniel.christian9933@gmail.com";
    private final String nama = "Daniel Christian A L";
    private final String kelas = "TI 6B";
    private final int nim = 1907411062;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (!Preferences.getEmailUser(this).equals("")) {
            toMainActivity();
        }


        binding.btnLogin.setOnClickListener(view -> {
            if (binding.edtEmail.getText().toString().equals(email) && binding.edtPassword.getText().toString().equals("danielc")) {
                Preferences.setDataUser(this, email, nama, kelas, nim);
                toMainActivity();
            } else {
                Toast.makeText(this, "data yang dimasukan salah", Toast.LENGTH_LONG).show();
            }
        });
    }
    private void toMainActivity(){
        this.startActivity(new Intent(Login.this,Login.class));
        finish();
    }
}