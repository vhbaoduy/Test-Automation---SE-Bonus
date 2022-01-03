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

WebUI.click(findTestObject('Object Repository/Page_MT Administration Search/a_Users'))

WebUI.click(findTestObject('Object Repository/Page_MT Administration Search/a_Upload users'))

WebUI.click(findTestObject('Page_Moodle Administration Users Accounts Upload users/input_File_userfilechoose'))

WebUI.click(findTestObject('Page_Moodle Administration Users Accounts Upload users/a_csv'))

WebUI.click(findTestObject('Page_Moodle Administration Users Accounts Upload users/div_Search repository_fp-reficons2'))

WebUI.click(findTestObject('Page_Moodle Administration Users Accounts Upload users/button_Select this file'))

WebUI.click(findTestObject('Object Repository/Page_MT Administration Users Accounts Upload users/input_Preview rows_submitbutton'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MT Administration Users Accounts Upload users/select_Field required in file            Cr_517de1'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MT Administration Users Accounts Upload users/select_Users having a weak password        _b6a197'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Page_MT Administration Users Accounts Upload users/input_Preview rows_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_MT Administration Users Accounts Upload users/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_MT Administration Users Accounts Upload users/a_Admin User'))

WebUI.click(findTestObject('Object Repository/Page_MT Administration Users Accounts Upload users/span_Log out'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Testing/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_Moodle Testing Log in to the site/input_Username_username'), 'student1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Moodle Testing Log in to the site/input_Password_password'), 
    'HeCM15nHKBI=')

WebUI.click(findTestObject('Object Repository/Page_Moodle Testing Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/i_MT_icon fa fa-bell fa-fw'))

WebUI.closeBrowser()

