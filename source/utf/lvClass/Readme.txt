Overview:
Demonstrates how to use the Unit Test Framework Toolkit to test VIs that use LabVIEW Classes. This project contains three examples respectively in the Parent, Child, and Class with reference virtual folders.
Requirements: LabVIEW Full Development System, Unit Test Framework Toolkit
Instructions:
1. In the Project Explorer window, right-click the project root and select Expand All from the shortcut menu to display all the items in this project. 
This project contains three examples respectively in the Parent, Child, and Class with reference virtual folders.
   a)	The Parent virtual folder contains a LabVIEW class library file Parent.lvclass, a test file Add Prefix.lvtest, and setup and teardown VIs for this test. This example uses the Add Prefix VI, a member VI of Parent.lvclass, as the VI under test. 
   b)	The Child virtual folder contains a LabVIEW class library file Child.lvclass, a test file Dynamic Dispatch Method.lvtest, and a setup VI for this test Get Class Object VI. This example uses the Dynamic Dispatch Method VI, a member VI of Child.lvclass, as the VI under test. Child.lvclass inherits from Parent.lvclass.
   c)	The Class with reference virtual folder contains a LabVIEW class library file Read File.lvclass, a test file Get File Content.lvtest, and setup and teardown VIs for this test. This example uses the Get File Content VI, a member VI of Read File.lvclass, as the VI under test.
2. Right-click a LabVIEW class library file (Parent.lvclass, Child.lvclass, or Read File.lvclass) and select Unit Tests>>Run from the shortcut menu. You can also execute tests associated with Parent.lvclass and Child.lvclass by right-clicking Parent.lvclass and selecting Unit Tests>>Run Including Children from the shortcut menu because Child.lvclass inherits from Parent.lvclass.
3. View the test results in the Unit Test Framework Results windows.
4. In the Project Explorer window, double-click a test file (Add Prefix.lvtest, Dynamic Dispatch Method.lvtest, or Get File Content.lvtest) to display the Test Properties dialog boxes. Read the comments on the Test Cases page to understand why these tests pass.
5. In the Test Properties dialog boxes, you cannot edit the inputs and outputs of the LabVIEW class data type. However, you can configure the input and expected values of the LabVIEW class type by using the front panel of the VI under test, setup VI, and teardown VI, accessible by clicking the Export Values to VI button, and importing the updated values from the VI under test, setup VI, and teardown VI to the current test case.
