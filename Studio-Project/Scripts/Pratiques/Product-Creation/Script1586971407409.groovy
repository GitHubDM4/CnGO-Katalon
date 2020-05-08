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

WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('https://everest-qa.connectngo.net/login', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Everest/Product-creation/Page_Everest/input_E-Mail Address_email'), 
    'admin@connectngo.com', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Everest/Product-creation/Page_Everest/input_Password_password'), 
    'RAIVpflpDOg=', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Everest/Product-creation/Page_Everest/button_Sign In'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Everest/Product-creation/Page_Everest/span_Products'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Everest/Product-creation/Page_Everest/a_Products'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Everest/Product-creation/Product-creation_/update steps/Page_Everest/input_Products_appearance-none form-search w-search pl-search shadow'))

WebUI.setText(findTestObject('Page_Everest/Product-creation/Product-creation_/update steps/Page_Everest/input_Products_appearance-none form-search w-search pl-search shadow'), 
    'QA')

WebUI.verifyElementText(findTestObject('Page_Everest/Product-creation/Product-creation_/update steps/Page_Everest/Page_Everest/h3_No product matched the given criteria'), 
    'No product matched the given criteria.', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Everest/Product-creation/Page_Everest/a_Create Product'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Everest/Product-creation/Page_Everest/input__name'), 'QA-Auto-Product', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Everest/Product-creation/Page_Everest/span_Add Translation'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Everest/Product-creation/Product-creation_/Page_Everest/select_Select a language      English      Espaol      Franais'))

WebUI.selectOptionByLabel(findTestObject('Page_Everest/Product-creation/Product-creation_/update steps/Page_Everest/Page_Everest/span_English'), 
    'English', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Everest/Product-creation/Product-creation_/update steps/Page_Everest/Page_Everest/span_English'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Everest/Product-creation/Page_Everest/textarea_English_font-mono text-sm hoverbg-_c9de9b'), 
    'qa-auto-product-eng', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Everest/Product-creation/Page_Everest/span_Add Translation'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Everest/Product-creation/Product-creation_/Page_Everest/select_Select a language      English      Espaol      Franais'))

WebUI.click(findTestObject('Page_Everest/Product-creation/Product-creation_/update steps/Page_Everest/Page_Everest/span_Franais'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Everest/Product-creation/Page_Everest/textarea_English_font-mono text-sm hoverbg-_c9de9b'), 
    'qa-auto-product-fr', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Everest/Product-creation/Page_Everest/span_Add Translation'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_Everest/Product-creation/Product-creation_/Page_Everest/select_Select a language      English      Espaol      Franais'))

WebUI.click(findTestObject('Page_Everest/Product-creation/Product-creation_/update steps/Page_Everest/Page_Everest/span_Espaol'))

WebUI.setText(findTestObject('Object Repository/Page_Everest/Product-creation/Page_Everest/textarea_English_font-mono text-sm hoverbg-_c9de9b'), 
    'qa-auto-product-spa', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Everest/Product-creation/Product-creation_/update steps/Page_Everest/Page_Everest/svg_Espaol_fill-current'))

WebUI.click(findTestObject('Object Repository/Page_Everest/Product-creation/Page_Everest/span_Add Translation'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Everest/Product-creation/Page_Everest/textarea_English_font-mono text-sm hoverbg-_c9de9b'), 
    'description-test', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Page_Everest/Product-creation/Page_Everest/span_Create Product'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Everest/Product-creation/Product-creation_/Page_Everest/select_ Quebec'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/Page_Everest/Product-creation/Page_Everest/span_Create Product'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Everest/Product-creation/Product-creation_/update steps/Page_Everest/a_Cancel'))

WebUI.click(findTestObject('Page_Everest/Product-creation/Product-creation_/update steps/Page_Everest/input_Products_appearance-none form-search w-search pl-search shadow'))

WebUI.setText(findTestObject('Page_Everest/Product-creation/Product-creation_/update steps/Page_Everest/input_Products_appearance-none form-search w-search pl-search shadow'), 
    'QA')

WebUI.verifyElementText(findTestObject('Page_Everest/Product-creation/Product-creation_/update steps/Page_Everest/Page_Everest/h3_No product matched the given criteria'), 
    'No Product matched the given criteria')

