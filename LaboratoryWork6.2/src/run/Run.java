clipse.osgi.framework.util.SecureAction.start(SecureAction.java:404)
	at org.eclipse.osgi.internal.hooks.EclipseLazyStarter.postFindLocalClass(EclipseLazyStarter.java:117)
	at org.eclipse.osgi.internal.loader.classpath.ClasspathManager.findLocalClass(ClasspathManager.java:570)
	at org.eclipse.osgi.internal.loader.ModuleClassLoader.findLocalClass(ModuleClassLoader.java:335)
	at org.eclipse.osgi.internal.loader.BundleLoader.findLocalClass(BundleLoader.java:384)
	at org.eclipse.osgi.internal.loader.sources.SingleSourcePackage.loadClass(SingleSourcePackage.java:41)
	at org.eclipse.osgi.internal.loader.BundleLoader.findClass0(BundleLoader.java:471)
	at org.eclipse.osgi.internal.loader.BundleLoader.findClass(BundleLoader.java:403)
	at org.eclipse.osgi.internal.loader.ModuleClassLoader.loadClass(ModuleClassLoader.java:168)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520)
	at org.eclipse.ui.internal.ide.application.IDEApplication.start(IDEApplication.java:153)
	at org.eclipse.equinox.internal.app.EclipseAppHandle.run(EclipseAppHandle.java:203)
	at org.eclipse.core.runtime.internal.adaptor.EclipseAppLauncher.runApplication(EclipseAppLauncher.java:136)
	at org.eclipse.core.runtime.internal.adaptor.EclipseAppLauncher.start(EclipseAppLauncher.java:104)
	at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:401)
	at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:255)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.eclipse.equinox.launcher.Main.invokeFramework(Main.java:659)
	at org.eclipse.equinox.launcher.Main.basicRun(Main.java:596)
	at org.eclipse.equinox.launcher.Main.run(Main.java:1467)

!ENTRY org.eclipse.jface 2 0 2022-05-13 06:03:29.505
!MESSAGE Keybinding conflicts occurred.  They may interfere with normal accelerator operation.
!SUBENTRY 1 org.eclipse.jface 2 0 2022-05-13 06:03:29.505
!MESSAGE A conflict occurred for CTRL+SHIFT+T:
Binding(CTRL+SHIFT+T,
	ParameterizedCommand(Command(org.eclipse.jdt.ui.navigate.open.type,Open Type,
		Open a type in a Java 