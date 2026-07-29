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
 * d/schema/properties/components/properties/issuing_cards_list.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/components/properties/issuing_cards_list
 */
@Serializable(with = InlineV1AccountSessionsPostRequestFormComponentsIssuingCardsListX27e1c9cc.Serializer::class)
public class InlineV1AccountSessionsPostRequestFormComponentsIssuingCardsListX27e1c9cc(
  public val enabled: Boolean,
  public val features: InlineV1AccountSessionsPostRequestFormComponentsFeaturesX62de23c2? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var features: InlineV1AccountSessionsPostRequestFormComponentsFeaturesX62de23c2? = null

    public fun build(): InlineV1AccountSessionsPostRequestFormComponentsIssuingCardsListX27e1c9cc {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1AccountSessionsPostRequestFormComponentsIssuingCardsListX27e1c9cc(
        enabled = enabled,
        features = features,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsIssuingCardsListX27e1c9cc = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountSessionsPostRequestFormComponentsIssuingCardsListX27e1c9cc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountSessionsPostRequestFormComponentsIssuingCardsListX27e1c9cc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountSessionsPostRequestFormComponentsIssuingCardsListX27e1c9cc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountSessionsPostRequestFormComponentsIssuingCardsListX27e1c9cc must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1AccountSessionsPostRequestFormComponentsIssuingCardsListX27e1c9cc(
        enabled = enabled,
        features = rawObject["features"]?.let { json.decodeFromJsonElement<InlineV1AccountSessionsPostRequestFormComponentsFeaturesX62de23c2>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountSessionsPostRequestFormComponentsIssuingCardsListX27e1c9cc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountSessionsPostRequestFormComponentsIssuingCardsListX27e1c9cc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.features?.let { put("features", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountSessionsPostRequestFormComponentsIssuingCardsListX27e1c9cc(block: InlineV1AccountSessionsPostRequestFormComponentsIssuingCardsListX27e1c9cc.Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsIssuingCardsListX27e1c9cc = InlineV1AccountSessionsPostRequestFormComponentsIssuingCardsListX27e1c9cc.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1AccountSessionsPostRequestFormComponentsIssuingCardsListX27e1c9cc is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
