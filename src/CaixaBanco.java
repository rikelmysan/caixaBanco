public class CaixaBanco {
    private String usuarioLogado;
    private Boolean logado = false;
    private Double saldo;
    private String cpf;
    private String senha;

    public Boolean verificaLogin(String cpf, String nomeDeUsuario) {
        if (logado) {
            if (this.cpf == cpf) {
                return true;
            }
            else {
                logado=true;
                this.cpf = cpf;
                this.senha = senha;
                this.usuarioLogado=nomeDeUsuario;
                return true;
            }
        }

        logado=true;
        this.cpf = cpf;
        this.senha = senha;
        this.usuarioLogado=nomeDeUsuario;

        return true;
    }
    public void logar(String cpf, String senha, String nomeDeUsuario) {
        verificaLogin(cpf, nomeDeUsuario);
        System.out.printf("usuario logado: %s", this.usuarioLogado);

    }
}