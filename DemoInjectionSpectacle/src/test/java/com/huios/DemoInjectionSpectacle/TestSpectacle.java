package com.huios.DemoInjectionSpectacle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpectacle {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spectacle.xml");
		System.out.println("--------------------olivier--------------------");
		Performeur olivier = (Performeur) appContext.getBean("Olivier");
		olivier.performe();
		System.out.println("--------------------caroline--------------------");
		Performeur caroline = (Performeur) appContext.getBean("Caroline");
		caroline.performe();
		System.out.println("--------------------Julien--------------------");
		Performeur julien = (Performeur) appContext.getBean("Julien");
		julien.performe();
		System.out.println("--------------------JeanMarc--------------------");
		Performeur jeanMarc = (Performeur) appContext.getBean("JeanMarc");
		jeanMarc.performe();
		System.out.println("--------------------Alain--------------------");
		Performeur Alain = (Performeur) appContext.getBean("Alain");
		Alain.performe();
		System.out.println("--------------------Louis--------------------");
		Performeur Louis = (Performeur) appContext.getBean("Louis");
		Louis.performe();
		System.out.println("--------------------Michel--------------------");
		Performeur Michel = (Performeur) appContext.getBean("Michel");
		Michel.performe();
		System.out.println("--------------------Maurice--------------------");
		Performeur Maurice = (Performeur) appContext.getBean("Maurice");
		Maurice.performe();
		System.out.println("--------------------Martin-----------------");
		Performeur Martin = (Performeur) appContext.getBean("Martin");
		Martin.performe();
		
		System.out.println("--------------------Mon musicien-----------------");
		Performeur monMusicien = (Performeur) appContext.getBean("monMusicien");
		monMusicien.performe();
	}

}
