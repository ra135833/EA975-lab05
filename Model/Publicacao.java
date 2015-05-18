/**
 */
package Model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publicacao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Publicacao#getNomeDoExmplar <em>Nome Do Exmplar</em>}</li>
 *   <li>{@link Model.Publicacao#getDisponibilidade <em>Disponibilidade</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getPublicacao()
 * @model
 * @generated
 */
public interface Publicacao extends EObject {
	/**
	 * Returns the value of the '<em><b>Nome Do Exmplar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nome Do Exmplar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome Do Exmplar</em>' attribute.
	 * @see #setNomeDoExmplar(Object)
	 * @see Model.ModelPackage#getPublicacao_NomeDoExmplar()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getNomeDoExmplar();

	/**
	 * Sets the value of the '{@link Model.Publicacao#getNomeDoExmplar <em>Nome Do Exmplar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome Do Exmplar</em>' attribute.
	 * @see #getNomeDoExmplar()
	 * @generated
	 */
	void setNomeDoExmplar(Object value);

	/**
	 * Returns the value of the '<em><b>Disponibilidade</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disponibilidade</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disponibilidade</em>' reference.
	 * @see #setDisponibilidade(Publicacao)
	 * @see Model.ModelPackage#getPublicacao_Disponibilidade()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Publicacao getDisponibilidade();

	/**
	 * Sets the value of the '{@link Model.Publicacao#getDisponibilidade <em>Disponibilidade</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disponibilidade</em>' reference.
	 * @see #getDisponibilidade()
	 * @generated
	 */
	void setDisponibilidade(Publicacao value);

} // Publicacao
