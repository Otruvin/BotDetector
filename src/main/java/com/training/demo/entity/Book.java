package com.training.demo.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String author;
	private Double coast;
	
	public Book(){
	}

	public Book(Long id, String name, String author, Double coast) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.coast = coast;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Double getCoast() {
		return coast;
	}

	public void setCoast(Double coast) {
		this.coast = coast;
	}

	@Override
	public int hashCode() {
		
		int hash = 7;
		
		hash = 79 * hash + Objects.hashCode(this.id);
		hash = 79 * hash + Objects.hashCode(this.name);
		hash = 79 * hash + Objects.hashCode(this.author);
		hash = 79 * hash + Objects.hashCode(this.coast);
		
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		final Book other = (Book) obj;
		
		if (!Objects.equals(this.name, other.name)) {
			return false;
		}
		if ( this.coast != other.coast) {
			return false;
		}
		if (!Objects.equals(this.author, other.author)) {
			return false;
		}
		
		return Objects.equals(this.id, this.id);
	}
	
	

}
