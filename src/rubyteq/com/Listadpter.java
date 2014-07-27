package rubyteq.com;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Listadpter extends ArrayAdapter<Ventas>{

    Context context; 
    int layoutResourceId;    
    Ventas data[] = null;
    
    public Listadpter(Context context, int layoutResourceId, Ventas[] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        VentasHolder holder = null;
        
        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            
            holder = new VentasHolder();
            holder.imgIcon = (ImageView)row.findViewById(R.id.icon);
            holder.txtTitle = (TextView)row.findViewById(R.id.firstLine);
            holder.txtSubTitle = (TextView)row.findViewById(R.id.secondLine);
            
            row.setTag(holder);
        }
        else
        {
            holder = (VentasHolder)row.getTag();
        }
        
        Ventas ventas = data[position];
        holder.txtTitle.setText(ventas.title);
        holder.txtSubTitle.setText(ventas.Subtitle);
        holder.imgIcon.setImageResource(ventas.icon);
        
        return row;
    }
    
    static class VentasHolder
    {
        ImageView imgIcon;
        TextView txtSubTitle;
        TextView txtTitle;
    }
}
