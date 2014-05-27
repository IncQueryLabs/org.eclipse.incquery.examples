package org.eclipse.incquery.examples.bpm.queries.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.examples.bpm.queries.NextActivityMatch;
import org.eclipse.incquery.examples.bpm.queries.NextActivityMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;

/**
 * A pattern-specific query specification that can instantiate NextActivityMatcher in a type-safe way.
 * 
 * @see NextActivityMatcher
 * @see NextActivityMatch
 * 
 */
@SuppressWarnings("all")
public final class NextActivityQuerySpecification extends BaseGeneratedQuerySpecification<NextActivityMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static NextActivityQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected NextActivityMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return NextActivityMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "org.eclipse.incquery.examples.bpm.queries.nextActivity";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("Act","Next");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("Act", "process.Activity"),new PParameter("Next", "process.Activity"));
  }
  
  @Override
  public NextActivityMatch newEmptyMatch() {
    return NextActivityMatch.newEmptyMatch();
  }
  
  @Override
  public NextActivityMatch newMatch(final Object... parameters) {
    return NextActivityMatch.newMatch((process.Activity) parameters[0], (process.Activity) parameters[1]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_Act = body.getOrCreateVariableByName("Act");
      PVariable var_Next = body.getOrCreateVariableByName("Next");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_Act, "Act"), 
        new ExportedParameter(body, var_Next, "Next")
      ));
      
      
      new TypeBinary(body, CONTEXT, var_Act, var_Next, getFeatureLiteral("http://process/1.0", "Activity", "next"), "http://process/1.0/Activity.next");
      bodies.add(body);
    }
    return bodies;
  }
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static NextActivityQuerySpecification INSTANCE = make();
    
    public static NextActivityQuerySpecification make() {
      return new NextActivityQuerySpecification();					
      
    }
  }
  
}
