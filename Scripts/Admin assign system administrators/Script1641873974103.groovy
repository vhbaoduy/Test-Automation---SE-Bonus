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

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Users'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Site administrators'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Moodle Administration Users Permission_a5c101/select_V Duy (vhbaoduy0808gmail.com)    Tro_952a8e'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Users Permission_a5c101/input_Match the search text anywhere in the_89f7b5'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Users Permission_a5c101/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Users Permission_a5c101/a_Admin Team'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Users Permission_a5c101/span_Log out'))

WebUI.click(findTestObject('Object Repository/Page_My Moodle/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_My Moodle Log in to the site/input_Username_username'), 'voduy')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_My Moodle Log in to the site/input_Password_password'), 'j1ZzzeKf8NiE21d5rsNRrQ==')

WebUI.click(findTestObject('Object Repository/Page_My Moodle Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Site administration'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Users'))

