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
 * Settings for automatic tax lookup for this session and resulting payments, invoices, and subscriptions.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/automatic_tax
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormAutomaticTaxX34813ec4.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormAutomaticTaxX34813ec4(
  public val enabled: Boolean,
  public val liability:
      InlineV1CheckoutSessionsPostRequestFormAutomaticTaxLiabilityXf41c65f7? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var liability: InlineV1CheckoutSessionsPostRequestFormAutomaticTaxLiabilityXf41c65f7? =
        null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormAutomaticTaxX34813ec4 {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1CheckoutSessionsPostRequestFormAutomaticTaxX34813ec4(
        enabled = enabled,
        liability = liability,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormAutomaticTaxX34813ec4 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormAutomaticTaxX34813ec4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormAutomaticTaxX34813ec4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormAutomaticTaxX34813ec4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormAutomaticTaxX34813ec4 must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1CheckoutSessionsPostRequestFormAutomaticTaxX34813ec4(
        enabled = enabled,
        liability = rawObject["liability"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormAutomaticTaxLiabilityXf41c65f7>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormAutomaticTaxX34813ec4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormAutomaticTaxX34813ec4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.liability?.let { put("liability", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormAutomaticTaxX34813ec4(block: InlineV1CheckoutSessionsPostRequestFormAutomaticTaxX34813ec4.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormAutomaticTaxX34813ec4 = InlineV1CheckoutSessionsPostRequestFormAutomaticTaxX34813ec4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormAutomaticTaxX34813ec4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
