class Conta {
  String titular;
  String agencia;
  int numero;
  double saldo;
  Data dataDeAbertura;

  boolean saca(double valor) {
    if (valor <= saldo) {
      saldo -= valor;
      return true;
    }
    return false;
  }

  void deposita(double valor) {
    saldo += valor;
  }

  double calculaRendimento() {
    return saldo *= 0.1;
  }

  String recuperaDadosParaImpressao() {
    String dados;
    dados = "Titular: " + titular;
    dados += "\nAgência: " + agencia;
    dados += "\nNúmero: " + numero;
    dados += "\nSaldo Atual: " + saldo;
    dados += "\nData de Abertura: " + dataDeAbertura.formatada();
    return dados;
  }

}
