package rubyteq.com;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.ToggleButton;

import com.larvalabs.svgandroid.SVG;
import com.larvalabs.svgandroid.SVGParser;
public class MainActivity extends Activity {

	private Menu optionsMenu;
	ToggleButton boton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ImageView imageView = (ImageView)findViewById(R.id.img1);
        //Parse the SVG file from the resource
        SVG svg = SVGParser.getSVGFromResource(getResources(), R.drawable.salida);
        //Get a drawable from the parsed SVG and apply to ImageView
        imageView.setImageDrawable(svg.createPictureDrawable());
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		this.optionsMenu = menu;
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.mainmenu, menu);
		return super.onCreateOptionsMenu(menu);
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.airport_menuRefresh:

			// Complete with your code

			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void setRefreshActionButtonState(final boolean refreshing) {
		if (optionsMenu != null) {
			final MenuItem refreshItem = optionsMenu
					.findItem(R.id.airport_menuRefresh);
			if (refreshItem != null) {
				if (refreshing) {
					refreshItem.setActionView(R.layout.action_view);
				} else {
					refreshItem.setActionView(null);
				}
			}
		}
	}
}