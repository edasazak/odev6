package com.example.odev6;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.odev6.databinding.CardTasarimBinding;

import java.util.List;

public class CalmaListesiAdapter extends RecyclerView.Adapter<CalmaListesiAdapter.CardTasarimTutucu> {
    private Context mContext;
    private List<CalmaListesi> calmaListesi;

    public CalmaListesiAdapter(Context mContext, List<CalmaListesi> calmaListesi) {
        this.mContext = mContext;
        this.calmaListesi = calmaListesi;
    }


    @NonNull
    @Override
    public CalmaListesiAdapter.CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardTasarimBinding binding =
                CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false);
        return new CardTasarimTutucu(binding);    }

    @Override
    public void onBindViewHolder(@NonNull CalmaListesiAdapter.CardTasarimTutucu holder, int position) {
        CalmaListesi calmaListesi1 = calmaListesi.get(position);
        CardTasarimBinding t = holder.binding;
        t.imageView.setImageResource(mContext.getResources().getIdentifier(calmaListesi1.getResimAdi(), "drawable", mContext.getPackageName()));
        t.textView3.setText(calmaListesi1.getAciklama());
    }

    @Override
    public int getItemCount() {
        return calmaListesi.size();
    }
    public class CardTasarimTutucu extends RecyclerView.ViewHolder {
        private CardTasarimBinding binding;
        public CardTasarimTutucu(CardTasarimBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
