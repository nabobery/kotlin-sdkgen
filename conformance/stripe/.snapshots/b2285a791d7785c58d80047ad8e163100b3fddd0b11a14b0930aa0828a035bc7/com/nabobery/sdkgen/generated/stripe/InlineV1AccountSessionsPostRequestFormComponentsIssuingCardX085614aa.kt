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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/components/properties/issuing_card.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/components/properties/issuing_card
 */
@Serializable(with = InlineV1AccountSessionsPostRequestFormComponentsIssuingCardX085614aa.Serializer::class)
public class InlineV1AccountSessionsPostRequestFormComponentsIssuingCardX085614aa(
  public val enabled: Boolean,
  public val features:
      InlineV1AccountSessionsPostRequestFormComponentsIssuingCardFeaturesX11adaa6e? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var features:
        InlineV1AccountSessionsPostRequestFormComponentsIssuingCardFeaturesX11adaa6e? = null

    public fun build(): InlineV1AccountSessionsPostRequestFormComponentsIssuingCardX085614aa {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1AccountSessionsPostRequestFormComponentsIssuingCardX085614aa(
        enabled = enabled,
        features = features,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsIssuingCardX085614aa = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountSessionsPostRequestFormComponentsIssuingCardX085614aa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountSessionsPostRequestFormComponentsIssuingCardX085614aa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountSessionsPostRequestFormComponentsIssuingCardX085614aa")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountSessionsPostRequestFormComponentsIssuingCardX085614aa must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1AccountSessionsPostRequestFormComponentsIssuingCardX085614aa(
        enabled = enabled,
        features = rawObject["features"]?.let { json.decodeFromJsonElement<InlineV1AccountSessionsPostRequestFormComponentsIssuingCardFeaturesX11adaa6e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountSessionsPostRequestFormComponentsIssuingCardX085614aa) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountSessionsPostRequestFormComponentsIssuingCardX085614aa")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.features?.let { put("features", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountSessionsPostRequestFormComponentsIssuingCardX085614aa(block: InlineV1AccountSessionsPostRequestFormComponentsIssuingCardX085614aa.Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsIssuingCardX085614aa = InlineV1AccountSessionsPostRequestFormComponentsIssuingCardX085614aa.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1AccountSessionsPostRequestFormComponentsIssuingCardX085614aa is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
