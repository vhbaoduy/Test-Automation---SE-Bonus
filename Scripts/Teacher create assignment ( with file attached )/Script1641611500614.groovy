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

WebUI.callTestCase(findTestCase('Login as user (teacher)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Site home'))

WebUI.navigateToUrl('http://localhost/?redirect=0')

WebUI.click(findTestObject('Object Repository/Page_My Moodle/a_Phn tch v qun l yu cu phn mm'))

WebUI.click(findTestObject('Page_Course Phn tch v qun l yu cu phn mm/button_End tour'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Course Phn tch v qun l yu cu phn mm/button_Turn editing on'))

WebUI.click(findTestObject('Object Repository/Page_Course Phn tch v qun l yu cu phn mm/span_Add an activity or resource'))

WebUI.click(findTestObject('Page_Course Phn tch v qun l yu cu phn mm/img_Information about the Page activity_icon icon'))

WebUI.setText(findTestObject('Object Repository/Page_Editing Assignment/input_Assignment name_name'), 'Assignment with file')

WebUI.click(findTestObject('Object Repository/Page_Editing Assignment/a_- drag and drop not supported_yui_3_17_2__950dc8'))

WebUI.click(findTestObject('Object Repository/Page_Editing Assignment/a_csv'))

WebUI.click(findTestObject('Object Repository/Page_Editing Assignment/div_Search repository_yui_3_17_2_1_16416116_f5771b'))

WebUI.click(findTestObject('Object Repository/Page_Editing Assignment/button_Select this file'))

WebUI.click(findTestObject('Object Repository/Page_Editing Assignment/input_Upon activity completion_submitbutton2'))

WebUI.click(findTestObject('Object Repository/Page_Course Phn tch v qun l yu cu phn mm/a_Trong Le'))

WebUI.click(findTestObject('Object Repository/Page_Course Phn tch v qun l yu cu phn mm/a_Switch role to'))

WebUI.click(findTestObject('Object Repository/Page_Switch role to/button_Student'))

WebUI.click(findTestObject('Object Repository/Page_Course Phn tch v qun l yu cu phn mm/span_Assignment with file'))

