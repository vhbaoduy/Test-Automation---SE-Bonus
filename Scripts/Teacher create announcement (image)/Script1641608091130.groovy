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

WebUI.callTestCase(findTestCase('Login as user'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Site home'))

WebUI.navigateToUrl('http://localhost/?redirect=0')

WebUI.click(findTestObject('Object Repository/Page_My Moodle/a_Phn tch v qun l yu cu phn mm'))

WebUI.click(findTestObject('Object Repository/Page_Course Phn tch v qun l yu cu phn mm/a_Announcements Forum'))

WebUI.click(findTestObject('Object Repository/Page_Announcements/a_Add a new topic'))

WebUI.setText(findTestObject('Object Repository/Page_Announcements/input_Subject_subject'), 'Testing image')

WebUI.click(findTestObject('Object Repository/Page_Announcements/i_Message_icon fa fa-picture-o fa-fw'))

WebUI.click(findTestObject('Object Repository/Page_Announcements/button_Browse repositories'))

WebUI.click(findTestObject('Object Repository/Page_Announcements/a_csv'))

WebUI.click(findTestObject('Object Repository/Page_Announcements/p_image.png'))

WebUI.click(findTestObject('Object Repository/Page_Announcements/button_Select this file'))

WebUI.click(findTestObject('Object Repository/Page_Announcements/input_125_id_message_atto_image_presentation'))

WebUI.click(findTestObject('Object Repository/Page_Announcements/button_Save image'))

WebUI.click(findTestObject('Object Repository/Page_Announcements/input_Message_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_Announcements/p_Your post was successfully added'))

