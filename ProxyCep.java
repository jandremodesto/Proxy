package br.metodista.dp.proxy;
import  java.util.*;
/**
 *ANÁLISE E DESENVOLVIMENTO DE SISTEMAS - Polo Mauá
 * Modulo: Desenvolvimento Avançado
 * Tópico Avançado em Programação II
 * Padrão de projeto de Estrutura:Proxy
 * Prof: Rafael Guimarães Sakurai
 * @author Jandre Modesto da Silva Filho - matrícula 251532
 *  30/08/2018 - quinta
 */
public class ProxyCep implements Cep {
    //Mapa contendo <CEP e ENDEREÇO>
    private static final Map<String, String> ceps = new HashMap();
    static{//Poderia consultar um banco de dados
        ceps.put("08410160", "Rua Serra do Mar, 58, Guaianazes, São Paulo");
        ceps.put("08735050", "Praça Gertrudes da Conceição Cabral, 137"+
                          " – Vila Nancy ‐Mogi das Cruzes ‐ São Paulo");
        ceps.put("09360010", "Rua Onze de Junho, 166 "+
                          "‐ Jd. Pilar – Mauá – São Paulo");
        ceps.put("11060000", "Av. Ana Costa, 148 ‐ "+
                          "Vila Matias ‐ Santos ‐ São Paulo");
        ceps.put("13010219", "Rua Dr. Delfino Cintra, 100 "+
                          "‐ Vila Itapura, Campinas ‐ SãoPaulo");
        ceps.put("65900630", "Rua João Lisboa, nº 225 "+
                         "‐ Centro ‐ Imperatriz ‐ Maranhão");
    }
    //Mapar contendo <Usuario, Lista de Acessos>
    private static final Map <String, List<Acesso>> acessos = new HashMap();
    @Override
    public List<Acesso> getAcessos(String usuario){
        return acessos.get(usuario);
    }
    @Override
    public String consultar(String cep, String usuario) {
        String endereco = ceps.get(cep);
            if(endereco != null){
                List<Acesso> listaAcessos = acessos.get(usuario);
                if(listaAcessos == null){
                    listaAcessos  = new ArrayList();
                    acessos.put(usuario, listaAcessos);
                }
                listaAcessos.add(new Acesso(usuario,cep,new Date()));
                return endereco;
            }
        return "Seu CEP não foi encontrado";
    }
}
