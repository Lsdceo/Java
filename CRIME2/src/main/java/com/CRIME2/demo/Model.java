package com.CRIME2.demo;

import java.util.Date;

import com.CRIME2.demo.dto.crimeDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "crime")
@AllArgsConstructor
@NoArgsConstructor
public class Model {

	 @Id @GeneratedValue(strategy = GenerationType.AUTO)
	    private int id;

	    private String nomeC;
	    private int nc;
	    private String local;
	    private Date data;
	    private String descricao;

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getNomeC() {
	        return nomeC;
	    }

	    public void setNomeC(String nomeC) {
	        this.nomeC = nomeC;
	    }

	    public int getNc() {
	        return nc;
	    }

	    public void setNc(int nc) {
	        this.nc = nc;
	    }

	    public String getLocal() {
	        return local;
	    }

	    public void setLocal(String local) {
	        this.local = local;
	    }

	    public Date getData() {
	        return data;
	    }

	    public void setData(Date data) {
	        this.data = data;
	    }

	    public String getDescricao() {
	        return descricao;
	    }

	    public void setDescricao(String descricao) {
	        this.descricao = descricao;
	    }

	public Model(crimeDTO DTO) {
		this.nomeC = DTO.nomeC();
		this.nc = DTO.nc();
		this.local = DTO.local();
		this.data = DTO.data();
		this.descricao = DTO.descricao();
	}
}
