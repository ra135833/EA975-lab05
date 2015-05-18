/**
 */
package Model.impl;

import Model.Aluno;
import Model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aluno</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.AlunoImpl#getLimiteDeTempoAluno <em>Limite De Tempo Aluno</em>}</li>
 *   <li>{@link Model.impl.AlunoImpl#getStatusDeSuspens <em>Status De Suspens</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlunoImpl extends MinimalEObjectImpl.Container implements Aluno {
	/**
	 * The cached value of the '{@link #getLimiteDeTempoAluno() <em>Limite De Tempo Aluno</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimiteDeTempoAluno()
	 * @generated
	 * @ordered
	 */
	protected Aluno limiteDeTempoAluno;

	/**
	 * The cached value of the '{@link #getStatusDeSuspens() <em>Status De Suspens</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDeSuspens()
	 * @generated
	 * @ordered
	 */
	protected Aluno statusDeSuspens;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlunoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ALUNO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aluno getLimiteDeTempoAluno() {
		if (limiteDeTempoAluno != null && limiteDeTempoAluno.eIsProxy()) {
			InternalEObject oldLimiteDeTempoAluno = (InternalEObject)limiteDeTempoAluno;
			limiteDeTempoAluno = (Aluno)eResolveProxy(oldLimiteDeTempoAluno);
			if (limiteDeTempoAluno != oldLimiteDeTempoAluno) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ALUNO__LIMITE_DE_TEMPO_ALUNO, oldLimiteDeTempoAluno, limiteDeTempoAluno));
			}
		}
		return limiteDeTempoAluno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aluno basicGetLimiteDeTempoAluno() {
		return limiteDeTempoAluno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimiteDeTempoAluno(Aluno newLimiteDeTempoAluno) {
		Aluno oldLimiteDeTempoAluno = limiteDeTempoAluno;
		limiteDeTempoAluno = newLimiteDeTempoAluno;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALUNO__LIMITE_DE_TEMPO_ALUNO, oldLimiteDeTempoAluno, limiteDeTempoAluno));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aluno getStatusDeSuspens() {
		if (statusDeSuspens != null && statusDeSuspens.eIsProxy()) {
			InternalEObject oldStatusDeSuspens = (InternalEObject)statusDeSuspens;
			statusDeSuspens = (Aluno)eResolveProxy(oldStatusDeSuspens);
			if (statusDeSuspens != oldStatusDeSuspens) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ALUNO__STATUS_DE_SUSPENS, oldStatusDeSuspens, statusDeSuspens));
			}
		}
		return statusDeSuspens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aluno basicGetStatusDeSuspens() {
		return statusDeSuspens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusDeSuspens(Aluno newStatusDeSuspens) {
		Aluno oldStatusDeSuspens = statusDeSuspens;
		statusDeSuspens = newStatusDeSuspens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALUNO__STATUS_DE_SUSPENS, oldStatusDeSuspens, statusDeSuspens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ALUNO__LIMITE_DE_TEMPO_ALUNO:
				if (resolve) return getLimiteDeTempoAluno();
				return basicGetLimiteDeTempoAluno();
			case ModelPackage.ALUNO__STATUS_DE_SUSPENS:
				if (resolve) return getStatusDeSuspens();
				return basicGetStatusDeSuspens();
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
			case ModelPackage.ALUNO__LIMITE_DE_TEMPO_ALUNO:
				setLimiteDeTempoAluno((Aluno)newValue);
				return;
			case ModelPackage.ALUNO__STATUS_DE_SUSPENS:
				setStatusDeSuspens((Aluno)newValue);
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
			case ModelPackage.ALUNO__LIMITE_DE_TEMPO_ALUNO:
				setLimiteDeTempoAluno((Aluno)null);
				return;
			case ModelPackage.ALUNO__STATUS_DE_SUSPENS:
				setStatusDeSuspens((Aluno)null);
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
			case ModelPackage.ALUNO__LIMITE_DE_TEMPO_ALUNO:
				return limiteDeTempoAluno != null;
			case ModelPackage.ALUNO__STATUS_DE_SUSPENS:
				return statusDeSuspens != null;
		}
		return super.eIsSet(featureID);
	}

} //AlunoImpl
