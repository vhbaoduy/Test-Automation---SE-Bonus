import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login as admin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Site administration'))

WebUI.navigateToUrl('http://localhost/admin/search.php')

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Plugins'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Manage repositories'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Plugins Reposito_4b46d1/a_Settings'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Plugins Reposito_90c615/button_Create a repository instance'))

WebUI.setText(findTestObject('Object Repository/Page_Moodle Administration Plugins Reposito_b84f2c/input_Name_name'), 'csv')

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Plugins Reposito_b84f2c/input_Allow relative files_relativefiles'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Plugins Reposito_b84f2c/input_This allows all files in the reposito_ba0d3d'))

