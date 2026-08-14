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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicMessageUsageIteration/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicMessageUsageIteration/allOf/1
 */
@Serializable(with = InlineAnthropicMessageUsageIterationAllOf2X3a71a28b.Serializer::class)
public class InlineAnthropicMessageUsageIterationAllOf2X3a71a28b(
  public val type: InlineAnthropicMessageUsageIterationAllOf2TypeXd80ac718,
  public val model: String? = null,
) {
  public class Builder {
    private var typeValue: InlineAnthropicMessageUsageIterationAllOf2TypeXd80ac718? = null

    public var type: InlineAnthropicMessageUsageIterationAllOf2TypeXd80ac718
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var model: String? = null

    public fun build(): InlineAnthropicMessageUsageIterationAllOf2X3a71a28b {
      check(typeValue != null) { "type is required" }
      return InlineAnthropicMessageUsageIterationAllOf2X3a71a28b(
        type = type,
        model = model,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAnthropicMessageUsageIterationAllOf2X3a71a28b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAnthropicMessageUsageIterationAllOf2X3a71a28b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAnthropicMessageUsageIterationAllOf2X3a71a28b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAnthropicMessageUsageIterationAllOf2X3a71a28b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAnthropicMessageUsageIterationAllOf2X3a71a28b must be a JSON object")
      val type = json.decodeRequired<InlineAnthropicMessageUsageIterationAllOf2TypeXd80ac718>(rawObject, "type")
      return InlineAnthropicMessageUsageIterationAllOf2X3a71a28b(
        type = type,
        model = rawObject["model"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicMessageUsageIterationAllOf2X3a71a28b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAnthropicMessageUsageIterationAllOf2X3a71a28b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.model?.let { put("model", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAnthropicMessageUsageIterationAllOf2X3a71a28b(block: InlineAnthropicMessageUsageIterationAllOf2X3a71a28b.Builder.() -> Unit): InlineAnthropicMessageUsageIterationAllOf2X3a71a28b = InlineAnthropicMessageUsageIterationAllOf2X3a71a28b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineAnthropicMessageUsageIterationAllOf2X3a71a28b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
