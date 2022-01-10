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

WebUI.click(findTestObject('Object Repository/Page_My Moodle/a_Phn tch v qun l yu cu phn mm'))

WebUI.click(findTestObject('Object Repository/Page_Course Phn tch v qun l yu cu phn mm/span_Participants'))

WebUI.click(findTestObject('Object Repository/Page_CSC13005 Participants/input_Participants_yui_3_17_2_1_1641633890081_20'))

WebUI.setText(findTestObject('Object Repository/Page_CSC13005 Participants/input_No selection_form_autocomplete_input-_2ce59e'), 
    'student')

WebUI.click(findTestObject('Object Repository/Page_CSC13005 Participants/li_Student Testing    student.testingmail.com'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSC13005 Participants/select_Student One    s1example.com        _958eb3'), 
    '8', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSC13005 Participants/select_Student One    s1example.com        _958eb3'), 
    '8', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSC13005 Participants/select_Student One    s1example.com        _958eb3'), 
    '8', true)

WebUI.click(findTestObject('Object Repository/Page_CSC13005 Participants/li_Student One    s1example.com'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSC13005 Participants/select_Student One    s1example.com        _958eb3'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/Page_CSC13005 Participants/li_Student Two    s2example.com'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSC13005 Participants/select_Student One    s1example.com        _958eb3'), 
    '5', true)

WebUI.click(findTestObject('Object Repository/Page_CSC13005 Participants/button_Enrol users'))

WebUI.click(findTestObject('Object Repository/Page_CSC13005 Participants/a_Admin Team'))

WebUI.click(findTestObject('Object Repository/Page_CSC13005 Participants/span_Log out'))

WebUI.click(findTestObject('Object Repository/Page_My Moodle/a_Phn tch v qun l yu cu phn mm'))

WebUI.setText(findTestObject('Object Repository/Page_My Moodle Log in to the site/input_Username_username'), 'student')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_My Moodle Log in to the site/input_Password_password'), '3t5OwH/+bwwlEvOXGw7/rg==')

WebUI.click(findTestObject('Object Repository/Page_My Moodle Log in to the site/button_Log in'))

