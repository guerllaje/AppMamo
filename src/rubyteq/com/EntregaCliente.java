package rubyteq.com;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

public class EntregaCliente extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.entrega_cliente);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_HOME
				| ActionBar.DISPLAY_SHOW_TITLE | ActionBar.DISPLAY_SHOW_CUSTOM);
		actionBar.setTitle("Entrega al cliente");
	}
}
