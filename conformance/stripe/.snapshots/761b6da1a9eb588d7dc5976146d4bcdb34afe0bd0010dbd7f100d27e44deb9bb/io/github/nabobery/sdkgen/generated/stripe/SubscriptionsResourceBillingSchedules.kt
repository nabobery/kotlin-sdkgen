package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Sets the billing schedule for the subscription.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_billing_schedules
 */
@Serializable(with = SubscriptionsResourceBillingSchedules.Serializer::class)
public class SubscriptionsResourceBillingSchedules(
  public val billUntil: SubscriptionsResourceBillingSchedulesBillUntil,
  /**
   * Unique identifier for the billing schedule.
   */
  public val key: String,
  appliesTo: List<SubscriptionsResourceBillingSchedulesAppliesTo>? = null,
) {
  /**
   * Specifies which subscription items the billing schedule applies to.
   */
  public val appliesTo: List<SubscriptionsResourceBillingSchedulesAppliesTo>? =
      appliesTo?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var billUntilValue: SubscriptionsResourceBillingSchedulesBillUntil? = null

    public var billUntil: SubscriptionsResourceBillingSchedulesBillUntil
      get() = requireNotNull(billUntilValue) { "billUntil is required" }
      set(`value`) {
        billUntilValue = value
      }

    private var keyValue: String? = null

    public var key: String
      get() = requireNotNull(keyValue) { "key is required" }
      set(`value`) {
        keyValue = value
      }

    private var appliesToValue: List<SubscriptionsResourceBillingSchedulesAppliesTo>? = null

    /**
     * Specifies which subscription items the billing schedule applies to.
     */
    public var appliesTo: List<SubscriptionsResourceBillingSchedulesAppliesTo>?
      get() = appliesToValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        appliesToValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): SubscriptionsResourceBillingSchedules {
      check(billUntilValue != null) { "billUntil is required" }
      check(keyValue != null) { "key is required" }
      return SubscriptionsResourceBillingSchedules(
        billUntil = billUntil,
        key = key,
        appliesTo = appliesTo,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubscriptionsResourceBillingSchedules = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SubscriptionsResourceBillingSchedules> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubscriptionsResourceBillingSchedules {
      val jsonDecoder = decoder.requireJsonDecoder("SubscriptionsResourceBillingSchedules")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubscriptionsResourceBillingSchedules must be a JSON object")
      val billUntil = json.decodeRequired<SubscriptionsResourceBillingSchedulesBillUntil>(rawObject, "bill_until")
      val key = json.decodeRequired<String>(rawObject, "key")
      return SubscriptionsResourceBillingSchedules(
        billUntil = billUntil,
        key = key,
        appliesTo = rawObject["applies_to"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<SubscriptionsResourceBillingSchedulesAppliesTo>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubscriptionsResourceBillingSchedules) {
      val jsonEncoder = encoder.requireJsonEncoder("SubscriptionsResourceBillingSchedules")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("bill_until", json.encodeToJsonElement(value.billUntil))
        put("key", value.key)
        value.appliesTo?.let { put("applies_to", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subscriptionsResourceBillingSchedules(block: SubscriptionsResourceBillingSchedules.Builder.() -> Unit): SubscriptionsResourceBillingSchedules = SubscriptionsResourceBillingSchedules.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SubscriptionsResourceBillingSchedules is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
