package com.nabobery.sdkgen.generated.stripe

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
public data class SourceView internal constructor(
  @SerialName("ach_credit_transfer")
  public val achCreditTransfer: SourceTypeAchCreditTransfer? = null,
  @SerialName("ach_debit")
  public val achDebit: SourceTypeAchDebit? = null,
  @SerialName("acss_debit")
  public val acssDebit: SourceTypeAcssDebit? = null,
  public val alipay: SourceTypeAlipay? = null,
  @SerialName("allow_redisplay")
  public val allowRedisplay: InlineSourceAllowRedisplayX98b1333c? = null,
  public val amount: Int? = null,
  @SerialName("au_becs_debit")
  public val auBecsDebit: SourceTypeAuBecsDebit? = null,
  public val bancontact: SourceTypeBancontact? = null,
  public val card: SourceTypeCard? = null,
  @SerialName("card_present")
  public val cardPresent: SourceTypeCardPresent? = null,
  @SerialName("client_secret")
  public val clientSecret: String,
  @SerialName("code_verification")
  public val codeVerification: SourceCodeVerificationFlow? = null,
  public val created: Int,
  public val currency: String? = null,
  public val customer: String? = null,
  public val eps: SourceTypeEps? = null,
  public val flow: String,
  public val giropay: SourceTypeGiropay? = null,
  public val id: String,
  public val ideal: SourceTypeIdeal? = null,
  public val klarna: SourceTypeKlarna? = null,
  public val livemode: Boolean,
  public val metadata: Map<String, String>? = null,
  public val multibanco: SourceTypeMultibanco? = null,
  @SerialName("object")
  public val objectValue: InlineSourceObjectValueX8d2ab178,
  public val owner: InlineSourceOwnerXc08c428d? = null,
  public val p24: SourceTypeP24? = null,
  public val `receiver`: SourceReceiverFlow? = null,
  public val redirect: SourceRedirectFlow? = null,
  @SerialName("sepa_debit")
  public val sepaDebit: SourceTypeSepaDebit? = null,
  public val sofort: SourceTypeSofort? = null,
  @SerialName("source_order")
  public val sourceOrder: SourceOrder? = null,
  @SerialName("statement_descriptor")
  public val statementDescriptor: String? = null,
  public val status: String,
  @SerialName("three_d_secure")
  public val threeDSecure: SourceTypeThreeDSecure? = null,
  public val type: InlineSourceTypeX95724ec9,
  public val usage: String? = null,
  public val wechat: SourceTypeWechat? = null,
)

/**
 * `Source` objects allow you to accept a variety of payment methods. They
 * represent a customer's payment instrument, and can be used with the Stripe API
 * just like a `Card` object: once chargeable, they can be charged, or can be
 * attached to customers.
 *
 * Stripe doesn't recommend using the deprecated [Sources API](https://docs.stripe.com/api/sources).
 * We recommend that you adopt the [PaymentMethods API](https://docs.stripe.com/api/payment_methods).
 * This newer API provides access to our latest features and payment method types.
 *
 * Related guides: [Sources API](https://docs.stripe.com/sources) and [Sources &
 * Customers](https://docs.stripe.com/sources/customers).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source
 */
