package com.durasoft.client;

import com.google.gwt.core.client.EntryPoint;
import com.sencha.gxt.widget.core.client.box.MessageBox;

public class SampleEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		MessageBox mbox = new MessageBox("Hello World");
		mbox.show();
	}
}
