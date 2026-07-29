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
 * d/schema/properties/components/properties/payout_details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/components/properties/payout_details
 */
@Serializable(with = InlineV1AccountSessionsPostRequestFormComponentsPayoutDetailsX9bda0df5.Serializer::class)
public class InlineV1AccountSessionsPostRequestFormComponentsPayoutDetailsX9bda0df5(
  public val enabled: Boolean,
  public val features: JsonObject? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var features: JsonObject? = null

    public fun build(): InlineV1AccountSessionsPostRequestFormComponentsPayoutDetailsX9bda0df5 {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1AccountSessionsPostRequestFormComponentsPayoutDetailsX9bda0df5(
        enabled = enabled,
        features = features,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsPayoutDetailsX9bda0df5 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountSessionsPostRequestFormComponentsPayoutDetailsX9bda0df5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountSessionsPostRequestFormComponentsPayoutDetailsX9bda0df5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountSessionsPostRequestFormComponentsPayoutDetailsX9bda0df5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountSessionsPostRequestFormComponentsPayoutDetailsX9bda0df5 must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1AccountSessionsPostRequestFormComponentsPayoutDetailsX9bda0df5(
        enabled = enabled,
        features = rawObject["features"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountSessionsPostRequestFormComponentsPayoutDetailsX9bda0df5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountSessionsPostRequestFormComponentsPayoutDetailsX9bda0df5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.features?.let { put("features", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountSessionsPostRequestFormComponentsPayoutDetailsX9bda0df5(block: InlineV1AccountSessionsPostRequestFormComponentsPayoutDetailsX9bda0df5.Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsPayoutDetailsX9bda0df5 = InlineV1AccountSessionsPostRequestFormComponentsPayoutDetailsX9bda0df5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1AccountSessionsPostRequestFormComponentsPayoutDetailsX9bda0df5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
