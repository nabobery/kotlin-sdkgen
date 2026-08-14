package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * The billing mode of the subscription.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_billing_mode
 */
@Serializable(with = SubscriptionsResourceBillingMode.Serializer::class)
public class SubscriptionsResourceBillingMode(
  /**
   * Controls how prorations and invoices for subscriptions are calculated and orchestrated.
   */
  public val type: InlineSubscriptionsResourceBillingModeTypeX424998b4,
  /**
   * Configure behavior for flexible billing mode
   */
  public val flexible: InlineSubscriptionsResourceBillingModeFlexibleXcfa0fc39? = null,
  /**
   * Details on when the current billing_mode was adopted.
   */
  public val updatedAt: Int? = null,
) {
  public class Builder {
    private var typeValue: InlineSubscriptionsResourceBillingModeTypeX424998b4? = null

    public var type: InlineSubscriptionsResourceBillingModeTypeX424998b4
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * Configure behavior for flexible billing mode
     */
    public var flexible: InlineSubscriptionsResourceBillingModeFlexibleXcfa0fc39? = null

    /**
     * Details on when the current billing_mode was adopted.
     */
    public var updatedAt: Int? = null

    public fun build(): SubscriptionsResourceBillingMode {
      check(typeValue != null) { "type is required" }
      return SubscriptionsResourceBillingMode(
        type = type,
        flexible = flexible,
        updatedAt = updatedAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubscriptionsResourceBillingMode = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SubscriptionsResourceBillingMode> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubscriptionsResourceBillingMode {
      val jsonDecoder = decoder.requireJsonDecoder("SubscriptionsResourceBillingMode")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubscriptionsResourceBillingMode must be a JSON object")
      val type = json.decodeRequired<InlineSubscriptionsResourceBillingModeTypeX424998b4>(rawObject, "type")
      return SubscriptionsResourceBillingMode(
        type = type,
        flexible = rawObject["flexible"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionsResourceBillingModeFlexibleXcfa0fc39?>(element) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubscriptionsResourceBillingMode) {
      val jsonEncoder = encoder.requireJsonEncoder("SubscriptionsResourceBillingMode")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.flexible?.let { put("flexible", json.encodeToJsonElement(it)) }
        value.updatedAt?.let { put("updated_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subscriptionsResourceBillingMode(block: SubscriptionsResourceBillingMode.Builder.() -> Unit): SubscriptionsResourceBillingMode = SubscriptionsResourceBillingMode.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SubscriptionsResourceBillingMode is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
