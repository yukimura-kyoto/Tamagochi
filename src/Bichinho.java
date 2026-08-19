public class Bichinho {

    private String nome;
    private int fome;
    private int energia;
    private String humor;

    public Bichinho(String nome){
        this.nome = nome;
        energia = 50;
        fome = 50;
        humor = "normal";
    }

    public Bichinho(String nome, int fome, int energia, String humor) {
        this.nome = nome;
        this.fome = fome;
        this.energia = energia;
        this.humor = humor;
    }

    public String getHumor(){

        int x = energia-fome;

        if (x >75){
          return   humor = "Muito Feliz";
        }else if (x>50){
            return   humor = "Feliz";
        }else if (x>=0){
            return  humor = "Normal";
        }else if (x>-30){
            return humor = "Cansado";
        }else{
            return  humor = "Triste";
        }    }

//        if (fome == 0 ){
//            System.out.println("saciado");
//        }else if (fome == 100){
//            System.out.println("faminto");
//        }else {
//            System.out.println("fome normal");
//        }
//
//        if (energia == 0){
//            System.out.println("esgotado");
//        }else if (energia == 100){
//            System.out.println("totalmente pilhado");
//        }else {
//            System.out.println("energia normal");
//        }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        if (fome >= 0 && fome <= 100){
            this.fome = fome;
        }else {
            System.out.println("Invalido");
        }
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if (energia >= 0 && energia<=100){
            this.energia = energia;
        }else {
            System.out.println("Invalido");
        }
    }

    @Override
    public String toString() {
        return "Bichinho{" +
                "nome='" + nome + '\'' +
                ", fome=" + fome +
                ", energia=" + energia + getHumor()+
                ", humor='" + humor + '\'' +
                '}';
    }
}
