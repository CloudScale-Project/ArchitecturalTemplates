/**
 */
package org.scaledl.architecturaltemplates.type.impl;

import org.eclipse.emf.ecore.EClass;
import org.scaledl.architecturaltemplates.type.IsolatedPCMTemplateCompletionParameter;
import org.scaledl.architecturaltemplates.type.TemplateProvidingEntity;
import org.scaledl.architecturaltemplates.type.TypePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Isolated PCM Template Completion Parameter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.scaledl.architecturaltemplates.type.impl.IsolatedPCMTemplateCompletionParameterImpl#getTemplateFileURI
 * <em>Template File URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IsolatedPCMTemplateCompletionParameterImpl extends PCMBlackboardCompletionParameterImpl
        implements IsolatedPCMTemplateCompletionParameter {

    /**
     * The default value of the '{@link #getTemplateFileURI() <em>Template File URI</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getTemplateFileURI()
     * @generated
     * @ordered
     */
    protected static final String TEMPLATE_FILE_URI_EDEFAULT = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected IsolatedPCMTemplateCompletionParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.ISOLATED_PCM_TEMPLATE_COMPLETION_PARAMETER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getTemplateFileURI() {
        return (String) this.eDynamicGet(TypePackage.ISOLATED_PCM_TEMPLATE_COMPLETION_PARAMETER__TEMPLATE_FILE_URI,
                TypePackage.Literals.TEMPLATE_PROVIDING_ENTITY__TEMPLATE_FILE_URI, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setTemplateFileURI(final String newTemplateFileURI) {
        this.eDynamicSet(TypePackage.ISOLATED_PCM_TEMPLATE_COMPLETION_PARAMETER__TEMPLATE_FILE_URI,
                TypePackage.Literals.TEMPLATE_PROVIDING_ENTITY__TEMPLATE_FILE_URI, newTemplateFileURI);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case TypePackage.ISOLATED_PCM_TEMPLATE_COMPLETION_PARAMETER__TEMPLATE_FILE_URI:
            return this.getTemplateFileURI();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case TypePackage.ISOLATED_PCM_TEMPLATE_COMPLETION_PARAMETER__TEMPLATE_FILE_URI:
            this.setTemplateFileURI((String) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case TypePackage.ISOLATED_PCM_TEMPLATE_COMPLETION_PARAMETER__TEMPLATE_FILE_URI:
            this.setTemplateFileURI(TEMPLATE_FILE_URI_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case TypePackage.ISOLATED_PCM_TEMPLATE_COMPLETION_PARAMETER__TEMPLATE_FILE_URI:
            return TEMPLATE_FILE_URI_EDEFAULT == null ? this.getTemplateFileURI() != null
                    : !TEMPLATE_FILE_URI_EDEFAULT.equals(this.getTemplateFileURI());
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
        if (baseClass == TemplateProvidingEntity.class) {
            switch (derivedFeatureID) {
            case TypePackage.ISOLATED_PCM_TEMPLATE_COMPLETION_PARAMETER__TEMPLATE_FILE_URI:
                return TypePackage.TEMPLATE_PROVIDING_ENTITY__TEMPLATE_FILE_URI;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
        if (baseClass == TemplateProvidingEntity.class) {
            switch (baseFeatureID) {
            case TypePackage.TEMPLATE_PROVIDING_ENTITY__TEMPLATE_FILE_URI:
                return TypePackage.ISOLATED_PCM_TEMPLATE_COMPLETION_PARAMETER__TEMPLATE_FILE_URI;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} // IsolatedPCMTemplateCompletionParameterImpl
