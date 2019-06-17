
package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de baseAtendimento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="baseAtendimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idBaseAtendimento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="atendimentoTerceiro" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="informacoes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="dataCadastro" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseAtendimento", propOrder = {
    "idBaseAtendimento",
    "atendimentoTerceiro",
    "email",
    "informacoes",
    "ativo",
    "dataCadastro"
})
public class BaseAtendimento {

    protected Integer idBaseAtendimento;
    protected Boolean atendimentoTerceiro;
    protected String email;
    protected String informacoes;
    protected Boolean ativo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCadastro;

    /**
     * Obt�m o valor da propriedade idBaseAtendimento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdBaseAtendimento() {
        return idBaseAtendimento;
    }

    /**
     * Define o valor da propriedade idBaseAtendimento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdBaseAtendimento(Integer value) {
        this.idBaseAtendimento = value;
    }

    /**
     * Obt�m o valor da propriedade atendimentoTerceiro.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAtendimentoTerceiro() {
        return atendimentoTerceiro;
    }

    /**
     * Define o valor da propriedade atendimentoTerceiro.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAtendimentoTerceiro(Boolean value) {
        this.atendimentoTerceiro = value;
    }

    /**
     * Obt�m o valor da propriedade email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o valor da propriedade email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obt�m o valor da propriedade informacoes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformacoes() {
        return informacoes;
    }

    /**
     * Define o valor da propriedade informacoes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformacoes(String value) {
        this.informacoes = value;
    }

    /**
     * Obt�m o valor da propriedade ativo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAtivo() {
        return ativo;
    }

    /**
     * Define o valor da propriedade ativo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAtivo(Boolean value) {
        this.ativo = value;
    }

    /**
     * Obt�m o valor da propriedade dataCadastro.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCadastro() {
        return dataCadastro;
    }

    /**
     * Define o valor da propriedade dataCadastro.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCadastro(XMLGregorianCalendar value) {
        this.dataCadastro = value;
    }

}
