package com.blogspot.yourfavoritekaisar.ourclass;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleActivity extends AppCompatActivity {

    @BindView(R.id.my_recycler_view)
    RecyclerView my_recycler_view;
    String[] nama_siswa,detail_siswa;
    int[] fotoSiswa;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);

        nama_siswa = getResources().getStringArray(R.array.nama_siswa);
        detail_siswa = getResources().getStringArray(R.array.detailSiswa);
        fotoSiswa = new int[]{R.drawable.fotosandy,R.drawable.fotoaji,R.drawable.fotoaldi,R.drawable.fotofaruk,
        R.drawable.fotoziyat,R.drawable.fotoziad,R.drawable.fotoammar,R.drawable.ian,R.drawable.fotosadam,R.drawable.fotofikri,
        R.drawable.fotodaffa,};

        adapter adapter = new adapter(RecycleActivity.this, fotoSiswa,nama_siswa,detail_siswa);
        my_recycler_view.setHasFixedSize(true);
        my_recycler_view.setLayoutManager(new LinearLayoutManager(RecycleActivity.this));
        my_recycler_view.setAdapter(adapter);
    }
}
