package com.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.put

/**
 * Fallback model to try when the primary model fails or refuses. Only the `model` field is supported; per-attempt
 * overrides are rejected.
 */
@Serializable(with = MessagesFallbackParam.Serializer::class)
public class MessagesFallbackParam(
  public val model: String,
) {
  public class Builder {
    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    public fun build(): MessagesFallbackParam {
      check(modelValue != null) { "model is required" }
      return MessagesFallbackParam(
        model = model,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MessagesFallbackParam = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<MessagesFallbackParam> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MessagesFallbackParam {
      val jsonDecoder = decoder.requireJsonDecoder("MessagesFallbackParam")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("MessagesFallbackParam must be a JSON object")
      val model = json.decodeRequired<String>(raw, "model")
      return MessagesFallbackParam(
        model = model,
      )
    }

    override fun serialize(encoder: Encoder, `value`: MessagesFallbackParam) {
      val jsonEncoder = encoder.requireJsonEncoder("MessagesFallbackParam")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("model", value.model)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun messagesFallbackParam(block: MessagesFallbackParam.Builder.() -> Unit): MessagesFallbackParam =
  MessagesFallbackParam.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MessagesFallbackParam is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
