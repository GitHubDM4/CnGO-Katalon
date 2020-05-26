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

WebUI.callTestCase(findTestCase('Everest-BackOffice_Core/Login_For_All'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Locale/update 2/Page_Everest/span_System configuration'))

WebUI.click(findTestObject('Object Repository/Locale/update 2/Page_Everest/a_Locales'))

WebUI.click(findTestObject('Object Repository/Locale/update 2/Page_Everest/div_Create Locale_dropdown-trigger h-dropdo_25e5f7'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Locale/update 2/Page_Everest/select_25                          50      _c87f56'), 
    '100', true)

WebUI.setText(findTestObject('Object Repository/Locale/update 2/Page_Everest/input_Locales_appearance-none form-search w_e26088'), 
    'QA')

WebUI.click(findTestObject('Object Repository/Locale/update 2/Page_Everest/h3_No locale matched the given criteria'))

WebUI.verifyElementText(findTestObject('Object Repository/Locale/update 2/Page_Everest/h3_No locale matched the given criteria'), 
    'No locale matched the given criteria.')

WebUI.click(findTestObject('Object Repository/Locale/update 2/Page_Everest/a_Create Locale'))

WebUI.setText(findTestObject('Object Repository/Locale/update 2/Page_Everest/input__locale'), 'QA-Local')

WebUI.setText(findTestObject('Object Repository/Locale/update 2/Page_Everest/input__name'), 'QA-Local_test')

WebUI.click(findTestObject('Object Repository/Locale/update 2/Page_Everest/button_Add Translation'))

WebUI.click(findTestObject('Object Repository/Locale/update/Page_Everest/select_Select a language      English      Espaol      Franais'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Locale/update/Page_Everest/select_Select a language      English      Espaol      Franais'), 
    'English')

not_run: WebUI.selectOptionByLabel(findTestObject('Object Repository/Locale/update/Page_Everest/select_Select a language      English      Espaol      Franais'), 
    'English', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Locale/update 2/Page_Everest/textarea_English_font-mono text-sm hoverbg-_c9de9b'), 
    'Qa-local_eng', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Locale/update 2/Page_Everest/span_Create Locale'))

WebUI.click(findTestObject('Object Repository/Locale/update 2/Page_Everest/a_Locales'))

WebUI.setText(findTestObject('Object Repository/Locale/update 2/Page_Everest/input_Locales_appearance-none form-search w_e26088'), 
    'qa')

not_run: WebUI.click(findTestObject('Object Repository/Locale/update 2/Page_Everest/div_QA-Local'))

WebUI.verifyElementText(findTestObject('Object Repository/Locale/update 2/Page_Everest/div_QA-Local'), 'QA-Local', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('QA-Local', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Locale/update 2/Page_Everest/svg_QA-Local_test_fill-current'))

WebUI.click(findTestObject('Object Repository/Locale/update 2/Page_Everest/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Locale/update 2/Page_Everest/div_QA-Local'))

WebUI.verifyElementText(findTestObject('Object Repository/Locale/update 2/Page_Everest/div_QA-Local'), 'QA-Local')

WebUI.click(findTestObject('Object Repository/Locale/update 2/Page_Everest/svg_QA-Local_test_fill-current_1'))

WebUI.setText(findTestObject('Object Repository/Locale/update 2/Page_Everest/input__locale'), 'QA-Locale')

WebUI.click(findTestObject('Object Repository/Locale/update 2/Page_Everest/span_Update Locale'))

WebUI.click(findTestObject('Object Repository/Locale/update 2/Page_Everest/p_QA-Locale'))

WebUI.click(findTestObject('Object Repository/Locale/update 2/Page_Everest/a_Locales'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Locale/update 2/Page_Everest/p_QA-Locale'), 'QA-Locale', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('QA-Locale', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Locale/update 2/Page_Everest/svg_QA-Local_test_fill-current'))

WebUI.click(findTestObject('Object Repository/Locale/update 2/Page_Everest/button_Delete'))

WebUI.setText(findTestObject('Object Repository/Locale/update 2/Page_Everest/input_Locales_appearance-none form-search w_e26088'), 
    'qa')

WebUI.click(findTestObject('Object Repository/Locale/update 2/Page_Everest/h3_No locale matched the given criteria'))

WebUI.verifyElementText(findTestObject('Object Repository/Locale/update 2/Page_Everest/h3_No locale matched the given criteria'), 
    'No locale matched the given criteria.')

WebUI.setText(findTestObject('Object Repository/Locale/update 2/Page_Everest/input_Locales_appearance-none form-search w_e26088'), 
    '')

WebUI.closeBrowser()

