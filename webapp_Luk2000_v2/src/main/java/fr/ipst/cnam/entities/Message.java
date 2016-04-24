package fr.ipst.cnam.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the message database table.
 * 
 */
@Entity
@Table(name="message")
@NamedQuery(name="Message.findAll", query="SELECT m FROM Message m")
public class Message implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String contenu;

	@Temporal(TemporalType.DATE)
	@Column(name="date_envoi")
	private Date dateEnvoi;

	@Column(name="id_oc")
	private int idOc;

	@Column(name="id_service_emetteur")
	private int idServiceEmetteur;

	private byte lu;

	private String optionAB;

	private String titre;

	public Message() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContenu() {
		return this.contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public Date getDateEnvoi() {
		return this.dateEnvoi;
	}

	public void setDateEnvoi(Date dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}

	public int getIdOc() {
		return this.idOc;
	}

	public void setIdOc(int idOc) {
		this.idOc = idOc;
	}

	public int getIdServiceEmetteur() {
		return this.idServiceEmetteur;
	}

	public void setIdServiceEmetteur(int idServiceEmetteur) {
		this.idServiceEmetteur = idServiceEmetteur;
	}

	public byte getLu() {
		return this.lu;
	}

	public void setLu(byte lu) {
		this.lu = lu;
	}

	public String getOptionAB() {
		return this.optionAB;
	}

	public void setOptionAB(String optionAB) {
		this.optionAB = optionAB;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

}