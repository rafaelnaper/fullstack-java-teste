
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de cadastrarTreinamentoRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cadastrarTreinamentoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="codigoTreinamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoTurma" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoRegional" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoCentroDeCusto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoSubCentroDeCusto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoRegionalContaContabil" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoContaContabil" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dataFim" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endereco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarTreinamentoRequest", propOrder = {
    "ativo",
    "codigoTreinamento",
    "descricao",
    "codigoTurma",
    "codigoRegional",
    "codigoCentroDeCusto",
    "codigoSubCentroDeCusto",
    "codigoRegionalContaContabil",
    "codigoContaContabil",
    "dataInicio",
    "dataFim",
    "pais",
    "uf",
    "cidade",
    "iata",
    "endereco"
})
public class CadastrarTreinamentoRequest {

    protected boolean ativo;
    @XmlElement(required = true)
    protected String codigoTreinamento;
    protected String descricao;
    @XmlElement(required = true)
    protected String codigoTurma;
    @XmlElement(required = true)
    protected String codigoRegional;
    @XmlElement(required = true)
    protected String codigoCentroDeCusto;
    protected String codigoSubCentroDeCusto;
    @XmlElement(required = true)
    protected String codigoRegionalContaContabil;
    @XmlElement(required = true)
    protected String codigoContaContabil;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInicio;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFim;
    protected String pais;
    protected String uf;
    protected String cidade;
    protected String iata;
    @XmlElement(required = true)
    protected String endereco;

    /**
     * Obt�m o valor da propriedade ativo.
     * 
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * Define o valor da propriedade ativo.
     * 
     */
    public void setAtivo(boolean value) {
        this.ativo = value;
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
     * Obt�m o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obt�m o valor da propriedade codigoTurma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTurma() {
        return codigoTurma;
    }

    /**
     * Define o valor da propriedade codigoTurma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTurma(String value) {
        this.codigoTurma = value;
    }

    /**
     * Obt�m o valor da propriedade codigoRegional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRegional() {
        return codigoRegional;
    }

    /**
     * Define o valor da propriedade codigoRegional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRegional(String value) {
        this.codigoRegional = value;
    }

    /**
     * Obt�m o valor da propriedade codigoCentroDeCusto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCentroDeCusto() {
        return codigoCentroDeCusto;
    }

    /**
     * Define o valor da propriedade codigoCentroDeCusto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCentroDeCusto(String value) {
        this.codigoCentroDeCusto = value;
    }

    /**
     * Obt�m o valor da propriedade codigoSubCentroDeCusto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoSubCentroDeCusto() {
        return codigoSubCentroDeCusto;
    }

    /**
     * Define o valor da propriedade codigoSubCentroDeCusto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoSubCentroDeCusto(String value) {
        this.codigoSubCentroDeCusto = value;
    }

    /**
     * Obt�m o valor da propriedade codigoRegionalContaContabil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRegionalContaContabil() {
        return codigoRegionalContaContabil;
    }

    /**
     * Define o valor da propriedade codigoRegionalContaContabil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRegionalContaContabil(String value) {
        this.codigoRegionalContaContabil = value;
    }

    /**
     * Obt�m o valor da propriedade codigoContaContabil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoContaContabil() {
        return codigoContaContabil;
    }

    /**
     * Define o valor da propriedade codigoContaContabil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoContaContabil(String value) {
        this.codigoContaContabil = value;
    }

    /**
     * Obt�m o valor da propriedade dataInicio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInicio() {
        return dataInicio;
    }

    /**
     * Define o valor da propriedade dataInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInicio(XMLGregorianCalendar value) {
        this.dataInicio = value;
    }

    /**
     * Obt�m o valor da propriedade dataFim.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFim() {
        return dataFim;
    }

    /**
     * Define o valor da propriedade dataFim.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFim(XMLGregorianCalendar value) {
        this.dataFim = value;
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

    /**
     * Obt�m o valor da propriedade endereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndereco(String value) {
        this.endereco = value;
    }

}
