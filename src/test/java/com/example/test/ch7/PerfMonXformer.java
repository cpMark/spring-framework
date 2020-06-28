package com.example.test.ch7;

import javassist.*;

import java.io.ByteArrayInputStream;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

public class PerfMonXformer implements ClassFileTransformer {
	@Override
	public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
		byte[] transformed = null;
		System.out.println("Transforming " + className);
		ClassPool pool = ClassPool.getDefault();
		CtClass cl = null;

		try {
			cl = pool.makeClass(new ByteArrayInputStream(classfileBuffer));
			if (cl.isInterface() == false) {
				CtBehavior[] methods = cl.getDeclaredBehaviors();
				for (int i = 0; i < methods.length; i++) {
					if (methods[i].isEmpty() == false) {
						// 修改method字节码
						doMethod(methods[i]);
					}
				}

				transformed = cl.toBytecode();
			}
		} catch (Exception e) {
			System.out.println("Could not instrument " + className + ", exception : " + e.getMessage());
		} finally {
			if (cl != null) {
				cl.detach();
			}
		}
		return transformed;
	}

	private void doMethod(CtBehavior method) throws NotFoundException, CannotCompileException {
		method.insertBefore("long startTime = System.nanoTime();");
		method.insertAfter(" System.out.println('leave "+method.getName()+" and time: (System.nanoTime() - startTime));");
	}
}
