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

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Courses'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Upload courses'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Courses Upload courses/input_File_coursefilechoose'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Courses Upload courses/div_Search repository_yui_3_17_2_1_16415694_6e4ce4'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Courses Upload courses/button_Select this file'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Courses Upload courses/input_Allow resets_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Courses Upload courses/input_Allow resets_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Courses Upload courses/td_Course created'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Courses Upload courses/button_Continue'))

