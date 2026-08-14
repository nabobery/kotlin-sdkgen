package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesFallbackParam
 */
@Serializable(with = MessagesFallbackParam.Serializer::class)
public class MessagesFallbackParam(
  public val model: String,
  additionalProperties: Map<String, JsonElement> = emptyMap(),
) {
  /**
   * Additional JSON object members not declared as fixed properties.
   */
  public val additionalProperties: Map<String, JsonElement> =
      copyAndValidateMessagesFallbackParamAdditionalProperties(additionalProperties)

  public class Builder {
    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    private var additionalPropertiesValue: Map<String, JsonElement> = emptyMap()

    /**
     * Additional JSON object members not declared as fixed properties.
     */
    public var additionalProperties: Map<String, JsonElement>
      get() = additionalPropertiesValue.toMap()
      set(`value`) {
        additionalPropertiesValue = value.toMap()
      }

    public fun build(): MessagesFallbackParam {
      check(modelValue != null) { "model is required" }
      return MessagesFallbackParam(
        model = model,
        additionalProperties = additionalProperties,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MessagesFallbackParam = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<MessagesFallbackParam> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MessagesFallbackParam {
      val jsonDecoder = decoder.requireJsonDecoder("MessagesFallbackParam")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("MessagesFallbackParam must be a JSON object")
      val model = json.decodeRequired<String>(rawObject, "model")
      return MessagesFallbackParam(
        model = model,
        additionalProperties = rawObject.filterKeys { key -> key !in setOf("model") }.mapValues { (_, element) -> element }.toMap(),
      )
    }

    override fun serialize(encoder: Encoder, `value`: MessagesFallbackParam) {
      val jsonEncoder = encoder.requireJsonEncoder("MessagesFallbackParam")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("model", value.model)
        value.additionalProperties.keys.sorted().forEach { key ->
          val additionalValue = value.additionalProperties.getValue(key)
          check(key !in setOf("model")) { "MessagesFallbackParam additionalProperties key '" + key + "' collides with a fixed property" }
          put(key, additionalValue)
        }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

private fun copyAndValidateMessagesFallbackParamAdditionalProperties(additionalProperties: Map<String, JsonElement>): Map<String, JsonElement> {
  val copied = additionalProperties.toMap()
  val collision = copied.keys.sorted().firstOrNull { key -> key in setOf("model") }
  require(collision == null) { "MessagesFallbackParam additionalProperties key '" + collision + "' collides with a fixed property" }
  return copied
}

public fun messagesFallbackParam(block: MessagesFallbackParam.Builder.() -> Unit): MessagesFallbackParam = MessagesFallbackParam.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MessagesFallbackParam is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
