/**
 */
package Model.impl;

import Model.Biblioteca;
import Model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Biblioteca</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.BibliotecaImpl#getAcervoDisponivel <em>Acervo Disponivel</em>}</li>
 *   <li>{@link Model.impl.BibliotecaImpl#getUsuariosCadastrados <em>Usuarios Cadastrados</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BibliotecaImpl extends MinimalEObjectImpl.Container implements Biblioteca {
	/**
	 * The cached value of the '{@link #getAcervoDisponivel() <em>Acervo Disponivel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcervoDisponivel()
	 * @generated
	 * @ordered
	 */
	protected Biblioteca acervoDisponivel;

	/**
	 * The cached value of the '{@link #getUsuariosCadastrados() <em>Usuarios Cadastrados</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsuariosCadastrados()
	 * @generated
	 * @ordered
	 */
	protected Biblioteca usuariosCadastrados;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BibliotecaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BIBLIOTECA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Biblioteca getAcervoDisponivel() {
		if (acervoDisponivel != null && acervoDisponivel.eIsProxy()) {
			InternalEObject oldAcervoDisponivel = (InternalEObject)acervoDisponivel;
			acervoDisponivel = (Biblioteca)eResolveProxy(oldAcervoDisponivel);
			if (acervoDisponivel != oldAcervoDisponivel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.BIBLIOTECA__ACERVO_DISPONIVEL, oldAcervoDisponivel, acervoDisponivel));
			}
		}
		return acervoDisponivel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Biblioteca basicGetAcervoDisponivel() {
		return acervoDisponivel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcervoDisponivel(Biblioteca newAcervoDisponivel) {
		Biblioteca oldAcervoDisponivel = acervoDisponivel;
		acervoDisponivel = newAcervoDisponivel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BIBLIOTECA__ACERVO_DISPONIVEL, oldAcervoDisponivel, acervoDisponivel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Biblioteca getUsuariosCadastrados() {
		if (usuariosCadastrados != null && usuariosCadastrados.eIsProxy()) {
			InternalEObject oldUsuariosCadastrados = (InternalEObject)usuariosCadastrados;
			usuariosCadastrados = (Biblioteca)eResolveProxy(oldUsuariosCadastrados);
			if (usuariosCadastrados != oldUsuariosCadastrados) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.BIBLIOTECA__USUARIOS_CADASTRADOS, oldUsuariosCadastrados, usuariosCadastrados));
			}
		}
		return usuariosCadastrados;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Biblioteca basicGetUsuariosCadastrados() {
		return usuariosCadastrados;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsuariosCadastrados(Biblioteca newUsuariosCadastrados) {
		Biblioteca oldUsuariosCadastrados = usuariosCadastrados;
		usuariosCadastrados = newUsuariosCadastrados;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BIBLIOTECA__USUARIOS_CADASTRADOS, oldUsuariosCadastrados, usuariosCadastrados));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.BIBLIOTECA__ACERVO_DISPONIVEL:
				if (resolve) return getAcervoDisponivel();
				return basicGetAcervoDisponivel();
			case ModelPackage.BIBLIOTECA__USUARIOS_CADASTRADOS:
				if (resolve) return getUsuariosCadastrados();
				return basicGetUsuariosCadastrados();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.BIBLIOTECA__ACERVO_DISPONIVEL:
				setAcervoDisponivel((Biblioteca)newValue);
				return;
			case ModelPackage.BIBLIOTECA__USUARIOS_CADASTRADOS:
				setUsuariosCadastrados((Biblioteca)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.BIBLIOTECA__ACERVO_DISPONIVEL:
				setAcervoDisponivel((Biblioteca)null);
				return;
			case ModelPackage.BIBLIOTECA__USUARIOS_CADASTRADOS:
				setUsuariosCadastrados((Biblioteca)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.BIBLIOTECA__ACERVO_DISPONIVEL:
				return acervoDisponivel != null;
			case ModelPackage.BIBLIOTECA__USUARIOS_CADASTRADOS:
				return usuariosCadastrados != null;
		}
		return super.eIsSet(featureID);
	}

} //BibliotecaImpl
