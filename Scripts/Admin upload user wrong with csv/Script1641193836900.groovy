import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('Login as admin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Site administration'))

WebUI.click(findTestObject('Object Repository/Page_MT Administration Search/a_Users'))

WebUI.click(findTestObject('Object Repository/Page_MT Administration Search/a_Upload users'))

WebUI.click(findTestObject('Page_Moodle Administration Users Accounts Upload users/input_File_userfilechoose'))

WebUI.click(findTestObject('Object Repository/Page_MT Administration Users Accounts Upload users/span_csv'))

WebUI.click(findTestObject('Object Repository/Page_MT Administration Users Accounts Upload users/div_Search repository_yui_3_17_2_1_16411467_dc884e'))

WebUI.click(findTestObject('Object Repository/Page_MT Administration Users Accounts Upload users/button_Select this file'))

WebUI.click(findTestObject('Object Repository/Page_MT Administration Users Accounts Upload users/input_Preview rows_submitbutton'))

WebUI.verifyEqual(WebUI.getText(findTestObject('Object Repository/Page_Error/p_An error occurred while loading the CSV file Invalid CSV file format - number of columns is not constant')).toString(), 
    'An error occurred while loading the CSV file: Invalid CSV file format - number of columns is not constant!')

WebUI.closeBrowser()