@Serializable(with = Source.Serializer::class)
public class Source(
  /**
   * The client secret of the source. Used for client-side retrieval using a publishable key.
   */
  public val clientSecret: String,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * The authentication `flow` of the source. `flow` is one of `redirect`, `receiver`, `code_verification`, `none`.
   */
  public val flow: String,
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
  public val objectValue: InlineSourceObjectValueX8d2ab178,
  /**
   * The status of the source, one of `canceled`, `chargeable`, `consumed`, `failed`, or `pending`. Only `chargeable`
   * sources can be used to create a charge.
   */
  public val status: String,
  /**
   * The `type` of the source. The `type` is a payment method, one of `ach_credit_transfer`, `ach_debit`, `alipay`,
   * `bancontact`, `card`, `card_present`, `eps`, `giropay`, `ideal`, `multibanco`, `klarna`, `p24`, `sepa_debit`,
   * `sofort`, `three_d_secure`, or `wechat`. An additional hash is included on the source with a name matching this
   * value. It contains additional information specific to the [payment method](https://docs.stripe.com/sources) used.
   */
  public val type: InlineSourceTypeX95724ec9,
  public val achCreditTransfer: SourceTypeAchCreditTransfer? = null,
  public val achDebit: SourceTypeAchDebit? = null,
  public val acssDebit: SourceTypeAcssDebit? = null,
  public val alipay: SourceTypeAlipay? = null,
  /**
   * This field indicates whether this payment method can be shown again to its customer in a checkout flow. Stripe
   * products such as Checkout and Elements use this field to determine whether a payment method can be shown as a saved
   * payment method in a checkout flow. The field defaults to “unspecified”.
   */
  public val allowRedisplay: InlineSourceAllowRedisplayX98b1333c? = null,
  /**
   * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1, Japanese Yen being a
   * zero-decimal currency) representing the total amount associated with the source. This is the amount for which the
   * source will be chargeable once ready. Required for `single_use` sources.
   */
  public val amount: Int? = null,
  public val auBecsDebit: SourceTypeAuBecsDebit? = null,
  public val bancontact: SourceTypeBancontact? = null,
  public val card: SourceTypeCard? = null,
  public val cardPresent: SourceTypeCardPresent? = null,
  public val codeVerification: SourceCodeVerificationFlow? = null,
  /**
   * Three-letter [ISO code for the currency](https://stripe.com/docs/currencies) associated with the source. This is
   * the currency for which the source will be chargeable once ready. Required for `single_use` sources.
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  /**
   * The ID of the customer to which this source is attached. This will not be present when the source has not been
   * attached to a customer.
   */
  public val customer: String? = null,
  public val eps: SourceTypeEps? = null,
  public val giropay: SourceTypeGiropay? = null,
  public val ideal: SourceTypeIdeal? = null,
  public val klarna: SourceTypeKlarna? = null,
  metadata: Map<String, String>? = null,
  public val multibanco: SourceTypeMultibanco? = null,
  /**
   * Information about the owner of the payment instrument that may be used or required by particular source types.
   */
  public val owner: InlineSourceOwnerXc08c428d? = null,
  public val p24: SourceTypeP24? = null,
  public val `receiver`: SourceReceiverFlow? = null,
  public val redirect: SourceRedirectFlow? = null,
  public val sepaDebit: SourceTypeSepaDebit? = null,
  public val sofort: SourceTypeSofort? = null,
  public val sourceOrder: SourceOrder? = null,
  /**
   * Extra information about a source. This will appear on your customer's statement every time you charge the source.
   */
  public val statementDescriptor: String? = null,
  public val threeDSecure: SourceTypeThreeDSecure? = null,
  /**
   * Either `reusable` or `single_use`. Whether this source should be reusable or not. Some source types may or may not
   * be reusable by construction, while others may leave the option at creation. If an incompatible value is passed, an
   * error will be returned.
   */
  public val usage: String? = null,
  public val wechat: SourceTypeWechat? = null,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var clientSecretValue: String? = null

    public var clientSecret: String
      get() = requireNotNull(clientSecretValue) { "clientSecret is required" }
      set(`value`) {
        clientSecretValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var flowValue: String? = null

    public var flow: String
      get() = requireNotNull(flowValue) { "flow is required" }
      set(`value`) {
        flowValue = value
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

    private var objectValueValue: InlineSourceObjectValueX8d2ab178? = null

    public var objectValue: InlineSourceObjectValueX8d2ab178
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var statusValue: String? = null

    public var status: String
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineSourceTypeX95724ec9? = null

    public var type: InlineSourceTypeX95724ec9
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var achCreditTransfer: SourceTypeAchCreditTransfer? = null

    public var achDebit: SourceTypeAchDebit? = null

    public var acssDebit: SourceTypeAcssDebit? = null

    public var alipay: SourceTypeAlipay? = null

    /**
     * This field indicates whether this payment method can be shown again to its customer in a checkout flow. Stripe
     * products such as Checkout and Elements use this field to determine whether a payment method can be shown as a
     * saved payment method in a checkout flow. The field defaults to “unspecified”.
     */
    public var allowRedisplay: InlineSourceAllowRedisplayX98b1333c? = null

    /**
     * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1, Japanese Yen being a
     * zero-decimal currency) representing the total amount associated with the source. This is the amount for which the
     * source will be chargeable once ready. Required for `single_use` sources.
     */
    public var amount: Int? = null

    public var auBecsDebit: SourceTypeAuBecsDebit? = null

    public var bancontact: SourceTypeBancontact? = null

    public var card: SourceTypeCard? = null

    public var cardPresent: SourceTypeCardPresent? = null

    public var codeVerification: SourceCodeVerificationFlow? = null

    /**
     * Three-letter [ISO code for the currency](https://stripe.com/docs/currencies) associated with the source. This is
     * the currency for which the source will be chargeable once ready. Required for `single_use` sources.
     *
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    /**
     * The ID of the customer to which this source is attached. This will not be present when the source has not been
     * attached to a customer.
     */
    public var customer: String? = null

    public var eps: SourceTypeEps? = null

    public var giropay: SourceTypeGiropay? = null

    public var ideal: SourceTypeIdeal? = null

    public var klarna: SourceTypeKlarna? = null

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

    public var multibanco: SourceTypeMultibanco? = null

    /**
     * Information about the owner of the payment instrument that may be used or required by particular source types.
     */
    public var owner: InlineSourceOwnerXc08c428d? = null

    public var p24: SourceTypeP24? = null

    public var `receiver`: SourceReceiverFlow? = null

    public var redirect: SourceRedirectFlow? = null

    public var sepaDebit: SourceTypeSepaDebit? = null

    public var sofort: SourceTypeSofort? = null

    public var sourceOrder: SourceOrder? = null

    /**
     * Extra information about a source. This will appear on your customer's statement every time you charge the source.
     */
    public var statementDescriptor: String? = null

    public var threeDSecure: SourceTypeThreeDSecure? = null

    /**
     * Either `reusable` or `single_use`. Whether this source should be reusable or not. Some source types may or may
     * not be reusable by construction, while others may leave the option at creation. If an incompatible value is
     * passed, an error will be returned.
     */
    public var usage: String? = null

    public var wechat: SourceTypeWechat? = null

    public fun build(): Source {
      check(clientSecretValue != null) { "clientSecret is required" }
      check(createdValue != null) { "created is required" }
      check(flowValue != null) { "flow is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return Source(
        clientSecret = clientSecret,
        created = created,
        flow = flow,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        status = status,
        type = type,
        achCreditTransfer = achCreditTransfer,
        achDebit = achDebit,
        acssDebit = acssDebit,
        alipay = alipay,
        allowRedisplay = allowRedisplay,
        amount = amount,
        auBecsDebit = auBecsDebit,
        bancontact = bancontact,
        card = card,
        cardPresent = cardPresent,
        codeVerification = codeVerification,
        currency = currency,
        customer = customer,
        eps = eps,
        giropay = giropay,
        ideal = ideal,
        klarna = klarna,
        metadata = metadata,
        multibanco = multibanco,
        owner = owner,
        p24 = p24,
        receiver = receiver,
        redirect = redirect,
        sepaDebit = sepaDebit,
        sofort = sofort,
        sourceOrder = sourceOrder,
        statementDescriptor = statementDescriptor,
        threeDSecure = threeDSecure,
        usage = usage,
        wechat = wechat,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Source = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Source> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Source {
      val jsonDecoder = decoder.requireJsonDecoder("Source")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Source must be a JSON object")
      val clientSecret = json.decodeRequired<String>(rawObject, "client_secret")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val flow = json.decodeRequired<String>(rawObject, "flow")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineSourceObjectValueX8d2ab178>(rawObject, "object")
      val status = json.decodeRequired<String>(rawObject, "status")
      val type = json.decodeRequired<InlineSourceTypeX95724ec9>(rawObject, "type")
      return Source(
        clientSecret = clientSecret,
        created = created,
        flow = flow,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        status = status,
        type = type,
        achCreditTransfer = rawObject["ach_credit_transfer"]?.let { json.decodeFromJsonElement<SourceTypeAchCreditTransfer>(it) },
        achDebit = rawObject["ach_debit"]?.let { json.decodeFromJsonElement<SourceTypeAchDebit>(it) },
        acssDebit = rawObject["acss_debit"]?.let { json.decodeFromJsonElement<SourceTypeAcssDebit>(it) },
        alipay = rawObject["alipay"]?.let { json.decodeFromJsonElement<SourceTypeAlipay>(it) },
        allowRedisplay = rawObject["allow_redisplay"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSourceAllowRedisplayX98b1333c?>(element) },
        amount = rawObject["amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        auBecsDebit = rawObject["au_becs_debit"]?.let { json.decodeFromJsonElement<SourceTypeAuBecsDebit>(it) },
        bancontact = rawObject["bancontact"]?.let { json.decodeFromJsonElement<SourceTypeBancontact>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<SourceTypeCard>(it) },
        cardPresent = rawObject["card_present"]?.let { json.decodeFromJsonElement<SourceTypeCardPresent>(it) },
        codeVerification = rawObject["code_verification"]?.let { json.decodeFromJsonElement<SourceCodeVerificationFlow>(it) },
        currency = rawObject["currency"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
        eps = rawObject["eps"]?.let { json.decodeFromJsonElement<SourceTypeEps>(it) },
        giropay = rawObject["giropay"]?.let { json.decodeFromJsonElement<SourceTypeGiropay>(it) },
        ideal = rawObject["ideal"]?.let { json.decodeFromJsonElement<SourceTypeIdeal>(it) },
        klarna = rawObject["klarna"]?.let { json.decodeFromJsonElement<SourceTypeKlarna>(it) },
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        multibanco = rawObject["multibanco"]?.let { json.decodeFromJsonElement<SourceTypeMultibanco>(it) },
        owner = rawObject["owner"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSourceOwnerXc08c428d?>(element) },
        p24 = rawObject["p24"]?.let { json.decodeFromJsonElement<SourceTypeP24>(it) },
        receiver = rawObject["receiver"]?.let { json.decodeFromJsonElement<SourceReceiverFlow>(it) },
        redirect = rawObject["redirect"]?.let { json.decodeFromJsonElement<SourceRedirectFlow>(it) },
        sepaDebit = rawObject["sepa_debit"]?.let { json.decodeFromJsonElement<SourceTypeSepaDebit>(it) },
        sofort = rawObject["sofort"]?.let { json.decodeFromJsonElement<SourceTypeSofort>(it) },
        sourceOrder = rawObject["source_order"]?.let { json.decodeFromJsonElement<SourceOrder>(it) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        threeDSecure = rawObject["three_d_secure"]?.let { json.decodeFromJsonElement<SourceTypeThreeDSecure>(it) },
        usage = rawObject["usage"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        wechat = rawObject["wechat"]?.let { json.decodeFromJsonElement<SourceTypeWechat>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Source) {
      val jsonEncoder = encoder.requireJsonEncoder("Source")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("client_secret", value.clientSecret)
        put("created", json.encodeToJsonElement(value.created))
        put("flow", value.flow)
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("status", value.status)
        put("type", json.encodeToJsonElement(value.type))
        value.achCreditTransfer?.let { put("ach_credit_transfer", json.encodeToJsonElement(it)) }
        value.achDebit?.let { put("ach_debit", json.encodeToJsonElement(it)) }
        value.acssDebit?.let { put("acss_debit", json.encodeToJsonElement(it)) }
        value.alipay?.let { put("alipay", json.encodeToJsonElement(it)) }
        value.allowRedisplay?.let { put("allow_redisplay", json.encodeToJsonElement(it)) }
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.auBecsDebit?.let { put("au_becs_debit", json.encodeToJsonElement(it)) }
        value.bancontact?.let { put("bancontact", json.encodeToJsonElement(it)) }
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
        value.cardPresent?.let { put("card_present", json.encodeToJsonElement(it)) }
        value.codeVerification?.let { put("code_verification", json.encodeToJsonElement(it)) }
        value.currency?.let { put("currency", it) }
        value.customer?.let { put("customer", it) }
        value.eps?.let { put("eps", json.encodeToJsonElement(it)) }
        value.giropay?.let { put("giropay", json.encodeToJsonElement(it)) }
        value.ideal?.let { put("ideal", json.encodeToJsonElement(it)) }
        value.klarna?.let { put("klarna", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.multibanco?.let { put("multibanco", json.encodeToJsonElement(it)) }
        value.owner?.let { put("owner", json.encodeToJsonElement(it)) }
        value.p24?.let { put("p24", json.encodeToJsonElement(it)) }
        value.receiver?.let { put("receiver", json.encodeToJsonElement(it)) }
        value.redirect?.let { put("redirect", json.encodeToJsonElement(it)) }
        value.sepaDebit?.let { put("sepa_debit", json.encodeToJsonElement(it)) }
        value.sofort?.let { put("sofort", json.encodeToJsonElement(it)) }
        value.sourceOrder?.let { put("source_order", json.encodeToJsonElement(it)) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
        value.threeDSecure?.let { put("three_d_secure", json.encodeToJsonElement(it)) }
        value.usage?.let { put("usage", it) }
        value.wechat?.let { put("wechat", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun source(block: Source.Builder.() -> Unit): Source = Source.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Source is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
