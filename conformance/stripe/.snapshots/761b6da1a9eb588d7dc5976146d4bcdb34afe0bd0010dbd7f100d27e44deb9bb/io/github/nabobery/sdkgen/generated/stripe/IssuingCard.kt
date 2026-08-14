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
public data class IssuingCardView internal constructor(
  public val brand: String,
  @SerialName("cancellation_reason")
  public val cancellationReason: InlineIssuingCardCancellationReasonX67172c82? = null,
  public val cardholder: IssuingCardholder,
  public val created: Int,
  public val currency: String,
  public val cvc: String? = null,
  @SerialName("exp_month")
  public val expMonth: Int,
  @SerialName("exp_year")
  public val expYear: Int,
  @SerialName("financial_account")
  public val financialAccount: String? = null,
  public val id: String,
  public val last4: String,
  @SerialName("latest_fraud_warning")
  public val latestFraudWarning: InlineIssuingCardLatestFraudWarningX9f724afd? = null,
  @SerialName("lifecycle_controls")
  public val lifecycleControls: InlineIssuingCardLifecycleControlsX2974d4a1? = null,
  public val livemode: Boolean,
  public val metadata: Map<String, String>,
  public val number: String? = null,
  @SerialName("object")
  public val objectValue: InlineIssuingCardObjectValueXeecda8e4,
  @SerialName("personalization_design")
  public val personalizationDesign: InlineIssuingCardPersonalizationDesignX4b8db7b9? = null,
  @SerialName("replaced_by")
  public val replacedBy: InlineIssuingCardReplacedByX506774f9? = null,
  @SerialName("replacement_for")
  public val replacementFor: InlineIssuingCardReplacementForX2e82d369? = null,
  @SerialName("replacement_reason")
  public val replacementReason: InlineIssuingCardReplacementReasonX5511bc87? = null,
  @SerialName("second_line")
  public val secondLine: String? = null,
  public val shipping: InlineIssuingCardShippingX3a68ab2f? = null,
  @SerialName("spending_controls")
  public val spendingControls: IssuingCardAuthorizationControls,
  public val status: InlineIssuingCardStatusXfe6e0a8e,
  public val type: InlineIssuingCardTypeX17735f2c,
  public val wallets: InlineIssuingCardWalletsX02783822? = null,
)

/**
 * You can [create physical or virtual cards](https://docs.stripe.com/issuing) that are issued to cardholders.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.card
 */
