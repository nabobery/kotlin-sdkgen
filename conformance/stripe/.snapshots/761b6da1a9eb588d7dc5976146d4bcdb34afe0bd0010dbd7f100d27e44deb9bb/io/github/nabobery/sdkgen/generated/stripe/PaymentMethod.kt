package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.ConsistentCopyVisibility
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@ConsistentCopyVisibility
@Serializable
public data class PaymentMethodView internal constructor(
  @SerialName("acss_debit")
  public val acssDebit: PaymentMethodAcssDebit? = null,
  public val affirm: JsonObject? = null,
  @SerialName("afterpay_clearpay")
  public val afterpayClearpay: JsonObject? = null,
  public val alipay: JsonObject? = null,
  @SerialName("allow_redisplay")
  public val allowRedisplay: InlinePaymentMethodAllowRedisplayX1787c685? = null,
  public val alma: JsonObject? = null,
  @SerialName("amazon_pay")
  public val amazonPay: JsonObject? = null,
  @SerialName("au_becs_debit")
  public val auBecsDebit: PaymentMethodAuBecsDebit? = null,
  @SerialName("bacs_debit")
  public val bacsDebit: PaymentMethodBacsDebit? = null,
  public val bancontact: JsonObject? = null,
  public val billie: JsonObject? = null,
  @SerialName("billing_details")
  public val billingDetails: BillingDetails,
  public val bizum: PaymentMethodBizum? = null,
  public val blik: PaymentMethodBlik? = null,
  public val boleto: PaymentMethodBoleto? = null,
  public val card: PaymentMethodCard? = null,
  @SerialName("card_present")
  public val cardPresent: PaymentMethodCardPresent? = null,
  public val cashapp: PaymentMethodCashapp? = null,
  public val created: Int,
  public val crypto: JsonObject? = null,
  public val custom: PaymentMethodCustom? = null,
  public val customer: InlinePaymentMethodCustomerX819912bc? = null,
  @SerialName("customer_account")
  public val customerAccount: String? = null,
  @SerialName("customer_balance")
  public val customerBalance: JsonObject? = null,
  public val eps: PaymentMethodEps? = null,
  public val fpx: PaymentMethodFpx? = null,
  public val giropay: JsonObject? = null,
  public val grabpay: JsonObject? = null,
  public val id: String,
  public val ideal: PaymentMethodIdeal? = null,
  @SerialName("interac_present")
  public val interacPresent: PaymentMethodInteracPresent? = null,
  @SerialName("kakao_pay")
  public val kakaoPay: JsonObject? = null,
  public val klarna: PaymentMethodKlarna? = null,
  public val konbini: JsonObject? = null,
  @SerialName("kr_card")
  public val krCard: PaymentMethodKrCard? = null,
  public val link: PaymentMethodLink? = null,
  public val livemode: Boolean,
  @SerialName("mb_way")
  public val mbWay: JsonObject? = null,
  public val metadata: Map<String, String>? = null,
  public val mobilepay: JsonObject? = null,
  public val multibanco: JsonObject? = null,
  @SerialName("naver_pay")
  public val naverPay: PaymentMethodNaverPay? = null,
  @SerialName("nz_bank_account")
  public val nzBankAccount: PaymentMethodNzBankAccount? = null,
  @SerialName("object")
  public val objectValue: InlinePaymentMethodObjectValueX5a455d61,
  public val oxxo: JsonObject? = null,
  public val p24: PaymentMethodP24? = null,
  @SerialName("pay_by_bank")
  public val payByBank: JsonObject? = null,
  public val payco: JsonObject? = null,
  public val paynow: JsonObject? = null,
  public val paypal: PaymentMethodPaypal? = null,
  public val payto: PaymentMethodPayto? = null,
  public val pix: PaymentMethodPix? = null,
  public val promptpay: JsonObject? = null,
  @SerialName("radar_options")
  public val radarOptions: RadarRadarOptions? = null,
  @SerialName("revolut_pay")
  public val revolutPay: JsonObject? = null,
  @SerialName("samsung_pay")
  public val samsungPay: JsonObject? = null,
  public val satispay: JsonObject? = null,
  public val scalapay: JsonObject? = null,
  @SerialName("sepa_debit")
  public val sepaDebit: PaymentMethodSepaDebit? = null,
  public val sofort: PaymentMethodSofort? = null,
  public val sunbit: JsonObject? = null,
  public val swish: JsonObject? = null,
  public val twint: JsonObject? = null,
  public val type: InlinePaymentMethodTypeXf6053a44,
  public val upi: PaymentMethodUpi? = null,
  @SerialName("us_bank_account")
  public val usBankAccount: PaymentMethodUsBankAccount? = null,
  @SerialName("wechat_pay")
  public val wechatPay: JsonObject? = null,
  public val zip: JsonObject? = null,
)

