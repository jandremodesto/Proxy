package br.metodista.dp.proxy;
import java.text.*;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *ANÁLISE E DESENVOLVIMENTO DE SISTEMAS - Polo Mauá
 * Modulo: Desenvolvimento Avançado
 * Tópico Avançado em Programação II
 * Padrão de projeto de Estrutura:Proxy
 * Prof: Rafael Guimarães Sakurai
 * @author Jandre Modesto da Silva Filho - matrícula 251532
 *  30/08/2018 - quinta
 */
public class Acesso  {
    private final String usuario;
    private final String cep;
    private final Date data;
    private static final DateFormat df = new SimpleDateFormat(
                                         "dd/MM/yyyy HH:mm:ss");
    
    public Acesso(String usuario, String cep,Date data ){
        this.usuario = usuario;
        this.cep = cep;
        this.data = data;
    }
    @Override
    public String toString() {
        return "Acesso\n{" + "usuario=" + usuario + ", cep=" + cep 
                +",data=" + df.format(data) + '}';
    }
}
