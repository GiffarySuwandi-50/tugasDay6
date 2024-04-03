package com.example.tugasday06;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class HPAdapter extends RecyclerView.Adapter<HPAdapter.HPViewHolder> {

    private List<HP> hpList;
    private Context context;
    private int[] imageResource = {
            R.drawable.oppoa795g,
            R.drawable.opporeno11pro5g,
            R.drawable.opporeno115g,
            R.drawable.pococ65,
            R.drawable.pocom6pro,
            R.drawable.pocox6pro5g,
            R.drawable.pocox65g,
            R.drawable.realme12proplus5g,
            R.drawable.redminote13proplus5g,
            R.drawable.redminote134g,
            R.drawable.sga15,
            R.drawable.sga155g,
            R.drawable.sga255g,
            R.drawable.sgs24,
            R.drawable.sgs24plus,
            R.drawable.sgs24ultra,
            R.drawable.vivoy1005g
    };


    public HPAdapter(Context context, List<HP> hpList) {
        this.context = context;
        this.hpList = hpList;
    }

    @NonNull
    @Override
    public HPViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hp, parent, false);
        return new HPViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HPViewHolder holder, int position) {
        HP hp = hpList.get(position);

        // Mengatur gambar HP, teks, dan detailnya
        holder.imageHp.setImageResource(hp.getImageResource());
        holder.textHpName.setText(hp.getName());

        // Menangani klik pada item
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity.class);
                // Mengirim data HP ke DetailActivity
                intent.putExtra("hp_name", hp.getName());
                intent.putExtra("hp_android_version", hp.getAndroidVersion());
                intent.putExtra("hp_screen_size", hp.getScreenSize());
                intent.putExtra("hp_resolution", hp.getResolution());
                intent.putExtra("hp_processor", hp.getProcessor());
                intent.putExtra("hp_ram_storage", hp.getRamStorage());
                intent.putExtra("hp_camera", hp.getCamera());
                intent.putExtra("hp_usb", hp.getUsb());
                intent.putExtra("hp_nfc", hp.getNfc());
                intent.putExtra("hp_battery", hp.getBattery());
                intent.putExtra("hp_price", hp.getPrice());
                intent.putExtra("hp_image", hp.getImage());

                context.startActivity(intent);
            }
        });
    }


    public int getItemCount() {
        return hpList.size();
    }

    public void setOnItemClickListener(MainActivity mainActivity) {
    }

    // ViewHolder
    public static class HPViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        ImageView imageHp;
        TextView textHpName;

        public HPViewHolder(View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardView);
            imageHp = itemView.findViewById(R.id.image_hp);
            textHpName = itemView.findViewById(R.id.text_hp_name);
        }
    }
}

