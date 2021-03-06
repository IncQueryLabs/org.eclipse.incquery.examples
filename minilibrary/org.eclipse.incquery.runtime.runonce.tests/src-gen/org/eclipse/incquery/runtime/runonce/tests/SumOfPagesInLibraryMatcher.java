package org.eclipse.incquery.runtime.runonce.tests;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.examples.eiqlibrary.Library;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.eclipse.incquery.runtime.runonce.tests.SumOfPagesInLibraryMatch;
import org.eclipse.incquery.runtime.runonce.tests.util.SumOfPagesInLibraryQuerySpecification;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;

/**
 * Generated pattern matcher API of the org.eclipse.incquery.runtime.runonce.tests.sumOfPagesInLibrary pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link SumOfPagesInLibraryMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern sumOfPagesInLibrary(library, sumOfPages) {
 * 	Library.sumOfPages(library, sumOfPages);
 * }
 * </pre></code>
 * 
 * @see SumOfPagesInLibraryMatch
 * @see SumOfPagesInLibraryProcessor
 * @see SumOfPagesInLibraryQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class SumOfPagesInLibraryMatcher extends BaseMatcher<SumOfPagesInLibraryMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<SumOfPagesInLibraryMatcher> querySpecification() throws IncQueryException {
    return SumOfPagesInLibraryQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static SumOfPagesInLibraryMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    SumOfPagesInLibraryMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new SumOfPagesInLibraryMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_LIBRARY = 0;
  
  private final static int POSITION_SUMOFPAGES = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(SumOfPagesInLibraryMatcher.class);
  
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
  public SumOfPagesInLibraryMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public SumOfPagesInLibraryMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pLibrary the fixed value of pattern parameter library, or null if not bound.
   * @param pSumOfPages the fixed value of pattern parameter sumOfPages, or null if not bound.
   * @return matches represented as a SumOfPagesInLibraryMatch object.
   * 
   */
  public Collection<SumOfPagesInLibraryMatch> getAllMatches(final Library pLibrary, final Integer pSumOfPages) {
    return rawGetAllMatches(new Object[]{pLibrary, pSumOfPages});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pLibrary the fixed value of pattern parameter library, or null if not bound.
   * @param pSumOfPages the fixed value of pattern parameter sumOfPages, or null if not bound.
   * @return a match represented as a SumOfPagesInLibraryMatch object, or null if no match is found.
   * 
   */
  public SumOfPagesInLibraryMatch getOneArbitraryMatch(final Library pLibrary, final Integer pSumOfPages) {
    return rawGetOneArbitraryMatch(new Object[]{pLibrary, pSumOfPages});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pLibrary the fixed value of pattern parameter library, or null if not bound.
   * @param pSumOfPages the fixed value of pattern parameter sumOfPages, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Library pLibrary, final Integer pSumOfPages) {
    return rawHasMatch(new Object[]{pLibrary, pSumOfPages});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pLibrary the fixed value of pattern parameter library, or null if not bound.
   * @param pSumOfPages the fixed value of pattern parameter sumOfPages, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Library pLibrary, final Integer pSumOfPages) {
    return rawCountMatches(new Object[]{pLibrary, pSumOfPages});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pLibrary the fixed value of pattern parameter library, or null if not bound.
   * @param pSumOfPages the fixed value of pattern parameter sumOfPages, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Library pLibrary, final Integer pSumOfPages, final IMatchProcessor<? super SumOfPagesInLibraryMatch> processor) {
    rawForEachMatch(new Object[]{pLibrary, pSumOfPages}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pLibrary the fixed value of pattern parameter library, or null if not bound.
   * @param pSumOfPages the fixed value of pattern parameter sumOfPages, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Library pLibrary, final Integer pSumOfPages, final IMatchProcessor<? super SumOfPagesInLibraryMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pLibrary, pSumOfPages}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters.
   * It can also be reset to track changes from a later point in time,
   * and changes can even be acknowledged on an individual basis.
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pLibrary the fixed value of pattern parameter library, or null if not bound.
   * @param pSumOfPages the fixed value of pattern parameter sumOfPages, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<SumOfPagesInLibraryMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Library pLibrary, final Integer pSumOfPages) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pLibrary, pSumOfPages});
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pLibrary the fixed value of pattern parameter library, or null if not bound.
   * @param pSumOfPages the fixed value of pattern parameter sumOfPages, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public SumOfPagesInLibraryMatch newMatch(final Library pLibrary, final Integer pSumOfPages) {
    return SumOfPagesInLibraryMatch.newMatch(pLibrary, pSumOfPages);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for library.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Library> rawAccumulateAllValuesOflibrary(final Object[] parameters) {
    Set<Library> results = new HashSet<Library>();
    rawAccumulateAllValues(POSITION_LIBRARY, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for library.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Library> getAllValuesOflibrary() {
    return rawAccumulateAllValuesOflibrary(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for library.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Library> getAllValuesOflibrary(final SumOfPagesInLibraryMatch partialMatch) {
    return rawAccumulateAllValuesOflibrary(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for library.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Library> getAllValuesOflibrary(final Integer pSumOfPages) {
    return rawAccumulateAllValuesOflibrary(new Object[]{null, pSumOfPages});
  }
  
  /**
   * Retrieve the set of values that occur in matches for sumOfPages.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Integer> rawAccumulateAllValuesOfsumOfPages(final Object[] parameters) {
    Set<Integer> results = new HashSet<Integer>();
    rawAccumulateAllValues(POSITION_SUMOFPAGES, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for sumOfPages.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfsumOfPages() {
    return rawAccumulateAllValuesOfsumOfPages(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for sumOfPages.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfsumOfPages(final SumOfPagesInLibraryMatch partialMatch) {
    return rawAccumulateAllValuesOfsumOfPages(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for sumOfPages.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfsumOfPages(final Library pLibrary) {
    return rawAccumulateAllValuesOfsumOfPages(new Object[]{pLibrary, null});
  }
  
  @Override
  protected SumOfPagesInLibraryMatch tupleToMatch(final Tuple t) {
    try {
      return SumOfPagesInLibraryMatch.newMatch((org.eclipse.incquery.examples.eiqlibrary.Library) t.get(POSITION_LIBRARY), (java.lang.Integer) t.get(POSITION_SUMOFPAGES));
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in tuple not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected SumOfPagesInLibraryMatch arrayToMatch(final Object[] match) {
    try {
      return SumOfPagesInLibraryMatch.newMatch((org.eclipse.incquery.examples.eiqlibrary.Library) match[POSITION_LIBRARY], (java.lang.Integer) match[POSITION_SUMOFPAGES]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected SumOfPagesInLibraryMatch arrayToMatchMutable(final Object[] match) {
    try {
      return SumOfPagesInLibraryMatch.newMutableMatch((org.eclipse.incquery.examples.eiqlibrary.Library) match[POSITION_LIBRARY], (java.lang.Integer) match[POSITION_SUMOFPAGES]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
}
