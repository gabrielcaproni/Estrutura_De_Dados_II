Template inclusion failed (for parameter value "/Templates/Licenses/license-default.txt"):
Cannot find 'jar:file:/C:/Users/Gabriel%20Pegoraro/Desktop/netbeans-18-bin/netbeans/ide/modules/org-netbeans-modules-projectui.jar!/org/netbeans/modules/project/ui/resources/license-default.txt'

----
FTL stack trace ("~" means nesting-related):
	- Failed at: #include "${project.licensePath}"  [in template "Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java" at line 4, column 1]
----
package com.mycompany.javasorts;

/**
 *
 * @author Gabriel Pegoraro
 */
public class JavaSorts {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
