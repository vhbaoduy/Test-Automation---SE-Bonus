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

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Site home'))

WebUI.navigateToUrl('http://localhost/?redirect=0')

WebUI.click(findTestObject('Object Repository/Page_My Moodle/a_Phn tch v qun l yu cu phn mm'))

WebUI.click(findTestObject('Object Repository/Page_Course Phn tch v qun l yu cu phn mm/span_Announcements Forum'))

WebUI.click(findTestObject('Object Repository/Page_Announcements/a_Add a new topic'))

WebUI.click(findTestObject('Object Repository/Page_Announcements/i_Message_icon fa fa-file-video-o fa-fw'))

WebUI.click(findTestObject('Object Repository/Page_Announcements/button_Browse repositories'))

WebUI.click(findTestObject('Object Repository/Page_Announcements/a_csv'))

WebUI.click(findTestObject('Object Repository/Page_Announcements/div_Search repository_yui_3_17_2_1_16416081_a9d5b1'))

WebUI.click(findTestObject('Object Repository/Page_Announcements/button_Select this file'))

WebUI.click(findTestObject('Object Repository/Page_Announcements/button_Insert media'))

WebUI.setText(findTestObject('Object Repository/Page_Announcements/input_Subject_subject'), 'Video testing')

WebUI.click(findTestObject('Object Repository/Page_Announcements/input_file_example_MP4_480_1_5MG.mp4_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_Announcements/p_Your post was successfully added'))

