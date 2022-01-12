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

WebUI.callTestCase(findTestCase('Login as user (student)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Trong Le_avatar current'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Profile'))

WebUI.click(findTestObject('Object Repository/Page_Trong Le Public profile/i_Message_icon fa fa-cog fa-fw'))

WebUI.click(findTestObject('Object Repository/Page_Trong Le Public profile/a_Change password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Change password/input_Current password_password'), '3t5OwH/+bwwlEvOXGw7/rg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Change password/input_New password_newpassword1'), 'qKcRfOo2JT0RHRey+Jl3+Q==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Change password/input_New password (again)_newpassword2'), 
    'xIMlKdBFRc8=')

WebUI.click(findTestObject('Object Repository/Page_Change password/input_New password (again)_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_Change password/div_These passwords do not match'))

