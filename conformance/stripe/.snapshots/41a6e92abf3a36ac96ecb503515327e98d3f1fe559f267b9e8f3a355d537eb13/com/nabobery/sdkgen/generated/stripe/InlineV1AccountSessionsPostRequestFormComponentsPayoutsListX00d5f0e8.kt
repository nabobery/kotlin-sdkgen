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
 * d/schema/properties/components/properties/payouts_list.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema/properties/components/properties/payouts_list
 */
@Serializable(with = InlineV1AccountSessionsPostRequestFormComponentsPayoutsListX00d5f0e8.Serializer::class)
public class InlineV1AccountSessionsPostRequestFormComponentsPayoutsListX00d5f0e8(
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

    public fun build(): InlineV1AccountSessionsPostRequestFormComponentsPayoutsListX00d5f0e8 {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1AccountSessionsPostRequestFormComponentsPayoutsListX00d5f0e8(
        enabled = enabled,
        features = features,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsPayoutsListX00d5f0e8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountSessionsPostRequestFormComponentsPayoutsListX00d5f0e8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountSessionsPostRequestFormComponentsPayoutsListX00d5f0e8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountSessionsPostRequestFormComponentsPayoutsListX00d5f0e8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountSessionsPostRequestFormComponentsPayoutsListX00d5f0e8 must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1AccountSessionsPostRequestFormComponentsPayoutsListX00d5f0e8(
        enabled = enabled,
        features = rawObject["features"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountSessionsPostRequestFormComponentsPayoutsListX00d5f0e8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountSessionsPostRequestFormComponentsPayoutsListX00d5f0e8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.features?.let { put("features", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountSessionsPostRequestFormComponentsPayoutsListX00d5f0e8(block: InlineV1AccountSessionsPostRequestFormComponentsPayoutsListX00d5f0e8.Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormComponentsPayoutsListX00d5f0e8 = InlineV1AccountSessionsPostRequestFormComponentsPayoutsListX00d5f0e8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1AccountSessionsPostRequestFormComponentsPayoutsListX00d5f0e8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
