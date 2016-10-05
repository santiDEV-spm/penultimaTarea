package coursera.santi.kota2.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import coursera.santi.kota2.adapters.MascotaAdaptador;
import coursera.santi.kota2.pojo.Mascota;
import coursera.santi.kota2.R;


public class RecyclerFragment extends Fragment {


    ArrayList<Mascota>mascotas;
    RecyclerView rvMascotas;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View v= inflater.inflate(R.layout.fragment_recycler, container, false);

        rvMascotas = (RecyclerView)v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        rvMascotas.setLayoutManager(llm);


        llenarLista();
        InicializarAdaptador();

        return v;





    }

    public  void InicializarAdaptador(){

        MascotaAdaptador mascotaAdaptador = new MascotaAdaptador(mascotas,getActivity());
        rvMascotas.setAdapter(mascotaAdaptador);
    }


    public void llenarLista(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.cat,"Panchito","20"));
        mascotas.add(new Mascota(R.drawable.cuyo,"Clementino","15"));
        mascotas.add(new Mascota(R.drawable.perro,"Timoteo","13"));
        mascotas.add(new Mascota(R.drawable.pes,"Gordo","10"));
        mascotas.add(new Mascota(R.drawable.pig,"Piggy","8"));

    }
}
