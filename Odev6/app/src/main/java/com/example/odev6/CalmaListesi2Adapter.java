package com.example.odev6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.odev6.databinding.CardTasarim2Binding;
import com.example.odev6.databinding.CardTasarimBinding;

import java.util.List;

public class CalmaListesi2Adapter extends RecyclerView.Adapter<CalmaListesi2Adapter.CardTasarimTutucu> {

    private Context mContext;
    private List<CalmaListesi2> calmaListesi2;

    public CalmaListesi2Adapter(Context mContext, List<CalmaListesi2> calmaListesi2) {
        this.mContext = mContext;
        this.calmaListesi2 = calmaListesi2;
    }

    @NonNull
    @Override
    public CalmaListesi2Adapter.CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardTasarim2Binding binding =
                CardTasarim2Binding.inflate(LayoutInflater.from(mContext),parent,false);
        return new CalmaListesi2Adapter.CardTasarimTutucu(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CalmaListesi2Adapter.CardTasarimTutucu holder, int position) {
        CalmaListesi2 calmaListesi1 = calmaListesi2.get(position);
        CardTasarim2Binding t = holder.binding;
        t.imageView2.setImageResource(mContext.getResources().getIdentifier(calmaListesi1.getResimAdi(), "drawable", mContext.getPackageName()));
        t.textView2.setText(calmaListesi1.getBaslik());
        t.textView4.setText(calmaListesi1.getAciklama());
    }

    @Override
    public int getItemCount() {
        return calmaListesi2.size();
    }

    public class CardTasarimTutucu extends RecyclerView.ViewHolder {
        private CardTasarim2Binding binding;
        public CardTasarimTutucu(CardTasarim2Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
