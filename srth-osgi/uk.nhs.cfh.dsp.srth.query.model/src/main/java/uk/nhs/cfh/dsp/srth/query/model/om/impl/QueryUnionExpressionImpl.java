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
/**
 *
 */
package uk.nhs.cfh.dsp.srth.query.model.om.impl;

import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.Store;
import uk.nhs.cfh.dsp.srth.query.model.om.QueryExpression;
import uk.nhs.cfh.dsp.srth.query.model.om.QueryUnionExpression;

import javax.persistence.*;
import java.util.UUID;

// TODO: Auto-generated Javadoc
/**
 * A concrete implementation of a {@link uk.nhs.cfh.dsp.srth.query.model.om.QueryUnionExpression}.
 *
 * <br>Version : @#VersionNumber#@
 * <br>Written by @author Jay Kola
 * <br>Created on Feb 9, 2009 at 11:57:45 AM
 */

@Indexed
@Embeddable
@Entity(name = "QueryUnionExpression")
@DiscriminatorValue(value = "QueryUnionExpression")
public class QueryUnionExpressionImpl extends AbstractQueryExpression implements QueryUnionExpression {

    /** The operator. */
    private QueryOperatorType operator = QueryExpression.QueryOperatorType.OR;

    /**
     * Instantiates a new query union expression impl.
     */
    public QueryUnionExpressionImpl() {
        super(UUID.randomUUID().toString());
    }
    /**
     * Gets the operator.
     *
     * @return the operator
     */
    @Enumerated(EnumType.STRING)
    @Field(index = Index.UN_TOKENIZED, store = Store.NO)
    public QueryOperatorType getOperator() {
        return operator;
    }

    /**
     * Sets the operator.
     *
     * @param operator the new operator
     */
    public void setOperator(QueryOperatorType operator) {
        this.operator = operator;
    }
}
