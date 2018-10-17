package br.metodista.dp.proxy;
import  java.util.List;
/**
 *ANÁLISE E DESENVOLVIMENTO DE SISTEMAS - Polo Mauá
 * Modulo: Desenvolvimento Avançado
 * Tópico Avançado em Programação II
 * Padrão de projeto de Estrutura:Proxy
 * Prof: Rafael Guimarães Sakurai
 * @author Jandre Modesto da Silva Filho - matrícula 251532
 *  30/08/2018 - quinta
 */
public class ClienteCep {
    
    public static void main(String[] args) {
        Cep cep = new ProxyCep();
        System.out.println(cep.consultar("65900630", "Jandre"));
        System.out.println(cep.consultar("09360010", "Jandre"));
        System.out.println(cep.consultar("13010219", "Jandre"));
   
        
        List<Acesso> acessos =  cep.getAcessos("Jandre");
        System.out.println("Quantidade de acessos do Sakurai " + 
                            acessos.size());
        System.out.println(acessos);
    }
}
