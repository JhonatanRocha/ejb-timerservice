package br.com.caelum.timer;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class Agendador {
	
	/*
	 * M�todo ser� executado a cada 10 segundos
	 */
	//@Schedule(hour="*", minute="*", second="*/10", persistent=false)
	
	/*
	 * M�todo ser� executado a cada 2 minutos
	 */
	@Schedule(hour="*", minute="*/2", persistent=false)
	void agendado(){
		System.out.println("Verificando servi�o externo periodicamente...");
	}
}
