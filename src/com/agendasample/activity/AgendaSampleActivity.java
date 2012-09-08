package com.agendasample.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.agendasample.model.*;;

public class AgendaSampleActivity extends Activity {
	
	public final static String PERSON = "com.agendasample.activity.PERSON";
	public final static String AGENDA = "com.agendasample.activity.AGENDA";
	//private Agenda agenda = new Agenda();
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }
    
    public void list_contacts(View view) {
    	Intent intent = new Intent(this, ListContactsActivity.class);
    	Agenda agenda = new Agenda();
        agenda.addContact(new Person(46803550, "Eduardo", true));
        agenda.addContact(new Person(46803551, "Cristhian", false));
        agenda.addContact(new Person(46803552, "Axel", true));
    	intent.putExtra(AGENDA, agenda);
    	startActivity(intent);
    	
    }


}