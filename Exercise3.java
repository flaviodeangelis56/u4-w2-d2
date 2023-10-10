public class Exercise3 {
    public static void main(String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();

        rubrica.inserisciContatto("Goku", "3883421234");
        rubrica.inserisciContatto("Vegeta", "3884567321");
        rubrica.inserisciContatto("Ghoan", "3880985674");

        rubrica.stampaRubrica();

        String nomeCercato = "Vegeta";
        String telefonoTrovato = rubrica.cercaTelefonoPerNome(nomeCercato);
        System.out.println("Telefono di " + nomeCercato + ": " + telefonoTrovato);

        String telefonoCercato = "3884567321";
        String nomeTrovato = rubrica.cercaConNumero(telefonoCercato);
        System.out.println("Nome con telefono " + telefonoCercato + ": " + nomeTrovato);

        rubrica.cancellaContatto("Ghoan");

        rubrica.stampaRubrica();

    }

    public void aggiungiUnContatto(String nome, String numeroDiTelefono) {


    }
}
