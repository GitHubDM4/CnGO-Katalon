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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://everest-qa.connectngo.net/login')

WebUI.setText(findTestObject('Object Repository/Page_Everest (1)/input_E-Mail Address_email'), 'admin@connectngo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Everest (1)/input_Password_password'), 'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/Page_Everest (1)/button_Sign In'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Everest (1)/div_adminconnectngocom'), 'admin@connectngo.com', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('admin@connectngo.com', true, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Page_Everest (1)/div_adminconnectngocom'), 'admin@ctngo.com')

WebUI.verifyElementText(findTestObject('Pratiques/Page_Everest (1)/111/Page_Everest/div_English               Loading'), 
    'English', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Pratiques/Page_Everest (1)/111/Page_Everest/div_ConnectGO               Loading'), 
    'Connect&GO', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyCheckpoint(findCheckpoint('Checkpoints/Checkpoint'), true)

WebUI.click(findTestObject('Object Repository/Page_Everest/span_Dashboard'))

WebUI.verifyTextPresent('Dashboard', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Everest/h1_Dashboard'), 'Dashboard', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyMatch('Dashboards', 'Dashboards', true, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/Pratiques/Page_Everest (1)/111/Page_Everest/div_adminconnectngocom'))

not_run: WebUI.click(findTestObject('Object Repository/Pratiques/Page_Everest (1)/111/Page_Everest/a_Logout'))

not_run: WebUI.navigateToUrl('https://everest-qa.connectngo.net/login')

not_run: WebUI.click(findTestObject('Object Repository/Pratiques/Page_Everest (1)/111/Page_Everest/h4_Login'))

not_run: WebUI.verifyElementText(findTestObject('Pratiques/Page_Everest (1)/111/Page_Everest/h4_Login'), 'Login', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.closeBrowser()

