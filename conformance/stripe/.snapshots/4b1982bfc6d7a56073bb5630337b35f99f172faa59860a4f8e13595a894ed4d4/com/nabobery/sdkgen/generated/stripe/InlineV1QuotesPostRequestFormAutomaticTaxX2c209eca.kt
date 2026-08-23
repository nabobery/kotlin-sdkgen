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
 * Settings for automatic tax lookup for this quote and resulting invoices and subscriptions.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/automatic_tax
 */
@Serializable(with = InlineV1QuotesPostRequestFormAutomaticTaxX2c209eca.Serializer::class)
public class InlineV1QuotesPostRequestFormAutomaticTaxX2c209eca(
  public val enabled: Boolean,
  public val liability: InlineV1QuotesPostRequestFormAutomaticTaxLiabilityX82563363? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var liability: InlineV1QuotesPostRequestFormAutomaticTaxLiabilityX82563363? = null

    public fun build(): InlineV1QuotesPostRequestFormAutomaticTaxX2c209eca {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1QuotesPostRequestFormAutomaticTaxX2c209eca(
        enabled = enabled,
        liability = liability,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1QuotesPostRequestFormAutomaticTaxX2c209eca = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1QuotesPostRequestFormAutomaticTaxX2c209eca> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormAutomaticTaxX2c209eca {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormAutomaticTaxX2c209eca")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1QuotesPostRequestFormAutomaticTaxX2c209eca must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1QuotesPostRequestFormAutomaticTaxX2c209eca(
        enabled = enabled,
        liability = rawObject["liability"]?.let { json.decodeFromJsonElement<InlineV1QuotesPostRequestFormAutomaticTaxLiabilityX82563363>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormAutomaticTaxX2c209eca) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormAutomaticTaxX2c209eca")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.liability?.let { put("liability", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1QuotesPostRequestFormAutomaticTaxX2c209eca(block: InlineV1QuotesPostRequestFormAutomaticTaxX2c209eca.Builder.() -> Unit): InlineV1QuotesPostRequestFormAutomaticTaxX2c209eca = InlineV1QuotesPostRequestFormAutomaticTaxX2c209eca.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1QuotesPostRequestFormAutomaticTaxX2c209eca is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
