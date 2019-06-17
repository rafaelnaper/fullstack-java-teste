
package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoAtendimentoAeroporto.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoAtendimentoAeroporto">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EMBARQUE"/>
 *     &lt;enumeration value="DESEMBARQUE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoAtendimentoAeroporto")
@XmlEnum
public enum TipoAtendimentoAeroporto {

    EMBARQUE,
    DESEMBARQUE;

    public String value() {
        return name();
    }

    public static TipoAtendimentoAeroporto fromValue(String v) {
        return valueOf(v);
    }

}
