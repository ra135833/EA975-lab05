/**
 */
package Model.impl;

import Model.Exemplar;
import Model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exemplar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.ExemplarImpl#getStatusDeBloqueio <em>Status De Bloqueio</em>}</li>
 *   <li>{@link Model.impl.ExemplarImpl#getStatusDeReserva <em>Status De Reserva</em>}</li>
 *   <li>{@link Model.impl.ExemplarImpl#getStatusDeEmprestimo <em>Status De Emprestimo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExemplarImpl extends MinimalEObjectImpl.Container implements Exemplar {
	/**
	 * The cached value of the '{@link #getStatusDeBloqueio() <em>Status De Bloqueio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDeBloqueio()
	 * @generated
	 * @ordered
	 */
	protected Exemplar statusDeBloqueio;

	/**
	 * The cached value of the '{@link #getStatusDeReserva() <em>Status De Reserva</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDeReserva()
	 * @generated
	 * @ordered
	 */
	protected Exemplar statusDeReserva;

	/**
	 * The cached value of the '{@link #getStatusDeEmprestimo() <em>Status De Emprestimo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDeEmprestimo()
	 * @generated
	 * @ordered
	 */
	protected Exemplar statusDeEmprestimo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExemplarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EXEMPLAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exemplar getStatusDeBloqueio() {
		if (statusDeBloqueio != null && statusDeBloqueio.eIsProxy()) {
			InternalEObject oldStatusDeBloqueio = (InternalEObject)statusDeBloqueio;
			statusDeBloqueio = (Exemplar)eResolveProxy(oldStatusDeBloqueio);
			if (statusDeBloqueio != oldStatusDeBloqueio) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.EXEMPLAR__STATUS_DE_BLOQUEIO, oldStatusDeBloqueio, statusDeBloqueio));
			}
		}
		return statusDeBloqueio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exemplar basicGetStatusDeBloqueio() {
		return statusDeBloqueio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusDeBloqueio(Exemplar newStatusDeBloqueio) {
		Exemplar oldStatusDeBloqueio = statusDeBloqueio;
		statusDeBloqueio = newStatusDeBloqueio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXEMPLAR__STATUS_DE_BLOQUEIO, oldStatusDeBloqueio, statusDeBloqueio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exemplar getStatusDeReserva() {
		if (statusDeReserva != null && statusDeReserva.eIsProxy()) {
			InternalEObject oldStatusDeReserva = (InternalEObject)statusDeReserva;
			statusDeReserva = (Exemplar)eResolveProxy(oldStatusDeReserva);
			if (statusDeReserva != oldStatusDeReserva) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.EXEMPLAR__STATUS_DE_RESERVA, oldStatusDeReserva, statusDeReserva));
			}
		}
		return statusDeReserva;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exemplar basicGetStatusDeReserva() {
		return statusDeReserva;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusDeReserva(Exemplar newStatusDeReserva) {
		Exemplar oldStatusDeReserva = statusDeReserva;
		statusDeReserva = newStatusDeReserva;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXEMPLAR__STATUS_DE_RESERVA, oldStatusDeReserva, statusDeReserva));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exemplar getStatusDeEmprestimo() {
		if (statusDeEmprestimo != null && statusDeEmprestimo.eIsProxy()) {
			InternalEObject oldStatusDeEmprestimo = (InternalEObject)statusDeEmprestimo;
			statusDeEmprestimo = (Exemplar)eResolveProxy(oldStatusDeEmprestimo);
			if (statusDeEmprestimo != oldStatusDeEmprestimo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.EXEMPLAR__STATUS_DE_EMPRESTIMO, oldStatusDeEmprestimo, statusDeEmprestimo));
			}
		}
		return statusDeEmprestimo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exemplar basicGetStatusDeEmprestimo() {
		return statusDeEmprestimo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusDeEmprestimo(Exemplar newStatusDeEmprestimo) {
		Exemplar oldStatusDeEmprestimo = statusDeEmprestimo;
		statusDeEmprestimo = newStatusDeEmprestimo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXEMPLAR__STATUS_DE_EMPRESTIMO, oldStatusDeEmprestimo, statusDeEmprestimo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.EXEMPLAR__STATUS_DE_BLOQUEIO:
				if (resolve) return getStatusDeBloqueio();
				return basicGetStatusDeBloqueio();
			case ModelPackage.EXEMPLAR__STATUS_DE_RESERVA:
				if (resolve) return getStatusDeReserva();
				return basicGetStatusDeReserva();
			case ModelPackage.EXEMPLAR__STATUS_DE_EMPRESTIMO:
				if (resolve) return getStatusDeEmprestimo();
				return basicGetStatusDeEmprestimo();
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
			case ModelPackage.EXEMPLAR__STATUS_DE_BLOQUEIO:
				setStatusDeBloqueio((Exemplar)newValue);
				return;
			case ModelPackage.EXEMPLAR__STATUS_DE_RESERVA:
				setStatusDeReserva((Exemplar)newValue);
				return;
			case ModelPackage.EXEMPLAR__STATUS_DE_EMPRESTIMO:
				setStatusDeEmprestimo((Exemplar)newValue);
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
			case ModelPackage.EXEMPLAR__STATUS_DE_BLOQUEIO:
				setStatusDeBloqueio((Exemplar)null);
				return;
			case ModelPackage.EXEMPLAR__STATUS_DE_RESERVA:
				setStatusDeReserva((Exemplar)null);
				return;
			case ModelPackage.EXEMPLAR__STATUS_DE_EMPRESTIMO:
				setStatusDeEmprestimo((Exemplar)null);
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
			case ModelPackage.EXEMPLAR__STATUS_DE_BLOQUEIO:
				return statusDeBloqueio != null;
			case ModelPackage.EXEMPLAR__STATUS_DE_RESERVA:
				return statusDeReserva != null;
			case ModelPackage.EXEMPLAR__STATUS_DE_EMPRESTIMO:
				return statusDeEmprestimo != null;
		}
		return super.eIsSet(featureID);
	}

} //ExemplarImpl
