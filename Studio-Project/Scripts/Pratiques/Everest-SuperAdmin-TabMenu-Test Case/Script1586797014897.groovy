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

WebUI.click(findTestObject('Object Repository/Pratiques/SuperAdmin-TabMenu/Page_Everest/button_Sign In'))

WebUI.setText(findTestObject('Object Repository/Pratiques/SuperAdmin-TabMenu/Page_Everest/input_E-Mail Address_email'), 
    'admin@connectngo.com')

WebUI.click(findTestObject('Object Repository/Pratiques/SuperAdmin-TabMenu/Page_Everest/button_Sign In'))

WebUI.setEncryptedText(findTestObject('Object Repository/Pratiques/SuperAdmin-TabMenu/Page_Everest/input_Password_password'), 
    'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/Pratiques/SuperAdmin-TabMenu/Page_Everest/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Pratiques/SuperAdmin-TabMenu/Page_Everest/span_Customers'))

WebUI.verifyElementText(findTestObject('Pratiques/SuperAdmin-TabMenu/Page_Everest/a_Account'), 'Account', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Account', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Pratiques/SuperAdmin-TabMenu/Page_Everest/span_Sales'))

WebUI.verifyElementText(findTestObject('Pratiques/SuperAdmin-TabMenu/Page_Everest/a_Transactions'), 'Transactions', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Pratiques/SuperAdmin-TabMenu/Page_Everest/a_Wallets'), 'Wallets', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Pratiques/SuperAdmin-TabMenu/Page_Everest/span_Products'))

WebUI.verifyElementText(findTestObject('Pratiques/SuperAdmin-TabMenu/Page_Everest/a_Products'), 'Products', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('Pratiques/SuperAdmin-TabMenu/Page_Everest/a_Products'), 'Prod', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Combos', true, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyTextPresent('Comb1', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Pratiques/SuperAdmin-TabMenu/Page_Everest/a_Discount'), 'Discount', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Pratiques/SuperAdmin-TabMenu/Page_Everest/a_Tags'), 'Tags', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Pratiques/SuperAdmin-TabMenu/Page_Everest/a_Ticket Templates'), 'Ticket Templates', 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyCheckpoint(findCheckpoint('Checkpoints/SuperAdmin-TabMenu/Products-Checkpoint'), true)

WebUI.click(findTestObject('Pratiques/SuperAdmin-TabMenu/Page_Everest/span_Product types'))

not_run: WebUI.verifyCheckpoint(findCheckpoint('Checkpoints/SuperAdmin-TabMenu/Product Types-Checkpoint'), true)

WebUI.verifyElementText(findTestObject('Pratiques/SuperAdmin-TabMenu/Page_Everest/a_Ticket types'), 'Ticket types', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Addon types', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Pratiques/SuperAdmin-TabMenu/Page_Everest/a_Cashless types'), 'Cashless types', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

