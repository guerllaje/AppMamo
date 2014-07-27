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

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activas);

		LISTA = (ListView) findViewById(R.id.listView);


		Ventas weather_data[] = new Ventas[] {
				new Ventas(R.drawable.img3, "0002929191", "Recoger Paquete"),
				new Ventas(R.drawable.img3, "0002929191", "Recoger Paquete"),
				new Ventas(R.drawable.img3, "0002929191", "Recoger Paquete"),
				new Ventas(R.drawable.img3, "0002929191", "Recoger Paquete"),
				new Ventas(R.drawable.img3, "0002929191", "Recoger Paquete"),
				new Ventas(R.drawable.img3, "0002929191", "Recoger Paquete"),
				new Ventas(R.drawable.img2, "0002929191", "Recoger Paquete"),
				new Ventas(R.drawable.img2, "0002929191", "Recoger Paquete"),
				new Ventas(R.drawable.img2, "0002929191", "Recoger Paquete"),
				new Ventas(R.drawable.img2, "0002929191", "Recoger Paquete"),
				new Ventas(R.drawable.img2, "0002929191", "Recoger Paquete") };
		Listadpter adapter = new Listadpter(this, R.layout.listlayout,
				weather_data);
		LISTA.setAdapter(adapter);
		LISTA.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				 Intent i = new Intent(getApplicationContext(), Pickup.class);
				 startActivity(i);
//				 

			}
		});
	
	}
}
//	@Override
//	protected void onActivityResult(int requestCode, int resultCode, Intent data)
//	{    
//	    if (resultCode == RESULT_OK) 
//	    {
//	        // Scan result is available by making a call to data.getStringExtra(ZBarConstants.SCAN_RESULT)
//	        // Type of the scan result is available by making a call to data.getStringExtra(ZBarConstants.SCAN_RESULT_TYPE)
//	        Toast.makeText(this, "Scan Result = " + data.getStringExtra(ZBarConstants.SCAN_RESULT), Toast.LENGTH_SHORT).show();
//	        Toast.makeText(this, "Scan Result Type = " + data.getIntExtra(ZBarConstants.SCAN_RESULT_TYPE, 0), Toast.LENGTH_SHORT).show();
//	        // The value of type indicates one of the symbols listed in Advanced Options below.
//	    } else if(resultCode == RESULT_CANCELED) {
//	        Toast.makeText(this, "Camera unavailable", Toast.LENGTH_SHORT).show();
//	    }
//	}
//}

//
// Intent i = new Intent(getApplicationContext(), Pickup.class);
// startActivity(i);