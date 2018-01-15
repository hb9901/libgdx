/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btMultiBodyConstraintSolver extends btSequentialImpulseConstraintSolver {
	private long swigCPtr;
	
	protected btMultiBodyConstraintSolver(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, DynamicsJNI.btMultiBodyConstraintSolver_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btMultiBodyConstraintSolver, normally you should not need this constructor it's intended for low-level usage. */
	public btMultiBodyConstraintSolver(long cPtr, boolean cMemoryOwn) {
		this("btMultiBodyConstraintSolver", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(DynamicsJNI.btMultiBodyConstraintSolver_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btMultiBodyConstraintSolver obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				DynamicsJNI.delete_btMultiBodyConstraintSolver(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public long operatorNew(long sizeInBytes) {
    return DynamicsJNI.btMultiBodyConstraintSolver_operatorNew__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDelete(long ptr) {
    DynamicsJNI.btMultiBodyConstraintSolver_operatorDelete__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNew(long arg0, long ptr) {
    return DynamicsJNI.btMultiBodyConstraintSolver_operatorNew__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDelete(long arg0, long arg1) {
    DynamicsJNI.btMultiBodyConstraintSolver_operatorDelete__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public long operatorNewArray(long sizeInBytes) {
    return DynamicsJNI.btMultiBodyConstraintSolver_operatorNewArray__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDeleteArray(long ptr) {
    DynamicsJNI.btMultiBodyConstraintSolver_operatorDeleteArray__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNewArray(long arg0, long ptr) {
    return DynamicsJNI.btMultiBodyConstraintSolver_operatorNewArray__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDeleteArray(long arg0, long arg1) {
    DynamicsJNI.btMultiBodyConstraintSolver_operatorDeleteArray__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public float solveGroupCacheFriendlyFinish(SWIGTYPE_p_p_btCollisionObject bodies, int numBodies, btContactSolverInfo infoGlobal) {
    return DynamicsJNI.btMultiBodyConstraintSolver_solveGroupCacheFriendlyFinish(swigCPtr, this, SWIGTYPE_p_p_btCollisionObject.getCPtr(bodies), numBodies, btContactSolverInfo.getCPtr(infoGlobal), infoGlobal);
  }

  public void solveMultiBodyGroup(SWIGTYPE_p_p_btCollisionObject bodies, int numBodies, SWIGTYPE_p_p_btPersistentManifold manifold, int numManifolds, SWIGTYPE_p_p_btTypedConstraint constraints, int numConstraints, SWIGTYPE_p_p_btMultiBodyConstraint multiBodyConstraints, int numMultiBodyConstraints, btContactSolverInfo info, btIDebugDraw debugDrawer, btDispatcher dispatcher) {
    DynamicsJNI.btMultiBodyConstraintSolver_solveMultiBodyGroup(swigCPtr, this, SWIGTYPE_p_p_btCollisionObject.getCPtr(bodies), numBodies, SWIGTYPE_p_p_btPersistentManifold.getCPtr(manifold), numManifolds, SWIGTYPE_p_p_btTypedConstraint.getCPtr(constraints), numConstraints, SWIGTYPE_p_p_btMultiBodyConstraint.getCPtr(multiBodyConstraints), numMultiBodyConstraints, btContactSolverInfo.getCPtr(info), info, btIDebugDraw.getCPtr(debugDrawer), debugDrawer, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

  public btMultiBodyConstraintSolver() {
    this(DynamicsJNI.new_btMultiBodyConstraintSolver(), true);
  }

}