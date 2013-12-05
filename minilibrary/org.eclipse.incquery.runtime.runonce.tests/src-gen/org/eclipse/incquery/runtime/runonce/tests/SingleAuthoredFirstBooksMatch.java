package org.eclipse.incquery.runtime.runonce.tests;

import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.examples.eiqlibrary.Book;
import org.eclipse.incquery.examples.eiqlibrary.Library;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the org.eclipse.incquery.runtime.runonce.tests.singleAuthoredFirstBooks pattern, 
 * to be used in conjunction with {@link SingleAuthoredFirstBooksMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SingleAuthoredFirstBooksMatcher
 * @see SingleAuthoredFirstBooksProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class SingleAuthoredFirstBooksMatch extends BasePatternMatch {
  private Library fLibrary;
  
  private Book fFirstBook;
  
  private static List<String> parameterNames = makeImmutableList("library", "firstBook");
  
  private SingleAuthoredFirstBooksMatch(final Library pLibrary, final Book pFirstBook) {
    this.fLibrary = pLibrary;
    this.fFirstBook = pFirstBook;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("library".equals(parameterName)) return this.fLibrary;
    if ("firstBook".equals(parameterName)) return this.fFirstBook;
    return null;
    
  }
  
  public Library getLibrary() {
    return this.fLibrary;
    
  }
  
  public Book getFirstBook() {
    return this.fFirstBook;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("library".equals(parameterName) ) {
    	this.fLibrary = (org.eclipse.incquery.examples.eiqlibrary.Library) newValue;
    	return true;
    }
    if ("firstBook".equals(parameterName) ) {
    	this.fFirstBook = (org.eclipse.incquery.examples.eiqlibrary.Book) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setLibrary(final Library pLibrary) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fLibrary = pLibrary;
    
  }
  
  public void setFirstBook(final Book pFirstBook) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fFirstBook = pFirstBook;
    
  }
  
  @Override
  public String patternName() {
    return "org.eclipse.incquery.runtime.runonce.tests.singleAuthoredFirstBooks";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return SingleAuthoredFirstBooksMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fLibrary, fFirstBook};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"library\"=" + prettyPrintValue(fLibrary) + ", ");
    result.append("\"firstBook\"=" + prettyPrintValue(fFirstBook));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fLibrary == null) ? 0 : fLibrary.hashCode()); 
    result = prime * result + ((fFirstBook == null) ? 0 : fFirstBook.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SingleAuthoredFirstBooksMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    SingleAuthoredFirstBooksMatch other = (SingleAuthoredFirstBooksMatch) obj;
    if (fLibrary == null) {if (other.fLibrary != null) return false;}
    else if (!fLibrary.equals(other.fLibrary)) return false;
    if (fFirstBook == null) {if (other.fFirstBook != null) return false;}
    else if (!fFirstBook.equals(other.fFirstBook)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return SingleAuthoredFirstBooksMatcher.querySpecification().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends SingleAuthoredFirstBooksMatch {
    Mutable(final Library pLibrary, final Book pFirstBook) {
      super(pLibrary, pFirstBook);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends SingleAuthoredFirstBooksMatch {
    Immutable(final Library pLibrary, final Book pFirstBook) {
      super(pLibrary, pFirstBook);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
