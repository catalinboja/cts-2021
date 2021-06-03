package ro.ase.csie.cts.g1088.testare.teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.csie.cts.g1088.testare.teste.categorii.TestImportant;

@RunWith(Categories.class)
@IncludeCategory({TestImportant.class})
@SuiteClasses({ TestStudent.class, TestStudentAlteTeste.class })
public class AllTestsImportante {

}
