package com.example.tugasday06;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageDetail = findViewById(R.id.image_detail);
        TextView textName = findViewById(R.id.text_hp_name);
        TextView textAndroidVersion = findViewById(R.id.text_android_version);
        TextView textScreenSize = findViewById(R.id.text_screen_size);
        TextView textResolution = findViewById(R.id.text_resolution);
        TextView textProcessor = findViewById(R.id.text_processor);
        TextView textRamStorage = findViewById(R.id.text_ram_storage);
        TextView textCamera = findViewById(R.id.text_camera);
        TextView textUSB = findViewById(R.id.text_usb);
        TextView textNFC = findViewById(R.id.text_nfc);
        TextView textBattery = findViewById(R.id.text_battery);
        TextView textPrice = findViewById(R.id.text_price);



        Intent intent = getIntent();
        if (intent != null) {
            String hpName = intent.getStringExtra("hp_name");
            int imageResource = getIntent().getIntExtra("hp_image", R.drawable.placeholder);
            String hpAndroidVersion = intent.getStringExtra("hp_android_version");
            String hpScreenSize = intent.getStringExtra("hp_screen_size");
            String hpResolution = intent.getStringExtra("hp_resolution");
            String hpProcessor = intent.getStringExtra("hp_processor");
            String hpRamStorage = intent.getStringExtra("hp_ram_storage");
            String hpCamera = intent.getStringExtra("hp_camera");
            String hpUSB = intent.getStringExtra("hp_usb");
            String hpNFC = intent.getStringExtra("hp_nfc");
            String hpBattery = intent.getStringExtra("hp_battery");
            String hpPrice = intent.getStringExtra("hp_price");

            // Set semua TextView dengan detail HP
            textName.setText(hpName);
            imageDetail.setImageResource(imageResource);
            textAndroidVersion.setText(hpAndroidVersion);
            textScreenSize.setText(hpScreenSize);
            textResolution.setText(hpResolution);
            textProcessor.setText(hpProcessor);
            textRamStorage.setText(hpRamStorage);
            textCamera.setText(hpCamera);
            textUSB.setText(hpUSB);
            textNFC.setText(hpNFC);
            textBattery.setText(hpBattery);
            textPrice.setText(hpPrice);
        }

        Button buttonShare = findViewById(R.id.button_share);
        buttonShare.setOnClickListener(v -> {
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Guys, aku mau spill smartphone 2024 terbaru, yaitu " +
                    textName.getText() + ". Spec-nya? Okay! Simak gua. \n\n  " +
                    textAndroidVersion.getText() + "\n  " +
                    textScreenSize.getText() + "\n  " +
                    textResolution.getText() + "\n  " +
                    textProcessor.getText() + "\n  " +
                    textRamStorage.getText() + "\n  " +
                    textCamera.getText() + "\n  " +
                    textUSB.getText() + "\n  " +
                    textBattery.getText() + "\n  " +
                    textNFC.getText() + "\n\n" +
                    "Gimana? Tertarik? Untuk harganya " + textPrice.getText() +
                    ", so up to you ya! :D");
            startActivity(Intent.createChooser(shareIntent, "Bagikan ke"));
        });
    }
}
