# A megamodel of EMF-based code generation.

Code examples are given in the folder "code".
Textual explanations can be found in "text".
Every artifact type and relation is covered by multiple text resources and multiple code examples.

## Reproducing code examples

Demo projects are ...
 * downloaded from www.informit.com/store/emf-eclipse-modeling-framework-9780321331885 
 * built in a separate folder. 
 * analyzed using the code and following steps given in a [process ](tools/qegal/org.softlang.qegal/src/main/java/org/softlang/qegal/qmodles/QModelProcessLocal.java#L38). 

Wild projects are ....
 * listed as corpora at 
 * analyzed using a dedicated [process]([local process ](tools/qegal/org.softlang.qegal/src/main/java/org/softlang/qegal/qmodles/QModelProcess.java)
 * queried using the linked set of [inference rules](tools/qegal/org.softlang.qegal/src/main/java/org/softlang/qegal/qmodles/modelCodeGeneration/rules). 
 
Results from both types can be found in "code" as corpus-specific artifacts.