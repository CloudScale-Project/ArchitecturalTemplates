/**
 */
package org.scaledl.architecturaltemplates.instance.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.scaledl.architecturaltemplates.instance.ATInstance;
import org.scaledl.architecturaltemplates.instance.Component2Role;
import org.scaledl.architecturaltemplates.instance.EnumParameter;
import org.scaledl.architecturaltemplates.instance.FloatParameter;
import org.scaledl.architecturaltemplates.instance.InstancePackage;
import org.scaledl.architecturaltemplates.instance.IntegerParameter;
import org.scaledl.architecturaltemplates.instance.ParameterValue;
import org.scaledl.architecturaltemplates.instance.Role2Component;
import org.scaledl.architecturaltemplates.instance.Role2Resource;
import org.scaledl.architecturaltemplates.instance.StringParameter;

import de.uka.ipd.sdq.identifier.Identifier;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 * @see org.scaledl.architecturaltemplates.instance.InstancePackage
 * @generated
 */
public class InstanceAdapterFactory extends AdapterFactoryImpl {

    /**
     * The cached model package.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected static InstancePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public InstanceAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = InstancePackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc
     * --> This implementation returns <code>true</code> if the object is either the model's package
     * or is an instance object of the model. <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    protected InstanceSwitch<Adapter> modelSwitch = new InstanceSwitch<Adapter>() {

        @Override
        public Adapter caseATInstance(ATInstance object) {
            return createATInstanceAdapter();
        }

        @Override
        public Adapter caseComponent2Role(Component2Role object) {
            return createComponent2RoleAdapter();
        }

        @Override
        public Adapter caseRole2Component(Role2Component object) {
            return createRole2ComponentAdapter();
        }

        @Override
        public Adapter caseParameterValue(ParameterValue object) {
            return createParameterValueAdapter();
        }

        @Override
        public Adapter caseEnumParameter(EnumParameter object) {
            return createEnumParameterAdapter();
        }

        @Override
        public Adapter caseIntegerParameter(IntegerParameter object) {
            return createIntegerParameterAdapter();
        }

        @Override
        public Adapter caseFloatParameter(FloatParameter object) {
            return createFloatParameterAdapter();
        }

        @Override
        public <T> Adapter caseStringParameter(StringParameter<T> object) {
            return createStringParameterAdapter();
        }

        @Override
        public Adapter caseRole2Resource(Role2Resource object) {
            return createRole2ResourceAdapter();
        }

        @Override
        public Adapter caseIdentifier(Identifier object) {
            return createIdentifierAdapter();
        }

        @Override
        public Adapter caseNamedElement(NamedElement object) {
            return createNamedElementAdapter();
        }

        @Override
        public Adapter caseEntity(Entity object) {
            return createEntityAdapter();
        }

        @Override
        public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.scaledl.architecturaltemplates.instance.ATInstance <em>AT Instance</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.scaledl.architecturaltemplates.instance.ATInstance
     * @generated
     */
    public Adapter createATInstanceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.scaledl.architecturaltemplates.instance.Component2Role <em>Component2 Role</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * @return the new adapter.
     * @see org.scaledl.architecturaltemplates.instance.Component2Role
     * @generated
     */
    public Adapter createComponent2RoleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.scaledl.architecturaltemplates.instance.Role2Component <em>Role2 Component</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * @return the new adapter.
     * @see org.scaledl.architecturaltemplates.instance.Role2Component
     * @generated
     */
    public Adapter createRole2ComponentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.scaledl.architecturaltemplates.instance.ParameterValue <em>Parameter Value</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * @return the new adapter.
     * @see org.scaledl.architecturaltemplates.instance.ParameterValue
     * @generated
     */
    public Adapter createParameterValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.scaledl.architecturaltemplates.instance.EnumParameter <em>Enum Parameter</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * @return the new adapter.
     * @see org.scaledl.architecturaltemplates.instance.EnumParameter
     * @generated
     */
    public Adapter createEnumParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.scaledl.architecturaltemplates.instance.IntegerParameter <em>Integer Parameter</em>}'.
     * <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.scaledl.architecturaltemplates.instance.IntegerParameter
     * @generated
     */
    public Adapter createIntegerParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.scaledl.architecturaltemplates.instance.FloatParameter <em>Float Parameter</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * @return the new adapter.
     * @see org.scaledl.architecturaltemplates.instance.FloatParameter
     * @generated
     */
    public Adapter createFloatParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.scaledl.architecturaltemplates.instance.StringParameter <em>String Parameter</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily
     * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.scaledl.architecturaltemplates.instance.StringParameter
     * @generated
     */
    public Adapter createStringParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.scaledl.architecturaltemplates.instance.Role2Resource <em>Role2 Resource</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     * @return the new adapter.
     * @see org.scaledl.architecturaltemplates.instance.Role2Resource
     * @generated
     */
    public Adapter createRole2ResourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier <em>Identifier</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.uka.ipd.sdq.identifier.Identifier
     * @generated
     */
    public Adapter createIdentifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.pcm.core.entity.NamedElement <em>Named Element</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.core.entity.NamedElement
     * @generated
     */
    public Adapter createNamedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.core.entity.Entity <em>Entity</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.core.entity.Entity
     * @generated
     */
    public Adapter createEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc --> This default
     * implementation returns null. <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // InstanceAdapterFactory
