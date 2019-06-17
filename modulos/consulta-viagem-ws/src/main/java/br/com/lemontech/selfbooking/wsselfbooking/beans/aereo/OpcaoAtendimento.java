
package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de opcaoAtendimento.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="opcaoAtendimento">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PADRAO"/>
 *     &lt;enumeration value="VIP"/>
 *     &lt;enumeration value="EXTRA_ATENDIMENTO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "opcaoAtendimento")
@XmlEnum
public enum OpcaoAtendimento {

    PADRAO,
    VIP,
    EXTRA_ATENDIMENTO;

    public String value() {
        return name();
    }

    public static OpcaoAtendimento fromValue(String v) {
        return valueOf(v);
    }

}
