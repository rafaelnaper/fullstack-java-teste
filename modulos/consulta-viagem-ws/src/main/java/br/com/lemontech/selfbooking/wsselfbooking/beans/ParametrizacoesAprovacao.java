
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de parametrizacoesAprovacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="parametrizacoesAprovacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parametrizacaoCentroDeCustoAprovacaoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoCentroDeCustoAprovacaoRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrizacoesAprovacao", propOrder = {
    "parametrizacaoCentroDeCustoAprovacaoRef"
})
public class ParametrizacoesAprovacao {

    protected List<ParametrizacaoCentroDeCustoAprovacaoRef> parametrizacaoCentroDeCustoAprovacaoRef;

    /**
     * Gets the value of the parametrizacaoCentroDeCustoAprovacaoRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parametrizacaoCentroDeCustoAprovacaoRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParametrizacaoCentroDeCustoAprovacaoRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametrizacaoCentroDeCustoAprovacaoRef }
     * 
     * 
     */
    public List<ParametrizacaoCentroDeCustoAprovacaoRef> getParametrizacaoCentroDeCustoAprovacaoRef() {
        if (parametrizacaoCentroDeCustoAprovacaoRef == null) {
            parametrizacaoCentroDeCustoAprovacaoRef = new ArrayList<ParametrizacaoCentroDeCustoAprovacaoRef>();
        }
        return this.parametrizacaoCentroDeCustoAprovacaoRef;
    }

}
