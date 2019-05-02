package edu.fundup.entites;

/**
 * @author jsaoudi
 *
 */
public class Animaux{
	private String nom;
	private Etat etat;
	private double montant;
	private int iduser;
	private String photo;
	private String video;
	private int idcat;

	

	public Animaux(String nom, Etat etat, double montant, int iduser, String photo, String video, int idcat) {
		this.nom = nom;
		this.etat = etat;
		this.montant = montant;
		this.iduser = iduser;
		this.photo = photo;
		this.video = video;
		this.idcat = idcat;
	}

	public String getNom(){
		return nom;
	}

	public void setNom(String nom){
		this.nom=nom;
	}

	public Etat getEtat(){
		return etat;
	}

	public void setEtat(Etat etat){
		this.etat=etat;
	}

	public double getMontant(){
		return montant;
	}

	public void setMontant(double montant){
		this.montant=montant;
	}

	public int getIduser(){
		return iduser;
	}

	public void setIduser(int iduser){
		this.iduser=iduser;
	}

	public String getPhoto(){
		return photo;
	}

	public void setPhoto(String photo){
		this.photo=photo;
	}

	public String getVideo(){
		return video;
	}

	public void setVideo(String video){
		this.video=video;
	}

	public int getIdcat(){
		return idcat;
	}

	public void setIdcat(int idcat){
		this.idcat=idcat;
	}
	
	
    
}
