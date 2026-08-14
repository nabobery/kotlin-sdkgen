package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/GenerationContentData/properties/input/anyOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/GenerationContentData/properties/input/anyOf/1
 */
@Serializable(with = InlineGenerationContentDataInputAnyOf2X2136db71.Serializer::class)
public class InlineGenerationContentDataInputAnyOf2X2136db71(
  messages: List<JsonElement?>,
) {
  public val messages: List<JsonElement?> = messages.toList()

  public class Builder {
    private var messagesValue: List<JsonElement?>? = null

    public var messages: List<JsonElement?>
      get() = requireNotNull(messagesValue) { "messages is required" }.toList()
      set(`value`) {
        messagesValue = value.toList()
      }

    public fun build(): InlineGenerationContentDataInputAnyOf2X2136db71 {
      check(messagesValue != null) { "messages is required" }
      return InlineGenerationContentDataInputAnyOf2X2136db71(
        messages = messages,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGenerationContentDataInputAnyOf2X2136db71 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineGenerationContentDataInputAnyOf2X2136db71> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGenerationContentDataInputAnyOf2X2136db71 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGenerationContentDataInputAnyOf2X2136db71")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGenerationContentDataInputAnyOf2X2136db71 must be a JSON object")
      val messages = json.decodeRequired<List<JsonElement?>>(rawObject, "messages")
      return InlineGenerationContentDataInputAnyOf2X2136db71(
        messages = messages,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGenerationContentDataInputAnyOf2X2136db71) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGenerationContentDataInputAnyOf2X2136db71")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("messages", json.encodeToJsonElement(value.messages))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineGenerationContentDataInputAnyOf2X2136db71(block: InlineGenerationContentDataInputAnyOf2X2136db71.Builder.() -> Unit): InlineGenerationContentDataInputAnyOf2X2136db71 = InlineGenerationContentDataInputAnyOf2X2136db71.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineGenerationContentDataInputAnyOf2X2136db71 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
