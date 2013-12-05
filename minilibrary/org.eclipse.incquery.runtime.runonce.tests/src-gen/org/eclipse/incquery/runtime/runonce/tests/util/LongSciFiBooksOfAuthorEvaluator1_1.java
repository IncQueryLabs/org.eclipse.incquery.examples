package org.eclipse.incquery.runtime.runonce.tests.util;

import java.util.Map;
import org.eclipse.incquery.runtime.extensibility.IMatchChecker;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * A xbase xexpression evaluator tailored for the org.eclipse.incquery.runtime.runonce.tests.longSciFiBooksOfAuthor pattern.
 */
public class LongSciFiBooksOfAuthorEvaluator1_1 implements IMatchChecker {
  /**
   * The raw java code generated from the xbase xexpression by xtext.
   */
  private Boolean evaluateXExpressionGenerated(final Integer pages) {
    Integer _pages = pages;
    boolean _greaterThan = ((_pages).intValue() > 100);
    return Boolean.valueOf(_greaterThan);
  }
  
  /**
   * A wrapper method for calling the generated java method with the correct attributes.
   */
  @Override
  public Boolean evaluateXExpression(final Tuple tuple, final Map<String,Integer> tupleNameMap) {
    int pagesPosition = tupleNameMap.get("pages");
    java.lang.Integer pages = (java.lang.Integer) tuple.get(pagesPosition);
    return evaluateXExpressionGenerated(pages);
  }
}
