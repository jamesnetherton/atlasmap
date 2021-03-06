package io.atlasmap.v2;

import java.io.Serializable;

public class ConvertDistanceUnit extends Action implements Serializable {

    private final static long serialVersionUID = 1L;

    protected DistanceUnitType fromUnit;

    protected DistanceUnitType toUnit;

    /**
     * Gets the value of the fromUnit property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceUnitType }
     *     
     */
    public DistanceUnitType getFromUnit() {
        return fromUnit;
    }

    /**
     * Sets the value of the fromUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceUnitType }
     *     
     */
    public void setFromUnit(DistanceUnitType value) {
        this.fromUnit = value;
    }

    /**
     * Gets the value of the toUnit property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceUnitType }
     *     
     */
    public DistanceUnitType getToUnit() {
        return toUnit;
    }

    /**
     * Sets the value of the toUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceUnitType }
     *     
     */
    public void setToUnit(DistanceUnitType value) {
        this.toUnit = value;
    }

}
