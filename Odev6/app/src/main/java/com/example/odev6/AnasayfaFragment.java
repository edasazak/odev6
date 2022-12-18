package com.example.odev6;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev6.databinding.FragmentAnasayfaBinding;

import java.util.ArrayList;

public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);
        binding.toolbar2.setTitle("İyi günler");

        ((AppCompatActivity)getActivity()).setSupportActionBar(binding.toolbar2);

        requireActivity().addMenuProvider(new MenuProvider() {
            @Override
            public void onCreateMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
                menuInflater.inflate(R.menu.toolbar_menu, menu);
                MenuItem item1 = menu.findItem(R.id.action_bildirim);
                MenuItem item2 = menu.findItem(R.id.action_saat);
            }

            @Override
            public boolean onMenuItemSelected(@NonNull MenuItem menuItem) {
                return false;
            }

        });
        Resources res = getResources();
        Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.ayarlar_resim, null);
        binding.toolbar2.setOverflowIcon(drawable);

        binding.rvCalmaListesi.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        ArrayList<CalmaListesi> calmaListesi = new ArrayList<>();
        CalmaListesi c1 = new CalmaListesi("Beğenilen Şarkılar","begenilen1");
        CalmaListesi c2 = new CalmaListesi("Daily Mix 1","dailymix1");
        CalmaListesi c3 = new CalmaListesi("Daily Mix 2","dailymix2");
        CalmaListesi c4 = new CalmaListesi("Daily Mix 3","dailymix3");
        CalmaListesi c5 = new CalmaListesi("Haftalık Keşif","haftalik");
        CalmaListesi c6 = new CalmaListesi("Rock Mix","rockmix");

        calmaListesi.add(c1);
        calmaListesi.add(c2);
        calmaListesi.add(c3);
        calmaListesi.add(c4);
        calmaListesi.add(c5);
        calmaListesi.add(c6);

        CalmaListesiAdapter adapter = new CalmaListesiAdapter(getContext(), calmaListesi);
        binding.rvCalmaListesi.setAdapter(adapter);

        binding.rvCalmaListesi2.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL));
        ArrayList<CalmaListesi2> calmaListesi2 = new ArrayList<>();
        CalmaListesi2 cl1 = new CalmaListesi2("popmix", "Pop Mix", "Lady Gaga, Gwen Stefani, Katy Perry ve daha fazlası");
        CalmaListesi2 cl2 = new CalmaListesi2("rbmix2", "R&B Mix", "Usher, Destiny's Child, Mary J. Blige ve daha fazlası");
        CalmaListesi2 cl3 = new CalmaListesi2("lanadelrey", "Born To Die", "Albüm - Lana Del Rey");
        CalmaListesi2 cl4 = new CalmaListesi2("eminem", "Curtain Call: The Hits", "Albüm - Eminem");
        CalmaListesi2 cl5 = new CalmaListesi2("aic", "Unplugged", "Albüm - Alice In Chains");
        calmaListesi2.add(cl1);
        calmaListesi2.add(cl2);
        calmaListesi2.add(cl3);
        calmaListesi2.add(cl4);
        calmaListesi2.add(cl5);

        CalmaListesi2Adapter adapter2 = new CalmaListesi2Adapter(getContext(), calmaListesi2);
        binding.rvCalmaListesi2.setAdapter(adapter2);


        requireActivity().addMenuProvider(new MenuProvider() {
            @Override
            public void onCreateMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
                menuInflater.inflate(R.menu.bottom_menu, menu);
                MenuItem item1 = menu.findItem(R.id.ev);
                MenuItem item2 = menu.findItem(R.id.arama);
                MenuItem item3 = menu.findItem(R.id.kitaplik);
            }

            @Override
            public boolean onMenuItemSelected(@NonNull MenuItem menuItem) {
                return false;
            }
        });
        return binding.getRoot();


    }
}