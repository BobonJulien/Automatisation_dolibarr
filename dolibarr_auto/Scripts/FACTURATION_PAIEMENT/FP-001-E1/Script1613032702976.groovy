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

WebUI.verifyElementPresent(findTestObject('Page_Accueil - Dolibarr 1300/span_Facturation  Paiement'), 0)

WebUI.click(findTestObject('Object Repository/FP-001-E1/Page_Accueil - Dolibarr 1300/span_Facturation  Paiement'))

WebUI.verifyElementPresent(findTestObject('FP-001-E1/Page_Espace facturation et paiement/a_Nouvelle facture'), 0)

WebUI.click(findTestObject('Object Repository/FP-001-E1/Page_Espace facturation et paiement/a_Nouvelle facture'))

WebUI.comment('oublie de selection tiers a facturer')

WebUI.click(findTestObject('Object Repository/FP-001-E1/Page_Facture client - Fiche/img_Date facturation_ui-datepicker-trigger'))

WebUI.click(findTestObject('Object Repository/FP-001-E1/Page_Facture client - Fiche/a_18'))

WebUI.click(findTestObject('Object Repository/FP-001-E1/Page_Facture client - Fiche/input_Note (prive)_bouton'))

WebUI.comment('message derreur saffiche')

WebUI.getText(findTestObject('Object Repository/FP-001-E1/Page_Facture client - Fiche/div_Le champ Client est obligatoire'))

WebUI.verifyElementText(findTestObject('Page_Facture client - Fiche/div_Le champ Client est obligatoire'), 'Le Champ Client est obligatoire')

