package com.example.tugasday06;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private HPAdapter hpAdapter;
    private List<HP> hpList;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Inisialisasi RecyclerView
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Inisialisasi data HP
        hpList = new ArrayList<>();
        hpList.add(new HP("Oppo A79 5G", R.drawable.oppoa795g, "OS: Android 13", "Ukuran Layar: 6.72 Inch", "Resolusi: 1800x2400", "Prosesor: Dimensity 6020", "RAM dan Penyimpanan: 8/256", "Kamera: 50 MP/8+2 MP", "USB: Type-C", "NFC: Ya", "Baterai: 5000 mAh", "Rp. 3.799.000"));
        hpList.add(new HP("Oppo Reno 11 Pro 5G", R.drawable.opporeno11pro5g, "OS: Android 14", "Ukuran Layar: 6.7 Inch", "Resolusi: 1080x2412", "Prosesor: Dimensity 8200", "RAM dan Penyimpanan: 12/512", "Kamera: 50 MP/32+8 MP", "USB: Type-C dan OTG", "NFC: Ya", "Baterai: 4700 mAh", "Rp. 8.999.000"));
        hpList.add(new HP("Oppo Reno 11 5G", R.drawable.opporeno115g, "OS: Android 14", "Ukuran Layar: 6.7 Inch", "Resolusi: 1080x2412", "Prosesor: Dimenstiy 7050", "RAM dan Penyimpanan: 8/256", "Kamera: 50 MP/32+8 MP", "USB: Type-C", "NFC: Ya", "Baterai: 5000 mAh", "Rp. 5.999.000"));
        hpList.add(new HP("Poco C65", R.drawable.pococ65, "OS: Android 13", "Ukuran Layar: 6.74 Inch", "Resolusi: 720x1600", "Prosesor: MediaTek Helio G85", "RAM dan Penyimpanan: 6/128 dan 8/256", "Kamera: 50 MP/8 MP", "USB: Type-C", "NFC: Ya", "Baterai: 5000 mAh", "Rp. 1.415.000/1.699.000"));
        hpList.add(new HP("Poco M6 Pro", R.drawable.pocom6pro, "OS: Android 13", "Ukuran Layar: 6.67 Inch", "Resolusi: 1080x2400", "Prosesor: Helio G99-Ultra", "RAM dan Penyimpanan: 8/256", "Kamera: 64+8, 2 MP/16 MP", "USB: Type-C", "NFC: Ya", "Baterai: 5000 mAh", "Rp. 2.999.000"));
        hpList.add(new HP("Poco X6 Pro 5G", R.drawable.pocox6pro5g, "OS: Android 14", "Ukuran Layar: 6.67 Inch", "Resolusi: 1220x2712", "Prosesor: Dimensity 8300 Ultra", "RAM dan Penyimpanan: 12/512", "Kamera: 64 + 8, 2 MP/16 MP", "USB: Type-C", "NFC: Ya", "Baterai: 5000 mAh", "Rp. 4.999.000"));
        hpList.add(new HP("Poco X6 5G", R.drawable.pocox65g, "OS: Android 13", "Ukuran Layar: 6.67 Inch", "Resolusi: 1220x2712", "Prosesor: Snapdragon® 7s Gen 2", "RAM dan Penyimpanan: 12/256", "Kamera: 64 + 8, 2 MP/16 MP", "USB: Type-C", "NFC: Ya", "Baterai: 5100 mAh", "Rp. 4.189.000"));
        hpList.add(new HP("Realme 12 Pro+5G (8/256)", R.drawable.realme12proplus5g, "OS: Android 14", "Ukuran Layar: 6.7 Inch", "Resolusi: 1080x2412", "Prosesor: Snapdragon 7s Gen 2", "RAM dan Penyimpanan: 8/256", "Kamera: 50 + 64, 8 MP/32 MP", "USB: Type-C dan OTG", "NFC: Ya", "Baterai: 5000 mAh", "Rp. 5.549.000"));
        hpList.add(new HP("Redmi Note 13 Pro+ 5G", R.drawable.redminote13proplus5g, "OS: Android 13", "Ukuran Layar: 6.67 Inch", "Resolusi: 1220x2712", "Prosesor: Dimensity 7200 Ultra", "RAM dan Penyimpanan: 12/256", "Kamera: 200 + 8, 2 MP/16 MP", "USB: Type-C", "NFC: Ya", "Baterai: 5000 mAh", "Rp. 5.999.000"));
        hpList.add(new HP("Redmi Note 13 4G", R.drawable.redminote134g, "OS: Android 13", "Ukuran Layar: 6.67 Inch", "Resolusi: 1080x2400", "Prosesor:  Snapdragon 685", "RAM dan Penyimpanan: 8/256", "Kamera: 108 + 8, 2 MP/16 MP", "USB: Type-C dan OTG", "NFC: Ya", "Baterai: 5000 mAh", "Rp. 2.799.000"));
        hpList.add(new HP("Samsung Galaxy A15", R.drawable.sga15, "OS: Android 14", "Ukuran Layar: 6.5 Inch", "Resolusi: 1080x2340", "Prosesor: Mediatek helio G99", "RAM dan Penyimpanan: 8/256", "Kamera: 50 + 5, 2 MP/13 MP", "USB: Type-C", "NFC: Ya", "Baterai: 5000 mAh", "Rp. 2.850.000"));
        hpList.add(new HP("Samsung Galaxy A15 5G", R.drawable.sga155g, "OS: Android 14", "Ukuran Layar: 6.5 Inch", "Resolusi: 1080x2340", "Prosesor: Dimensity 6100+", "RAM dan Penyimpanan: 8/256", "Kamera: 50 + 5, 2 MP/13 MP", "USB: Type-C", "NFC: Ya", "Baterai: 5000 mAh", "Rp. 3.599.000"));
        hpList.add(new HP("Samsung Galaxy A25 5G", R.drawable.sga255g, "OS: Android 14", "Ukuran Layar: 6.5 Inch", "Resolusi: 1080x2340", "Prosesor: Exynos 1280", "RAM dan Penyimpanan: 8/256", "Kamera: 50 + 8, 2 MP/13 MP", "USB: Type-C", "NFC: Ya", "Baterai: 5000 mAh", "Rp. 3.780.000"));
        hpList.add(new HP("Samsung Galaxy S24", R.drawable.sgs24, "OS: Android 14", "Ukuran Layar: 6.2 Inch", "Resolusi: 1080x2340", "Prosesor: Exynos 2400", "RAM dan Penyimpanan: 8/512", "Kamera: 50 + 10,12 MP/12 MP", "USB: Type-C dan OTG", "NFC: Ya", "Baterai: 4000 mAh", "Rp. 13.200.000"));
        hpList.add(new HP("Samsung Galaxy S24 Plus", R.drawable.sgs24plus, "OS: Android 14", "Ukuran Layar: 6.7 Inch", "Resolusi: 1080x2340", "Prosesor: Exynos 2400", "RAM dan Penyimpanan: 12/512", "Kamera: 50 + 10,12 MP/12 MP", "USB: Type-C dan OTG", "NFC: Ya", "Baterai: 4900 mAh", "Rp. 15.590.000"));
        hpList.add(new HP("Samsung Galaxy S24 Ultra (12/512)", R.drawable.sgs24ultra, "OS: Android 14", "Ukuran Layar: 6.8 Inch", "Resolusi: 1440x3120", "Prosesor: Snapdragon 8 Gen 3", "RAM dan Penyimpanan: 12/512", "Kamera: 50 + 10,12 MP/12 MP", "USB: Type-C dan OTG", "NFC: Ya", "Baterai: 5000 mAh", "Rp. 20.200.000"));
        hpList.add(new HP("Vivo Y100 5G", R.drawable.vivoy1005g, "OS: Android 14", "Ukuran Layar: 6.67 Inch", "Resolusi: 1080x2400", "Prosesor: Snapdragon 4 Gen 2", "RAM dan Penyimpanan: 8/256", "Kamera: 50 + 8,2 MP/8 MP", "USB: Type-C dan OTG", "NFC: Ya", "Baterai: 5000 mAh", "Rp. 3.499.000"));

        HPAdapter adapter = new HPAdapter(this, hpList);
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(this);
    }


    public void onItemClick(int position) {
        HP clickedHP = hpList.get(position);
        int imageResource = clickedHP.getImageResource();
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("hp_image_resource", imageResource);
        intent.putExtra("hp_name", clickedHP.getName());
        intent.putExtra("hp_android_version", clickedHP.getAndroidVersion());
        intent.putExtra("hp_screen_size", clickedHP.getScreenSize());
        intent.putExtra("hp_resolution", clickedHP.getResolution());
        intent.putExtra("hp_processor", clickedHP.getProcessor());
        intent.putExtra("hp_ram_storage", clickedHP.getRamStorage());
        intent.putExtra("hp_camera", clickedHP.getCamera());
        intent.putExtra("hp_usb", clickedHP.getUsb());
        intent.putExtra("hp_nfc", clickedHP.getNfc());
        intent.putExtra("hp_battery", clickedHP.getBattery());
        intent.putExtra("hp_price", clickedHP.getPrice());
        startActivity(intent);
    }
}