/**
 */
package Model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biblioteca</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Biblioteca#getAcervoDisponivel <em>Acervo Disponivel</em>}</li>
 *   <li>{@link Model.Biblioteca#getUsuariosCadastrados <em>Usuarios Cadastrados</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getBiblioteca()
 * @model
 * @generated
 */
public interface Biblioteca extends EObject {
	/**
	 * Returns the value of the '<em><b>Acervo Disponivel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acervo Disponivel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acervo Disponivel</em>' reference.
	 * @see #setAcervoDisponivel(Biblioteca)
	 * @see Model.ModelPackage#getBiblioteca_AcervoDisponivel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Biblioteca getAcervoDisponivel();

	/**
	 * Sets the value of the '{@link Model.Biblioteca#getAcervoDisponivel <em>Acervo Disponivel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acervo Disponivel</em>' reference.
	 * @see #getAcervoDisponivel()
	 * @generated
	 */
	void setAcervoDisponivel(Biblioteca value);

	/**
	 * Returns the value of the '<em><b>Usuarios Cadastrados</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usuarios Cadastrados</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usuarios Cadastrados</em>' reference.
	 * @see #setUsuariosCadastrados(Biblioteca)
	 * @see Model.ModelPackage#getBiblioteca_UsuariosCadastrados()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Biblioteca getUsuariosCadastrados();

	/**
	 * Sets the value of the '{@link Model.Biblioteca#getUsuariosCadastrados <em>Usuarios Cadastrados</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usuarios Cadastrados</em>' reference.
	 * @see #getUsuariosCadastrados()
	 * @generated
	 */
	void setUsuariosCadastrados(Biblioteca value);

} // Biblioteca