/**
 * PaymentMethod objects represent your customer's payment instruments.
 * You can use them with [PaymentIntents](https://docs.stripe.com/payments/payment-intents) to collect payments or save
 * them to
 * Customer objects to store instrument details for future payments.
 *
 * Related guides: [Payment Methods](https://docs.stripe.com/payments/payment-methods) and [More Payment
 * Scenarios](https://docs.stripe.com/payments/more-payment-scenarios).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method
 */
@Serializable(with = PaymentMethod.Serializer::class)
public class PaymentMethod(
  public val billingDetails: BillingDetails,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlinePaymentMethodObjectValueX5a455d61,
  /**
   * The type of the PaymentMethod. An additional hash is included on the PaymentMethod with a name matching this value.
   * It contains additional information specific to the PaymentMethod type.
   */
  public val type: InlinePaymentMethodTypeXf6053a44,
  public val acssDebit: PaymentMethodAcssDebit? = null,
  public val affirm: JsonObject? = null,
  public val afterpayClearpay: JsonObject? = null,
  public val alipay: JsonObject? = null,
  /**
   * This field indicates whether this payment method can be shown again to its customer in a checkout flow. Stripe
   * products such as Checkout and Elements use this field to determine whether a payment method can be shown as a saved
   * payment method in a checkout flow. The field defaults to “unspecified”.
   */
  public val allowRedisplay: InlinePaymentMethodAllowRedisplayX1787c685? = null,
  public val alma: JsonObject? = null,
  public val amazonPay: JsonObject? = null,
  public val auBecsDebit: PaymentMethodAuBecsDebit? = null,
  public val bacsDebit: PaymentMethodBacsDebit? = null,
  public val bancontact: JsonObject? = null,
  public val billie: JsonObject? = null,
  public val bizum: PaymentMethodBizum? = null,
  public val blik: PaymentMethodBlik? = null,
  public val boleto: PaymentMethodBoleto? = null,
  public val card: PaymentMethodCard? = null,
  public val cardPresent: PaymentMethodCardPresent? = null,
  public val cashapp: PaymentMethodCashapp? = null,
  public val crypto: JsonObject? = null,
  public val custom: PaymentMethodCustom? = null,
  /**
   * The ID of the Customer to which this PaymentMethod is saved. This will not be set when the PaymentMethod has not
   * been saved to a Customer.
   */
  public val customer: InlinePaymentMethodCustomerX819912bc? = null,
  public val customerAccount: String? = null,
  public val customerBalance: JsonObject? = null,
  public val eps: PaymentMethodEps? = null,
  public val fpx: PaymentMethodFpx? = null,
  public val giropay: JsonObject? = null,
  public val grabpay: JsonObject? = null,
  public val ideal: PaymentMethodIdeal? = null,
  public val interacPresent: PaymentMethodInteracPresent? = null,
  public val kakaoPay: JsonObject? = null,
  public val klarna: PaymentMethodKlarna? = null,
  public val konbini: JsonObject? = null,
  public val krCard: PaymentMethodKrCard? = null,
  public val link: PaymentMethodLink? = null,
  public val mbWay: JsonObject? = null,
  metadata: Map<String, String>? = null,
  public val mobilepay: JsonObject? = null,
  public val multibanco: JsonObject? = null,
  public val naverPay: PaymentMethodNaverPay? = null,
  public val nzBankAccount: PaymentMethodNzBankAccount? = null,
  public val oxxo: JsonObject? = null,
  public val p24: PaymentMethodP24? = null,
  public val payByBank: JsonObject? = null,
  public val payco: JsonObject? = null,
  public val paynow: JsonObject? = null,
  public val paypal: PaymentMethodPaypal? = null,
  public val payto: PaymentMethodPayto? = null,
  public val pix: PaymentMethodPix? = null,
  public val promptpay: JsonObject? = null,
  public val radarOptions: RadarRadarOptions? = null,
  public val revolutPay: JsonObject? = null,
  public val samsungPay: JsonObject? = null,
  public val satispay: JsonObject? = null,
  public val scalapay: JsonObject? = null,
  public val sepaDebit: PaymentMethodSepaDebit? = null,
  public val sofort: PaymentMethodSofort? = null,
  public val sunbit: JsonObject? = null,
  public val swish: JsonObject? = null,
  public val twint: JsonObject? = null,
  public val upi: PaymentMethodUpi? = null,
  public val usBankAccount: PaymentMethodUsBankAccount? = null,
  public val wechatPay: JsonObject? = null,
  public val zip: JsonObject? = null,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var billingDetailsValue: BillingDetails? = null

    public var billingDetails: BillingDetails
      get() = requireNotNull(billingDetailsValue) { "billingDetails is required" }
      set(`value`) {
        billingDetailsValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var objectValueValue: InlinePaymentMethodObjectValueX5a455d61? = null

    public var objectValue: InlinePaymentMethodObjectValueX5a455d61
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var typeValue: InlinePaymentMethodTypeXf6053a44? = null

    public var type: InlinePaymentMethodTypeXf6053a44
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var acssDebit: PaymentMethodAcssDebit? = null

    public var affirm: JsonObject? = null

    public var afterpayClearpay: JsonObject? = null

    public var alipay: JsonObject? = null

    /**
     * This field indicates whether this payment method can be shown again to its customer in a checkout flow. Stripe
     * products such as Checkout and Elements use this field to determine whether a payment method can be shown as a
     * saved payment method in a checkout flow. The field defaults to “unspecified”.
     */
    public var allowRedisplay: InlinePaymentMethodAllowRedisplayX1787c685? = null

    public var alma: JsonObject? = null

    public var amazonPay: JsonObject? = null

    public var auBecsDebit: PaymentMethodAuBecsDebit? = null

    public var bacsDebit: PaymentMethodBacsDebit? = null

    public var bancontact: JsonObject? = null

    public var billie: JsonObject? = null

    public var bizum: PaymentMethodBizum? = null

    public var blik: PaymentMethodBlik? = null

    public var boleto: PaymentMethodBoleto? = null

    public var card: PaymentMethodCard? = null

    public var cardPresent: PaymentMethodCardPresent? = null

    public var cashapp: PaymentMethodCashapp? = null

    public var crypto: JsonObject? = null

    public var custom: PaymentMethodCustom? = null

    /**
     * The ID of the Customer to which this PaymentMethod is saved. This will not be set when the PaymentMethod has not
     * been saved to a Customer.
     */
    public var customer: InlinePaymentMethodCustomerX819912bc? = null

    public var customerAccount: String? = null

    public var customerBalance: JsonObject? = null

    public var eps: PaymentMethodEps? = null

    public var fpx: PaymentMethodFpx? = null

    public var giropay: JsonObject? = null

    public var grabpay: JsonObject? = null

    public var ideal: PaymentMethodIdeal? = null

    public var interacPresent: PaymentMethodInteracPresent? = null

    public var kakaoPay: JsonObject? = null

    public var klarna: PaymentMethodKlarna? = null

    public var konbini: JsonObject? = null

    public var krCard: PaymentMethodKrCard? = null

    public var link: PaymentMethodLink? = null

    public var mbWay: JsonObject? = null

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var mobilepay: JsonObject? = null

    public var multibanco: JsonObject? = null

    public var naverPay: PaymentMethodNaverPay? = null

    public var nzBankAccount: PaymentMethodNzBankAccount? = null

    public var oxxo: JsonObject? = null

    public var p24: PaymentMethodP24? = null

    public var payByBank: JsonObject? = null

    public var payco: JsonObject? = null

    public var paynow: JsonObject? = null

    public var paypal: PaymentMethodPaypal? = null

    public var payto: PaymentMethodPayto? = null

    public var pix: PaymentMethodPix? = null

    public var promptpay: JsonObject? = null

    public var radarOptions: RadarRadarOptions? = null

    public var revolutPay: JsonObject? = null

    public var samsungPay: JsonObject? = null

    public var satispay: JsonObject? = null

    public var scalapay: JsonObject? = null

    public var sepaDebit: PaymentMethodSepaDebit? = null

    public var sofort: PaymentMethodSofort? = null

    public var sunbit: JsonObject? = null

    public var swish: JsonObject? = null

    public var twint: JsonObject? = null

    public var upi: PaymentMethodUpi? = null

    public var usBankAccount: PaymentMethodUsBankAccount? = null

    public var wechatPay: JsonObject? = null

    public var zip: JsonObject? = null

    public fun build(): PaymentMethod {
      check(billingDetailsValue != null) { "billingDetails is required" }
      check(createdValue != null) { "created is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(typeValue != null) { "type is required" }
      return PaymentMethod(
        billingDetails = billingDetails,
        created = created,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        type = type,
        acssDebit = acssDebit,
        affirm = affirm,
        afterpayClearpay = afterpayClearpay,
        alipay = alipay,
        allowRedisplay = allowRedisplay,
        alma = alma,
        amazonPay = amazonPay,
        auBecsDebit = auBecsDebit,
        bacsDebit = bacsDebit,
        bancontact = bancontact,
        billie = billie,
        bizum = bizum,
        blik = blik,
        boleto = boleto,
        card = card,
        cardPresent = cardPresent,
        cashapp = cashapp,
        crypto = crypto,
        custom = custom,
        customer = customer,
        customerAccount = customerAccount,
        customerBalance = customerBalance,
        eps = eps,
        fpx = fpx,
        giropay = giropay,
        grabpay = grabpay,
        ideal = ideal,
        interacPresent = interacPresent,
        kakaoPay = kakaoPay,
        klarna = klarna,
        konbini = konbini,
        krCard = krCard,
        link = link,
        mbWay = mbWay,
        metadata = metadata,
        mobilepay = mobilepay,
        multibanco = multibanco,
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
        radarOptions = radarOptions,
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
    public fun build(block: Builder.() -> Unit): PaymentMethod = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethod> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethod {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethod")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethod must be a JSON object")
      val billingDetails = json.decodeRequired<BillingDetails>(rawObject, "billing_details")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlinePaymentMethodObjectValueX5a455d61>(rawObject, "object")
      val type = json.decodeRequired<InlinePaymentMethodTypeXf6053a44>(rawObject, "type")
      return PaymentMethod(
        billingDetails = billingDetails,
        created = created,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        type = type,
        acssDebit = rawObject["acss_debit"]?.let { json.decodeFromJsonElement<PaymentMethodAcssDebit>(it) },
        affirm = rawObject["affirm"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        afterpayClearpay = rawObject["afterpay_clearpay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        alipay = rawObject["alipay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        allowRedisplay = rawObject["allow_redisplay"]?.let { json.decodeFromJsonElement<InlinePaymentMethodAllowRedisplayX1787c685>(it) },
        alma = rawObject["alma"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        amazonPay = rawObject["amazon_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        auBecsDebit = rawObject["au_becs_debit"]?.let { json.decodeFromJsonElement<PaymentMethodAuBecsDebit>(it) },
        bacsDebit = rawObject["bacs_debit"]?.let { json.decodeFromJsonElement<PaymentMethodBacsDebit>(it) },
        bancontact = rawObject["bancontact"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        billie = rawObject["billie"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        bizum = rawObject["bizum"]?.let { json.decodeFromJsonElement<PaymentMethodBizum>(it) },
        blik = rawObject["blik"]?.let { json.decodeFromJsonElement<PaymentMethodBlik>(it) },
        boleto = rawObject["boleto"]?.let { json.decodeFromJsonElement<PaymentMethodBoleto>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<PaymentMethodCard>(it) },
        cardPresent = rawObject["card_present"]?.let { json.decodeFromJsonElement<PaymentMethodCardPresent>(it) },
        cashapp = rawObject["cashapp"]?.let { json.decodeFromJsonElement<PaymentMethodCashapp>(it) },
        crypto = rawObject["crypto"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        custom = rawObject["custom"]?.let { json.decodeFromJsonElement<PaymentMethodCustom>(it) },
        customer = rawObject["customer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodCustomerX819912bc?>(element) },
        customerAccount = rawObject["customer_account"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        customerBalance = rawObject["customer_balance"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        eps = rawObject["eps"]?.let { json.decodeFromJsonElement<PaymentMethodEps>(it) },
        fpx = rawObject["fpx"]?.let { json.decodeFromJsonElement<PaymentMethodFpx>(it) },
        giropay = rawObject["giropay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        grabpay = rawObject["grabpay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        ideal = rawObject["ideal"]?.let { json.decodeFromJsonElement<PaymentMethodIdeal>(it) },
        interacPresent = rawObject["interac_present"]?.let { json.decodeFromJsonElement<PaymentMethodInteracPresent>(it) },
        kakaoPay = rawObject["kakao_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        klarna = rawObject["klarna"]?.let { json.decodeFromJsonElement<PaymentMethodKlarna>(it) },
        konbini = rawObject["konbini"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        krCard = rawObject["kr_card"]?.let { json.decodeFromJsonElement<PaymentMethodKrCard>(it) },
        link = rawObject["link"]?.let { json.decodeFromJsonElement<PaymentMethodLink>(it) },
        mbWay = rawObject["mb_way"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        mobilepay = rawObject["mobilepay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        multibanco = rawObject["multibanco"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        naverPay = rawObject["naver_pay"]?.let { json.decodeFromJsonElement<PaymentMethodNaverPay>(it) },
        nzBankAccount = rawObject["nz_bank_account"]?.let { json.decodeFromJsonElement<PaymentMethodNzBankAccount>(it) },
        oxxo = rawObject["oxxo"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        p24 = rawObject["p24"]?.let { json.decodeFromJsonElement<PaymentMethodP24>(it) },
        payByBank = rawObject["pay_by_bank"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        payco = rawObject["payco"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        paynow = rawObject["paynow"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        paypal = rawObject["paypal"]?.let { json.decodeFromJsonElement<PaymentMethodPaypal>(it) },
        payto = rawObject["payto"]?.let { json.decodeFromJsonElement<PaymentMethodPayto>(it) },
        pix = rawObject["pix"]?.let { json.decodeFromJsonElement<PaymentMethodPix>(it) },
        promptpay = rawObject["promptpay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        radarOptions = rawObject["radar_options"]?.let { json.decodeFromJsonElement<RadarRadarOptions>(it) },
        revolutPay = rawObject["revolut_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        samsungPay = rawObject["samsung_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        satispay = rawObject["satispay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        scalapay = rawObject["scalapay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        sepaDebit = rawObject["sepa_debit"]?.let { json.decodeFromJsonElement<PaymentMethodSepaDebit>(it) },
        sofort = rawObject["sofort"]?.let { json.decodeFromJsonElement<PaymentMethodSofort>(it) },
        sunbit = rawObject["sunbit"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        swish = rawObject["swish"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        twint = rawObject["twint"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        upi = rawObject["upi"]?.let { json.decodeFromJsonElement<PaymentMethodUpi>(it) },
        usBankAccount = rawObject["us_bank_account"]?.let { json.decodeFromJsonElement<PaymentMethodUsBankAccount>(it) },
        wechatPay = rawObject["wechat_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        zip = rawObject["zip"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethod) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethod")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("billing_details", json.encodeToJsonElement(value.billingDetails))
        put("created", json.encodeToJsonElement(value.created))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("type", json.encodeToJsonElement(value.type))
        value.acssDebit?.let { put("acss_debit", json.encodeToJsonElement(it)) }
        value.affirm?.let { put("affirm", json.encodeToJsonElement(it)) }
        value.afterpayClearpay?.let { put("afterpay_clearpay", json.encodeToJsonElement(it)) }
        value.alipay?.let { put("alipay", json.encodeToJsonElement(it)) }
        value.allowRedisplay?.let { put("allow_redisplay", json.encodeToJsonElement(it)) }
        value.alma?.let { put("alma", json.encodeToJsonElement(it)) }
        value.amazonPay?.let { put("amazon_pay", json.encodeToJsonElement(it)) }
        value.auBecsDebit?.let { put("au_becs_debit", json.encodeToJsonElement(it)) }
        value.bacsDebit?.let { put("bacs_debit", json.encodeToJsonElement(it)) }
        value.bancontact?.let { put("bancontact", json.encodeToJsonElement(it)) }
        value.billie?.let { put("billie", json.encodeToJsonElement(it)) }
        value.bizum?.let { put("bizum", json.encodeToJsonElement(it)) }
        value.blik?.let { put("blik", json.encodeToJsonElement(it)) }
        value.boleto?.let { put("boleto", json.encodeToJsonElement(it)) }
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
        value.cardPresent?.let { put("card_present", json.encodeToJsonElement(it)) }
        value.cashapp?.let { put("cashapp", json.encodeToJsonElement(it)) }
        value.crypto?.let { put("crypto", json.encodeToJsonElement(it)) }
        value.custom?.let { put("custom", json.encodeToJsonElement(it)) }
        value.customer?.let { put("customer", json.encodeToJsonElement(it)) }
        value.customerAccount?.let { put("customer_account", it) }
        value.customerBalance?.let { put("customer_balance", json.encodeToJsonElement(it)) }
        value.eps?.let { put("eps", json.encodeToJsonElement(it)) }
        value.fpx?.let { put("fpx", json.encodeToJsonElement(it)) }
        value.giropay?.let { put("giropay", json.encodeToJsonElement(it)) }
        value.grabpay?.let { put("grabpay", json.encodeToJsonElement(it)) }
        value.ideal?.let { put("ideal", json.encodeToJsonElement(it)) }
        value.interacPresent?.let { put("interac_present", json.encodeToJsonElement(it)) }
        value.kakaoPay?.let { put("kakao_pay", json.encodeToJsonElement(it)) }
        value.klarna?.let { put("klarna", json.encodeToJsonElement(it)) }
        value.konbini?.let { put("konbini", json.encodeToJsonElement(it)) }
        value.krCard?.let { put("kr_card", json.encodeToJsonElement(it)) }
        value.link?.let { put("link", json.encodeToJsonElement(it)) }
        value.mbWay?.let { put("mb_way", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.mobilepay?.let { put("mobilepay", json.encodeToJsonElement(it)) }
        value.multibanco?.let { put("multibanco", json.encodeToJsonElement(it)) }
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
        value.radarOptions?.let { put("radar_options", json.encodeToJsonElement(it)) }
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

public fun paymentMethod(block: PaymentMethod.Builder.() -> Unit): PaymentMethod = PaymentMethod.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentMethod is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
