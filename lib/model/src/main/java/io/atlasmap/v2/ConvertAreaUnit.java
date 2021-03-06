package io.atlasmap.v2;

import java.io.Serializable;

public class ConvertAreaUnit extends Action implements Serializable {

    private final static long serialVersionUID = 1L;

    protected AreaUnitType fromUnit;

    protected AreaUnitType toUnit;

    /**
     * Gets the value of the fromUnit property.
     * 
     * @return
     *     possible object is
     *     {@link AreaUnitType }
     *     
     */
    public AreaUnitType getFromUnit() {
        return fromUnit;
    }

    /**
     * Sets the value of the fromUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaUnitType }
     *     
     */
    public void setFromUnit(AreaUnitType value) {
        this.fromUnit = value;
    }

    /**
     * Gets the value of the toUnit property.
     * 
     * @return
     *     possible object is
     *     {@link AreaUnitType }
     *     
     */
    public AreaUnitType getToUnit() {
        return toUnit;
    }

    /**
     * Sets the value of the toUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaUnitType }
     *     
     */
    public void setToUnit(AreaUnitType value) {
        this.toUnit = value;
    }

}
