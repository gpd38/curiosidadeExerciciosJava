package assistenciaTecnica;

public class Chamado {

	private int numChamado;
	private String nomeCliente;
	private String cpfCliente;
	private String descricaoProblema;
	private String solucaoProblema;
	private String situacaoChamado;
	private String dataAbertura;
	private String previsaoAtendimento;
	private String dataAtendimento;
	private String cpfFuncionario;

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

	public String getSolucaoProblema() {
		return solucaoProblema;
	}

	public void setSolucaoProblema(String solucaoProblema) {
		this.solucaoProblema = solucaoProblema;
	}

	public String getSituacaoChamado() {
		return situacaoChamado;
	}

	public void setSituacaoChamado(String situacaoChamado) {
		this.situacaoChamado = situacaoChamado;
	}

	public String getPrevisaoAtendimento() {
		return previsaoAtendimento;
	}

	public void setPrevisaoAtendimento(String previsaoAtendimento) {
		this.previsaoAtendimento = previsaoAtendimento;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public String getDataAtendimento() {
		return dataAtendimento;
	}

	public void setDataAtendimento(String dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}

	public String getCpfFuncionario() {
		return cpfFuncionario;
	}

	public void setCpfFuncionario(String cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}

}
