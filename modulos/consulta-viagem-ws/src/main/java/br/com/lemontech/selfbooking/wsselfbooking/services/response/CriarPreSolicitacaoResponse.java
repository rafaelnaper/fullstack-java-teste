
package br.com.lemontech.selfbooking.wsselfbooking.services.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoOperacao;


/**
 * <p>Classe Java de criarPreSolicitacaoResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="criarPreSolicitacaoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="urlPreSolicitacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultadoOperacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}resultadoOperacao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "criarPreSolicitacaoResponse", propOrder = {
    "urlPreSolicitacao",
    "resultadoOperacao"
})
public class CriarPreSolicitacaoResponse {

    protected String urlPreSolicitacao;
    protected ResultadoOperacao resultadoOperacao;

    /**
     * Obt�m o valor da propriedade urlPreSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlPreSolicitacao() {
        return urlPreSolicitacao;
    }

    /**
     * Define o valor da propriedade urlPreSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlPreSolicitacao(String value) {
        this.urlPreSolicitacao = value;
    }

    /**
     * Obt�m o valor da propriedade resultadoOperacao.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoOperacao }
     *     
     */
    public ResultadoOperacao getResultadoOperacao() {
        return resultadoOperacao;
    }

    /**
     * Define o valor da propriedade resultadoOperacao.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadoOperacao }
     *     
     */
    public void setResultadoOperacao(ResultadoOperacao value) {
        this.resultadoOperacao = value;
    }

}
