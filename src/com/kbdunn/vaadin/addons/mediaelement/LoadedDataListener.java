package com.kbdunn.vaadin.addons.mediaelement;

public interface LoadedDataListener {
	// Fires when the browser has loaded the current frame of the audio/video
	void dataLoaded(MediaComponent component);
}
