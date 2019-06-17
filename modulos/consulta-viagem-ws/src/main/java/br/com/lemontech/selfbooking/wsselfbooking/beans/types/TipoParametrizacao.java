
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoParametrizacao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoParametrizacao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SOLICITACAO"/>
 *     &lt;enumeration value="APROVACAO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoParametrizacao")
@XmlEnum
public enum TipoParametrizacao {

    SOLICITACAO,
    APROVACAO;

    public String value() {
        return name();
    }

    public static TipoParametrizacao fromValue(String v) {
        return valueOf(v);
    }

}
