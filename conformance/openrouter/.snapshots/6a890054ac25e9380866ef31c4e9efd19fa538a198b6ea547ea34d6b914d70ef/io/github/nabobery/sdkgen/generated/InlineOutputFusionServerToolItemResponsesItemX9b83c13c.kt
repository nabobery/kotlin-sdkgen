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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/OutputFusionServerToolItem/properties/responses/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputFusionServerToolItem/properties/responses/items
 */
@Serializable(with = InlineOutputFusionServerToolItemResponsesItemX9b83c13c.Serializer::class)
public class InlineOutputFusionServerToolItemResponsesItemX9b83c13c(
  public val model: String,
  public val content: String? = null,
) {
  public class Builder {
    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    public var content: String? = null

    public fun build(): InlineOutputFusionServerToolItemResponsesItemX9b83c13c {
      check(modelValue != null) { "model is required" }
      return InlineOutputFusionServerToolItemResponsesItemX9b83c13c(
        model = model,
        content = content,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOutputFusionServerToolItemResponsesItemX9b83c13c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOutputFusionServerToolItemResponsesItemX9b83c13c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOutputFusionServerToolItemResponsesItemX9b83c13c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOutputFusionServerToolItemResponsesItemX9b83c13c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOutputFusionServerToolItemResponsesItemX9b83c13c must be a JSON object")
      val model = json.decodeRequired<String>(rawObject, "model")
      return InlineOutputFusionServerToolItemResponsesItemX9b83c13c(
        model = model,
        content = rawObject["content"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOutputFusionServerToolItemResponsesItemX9b83c13c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOutputFusionServerToolItemResponsesItemX9b83c13c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("model", value.model)
        value.content?.let { put("content", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOutputFusionServerToolItemResponsesItemX9b83c13c(block: InlineOutputFusionServerToolItemResponsesItemX9b83c13c.Builder.() -> Unit): InlineOutputFusionServerToolItemResponsesItemX9b83c13c = InlineOutputFusionServerToolItemResponsesItemX9b83c13c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOutputFusionServerToolItemResponsesItemX9b83c13c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
