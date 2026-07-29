package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Controls how prorations and invoices for subscriptions are calculated and orchestrated.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/billing_mode
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormBillingModeX933573e8.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormBillingModeX933573e8(
  public val type: InlineV1SubscriptionsPostRequestFormBillingModeTypeX221cec6e,
  public val flexible: InlineV1SubscriptionsPostRequestFormBillingModeFlexibleX179c2e6e? = null,
) {
  public class Builder {
    private var typeValue: InlineV1SubscriptionsPostRequestFormBillingModeTypeX221cec6e? = null

    public var type: InlineV1SubscriptionsPostRequestFormBillingModeTypeX221cec6e
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var flexible: InlineV1SubscriptionsPostRequestFormBillingModeFlexibleX179c2e6e? = null

    public fun build(): InlineV1SubscriptionsPostRequestFormBillingModeX933573e8 {
      check(typeValue != null) { "type is required" }
      return InlineV1SubscriptionsPostRequestFormBillingModeX933573e8(
        type = type,
        flexible = flexible,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormBillingModeX933573e8 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormBillingModeX933573e8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormBillingModeX933573e8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormBillingModeX933573e8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormBillingModeX933573e8 must be a JSON object")
      val type = json.decodeRequired<InlineV1SubscriptionsPostRequestFormBillingModeTypeX221cec6e>(rawObject, "type")
      return InlineV1SubscriptionsPostRequestFormBillingModeX933573e8(
        type = type,
        flexible = rawObject["flexible"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormBillingModeFlexibleX179c2e6e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormBillingModeX933573e8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormBillingModeX933573e8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.flexible?.let { put("flexible", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionsPostRequestFormBillingModeX933573e8(block: InlineV1SubscriptionsPostRequestFormBillingModeX933573e8.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormBillingModeX933573e8 = InlineV1SubscriptionsPostRequestFormBillingModeX933573e8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormBillingModeX933573e8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
