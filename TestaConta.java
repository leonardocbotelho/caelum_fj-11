class TestaConta {
  public static void main(String[] args) {

    Conta conta1 = new Conta();

    Data data = new Data();
    data.ano = 2017;
    data.mes = 11;
    data.dia = 01;

    conta1.titular        = "Hugo";
    conta1.numero         = 123;
    conta1.agencia        = "45678-9";
    conta1.saldo          = 50.0;
    conta1.dataDeAbertura = data;

    conta1.deposita(100.0);
    System.out.println(conta1.recuperaDadosParaImpressao());

  }
}
