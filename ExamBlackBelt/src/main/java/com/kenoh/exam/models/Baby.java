package com.kenoh.exam.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="babys")
public class Baby {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message="Name must not be blank")
	@Size(min = 2, max=30, message="Name must be greater than 2 characters")
	private String name;
	
	@NotNull(message="Gender must not be blank")
	@Size(min = 2, max=30, message="Gender must be greater than 2 characters")
	private String gender;
	
	@NotNull(message="Origin must not be blank")
	@Size(min = 2, max=30, message="Origin must be greater than 2 characters")
	private String origin;
	
	@NotNull(message="Meaning must not be blank")
	@Size(min = 2, max=300, message="Meaning must be greater than 2 characters")
	private String meaning;
	
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }

//	MANY TO ONE
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="provider_id")
    private User provider;
    
//	MANY TO MANY
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
    		name="votes",
    		joinColumns = @JoinColumn(name = "baby_id"),
    		inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> votedUsers;
    
//  CONSTRUCTOR
    
	public Baby() {}

//	GETTER AND SETTERS
	
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public User getProvider() {
		return provider;
	}

	public void setProvider(User provider) {
		this.provider = provider;
	}

	public List<User> getVotedUsers() {
		return votedUsers;
	}

	public void setVotedUsers(List<User> votedUsers) {
		this.votedUsers = votedUsers;
	}
	
}
