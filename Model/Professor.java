/**
 */
package Model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Professor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Professor#getLimiteDeTempoProf <em>Limite De Tempo Prof</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getProfessor()
 * @model
 * @generated
 */
public interface Professor extends EObject {
	/**
	 * Returns the value of the '<em><b>Limite De Tempo Prof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limite De Tempo Prof</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limite De Tempo Prof</em>' reference.
	 * @see #setLimiteDeTempoProf(Professor)
	 * @see Model.ModelPackage#getProfessor_LimiteDeTempoProf()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Professor getLimiteDeTempoProf();

	/**
	 * Sets the value of the '{@link Model.Professor#getLimiteDeTempoProf <em>Limite De Tempo Prof</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limite De Tempo Prof</em>' reference.
	 * @see #getLimiteDeTempoProf()
	 * @generated
	 */
	void setLimiteDeTempoProf(Professor value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void RealisaBloqueio();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void RealisaDesbloqueio();

} // Professor
