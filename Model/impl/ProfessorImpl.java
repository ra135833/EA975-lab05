/**
 */
package Model.impl;

import Model.ModelPackage;
import Model.Professor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Professor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.ProfessorImpl#getLimiteDeTempoProf <em>Limite De Tempo Prof</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfessorImpl extends MinimalEObjectImpl.Container implements Professor {
	/**
	 * The cached value of the '{@link #getLimiteDeTempoProf() <em>Limite De Tempo Prof</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimiteDeTempoProf()
	 * @generated
	 * @ordered
	 */
	protected Professor limiteDeTempoProf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PROFESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professor getLimiteDeTempoProf() {
		if (limiteDeTempoProf != null && limiteDeTempoProf.eIsProxy()) {
			InternalEObject oldLimiteDeTempoProf = (InternalEObject)limiteDeTempoProf;
			limiteDeTempoProf = (Professor)eResolveProxy(oldLimiteDeTempoProf);
			if (limiteDeTempoProf != oldLimiteDeTempoProf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.PROFESSOR__LIMITE_DE_TEMPO_PROF, oldLimiteDeTempoProf, limiteDeTempoProf));
			}
		}
		return limiteDeTempoProf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professor basicGetLimiteDeTempoProf() {
		return limiteDeTempoProf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimiteDeTempoProf(Professor newLimiteDeTempoProf) {
		Professor oldLimiteDeTempoProf = limiteDeTempoProf;
		limiteDeTempoProf = newLimiteDeTempoProf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROFESSOR__LIMITE_DE_TEMPO_PROF, oldLimiteDeTempoProf, limiteDeTempoProf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void RealisaBloqueio() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void RealisaDesbloqueio() {
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
			case ModelPackage.PROFESSOR__LIMITE_DE_TEMPO_PROF:
				if (resolve) return getLimiteDeTempoProf();
				return basicGetLimiteDeTempoProf();
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
			case ModelPackage.PROFESSOR__LIMITE_DE_TEMPO_PROF:
				setLimiteDeTempoProf((Professor)newValue);
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
			case ModelPackage.PROFESSOR__LIMITE_DE_TEMPO_PROF:
				setLimiteDeTempoProf((Professor)null);
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
			case ModelPackage.PROFESSOR__LIMITE_DE_TEMPO_PROF:
				return limiteDeTempoProf != null;
		}
		return super.eIsSet(featureID);
	}

} //ProfessorImpl
