package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormXd61b017a.Serializer::class)
public class InlineV1IssuingCardsPostRequestFormXd61b017a(
  /**
   * The currency for the card.
   */
  public val currency: String,
  /**
   * The type of card to issue. Possible values are `physical` or `virtual`.
   */
  public val type: InlineV1IssuingCardsPostRequestFormTypeX82e345e0,
  /**
   * The [Cardholder](https://docs.stripe.com/api#issuing_cardholder_object) object with which the card will be
   * associated.
   */
  public val cardholder: String? = null,
  /**
   * The desired expiration month (1-12) for this card if [specifying a custom expiration
   * date](/issuing/cards/virtual/issue-cards?testing-method=with-code#exp-dates).
   */
  public val expMonth: Int? = null,
  /**
   * The desired 4-digit expiration year for this card if [specifying a custom expiration
   * date](/issuing/cards/virtual/issue-cards?testing-method=with-code#exp-dates).
   */
  public val expYear: Int? = null,
  expand: List<String>? = null,
  /**
   * The new financial account ID the card will be associated with. This field allows a card to be reassigned to a
   * different financial account.
   */
  public val financialAccount: String? = null,
  /**
   * Rules that control the lifecycle of this card, such as automatic cancellation. Refer to our
   * [documentation](/issuing/controls/lifecycle-controls) for more details.
   */
  public val lifecycleControls:
      InlineV1IssuingCardsPostRequestFormLifecycleControlsX423db20f? = null,
  metadata: Map<String, String>? = null,
  /**
   * The personalization design object belonging to this card.
   */
  public val personalizationDesign: String? = null,
  /**
   * The desired PIN for this card.
   */
  public val pin: InlineV1IssuingCardsPostRequestFormPinXeb8be2a5? = null,
  /**
   * The card this is meant to be a replacement for (if any).
   */
  public val replacementFor: String? = null,
  /**
   * If `replacement_for` is specified, this should indicate why that card is being replaced.
   */
  public val replacementReason:
      InlineV1IssuingCardsPostRequestFormReplacementReasonX68577ce9? = null,
  /**
   * The second line to print on the card. Max length: 24 characters.
   */
  public val secondLine: InlineV1IssuingCardsPostRequestFormSecondLineX9917f825? = null,
  /**
   * The address where the card will be shipped.
   */
  public val shipping: InlineV1IssuingCardsPostRequestFormShippingXd723d6b8? = null,
  /**
   * Rules that control spending for this card. Refer to our
   * [documentation](https://docs.stripe.com/issuing/controls/spending-controls) for more details.
   */
  public val spendingControls: InlineV1IssuingCardsPostRequestFormSpendingControlsXdf7674d3? = null,
  /**
   * Whether authorizations can be approved on this card. May be blocked from activating cards depending on past-due
   * Cardholder requirements. Defaults to `inactive`.
   */
  public val status: InlineV1IssuingCardsPostRequestFormStatusXe8004f74? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    private var typeValue: InlineV1IssuingCardsPostRequestFormTypeX82e345e0? = null

    public var type: InlineV1IssuingCardsPostRequestFormTypeX82e345e0
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * The [Cardholder](https://docs.stripe.com/api#issuing_cardholder_object) object with which the card will be
     * associated.
     */
    public var cardholder: String? = null

    /**
     * The desired expiration month (1-12) for this card if [specifying a custom expiration
     * date](/issuing/cards/virtual/issue-cards?testing-method=with-code#exp-dates).
     */
    public var expMonth: Int? = null

    /**
     * The desired 4-digit expiration year for this card if [specifying a custom expiration
     * date](/issuing/cards/virtual/issue-cards?testing-method=with-code#exp-dates).
     */
    public var expYear: Int? = null

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
     * The new financial account ID the card will be associated with. This field allows a card to be reassigned to a
     * different financial account.
     */
    public var financialAccount: String? = null

    /**
     * Rules that control the lifecycle of this card, such as automatic cancellation. Refer to our
     * [documentation](/issuing/controls/lifecycle-controls) for more details.
     */
    public var lifecycleControls: InlineV1IssuingCardsPostRequestFormLifecycleControlsX423db20f? =
        null

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * The personalization design object belonging to this card.
     */
    public var personalizationDesign: String? = null

    /**
     * The desired PIN for this card.
     */
    public var pin: InlineV1IssuingCardsPostRequestFormPinXeb8be2a5? = null

    /**
     * The card this is meant to be a replacement for (if any).
     */
    public var replacementFor: String? = null

    /**
     * If `replacement_for` is specified, this should indicate why that card is being replaced.
     */
    public var replacementReason: InlineV1IssuingCardsPostRequestFormReplacementReasonX68577ce9? =
        null

    /**
     * The second line to print on the card. Max length: 24 characters.
     */
    public var secondLine: InlineV1IssuingCardsPostRequestFormSecondLineX9917f825? = null

    /**
     * The address where the card will be shipped.
     */
    public var shipping: InlineV1IssuingCardsPostRequestFormShippingXd723d6b8? = null

    /**
     * Rules that control spending for this card. Refer to our
     * [documentation](https://docs.stripe.com/issuing/controls/spending-controls) for more details.
     */
    public var spendingControls: InlineV1IssuingCardsPostRequestFormSpendingControlsXdf7674d3? =
        null

    /**
     * Whether authorizations can be approved on this card. May be blocked from activating cards depending on past-due
     * Cardholder requirements. Defaults to `inactive`.
     */
    public var status: InlineV1IssuingCardsPostRequestFormStatusXe8004f74? = null

    public fun build(): InlineV1IssuingCardsPostRequestFormXd61b017a {
      check(currencyValue != null) { "currency is required" }
      check(typeValue != null) { "type is required" }
      return InlineV1IssuingCardsPostRequestFormXd61b017a(
        currency = currency,
        type = type,
        cardholder = cardholder,
        expMonth = expMonth,
        expYear = expYear,
        expand = expand,
        financialAccount = financialAccount,
        lifecycleControls = lifecycleControls,
        metadata = metadata,
        personalizationDesign = personalizationDesign,
        pin = pin,
        replacementFor = replacementFor,
        replacementReason = replacementReason,
        secondLine = secondLine,
        shipping = shipping,
        spendingControls = spendingControls,
        status = status,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingCardsPostRequestFormXd61b017a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormXd61b017a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardsPostRequestFormXd61b017a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardsPostRequestFormXd61b017a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingCardsPostRequestFormXd61b017a must be a JSON object")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val type = json.decodeRequired<InlineV1IssuingCardsPostRequestFormTypeX82e345e0>(rawObject, "type")
      return InlineV1IssuingCardsPostRequestFormXd61b017a(
        currency = currency,
        type = type,
        cardholder = rawObject["cardholder"]?.let { json.decodeFromJsonElement<String>(it) },
        expMonth = rawObject["exp_month"]?.let { json.decodeFromJsonElement<Int>(it) },
        expYear = rawObject["exp_year"]?.let { json.decodeFromJsonElement<Int>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        financialAccount = rawObject["financial_account"]?.let { json.decodeFromJsonElement<String>(it) },
        lifecycleControls = rawObject["lifecycle_controls"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardsPostRequestFormLifecycleControlsX423db20f>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        personalizationDesign = rawObject["personalization_design"]?.let { json.decodeFromJsonElement<String>(it) },
        pin = rawObject["pin"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardsPostRequestFormPinXeb8be2a5>(it) },
        replacementFor = rawObject["replacement_for"]?.let { json.decodeFromJsonElement<String>(it) },
        replacementReason = rawObject["replacement_reason"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardsPostRequestFormReplacementReasonX68577ce9>(it) },
        secondLine = rawObject["second_line"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardsPostRequestFormSecondLineX9917f825>(it) },
        shipping = rawObject["shipping"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardsPostRequestFormShippingXd723d6b8>(it) },
        spendingControls = rawObject["spending_controls"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardsPostRequestFormSpendingControlsXdf7674d3>(it) },
        status = rawObject["status"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardsPostRequestFormStatusXe8004f74>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardsPostRequestFormXd61b017a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingCardsPostRequestFormXd61b017a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("currency", value.currency)
        put("type", json.encodeToJsonElement(value.type))
        value.cardholder?.let { put("cardholder", it) }
        value.expMonth?.let { put("exp_month", json.encodeToJsonElement(it)) }
        value.expYear?.let { put("exp_year", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.financialAccount?.let { put("financial_account", it) }
        value.lifecycleControls?.let { put("lifecycle_controls", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.personalizationDesign?.let { put("personalization_design", it) }
        value.pin?.let { put("pin", json.encodeToJsonElement(it)) }
        value.replacementFor?.let { put("replacement_for", it) }
        value.replacementReason?.let { put("replacement_reason", json.encodeToJsonElement(it)) }
        value.secondLine?.let { put("second_line", json.encodeToJsonElement(it)) }
        value.shipping?.let { put("shipping", json.encodeToJsonElement(it)) }
        value.spendingControls?.let { put("spending_controls", json.encodeToJsonElement(it)) }
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingCardsPostRequestFormXd61b017a(block: InlineV1IssuingCardsPostRequestFormXd61b017a.Builder.() -> Unit): InlineV1IssuingCardsPostRequestFormXd61b017a = InlineV1IssuingCardsPostRequestFormXd61b017a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1IssuingCardsPostRequestFormXd61b017a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
