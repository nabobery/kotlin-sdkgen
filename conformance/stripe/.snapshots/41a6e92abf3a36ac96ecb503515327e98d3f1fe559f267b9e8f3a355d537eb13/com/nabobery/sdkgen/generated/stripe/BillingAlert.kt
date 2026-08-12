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
 * A billing alert is a resource that notifies you when a certain usage threshold on a meter is crossed. For example,
 * you might create a billing alert to notify you when a certain user made 100 API requests.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing.alert
 */
@Serializable(with = BillingAlert.Serializer::class)
public class BillingAlert(
  /**
   * Defines the type of the alert.
   */
  public val alertType: InlineBillingAlertAlertTypeX831d1d2e,
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
  public val objectValue: InlineBillingAlertObjectValueX4f411e63,
  /**
   * Title of the alert.
   */
  public val title: String,
  /**
   * Status of the alert. This can be active, inactive or archived.
   */
  public val status: InlineBillingAlertStatusX73f6a8ea? = null,
  /**
   * Encapsulates configuration of the alert to monitor usage on a specific [Billing
   * Meter](https://docs.stripe.com/api/billing/meter).
   */
  public val usageThreshold: InlineBillingAlertUsageThresholdXeb2ffc97? = null,
) {
  public class Builder {
    private var alertTypeValue: InlineBillingAlertAlertTypeX831d1d2e? = null

    public var alertType: InlineBillingAlertAlertTypeX831d1d2e
      get() = requireNotNull(alertTypeValue) { "alertType is required" }
      set(`value`) {
        alertTypeValue = value
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

    private var objectValueValue: InlineBillingAlertObjectValueX4f411e63? = null

    public var objectValue: InlineBillingAlertObjectValueX4f411e63
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var titleValue: String? = null

    public var title: String
      get() = requireNotNull(titleValue) { "title is required" }
      set(`value`) {
        titleValue = value
      }

    /**
     * Status of the alert. This can be active, inactive or archived.
     */
    public var status: InlineBillingAlertStatusX73f6a8ea? = null

    /**
     * Encapsulates configuration of the alert to monitor usage on a specific [Billing
     * Meter](https://docs.stripe.com/api/billing/meter).
     */
    public var usageThreshold: InlineBillingAlertUsageThresholdXeb2ffc97? = null

    public fun build(): BillingAlert {
      check(alertTypeValue != null) { "alertType is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(titleValue != null) { "title is required" }
      return BillingAlert(
        alertType = alertType,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        title = title,
        status = status,
        usageThreshold = usageThreshold,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingAlert = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BillingAlert> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingAlert {
      val jsonDecoder = decoder.requireJsonDecoder("BillingAlert")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingAlert must be a JSON object")
      val alertType = json.decodeRequired<InlineBillingAlertAlertTypeX831d1d2e>(rawObject, "alert_type")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineBillingAlertObjectValueX4f411e63>(rawObject, "object")
      val title = json.decodeRequired<String>(rawObject, "title")
      return BillingAlert(
        alertType = alertType,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        title = title,
        status = rawObject["status"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineBillingAlertStatusX73f6a8ea?>(element) },
        usageThreshold = rawObject["usage_threshold"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineBillingAlertUsageThresholdXeb2ffc97?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingAlert) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingAlert")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("alert_type", json.encodeToJsonElement(value.alertType))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("title", value.title)
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
        value.usageThreshold?.let { put("usage_threshold", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingAlert(block: BillingAlert.Builder.() -> Unit): BillingAlert = BillingAlert.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BillingAlert is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
