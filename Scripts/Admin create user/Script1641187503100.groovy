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

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Site administration'))

WebUI.navigateToUrl('http://localhost/admin/search.php')

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Users'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Add a new user'))

WebUI.setText(findTestObject('Object Repository/Page_Moodle Administration Users Accounts A_0fbd97/input_Username_username'), 
    'trongle')

WebUI.click(findTestObject('Page_Moodle Administration Users Accounts Add a new user/a_Click to enter text'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Moodle Administration Users Accounts A_0fbd97/input_New password_newpassword'), 
    'Ta6u/19GniC0jLl2J4N0KA==')

WebUI.setText(findTestObject('Object Repository/Page_Moodle Administration Users Accounts A_0fbd97/input_First name_firstname'), 
    'Trong')

WebUI.setText(findTestObject('Object Repository/Page_Moodle Administration Users Accounts A_0fbd97/input_Surname_lastname'), 
    'Le')

WebUI.setText(findTestObject('Object Repository/Page_Moodle Administration Users Accounts A_0fbd97/input_Email address_email'), 
    'quoctrongle2001@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Users Accounts A_0fbd97/input_Address_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Users Accounts B_4543d8/div_Changes saved'))

WebUI.click(findTestObject('Object Repository/Page_MT Administration Users Accounts Upload users/a_Admin User'))

WebUI.click(findTestObject('Object Repository/Page_MT Administration Users Accounts Upload users/span_Log out'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Testing/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_Moodle Testing Log in to the site/input_Username_username'), 'trongle')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Moodle Testing Log in to the site/input_Password_password'), 
    'Ta6u/19GniC0jLl2J4N0KA==')

WebUI.click(findTestObject('Object Repository/Page_Moodle Testing Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/i_MT_icon fa fa-bell fa-fw'))

