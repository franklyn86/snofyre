/**
 * Crown Copyright (C) 2008 - 2011
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.nhs.cfh.dsp.srth.information.model.om.clinical.entity;

import uk.nhs.cfh.dsp.srth.information.model.om.clinical.ClinicalEntity;
import uk.nhs.cfh.dsp.srth.information.model.om.clinical.ClinicalExpression;
import uk.nhs.cfh.dsp.srth.information.model.om.clinical.ClinicalExpressionType;


// TODO: Auto-generated Javadoc
/**
 * A {@link ClinicalEntity} that is bound to a {@link uk.nhs.cfh.dsp.snomed.expression.model.Expression}.
 *
 * <br>Version : @#VersionNumber#@
 * <br>Written by @author Jay Kola
 * <br>Created on Saturday; October 3, 2009 6:22:45 PM
 */

public interface BoundClinicalEntity extends ClinicalEntity{

    /**
     * Gets the expression.
     *
     * @return the expression
     */
    ClinicalExpression getExpression();

    /**
     * Sets the expression.
     *
     * @param expression the new expression
     */
    void setExpression(ClinicalExpression expression);

    /**
     * Gets the expression type.
     *
     * @return the expression type
     */
    ClinicalExpressionType getExpressionType();

    /**
     * Sets the expression type.
     *
     * @param type the new expression type
     */
    void setExpressionType(ClinicalExpressionType type);
}
