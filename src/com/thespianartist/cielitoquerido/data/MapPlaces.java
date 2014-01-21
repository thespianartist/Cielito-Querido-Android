package com.thespianartist.cielitoquerido.data;

import java.util.ArrayList;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.thespianartist.cielitoquerido.R;
import com.thespianartist.cielitoquerido.models.CieloMarker;

	public class MapPlaces {
	
	private ArrayList<MarkerOptions> markersOptions = new  ArrayList<MarkerOptions>();
	private ArrayList <CieloMarker> cielomarkers = new  ArrayList<CieloMarker>();
	
	public 	MarkerOptions torreMapre; 
	public 	MarkerOptions rioLerma; 
	public  MarkerOptions homero; 
	public 	MarkerOptions lasAmericas;
	public 	MarkerOptions insurgentes;
	public 	MarkerOptions santaFe;
	public 	MarkerOptions genova;
	public 	MarkerOptions alameda;
	public  MarkerOptions pedregal;
	public  MarkerOptions tribunales;
	public  MarkerOptions paragon;
	public  MarkerOptions leibnitz;
	public  MarkerOptions galeriasAtizapan;
	public  MarkerOptions santafeDos;
	public  MarkerOptions axiomatla;
	public  MarkerOptions plazaAragon;
	public  MarkerOptions dosPatios;
	public  MarkerOptions dakota;
	public  MarkerOptions juarez;
	public  MarkerOptions michoacan;
	public  MarkerOptions colon;
	public  MarkerOptions parroquia;
	public  MarkerOptions mundoE;
	public  MarkerOptions wtc;
	public  MarkerOptions pradoNorte;
	public  MarkerOptions parqueTezontle;
	public  MarkerOptions lomasVerdes;
	public  MarkerOptions santaFeTres;
	public  MarkerOptions coyoacan;
	public  MarkerOptions reformaDos;
	public  MarkerOptions pabellonDelValle;
	public  MarkerOptions parqueDelta;
	public  MarkerOptions parqueDuraznos;
	public  MarkerOptions plazaUniversidad;

	
	public 	CieloMarker torreMapre_marker; 
	public 	CieloMarker rioLerma_marker; 
	public  CieloMarker homero_marker; 
	public 	CieloMarker lasAmericas_marker;
	public 	CieloMarker insurgentes_marker;
	public 	CieloMarker santaFe_marker;
	public 	CieloMarker genova_marker;
	public 	CieloMarker alameda_marker;
	public  CieloMarker	pedregal_marker;
	public  CieloMarker tribunales_marker;
	public  CieloMarker paragon_marker;
	public  CieloMarker	leibnitz_marker;
	public 	CieloMarker galeriasAtizapan_marker;
	public  CieloMarker santafeDos_marker;
	public  CieloMarker axiomatla_marker;
	public 	CieloMarker plazaAragon_marker;
	public  CieloMarker dosPatios_marker;
	public  CieloMarker dakota_marker;
	public  CieloMarker juarez_marker;
	public  CieloMarker michoacan_marker;
	public  CieloMarker colon_marker;
	public  CieloMarker parroquia_marker;
	public  CieloMarker mundoE_marker;
	public  CieloMarker wtc_marker;
	public  CieloMarker pradoNorte_marker;
	public  CieloMarker parqueTezontle_marker;
	public  CieloMarker lomasVerdes_marker;
	public  CieloMarker santaFeTres_marker;
	public  CieloMarker coyoacan_marker;
	public  CieloMarker reformaDos_marker;
	public  CieloMarker pabellonDelValle_marker;
	public  CieloMarker parqueDelta_marker;
	public  CieloMarker parqueDuraznos_marker;
	public  CieloMarker plazaUniversidad_marker;
	
	public ArrayList<MarkerOptions> getMarkers(){
			 
		torreMapre = new MarkerOptions();
		torreMapre_marker = new CieloMarker();
		
		torreMapre_marker.setPosition(new LatLng(19.425702, -99.193720));
		torreMapre_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		torreMapre_marker.setTitle("Torre Mapfre");
		torreMapre_marker.setSnippet("Av. Paseo de la Reforma no. 243 \n Col. Cuauhtémoc, C.P. 06600  \n  Del. Cuauhtémoc, México, D.F.");
		
		torreMapre.position(torreMapre_marker.getPosition());
		torreMapre.icon(torreMapre_marker.getIcon());
		torreMapre.title(torreMapre_marker.getTitle());
		torreMapre.snippet(torreMapre_marker.getSnippet());
		
		markersOptions.add(torreMapre);
		cielomarkers.add(torreMapre_marker);
		
		
		rioLerma = new MarkerOptions();
		rioLerma_marker = new CieloMarker();
		
		rioLerma_marker.setPosition(new LatLng(19.426586, -99.173094));
		rioLerma_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		rioLerma_marker.setTitle("Río Lerma");
		rioLerma_marker.setSnippet("Río Lerma no. 201, Col. Cuauhtémoc, C.P. 06500, Del. Cuauhtémoc, México, D.F");
		
		rioLerma.position(rioLerma_marker.getPosition());
		rioLerma.icon(rioLerma_marker.getIcon());
		rioLerma.title(rioLerma_marker.getTitle());
		rioLerma.snippet(rioLerma_marker.getSnippet());
		
		markersOptions.add(rioLerma);
		cielomarkers.add(rioLerma_marker);
		
		homero = new MarkerOptions();
		homero_marker = new CieloMarker();
		
		homero_marker.setPosition(new LatLng(19.438295,  -99.187400));
		homero_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		homero_marker.setTitle("Homero");
		homero_marker.setSnippet("Homero No. 109, Col. Chapultepec Morales, Del. Miguel Hidalgo, México, D.F.");
		
		homero.position(homero_marker.getPosition());
		homero.icon(homero_marker.getIcon());
		homero.title(homero_marker.getTitle());
		homero.snippet(homero_marker.getSnippet());
		
		markersOptions.add(homero);
		cielomarkers.add(homero_marker);
		
		lasAmericas = new MarkerOptions();
		lasAmericas_marker = new CieloMarker();
		
		lasAmericas_marker.setPosition(new LatLng(19.583015  ,  -99.023313));
		lasAmericas_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		lasAmericas_marker.setTitle("Plaza las Americas Ecatepec");
		lasAmericas_marker.setSnippet("Centro Comercial Las Américas Local B-25 Av. Hank González, Esq. 1º De Mayo Col. Las Américas C.P. 55075, México, D.F.");
		
		lasAmericas.position(lasAmericas_marker.getPosition());
		lasAmericas.icon(lasAmericas_marker.getIcon());
		lasAmericas.title(lasAmericas_marker.getTitle());
		lasAmericas.snippet(lasAmericas_marker.getSnippet());
		
		markersOptions.add(lasAmericas);
		cielomarkers.add(lasAmericas_marker);
		
		insurgentes = new MarkerOptions();
		insurgentes_marker = new CieloMarker();
		
		insurgentes_marker.setPosition(new LatLng(19.364845  ,  -99.181804));
		insurgentes_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		insurgentes_marker.setTitle("insurgentes");
		insurgentes_marker.setSnippet("Av. Insurgentes No. 1602, Col. Crédito Constructor, Del. Benito Juárez, México, D.F.");
		
		insurgentes.position(insurgentes_marker.getPosition());
		insurgentes.icon(insurgentes_marker.getIcon());
		insurgentes.title(insurgentes_marker.getTitle());
		insurgentes.snippet(insurgentes_marker.getSnippet());
		
		markersOptions.add(insurgentes);
		cielomarkers.add(insurgentes_marker);
		santaFe = new MarkerOptions();
		santaFe_marker = new CieloMarker();
		
		santaFe_marker.setPosition(new LatLng(19.366070  , -99.263456));
		santaFe_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		santaFe_marker.setTitle("Santa Fe");
		santaFe_marker.setSnippet("Guillermo González Camarena No. 900 Lomas de Santa Fe, Del. Álvaro Obregón, México, D.F.");
		
		santaFe.position(santaFe_marker.getPosition());
		santaFe.icon(santaFe_marker.getIcon());
		santaFe.title(santaFe_marker.getTitle());
		santaFe.snippet(santaFe_marker.getSnippet());
		
		markersOptions.add(santaFe);
		cielomarkers.add(santaFe_marker);
		
		genova = new MarkerOptions();
		genova_marker = new CieloMarker();
		
		genova_marker.setPosition(new LatLng(19.427957  , -99.164675));
		genova_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		genova_marker.setTitle("Genova");
		genova_marker.setSnippet("Paseo de la Reforma No. 284, Col. Juárez, Del. Cuauhtémoc, México, D.F.");
		
		genova.position(genova_marker.getPosition());
		genova.icon(genova_marker.getIcon());
		genova.title(genova_marker.getTitle());
		genova.snippet(genova_marker.getSnippet());
		
		markersOptions.add(genova);
		cielomarkers.add(genova_marker);
		
		alameda = new MarkerOptions();
		alameda_marker = new CieloMarker();
		
		alameda_marker.setPosition(new LatLng(19.434315  , -99.142706));
		alameda_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		alameda_marker.setTitle("Alameda");
		alameda_marker.setSnippet("Calle de Dolores No. 2,Esq. Av. Juárez No. 24, Col. Centro, Del. Cuauhtémoc, México, D.F.");
		
		alameda.position(alameda_marker.getPosition());
		alameda.icon(alameda_marker.getIcon());
		alameda.title(alameda_marker.getTitle());
		alameda.snippet(alameda_marker.getSnippet());
		
		markersOptions.add(alameda);
		cielomarkers.add(alameda_marker);
		
		pedregal = new MarkerOptions();
		pedregal_marker = new CieloMarker();
		
		pedregal_marker.setPosition(new LatLng(19.316088 , -99.212408));
		pedregal_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		pedregal_marker.setTitle("Pedregal");
		pedregal_marker.setSnippet("Av. de las Fuentes No. 571 Local 1 Col. Jardines del Pedregal Del. Álvaro Obregón");
		
		pedregal.position(pedregal_marker.getPosition());
		pedregal.icon(pedregal_marker.getIcon());
		pedregal.title(pedregal_marker.getTitle());
		pedregal.snippet(pedregal_marker.getSnippet());
		
		markersOptions.add(pedregal);
		cielomarkers.add(pedregal_marker);
		
		tribunales = new MarkerOptions();
		tribunales_marker = new CieloMarker();
		
		tribunales_marker.setPosition(new LatLng(19.42116789856784 , -99.14914209659003));
		tribunales_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		tribunales_marker.setTitle("Tribunales");
		tribunales_marker.setSnippet("Dr. Claudio Bernard No. 82 Col. Doctores, Del. Cuauhtémoc. México, D.F.");
		
		tribunales.position(tribunales_marker.getPosition());
		tribunales.icon(tribunales_marker.getIcon());
		tribunales.title(tribunales_marker.getTitle());
		tribunales.snippet(tribunales_marker.getSnippet());
		
		markersOptions.add(tribunales);
		cielomarkers.add(tribunales_marker);
		
		paragon = new MarkerOptions();
		paragon_marker = new CieloMarker();
		
		paragon_marker.setPosition(new LatLng(19.358378789225206 , -99.27754859798708));
		paragon_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		paragon_marker.setTitle("Paragon");
		paragon_marker.setSnippet("Av. Salvador Agraz No. 97, Local A, Col. Santa Fe Cuajimalpa, México, D.F.");
		
		paragon.position(paragon_marker.getPosition());
		paragon.icon(paragon_marker.getIcon());
		paragon.title(paragon_marker.getTitle());
		paragon.snippet(paragon_marker.getSnippet());
		
		markersOptions.add(paragon);
		cielomarkers.add(paragon_marker);
		
		leibnitz = new MarkerOptions();
		leibnitz_marker = new CieloMarker();
		
		leibnitz_marker.setPosition(new LatLng(19.42959976196289, -99.17800903320312));
		leibnitz_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		leibnitz_marker.setTitle("Galerías Atizapán");
		leibnitz_marker.setSnippet("Calle Leibnitz No. 117, Local 4, Colonia Anzures, Del. Miguel Hidalgo, México, D.F.");
		
		leibnitz.position(leibnitz_marker.getPosition());
		leibnitz.icon(leibnitz_marker.getIcon());
		leibnitz.title(leibnitz_marker.getTitle());
		leibnitz.snippet(leibnitz_marker.getSnippet());
		
		markersOptions.add(leibnitz);
		cielomarkers.add(leibnitz_marker);

		galeriasAtizapan = new MarkerOptions();
		galeriasAtizapan_marker = new CieloMarker();
		
		galeriasAtizapan_marker.setPosition(new LatLng(19.550240329119266,-99.2741650093222));
		galeriasAtizapan_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		galeriasAtizapan_marker.setTitle("Galerias Atizapan");
		galeriasAtizapan_marker.setSnippet("Av. Ruiz Cortines No. 255, Local 514, Col. Las Margaritas, Atizapán de Zaragoza, Edo. de México");
		
		galeriasAtizapan.position(galeriasAtizapan_marker.getPosition());
		galeriasAtizapan.icon(galeriasAtizapan_marker.getIcon());
		galeriasAtizapan.title(galeriasAtizapan_marker.getTitle());
		galeriasAtizapan.snippet(galeriasAtizapan_marker.getSnippet());
		
		markersOptions.add(galeriasAtizapan);
		cielomarkers.add(galeriasAtizapan_marker);
		
		santafeDos = new MarkerOptions();
		santafeDos_marker = new CieloMarker();
		
		santafeDos_marker.setPosition(new LatLng(19.373355371786698,-99.26064289319923));
		santafeDos_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		santafeDos_marker.setTitle("Corporativo Opción II Santa fe");
		santafeDos_marker.setSnippet("Av. Prolongación Paseo de la Reforma No. 490, Col. Santa Fe Peña Blanca, Del. Álvaro Obregón, México, D.F.");
		
		santafeDos.position(santafeDos_marker.getPosition());
		santafeDos.icon(santafeDos_marker.getIcon());
		santafeDos.title(santafeDos_marker.getTitle());
		santafeDos.snippet(santafeDos_marker.getSnippet());
		
		markersOptions.add(santafeDos);
		cielomarkers.add(santafeDos_marker);
		
		axiomatla = new MarkerOptions();
		axiomatla_marker = new CieloMarker();
		
		axiomatla_marker.setPosition(new LatLng(19.34255027770996,-99.24580383300781));
		axiomatla_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		axiomatla_marker.setTitle("Axiomatla");
		axiomatla_marker.setSnippet("Calzada de las Águilas No. 1952, locales 22 y 23, Col. Lomas de Axomiatla, Del. Alvaro Obregón, México, D.F.");
		
		axiomatla.position(axiomatla_marker.getPosition());
		axiomatla.icon(axiomatla_marker.getIcon());
		axiomatla.title(axiomatla_marker.getTitle());
		axiomatla.snippet(axiomatla_marker.getSnippet());
		
		markersOptions.add(axiomatla);
		cielomarkers.add(axiomatla_marker);

		plazaAragon = new MarkerOptions();
		plazaAragon_marker = new CieloMarker();
		
		plazaAragon_marker.setPosition(new LatLng(19.530783,-99.026183));
		plazaAragon_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		plazaAragon_marker.setTitle("MultiPlaza Aragon");
		plazaAragon_marker.setSnippet("Av. Carlos Hank González No.120 Local 34 Col. Rinconada De Aragón, Ecatepec De Morelos, Edo. De México");
		
		plazaAragon.position(plazaAragon_marker.getPosition());
		plazaAragon.icon(plazaAragon_marker.getIcon());
		plazaAragon.title(plazaAragon_marker.getTitle());
		plazaAragon.snippet(plazaAragon_marker.getSnippet());
		
		markersOptions.add(plazaAragon);
		cielomarkers.add(plazaAragon_marker);
		
		dosPatios = new MarkerOptions();
		dosPatios_marker = new CieloMarker();
		
		dosPatios_marker.setPosition(new LatLng(19.43735625195558,-99.18658207786957));
		dosPatios_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		dosPatios_marker.setTitle("Dos Patios");
		dosPatios_marker.setSnippet("Av. Ejército Nacional No.350 Local L-02 Col. Chapultepec Morales Del. Miguel Hidalgo, México, D.F.");
		
		dosPatios.position(dosPatios_marker.getPosition());
		dosPatios.icon(dosPatios_marker.getIcon());
		dosPatios.title(dosPatios_marker.getTitle());
		dosPatios.snippet(dosPatios_marker.getSnippet());
		
		markersOptions.add(dosPatios);
		cielomarkers.add(dosPatios_marker);
	
		dakota = new MarkerOptions();
		dakota_marker = new CieloMarker();
		
		dakota_marker.setPosition(new LatLng(19.390101,-99.171138));
		dakota_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		dakota_marker.setTitle("Dakota");
		dakota_marker.setSnippet("Dakota No. 95 Col. Napoles Del. Benito Juárez, México, D.F.");
		
		dakota.position(dakota_marker.getPosition());
		dakota.icon(dakota_marker.getIcon());
		dakota.title(dakota_marker.getTitle());
		dakota.snippet(dakota_marker.getSnippet());
		
		markersOptions.add(dakota);
		cielomarkers.add(dakota_marker);
		
		juarez = new MarkerOptions();
		juarez_marker = new CieloMarker();
		
		juarez_marker.setPosition(new LatLng(19.433329,-99.144487));
		juarez_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		juarez_marker.setTitle("Juarez");
		juarez_marker.setSnippet("Independencia No.31 Col. Centro Del. Cuauhtemoc, México, Df.");
		
		juarez.position(juarez_marker.getPosition());
		juarez.icon(juarez_marker.getIcon());
		juarez.title(juarez_marker.getTitle());
		juarez.snippet(juarez_marker.getSnippet());
		
		markersOptions.add(juarez);
		cielomarkers.add(juarez_marker);

		michoacan = new MarkerOptions();
		michoacan_marker = new CieloMarker();
		
		michoacan_marker.setPosition(new LatLng(19.412688,-99.17779));
		michoacan_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		michoacan_marker.setTitle("Michoacan");
		michoacan_marker.setSnippet("Michoacán No. 126 Col. Condesa Del. Cuauhtémoc, México, D.F.");
		
		michoacan.position(michoacan_marker.getPosition());
		michoacan.icon(michoacan_marker.getIcon());
		michoacan.title(michoacan_marker.getTitle());
		michoacan.snippet(michoacan_marker.getSnippet());
		
		markersOptions.add(michoacan);
		cielomarkers.add(michoacan_marker);
		
		colon = new MarkerOptions();
		colon_marker = new CieloMarker();
		
		colon_marker.setPosition(new LatLng(19.44466,-99.145775));
		colon_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		colon_marker.setTitle("Colon");
		colon_marker.setSnippet("Reforma No.87-b Col. Tabacalera, México D.F.");
		
		colon.position(colon_marker.getPosition());
		colon.icon(colon_marker.getIcon());
		colon.title(colon_marker.getTitle());
		colon.snippet(colon_marker.getSnippet());
		
		markersOptions.add(colon);
		cielomarkers.add(colon_marker);
		
		parroquia = new MarkerOptions();
		parroquia_marker = new CieloMarker();
		
		parroquia_marker.setPosition(new LatLng(19.369899,-99.17191));
		parroquia_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		parroquia_marker.setTitle("Parroquia");
		parroquia_marker.setSnippet("Calle Parroquia No.406 Col. del Valle Del. Benito Juárez, México, D.F.");
		
		parroquia.position(parroquia_marker.getPosition());
		parroquia.icon(parroquia_marker.getIcon());
		parroquia.title(parroquia_marker.getTitle());
		parroquia.snippet(parroquia_marker.getSnippet());
		
		markersOptions.add(parroquia);
		cielomarkers.add(parroquia_marker);
		
		mundoE = new MarkerOptions();
		mundoE_marker = new CieloMarker();
		
		mundoE_marker.setPosition(new LatLng(19.525009,-99.231434));
		mundoE_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		mundoE_marker.setTitle("Mundo E");
		mundoE_marker.setSnippet("Blvd. Manuel Ávila Camacho No.1007 Tlalnepantla, Edo. de México");
		
		mundoE.position(mundoE_marker.getPosition());
		mundoE.icon(mundoE_marker.getIcon());
		mundoE.title(mundoE_marker.getTitle());
		mundoE.snippet(mundoE_marker.getSnippet());
		
		markersOptions.add(mundoE);
		cielomarkers.add(mundoE_marker);

		wtc = new MarkerOptions();
		wtc_marker = new CieloMarker();
		
		wtc_marker.setPosition(new LatLng(19.39593,-99.17624));
		wtc_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		wtc_marker.setTitle("WTC");
		wtc_marker.setSnippet("Montecito No.38 Col. Nápoles. Del. Benito Juárez, México, D.F");
		
		wtc.position(wtc_marker.getPosition());
		wtc.icon(wtc_marker.getIcon());
		wtc.title(wtc_marker.getTitle());
		wtc.snippet(wtc_marker.getSnippet());
		
		markersOptions.add(wtc);
		cielomarkers.add(wtc_marker);
		
		pradoNorte = new MarkerOptions();
		pradoNorte_marker = new CieloMarker();
		
		pradoNorte_marker.setPosition(new LatLng(19.427825,-99.209976));
		pradoNorte_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		pradoNorte_marker.setTitle("Prado Norte");
		pradoNorte_marker.setSnippet("Calle Prado Norte No. 372 Col. Lomas de Chapultepec. Del. Miguel Hidalgo");
		
		pradoNorte.position(pradoNorte_marker.getPosition());
		pradoNorte.icon(pradoNorte_marker.getIcon());
		pradoNorte.title(pradoNorte_marker.getTitle());
		pradoNorte.snippet(pradoNorte_marker.getSnippet());
		
		markersOptions.add(pradoNorte);
		cielomarkers.add(pradoNorte_marker);
		
		parqueTezontle = new MarkerOptions();
		parqueTezontle_marker = new CieloMarker();
		
		parqueTezontle_marker.setPosition(new LatLng(19.384636,-99.082603));
		parqueTezontle_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		parqueTezontle_marker.setTitle("Parque Tezontle");
		parqueTezontle_marker.setSnippet("Av. Canal de Tezontle No. 1512 , Col. Alfonso Ortiz Tirado. Del. Iztapalapa, D.F.");
		
		parqueTezontle.position(parqueTezontle_marker.getPosition());
		parqueTezontle.icon(parqueTezontle_marker.getIcon());
		parqueTezontle.title(parqueTezontle_marker.getTitle());
		parqueTezontle.snippet(parqueTezontle_marker.getSnippet());
		
		markersOptions.add(parqueTezontle);
		cielomarkers.add(parqueTezontle_marker);
		
		lomasVerdes = new MarkerOptions();
		lomasVerdes_marker = new CieloMarker();
		
		lomasVerdes_marker.setPosition(new LatLng(19.495237,-99.24727));
		lomasVerdes_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		lomasVerdes_marker.setTitle("Lomas Verdes");
		lomasVerdes_marker.setSnippet("Centro Comercial Gran Terraza Lomas Verdes, Calle Colina de la Paz No. 25 Naucalpan, Edo. de México.");
		
		lomasVerdes.position(lomasVerdes_marker.getPosition());
		lomasVerdes.icon(lomasVerdes_marker.getIcon());
		lomasVerdes.title(lomasVerdes_marker.getTitle());
		lomasVerdes.snippet(lomasVerdes_marker.getSnippet());
		
		markersOptions.add(lomasVerdes);
		cielomarkers.add(lomasVerdes_marker);
		
		santaFeTres = new MarkerOptions();
		santaFeTres_marker = new CieloMarker();
		
		santaFeTres_marker.setPosition(new LatLng(19.361114,-99.274263));
		santaFeTres_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		santaFeTres_marker.setTitle("Centro Comercial Santa Fe");
		santaFeTres_marker.setSnippet("Av. Vasco de Quiroga No. 3800, Centro Comercial Santa Fe. Del. Cuajimalpa. México D.F.");
		
		santaFeTres.position(santaFeTres_marker.getPosition());
		santaFeTres.icon(santaFeTres_marker.getIcon());
		santaFeTres.title(santaFeTres_marker.getTitle());
		santaFeTres.snippet(santaFeTres_marker.getSnippet());
		
		markersOptions.add(santaFeTres);
		cielomarkers.add(santaFeTres_marker);
		
		coyoacan = new MarkerOptions();
		coyoacan_marker = new CieloMarker();
		
		coyoacan_marker.setPosition(new LatLng(19.360709,-99.169464));
		coyoacan_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		coyoacan_marker.setTitle("Coyoacan");
		coyoacan_marker.setSnippet("Av. Coyoácan No. 2000, Col. Del Valle. Del. Benito Juárez. México, D.F.");
		
		coyoacan.position(coyoacan_marker.getPosition());
		coyoacan.icon(coyoacan_marker.getIcon());
		coyoacan.title(coyoacan_marker.getTitle());
		coyoacan.snippet(coyoacan_marker.getSnippet());
		
		markersOptions.add(coyoacan);
		cielomarkers.add(coyoacan_marker);
		
		reformaDos = new MarkerOptions();
		reformaDos_marker = new CieloMarker();
		
		reformaDos_marker.setPosition(new LatLng(19.434057,-99.164829));
		reformaDos_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		reformaDos_marker.setTitle("Reforma 234");
		reformaDos_marker.setSnippet("Paseo dela Reforma No. 234 Del. Cuauhtémoc, México D.F.");
		
		reformaDos.position(reformaDos_marker.getPosition());
		reformaDos.icon(reformaDos_marker.getIcon());
		reformaDos.title(reformaDos_marker.getTitle());
		reformaDos.snippet(reformaDos_marker.getSnippet());
		
		markersOptions.add(reformaDos);
		cielomarkers.add(reformaDos_marker);
		
		pabellonDelValle = new MarkerOptions();
		pabellonDelValle_marker = new CieloMarker();
		
		pabellonDelValle_marker.setPosition(new LatLng(19.373422,-99.162726));
		pabellonDelValle_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		pabellonDelValle_marker.setTitle("Pabellon del Valle");
		pabellonDelValle_marker.setSnippet("Av. Universidad No. 1000 Del. Benito Juárez, México D.F.");
		
		pabellonDelValle.position(pabellonDelValle_marker.getPosition());
		pabellonDelValle.icon(pabellonDelValle_marker.getIcon());
		pabellonDelValle.title(pabellonDelValle_marker.getTitle());
		pabellonDelValle.snippet(pabellonDelValle_marker.getSnippet());
		
		markersOptions.add(pabellonDelValle);
		cielomarkers.add(pabellonDelValle_marker);
		
		parqueDelta = new MarkerOptions();
		parqueDelta_marker = new CieloMarker();
		
		parqueDelta_marker.setPosition(new LatLng(19.403135,-99.156246));
		parqueDelta_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		parqueDelta_marker.setTitle("Parque Delta");
		parqueDelta_marker.setSnippet("Cuauhtémoc No. 462 Loc. L-221 Col. Narvarte. Del. Benito Juárez, México D.F");
		
		parqueDelta.position(parqueDelta_marker.getPosition());
		parqueDelta.icon(parqueDelta_marker.getIcon());
		parqueDelta.title(parqueDelta_marker.getTitle());
		parqueDelta.snippet(parqueDelta_marker.getSnippet());
		
		markersOptions.add(parqueDelta);
		cielomarkers.add(parqueDelta_marker);

		parqueDuraznos = new MarkerOptions();
		parqueDuraznos_marker = new CieloMarker();
		
		parqueDuraznos_marker.setPosition(new LatLng(19.40524,-99.241047));
		parqueDuraznos_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		parqueDuraznos_marker.setTitle("Parque Duraznos");
		parqueDuraznos_marker.setSnippet("Bosque de Duraznos No. 39 Esq. Bosques de Ciruelos  Loc. C-1 Col. Bosques de las Lomas. Del. Miguel Hidalgo");
		
		parqueDuraznos.position(parqueDuraznos_marker.getPosition());
		parqueDuraznos.icon(parqueDuraznos_marker.getIcon());
		parqueDuraznos.title(parqueDuraznos_marker.getTitle());
		parqueDuraznos.snippet(parqueDuraznos_marker.getSnippet());
		
		markersOptions.add(parqueDuraznos);
		cielomarkers.add(parqueDuraznos_marker);
		
		plazaUniversidad = new MarkerOptions();
		plazaUniversidad_marker = new CieloMarker();
		
		plazaUniversidad_marker.setPosition(new LatLng(19.36994,-99.167061));
		plazaUniversidad_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		plazaUniversidad_marker.setTitle("Plaza Universidad");
		plazaUniversidad_marker.setSnippet("Av. Universidad No. 1000, Col. Del Valle. Del. Benito Juárez. México D.F.");
		
		plazaUniversidad.position(plazaUniversidad_marker.getPosition());
		plazaUniversidad.icon(plazaUniversidad_marker.getIcon());
		plazaUniversidad.title(plazaUniversidad_marker.getTitle());
		plazaUniversidad.snippet(plazaUniversidad_marker.getSnippet());
		
		markersOptions.add(plazaUniversidad);
		cielomarkers.add(plazaUniversidad_marker);


		this.setCielomarkers(cielomarkers);
		return markersOptions;
			
	}
	
	
	public ArrayList<CieloMarker> getCielomarkers() {
		return cielomarkers;
	}

	public void setCielomarkers(ArrayList<CieloMarker> cielomarkers) {
		this.cielomarkers = cielomarkers;
	}
	


}
