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

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Site home'))

WebUI.navigateToUrl('http://localhost/?redirect=0')

WebUI.click(findTestObject('Object Repository/Page_My Moodle/a_Thit k phn mm'))

WebUI.click(findTestObject('Object Repository/Page_Course Thit k phn mm/a_Thit k phn mm_action-menu-toggle-2'))

WebUI.click(findTestObject('Object Repository/Page_Course Thit k phn mm/a_Edit settings'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Edit course settings/select_Hide            Show'), '1', 
    true)

WebUI.click(findTestObject('Object Repository/Page_Edit course settings/input__saveanddisplay'))

WebUI.click(findTestObject('Object Repository/Page_Course Thit k phn mm/span_Moodle'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Admin Team'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Switch role to'))

WebUI.click(findTestObject('Object Repository/Page_Switch role to/button_Student'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Site home'))

WebUI.click(findTestObject('Object Repository/Page_My Moodle/a_Thit k phn mm'))

