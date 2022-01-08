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

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Site home'))

WebUI.navigateToUrl('http://localhost/?redirect=0')

WebUI.click(findTestObject('Object Repository/Page_My Moodle/a_Phn tch v qun l yu cu phn mm'))

WebUI.click(findTestObject('Object Repository/Page_Course Phn tch v qun l yu cu phn mm/span_Participants'))

WebUI.click(findTestObject('Object Repository/Page_CSC13005 Participants/input_Participants_btn btn-secondary my-1'))

WebUI.setText(findTestObject('Object Repository/Page_CSC13005 Participants/input_No selection_form_autocomplete_input-_86ed1a'), 
    'teacher')

WebUI.click(findTestObject('Object Repository/Page_CSC13005 Participants/span_Teacher Testing'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSC13005 Participants/select_Teacher One    t1example.com        _0fad96'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSC13005 Participants/select_Teacher One    t1example.com        _0fad96'), 
    '7', true)

WebUI.click(findTestObject('Object Repository/Page_CSC13005 Participants/span_Teacher One'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSC13005 Participants/select_Teacher One    t1example.com        _0fad96'), 
    '6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSC13005 Participants/select_Manager            Teacher          _ffc00f'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Page_CSC13005 Participants/button_Enrol users'))

