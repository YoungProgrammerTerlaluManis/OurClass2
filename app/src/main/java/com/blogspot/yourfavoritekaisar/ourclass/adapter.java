package com.blogspot.yourfavoritekaisar.ourclass;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class adapter extends RecyclerView.Adapter<adapter.ViewHolder> {
    // TODO Membuat variableee
    Context context;
    int[] fotoSiswa;
    String[] nama_siswa,detailSiswa;

    public adapter(Context context, int[] fotoSiswa, String[] nama_siswa, String[] detailSiswa) {
        this.context = context;
        this.nama_siswa = nama_siswa;
        this.fotoSiswa = fotoSiswa;
        this.detailSiswa = detailSiswa;
    }

    @NonNull
    @Override
    public adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_siswa, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.txtNama.setText(nama_siswa[i]);
        Glide.with(context).load(fotoSiswa[i]).into(viewHolder.logo);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(context,detail_siswa_Activity.class);
                pindah.putExtra("ns", nama_siswa[i]);
                pindah.putExtra("ds", detailSiswa[i]);
                pindah.putExtra("fs", fotoSiswa[i]);
                context.startActivity(pindah);
            }
        });



    }

    @Override
    public int getItemCount() { return fotoSiswa.length;}


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logo;
        TextView txtNama;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logo = itemView.findViewById(R.id.imgList);
            txtNama = itemView.findViewById(R.id.txtListTitle);
        }
    }
}
