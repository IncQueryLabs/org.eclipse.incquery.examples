package org.eclipse.incquery.runtime.runonce.tests.util;

import java.util.Map;
import org.eclipse.incquery.runtime.extensibility.IMatchChecker;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * A xbase xexpression evaluator tailored for the org.eclipse.incquery.runtime.runonce.tests.booksWithMultipleAuthors pattern.
 */
public class BooksWithMultipleAuthorsEvaluator1_1 implements IMatchChecker {
  /**
   * The raw java code generated from the xbase xexpression by xtext.
   */
  private Boolean evaluateXExpressionGenerated(final Integer numberOfBooks) {
    Integer _numberOfBooks = numberOfBooks;
    boolean _greaterThan = ((_numberOfBooks).intValue() > 1);
    return Boolean.valueOf(_greaterThan);
  }
  
  /**
   * A wrapper method for calling the generated java method with the correct attributes.
   */
  @Override
  public Boolean evaluateXExpression(final Tuple tuple, final Map<String,Integer> tupleNameMap) {
    int numberOfBooksPosition = tupleNameMap.get("numberOfBooks");
    java.lang.Integer numberOfBooks = (java.lang.Integer) tuple.get(numberOfBooksPosition);
    return evaluateXExpressionGenerated(numberOfBooks);
  }
}
