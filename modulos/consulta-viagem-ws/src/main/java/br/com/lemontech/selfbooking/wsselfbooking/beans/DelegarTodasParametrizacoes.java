
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoParametrizacao;


/**
 * <p>Classe Java de delegarTodasParametrizacoes complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="delegarTodasParametrizacoes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoParametrizacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoParametrizacao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delegarTodasParametrizacoes", propOrder = {
    "tipoParametrizacao"
})
public class DelegarTodasParametrizacoes {

    @XmlSchemaType(name = "string")
    protected TipoParametrizacao tipoParametrizacao;

    /**
     * Obtém o valor da propriedade tipoParametrizacao.
     * 
     * @return
     *     possible object is
     *     {@link TipoParametrizacao }
     *     
     */
    public TipoParametrizacao getTipoParametrizacao() {
        return tipoParametrizacao;
    }

    /**
     * Define o valor da propriedade tipoParametrizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoParametrizacao }
     *     
     */
    public void setTipoParametrizacao(TipoParametrizacao value) {
        this.tipoParametrizacao = value;
    }

}
