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
 * Automatic tax settings for this subscription. We recommend you only include this parameter when the existing value is
 * being changed.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/automatic_tax
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxXffc707ef.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxXffc707ef(
  public val enabled: Boolean,
  public val liability:
      InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxLiabilityX92cb024a? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var liability:
        InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxLiabilityX92cb024a? = null

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxXffc707ef {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxXffc707ef(
        enabled = enabled,
        liability = liability,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxXffc707ef = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxXffc707ef> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxXffc707ef {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxXffc707ef")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxXffc707ef must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxXffc707ef(
        enabled = enabled,
        liability = rawObject["liability"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxLiabilityX92cb024a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxXffc707ef) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxXffc707ef")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.liability?.let { put("liability", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxXffc707ef(block: InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxXffc707ef.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxXffc707ef = InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxXffc707ef.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormAutomaticTaxXffc707ef is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
