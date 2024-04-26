/**
 */
package info.scce.cinco.product.scchart.mglid.scchart;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see info.scce.cinco.product.scchart.mglid.scchart.ScchartPackage
 * @generated
 */
public interface ScchartFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScchartFactory eINSTANCE = info.scce.cinco.product.scchart.mglid.scchart.impl.ScchartFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root State</em>'.
	 * @generated
	 */
	RootState createRootState();

	/**
	 * Returns a new object of class '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region</em>'.
	 * @generated
	 */
	Region createRegion();

	/**
	 * Returns a new object of class '<em>Region Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region Ref</em>'.
	 * @generated
	 */
	RegionRef createRegionRef();

	/**
	 * Returns a new object of class '<em>Super State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super State</em>'.
	 * @generated
	 */
	SuperState createSuperState();

	/**
	 * Returns a new object of class '<em>Initial Super State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Super State</em>'.
	 * @generated
	 */
	InitialSuperState createInitialSuperState();

	/**
	 * Returns a new object of class '<em>Final Super State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Final Super State</em>'.
	 * @generated
	 */
	FinalSuperState createFinalSuperState();

	/**
	 * Returns a new object of class '<em>Initial Final Super State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Final Super State</em>'.
	 * @generated
	 */
	InitialFinalSuperState createInitialFinalSuperState();

	/**
	 * Returns a new object of class '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declaration</em>'.
	 * @generated
	 */
	Declaration createDeclaration();

	/**
	 * Returns a new object of class '<em>Suspension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suspension</em>'.
	 * @generated
	 */
	Suspension createSuspension();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Simple State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple State</em>'.
	 * @generated
	 */
	SimpleState createSimpleState();

	/**
	 * Returns a new object of class '<em>Initial State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial State</em>'.
	 * @generated
	 */
	InitialState createInitialState();

	/**
	 * Returns a new object of class '<em>Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Final State</em>'.
	 * @generated
	 */
	FinalState createFinalState();

	/**
	 * Returns a new object of class '<em>Initial Final State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Final State</em>'.
	 * @generated
	 */
	InitialFinalState createInitialFinalState();

	/**
	 * Returns a new object of class '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector</em>'.
	 * @generated
	 */
	Connector createConnector();

	/**
	 * Returns a new object of class '<em>SC Chart Referece</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SC Chart Referece</em>'.
	 * @generated
	 */
	SCChartReferece createSCChartReferece();

	/**
	 * Returns a new object of class '<em>Initial SC Chart Referece</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial SC Chart Referece</em>'.
	 * @generated
	 */
	InitialSCChartReferece createInitialSCChartReferece();

	/**
	 * Returns a new object of class '<em>Final SC Chart Referece</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Final SC Chart Referece</em>'.
	 * @generated
	 */
	FinalSCChartReferece createFinalSCChartReferece();

	/**
	 * Returns a new object of class '<em>Initial Final SC Chart Referece</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Final SC Chart Referece</em>'.
	 * @generated
	 */
	InitialFinalSCChartReferece createInitialFinalSCChartReferece();

	/**
	 * Returns a new object of class '<em>Abstract Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Transition</em>'.
	 * @generated
	 */
	AbstractTransition createAbstractTransition();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Termination Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Termination Transition</em>'.
	 * @generated
	 */
	TerminationTransition createTerminationTransition();

	/**
	 * Returns a new object of class '<em>Strong Abort Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strong Abort Transition</em>'.
	 * @generated
	 */
	StrongAbortTransition createStrongAbortTransition();

	/**
	 * Returns a new object of class '<em>Deferred Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deferred Transition</em>'.
	 * @generated
	 */
	DeferredTransition createDeferredTransition();

	/**
	 * Returns a new object of class '<em>History Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>History Transition</em>'.
	 * @generated
	 */
	HistoryTransition createHistoryTransition();

	/**
	 * Returns a new object of class '<em>Termination Deferred Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Termination Deferred Transition</em>'.
	 * @generated
	 */
	TerminationDeferredTransition createTerminationDeferredTransition();

	/**
	 * Returns a new object of class '<em>Strong Abort Deferred Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strong Abort Deferred Transition</em>'.
	 * @generated
	 */
	StrongAbortDeferredTransition createStrongAbortDeferredTransition();

	/**
	 * Returns a new object of class '<em>Termination History Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Termination History Transition</em>'.
	 * @generated
	 */
	TerminationHistoryTransition createTerminationHistoryTransition();

	/**
	 * Returns a new object of class '<em>Strong Abort History Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strong Abort History Transition</em>'.
	 * @generated
	 */
	StrongAbortHistoryTransition createStrongAbortHistoryTransition();

	/**
	 * Returns a new object of class '<em>Deferred History Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deferred History Transition</em>'.
	 * @generated
	 */
	DeferredHistoryTransition createDeferredHistoryTransition();

	/**
	 * Returns a new object of class '<em>Strong Abort Deferred History Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strong Abort Deferred History Transition</em>'.
	 * @generated
	 */
	StrongAbortDeferredHistoryTransition createStrongAbortDeferredHistoryTransition();

	/**
	 * Returns a new object of class '<em>Termination Deferred History Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Termination Deferred History Transition</em>'.
	 * @generated
	 */
	TerminationDeferredHistoryTransition createTerminationDeferredHistoryTransition();

	/**
	 * Returns a new object of class '<em>SC Chart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SC Chart</em>'.
	 * @generated
	 */
	SCChart createSCChart();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ScchartPackage getScchartPackage();

} //ScchartFactory
