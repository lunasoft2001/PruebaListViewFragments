package la.oja.pruebalistviewfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListaClientesFragment extends Fragment {


    private ListView mListViewClientes;
    private ArrayList<Cliente> mListaClientes;

    public ListaClientesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewFragmento =  inflater.inflate(R.layout.fragment_clientes, container, false);


        mListViewClientes = (ListView) viewFragmento.findViewById(R.id.ListaClientes);

        // Introduccion de datos de clientes
        mListaClientes.add(new Cliente(1,"Cliente1","Direccion1", "Telefono1"));
        mListaClientes.add(new Cliente(2,"Cliente2","Direccion2", "Telefono2"));
        mListaClientes.add(new Cliente(3,"Cliente3","Direccion3", "Telefono3"));
        mListaClientes.add(new Cliente(4,"Cliente4","Direccion4", "Telefono4"));


        mListViewClientes.setAdapter(new MiAdaptador());

        return viewFragmento;

    }

    public class MiAdaptador extends BaseAdapter{


        @Override
        public int getCount() {
            return mListaClientes.size();
        }

        @Override
        public Object getItem(int position) {
            return mListaClientes.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View filaView = getActivity().getLayoutInflater().inflate(R.layout.registro_cliente,null);

            TextView  tvId = (TextView) filaView.findViewById(R.id.tvIdCliente);
            tvId.setText(mListaClientes.get(position).getIdCliente());

            TextView  tvNombre = (TextView) filaView.findViewById(R.id.tvNombreCliente);
            tvNombre.setText(mListaClientes.get(position).getNombreCliente());

            TextView  tvDireccion = (TextView) filaView.findViewById(R.id.tvDireccion);
            tvDireccion.setText(mListaClientes.get(position).getDireccionCliente());

            TextView  tvTelefono = (TextView) filaView.findViewById(R.id.tvTelefono);
            tvTelefono.setText(mListaClientes.get(position).getTelefonoCliente());

            return filaView;

        }
    }


}
