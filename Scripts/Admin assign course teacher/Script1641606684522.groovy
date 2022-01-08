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

WebUI.click(findTestObject('Object Repository/Page_CSC13005 Participants/input_With selected users_btn btn-secondary my-1'))

WebUI.click(findTestObject('Object Repository/Page_CSC13005 Participants/span_'))

WebUI.click(findTestObject('Object Repository/Page_CSC13005 Participants/span_quoctrongle2001gmail.com'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSC13005 Participants/select_V Duy    vhbaoduy0808gmail.com      _651d13'), 
    '6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSC13005 Participants/select_V Duy    vhbaoduy0808gmail.com      _651d13'), 
    '6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSC13005 Participants/select_V Duy    vhbaoduy0808gmail.com      _651d13'), 
    '6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSC13005 Participants/select_V Duy    vhbaoduy0808gmail.com      _651d13'), 
    '6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSC13005 Participants/select_V Duy    vhbaoduy0808gmail.com      _651d13'), 
    '6', true)

WebUI.click(findTestObject('Object Repository/Page_CSC13005 Participants/div_Select users'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSC13005 Participants/select_Manager            Teacher          _ffc00f'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Page_CSC13005 Participants/button_Enrol users'))

WebUI.click(findTestObject('Object Repository/Page_CSC13005 Participants/td_quoctrongle2001gmail.com'))

WebUI.closeBrowser()

