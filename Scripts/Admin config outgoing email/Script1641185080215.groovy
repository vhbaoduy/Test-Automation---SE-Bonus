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

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Server'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Outgoing mail configuration'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Server Email Out_d1e642/input_smtphosts_s__smtphosts'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Server Email Out_d1e642/div_Default Empty        Give the full name_bd522a'))

WebUI.setText(findTestObject('Object Repository/Page_Moodle Administration Server Email Out_d1e642/input_smtphosts_s__smtphosts'), 
    'smtp.gmail.com:587')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Moodle Administration Server Email Out_d1e642/select_None            SSL            TLS'), 
    'tls', true)

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Server Email Out_d1e642/div_Default Empty        If you have specif_501af3'))

WebUI.setText(findTestObject('Object Repository/Page_Moodle Administration Server Email Out_d1e642/input_smtpuser_s__smtpuser'), 
    'moodle.testing.team@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Server Email Out_d1e642/span_'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Moodle Administration Server Email Out_d1e642/input_smtppass_s__smtppass'), 
    'vmGLb5mQ4V2AGvF7YR/3BQ==')

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Server Email Out_d1e642/input_noreplyaddress_s__noreplyaddress'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Server Email Out_d1e642/div_No-reply address                    nor_e2e2c9'))

WebUI.setText(findTestObject('Object Repository/Page_Moodle Administration Server Email Out_d1e642/input_noreplyaddress_s__noreplyaddress'), 
    'moodle.testing.team@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Server Email Out_d1e642/button_Save changes'))

