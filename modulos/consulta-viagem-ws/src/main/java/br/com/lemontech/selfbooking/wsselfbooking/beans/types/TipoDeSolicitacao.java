
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoDeSolicitacao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoDeSolicitacao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TODOS"/>
 *     &lt;enumeration value="CORPORATIVO"/>
 *     &lt;enumeration value="EXPENSE"/>
 *     &lt;enumeration value="INCENTIVO"/>
 *     &lt;enumeration value="TREINAMENTO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoDeSolicitacao")
@XmlEnum
public enum TipoDeSolicitacao {

    TODOS,
    CORPORATIVO,
    EXPENSE,
    INCENTIVO,
    TREINAMENTO;

    public String value() {
        return name();
    }

    public static TipoDeSolicitacao fromValue(String v) {
        return valueOf(v);
    }

}
