/**
 */
package Model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exemplar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Exemplar#getStatusDeBloqueio <em>Status De Bloqueio</em>}</li>
 *   <li>{@link Model.Exemplar#getStatusDeReserva <em>Status De Reserva</em>}</li>
 *   <li>{@link Model.Exemplar#getStatusDeEmprestimo <em>Status De Emprestimo</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getExemplar()
 * @model
 * @generated
 */
public interface Exemplar extends EObject {
	/**
	 * Returns the value of the '<em><b>Status De Bloqueio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status De Bloqueio</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status De Bloqueio</em>' reference.
	 * @see #setStatusDeBloqueio(Exemplar)
	 * @see Model.ModelPackage#getExemplar_StatusDeBloqueio()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Exemplar getStatusDeBloqueio();

	/**
	 * Sets the value of the '{@link Model.Exemplar#getStatusDeBloqueio <em>Status De Bloqueio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status De Bloqueio</em>' reference.
	 * @see #getStatusDeBloqueio()
	 * @generated
	 */
	void setStatusDeBloqueio(Exemplar value);

	/**
	 * Returns the value of the '<em><b>Status De Reserva</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status De Reserva</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status De Reserva</em>' reference.
	 * @see #setStatusDeReserva(Exemplar)
	 * @see Model.ModelPackage#getExemplar_StatusDeReserva()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Exemplar getStatusDeReserva();

	/**
	 * Sets the value of the '{@link Model.Exemplar#getStatusDeReserva <em>Status De Reserva</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status De Reserva</em>' reference.
	 * @see #getStatusDeReserva()
	 * @generated
	 */
	void setStatusDeReserva(Exemplar value);

	/**
	 * Returns the value of the '<em><b>Status De Emprestimo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status De Emprestimo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status De Emprestimo</em>' reference.
	 * @see #setStatusDeEmprestimo(Exemplar)
	 * @see Model.ModelPackage#getExemplar_StatusDeEmprestimo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Exemplar getStatusDeEmprestimo();

	/**
	 * Sets the value of the '{@link Model.Exemplar#getStatusDeEmprestimo <em>Status De Emprestimo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status De Emprestimo</em>' reference.
	 * @see #getStatusDeEmprestimo()
	 * @generated
	 */
	void setStatusDeEmprestimo(Exemplar value);

} // Exemplar
