/**
 */
package Model.impl;

import Model.Funcionario;
import Model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Funcionario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.FuncionarioImpl#getLimiteDeTempoFunc <em>Limite De Tempo Func</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FuncionarioImpl extends MinimalEObjectImpl.Container implements Funcionario {
	/**
	 * The cached value of the '{@link #getLimiteDeTempoFunc() <em>Limite De Tempo Func</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimiteDeTempoFunc()
	 * @generated
	 * @ordered
	 */
	protected Funcionario limiteDeTempoFunc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuncionarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FUNCIONARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Funcionario getLimiteDeTempoFunc() {
		if (limiteDeTempoFunc != null && limiteDeTempoFunc.eIsProxy()) {
			InternalEObject oldLimiteDeTempoFunc = (InternalEObject)limiteDeTempoFunc;
			limiteDeTempoFunc = (Funcionario)eResolveProxy(oldLimiteDeTempoFunc);
			if (limiteDeTempoFunc != oldLimiteDeTempoFunc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.FUNCIONARIO__LIMITE_DE_TEMPO_FUNC, oldLimiteDeTempoFunc, limiteDeTempoFunc));
			}
		}
		return limiteDeTempoFunc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Funcionario basicGetLimiteDeTempoFunc() {
		return limiteDeTempoFunc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimiteDeTempoFunc(Funcionario newLimiteDeTempoFunc) {
		Funcionario oldLimiteDeTempoFunc = limiteDeTempoFunc;
		limiteDeTempoFunc = newLimiteDeTempoFunc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FUNCIONARIO__LIMITE_DE_TEMPO_FUNC, oldLimiteDeTempoFunc, limiteDeTempoFunc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.FUNCIONARIO__LIMITE_DE_TEMPO_FUNC:
				if (resolve) return getLimiteDeTempoFunc();
				return basicGetLimiteDeTempoFunc();
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
			case ModelPackage.FUNCIONARIO__LIMITE_DE_TEMPO_FUNC:
				setLimiteDeTempoFunc((Funcionario)newValue);
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
			case ModelPackage.FUNCIONARIO__LIMITE_DE_TEMPO_FUNC:
				setLimiteDeTempoFunc((Funcionario)null);
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
			case ModelPackage.FUNCIONARIO__LIMITE_DE_TEMPO_FUNC:
				return limiteDeTempoFunc != null;
		}
		return super.eIsSet(featureID);
	}

} //FuncionarioImpl
