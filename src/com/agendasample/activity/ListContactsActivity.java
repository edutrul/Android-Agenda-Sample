package com.agendasample.activity;

import java.util.Iterator;
import java.util.Map.Entry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.agendasample.model.*;


public class ListContactsActivity extends Activity {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_contacts);
        Intent intent = getIntent();
        Agenda agenda = (Agenda) intent.getSerializableExtra(AgendaSampleActivity.AGENDA);
        TextView txt_contacts_lists = (TextView) findViewById(R.id.txt_contact_lists);
        txt_contacts_lists.setText(lista_contacts(agenda));
    }
    
    public String lista_contacts(Agenda agenda) {
    	String str = "";
    	Iterator<Entry<Integer, Person>> it = agenda.getContacts().entrySet().iterator();
    	while (it.hasNext()) {
    		Person person = it.next().getValue();
    		str += person.getNombre() + " - " + person.getDni() + "\n";
    	}
    	return str;
    }
}