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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Static predicted output content. Supported models can use this to reduce latency when much of the response is known
 * in advance.
 */
@Serializable(with = Prediction.Serializer::class)
public class Prediction(
  public val content: InlineComponentsSchemasPredictionPropertiesContent,
  public val type: InlineComponentsSchemasPredictionPropertiesType,
) {
  public class Builder {
    private var contentValue: InlineComponentsSchemasPredictionPropertiesContent? = null

    public var content: InlineComponentsSchemasPredictionPropertiesContent
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    private var typeValue: InlineComponentsSchemasPredictionPropertiesType? = null

    public var type: InlineComponentsSchemasPredictionPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): Prediction {
      check(contentValue != null) { "content is required" }
      check(typeValue != null) { "type is required" }
      return Prediction(
        content = content,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Prediction = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Prediction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Prediction {
      val jsonDecoder = decoder.requireJsonDecoder("Prediction")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("Prediction must be a JSON object")
      val content = json.decodeRequired<InlineComponentsSchemasPredictionPropertiesContent>(raw, "content")
      val type = json.decodeRequired<InlineComponentsSchemasPredictionPropertiesType>(raw, "type")
      return Prediction(
        content = content,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: Prediction) {
      val jsonEncoder = encoder.requireJsonEncoder("Prediction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", json.encodeToJsonElement(value.content))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun prediction(block: Prediction.Builder.() -> Unit): Prediction = Prediction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Prediction is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
