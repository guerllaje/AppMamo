package rubyteq.com;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Tareas_activas extends Activity {

	ListView LISTA;
	Intent i;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activas);

		LISTA = (ListView) findViewById(R.id.listView);
		// 1 - recojer
		// 2 - Entregar
		
		final Ventas ventas[] = new Ventas[] {
				new Ventas(R.drawable.img3, "0000000001", "Recoger Paquete", 1),
				new Ventas(R.drawable.img3, "0000000001", "Recoger Paquete", 1),
				new Ventas(R.drawable.img3, "0000000001", "Recoger Paquete", 1),
				new Ventas(R.drawable.img3, "0000000002", "Recoger Paquete", 2),
				new Ventas(R.drawable.img3, "1000000002", "Entregar Paquete", 2),
				new Ventas(R.drawable.img3, "1000000002", "Entregar Paquete", 2),
				new Ventas(R.drawable.img2, "1000000003", "Entregar Paquete", 3),
				new Ventas(R.drawable.img2, "1000000003", "Recoger Paquete", 3),
				new Ventas(R.drawable.img2, "1000000003", "Recoger Paquete", 3),
				new Ventas(R.drawable.img2, "1000000004", "Recoger Paquete", 4),
				new Ventas(R.drawable.img2, "1000000004", "Recoger Paquete", 4) };
		Listadpter adapter = new Listadpter(this, R.layout.listlayout, ventas);
		LISTA.setAdapter(adapter);
		LISTA.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				
				switch (ventas[position].ID) {
				case 1:
					 i = new Intent(getApplicationContext(), Pickup.class);
					break;
				case 2:
					i = new Intent(getApplicationContext(), Entrega.class);					
					break;
				case 3:
					i = new Intent(getApplicationContext(), SalidaAlmacen.class);	
					break;
				case 4:
					i = new Intent(getApplicationContext(), EntregaCliente.class);	
					break;
				default:
					
					break;
				}
				startActivity(i);
				

			}
		});

	}
}
