package school.schoolname;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra2.emf.incquery.runtime.api.EngineManager;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatchProcessor;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryEngine;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.Tuple;
import school.schoolname.SchoolNameMatch;

/**
 * Generated pattern matcher API of the schoolName pattern, 
 * providing pattern-specific query methods.
 * 
 * 
 * 
 * 
 * 	 
 * 	pattern schoolName(S, Name) = { 		
 *  		School.name(S, Name);
 *  	}
 * 
 * @see SchoolNameMatch
 * @see SchoolNameMatcherFactory
 * @see SchoolNameProcessor
 * 
 */
public class SchoolNameMatcher extends BaseGeneratedMatcher<SchoolNameMatch> implements IncQueryMatcher<SchoolNameMatch> {
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a lightweight reference is created.
   * The match set will be incrementally refreshed upon updates from the given EMF root and below.
   * <p>Note: if emfRoot is a resourceSet, the scope will include even those resources that are not part of the resourceSet but are referenced. 
   * This is mainly to support nsURI-based instance-level references to registered EPackages.
   * @param emfRoot the root of the EMF tree where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryRuntimeException if an error occurs during pattern matcher creation
   * 
   */
  public SchoolNameMatcher(final Notifier notifier) throws IncQueryRuntimeException {
    this(EngineManager.getInstance().getIncQueryEngine(notifier));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a lightweight reference is created.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryRuntimeException if an error occurs during pattern matcher creation
   * 
   */
  public SchoolNameMatcher(final IncQueryEngine engine) throws IncQueryRuntimeException {
    super(engine, FACTORY);
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param S the fixed value of pattern parameter S, or null if not bound.
   * @param Name the fixed value of pattern parameter Name, or null if not bound.
   * @return matches represented as a SchoolNameMatch object.
   * 
   */
  public Collection<SchoolNameMatch> getAllMatches(final Object pS, final Object pName) {
    return rawGetAllMatches(new Object[]{pS, pName});
    
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param S the fixed value of pattern parameter S, or null if not bound.
   * @param Name the fixed value of pattern parameter Name, or null if not bound.
   * @return a match represented as a SchoolNameMatch object, or null if no match is found.
   * 
   */
  public SchoolNameMatch getOneArbitraryMatch(final Object pS, final Object pName) {
    return rawGetOneArbitraryMatch(new Object[]{pS, pName});
    
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param S the fixed value of pattern parameter S, or null if not bound.
   * @param Name the fixed value of pattern parameter Name, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Object pS, final Object pName) {
    return rawHasMatch(new Object[]{pS, pName});
    
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param S the fixed value of pattern parameter S, or null if not bound.
   * @param Name the fixed value of pattern parameter Name, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Object pS, final Object pName) {
    return rawCountMatches(new Object[]{pS, pName});
    
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param S the fixed value of pattern parameter S, or null if not bound.
   * @param Name the fixed value of pattern parameter Name, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Object pS, final Object pName, final IMatchProcessor<? super SchoolNameMatch> processor) {
    rawForEachMatch(new Object[]{pS, pName}, processor);
    
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param S the fixed value of pattern parameter S, or null if not bound.
   * @param Name the fixed value of pattern parameter Name, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Object pS, final Object pName, final IMatchProcessor<? super SchoolNameMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pS, pName}, processor);
    
  }
  
  @Override
  public SchoolNameMatch tupleToMatch(final Tuple t) {
    try {
    	return new SchoolNameMatch((java.lang.Object) t.get(0), (java.lang.Object) t.get(1));	
    } catch(ClassCastException e) {System.err.println("Error when executing tupleToMatch in SchoolNameMatcher:" + e.getMessage());
    	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  public SchoolNameMatch arrayToMatch(final Object[] match) {
    try {
    	return new SchoolNameMatch((java.lang.Object) match[0], (java.lang.Object) match[1]);
    } catch(ClassCastException e) {System.err.println("Error when executing arrayToMatch in SchoolNameMatcher:" + e.getMessage());
    }
    		//throw new IncQueryRuntimeException(e.getMessage());
    		return null;
    
  }
  
  public final static IMatcherFactory<SchoolNameMatch,SchoolNameMatcher> FACTORY =  new SchoolNameMatcherFactory();
}
