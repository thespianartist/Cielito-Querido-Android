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
	public 	MarkerOptions alamedaDos;
	
	public 	CieloMarker torreMapre_marker; 
	public 	CieloMarker rioLerma_marker; 
	public  CieloMarker homero_marker; 
	public 	CieloMarker lasAmericas_marker;
	public 	CieloMarker insurgentes_marker;
	public 	CieloMarker santaFe_marker;
	public 	CieloMarker genova_marker;
	public 	CieloMarker alameda_marker;
	public 	CieloMarker alamedaDos_marker;
	
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
		santaFe_marker.setTitle("Cd. Santa Fe");
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
