public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.selecionarMusica("The Less I Know The Better");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("1199999-9999");
        iphone.atender();
        iphone.desligar();

        iphone.exibirPagina("https://www.dio.me");
        iphone.adicionarNovaAba();
        iphone.fecharAba();
        iphone.atualizarPagina();
    }
}
