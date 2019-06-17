
package br.com.lemontech.selfbooking.wsselfbooking.beans.expense;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de formaPagamentoPrestacaoContaItem.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="formaPagamentoPrestacaoContaItem">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DINHEIRO"/>
 *     &lt;enumeration value="CARTAO_CREDITO"/>
 *     &lt;enumeration value="CARTAO_DEBITO"/>
 *     &lt;enumeration value="CARTAO_CORPORATIVO"/>
 *     &lt;enumeration value="FATURADO"/>
 *     &lt;enumeration value="CARTAO_RENDIMENTO"/>
 *     &lt;enumeration value="RECURSO_PROPRIO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "formaPagamentoPrestacaoContaItem")
@XmlEnum
public enum FormaPagamentoPrestacaoContaItem {

    DINHEIRO,
    CARTAO_CREDITO,
    CARTAO_DEBITO,
    CARTAO_CORPORATIVO,
    FATURADO,
    CARTAO_RENDIMENTO,
    RECURSO_PROPRIO;

    public String value() {
        return name();
    }

    public static FormaPagamentoPrestacaoContaItem fromValue(String v) {
        return valueOf(v);
    }

}
