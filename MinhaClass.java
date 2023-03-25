public class MinhaClass{

    public static void main(String[] args) {
    
        String primeiroNome = "Joao";
        String segundoNome= "Roberto";
        
        String nomeCompleto = nomeCompleo(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    } 
     
    public static String nomeCompleo (String primeiroNome, String segundoNome ){
return "Resultado do Metodo" +  primeiroNome.concat(" ").concat(segundoNome);
  }

}    