@Serializable(with = IssuingCard.Serializer::class)
public class IssuingCard(
  /**
   * The brand of the card.
   */
  public val brand: String,
  public val cardholder: IssuingCardholder,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Supported
   * currencies are `usd` in the US, `eur` in the EU, and `gbp` in the UK.
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  /**
   * The expiration month of the card.
   */
  public val expMonth: Int,
  /**
   * The expiration year of the card.
   */
  public val expYear: Int,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * The last 4 digits of the card number.
   */
  public val last4: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  metadata: Map<String, String>,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineIssuingCardObjectValueXeecda8e4,
  public val spendingControls: IssuingCardAuthorizationControls,
  /**
   * Whether authorizations can be approved on this card. May be blocked from activating cards depending on past-due
   * Cardholder requirements. Defaults to `inactive`.
   */
  public val status: InlineIssuingCardStatusXfe6e0a8e,
  /**
   * The type of the card.
   */
  public val type: InlineIssuingCardTypeX17735f2c,
  /**
   * The reason why the card was canceled.
   */
  public val cancellationReason: InlineIssuingCardCancellationReasonX67172c82? = null,
  /**
   * The card's CVC. For security reasons, this is only available for virtual cards, and will be omitted unless you
   * explicitly request it with [the `expand` parameter](https://docs.stripe.com/api/expanding_objects). Additionally,
   * it's only available via the ["Retrieve a card" endpoint](https://docs.stripe.com/api/issuing/cards/retrieve), not
   * via "List all cards" or any other endpoint.
   */
  public val cvc: String? = null,
  /**
   * The financial account this card is attached to.
   */
  public val financialAccount: String? = null,
  /**
   * Stripe’s assessment of whether this card’s details have been compromised. If this property isn't null, cancel and
   * reissue the card to prevent fraudulent activity risk.
   */
  public val latestFraudWarning: InlineIssuingCardLatestFraudWarningX9f724afd? = null,
  /**
   * Rules that control the lifecycle of this card, such as automatic cancellation. Refer to our
   * [documentation](/issuing/controls/lifecycle-controls) for more details.
   */
  public val lifecycleControls: InlineIssuingCardLifecycleControlsX2974d4a1? = null,
  /**
   * The full unredacted card number. For security reasons, this is only available for virtual cards, and will be
   * omitted unless you explicitly request it with [the `expand`
   * parameter](https://docs.stripe.com/api/expanding_objects). Additionally, it's only available via the ["Retrieve a
   * card" endpoint](https://docs.stripe.com/api/issuing/cards/retrieve), not via "List all cards" or any other
   * endpoint.
   */
  public val number: String? = null,
  /**
   * The personalization design object belonging to this card.
   */
  public val personalizationDesign: InlineIssuingCardPersonalizationDesignX4b8db7b9? = null,
  /**
   * The latest card that replaces this card, if any.
   */
  public val replacedBy: InlineIssuingCardReplacedByX506774f9? = null,
  /**
   * The card this card replaces, if any.
   */
  public val replacementFor: InlineIssuingCardReplacementForX2e82d369? = null,
  /**
   * The reason why the previous card needed to be replaced.
   */
  public val replacementReason: InlineIssuingCardReplacementReasonX5511bc87? = null,
  /**
   * Text separate from cardholder name, printed on the card.
   */
  public val secondLine: String? = null,
  /**
   * Where and how the card will be shipped.
   */
  public val shipping: InlineIssuingCardShippingX3a68ab2f? = null,
  /**
   * Information relating to digital wallets (like Apple Pay and Google Pay).
   */
  public val wallets: InlineIssuingCardWalletsX02783822? = null,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String> = metadata.toMap()

  public class Builder {
    private var brandValue: String? = null

    public var brand: String
      get() = requireNotNull(brandValue) { "brand is required" }
      set(`value`) {
        brandValue = value
      }

    private var cardholderValue: IssuingCardholder? = null

    public var cardholder: IssuingCardholder
      get() = requireNotNull(cardholderValue) { "cardholder is required" }
      set(`value`) {
        cardholderValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    private var expMonthValue: Int? = null

    public var expMonth: Int
      get() = requireNotNull(expMonthValue) { "expMonth is required" }
      set(`value`) {
        expMonthValue = value
      }

    private var expYearValue: Int? = null

    public var expYear: Int
      get() = requireNotNull(expYearValue) { "expYear is required" }
      set(`value`) {
        expYearValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var last4Value: String? = null

    public var last4: String
      get() = requireNotNull(last4Value) { "last4 is required" }
      set(`value`) {
        last4Value = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>
      get() = requireNotNull(metadataValue) { "metadata is required" }.toMap()
      set(`value`) {
        metadataValue = value.toMap()
      }

    private var objectValueValue: InlineIssuingCardObjectValueXeecda8e4? = null

    public var objectValue: InlineIssuingCardObjectValueXeecda8e4
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var spendingControlsValue: IssuingCardAuthorizationControls? = null

    public var spendingControls: IssuingCardAuthorizationControls
      get() = requireNotNull(spendingControlsValue) { "spendingControls is required" }
      set(`value`) {
        spendingControlsValue = value
      }

    private var statusValue: InlineIssuingCardStatusXfe6e0a8e? = null

    public var status: InlineIssuingCardStatusXfe6e0a8e
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineIssuingCardTypeX17735f2c? = null

    public var type: InlineIssuingCardTypeX17735f2c
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * The reason why the card was canceled.
     */
    public var cancellationReason: InlineIssuingCardCancellationReasonX67172c82? = null

    /**
     * The card's CVC. For security reasons, this is only available for virtual cards, and will be omitted unless you
     * explicitly request it with [the `expand` parameter](https://docs.stripe.com/api/expanding_objects). Additionally,
     * it's only available via the ["Retrieve a card" endpoint](https://docs.stripe.com/api/issuing/cards/retrieve), not
     * via "List all cards" or any other endpoint.
     */
    public var cvc: String? = null

    /**
     * The financial account this card is attached to.
     */
    public var financialAccount: String? = null

    /**
     * Stripe’s assessment of whether this card’s details have been compromised. If this property isn't null, cancel and
     * reissue the card to prevent fraudulent activity risk.
     */
    public var latestFraudWarning: InlineIssuingCardLatestFraudWarningX9f724afd? = null

    /**
     * Rules that control the lifecycle of this card, such as automatic cancellation. Refer to our
     * [documentation](/issuing/controls/lifecycle-controls) for more details.
     */
    public var lifecycleControls: InlineIssuingCardLifecycleControlsX2974d4a1? = null

    /**
     * The full unredacted card number. For security reasons, this is only available for virtual cards, and will be
     * omitted unless you explicitly request it with [the `expand`
     * parameter](https://docs.stripe.com/api/expanding_objects). Additionally, it's only available via the ["Retrieve a
     * card" endpoint](https://docs.stripe.com/api/issuing/cards/retrieve), not via "List all cards" or any other
     * endpoint.
     */
    public var number: String? = null

    /**
     * The personalization design object belonging to this card.
     */
    public var personalizationDesign: InlineIssuingCardPersonalizationDesignX4b8db7b9? = null

    /**
     * The latest card that replaces this card, if any.
     */
    public var replacedBy: InlineIssuingCardReplacedByX506774f9? = null

    /**
     * The card this card replaces, if any.
     */
    public var replacementFor: InlineIssuingCardReplacementForX2e82d369? = null

    /**
     * The reason why the previous card needed to be replaced.
     */
    public var replacementReason: InlineIssuingCardReplacementReasonX5511bc87? = null

    /**
     * Text separate from cardholder name, printed on the card.
     */
    public var secondLine: String? = null

    /**
     * Where and how the card will be shipped.
     */
    public var shipping: InlineIssuingCardShippingX3a68ab2f? = null

    /**
     * Information relating to digital wallets (like Apple Pay and Google Pay).
     */
    public var wallets: InlineIssuingCardWalletsX02783822? = null

    public fun build(): IssuingCard {
      check(brandValue != null) { "brand is required" }
      check(cardholderValue != null) { "cardholder is required" }
      check(createdValue != null) { "created is required" }
      check(currencyValue != null) { "currency is required" }
      check(expMonthValue != null) { "expMonth is required" }
      check(expYearValue != null) { "expYear is required" }
      check(idValue != null) { "id is required" }
      check(last4Value != null) { "last4 is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(metadataValue != null) { "metadata is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(spendingControlsValue != null) { "spendingControls is required" }
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return IssuingCard(
        brand = brand,
        cardholder = cardholder,
        created = created,
        currency = currency,
        expMonth = expMonth,
        expYear = expYear,
        id = id,
        last4 = last4,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        spendingControls = spendingControls,
        status = status,
        type = type,
        cancellationReason = cancellationReason,
        cvc = cvc,
        financialAccount = financialAccount,
        latestFraudWarning = latestFraudWarning,
        lifecycleControls = lifecycleControls,
        number = number,
        personalizationDesign = personalizationDesign,
        replacedBy = replacedBy,
        replacementFor = replacementFor,
        replacementReason = replacementReason,
        secondLine = secondLine,
        shipping = shipping,
        wallets = wallets,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingCard = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssuingCard> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingCard {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingCard")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingCard must be a JSON object")
      val brand = json.decodeRequired<String>(rawObject, "brand")
      val cardholder = json.decodeRequired<IssuingCardholder>(rawObject, "cardholder")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val expMonth = json.decodeRequired<Int>(rawObject, "exp_month")
      val expYear = json.decodeRequired<Int>(rawObject, "exp_year")
      val id = json.decodeRequired<String>(rawObject, "id")
      val last4 = json.decodeRequired<String>(rawObject, "last4")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
      val objectValue = json.decodeRequired<InlineIssuingCardObjectValueXeecda8e4>(rawObject, "object")
      val spendingControls = json.decodeRequired<IssuingCardAuthorizationControls>(rawObject, "spending_controls")
      val status = json.decodeRequired<InlineIssuingCardStatusXfe6e0a8e>(rawObject, "status")
      val type = json.decodeRequired<InlineIssuingCardTypeX17735f2c>(rawObject, "type")
      return IssuingCard(
        brand = brand,
        cardholder = cardholder,
        created = created,
        currency = currency,
        expMonth = expMonth,
        expYear = expYear,
        id = id,
        last4 = last4,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        spendingControls = spendingControls,
        status = status,
        type = type,
        cancellationReason = rawObject["cancellation_reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingCardCancellationReasonX67172c82?>(element) },
        cvc = rawObject["cvc"]?.let { json.decodeFromJsonElement<String>(it) },
        financialAccount = rawObject["financial_account"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        latestFraudWarning = rawObject["latest_fraud_warning"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingCardLatestFraudWarningX9f724afd?>(element) },
        lifecycleControls = rawObject["lifecycle_controls"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingCardLifecycleControlsX2974d4a1?>(element) },
        number = rawObject["number"]?.let { json.decodeFromJsonElement<String>(it) },
        personalizationDesign = rawObject["personalization_design"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingCardPersonalizationDesignX4b8db7b9?>(element) },
        replacedBy = rawObject["replaced_by"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingCardReplacedByX506774f9?>(element) },
        replacementFor = rawObject["replacement_for"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingCardReplacementForX2e82d369?>(element) },
        replacementReason = rawObject["replacement_reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingCardReplacementReasonX5511bc87?>(element) },
        secondLine = rawObject["second_line"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        shipping = rawObject["shipping"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingCardShippingX3a68ab2f?>(element) },
        wallets = rawObject["wallets"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingCardWalletsX02783822?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingCard) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingCard")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("brand", value.brand)
        put("cardholder", json.encodeToJsonElement(value.cardholder))
        put("created", json.encodeToJsonElement(value.created))
        put("currency", value.currency)
        put("exp_month", json.encodeToJsonElement(value.expMonth))
        put("exp_year", json.encodeToJsonElement(value.expYear))
        put("id", value.id)
        put("last4", value.last4)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("spending_controls", json.encodeToJsonElement(value.spendingControls))
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.cancellationReason?.let { put("cancellation_reason", json.encodeToJsonElement(it)) }
        value.cvc?.let { put("cvc", it) }
        value.financialAccount?.let { put("financial_account", it) }
        value.latestFraudWarning?.let { put("latest_fraud_warning", json.encodeToJsonElement(it)) }
        value.lifecycleControls?.let { put("lifecycle_controls", json.encodeToJsonElement(it)) }
        value.number?.let { put("number", it) }
        value.personalizationDesign?.let { put("personalization_design", json.encodeToJsonElement(it)) }
        value.replacedBy?.let { put("replaced_by", json.encodeToJsonElement(it)) }
        value.replacementFor?.let { put("replacement_for", json.encodeToJsonElement(it)) }
        value.replacementReason?.let { put("replacement_reason", json.encodeToJsonElement(it)) }
        value.secondLine?.let { put("second_line", it) }
        value.shipping?.let { put("shipping", json.encodeToJsonElement(it)) }
        value.wallets?.let { put("wallets", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingCard(block: IssuingCard.Builder.() -> Unit): IssuingCard = IssuingCard.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssuingCard is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
