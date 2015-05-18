/**
 */
package Model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Funcionario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Funcionario#getLimiteDeTempoFunc <em>Limite De Tempo Func</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getFuncionario()
 * @model
 * @generated
 */
public interface Funcionario extends EObject {
	/**
	 * Returns the value of the '<em><b>Limite De Tempo Func</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limite De Tempo Func</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limite De Tempo Func</em>' reference.
	 * @see #setLimiteDeTempoFunc(Funcionario)
	 * @see Model.ModelPackage#getFuncionario_LimiteDeTempoFunc()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Funcionario getLimiteDeTempoFunc();

	/**
	 * Sets the value of the '{@link Model.Funcionario#getLimiteDeTempoFunc <em>Limite De Tempo Func</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limite De Tempo Func</em>' reference.
	 * @see #getLimiteDeTempoFunc()
	 * @generated
	 */
	void setLimiteDeTempoFunc(Funcionario value);

} // Funcionario
