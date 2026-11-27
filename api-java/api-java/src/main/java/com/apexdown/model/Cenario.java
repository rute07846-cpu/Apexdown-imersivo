package com.apexdown.model;
import jakarta.persistence.*;
@Entity
public class Cenario {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  private String urlModelo3d;
  public Long getId(){return id;} public void setId(Long id){this.id=id;}
  public String getNome(){return nome;} public void setNome(String nome){this.nome=nome;}
  public String getUrlModelo3d(){return urlModelo3d;} public void setUrlModelo3d(String url){this.urlModelo3d=url;}
}