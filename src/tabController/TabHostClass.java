package tabController;

import rubyteq.com.MainActivity;
import rubyteq.com.R;
import rubyteq.com.Tareas_activas;
import rubyteq.com.Tareas_completas;
import rubyteq.com.Tareas_futuras;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
 
public class TabHostClass extends TabActivity {
    // TabSpec Names
    private static final String INBOX_SPEC = "Pendientes";
    private static final String OUTBOX_SPEC = "Activas";
    private static final String PROFILE_SPEC = "Completas";
     
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabs_main);
         
        TabHost tabHost = getTabHost();
         
        // Inbox Tab
        TabSpec inboxSpec = tabHost.newTabSpec(INBOX_SPEC);
        // Tab Icon
        inboxSpec.setIndicator(INBOX_SPEC);//, getResources().getDrawable(R.drawable.icon_inbox));
        Intent inboxIntent = new Intent(this, Tareas_activas.class);
        // Tab Content
        inboxSpec.setContent(inboxIntent);
         
        // Outbox Tab
        TabSpec outboxSpec = tabHost.newTabSpec(OUTBOX_SPEC);
        outboxSpec.setIndicator(OUTBOX_SPEC);//, getResources().getDrawable(R.drawable.icon_outbox));
        Intent outboxIntent = new Intent(this, Tareas_futuras.class);
        outboxSpec.setContent(outboxIntent);
         
        // Profile Tab
        TabSpec profileSpec = tabHost.newTabSpec(PROFILE_SPEC);
        profileSpec.setIndicator(PROFILE_SPEC);//, getResources().getDrawable(R.drawable.icon_profile));
        Intent profileIntent = new Intent(this, Tareas_completas.class);
        profileSpec.setContent(profileIntent);
         
        // Adding all TabSpec to TabHost
        tabHost.addTab(inboxSpec); // Adding Inbox tab
        tabHost.addTab(outboxSpec); // Adding Outbox tab
        tabHost.addTab(profileSpec); // Adding Profile tab
    }
}