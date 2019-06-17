
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de parametrizacoesEspecificas complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="parametrizacoesEspecificas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parametrizacoesSolicitacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacoesSolicitacao" minOccurs="0"/>
 *         &lt;element name="parametrizacoesAprovacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacoesAprovacao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrizacoesEspecificas", propOrder = {
    "parametrizacoesSolicitacao",
    "parametrizacoesAprovacao"
})
public class ParametrizacoesEspecificas {

    protected ParametrizacoesSolicitacao parametrizacoesSolicitacao;
    protected ParametrizacoesAprovacao parametrizacoesAprovacao;

    /**
     * Obt�m o valor da propriedade parametrizacoesSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacoesSolicitacao }
     *     
     */
    public ParametrizacoesSolicitacao getParametrizacoesSolicitacao() {
        return parametrizacoesSolicitacao;
    }

    /**
     * Define o valor da propriedade parametrizacoesSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacoesSolicitacao }
     *     
     */
    public void setParametrizacoesSolicitacao(ParametrizacoesSolicitacao value) {
        this.parametrizacoesSolicitacao = value;
    }

    /**
     * Obt�m o valor da propriedade parametrizacoesAprovacao.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacoesAprovacao }
     *     
     */
    public ParametrizacoesAprovacao getParametrizacoesAprovacao() {
        return parametrizacoesAprovacao;
    }

    /**
     * Define o valor da propriedade parametrizacoesAprovacao.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacoesAprovacao }
     *     
     */
    public void setParametrizacoesAprovacao(ParametrizacoesAprovacao value) {
        this.parametrizacoesAprovacao = value;
    }

}
