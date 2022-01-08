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

WebUI.click(findTestObject('Object Repository/Page_Course Phn tch v qun l yu cu phn mm/span_Participants'))

WebUI.click(findTestObject('Object Repository/Page_CSC13005 Participants/a_Participants_action-menu-toggle-3'))

WebUI.click(findTestObject('Object Repository/Page_CSC13005 Participants/a_Groups'))

WebUI.click(findTestObject('Object Repository/Page_Groups/input_Groups_act_showcreateorphangroupform'))

WebUI.setText(findTestObject('Object Repository/Page_Groups/input_Group name_name'), 'Group Testing')

WebUI.setText(findTestObject('Object Repository/Page_Groups/input_Group ID number_idnumber'), '01')

WebUI.click(findTestObject('Object Repository/Page_Groups/input_Drop files here to upload_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_Groups/input_Group Testing (0)_act_showaddmembersform'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSC13005 Groups/select_Student One (s1example.com) (0)    S_fbd5dc'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSC13005 Groups/select_Student One (s1example.com) (0)    S_fbd5dc'), 
    '8', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSC13005 Groups/select_Student One (s1example.com) (0)    S_fbd5dc'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/Page_CSC13005 Groups/input_Match the search text anywhere in the_89f7b5'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSC13005 Groups/select_Teacher Testing (teacher.testingmail_a817a3'), 
    '8', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSC13005 Groups/select_Teacher Testing (teacher.testingmail_a817a3'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CSC13005 Groups/select_Teacher Testing (teacher.testingmail_a817a3'), 
    '7', true)

WebUI.click(findTestObject('Object Repository/Page_CSC13005 Groups/input_Search_cancel'))

