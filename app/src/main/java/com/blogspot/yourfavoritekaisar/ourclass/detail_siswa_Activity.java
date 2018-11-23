package com.blogspot.yourfavoritekaisar.ourclass;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class detail_siswa_Activity extends AppCompatActivity {

    @BindView(R.id.fotoSiswa)
    ImageView fotoSiswa;
    @BindView(R.id.txtDetail)
    TextView txtDetail;
    @BindView(R.id.txt_Bio)
    TextView txt_Bio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_siswa_);
        ButterKnife.bind(this);

        txtDetail.setText(getIntent().getStringExtra("ns"));
        txt_Bio.setText(getIntent().getStringExtra("ds"));
        Glide.with(this).load(getIntent().getIntExtra("fs",0)).into(fotoSiswa);

    }
}
