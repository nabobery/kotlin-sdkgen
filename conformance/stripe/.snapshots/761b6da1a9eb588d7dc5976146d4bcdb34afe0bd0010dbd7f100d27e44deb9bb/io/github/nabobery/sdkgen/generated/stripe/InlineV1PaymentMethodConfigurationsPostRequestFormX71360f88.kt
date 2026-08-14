package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations~1{configuration}/post/requestBody/content/app
 * lication~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsPostRequestFormX71360f88.Serializer::class)
public class InlineV1PaymentMethodConfigurationsPostRequestFormX71360f88(
  /**
   * Canadian pre-authorized debit payments, check this [page](https://docs.stripe.com/payments/acss-debit) for more
   * details like country availability.
   */
  public val acssDebit:
      InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX0dbc96ba? = null,
  /**
   * Whether the configuration can be used for new payments.
   */
  public val active: Boolean? = null,
  /**
   * [Affirm](https://www.affirm.com/) gives your customers a way to split purchases over a series of payments.
   * Depending on the purchase, they can pay with four interest-free payments (Split Pay) or pay over a longer term
   * (Installments), which might include interest. Check this [page](https://docs.stripe.com/payments/affirm) for more
   * details like country availability.
   */
  public val affirm: InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXb63acbe0? = null,
  /**
   * Afterpay gives your customers a way to pay for purchases in installments, check this
   * [page](https://docs.stripe.com/payments/afterpay-clearpay) for more details like country availability. Afterpay is
   * particularly popular among businesses selling fashion, beauty, and sports products.
   */
  public val afterpayClearpay:
      InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayX79e7b98e? = null,
  /**
   * Alipay is a digital wallet in China that has more than a billion active users worldwide. Alipay users can pay on
   * the web or on a mobile device using login credentials or their Alipay app. Alipay has a low dispute rate and
   * reduces fraud by authenticating payments using the customer's login credentials. Check this
   * [page](https://docs.stripe.com/payments/alipay) for more details.
   */
  public val alipay: InlineV1PaymentMethodConfigurationsPostRequestFormAlipayX1535ffff? = null,
  /**
   * Alma is a Buy Now, Pay Later payment method that offers customers the ability to pay in 2, 3, or 4 installments.
   */
  public val alma: InlineV1PaymentMethodConfigurationsPostRequestFormAlmaX91932049? = null,
  /**
   * Amazon Pay is a wallet payment method that lets your customers check out the same way as on Amazon.
   */
  public val amazonPay:
      InlineV1PaymentMethodConfigurationsPostRequestFormAmazonPayX939e07bd? = null,
  /**
   * Stripe users can accept [Apple Pay](https://stripe.com/payments/apple-pay) in iOS applications in iOS 9 and later,
   * and on the web in Safari starting with iOS 10 or macOS Sierra. There are no additional fees to process Apple Pay
   * payments, and the [pricing](https://stripe.com/pricing) is the same as other card transactions. Check this
   * [page](https://docs.stripe.com/apple-pay) for more details.
   */
  public val applePay: InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX5a60e19d? = null,
  /**
   * Apple Pay Later, a payment method for customers to buy now and pay later, gives your customers a way to split
   * purchases into four installments across six weeks.
   */
  public val applePayLater:
      InlineV1PaymentMethodConfigurationsPostRequestFormApplePayLaterX20d819f9? = null,
  /**
   * Stripe users in Australia can accept Bulk Electronic Clearing System (BECS) direct debit payments from customers
   * with an Australian bank account. Check this [page](https://docs.stripe.com/payments/au-becs-debit) for more
   * details.
   */
  public val auBecsDebit:
      InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX5cc33789? = null,
  /**
   * Stripe users in the UK can accept Bacs Direct Debit payments from customers with a UK bank account, check this
   * [page](https://docs.stripe.com/payments/payment-methods/bacs-debit) for more details.
   */
  public val bacsDebit:
      InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXd07cded8? = null,
  /**
   * Bancontact is the most popular online payment method in Belgium, with over 15 million cards in circulation.
   * [Customers](https://docs.stripe.com/api/customers) use a Bancontact card or mobile app linked to a Belgian bank
   * account to make online payments that are secure, guaranteed, and confirmed immediately. Check this
   * [page](https://docs.stripe.com/payments/bancontact) for more details.
   */
  public val bancontact:
      InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX8748cb60? = null,
  /**
   * Billie is a [single-use](https://docs.stripe.com/payments/payment-methods#usage) payment method that offers
   * businesses Pay by Invoice where they offer payment terms ranging from 7-120 days. Customers are redirected from
   * your website or app, authorize the payment with Billie, then return to your website or app. You get [immediate
   * notification](/payments/payment-methods#payment-notification) of whether the payment succeeded or failed.
   */
  public val billie: InlineV1PaymentMethodConfigurationsPostRequestFormBillieX7697ea1c? = null,
  /**
   * To enable Bizum, buyers need a Spanish IBAN from a bank connected to Bizum. Within their banking app, they can
   * enable Bizum and link their mobile number to their IBAN.
   */
  public val bizum: InlineV1PaymentMethodConfigurationsPostRequestFormBizumXa32518d6? = null,
  /**
   * BLIK is a [single use](https://docs.stripe.com/payments/payment-methods#usage) payment method that requires
   * customers to authenticate their payments. When customers want to pay online using BLIK, they request a six-digit
   * code from their banking application and enter it into the payment collection form. Check this
   * [page](https://docs.stripe.com/payments/blik) for more details.
   */
  public val blik: InlineV1PaymentMethodConfigurationsPostRequestFormBlikX3d3a6d6b? = null,
  /**
   * Boleto is an official (regulated by the Central Bank of Brazil) payment method in Brazil. Check this
   * [page](https://docs.stripe.com/payments/boleto) for more details.
   */
  public val boleto: InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX0f0be225? = null,
  /**
   * Cards are a popular way for consumers and businesses to pay online or in person. Stripe supports global and local
   * card networks.
   */
  public val card: InlineV1PaymentMethodConfigurationsPostRequestFormCardXf1c5a097? = null,
  /**
   * Cartes Bancaires is France's local card network. More than 95% of these cards are co-branded with either Visa or
   * Mastercard, meaning you can process these cards over either Cartes Bancaires or the Visa or Mastercard networks.
   * Check this [page](https://docs.stripe.com/payments/cartes-bancaires) for more details.
   */
  public val cartesBancaires:
      InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesX77a15d74? = null,
  /**
   * Cash App is a popular consumer app in the US that allows customers to bank, invest, send, and receive money using
   * their digital wallet. Check this [page](https://docs.stripe.com/payments/cash-app-pay) for more details.
   */
  public val cashapp: InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3e557dd5? = null,
  /**
   * [Stablecoin payments](https://docs.stripe.com/payments/stablecoin-payments) enable customers to pay in stablecoins
   * like USDC from 100s of wallets including Phantom and Metamask.
   */
  public val crypto: InlineV1PaymentMethodConfigurationsPostRequestFormCryptoX40d57411? = null,
  /**
   * Uses a customer’s [cash balance](https://docs.stripe.com/payments/customer-balance) for the payment. The cash
   * balance can be funded via a bank transfer. Check this [page](https://docs.stripe.com/payments/bank-transfers) for
   * more details.
   */
  public val customerBalance:
      InlineV1PaymentMethodConfigurationsPostRequestFormCustomerBalanceX11cda148? = null,
  /**
   * EPS is an Austria-based payment method that allows customers to complete transactions online using their bank
   * credentials. EPS is supported by all Austrian banks and is accepted by over 80% of Austrian online retailers. Check
   * this [page](https://docs.stripe.com/payments/eps) for more details.
   */
  public val eps: InlineV1PaymentMethodConfigurationsPostRequestFormEpsXcb14b84a? = null,
  expand: List<String>? = null,
  /**
   * Financial Process Exchange (FPX) is a Malaysia-based payment method that allows customers to complete transactions
   * online using their bank credentials. Bank Negara Malaysia (BNM), the Central Bank of Malaysia, and eleven other
   * major Malaysian financial institutions are members of the PayNet Group, which owns and operates FPX. It is one of
   * the most popular online payment methods in Malaysia, with nearly 90 million transactions in 2018 according to BNM.
   * Check this [page](https://docs.stripe.com/payments/fpx) for more details.
   */
  public val fpx: InlineV1PaymentMethodConfigurationsPostRequestFormFpxX3dcee04d? = null,
  /**
   * Meal vouchers in France, or “titres-restaurant”, is a local benefits program commonly offered by employers for
   * their employees to purchase prepared food and beverages on working days. Check this
   * [page](https://docs.stripe.com/payments/meal-vouchers/fr-meal-vouchers) for more details.
   */
  public val frMealVoucherConecs:
      InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX9dafd76f? = null,
  /**
   * giropay is a German payment method based on online banking, introduced in 2006. It allows customers to complete
   * transactions online using their online banking environment, with funds debited from their bank account. Depending
   * on their bank, customers confirm payments on giropay using a second factor of authentication or a PIN. giropay
   * accounts for 10% of online checkouts in Germany. Check this [page](https://docs.stripe.com/payments/giropay) for
   * more details.
   */
  public val giropay: InlineV1PaymentMethodConfigurationsPostRequestFormGiropayXa770ef5d? = null,
  /**
   * Google Pay allows customers to make payments in your app or website using any credit or debit card saved to their
   * Google Account, including those from Google Play, YouTube, Chrome, or an Android device. Use the Google Pay API to
   * request any credit or debit card stored in your customer's Google account. Check this
   * [page](https://docs.stripe.com/google-pay) for more details.
   */
  public val googlePay:
      InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX5f48552b? = null,
  /**
   * GrabPay is a payment method developed by [Grab](https://www.grab.com/sg/consumer/finance/pay/). GrabPay is a
   * digital wallet - customers maintain a balance in their wallets that they pay out with. Check this
   * [page](https://docs.stripe.com/payments/grabpay) for more details.
   */
  public val grabpay: InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXa4ffc889? = null,
  /**
   * iDEAL is a Netherlands-based payment method that allows customers to complete transactions online using their bank
   * credentials. All major Dutch banks are members of Currence, the scheme that operates iDEAL, making it the most
   * popular online payment method in the Netherlands with a share of online transactions close to 55%. Check this
   * [page](https://docs.stripe.com/payments/ideal) for more details.
   */
  public val ideal: InlineV1PaymentMethodConfigurationsPostRequestFormIdealXe3c934d8? = null,
  /**
   * JCB is a credit card company based in Japan. JCB is currently available in Japan to businesses approved by JCB, and
   * available to all businesses in Australia, Canada, Hong Kong, Japan, New Zealand, Singapore, Switzerland, United
   * Kingdom, United States, and all countries in the European Economic Area except Iceland. Check this
   * [page](https://support.stripe.com/questions/accepting-japan-credit-bureau-%28jcb%29-payments) for more details.
   */
  public val jcb: InlineV1PaymentMethodConfigurationsPostRequestFormJcbXbe39eb92? = null,
  /**
   * Kakao Pay is a popular local wallet available in South Korea.
   */
  public val kakaoPay: InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayX8c21cb7b? = null,
  /**
   * Klarna gives customers a range of [payment options](https://docs.stripe.com/payments/klarna#payment-options) during
   * checkout. Available payment options vary depending on the customer's billing address and the transaction amount.
   * These payment options make it convenient for customers to purchase items in all price ranges. Check this
   * [page](https://docs.stripe.com/payments/klarna) for more details.
   */
  public val klarna: InlineV1PaymentMethodConfigurationsPostRequestFormKlarnaX3100f92d? = null,
  /**
   * Konbini allows customers in Japan to pay for bills and online purchases at convenience stores with cash. Check this
   * [page](https://docs.stripe.com/payments/konbini) for more details.
   */
  public val konbini: InlineV1PaymentMethodConfigurationsPostRequestFormKonbiniX1c978e89? = null,
  /**
   * Korean cards let users pay using locally issued cards from South Korea.
   */
  public val krCard: InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd35ae901? = null,
  /**
   * [Link](https://docs.stripe.com/payments/link) is a payment method network. With Link, users save their payment
   * details once, then reuse that information to pay with one click for any business on the network.
   */
  public val link: InlineV1PaymentMethodConfigurationsPostRequestFormLinkX841fe0fb? = null,
  /**
   * MB WAY is the most popular wallet in Portugal. After entering their phone number in your checkout, customers
   * approve the payment directly in their MB WAY app. Check this [page](https://docs.stripe.com/payments/mb-way) for
   * more details.
   */
  public val mbWay: InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX5fbd0687? = null,
  /**
   * MobilePay is a [single-use](https://docs.stripe.com/payments/payment-methods#usage) card wallet payment method used
   * in Denmark and Finland. It allows customers to [authenticate and
   * approve](https://docs.stripe.com/payments/payment-methods#customer-actions) payments using the MobilePay app. Check
   * this [page](https://docs.stripe.com/payments/mobilepay) for more details.
   */
  public val mobilepay:
      InlineV1PaymentMethodConfigurationsPostRequestFormMobilepayX09982e75? = null,
  /**
   * Stripe users in Europe and the United States can accept Multibanco payments from customers in Portugal using
   * [Sources](https://stripe.com/docs/sources)—a single integration path for creating payments using any supported
   * method.
   */
  public val multibanco:
      InlineV1PaymentMethodConfigurationsPostRequestFormMultibancoXeceec1f5? = null,
  /**
   * Configuration name.
   */
  public val name: String? = null,
  /**
   * Naver Pay is a popular local wallet available in South Korea.
   */
  public val naverPay: InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayXdec65ae7? = null,
  /**
   * Stripe users in New Zealand can accept Bulk Electronic Clearing System (BECS) direct debit payments from customers
   * with a New Zeland bank account. Check this [page](https://docs.stripe.com/payments/nz-bank-account) for more
   * details.
   */
  public val nzBankAccount:
      InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountX2c4e2664? = null,
  /**
   * OXXO is a Mexican chain of convenience stores with thousands of locations across Latin America and represents
   * nearly 20% of online transactions in Mexico. OXXO allows customers to pay bills and online purchases in-store with
   * cash. Check this [page](https://docs.stripe.com/payments/oxxo) for more details.
   */
  public val oxxo: InlineV1PaymentMethodConfigurationsPostRequestFormOxxoXc393beb9? = null,
  /**
   * Przelewy24 is a Poland-based payment method aggregator that allows customers to complete transactions online using
   * bank transfers and other methods. Bank transfers account for 30% of online payments in Poland and Przelewy24
   * provides a way for customers to pay with over 165 banks. Check this [page](https://docs.stripe.com/payments/p24)
   * for more details.
   */
  public val p24: InlineV1PaymentMethodConfigurationsPostRequestFormP24Xdbf35c75? = null,
  /**
   * Pay by bank is a redirect payment method backed by bank transfers. A customer is redirected to their bank to
   * authorize a bank transfer for a given amount. This removes a lot of the error risks inherent in waiting for the
   * customer to initiate a transfer themselves, and is less expensive than card payments.
   */
  public val payByBank:
      InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXb023ae62? = null,
  /**
   * PAYCO is a [single-use](https://docs.stripe.com/payments/payment-methods#usage local wallet available in South
   * Korea.
   */
  public val payco: InlineV1PaymentMethodConfigurationsPostRequestFormPaycoX22659767? = null,
  /**
   * PayNow is a Singapore-based payment method that allows customers to make a payment using their preferred app from
   * participating banks and participating non-bank financial institutions. Check this
   * [page](https://docs.stripe.com/payments/paynow) for more details.
   */
  public val paynow: InlineV1PaymentMethodConfigurationsPostRequestFormPaynowX4f2275f6? = null,
  /**
   * PayPal, a digital wallet popular with customers in Europe, allows your customers worldwide to pay using their
   * PayPal account. Check this [page](https://docs.stripe.com/payments/paypal) for more details.
   */
  public val paypal: InlineV1PaymentMethodConfigurationsPostRequestFormPaypalX8c2debd0? = null,
  /**
   * PayTo is a [real-time](https://docs.stripe.com/payments/real-time) payment method that enables customers in
   * Australia to pay by providing their bank account details. Customers must accept a mandate authorizing you to debit
   * their account. Check this [page](https://docs.stripe.com/payments/payto) for more details.
   */
  public val payto: InlineV1PaymentMethodConfigurationsPostRequestFormPaytoXfb7f3010? = null,
  /**
   * Pix is a payment method popular in Brazil. When paying with Pix, customers authenticate and approve payments by
   * scanning a QR code in their preferred banking app. Check this [page](https://docs.stripe.com/payments/pix) for more
   * details.
   */
  public val pix: InlineV1PaymentMethodConfigurationsPostRequestFormPixXf4ab145a? = null,
  /**
   * PromptPay is a Thailand-based payment method that allows customers to make a payment using their preferred app from
   * participating banks. Check this [page](https://docs.stripe.com/payments/promptpay) for more details.
   */
  public val promptpay:
      InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXf9bf9d11? = null,
  /**
   * Revolut Pay, developed by Revolut, a global finance app, is a digital wallet payment method. Revolut Pay uses the
   * customer’s stored balance or cards to fund the payment, and offers the option for non-Revolut customers to save
   * their details after their first purchase.
   */
  public val revolutPay:
      InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX8a62f6f2? = null,
  /**
   * Samsung Pay is a [single-use](https://docs.stripe.com/payments/payment-methods#usage local wallet available in
   * South Korea.
   */
  public val samsungPay:
      InlineV1PaymentMethodConfigurationsPostRequestFormSamsungPayX8a9c8ae6? = null,
  /**
   * Satispay is a [single-use](/payments/payment-methods#usage) payment method where customers are required to
   * [authenticate](/payments/payment-methods#customer-actions) their payment. Customers pay by being redirected from
   * your website or app, authorizing the payment with Satispay, then returning to your website or app. You get
   * [immediate notification](/payments/payment-methods#payment-notification) of whether the payment succeeded or
   * failed.
   */
  public val satispay: InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXf9cb3345? = null,
  /**
   * Scalapay is a [single-use](/payments/payment-methods#usage) payment method that lets customers pay in 3 or 4
   * installments. Customers are redirected from your website or app, authorize the payment with Scalapay, then return
   * to your website or app. You get [immediate notification](/payments/payment-methods#payment-notification) of whether
   * the payment succeeded or failed.
   */
  public val scalapay: InlineV1PaymentMethodConfigurationsPostRequestFormScalapayX5db1aecc? = null,
  /**
   * The [Single Euro Payments Area (SEPA)](https://en.wikipedia.org/wiki/Single_Euro_Payments_Area) is an initiative of
   * the European Union to simplify payments within and across member countries. SEPA established and enforced banking
   * standards to allow for the direct debiting of every EUR-denominated bank account within the SEPA region, check this
   * [page](https://docs.stripe.com/payments/sepa-debit) for more details.
   */
  public val sepaDebit:
      InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX34eca210? = null,
  /**
   * Stripe users in Europe and the United States can use the [Payment Intents
   * API](https://stripe.com/docs/payments/payment-intents)—a single integration path for creating payments using any
   * supported method—to accept [Sofort](https://www.sofort.com/) payments from customers. Check this
   * [page](https://docs.stripe.com/payments/sofort) for more details.
   */
  public val sofort: InlineV1PaymentMethodConfigurationsPostRequestFormSofortXc66ee34d? = null,
  /**
   * Sunbit is a [single-use](https://docs.stripe.com/payments/payment-methods#usage) payment method where customers
   * choose to pay in 3, 6, or 12 installments. Customers are redirected from your website or app, authorize the payment
   * with Sunbit, then return to your website or app. You get [immediate
   * notification](https://docs.stripe.com/payments/payment-methods#payment-notification) of whether the payment
   * succeeded or failed.
   */
  public val sunbit: InlineV1PaymentMethodConfigurationsPostRequestFormSunbitX8a24279e? = null,
  /**
   * Swish is a [real-time](https://docs.stripe.com/payments/real-time) payment method popular in Sweden. It allows
   * customers to [authenticate and approve](https://docs.stripe.com/payments/payment-methods#customer-actions) payments
   * using the Swish mobile app and the Swedish BankID mobile app. Check this
   * [page](https://docs.stripe.com/payments/swish) for more details.
   */
  public val swish: InlineV1PaymentMethodConfigurationsPostRequestFormSwishX224143dc? = null,
  /**
   * Twint is a payment method popular in Switzerland. It allows customers to pay using their mobile phone. Check this
   * [page](https://docs.stripe.com/payments/twint) for more details.
   */
  public val twint: InlineV1PaymentMethodConfigurationsPostRequestFormTwintX5582225d? = null,
  /**
   * Unified Payment Interface (UPI) is India's leading payment method with exponential growth since it launched in
   * 2016.
   */
  public val upi: InlineV1PaymentMethodConfigurationsPostRequestFormUpiX1b2f286e? = null,
  /**
   * Stripe users in the United States can accept ACH direct debit payments from customers with a US bank account using
   * the Automated Clearing House (ACH) payments system operated by Nacha. Check this
   * [page](https://docs.stripe.com/payments/ach-direct-debit) for more details.
   */
  public val usBankAccount:
      InlineV1PaymentMethodConfigurationsPostRequestFormUsBankAccountXc50036e3? = null,
  /**
   * WeChat, owned by Tencent, is China's leading mobile app with over 1 billion monthly active users. Chinese consumers
   * can use WeChat Pay to pay for goods and services inside of businesses' apps and websites. WeChat Pay users buy most
   * frequently in gaming, e-commerce, travel, online education, and food/nutrition. Check this
   * [page](https://docs.stripe.com/payments/wechat-pay) for more details.
   */
  public val wechatPay:
      InlineV1PaymentMethodConfigurationsPostRequestFormWechatPayXbb73e4f1? = null,
  /**
   * Zip gives your customers a way to split purchases over a series of payments. Check this
   * [page](https://docs.stripe.com/payments/zip) for more details like country availability.
   */
  public val zip: InlineV1PaymentMethodConfigurationsPostRequestFormZipXe6445d5d? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Canadian pre-authorized debit payments, check this [page](https://docs.stripe.com/payments/acss-debit) for more
     * details like country availability.
     */
    public var acssDebit: InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX0dbc96ba? =
        null

    /**
     * Whether the configuration can be used for new payments.
     */
    public var active: Boolean? = null

    /**
     * [Affirm](https://www.affirm.com/) gives your customers a way to split purchases over a series of payments.
     * Depending on the purchase, they can pay with four interest-free payments (Split Pay) or pay over a longer term
     * (Installments), which might include interest. Check this [page](https://docs.stripe.com/payments/affirm) for more
     * details like country availability.
     */
    public var affirm: InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXb63acbe0? = null

    /**
     * Afterpay gives your customers a way to pay for purchases in installments, check this
     * [page](https://docs.stripe.com/payments/afterpay-clearpay) for more details like country availability. Afterpay
     * is particularly popular among businesses selling fashion, beauty, and sports products.
     */
    public var afterpayClearpay:
        InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayX79e7b98e? = null

    /**
     * Alipay is a digital wallet in China that has more than a billion active users worldwide. Alipay users can pay on
     * the web or on a mobile device using login credentials or their Alipay app. Alipay has a low dispute rate and
     * reduces fraud by authenticating payments using the customer's login credentials. Check this
     * [page](https://docs.stripe.com/payments/alipay) for more details.
     */
    public var alipay: InlineV1PaymentMethodConfigurationsPostRequestFormAlipayX1535ffff? = null

    /**
     * Alma is a Buy Now, Pay Later payment method that offers customers the ability to pay in 2, 3, or 4 installments.
     */
    public var alma: InlineV1PaymentMethodConfigurationsPostRequestFormAlmaX91932049? = null

    /**
     * Amazon Pay is a wallet payment method that lets your customers check out the same way as on Amazon.
     */
    public var amazonPay: InlineV1PaymentMethodConfigurationsPostRequestFormAmazonPayX939e07bd? =
        null

    /**
     * Stripe users can accept [Apple Pay](https://stripe.com/payments/apple-pay) in iOS applications in iOS 9 and
     * later, and on the web in Safari starting with iOS 10 or macOS Sierra. There are no additional fees to process
     * Apple Pay payments, and the [pricing](https://stripe.com/pricing) is the same as other card transactions. Check
     * this [page](https://docs.stripe.com/apple-pay) for more details.
     */
    public var applePay: InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX5a60e19d? = null

    /**
     * Apple Pay Later, a payment method for customers to buy now and pay later, gives your customers a way to split
     * purchases into four installments across six weeks.
     */
    public var applePayLater:
        InlineV1PaymentMethodConfigurationsPostRequestFormApplePayLaterX20d819f9? = null

    /**
     * Stripe users in Australia can accept Bulk Electronic Clearing System (BECS) direct debit payments from customers
     * with an Australian bank account. Check this [page](https://docs.stripe.com/payments/au-becs-debit) for more
     * details.
     */
    public var auBecsDebit: InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX5cc33789?
        = null

    /**
     * Stripe users in the UK can accept Bacs Direct Debit payments from customers with a UK bank account, check this
     * [page](https://docs.stripe.com/payments/payment-methods/bacs-debit) for more details.
     */
    public var bacsDebit: InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXd07cded8? =
        null

    /**
     * Bancontact is the most popular online payment method in Belgium, with over 15 million cards in circulation.
     * [Customers](https://docs.stripe.com/api/customers) use a Bancontact card or mobile app linked to a Belgian bank
     * account to make online payments that are secure, guaranteed, and confirmed immediately. Check this
     * [page](https://docs.stripe.com/payments/bancontact) for more details.
     */
    public var bancontact: InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX8748cb60? =
        null

    /**
     * Billie is a [single-use](https://docs.stripe.com/payments/payment-methods#usage) payment method that offers
     * businesses Pay by Invoice where they offer payment terms ranging from 7-120 days. Customers are redirected from
     * your website or app, authorize the payment with Billie, then return to your website or app. You get [immediate
     * notification](/payments/payment-methods#payment-notification) of whether the payment succeeded or failed.
     */
    public var billie: InlineV1PaymentMethodConfigurationsPostRequestFormBillieX7697ea1c? = null

    /**
     * To enable Bizum, buyers need a Spanish IBAN from a bank connected to Bizum. Within their banking app, they can
     * enable Bizum and link their mobile number to their IBAN.
     */
    public var bizum: InlineV1PaymentMethodConfigurationsPostRequestFormBizumXa32518d6? = null

    /**
     * BLIK is a [single use](https://docs.stripe.com/payments/payment-methods#usage) payment method that requires
     * customers to authenticate their payments. When customers want to pay online using BLIK, they request a six-digit
     * code from their banking application and enter it into the payment collection form. Check this
     * [page](https://docs.stripe.com/payments/blik) for more details.
     */
    public var blik: InlineV1PaymentMethodConfigurationsPostRequestFormBlikX3d3a6d6b? = null

    /**
     * Boleto is an official (regulated by the Central Bank of Brazil) payment method in Brazil. Check this
     * [page](https://docs.stripe.com/payments/boleto) for more details.
     */
    public var boleto: InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX0f0be225? = null

    /**
     * Cards are a popular way for consumers and businesses to pay online or in person. Stripe supports global and local
     * card networks.
     */
    public var card: InlineV1PaymentMethodConfigurationsPostRequestFormCardXf1c5a097? = null

    /**
     * Cartes Bancaires is France's local card network. More than 95% of these cards are co-branded with either Visa or
     * Mastercard, meaning you can process these cards over either Cartes Bancaires or the Visa or Mastercard networks.
     * Check this [page](https://docs.stripe.com/payments/cartes-bancaires) for more details.
     */
    public var cartesBancaires:
        InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesX77a15d74? = null

    /**
     * Cash App is a popular consumer app in the US that allows customers to bank, invest, send, and receive money using
     * their digital wallet. Check this [page](https://docs.stripe.com/payments/cash-app-pay) for more details.
     */
    public var cashapp: InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3e557dd5? = null

    /**
     * [Stablecoin payments](https://docs.stripe.com/payments/stablecoin-payments) enable customers to pay in
     * stablecoins like USDC from 100s of wallets including Phantom and Metamask.
     */
    public var crypto: InlineV1PaymentMethodConfigurationsPostRequestFormCryptoX40d57411? = null

    /**
     * Uses a customer’s [cash balance](https://docs.stripe.com/payments/customer-balance) for the payment. The cash
     * balance can be funded via a bank transfer. Check this [page](https://docs.stripe.com/payments/bank-transfers) for
     * more details.
     */
    public var customerBalance:
        InlineV1PaymentMethodConfigurationsPostRequestFormCustomerBalanceX11cda148? = null

    /**
     * EPS is an Austria-based payment method that allows customers to complete transactions online using their bank
     * credentials. EPS is supported by all Austrian banks and is accepted by over 80% of Austrian online retailers.
     * Check this [page](https://docs.stripe.com/payments/eps) for more details.
     */
    public var eps: InlineV1PaymentMethodConfigurationsPostRequestFormEpsXcb14b84a? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Financial Process Exchange (FPX) is a Malaysia-based payment method that allows customers to complete
     * transactions online using their bank credentials. Bank Negara Malaysia (BNM), the Central Bank of Malaysia, and
     * eleven other major Malaysian financial institutions are members of the PayNet Group, which owns and operates FPX.
     * It is one of the most popular online payment methods in Malaysia, with nearly 90 million transactions in 2018
     * according to BNM. Check this [page](https://docs.stripe.com/payments/fpx) for more details.
     */
    public var fpx: InlineV1PaymentMethodConfigurationsPostRequestFormFpxX3dcee04d? = null

    /**
     * Meal vouchers in France, or “titres-restaurant”, is a local benefits program commonly offered by employers for
     * their employees to purchase prepared food and beverages on working days. Check this
     * [page](https://docs.stripe.com/payments/meal-vouchers/fr-meal-vouchers) for more details.
     */
    public var frMealVoucherConecs:
        InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX9dafd76f? = null

    /**
     * giropay is a German payment method based on online banking, introduced in 2006. It allows customers to complete
     * transactions online using their online banking environment, with funds debited from their bank account. Depending
     * on their bank, customers confirm payments on giropay using a second factor of authentication or a PIN. giropay
     * accounts for 10% of online checkouts in Germany. Check this [page](https://docs.stripe.com/payments/giropay) for
     * more details.
     */
    public var giropay: InlineV1PaymentMethodConfigurationsPostRequestFormGiropayXa770ef5d? = null

    /**
     * Google Pay allows customers to make payments in your app or website using any credit or debit card saved to their
     * Google Account, including those from Google Play, YouTube, Chrome, or an Android device. Use the Google Pay API
     * to request any credit or debit card stored in your customer's Google account. Check this
     * [page](https://docs.stripe.com/google-pay) for more details.
     */
    public var googlePay: InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX5f48552b? =
        null

    /**
     * GrabPay is a payment method developed by [Grab](https://www.grab.com/sg/consumer/finance/pay/). GrabPay is a
     * digital wallet - customers maintain a balance in their wallets that they pay out with. Check this
     * [page](https://docs.stripe.com/payments/grabpay) for more details.
     */
    public var grabpay: InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXa4ffc889? = null

    /**
     * iDEAL is a Netherlands-based payment method that allows customers to complete transactions online using their
     * bank credentials. All major Dutch banks are members of Currence, the scheme that operates iDEAL, making it the
     * most popular online payment method in the Netherlands with a share of online transactions close to 55%. Check
     * this [page](https://docs.stripe.com/payments/ideal) for more details.
     */
    public var ideal: InlineV1PaymentMethodConfigurationsPostRequestFormIdealXe3c934d8? = null

    /**
     * JCB is a credit card company based in Japan. JCB is currently available in Japan to businesses approved by JCB,
     * and available to all businesses in Australia, Canada, Hong Kong, Japan, New Zealand, Singapore, Switzerland,
     * United Kingdom, United States, and all countries in the European Economic Area except Iceland. Check this
     * [page](https://support.stripe.com/questions/accepting-japan-credit-bureau-%28jcb%29-payments) for more details.
     */
    public var jcb: InlineV1PaymentMethodConfigurationsPostRequestFormJcbXbe39eb92? = null

    /**
     * Kakao Pay is a popular local wallet available in South Korea.
     */
    public var kakaoPay: InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayX8c21cb7b? = null

    /**
     * Klarna gives customers a range of [payment options](https://docs.stripe.com/payments/klarna#payment-options)
     * during checkout. Available payment options vary depending on the customer's billing address and the transaction
     * amount. These payment options make it convenient for customers to purchase items in all price ranges. Check this
     * [page](https://docs.stripe.com/payments/klarna) for more details.
     */
    public var klarna: InlineV1PaymentMethodConfigurationsPostRequestFormKlarnaX3100f92d? = null

    /**
     * Konbini allows customers in Japan to pay for bills and online purchases at convenience stores with cash. Check
     * this [page](https://docs.stripe.com/payments/konbini) for more details.
     */
    public var konbini: InlineV1PaymentMethodConfigurationsPostRequestFormKonbiniX1c978e89? = null

    /**
     * Korean cards let users pay using locally issued cards from South Korea.
     */
    public var krCard: InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd35ae901? = null

    /**
     * [Link](https://docs.stripe.com/payments/link) is a payment method network. With Link, users save their payment
     * details once, then reuse that information to pay with one click for any business on the network.
     */
    public var link: InlineV1PaymentMethodConfigurationsPostRequestFormLinkX841fe0fb? = null

    /**
     * MB WAY is the most popular wallet in Portugal. After entering their phone number in your checkout, customers
     * approve the payment directly in their MB WAY app. Check this [page](https://docs.stripe.com/payments/mb-way) for
     * more details.
     */
    public var mbWay: InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX5fbd0687? = null

    /**
     * MobilePay is a [single-use](https://docs.stripe.com/payments/payment-methods#usage) card wallet payment method
     * used in Denmark and Finland. It allows customers to [authenticate and
     * approve](https://docs.stripe.com/payments/payment-methods#customer-actions) payments using the MobilePay app.
     * Check this [page](https://docs.stripe.com/payments/mobilepay) for more details.
     */
    public var mobilepay: InlineV1PaymentMethodConfigurationsPostRequestFormMobilepayX09982e75? =
        null

    /**
     * Stripe users in Europe and the United States can accept Multibanco payments from customers in Portugal using
     * [Sources](https://stripe.com/docs/sources)—a single integration path for creating payments using any supported
     * method.
     */
    public var multibanco: InlineV1PaymentMethodConfigurationsPostRequestFormMultibancoXeceec1f5? =
        null

    /**
     * Configuration name.
     */
    public var name: String? = null

    /**
     * Naver Pay is a popular local wallet available in South Korea.
     */
    public var naverPay: InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayXdec65ae7? = null

    /**
     * Stripe users in New Zealand can accept Bulk Electronic Clearing System (BECS) direct debit payments from
     * customers with a New Zeland bank account. Check this [page](https://docs.stripe.com/payments/nz-bank-account) for
     * more details.
     */
    public var nzBankAccount:
        InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountX2c4e2664? = null

    /**
     * OXXO is a Mexican chain of convenience stores with thousands of locations across Latin America and represents
     * nearly 20% of online transactions in Mexico. OXXO allows customers to pay bills and online purchases in-store
     * with cash. Check this [page](https://docs.stripe.com/payments/oxxo) for more details.
     */
    public var oxxo: InlineV1PaymentMethodConfigurationsPostRequestFormOxxoXc393beb9? = null

    /**
     * Przelewy24 is a Poland-based payment method aggregator that allows customers to complete transactions online
     * using bank transfers and other methods. Bank transfers account for 30% of online payments in Poland and
     * Przelewy24 provides a way for customers to pay with over 165 banks. Check this
     * [page](https://docs.stripe.com/payments/p24) for more details.
     */
    public var p24: InlineV1PaymentMethodConfigurationsPostRequestFormP24Xdbf35c75? = null

    /**
     * Pay by bank is a redirect payment method backed by bank transfers. A customer is redirected to their bank to
     * authorize a bank transfer for a given amount. This removes a lot of the error risks inherent in waiting for the
     * customer to initiate a transfer themselves, and is less expensive than card payments.
     */
    public var payByBank: InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXb023ae62? =
        null

    /**
     * PAYCO is a [single-use](https://docs.stripe.com/payments/payment-methods#usage local wallet available in South
     * Korea.
     */
    public var payco: InlineV1PaymentMethodConfigurationsPostRequestFormPaycoX22659767? = null

    /**
     * PayNow is a Singapore-based payment method that allows customers to make a payment using their preferred app from
     * participating banks and participating non-bank financial institutions. Check this
     * [page](https://docs.stripe.com/payments/paynow) for more details.
     */
    public var paynow: InlineV1PaymentMethodConfigurationsPostRequestFormPaynowX4f2275f6? = null

    /**
     * PayPal, a digital wallet popular with customers in Europe, allows your customers worldwide to pay using their
     * PayPal account. Check this [page](https://docs.stripe.com/payments/paypal) for more details.
     */
    public var paypal: InlineV1PaymentMethodConfigurationsPostRequestFormPaypalX8c2debd0? = null

    /**
     * PayTo is a [real-time](https://docs.stripe.com/payments/real-time) payment method that enables customers in
     * Australia to pay by providing their bank account details. Customers must accept a mandate authorizing you to
     * debit their account. Check this [page](https://docs.stripe.com/payments/payto) for more details.
     */
    public var payto: InlineV1PaymentMethodConfigurationsPostRequestFormPaytoXfb7f3010? = null

    /**
     * Pix is a payment method popular in Brazil. When paying with Pix, customers authenticate and approve payments by
     * scanning a QR code in their preferred banking app. Check this [page](https://docs.stripe.com/payments/pix) for
     * more details.
     */
    public var pix: InlineV1PaymentMethodConfigurationsPostRequestFormPixXf4ab145a? = null

    /**
     * PromptPay is a Thailand-based payment method that allows customers to make a payment using their preferred app
     * from participating banks. Check this [page](https://docs.stripe.com/payments/promptpay) for more details.
     */
    public var promptpay: InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXf9bf9d11? =
        null

    /**
     * Revolut Pay, developed by Revolut, a global finance app, is a digital wallet payment method. Revolut Pay uses the
     * customer’s stored balance or cards to fund the payment, and offers the option for non-Revolut customers to save
     * their details after their first purchase.
     */
    public var revolutPay: InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX8a62f6f2? =
        null

    /**
     * Samsung Pay is a [single-use](https://docs.stripe.com/payments/payment-methods#usage local wallet available in
     * South Korea.
     */
    public var samsungPay: InlineV1PaymentMethodConfigurationsPostRequestFormSamsungPayX8a9c8ae6? =
        null

    /**
     * Satispay is a [single-use](/payments/payment-methods#usage) payment method where customers are required to
     * [authenticate](/payments/payment-methods#customer-actions) their payment. Customers pay by being redirected from
     * your website or app, authorizing the payment with Satispay, then returning to your website or app. You get
     * [immediate notification](/payments/payment-methods#payment-notification) of whether the payment succeeded or
     * failed.
     */
    public var satispay: InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXf9cb3345? = null

    /**
     * Scalapay is a [single-use](/payments/payment-methods#usage) payment method that lets customers pay in 3 or 4
     * installments. Customers are redirected from your website or app, authorize the payment with Scalapay, then return
     * to your website or app. You get [immediate notification](/payments/payment-methods#payment-notification) of
     * whether the payment succeeded or failed.
     */
    public var scalapay: InlineV1PaymentMethodConfigurationsPostRequestFormScalapayX5db1aecc? = null

    /**
     * The [Single Euro Payments Area (SEPA)](https://en.wikipedia.org/wiki/Single_Euro_Payments_Area) is an initiative
     * of the European Union to simplify payments within and across member countries. SEPA established and enforced
     * banking standards to allow for the direct debiting of every EUR-denominated bank account within the SEPA region,
     * check this [page](https://docs.stripe.com/payments/sepa-debit) for more details.
     */
    public var sepaDebit: InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX34eca210? =
        null

    /**
     * Stripe users in Europe and the United States can use the [Payment Intents
     * API](https://stripe.com/docs/payments/payment-intents)—a single integration path for creating payments using any
     * supported method—to accept [Sofort](https://www.sofort.com/) payments from customers. Check this
     * [page](https://docs.stripe.com/payments/sofort) for more details.
     */
    public var sofort: InlineV1PaymentMethodConfigurationsPostRequestFormSofortXc66ee34d? = null

    /**
     * Sunbit is a [single-use](https://docs.stripe.com/payments/payment-methods#usage) payment method where customers
     * choose to pay in 3, 6, or 12 installments. Customers are redirected from your website or app, authorize the
     * payment with Sunbit, then return to your website or app. You get [immediate
     * notification](https://docs.stripe.com/payments/payment-methods#payment-notification) of whether the payment
     * succeeded or failed.
     */
    public var sunbit: InlineV1PaymentMethodConfigurationsPostRequestFormSunbitX8a24279e? = null

    /**
     * Swish is a [real-time](https://docs.stripe.com/payments/real-time) payment method popular in Sweden. It allows
     * customers to [authenticate and approve](https://docs.stripe.com/payments/payment-methods#customer-actions)
     * payments using the Swish mobile app and the Swedish BankID mobile app. Check this
     * [page](https://docs.stripe.com/payments/swish) for more details.
     */
    public var swish: InlineV1PaymentMethodConfigurationsPostRequestFormSwishX224143dc? = null

    /**
     * Twint is a payment method popular in Switzerland. It allows customers to pay using their mobile phone. Check this
     * [page](https://docs.stripe.com/payments/twint) for more details.
     */
    public var twint: InlineV1PaymentMethodConfigurationsPostRequestFormTwintX5582225d? = null

    /**
     * Unified Payment Interface (UPI) is India's leading payment method with exponential growth since it launched in
     * 2016.
     */
    public var upi: InlineV1PaymentMethodConfigurationsPostRequestFormUpiX1b2f286e? = null

    /**
     * Stripe users in the United States can accept ACH direct debit payments from customers with a US bank account
     * using the Automated Clearing House (ACH) payments system operated by Nacha. Check this
     * [page](https://docs.stripe.com/payments/ach-direct-debit) for more details.
     */
    public var usBankAccount:
        InlineV1PaymentMethodConfigurationsPostRequestFormUsBankAccountXc50036e3? = null

    /**
     * WeChat, owned by Tencent, is China's leading mobile app with over 1 billion monthly active users. Chinese
     * consumers can use WeChat Pay to pay for goods and services inside of businesses' apps and websites. WeChat Pay
     * users buy most frequently in gaming, e-commerce, travel, online education, and food/nutrition. Check this
     * [page](https://docs.stripe.com/payments/wechat-pay) for more details.
     */
    public var wechatPay: InlineV1PaymentMethodConfigurationsPostRequestFormWechatPayXbb73e4f1? =
        null

    /**
     * Zip gives your customers a way to split purchases over a series of payments. Check this
     * [page](https://docs.stripe.com/payments/zip) for more details like country availability.
     */
    public var zip: InlineV1PaymentMethodConfigurationsPostRequestFormZipXe6445d5d? = null

    public fun build(): InlineV1PaymentMethodConfigurationsPostRequestFormX71360f88 = InlineV1PaymentMethodConfigurationsPostRequestFormX71360f88(
      acssDebit = acssDebit,
      active = active,
      affirm = affirm,
      afterpayClearpay = afterpayClearpay,
      alipay = alipay,
      alma = alma,
      amazonPay = amazonPay,
      applePay = applePay,
      applePayLater = applePayLater,
      auBecsDebit = auBecsDebit,
      bacsDebit = bacsDebit,
      bancontact = bancontact,
      billie = billie,
      bizum = bizum,
      blik = blik,
      boleto = boleto,
      card = card,
      cartesBancaires = cartesBancaires,
      cashapp = cashapp,
      crypto = crypto,
      customerBalance = customerBalance,
      eps = eps,
      expand = expand,
      fpx = fpx,
      frMealVoucherConecs = frMealVoucherConecs,
      giropay = giropay,
      googlePay = googlePay,
      grabpay = grabpay,
      ideal = ideal,
      jcb = jcb,
      kakaoPay = kakaoPay,
      klarna = klarna,
      konbini = konbini,
      krCard = krCard,
      link = link,
      mbWay = mbWay,
      mobilepay = mobilepay,
      multibanco = multibanco,
      name = name,
      naverPay = naverPay,
      nzBankAccount = nzBankAccount,
      oxxo = oxxo,
      p24 = p24,
      payByBank = payByBank,
      payco = payco,
      paynow = paynow,
      paypal = paypal,
      payto = payto,
      pix = pix,
      promptpay = promptpay,
      revolutPay = revolutPay,
      samsungPay = samsungPay,
      satispay = satispay,
      scalapay = scalapay,
      sepaDebit = sepaDebit,
      sofort = sofort,
      sunbit = sunbit,
      swish = swish,
      twint = twint,
      upi = upi,
      usBankAccount = usBankAccount,
      wechatPay = wechatPay,
      zip = zip,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormX71360f88 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsPostRequestFormX71360f88> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsPostRequestFormX71360f88 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsPostRequestFormX71360f88")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodConfigurationsPostRequestFormX71360f88 must be a JSON object")
      return InlineV1PaymentMethodConfigurationsPostRequestFormX71360f88(
        acssDebit = rawObject["acss_debit"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormAcssDebitX0dbc96ba>(it) },
        active = rawObject["active"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        affirm = rawObject["affirm"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormAffirmXb63acbe0>(it) },
        afterpayClearpay = rawObject["afterpay_clearpay"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormAfterpayClearpayX79e7b98e>(it) },
        alipay = rawObject["alipay"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormAlipayX1535ffff>(it) },
        alma = rawObject["alma"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormAlmaX91932049>(it) },
        amazonPay = rawObject["amazon_pay"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormAmazonPayX939e07bd>(it) },
        applePay = rawObject["apple_pay"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormApplePayX5a60e19d>(it) },
        applePayLater = rawObject["apple_pay_later"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormApplePayLaterX20d819f9>(it) },
        auBecsDebit = rawObject["au_becs_debit"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormAuBecsDebitX5cc33789>(it) },
        bacsDebit = rawObject["bacs_debit"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormBacsDebitXd07cded8>(it) },
        bancontact = rawObject["bancontact"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormBancontactX8748cb60>(it) },
        billie = rawObject["billie"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormBillieX7697ea1c>(it) },
        bizum = rawObject["bizum"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormBizumXa32518d6>(it) },
        blik = rawObject["blik"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormBlikX3d3a6d6b>(it) },
        boleto = rawObject["boleto"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormBoletoX0f0be225>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormCardXf1c5a097>(it) },
        cartesBancaires = rawObject["cartes_bancaires"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormCartesBancairesX77a15d74>(it) },
        cashapp = rawObject["cashapp"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormCashappX3e557dd5>(it) },
        crypto = rawObject["crypto"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormCryptoX40d57411>(it) },
        customerBalance = rawObject["customer_balance"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormCustomerBalanceX11cda148>(it) },
        eps = rawObject["eps"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormEpsXcb14b84a>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        fpx = rawObject["fpx"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormFpxX3dcee04d>(it) },
        frMealVoucherConecs = rawObject["fr_meal_voucher_conecs"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormFrMealVoucherConecsX9dafd76f>(it) },
        giropay = rawObject["giropay"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormGiropayXa770ef5d>(it) },
        googlePay = rawObject["google_pay"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormGooglePayX5f48552b>(it) },
        grabpay = rawObject["grabpay"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormGrabpayXa4ffc889>(it) },
        ideal = rawObject["ideal"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormIdealXe3c934d8>(it) },
        jcb = rawObject["jcb"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormJcbXbe39eb92>(it) },
        kakaoPay = rawObject["kakao_pay"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormKakaoPayX8c21cb7b>(it) },
        klarna = rawObject["klarna"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormKlarnaX3100f92d>(it) },
        konbini = rawObject["konbini"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormKonbiniX1c978e89>(it) },
        krCard = rawObject["kr_card"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormKrCardXd35ae901>(it) },
        link = rawObject["link"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormLinkX841fe0fb>(it) },
        mbWay = rawObject["mb_way"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormMbWayX5fbd0687>(it) },
        mobilepay = rawObject["mobilepay"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormMobilepayX09982e75>(it) },
        multibanco = rawObject["multibanco"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormMultibancoXeceec1f5>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        naverPay = rawObject["naver_pay"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormNaverPayXdec65ae7>(it) },
        nzBankAccount = rawObject["nz_bank_account"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormNzBankAccountX2c4e2664>(it) },
        oxxo = rawObject["oxxo"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormOxxoXc393beb9>(it) },
        p24 = rawObject["p24"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormP24Xdbf35c75>(it) },
        payByBank = rawObject["pay_by_bank"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormPayByBankXb023ae62>(it) },
        payco = rawObject["payco"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormPaycoX22659767>(it) },
        paynow = rawObject["paynow"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormPaynowX4f2275f6>(it) },
        paypal = rawObject["paypal"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormPaypalX8c2debd0>(it) },
        payto = rawObject["payto"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormPaytoXfb7f3010>(it) },
        pix = rawObject["pix"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormPixXf4ab145a>(it) },
        promptpay = rawObject["promptpay"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormPromptpayXf9bf9d11>(it) },
        revolutPay = rawObject["revolut_pay"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormRevolutPayX8a62f6f2>(it) },
        samsungPay = rawObject["samsung_pay"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormSamsungPayX8a9c8ae6>(it) },
        satispay = rawObject["satispay"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormSatispayXf9cb3345>(it) },
        scalapay = rawObject["scalapay"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormScalapayX5db1aecc>(it) },
        sepaDebit = rawObject["sepa_debit"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormSepaDebitX34eca210>(it) },
        sofort = rawObject["sofort"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormSofortXc66ee34d>(it) },
        sunbit = rawObject["sunbit"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormSunbitX8a24279e>(it) },
        swish = rawObject["swish"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormSwishX224143dc>(it) },
        twint = rawObject["twint"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormTwintX5582225d>(it) },
        upi = rawObject["upi"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormUpiX1b2f286e>(it) },
        usBankAccount = rawObject["us_bank_account"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormUsBankAccountXc50036e3>(it) },
        wechatPay = rawObject["wechat_pay"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormWechatPayXbb73e4f1>(it) },
        zip = rawObject["zip"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsPostRequestFormZipXe6445d5d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsPostRequestFormX71360f88) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsPostRequestFormX71360f88")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.acssDebit?.let { put("acss_debit", json.encodeToJsonElement(it)) }
        value.active?.let { put("active", json.encodeToJsonElement(it)) }
        value.affirm?.let { put("affirm", json.encodeToJsonElement(it)) }
        value.afterpayClearpay?.let { put("afterpay_clearpay", json.encodeToJsonElement(it)) }
        value.alipay?.let { put("alipay", json.encodeToJsonElement(it)) }
        value.alma?.let { put("alma", json.encodeToJsonElement(it)) }
        value.amazonPay?.let { put("amazon_pay", json.encodeToJsonElement(it)) }
        value.applePay?.let { put("apple_pay", json.encodeToJsonElement(it)) }
        value.applePayLater?.let { put("apple_pay_later", json.encodeToJsonElement(it)) }
        value.auBecsDebit?.let { put("au_becs_debit", json.encodeToJsonElement(it)) }
        value.bacsDebit?.let { put("bacs_debit", json.encodeToJsonElement(it)) }
        value.bancontact?.let { put("bancontact", json.encodeToJsonElement(it)) }
        value.billie?.let { put("billie", json.encodeToJsonElement(it)) }
        value.bizum?.let { put("bizum", json.encodeToJsonElement(it)) }
        value.blik?.let { put("blik", json.encodeToJsonElement(it)) }
        value.boleto?.let { put("boleto", json.encodeToJsonElement(it)) }
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
        value.cartesBancaires?.let { put("cartes_bancaires", json.encodeToJsonElement(it)) }
        value.cashapp?.let { put("cashapp", json.encodeToJsonElement(it)) }
        value.crypto?.let { put("crypto", json.encodeToJsonElement(it)) }
        value.customerBalance?.let { put("customer_balance", json.encodeToJsonElement(it)) }
        value.eps?.let { put("eps", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.fpx?.let { put("fpx", json.encodeToJsonElement(it)) }
        value.frMealVoucherConecs?.let { put("fr_meal_voucher_conecs", json.encodeToJsonElement(it)) }
        value.giropay?.let { put("giropay", json.encodeToJsonElement(it)) }
        value.googlePay?.let { put("google_pay", json.encodeToJsonElement(it)) }
        value.grabpay?.let { put("grabpay", json.encodeToJsonElement(it)) }
        value.ideal?.let { put("ideal", json.encodeToJsonElement(it)) }
        value.jcb?.let { put("jcb", json.encodeToJsonElement(it)) }
        value.kakaoPay?.let { put("kakao_pay", json.encodeToJsonElement(it)) }
        value.klarna?.let { put("klarna", json.encodeToJsonElement(it)) }
        value.konbini?.let { put("konbini", json.encodeToJsonElement(it)) }
        value.krCard?.let { put("kr_card", json.encodeToJsonElement(it)) }
        value.link?.let { put("link", json.encodeToJsonElement(it)) }
        value.mbWay?.let { put("mb_way", json.encodeToJsonElement(it)) }
        value.mobilepay?.let { put("mobilepay", json.encodeToJsonElement(it)) }
        value.multibanco?.let { put("multibanco", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.naverPay?.let { put("naver_pay", json.encodeToJsonElement(it)) }
        value.nzBankAccount?.let { put("nz_bank_account", json.encodeToJsonElement(it)) }
        value.oxxo?.let { put("oxxo", json.encodeToJsonElement(it)) }
        value.p24?.let { put("p24", json.encodeToJsonElement(it)) }
        value.payByBank?.let { put("pay_by_bank", json.encodeToJsonElement(it)) }
        value.payco?.let { put("payco", json.encodeToJsonElement(it)) }
        value.paynow?.let { put("paynow", json.encodeToJsonElement(it)) }
        value.paypal?.let { put("paypal", json.encodeToJsonElement(it)) }
        value.payto?.let { put("payto", json.encodeToJsonElement(it)) }
        value.pix?.let { put("pix", json.encodeToJsonElement(it)) }
        value.promptpay?.let { put("promptpay", json.encodeToJsonElement(it)) }
        value.revolutPay?.let { put("revolut_pay", json.encodeToJsonElement(it)) }
        value.samsungPay?.let { put("samsung_pay", json.encodeToJsonElement(it)) }
        value.satispay?.let { put("satispay", json.encodeToJsonElement(it)) }
        value.scalapay?.let { put("scalapay", json.encodeToJsonElement(it)) }
        value.sepaDebit?.let { put("sepa_debit", json.encodeToJsonElement(it)) }
        value.sofort?.let { put("sofort", json.encodeToJsonElement(it)) }
        value.sunbit?.let { put("sunbit", json.encodeToJsonElement(it)) }
        value.swish?.let { put("swish", json.encodeToJsonElement(it)) }
        value.twint?.let { put("twint", json.encodeToJsonElement(it)) }
        value.upi?.let { put("upi", json.encodeToJsonElement(it)) }
        value.usBankAccount?.let { put("us_bank_account", json.encodeToJsonElement(it)) }
        value.wechatPay?.let { put("wechat_pay", json.encodeToJsonElement(it)) }
        value.zip?.let { put("zip", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodConfigurationsPostRequestFormX71360f88(block: InlineV1PaymentMethodConfigurationsPostRequestFormX71360f88.Builder.() -> Unit): InlineV1PaymentMethodConfigurationsPostRequestFormX71360f88 = InlineV1PaymentMethodConfigurationsPostRequestFormX71360f88.build(block)
