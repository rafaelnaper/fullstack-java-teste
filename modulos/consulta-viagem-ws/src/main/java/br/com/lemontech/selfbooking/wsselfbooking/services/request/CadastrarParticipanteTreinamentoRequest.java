
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cadastrarParticipanteTreinamentoRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cadastrarParticipanteTreinamentoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoTreinamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="desviaPoliticaAereo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="desviaPoliticaHotel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="desviaPoliticaCarro" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarParticipanteTreinamentoRequest", propOrder = {
    "matricula",
    "codigoTreinamento",
    "desviaPoliticaAereo",
    "desviaPoliticaHotel",
    "desviaPoliticaCarro",
    "pais",
    "uf",
    "cidade",
    "iata"
})
public class CadastrarParticipanteTreinamentoRequest {

    @XmlElement(required = true)
    protected String matricula;
    @XmlElement(required = true)
    protected String codigoTreinamento;
    protected boolean desviaPoliticaAereo;
    protected boolean desviaPoliticaHotel;
    protected boolean desviaPoliticaCarro;
    @XmlElement(required = true)
    protected String pais;
    @XmlElement(required = true)
    protected String uf;
    protected String cidade;
    protected String iata;

    /**
     * Obt�m o valor da propriedade matricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Define o valor da propriedade matricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
    }

    /**
     * Obt�m o valor da propriedade codigoTreinamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTreinamento() {
        return codigoTreinamento;
    }

    /**
     * Define o valor da propriedade codigoTreinamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTreinamento(String value) {
        this.codigoTreinamento = value;
    }

    /**
     * Obt�m o valor da propriedade desviaPoliticaAereo.
     * 
     */
    public boolean isDesviaPoliticaAereo() {
        return desviaPoliticaAereo;
    }

    /**
     * Define o valor da propriedade desviaPoliticaAereo.
     * 
     */
    public void setDesviaPoliticaAereo(boolean value) {
        this.desviaPoliticaAereo = value;
    }

    /**
     * Obt�m o valor da propriedade desviaPoliticaHotel.
     * 
     */
    public boolean isDesviaPoliticaHotel() {
        return desviaPoliticaHotel;
    }

    /**
     * Define o valor da propriedade desviaPoliticaHotel.
     * 
     */
    public void setDesviaPoliticaHotel(boolean value) {
        this.desviaPoliticaHotel = value;
    }

    /**
     * Obt�m o valor da propriedade desviaPoliticaCarro.
     * 
     */
    public boolean isDesviaPoliticaCarro() {
        return desviaPoliticaCarro;
    }

    /**
     * Define o valor da propriedade desviaPoliticaCarro.
     * 
     */
    public void setDesviaPoliticaCarro(boolean value) {
        this.desviaPoliticaCarro = value;
    }

    /**
     * Obt�m o valor da propriedade pais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Define o valor da propriedade pais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Obt�m o valor da propriedade uf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUf() {
        return uf;
    }

    /**
     * Define o valor da propriedade uf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUf(String value) {
        this.uf = value;
    }

    /**
     * Obt�m o valor da propriedade cidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Define o valor da propriedade cidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidade(String value) {
        this.cidade = value;
    }

    /**
     * Obt�m o valor da propriedade iata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIata() {
        return iata;
    }

    /**
     * Define o valor da propriedade iata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIata(String value) {
        this.iata = value;
    }

}
