package com.alexandrefreitas.rest.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COT_POSICAO_NOTA_HISTORICO")
public class PosicaoNotaHistoricoCot  implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private Integer id_nota;
	
	@Column(name = "DT_POSICAO")
	private Date posicaodt;
	
	private String cd_cotista;
	
	@Column(name = "CD_FUNDO")
	private String cdfundo;
	
	private Date dt_aplicacao;
	private BigDecimal vl_aplicacao;
	private BigDecimal qt_cotas;
	private BigDecimal vl_bruto;
	private BigDecimal vl_ir;
	private BigDecimal vl_iof;
	private BigDecimal vl_resgate;

	public PosicaoNotaHistoricoCot() {
		
	}

	public PosicaoNotaHistoricoCot(Integer id_nota, Date posicaodt, String cd_cotista, String cdfundo,
			Date dt_aplicacao, BigDecimal vl_aplicacao, BigDecimal qt_cotas, BigDecimal vl_bruto, BigDecimal vl_ir,
			BigDecimal vl_iof, BigDecimal vl_resgate) {
		super();
		this.id_nota = id_nota;
		this.posicaodt = posicaodt;
		this.cd_cotista = cd_cotista;
		this.cdfundo = cdfundo;
		this.dt_aplicacao = dt_aplicacao;
		this.vl_aplicacao = vl_aplicacao;
		this.qt_cotas = qt_cotas;
		this.vl_bruto = vl_bruto;
		this.vl_ir = vl_ir;
		this.vl_iof = vl_iof;
		this.vl_resgate = vl_resgate;
	}

	public Integer getId_nota() {
		return id_nota;
	}

	public void setId_nota(Integer id_nota) {
		this.id_nota = id_nota;
	}

	public Date getDt_posicao() {
		return posicaodt;
	}

	public void setDt_posicao(Date posicaodt) {
		this.posicaodt = posicaodt;
	}

	public String getCd_cotista() {
		return cd_cotista;
	}

	public void setCd_cotista(String cd_cotista) {
		this.cd_cotista = cd_cotista;
	}

	public String getCdfundo() {
		return cdfundo;
	}

	public void setCdfundo(String cdfundo) {
		this.cdfundo = cdfundo;
	}

	public Date getDt_aplicacao() {
		return dt_aplicacao;
	}

	public void setDt_aplicacao(Date dt_aplicacao) {
		this.dt_aplicacao = dt_aplicacao;
	}

	public BigDecimal getVl_aplicacao() {
		return vl_aplicacao;
	}

	public void setVl_aplicacao(BigDecimal vl_aplicacao) {
		this.vl_aplicacao = vl_aplicacao;
	}

	public BigDecimal getQt_cotas() {
		return qt_cotas;
	}

	public void setQt_cotas(BigDecimal qt_cotas) {
		this.qt_cotas = qt_cotas;
	}

	public BigDecimal getVl_bruto() {
		return vl_bruto;
	}

	public void setVl_bruto(BigDecimal vl_bruto) {
		this.vl_bruto = vl_bruto;
	}

	public BigDecimal getVl_ir() {
		return vl_ir;
	}

	public void setVl_ir(BigDecimal vl_ir) {
		this.vl_ir = vl_ir;
	}

	public BigDecimal getVl_iof() {
		return vl_iof;
	}

	public void setVl_iof(BigDecimal vl_iof) {
		this.vl_iof = vl_iof;
	}

	public BigDecimal getVl_resgate() {
		return vl_resgate;
	}

	public void setVl_resgate(BigDecimal vl_resgate) {
		this.vl_resgate = vl_resgate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
