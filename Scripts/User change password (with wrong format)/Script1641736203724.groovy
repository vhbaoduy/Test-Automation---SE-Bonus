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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/')

WebUI.click(findTestObject('Object Repository/Page_My Moodle/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_My Moodle Log in to the site/input_Username_username'), 'trongle')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_My Moodle Log in to the site/input_Password_password'), 'Ta6u/19GniC0jLl2J4N0KA==')

WebUI.click(findTestObject('Object Repository/Page_My Moodle Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/img_Trong Le_userpicture defaultuserpic'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Profile'))

WebUI.click(findTestObject('Object Repository/Page_Trong Le Public profile/a_Message_action-menu-toggle-2'))

WebUI.click(findTestObject('Object Repository/Page_Trong Le Public profile/a_Change password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Change password/input_Current password_password'), 'Ta6u/19GniC0jLl2J4N0KA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Change password/input_New password_newpassword1'), 'QJblfja5Cso=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Change password/input_New password (again)_newpassword2'), 
    'QJblfja5Cso=')

WebUI.click(findTestObject('Object Repository/Page_Change password/input_New password (again)_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_Change password/div_The password must have at least 1 speci_80717b'))

