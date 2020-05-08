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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Pratiques/Login_For_All'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Pratiques/Profil/Page_Everest/div_adminconnectngocom'), 'admin@connectngo.com', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Pratiques/Profil/Page_Everest/div_English'), 'English', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('Pratiques/Profil/Page_Everest/div_ConnectGO               Loading'), 'ConnectGO', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Pratiques/Profil/Page_Everest/Page_Everest/span_adminconnectngocom'))

WebUI.click(findTestObject('Object Repository/Pratiques/Profil/Page_Everest/Page_Everest/a_Profile'))

WebUI.click(findTestObject('Object Repository/Pratiques/Profil/Page_Everest/Page_Everest/input__firstname'))

not_run: WebUI.verifyElementText(findTestObject('Pratiques/Profil/Page_Everest/input__firstname'), 'admin', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('admin', true, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyTextPresent('admin1', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Pratiques/Profil/Page_Everest/Page_Everest/input__lastname'))

not_run: WebUI.verifyElementText(findTestObject('Pratiques/Profil/Page_Everest/input__lastname'), 'admin', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Pratiques/Profil/Page_Everest/Page_Everest/input__email'))

not_run: WebUI.verifyElementText(findTestObject('Pratiques/Profil/Page_Everest/input__email'), 'admin@connectngo.com', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('Pratiques/Profil/Page_Everest/input__email'), 'admin', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('admin@connectngo.com', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Pratiques/Profil/Page_Everest/Page_Everest/input_Company_company'))

not_run: WebUI.verifyElementText(findTestObject('Pratiques/Profil/Page_Everest/input_Company_company'), 'connect & go', 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyTextPresent('connect & go', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Pratiques/Profil/Page_Everest/Page_Everest/div_Active_py-2'))

not_run: WebUI.verifyElementChecked(findTestObject('Pratiques/Profil/Page_Everest/Page_Everest/div_Active_py-2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementChecked(findTestObject('Pratiques/Profil/Page_Everest/div_Active_v-switch-button'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Pratiques/Profil/Page_Everest/Page_Everest/div_Active_py-2'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Pratiques/Profil/Page_Everest/a_Cancel'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Pratiques/Profil/Page_Everest/Page_Everest/a_Cancel'))

WebUI.verifyElementText(findTestObject('Page_Everest/h1_Dashboard'), 'Dashboard', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

