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

WebUI.click(findTestObject('Object Repository/Page_Course Phn tch v qun l yu cu phn mm/span_Badges'))

WebUI.click(findTestObject('Object Repository/Page_Phn tch v qun l yu cu phn mm Badges/button_Add a new badge'))

WebUI.setText(findTestObject('Object Repository/Page_Phn tch v qun l yu cu phn mm New badge/input_Name_name'), 'Badge')

WebUI.setText(findTestObject('Object Repository/Page_Phn tch v qun l yu cu phn mm New badge/textarea_Description_description'), 
    'Badge for good students')

WebUI.click(findTestObject('Object Repository/Page_Phn tch v qun l yu cu phn mm New badge/input_Image_imagechoose'))

WebUI.click(findTestObject('Object Repository/Page_Phn tch v qun l yu cu phn mm New badge/a_csv'))

WebUI.click(findTestObject('Object Repository/Page_Phn tch v qun l yu cu phn mm New badge/div_Search repository_yui_3_17_2_1_16417349_9d5124'))

WebUI.click(findTestObject('Object Repository/Page_Phn tch v qun l yu cu phn mm New badge/button_Select this file'))

WebUI.click(findTestObject('Object Repository/Page_Phn tch v qun l yu cu phn mm New badge/input_Time unit_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_Badge/h2_Badge'))

