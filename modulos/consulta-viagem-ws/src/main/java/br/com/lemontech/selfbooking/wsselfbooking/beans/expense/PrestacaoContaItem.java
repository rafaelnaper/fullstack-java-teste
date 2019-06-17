
package br.com.lemontech.selfbooking.wsselfbooking.beans.expense;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.DeslocamentoTerrestre;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda;


/**
 * <p>Classe Java de prestacaoContaItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="prestacaoContaItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoDespesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="moeda" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}moeda" minOccurs="0"/>
 *         &lt;element name="urlImagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificadorExterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deslocamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}deslocamentoTerrestre" minOccurs="0"/>
 *         &lt;element name="codigoDespesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reembolsavel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="custoCliente" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="nomeClienteCusto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formaPagamentoPrestacaoContaItem" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}formaPagamentoPrestacaoContaItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prestacaoContaItem", propOrder = {
    "tipoDespesa",
    "valor",
    "moeda",
    "urlImagem",
    "observacao",
    "identificadorExterno",
    "deslocamento",
    "codigoDespesa",
    "reembolsavel",
    "custoCliente",
    "nomeClienteCusto",
    "formaPagamentoPrestacaoContaItem"
})
public class PrestacaoContaItem {

    protected String tipoDespesa;
    protected Double valor;
    @XmlSchemaType(name = "string")
    protected Moeda moeda;
    protected String urlImagem;
    protected String observacao;
    protected String identificadorExterno;
    protected DeslocamentoTerrestre deslocamento;
    protected String codigoDespesa;
    protected Boolean reembolsavel;
    protected Boolean custoCliente;
    protected String nomeClienteCusto;
    @XmlSchemaType(name = "string")
    protected FormaPagamentoPrestacaoContaItem formaPagamentoPrestacaoContaItem;

    /**
     * Obtém o valor da propriedade tipoDespesa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDespesa() {
        return tipoDespesa;
    }

    /**
     * Define o valor da propriedade tipoDespesa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDespesa(String value) {
        this.tipoDespesa = value;
    }

    /**
     * Obtém o valor da propriedade valor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValor() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValor(Double value) {
        this.valor = value;
    }

    /**
     * Obtém o valor da propriedade moeda.
     * 
     * @return
     *     possible object is
     *     {@link Moeda }
     *     
     */
    public Moeda getMoeda() {
        return moeda;
    }

    /**
     * Define o valor da propriedade moeda.
     * 
     * @param value
     *     allowed object is
     *     {@link Moeda }
     *     
     */
    public void setMoeda(Moeda value) {
        this.moeda = value;
    }

    /**
     * Obtém o valor da propriedade urlImagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlImagem() {
        return urlImagem;
    }

    /**
     * Define o valor da propriedade urlImagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlImagem(String value) {
        this.urlImagem = value;
    }

    /**
     * Obtém o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

    /**
     * Obtém o valor da propriedade identificadorExterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorExterno() {
        return identificadorExterno;
    }

    /**
     * Define o valor da propriedade identificadorExterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorExterno(String value) {
        this.identificadorExterno = value;
    }

    /**
     * Obtém o valor da propriedade deslocamento.
     * 
     * @return
     *     possible object is
     *     {@link DeslocamentoTerrestre }
     *     
     */
    public DeslocamentoTerrestre getDeslocamento() {
        return deslocamento;
    }

    /**
     * Define o valor da propriedade deslocamento.
     * 
     * @param value
     *     allowed object is
     *     {@link DeslocamentoTerrestre }
     *     
     */
    public void setDeslocamento(DeslocamentoTerrestre value) {
        this.deslocamento = value;
    }

    /**
     * Obtém o valor da propriedade codigoDespesa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDespesa() {
        return codigoDespesa;
    }

    /**
     * Define o valor da propriedade codigoDespesa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDespesa(String value) {
        this.codigoDespesa = value;
    }

    /**
     * Obtém o valor da propriedade reembolsavel.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReembolsavel() {
        return reembolsavel;
    }

    /**
     * Define o valor da propriedade reembolsavel.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReembolsavel(Boolean value) {
        this.reembolsavel = value;
    }

    /**
     * Obtém o valor da propriedade custoCliente.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustoCliente() {
        return custoCliente;
    }

    /**
     * Define o valor da propriedade custoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustoCliente(Boolean value) {
        this.custoCliente = value;
    }

    /**
     * Obtém o valor da propriedade nomeClienteCusto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeClienteCusto() {
        return nomeClienteCusto;
    }

    /**
     * Define o valor da propriedade nomeClienteCusto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeClienteCusto(String value) {
        this.nomeClienteCusto = value;
    }

    /**
     * Obtém o valor da propriedade formaPagamentoPrestacaoContaItem.
     * 
     * @return
     *     possible object is
     *     {@link FormaPagamentoPrestacaoContaItem }
     *     
     */
    public FormaPagamentoPrestacaoContaItem getFormaPagamentoPrestacaoContaItem() {
        return formaPagamentoPrestacaoContaItem;
    }

    /**
     * Define o valor da propriedade formaPagamentoPrestacaoContaItem.
     * 
     * @param value
     *     allowed object is
     *     {@link FormaPagamentoPrestacaoContaItem }
     *     
     */
    public void setFormaPagamentoPrestacaoContaItem(FormaPagamentoPrestacaoContaItem value) {
        this.formaPagamentoPrestacaoContaItem = value;
    }

}
