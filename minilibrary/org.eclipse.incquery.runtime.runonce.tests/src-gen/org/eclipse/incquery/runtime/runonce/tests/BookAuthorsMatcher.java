package org.eclipse.incquery.runtime.runonce.tests;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.examples.eiqlibrary.Book;
import org.eclipse.incquery.examples.eiqlibrary.Writer;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;
import org.eclipse.incquery.runtime.runonce.tests.BookAuthorsMatch;
import org.eclipse.incquery.runtime.runonce.tests.util.BookAuthorsQuerySpecification;

/**
 * Generated pattern matcher API of the org.eclipse.incquery.runtime.runonce.tests.bookAuthors pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)}, 
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link BookAuthorsMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern bookAuthors(book, author) {
 * 	Book.authors(book, author);
 * }
 * </pre></code>
 * 
 * @see BookAuthorsMatch
 * @see BookAuthorsProcessor
 * @see BookAuthorsQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class BookAuthorsMatcher extends BaseMatcher<BookAuthorsMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<BookAuthorsMatcher> querySpecification() throws IncQueryException {
    return BookAuthorsQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static BookAuthorsMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    BookAuthorsMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new BookAuthorsMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    } 	
    return matcher;
  }
  
  private final static int POSITION_BOOK = 0;
  
  private final static int POSITION_AUTHOR = 1;
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so 
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public BookAuthorsMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public BookAuthorsMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pBook the fixed value of pattern parameter book, or null if not bound.
   * @param pAuthor the fixed value of pattern parameter author, or null if not bound.
   * @return matches represented as a BookAuthorsMatch object.
   * 
   */
  public Collection<BookAuthorsMatch> getAllMatches(final Book pBook, final Writer pAuthor) {
    return rawGetAllMatches(new Object[]{pBook, pAuthor});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pBook the fixed value of pattern parameter book, or null if not bound.
   * @param pAuthor the fixed value of pattern parameter author, or null if not bound.
   * @return a match represented as a BookAuthorsMatch object, or null if no match is found.
   * 
   */
  public BookAuthorsMatch getOneArbitraryMatch(final Book pBook, final Writer pAuthor) {
    return rawGetOneArbitraryMatch(new Object[]{pBook, pAuthor});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pBook the fixed value of pattern parameter book, or null if not bound.
   * @param pAuthor the fixed value of pattern parameter author, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Book pBook, final Writer pAuthor) {
    return rawHasMatch(new Object[]{pBook, pAuthor});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pBook the fixed value of pattern parameter book, or null if not bound.
   * @param pAuthor the fixed value of pattern parameter author, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Book pBook, final Writer pAuthor) {
    return rawCountMatches(new Object[]{pBook, pAuthor});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pBook the fixed value of pattern parameter book, or null if not bound.
   * @param pAuthor the fixed value of pattern parameter author, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Book pBook, final Writer pAuthor, final IMatchProcessor<? super BookAuthorsMatch> processor) {
    rawForEachMatch(new Object[]{pBook, pAuthor}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pBook the fixed value of pattern parameter book, or null if not bound.
   * @param pAuthor the fixed value of pattern parameter author, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Book pBook, final Writer pAuthor, final IMatchProcessor<? super BookAuthorsMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pBook, pAuthor}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pBook the fixed value of pattern parameter book, or null if not bound.
   * @param pAuthor the fixed value of pattern parameter author, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<BookAuthorsMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Book pBook, final Writer pAuthor) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pBook, pAuthor});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pBook the fixed value of pattern parameter book, or null if not bound.
   * @param pAuthor the fixed value of pattern parameter author, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public BookAuthorsMatch newMatch(final Book pBook, final Writer pAuthor) {
    return new BookAuthorsMatch.Immutable(pBook, pAuthor);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for book.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Book> rawAccumulateAllValuesOfbook(final Object[] parameters) {
    Set<Book> results = new HashSet<Book>();
    rawAccumulateAllValues(POSITION_BOOK, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for book.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Book> getAllValuesOfbook() {
    return rawAccumulateAllValuesOfbook(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for book.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Book> getAllValuesOfbook(final BookAuthorsMatch partialMatch) {
    return rawAccumulateAllValuesOfbook(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for book.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Book> getAllValuesOfbook(final Writer pAuthor) {
    return rawAccumulateAllValuesOfbook(new Object[]{null, pAuthor});
  }
  
  /**
   * Retrieve the set of values that occur in matches for author.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Writer> rawAccumulateAllValuesOfauthor(final Object[] parameters) {
    Set<Writer> results = new HashSet<Writer>();
    rawAccumulateAllValues(POSITION_AUTHOR, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for author.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Writer> getAllValuesOfauthor() {
    return rawAccumulateAllValuesOfauthor(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for author.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Writer> getAllValuesOfauthor(final BookAuthorsMatch partialMatch) {
    return rawAccumulateAllValuesOfauthor(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for author.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Writer> getAllValuesOfauthor(final Book pBook) {
    return rawAccumulateAllValuesOfauthor(new Object[]{pBook, null});
  }
  
  @Override
  protected BookAuthorsMatch tupleToMatch(final Tuple t) {
    try {
    	return new BookAuthorsMatch.Immutable((org.eclipse.incquery.examples.eiqlibrary.Book) t.get(POSITION_BOOK), (org.eclipse.incquery.examples.eiqlibrary.Writer) t.get(POSITION_AUTHOR));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected BookAuthorsMatch arrayToMatch(final Object[] match) {
    try {
    	return new BookAuthorsMatch.Immutable((org.eclipse.incquery.examples.eiqlibrary.Book) match[POSITION_BOOK], (org.eclipse.incquery.examples.eiqlibrary.Writer) match[POSITION_AUTHOR]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected BookAuthorsMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new BookAuthorsMatch.Mutable((org.eclipse.incquery.examples.eiqlibrary.Book) match[POSITION_BOOK], (org.eclipse.incquery.examples.eiqlibrary.Writer) match[POSITION_AUTHOR]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
}
