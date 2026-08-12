package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
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

@Serializable
public data class ReviewView(
  @SerialName("billing_zip")
  public val billingZip: String? = null,
  public val charge: InlineReviewChargeX13315133? = null,
  @SerialName("closed_reason")
  public val closedReason: InlineReviewClosedReasonXec1ea24e? = null,
  public val created: Int,
  public val id: String,
  @SerialName("ip_address")
  public val ipAddress: String? = null,
  @SerialName("ip_address_location")
  public val ipAddressLocation: InlineReviewIpAddressLocationX09e4e999? = null,
  public val livemode: Boolean,
  @SerialName("object")
  public val objectValue: InlineReviewObjectValueX3a6a0700,
  public val `open`: Boolean,
  @SerialName("opened_reason")
  public val openedReason: InlineReviewOpenedReasonXa94cf867,
  @SerialName("payment_intent")
  public val paymentIntent: InlineReviewPaymentIntentXfa4a839e? = null,
  public val reason: String,
  public val session: InlineReviewSessionXb92996b5? = null,
)

/**
 * Reviews can be used to supplement automated fraud detection with human expertise.
 *
 * Learn more about [Radar](/radar) and reviewing payments
 * [here](https://docs.stripe.com/radar/reviews).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/review
 */
@Serializable(with = Review.Serializer::class)
public class Review(
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
  public val objectValue: InlineReviewObjectValueX3a6a0700,
  /**
   * If `true`, the review needs action.
   */
  public val `open`: Boolean,
  /**
   * The reason the review was opened. One of `rule` or `manual`.
   */
  public val openedReason: InlineReviewOpenedReasonXa94cf867,
  /**
   * The reason the review is currently open or closed. One of `rule`, `manual`, `approved`, `refunded`,
   * `refunded_as_fraud`, `disputed`, `redacted`, `canceled`, `payment_never_settled`, or `acknowledged`.
   */
  public val reason: String,
  /**
   * The ZIP or postal code of the card used, if applicable.
   */
  public val billingZip: String? = null,
  /**
   * The charge associated with this review.
   */
  public val charge: InlineReviewChargeX13315133? = null,
  /**
   * The reason the review was closed, or null if it has not yet been closed. One of `approved`, `refunded`,
   * `refunded_as_fraud`, `disputed`, `redacted`, `canceled`, `payment_never_settled`, or `acknowledged`.
   */
  public val closedReason: InlineReviewClosedReasonXec1ea24e? = null,
  /**
   * The IP address where the payment originated.
   */
  public val ipAddress: String? = null,
  /**
   * Information related to the location of the payment. Note that this information is an approximation and attempts to
   * locate the nearest population center - it should not be used to determine a specific address.
   */
  public val ipAddressLocation: InlineReviewIpAddressLocationX09e4e999? = null,
  /**
   * The PaymentIntent ID associated with this review, if one exists.
   */
  public val paymentIntent: InlineReviewPaymentIntentXfa4a839e? = null,
  /**
   * Information related to the browsing session of the user who initiated the payment.
   */
  public val session: InlineReviewSessionXb92996b5? = null,
) {
  public class Builder {
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

    private var objectValueValue: InlineReviewObjectValueX3a6a0700? = null

    public var objectValue: InlineReviewObjectValueX3a6a0700
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var openValue: Boolean? = null

    public var `open`: Boolean
      get() = requireNotNull(openValue) { "open is required" }
      set(`value`) {
        openValue = value
      }

    private var openedReasonValue: InlineReviewOpenedReasonXa94cf867? = null

    public var openedReason: InlineReviewOpenedReasonXa94cf867
      get() = requireNotNull(openedReasonValue) { "openedReason is required" }
      set(`value`) {
        openedReasonValue = value
      }

    private var reasonValue: String? = null

    public var reason: String
      get() = requireNotNull(reasonValue) { "reason is required" }
      set(`value`) {
        reasonValue = value
      }

    /**
     * The ZIP or postal code of the card used, if applicable.
     */
    public var billingZip: String? = null

    /**
     * The charge associated with this review.
     */
    public var charge: InlineReviewChargeX13315133? = null

    /**
     * The reason the review was closed, or null if it has not yet been closed. One of `approved`, `refunded`,
     * `refunded_as_fraud`, `disputed`, `redacted`, `canceled`, `payment_never_settled`, or `acknowledged`.
     */
    public var closedReason: InlineReviewClosedReasonXec1ea24e? = null

    /**
     * The IP address where the payment originated.
     */
    public var ipAddress: String? = null

    /**
     * Information related to the location of the payment. Note that this information is an approximation and attempts
     * to locate the nearest population center - it should not be used to determine a specific address.
     */
    public var ipAddressLocation: InlineReviewIpAddressLocationX09e4e999? = null

    /**
     * The PaymentIntent ID associated with this review, if one exists.
     */
    public var paymentIntent: InlineReviewPaymentIntentXfa4a839e? = null

    /**
     * Information related to the browsing session of the user who initiated the payment.
     */
    public var session: InlineReviewSessionXb92996b5? = null

    public fun build(): Review {
      check(createdValue != null) { "created is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(openValue != null) { "open is required" }
      check(openedReasonValue != null) { "openedReason is required" }
      check(reasonValue != null) { "reason is required" }
      return Review(
        created = created,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        open = open,
        openedReason = openedReason,
        reason = reason,
        billingZip = billingZip,
        charge = charge,
        closedReason = closedReason,
        ipAddress = ipAddress,
        ipAddressLocation = ipAddressLocation,
        paymentIntent = paymentIntent,
        session = session,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Review = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Review> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Review {
      val jsonDecoder = decoder.requireJsonDecoder("Review")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Review must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineReviewObjectValueX3a6a0700>(rawObject, "object")
      val open = json.decodeRequired<Boolean>(rawObject, "open")
      val openedReason = json.decodeRequired<InlineReviewOpenedReasonXa94cf867>(rawObject, "opened_reason")
      val reason = json.decodeRequired<String>(rawObject, "reason")
      return Review(
        created = created,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        open = open,
        openedReason = openedReason,
        reason = reason,
        billingZip = rawObject["billing_zip"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        charge = rawObject["charge"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineReviewChargeX13315133?>(element) },
        closedReason = rawObject["closed_reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineReviewClosedReasonXec1ea24e?>(element) },
        ipAddress = rawObject["ip_address"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        ipAddressLocation = rawObject["ip_address_location"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineReviewIpAddressLocationX09e4e999?>(element) },
        paymentIntent = rawObject["payment_intent"]?.let { json.decodeFromJsonElement<InlineReviewPaymentIntentXfa4a839e>(it) },
        session = rawObject["session"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineReviewSessionXb92996b5?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Review) {
      val jsonEncoder = encoder.requireJsonEncoder("Review")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("open", json.encodeToJsonElement(value.open))
        put("opened_reason", json.encodeToJsonElement(value.openedReason))
        put("reason", value.reason)
        value.billingZip?.let { put("billing_zip", it) }
        value.charge?.let { put("charge", json.encodeToJsonElement(it)) }
        value.closedReason?.let { put("closed_reason", json.encodeToJsonElement(it)) }
        value.ipAddress?.let { put("ip_address", it) }
        value.ipAddressLocation?.let { put("ip_address_location", json.encodeToJsonElement(it)) }
        value.paymentIntent?.let { put("payment_intent", json.encodeToJsonElement(it)) }
        value.session?.let { put("session", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun review(block: Review.Builder.() -> Unit): Review = Review.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Review is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
