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

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Users'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Search/a_Cohorts'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Users Accounts Cohorts/i_Created manually_icon fa fa-users fa-fw'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Assign cohort members/select_V Duy (vhbaoduy0808gmail.com)    Stu_203805'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Assign cohort members/select_V Duy (vhbaoduy0808gmail.com)    Stu_203805'), 
    '6', true)

WebUI.click(findTestObject('Object Repository/Page_Assign cohort members/input_Match the search text anywhere in the_89f7b5'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Assign cohort members/select_Teacher One (t1example.com)    Teach_962300'), 
    '6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Assign cohort members/select_Teacher One (t1example.com)    Teach_962300'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Assign cohort members/select_Teacher One (t1example.com)    Teach_962300'), 
    '7', true)

WebUI.click(findTestObject('Object Repository/Page_Assign cohort members/input_Search_cancel'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Administration Users Accounts Cohorts/i_Created manually_icon fa fa-users fa-fw'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Assign cohort members/select_V Duy (vhbaoduy0808gmail.com)    Stu_203805'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Assign cohort members/select_V Duy (vhbaoduy0808gmail.com)    Stu_203805'), 
    '8', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Assign cohort members/select_V Duy (vhbaoduy0808gmail.com)    Stu_203805'), 
    '5', true)

WebUI.click(findTestObject('Object Repository/Page_Assign cohort members/input_Match the search text anywhere in the_89f7b5'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Assign cohort members/select_Student One (s1example.com)    Stude_8b3338'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Assign cohort members/select_Student One (s1example.com)    Stude_8b3338'), 
    '8', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Assign cohort members/select_Student One (s1example.com)    Stude_8b3338'), 
    '5', true)

WebUI.click(findTestObject('Object Repository/Page_Assign cohort members/input_Search_cancel'))

