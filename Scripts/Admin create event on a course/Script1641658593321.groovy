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

WebUI.click(findTestObject('Object Repository/Page_Course Phn tch v qun l yu cu phn mm/a_Calendar'))

WebUI.click(findTestObject('Object Repository/Page_CSC13005 Calendar Detailed month view _53704a/button_New event'))

WebUI.setText(findTestObject('Page_CSC13005 Calendar Detailed month view _53704a/input_Event title_name'), 'Các bạn sẽ thi vào ngày 20/02/2022')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSC13005 Calendar Detailed month view _53704a/select_1        2        3        4        _45ea30'), 
    '20', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSC13005 Calendar Detailed month view _53704a/select_January        February        March_78ea2e'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSC13005 Calendar Detailed month view _53704a/select_00        01        02        03    _f6e37b'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSC13005 Calendar Detailed month view _53704a/select_00        01        02        03    _f6e37b_1'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Page_CSC13005 Calendar Detailed month view _53704a/button_Save'))

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Login as user (student)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Go to calendar'))

WebUI.navigateToUrl('http://localhost/calendar/view.php?view=upcoming')

WebUI.click(findTestObject('Object Repository/Page_Moodle Calendar Upcoming events/a_February 2022'))

WebUI.click(findTestObject('Page_Moodle Calendar Detailed month view February 2022/span_Cc bn s thi vo ngy 20022022'))

WebUI.click(findTestObject('Page_Moodle Calendar Detailed month view February 2022/h5_Cc bn s thi vo ngy 20022022'))

