/**
 */
package Model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emprestimo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Emprestimo#getStatusDeAtraso <em>Status De Atraso</em>}</li>
 *   <li>{@link Model.Emprestimo#getDiasDeAtraso <em>Dias De Atraso</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getEmprestimo()
 * @model
 * @generated
 */
public interface Emprestimo extends EObject {
	/**
	 * Returns the value of the '<em><b>Status De Atraso</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status De Atraso</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status De Atraso</em>' reference.
	 * @see #setStatusDeAtraso(Emprestimo)
	 * @see Model.ModelPackage#getEmprestimo_StatusDeAtraso()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Emprestimo getStatusDeAtraso();

	/**
	 * Sets the value of the '{@link Model.Emprestimo#getStatusDeAtraso <em>Status De Atraso</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status De Atraso</em>' reference.
	 * @see #getStatusDeAtraso()
	 * @generated
	 */
	void setStatusDeAtraso(Emprestimo value);

	/**
	 * Returns the value of the '<em><b>Dias De Atraso</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dias De Atraso</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dias De Atraso</em>' reference.
	 * @see #setDiasDeAtraso(Emprestimo)
	 * @see Model.ModelPackage#getEmprestimo_DiasDeAtraso()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Emprestimo getDiasDeAtraso();

	/**
	 * Sets the value of the '{@link Model.Emprestimo#getDiasDeAtraso <em>Dias De Atraso</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dias De Atraso</em>' reference.
	 * @see #getDiasDeAtraso()
	 * @generated
	 */
	void setDiasDeAtraso(Emprestimo value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void CalculaMulta();

} // Emprestimo
