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

WebUI.click(findTestObject('Object Repository/Page_Course Phn tch v qun l yu cu phn mm/button_Turn editing on'))

WebUI.click(findTestObject('Object Repository/Page_Course Phn tch v qun l yu cu phn mm/a_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Course Phn tch v qun l yu cu phn mm/span_Edit topic'))

WebUI.click(findTestObject('Object Repository/Page_Edit Topic 1/legend_General'))

WebUI.click(findTestObject('Page_Edit Topic 1/input_Custom_namecustomize'))

WebUI.setText(findTestObject('Object Repository/Page_Edit Topic 1/input_New value for Section name_namevalue'), 'Testing Topic')

WebUI.click(findTestObject('Object Repository/Page_Edit Topic 1/input_Add restriction_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_Course Phn tch v qun l yu cu phn mm/span_Add an activity or resource_1'))

WebUI.click(findTestObject('Object Repository/Page_Course Phn tch v qun l yu cu phn mm/img_Information about the Page activity_icon icon'))

WebUI.setText(findTestObject('Object Repository/Page_Editing Quiz/input_Name_name'), 'Quiz Testing 01')

WebUI.click(findTestObject('Object Repository/Page_Editing Quiz/a_Timing'))

WebUI.click(findTestObject('Object Repository/Page_Editing Quiz/input_Enable_timelimitenabled'))

WebUI.setText(findTestObject('Object Repository/Page_Editing Quiz/input_Time_timelimitnumber'), '5')

WebUI.click(findTestObject('Object Repository/Page_Editing Quiz/a_Grade'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Editing Quiz/select_Unlimited            1            2 _13fc15'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Editing Quiz/input_Upon activity completion_submitbutton2'))

WebUI.click(findTestObject('Object Repository/Page_Course Phn tch v qun l yu cu phn mm/span_Quiz testing 01'))

WebUI.click(findTestObject('Object Repository/Page_CSC13005 Quiz Testing 01/button_Edit quiz'))

WebUI.click(findTestObject('Object Repository/Page_Editing quiz Quiz Testing 01/span_Add'))

WebUI.click(findTestObject('Object Repository/Page_Editing quiz Quiz Testing 01/span_a new question'))

WebUI.click(findTestObject('Object Repository/Page_Editing quiz Quiz Testing 01/input_Questions_qtype'))

WebUI.click(findTestObject('Object Repository/Page_Editing quiz Quiz Testing 01/input_Description_submitbutton'))

WebUI.setText(findTestObject('Object Repository/Page_Editing a Multiple choice question/input_Question name_name'), 'Thực hiện phép tính')

WebUI.setText(findTestObject('Object Repository/Page_Editing a Multiple choice question/div_1  1'), '1 + 1 = ?')

WebUI.click(findTestObject('Object Repository/Page_Editing a Multiple choice question/p'))

WebUI.setText(findTestObject('Object Repository/Page_Editing a Multiple choice question/div_1'), '1')

WebUI.click(findTestObject('Object Repository/Page_Editing a Multiple choice question/p_1'))

WebUI.setText(findTestObject('Object Repository/Page_Editing a Multiple choice question/div_2'), '2')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Editing a Multiple choice question/select_None            100            90   _353130'), 
    '1.0', true)

WebUI.click(findTestObject('Object Repository/Page_Editing a Multiple choice question/p_1_2_3_4_5_6_7'))

WebUI.setText(findTestObject('Object Repository/Page_Editing a Multiple choice question/div_3'), '3')

WebUI.click(findTestObject('Object Repository/Page_Editing a Multiple choice question/p_1_2'))

WebUI.setText(findTestObject('Object Repository/Page_Editing a Multiple choice question/div_4'), '4')

WebUI.click(findTestObject('Object Repository/Page_Editing a Multiple choice question/input__submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_Editing quiz Quiz Testing 01/i_Thc hin php tnh_yui_3_17_2_1_1641634907795_413'))

