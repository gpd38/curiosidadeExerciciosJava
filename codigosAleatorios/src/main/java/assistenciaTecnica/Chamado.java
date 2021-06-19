package assistenciaTecnica;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Chamado {

	private int numChamado;
	private String nomeCliente;
	private String cpfCliente;
	private String descricaoProblema;
	private String dataAbertura;
	private String situacaoChamado;
	private Date previsaoAtendimento;

	public int getNumChamado() {
		return numChamado;
	}

	public void setNumChamado(int numChamado) {
		this.numChamado = numChamado;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getDescricaoProblema() {
		return descricaoProblema;
	}

	public void setDescricaoProblema(String descricaoProblema) {
		this.descricaoProblema = descricaoProblema;
	}

	public String getSituacaoChamado() {
		return situacaoChamado;
	}

	public void setSituacaoChamado(String situacaoChamado) {
		this.situacaoChamado = situacaoChamado;
	}

	public Date getPrevisaoAtendimento() {
		return previsaoAtendimento;
	}

	public void setPrevisaoAtendimento(Date previsaoAtendimento) {
		this.previsaoAtendimento = previsaoAtendimento;
	}

	public void setDataAbertura() {
		Date dataAbertura = new Date();
		DateFormat formatterPT = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dataAberturaFormatada = formatterPT.format(dataAbertura);
		this.dataAbertura = dataAberturaFormatada;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

}
