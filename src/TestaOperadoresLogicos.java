public class TestaOperadoresLogicos {

    public static boolean metodo(String msg){
        System.out.println(msg);
        return true;
    }
    public static void main(String[] args){
        // Testando operandores lógicos 

        System.out.println(1 == 1 & 1 > 2); //false
        System.out.println(1==1 | 1 > 2); // true

        //ou exclusivo " ^ " - se as duas comparacoes forem verdadeira retorna false; se uma operacao for verdadeira e o ou exclusivo for false, retorna true - vice versa

        System.out.println(1==1 ^ 2 > 1); //retorna false por conta do ou exclusivo " ^ ", ambas as comparacoes sao verdadeiras
        System.out.println(1>2 ^ 1==1); //retorna true

        //pegando um resultado true e transformando em false
        // Operador negação " ! "
        System.out.println(!(1==1)); // eu peguei um resultado true e transformei em false " ! " - retorna false 

        /*Short Circuit
         * Este é o famoso &&, || - serve para avalicar uma determinada comparacao, se nao for suficiente, o short circuit && || avalia a segunda comparacao
         * Sem o Short Circuit & |, ele avalia automaticamente os dois lados antes de retornar true ou false 
         */
        System.out.println(1 != 1 && 1 > 2);  
        // false, o segundo termo não é avaliado.

        System.out.println(1 == 1 || 2 > 1);  
        // true, o segundo termo não é avaliado.




        System.out.println(1==1 && metodo("primeiro")); // 1 é igual a 1, entao ele nem preciso executar o valor que passei na funcao - retorna true
        System.out.println(1!=1 && metodo("segundo")); // 1 nao é diferente de 1, entao ai ele ja retorna false
        System.out.println(1==1 || metodo("terceiro")); // retorna true

        System.out.println(1 == 2 && metodo("tchau")); 
        // não imprime tchau, imprime false direto

        int i = 10;
        System.out.println(i == 2 & i++ == 0); 
        // imprime false, soma mesmo assim pois está sem o short circuit && || 
        System.out.println(i); 
        // imprime 11
    
        int j = 10;
        System.out.println(j == 2 && j++ == 0); 
        // imprime false, não soma
        System.out.println(j); 
        // imprime 10
        


      
    }
}
