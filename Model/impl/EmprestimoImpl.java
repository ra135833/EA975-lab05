/**
 */
package Model.impl;

import Model.Emprestimo;
import Model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emprestimo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.EmprestimoImpl#getStatusDeAtraso <em>Status De Atraso</em>}</li>
 *   <li>{@link Model.impl.EmprestimoImpl#getDiasDeAtraso <em>Dias De Atraso</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmprestimoImpl extends MinimalEObjectImpl.Container implements Emprestimo {
	/**
	 * The cached value of the '{@link #getStatusDeAtraso() <em>Status De Atraso</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDeAtraso()
	 * @generated
	 * @ordered
	 */
	protected Emprestimo statusDeAtraso;

	/**
	 * The cached value of the '{@link #getDiasDeAtraso() <em>Dias De Atraso</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiasDeAtraso()
	 * @generated
	 * @ordered
	 */
	protected Emprestimo diasDeAtraso;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmprestimoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EMPRESTIMO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emprestimo getStatusDeAtraso() {
		if (statusDeAtraso != null && statusDeAtraso.eIsProxy()) {
			InternalEObject oldStatusDeAtraso = (InternalEObject)statusDeAtraso;
			statusDeAtraso = (Emprestimo)eResolveProxy(oldStatusDeAtraso);
			if (statusDeAtraso != oldStatusDeAtraso) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.EMPRESTIMO__STATUS_DE_ATRASO, oldStatusDeAtraso, statusDeAtraso));
			}
		}
		return statusDeAtraso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emprestimo basicGetStatusDeAtraso() {
		return statusDeAtraso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusDeAtraso(Emprestimo newStatusDeAtraso) {
		Emprestimo oldStatusDeAtraso = statusDeAtraso;
		statusDeAtraso = newStatusDeAtraso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPRESTIMO__STATUS_DE_ATRASO, oldStatusDeAtraso, statusDeAtraso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emprestimo getDiasDeAtraso() {
		if (diasDeAtraso != null && diasDeAtraso.eIsProxy()) {
			InternalEObject oldDiasDeAtraso = (InternalEObject)diasDeAtraso;
			diasDeAtraso = (Emprestimo)eResolveProxy(oldDiasDeAtraso);
			if (diasDeAtraso != oldDiasDeAtraso) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.EMPRESTIMO__DIAS_DE_ATRASO, oldDiasDeAtraso, diasDeAtraso));
			}
		}
		return diasDeAtraso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emprestimo basicGetDiasDeAtraso() {
		return diasDeAtraso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiasDeAtraso(Emprestimo newDiasDeAtraso) {
		Emprestimo oldDiasDeAtraso = diasDeAtraso;
		diasDeAtraso = newDiasDeAtraso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPRESTIMO__DIAS_DE_ATRASO, oldDiasDeAtraso, diasDeAtraso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void CalculaMulta() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.EMPRESTIMO__STATUS_DE_ATRASO:
				if (resolve) return getStatusDeAtraso();
				return basicGetStatusDeAtraso();
			case ModelPackage.EMPRESTIMO__DIAS_DE_ATRASO:
				if (resolve) return getDiasDeAtraso();
				return basicGetDiasDeAtraso();
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
			case ModelPackage.EMPRESTIMO__STATUS_DE_ATRASO:
				setStatusDeAtraso((Emprestimo)newValue);
				return;
			case ModelPackage.EMPRESTIMO__DIAS_DE_ATRASO:
				setDiasDeAtraso((Emprestimo)newValue);
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
			case ModelPackage.EMPRESTIMO__STATUS_DE_ATRASO:
				setStatusDeAtraso((Emprestimo)null);
				return;
			case ModelPackage.EMPRESTIMO__DIAS_DE_ATRASO:
				setDiasDeAtraso((Emprestimo)null);
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
			case ModelPackage.EMPRESTIMO__STATUS_DE_ATRASO:
				return statusDeAtraso != null;
			case ModelPackage.EMPRESTIMO__DIAS_DE_ATRASO:
				return diasDeAtraso != null;
		}
		return super.eIsSet(featureID);
	}

} //EmprestimoImpl
