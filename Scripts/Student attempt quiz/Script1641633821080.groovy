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

WebUI.callTestCase(findTestCase('Login as user (student)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Site home'))

WebUI.navigateToUrl('http://localhost/?redirect=0')

WebUI.click(findTestObject('Object Repository/Page_My Moodle/a_Phn tch v qun l yu cu phn mm'))

WebUI.click(findTestObject('Object Repository/Page_Course Phn tch v qun l yu cu phn mm/span_Quiz testing 01'))

WebUI.click(findTestObject('Object Repository/Page_Course Phn tch v qun l yu cu phn mm/span_Quiz testing 01'))

WebUI.navigateToUrl('http://localhost/mod/quiz/view.php?id=5')

WebUI.click(findTestObject('Object Repository/Page_CSC13005 Quiz Testing 01/button_Attempt quiz now'))

WebUI.click(findTestObject('Object Repository/Page_CSC13005 Quiz Testing 01/input_Time limit_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_Quiz Testing 01/input_concat(p dir, , ltr, ,  style, , text_8d338d'))

WebUI.click(findTestObject('Object Repository/Page_Quiz Testing 01/input_d_next'))

WebUI.click(findTestObject('Object Repository/Page_Quiz Testing 01 Attempt summary/button_Submit all and finish'))

WebUI.click(findTestObject('Object Repository/Page_Quiz Testing 01 Attempt summary/input_Once you submit, you will no longer b_924807'))

