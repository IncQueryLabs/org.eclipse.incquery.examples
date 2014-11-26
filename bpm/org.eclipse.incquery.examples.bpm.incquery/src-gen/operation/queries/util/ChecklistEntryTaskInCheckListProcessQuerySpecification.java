package operation.queries.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import operation.queries.util.ChecklistEntryTaskCorrespondenceQuerySpecification;
import operation.queries.util.ChecklistProcessCorrespondenceQuerySpecification;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate ChecklistEntryTaskInCheckListProcessMatcher in a type-safe way.
 * 
 * @see ChecklistEntryTaskInCheckListProcessMatcher
 * @see ChecklistEntryTaskInCheckListProcessMatch
 * 
 */
@SuppressWarnings("all")
final class ChecklistEntryTaskInCheckListProcessQuerySpecification extends BaseGeneratedEMFQuerySpecification<IncQueryMatcher<IPatternMatch>> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ChecklistEntryTaskInCheckListProcessQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
  }
  
  @Override
  protected IncQueryMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    throw new UnsupportedOperationException();
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "operation.queries.ChecklistEntryTaskInCheckListProcess";
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("CLE","Task");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("CLE", "operation.ChecklistEntry"),new PParameter("Task", "process.Task"));
  }
  
  @Override
  public IPatternMatch newEmptyMatch() {
    throw new UnsupportedOperationException();
  }
  
  @Override
  public IPatternMatch newMatch(final Object... parameters) {
    throw new UnsupportedOperationException();
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody>  bodies = Sets.newLinkedHashSet();
    
    {
    	PBody body = new PBody(this);
    	PVariable var_CLE = body.getOrCreateVariableByName("CLE");
    	PVariable var_Task = body.getOrCreateVariableByName("Task");
    	PVariable var_Checklist = body.getOrCreateVariableByName("Checklist");
    	PVariable var_Process = body.getOrCreateVariableByName("Process");
    	body.setExportedParameters(Arrays.<ExportedParameter>asList(
    		new ExportedParameter(body, var_CLE, "CLE"),
    		
    		new ExportedParameter(body, var_Task, "Task")
    	));
    	new PositivePatternCall(body, new FlatTuple(var_CLE, var_Task), ChecklistEntryTaskCorrespondenceQuerySpecification.instance());
    	new PositivePatternCall(body, new FlatTuple(var_Checklist, var_Process), ChecklistProcessCorrespondenceQuerySpecification.instance());
    new TypeBinary(body, CONTEXT, var_Process, var_Task, getFeatureLiteral("http://process/1.0", "Process", "contents"), "http://process/1.0/Process.contents");
    new TypeBinary(body, CONTEXT, var_Checklist, var_CLE, getFeatureLiteral("http://operation/1.0", "Checklist", "entries"), "http://operation/1.0/Checklist.entries");
    	bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static ChecklistEntryTaskInCheckListProcessQuerySpecification INSTANCE = make();
    
    public static ChecklistEntryTaskInCheckListProcessQuerySpecification make() {
      return new ChecklistEntryTaskInCheckListProcessQuerySpecification();					
    }
  }
}
