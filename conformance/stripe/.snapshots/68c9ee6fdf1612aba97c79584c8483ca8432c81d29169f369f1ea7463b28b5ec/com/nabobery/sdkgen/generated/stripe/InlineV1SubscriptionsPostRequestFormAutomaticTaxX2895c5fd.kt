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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Automatic tax settings for this subscription.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/automatic_tax
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormAutomaticTaxX2895c5fd.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormAutomaticTaxX2895c5fd(
  public val enabled: Boolean,
  public val liability: InlineV1SubscriptionsPostRequestFormAutomaticTaxLiabilityXaf737901? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var liability: InlineV1SubscriptionsPostRequestFormAutomaticTaxLiabilityXaf737901? = null

    public fun build(): InlineV1SubscriptionsPostRequestFormAutomaticTaxX2895c5fd {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1SubscriptionsPostRequestFormAutomaticTaxX2895c5fd(
        enabled = enabled,
        liability = liability,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormAutomaticTaxX2895c5fd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormAutomaticTaxX2895c5fd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormAutomaticTaxX2895c5fd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormAutomaticTaxX2895c5fd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormAutomaticTaxX2895c5fd must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1SubscriptionsPostRequestFormAutomaticTaxX2895c5fd(
        enabled = enabled,
        liability = rawObject["liability"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormAutomaticTaxLiabilityXaf737901>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormAutomaticTaxX2895c5fd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormAutomaticTaxX2895c5fd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.liability?.let { put("liability", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionsPostRequestFormAutomaticTaxX2895c5fd(block: InlineV1SubscriptionsPostRequestFormAutomaticTaxX2895c5fd.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormAutomaticTaxX2895c5fd = InlineV1SubscriptionsPostRequestFormAutomaticTaxX2895c5fd.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormAutomaticTaxX2895c5fd is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
