package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * PaymentMethodConfigurations control which payment methods are displayed to your customers when you don't explicitly
 * specify payment method types. You can have multiple configurations with different sets of payment methods for
 * different scenarios.
 *
 * There are two types of PaymentMethodConfigurations. Which is used depends on the [charge
 * type](https://docs.stripe.com/connect/charges):
 *
 * **Direct** configurations apply to payments created on your account, including Connect destination charges, Connect
 * separate charges and transfers, and payments not involving Connect.
 *
 * **Child** configurations apply to payments created on your connected accounts using direct charges, and charges with
 * the on_behalf_of parameter.
 *
 * Child configurations have a `parent` that sets default values and controls which settings connected accounts may
 * override. You can specify a parent ID at payment time, and Stripe will automatically resolve the connected account’s
 * associated child configuration. Parent configurations are [managed in the
 * dashboard](https://dashboard.stripe.com/settings/payment_methods/connected_accounts) and are not available in this
 * API.
 *
 * Related guides:
 * - [Payment Method Configurations API](https://docs.stripe.com/connect/payment-method-configurations)
 * - [Multiple configurations on dynamic payment
 * methods](https://docs.stripe.com/payments/multiple-payment-method-configs)
 * - [Multiple configurations for your Connect
 * accounts](https://docs.stripe.com/connect/multiple-payment-method-configurations)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_configuration
 */
@Serializable(with = PaymentMethodConfiguration.Serializer::class)
public class PaymentMethodConfiguration(
  /**
   * Whether the configuration can be used for new payments.
   */
  public val active: Boolean,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * The default configuration is used whenever a payment method configuration is not specified.
   */
  public val isDefault: Boolean,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * The configuration's name.
   */
  public val name: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlinePaymentMethodConfigurationObjectValueX814d04d2,
  public val acssDebit: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val affirm: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val afterpayClearpay: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val alipay: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val alma: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val amazonPay: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val applePay: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  /**
   * For child configs, the Connect application associated with the configuration.
   */
  public val application: String? = null,
  public val auBecsDebit: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val bacsDebit: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val bancontact: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val billie: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val bizum: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val blik: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val boleto: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val card: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val cartesBancaires: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val cashapp: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val crypto: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val customerBalance: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val eps: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val fpx: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val giropay: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val googlePay: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val grabpay: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val ideal: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val jcb: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val kakaoPay: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val klarna: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val konbini: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val krCard: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val link: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val mbWay: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val mobilepay: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val multibanco: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val naverPay: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val nzBankAccount: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val oxxo: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val p24: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  /**
   * For child configs, the configuration's parent configuration.
   */
  public val parent: String? = null,
  public val payByBank: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val payco: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val paynow: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val paypal: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val payto: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val pix: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val promptpay: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val revolutPay: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val samsungPay: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val satispay: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val scalapay: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val sepaDebit: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val sofort: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val sunbit: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val swish: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val twint: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val upi: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val usBankAccount: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val wechatPay: PaymentMethodConfigResourcePaymentMethodProperties? = null,
  public val zip: PaymentMethodConfigResourcePaymentMethodProperties? = null,
) {
  public class Builder {
    private var activeValue: Boolean? = null

    public var active: Boolean
      get() = requireNotNull(activeValue) { "active is required" }
      set(`value`) {
        activeValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var isDefaultValue: Boolean? = null

    public var isDefault: Boolean
      get() = requireNotNull(isDefaultValue) { "isDefault is required" }
      set(`value`) {
        isDefaultValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var objectValueValue: InlinePaymentMethodConfigurationObjectValueX814d04d2? = null

    public var objectValue: InlinePaymentMethodConfigurationObjectValueX814d04d2
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    public var acssDebit: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var affirm: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var afterpayClearpay: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var alipay: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var alma: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var amazonPay: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var applePay: PaymentMethodConfigResourcePaymentMethodProperties? = null

    /**
     * For child configs, the Connect application associated with the configuration.
     */
    public var application: String? = null

    public var auBecsDebit: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var bacsDebit: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var bancontact: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var billie: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var bizum: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var blik: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var boleto: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var card: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var cartesBancaires: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var cashapp: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var crypto: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var customerBalance: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var eps: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var fpx: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var giropay: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var googlePay: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var grabpay: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var ideal: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var jcb: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var kakaoPay: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var klarna: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var konbini: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var krCard: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var link: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var mbWay: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var mobilepay: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var multibanco: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var naverPay: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var nzBankAccount: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var oxxo: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var p24: PaymentMethodConfigResourcePaymentMethodProperties? = null

    /**
     * For child configs, the configuration's parent configuration.
     */
    public var parent: String? = null

    public var payByBank: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var payco: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var paynow: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var paypal: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var payto: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var pix: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var promptpay: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var revolutPay: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var samsungPay: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var satispay: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var scalapay: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var sepaDebit: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var sofort: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var sunbit: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var swish: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var twint: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var upi: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var usBankAccount: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var wechatPay: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public var zip: PaymentMethodConfigResourcePaymentMethodProperties? = null

    public fun build(): PaymentMethodConfiguration {
      check(activeValue != null) { "active is required" }
      check(idValue != null) { "id is required" }
      check(isDefaultValue != null) { "isDefault is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(nameValue != null) { "name is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return PaymentMethodConfiguration(
        active = active,
        id = id,
        isDefault = isDefault,
        livemode = livemode,
        name = name,
        objectValue = objectValue,
        acssDebit = acssDebit,
        affirm = affirm,
        afterpayClearpay = afterpayClearpay,
        alipay = alipay,
        alma = alma,
        amazonPay = amazonPay,
        applePay = applePay,
        application = application,
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
        fpx = fpx,
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
        naverPay = naverPay,
        nzBankAccount = nzBankAccount,
        oxxo = oxxo,
        p24 = p24,
        parent = parent,
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
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodConfiguration = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodConfiguration> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodConfiguration {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodConfiguration")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodConfiguration must be a JSON object")
      val active = json.decodeRequired<Boolean>(rawObject, "active")
      val id = json.decodeRequired<String>(rawObject, "id")
      val isDefault = json.decodeRequired<Boolean>(rawObject, "is_default")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val name = json.decodeRequired<String>(rawObject, "name")
      val objectValue = json.decodeRequired<InlinePaymentMethodConfigurationObjectValueX814d04d2>(rawObject, "object")
      return PaymentMethodConfiguration(
        active = active,
        id = id,
        isDefault = isDefault,
        livemode = livemode,
        name = name,
        objectValue = objectValue,
        acssDebit = rawObject["acss_debit"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        affirm = rawObject["affirm"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        afterpayClearpay = rawObject["afterpay_clearpay"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        alipay = rawObject["alipay"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        alma = rawObject["alma"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        amazonPay = rawObject["amazon_pay"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        applePay = rawObject["apple_pay"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        application = rawObject["application"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        auBecsDebit = rawObject["au_becs_debit"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        bacsDebit = rawObject["bacs_debit"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        bancontact = rawObject["bancontact"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        billie = rawObject["billie"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        bizum = rawObject["bizum"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        blik = rawObject["blik"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        boleto = rawObject["boleto"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        cartesBancaires = rawObject["cartes_bancaires"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        cashapp = rawObject["cashapp"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        crypto = rawObject["crypto"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        customerBalance = rawObject["customer_balance"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        eps = rawObject["eps"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        fpx = rawObject["fpx"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        giropay = rawObject["giropay"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        googlePay = rawObject["google_pay"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        grabpay = rawObject["grabpay"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        ideal = rawObject["ideal"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        jcb = rawObject["jcb"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        kakaoPay = rawObject["kakao_pay"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        klarna = rawObject["klarna"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        konbini = rawObject["konbini"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        krCard = rawObject["kr_card"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        link = rawObject["link"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        mbWay = rawObject["mb_way"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        mobilepay = rawObject["mobilepay"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        multibanco = rawObject["multibanco"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        naverPay = rawObject["naver_pay"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        nzBankAccount = rawObject["nz_bank_account"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        oxxo = rawObject["oxxo"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        p24 = rawObject["p24"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        parent = rawObject["parent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        payByBank = rawObject["pay_by_bank"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        payco = rawObject["payco"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        paynow = rawObject["paynow"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        paypal = rawObject["paypal"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        payto = rawObject["payto"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        pix = rawObject["pix"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        promptpay = rawObject["promptpay"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        revolutPay = rawObject["revolut_pay"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        samsungPay = rawObject["samsung_pay"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        satispay = rawObject["satispay"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        scalapay = rawObject["scalapay"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        sepaDebit = rawObject["sepa_debit"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        sofort = rawObject["sofort"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        sunbit = rawObject["sunbit"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        swish = rawObject["swish"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        twint = rawObject["twint"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        upi = rawObject["upi"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        usBankAccount = rawObject["us_bank_account"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        wechatPay = rawObject["wechat_pay"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
        zip = rawObject["zip"]?.let { json.decodeFromJsonElement<PaymentMethodConfigResourcePaymentMethodProperties>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodConfiguration) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodConfiguration")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("active", json.encodeToJsonElement(value.active))
        put("id", value.id)
        put("is_default", json.encodeToJsonElement(value.isDefault))
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("name", value.name)
        put("object", json.encodeToJsonElement(value.objectValue))
        value.acssDebit?.let { put("acss_debit", json.encodeToJsonElement(it)) }
        value.affirm?.let { put("affirm", json.encodeToJsonElement(it)) }
        value.afterpayClearpay?.let { put("afterpay_clearpay", json.encodeToJsonElement(it)) }
        value.alipay?.let { put("alipay", json.encodeToJsonElement(it)) }
        value.alma?.let { put("alma", json.encodeToJsonElement(it)) }
        value.amazonPay?.let { put("amazon_pay", json.encodeToJsonElement(it)) }
        value.applePay?.let { put("apple_pay", json.encodeToJsonElement(it)) }
        value.application?.let { put("application", it) }
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
        value.fpx?.let { put("fpx", json.encodeToJsonElement(it)) }
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
        value.naverPay?.let { put("naver_pay", json.encodeToJsonElement(it)) }
        value.nzBankAccount?.let { put("nz_bank_account", json.encodeToJsonElement(it)) }
        value.oxxo?.let { put("oxxo", json.encodeToJsonElement(it)) }
        value.p24?.let { put("p24", json.encodeToJsonElement(it)) }
        value.parent?.let { put("parent", it) }
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

public fun paymentMethodConfiguration(block: PaymentMethodConfiguration.Builder.() -> Unit): PaymentMethodConfiguration = PaymentMethodConfiguration.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentMethodConfiguration is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
