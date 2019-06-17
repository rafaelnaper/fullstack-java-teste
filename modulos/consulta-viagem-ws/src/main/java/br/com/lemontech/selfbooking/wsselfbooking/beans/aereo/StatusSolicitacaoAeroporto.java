
package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de statusSolicitacaoAeroporto.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="statusSolicitacaoAeroporto">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PENDENTE"/>
 *     &lt;enumeration value="NO_SHOW"/>
 *     &lt;enumeration value="CANCELADO"/>
 *     &lt;enumeration value="FINALIZADO"/>
 *     &lt;enumeration value="TERCEIRO"/>
 *     &lt;enumeration value="SOLICITACAO_SALVA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusSolicitacaoAeroporto")
@XmlEnum
public enum StatusSolicitacaoAeroporto {

    PENDENTE,
    NO_SHOW,
    CANCELADO,
    FINALIZADO,
    TERCEIRO,
    SOLICITACAO_SALVA;

    public String value() {
        return name();
    }

    public static StatusSolicitacaoAeroporto fromValue(String v) {
        return valueOf(v);
    }

}
