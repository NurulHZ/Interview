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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.btn.co.id/')

WebUI.click(findTestObject('Kurs/div_CNY                                                                                    2.213,00                                                                            0,00'))

WebUI.click(findTestObject('Object Repository/Kurs/a_e-kurs konverter kalkulator'))

WebUI.setText(findTestObject('Object Repository/Kurs/input_E-Konverter Hitungan Kurs_SourceNumber'), '2')

WebUI.selectOptionByValue(findTestObject('Object Repository/Kurs/select_USDJPYGBPAUDHKDSGDEURIDRMYRSARCNY'), 'IDR', true)

WebUI.click(findTestObject('Kurs/select_USDJPYGBPAUDHKDSGDEURIDRMYRSARCNY'))

WebUI.click(findTestObject('Kurs/input_Transaksi_Result'))

WebUI.click(findTestObject('Kurs/input_Transaksi_btn btn-secondary'))

WebUI.verifyElementAttributeValue(findTestObject('Kurs/input_Transaksi_Result'), 'Result', '31.620', 2)

