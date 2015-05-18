/**
 */
package Model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aluno</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Aluno#getLimiteDeTempoAluno <em>Limite De Tempo Aluno</em>}</li>
 *   <li>{@link Model.Aluno#getStatusDeSuspens <em>Status De Suspens</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getAluno()
 * @model
 * @generated
 */
public interface Aluno extends EObject {
	/**
	 * Returns the value of the '<em><b>Limite De Tempo Aluno</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limite De Tempo Aluno</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limite De Tempo Aluno</em>' reference.
	 * @see #setLimiteDeTempoAluno(Aluno)
	 * @see Model.ModelPackage#getAluno_LimiteDeTempoAluno()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Aluno getLimiteDeTempoAluno();

	/**
	 * Sets the value of the '{@link Model.Aluno#getLimiteDeTempoAluno <em>Limite De Tempo Aluno</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limite De Tempo Aluno</em>' reference.
	 * @see #getLimiteDeTempoAluno()
	 * @generated
	 */
	void setLimiteDeTempoAluno(Aluno value);

	/**
	 * Returns the value of the '<em><b>Status De Suspens</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status De Suspens</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status De Suspens</em>' reference.
	 * @see #setStatusDeSuspens(Aluno)
	 * @see Model.ModelPackage#getAluno_StatusDeSuspens()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Aluno getStatusDeSuspens();

	/**
	 * Sets the value of the '{@link Model.Aluno#getStatusDeSuspens <em>Status De Suspens</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status De Suspens</em>' reference.
	 * @see #getStatusDeSuspens()
	 * @generated
	 */
	void setStatusDeSuspens(Aluno value);

} // Aluno
