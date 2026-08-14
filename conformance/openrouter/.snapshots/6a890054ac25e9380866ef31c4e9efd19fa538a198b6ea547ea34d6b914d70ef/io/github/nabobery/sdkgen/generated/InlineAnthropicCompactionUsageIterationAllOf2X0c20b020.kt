package io.github.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicCompactionUsageIteration/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCompactionUsageIteration/allOf/1
 */
@Serializable(with = InlineAnthropicCompactionUsageIterationAllOf2X0c20b020.Serializer::class)
public class InlineAnthropicCompactionUsageIterationAllOf2X0c20b020(
  public val type: InlineAnthropicCompactionUsageIterationAllOf2TypeX1871f76a,
) {
  public class Builder {
    private var typeValue: InlineAnthropicCompactionUsageIterationAllOf2TypeX1871f76a? = null

    public var type: InlineAnthropicCompactionUsageIterationAllOf2TypeX1871f76a
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineAnthropicCompactionUsageIterationAllOf2X0c20b020 {
      check(typeValue != null) { "type is required" }
      return InlineAnthropicCompactionUsageIterationAllOf2X0c20b020(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAnthropicCompactionUsageIterationAllOf2X0c20b020 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAnthropicCompactionUsageIterationAllOf2X0c20b020> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAnthropicCompactionUsageIterationAllOf2X0c20b020 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAnthropicCompactionUsageIterationAllOf2X0c20b020")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAnthropicCompactionUsageIterationAllOf2X0c20b020 must be a JSON object")
      val type = json.decodeRequired<InlineAnthropicCompactionUsageIterationAllOf2TypeX1871f76a>(rawObject, "type")
      return InlineAnthropicCompactionUsageIterationAllOf2X0c20b020(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicCompactionUsageIterationAllOf2X0c20b020) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAnthropicCompactionUsageIterationAllOf2X0c20b020")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAnthropicCompactionUsageIterationAllOf2X0c20b020(block: InlineAnthropicCompactionUsageIterationAllOf2X0c20b020.Builder.() -> Unit): InlineAnthropicCompactionUsageIterationAllOf2X0c20b020 = InlineAnthropicCompactionUsageIterationAllOf2X0c20b020.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAnthropicCompactionUsageIterationAllOf2X0c20b020 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
