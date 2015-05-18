/**
 */
package Model.impl;

import Model.ModelPackage;
import Model.Publicacao;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publicacao</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.PublicacaoImpl#getNomeDoExmplar <em>Nome Do Exmplar</em>}</li>
 *   <li>{@link Model.impl.PublicacaoImpl#getDisponibilidade <em>Disponibilidade</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PublicacaoImpl extends MinimalEObjectImpl.Container implements Publicacao {
	/**
	 * The default value of the '{@link #getNomeDoExmplar() <em>Nome Do Exmplar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomeDoExmplar()
	 * @generated
	 * @ordered
	 */
	protected static final Object NOME_DO_EXMPLAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomeDoExmplar() <em>Nome Do Exmplar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomeDoExmplar()
	 * @generated
	 * @ordered
	 */
	protected Object nomeDoExmplar = NOME_DO_EXMPLAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDisponibilidade() <em>Disponibilidade</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisponibilidade()
	 * @generated
	 * @ordered
	 */
	protected Publicacao disponibilidade;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicacaoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PUBLICACAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getNomeDoExmplar() {
		return nomeDoExmplar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomeDoExmplar(Object newNomeDoExmplar) {
		Object oldNomeDoExmplar = nomeDoExmplar;
		nomeDoExmplar = newNomeDoExmplar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PUBLICACAO__NOME_DO_EXMPLAR, oldNomeDoExmplar, nomeDoExmplar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publicacao getDisponibilidade() {
		if (disponibilidade != null && disponibilidade.eIsProxy()) {
			InternalEObject oldDisponibilidade = (InternalEObject)disponibilidade;
			disponibilidade = (Publicacao)eResolveProxy(oldDisponibilidade);
			if (disponibilidade != oldDisponibilidade) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.PUBLICACAO__DISPONIBILIDADE, oldDisponibilidade, disponibilidade));
			}
		}
		return disponibilidade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publicacao basicGetDisponibilidade() {
		return disponibilidade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisponibilidade(Publicacao newDisponibilidade) {
		Publicacao oldDisponibilidade = disponibilidade;
		disponibilidade = newDisponibilidade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PUBLICACAO__DISPONIBILIDADE, oldDisponibilidade, disponibilidade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PUBLICACAO__NOME_DO_EXMPLAR:
				return getNomeDoExmplar();
			case ModelPackage.PUBLICACAO__DISPONIBILIDADE:
				if (resolve) return getDisponibilidade();
				return basicGetDisponibilidade();
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
			case ModelPackage.PUBLICACAO__NOME_DO_EXMPLAR:
				setNomeDoExmplar(newValue);
				return;
			case ModelPackage.PUBLICACAO__DISPONIBILIDADE:
				setDisponibilidade((Publicacao)newValue);
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
			case ModelPackage.PUBLICACAO__NOME_DO_EXMPLAR:
				setNomeDoExmplar(NOME_DO_EXMPLAR_EDEFAULT);
				return;
			case ModelPackage.PUBLICACAO__DISPONIBILIDADE:
				setDisponibilidade((Publicacao)null);
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
			case ModelPackage.PUBLICACAO__NOME_DO_EXMPLAR:
				return NOME_DO_EXMPLAR_EDEFAULT == null ? nomeDoExmplar != null : !NOME_DO_EXMPLAR_EDEFAULT.equals(nomeDoExmplar);
			case ModelPackage.PUBLICACAO__DISPONIBILIDADE:
				return disponibilidade != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (NomeDoExmplar: ");
		result.append(nomeDoExmplar);
		result.append(')');
		return result.toString();
	}

} //PublicacaoImpl
