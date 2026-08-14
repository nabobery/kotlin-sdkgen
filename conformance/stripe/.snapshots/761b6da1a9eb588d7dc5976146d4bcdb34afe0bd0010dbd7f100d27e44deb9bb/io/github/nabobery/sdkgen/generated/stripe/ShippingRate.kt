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
public data class ShippingRateView internal constructor(
  public val active: Boolean,
  public val created: Int,
  @SerialName("delivery_estimate")
  public val deliveryEstimate: InlineShippingRateDeliveryEstimateX7e05df42? = null,
  @SerialName("display_name")
  public val displayName: String? = null,
  @SerialName("fixed_amount")
  public val fixedAmount: ShippingRateFixedAmount? = null,
  public val id: String,
  public val livemode: Boolean,
  public val metadata: Map<String, String>,
  @SerialName("object")
  public val objectValue: InlineShippingRateObjectValueX6333f01b,
  @SerialName("tax_behavior")
  public val taxBehavior: InlineShippingRateTaxBehaviorX98ec2e75? = null,
  @SerialName("tax_code")
  public val taxCode: InlineShippingRateTaxCodeX5b0a4373? = null,
  public val type: InlineShippingRateTypeXbe49c0e0,
)

/**
 * Shipping rates describe the price of shipping presented to your customers and
 * applied to a purchase. For more information, see [Charge for
 * shipping](https://docs.stripe.com/payments/during-payment/charge-shipping).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/shipping_rate
 */
@Serializable(with = ShippingRate.Serializer::class)
public class ShippingRate(
  /**
   * Whether the shipping rate can be used for new purchases. Defaults to `true`.
   */
  public val active: Boolean,
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
  metadata: Map<String, String>,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineShippingRateObjectValueX6333f01b,
  /**
   * The type of calculation to use on the shipping rate.
   */
  public val type: InlineShippingRateTypeXbe49c0e0,
  /**
   * The estimated range for how long shipping will take, meant to be displayable to the customer. This will appear on
   * CheckoutSessions.
   */
  public val deliveryEstimate: InlineShippingRateDeliveryEstimateX7e05df42? = null,
  /**
   * The name of the shipping rate, meant to be displayable to the customer. This will appear on CheckoutSessions.
   */
  public val displayName: String? = null,
  public val fixedAmount: ShippingRateFixedAmount? = null,
  /**
   * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of `inclusive`, `exclusive`,
   * or `unspecified`.
   */
  public val taxBehavior: InlineShippingRateTaxBehaviorX98ec2e75? = null,
  /**
   * A [tax code](https://docs.stripe.com/tax/tax-categories) ID. The Shipping tax code is `txcd_92010001`.
   */
  public val taxCode: InlineShippingRateTaxCodeX5b0a4373? = null,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String> = metadata.toMap()

  public class Builder {
    private var activeValue: Boolean? = null

    public var active: Boolean
      get() = requireNotNull(activeValue) { "active is required" }
      set(`value`) {
        activeValue = value
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

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>
      get() = requireNotNull(metadataValue) { "metadata is required" }.toMap()
      set(`value`) {
        metadataValue = value.toMap()
      }

    private var objectValueValue: InlineShippingRateObjectValueX6333f01b? = null

    public var objectValue: InlineShippingRateObjectValueX6333f01b
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var typeValue: InlineShippingRateTypeXbe49c0e0? = null

    public var type: InlineShippingRateTypeXbe49c0e0
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * The estimated range for how long shipping will take, meant to be displayable to the customer. This will appear on
     * CheckoutSessions.
     */
    public var deliveryEstimate: InlineShippingRateDeliveryEstimateX7e05df42? = null

    /**
     * The name of the shipping rate, meant to be displayable to the customer. This will appear on CheckoutSessions.
     */
    public var displayName: String? = null

    public var fixedAmount: ShippingRateFixedAmount? = null

    /**
     * Specifies whether the rate is considered inclusive of taxes or exclusive of taxes. One of `inclusive`,
     * `exclusive`, or `unspecified`.
     */
    public var taxBehavior: InlineShippingRateTaxBehaviorX98ec2e75? = null

    /**
     * A [tax code](https://docs.stripe.com/tax/tax-categories) ID. The Shipping tax code is `txcd_92010001`.
     */
    public var taxCode: InlineShippingRateTaxCodeX5b0a4373? = null

    public fun build(): ShippingRate {
      check(activeValue != null) { "active is required" }
      check(createdValue != null) { "created is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(metadataValue != null) { "metadata is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(typeValue != null) { "type is required" }
      return ShippingRate(
        active = active,
        created = created,
        id = id,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        type = type,
        deliveryEstimate = deliveryEstimate,
        displayName = displayName,
        fixedAmount = fixedAmount,
        taxBehavior = taxBehavior,
        taxCode = taxCode,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ShippingRate = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ShippingRate> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ShippingRate {
      val jsonDecoder = decoder.requireJsonDecoder("ShippingRate")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ShippingRate must be a JSON object")
      val active = json.decodeRequired<Boolean>(rawObject, "active")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
      val objectValue = json.decodeRequired<InlineShippingRateObjectValueX6333f01b>(rawObject, "object")
      val type = json.decodeRequired<InlineShippingRateTypeXbe49c0e0>(rawObject, "type")
      return ShippingRate(
        active = active,
        created = created,
        id = id,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        type = type,
        deliveryEstimate = rawObject["delivery_estimate"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineShippingRateDeliveryEstimateX7e05df42?>(element) },
        displayName = rawObject["display_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        fixedAmount = rawObject["fixed_amount"]?.let { json.decodeFromJsonElement<ShippingRateFixedAmount>(it) },
        taxBehavior = rawObject["tax_behavior"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineShippingRateTaxBehaviorX98ec2e75?>(element) },
        taxCode = rawObject["tax_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineShippingRateTaxCodeX5b0a4373?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ShippingRate) {
      val jsonEncoder = encoder.requireJsonEncoder("ShippingRate")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("active", json.encodeToJsonElement(value.active))
        put("created", json.encodeToJsonElement(value.created))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("type", json.encodeToJsonElement(value.type))
        value.deliveryEstimate?.let { put("delivery_estimate", json.encodeToJsonElement(it)) }
        value.displayName?.let { put("display_name", it) }
        value.fixedAmount?.let { put("fixed_amount", json.encodeToJsonElement(it)) }
        value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
        value.taxCode?.let { put("tax_code", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun shippingRate(block: ShippingRate.Builder.() -> Unit): ShippingRate = ShippingRate.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ShippingRate is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
