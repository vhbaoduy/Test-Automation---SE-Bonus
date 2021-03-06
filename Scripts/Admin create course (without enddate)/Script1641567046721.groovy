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

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Courses'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Add a new course'))

WebUI.setText(findTestObject('Object Repository/Page_Moodle Add a new course/input_Course full name_fullname'), 'Phát triển phần mềm cho thiết bị di động')

WebUI.setText(findTestObject('Object Repository/Page_Moodle Add a new course/input_Course short name_shortname'), 'CSC13009')

WebUI.click(findTestObject('Object Repository/Page_Moodle Add a new course/span_'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Add a new course/li_Cng ngh thng tin  K thut phn mm'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Moodle Add a new course/select_Miscellaneous            Cng ngh thn_6d25f3'), 
    '3', true, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Moodle Add a new course/input_Enable_enddateenabled'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Add a new course/input__saveanddisplay'))

WebUI.click(findTestObject('Object Repository/Page_CSC13009 Participants/h2_Participants'))

