package org.generation.italy;



import java.util.ArrayList;

import org.generation.italy.model.Cuffie;
import org.generation.italy.model.DispositivoElettronico;
import org.generation.italy.model.Smartphone;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        ArrayList<DispositivoElettronico> elencoDispositivi = new ArrayList<>();

        
        elencoDispositivi.add(new Cuffie("Cuffie Bluetooth", 2023, 75, true));
        elencoDispositivi.add(new Cuffie("Cuffie Sportive", 2022, 65, false));
        elencoDispositivi.add(new Cuffie("Cuffie Gaming", 2024, 80, true));
        elencoDispositivi.add(new Cuffie("Cuffie Studio", 2023, 90, true));
        elencoDispositivi.add(new Smartphone("Smartphone A", 2023, 6, 4));
        elencoDispositivi.add(new Smartphone("Smartphone B", 2022, 6.5, 3));
        elencoDispositivi.add(new Smartphone("Smartphone C", 2024, 6.1, 2));
        elencoDispositivi.add(new Smartphone("Smartphone D", 2023, 6.2, 3));
        
        System.out.println("Totale dispositivi: "+elencoDispositivi.size());
        for(DispositivoElettronico d:elencoDispositivi) {
        	System.out.println(d.toString());
        }
	}
	

}
