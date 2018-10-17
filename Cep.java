package br.metodista.dp.proxy;
import java.util.List;
/**
 *ANÁLISE E DESENVOLVIMENTO DE SISTEMAS - Polo Mauá
 * Modulo: Desenvolvimento Avançado
 * Tópico Avançado em Programação II
 * Padrão de projeto de Estrutura:Proxy
 * Prof: Rafael Guimarães Sakurai
 * @author Jandre Modesto da Silva Filho - matrícula 251532
 *  30/08/2018 - quinta
 */
public interface Cep {
    
    public String consultar(String cep, String usuario);
    
    public List<Acesso> getAcessos(String usuario);
}
