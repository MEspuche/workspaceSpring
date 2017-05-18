package com.huios.DemoInjectionSpectacle;

import java.util.Collection;

public class MusicienPolyinstruments implements Performeur {

	public MusicienPolyinstruments() {
		super();
	}
	
	public void performe() throws PerformanceException {
		for(Instrument instrument : instruments) {
		instrument.jouer();
		}
	}
	
	private Collection<Instrument> instruments;
	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
		}
}
