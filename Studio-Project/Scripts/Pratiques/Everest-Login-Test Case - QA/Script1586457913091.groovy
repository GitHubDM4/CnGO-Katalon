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

WebUI.click(findTestObject('Pratiques/Page_Everest/span_Customers'))

WebUI.click(findTestObject('Pratiques/Page_Everest/a_Account'))

WebUI.setText(findTestObject('Pratiques/Page_Everest/input_Account_appearance-none form-search w_132f41'), 'qa')

WebUI.verifyElementPresent(findTestObject('Pratiques/Page_Everest/div_No account matched the given criteria  _483ffa'), 
    0)

WebUI.click(findTestObject('Pratiques/Page_Everest/div_No account matched the given criteria  _483ffa'))

