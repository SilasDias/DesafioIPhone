import model.IPhone;

public class IPhoneApplication {
    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();

        // Testando Reprodutor Musical
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica("Bohemian Rhapsody - Queen");

        // Testando Aparelho Telefônico
        meuIPhone.ligar("11999998888");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Testando Navegador Internet
        meuIPhone.exibirPagina("https://www.dio.me");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
