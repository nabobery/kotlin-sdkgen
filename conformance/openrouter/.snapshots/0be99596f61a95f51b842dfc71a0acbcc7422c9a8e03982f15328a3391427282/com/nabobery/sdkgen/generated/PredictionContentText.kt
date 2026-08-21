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
 * Text content part for a predicted output.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/PredictionContentText
 */
@Serializable(with = PredictionContentText.Serializer::class)
public class PredictionContentText(
  public val text: String,
  public val type: InlinePredictionContentTextTypeX2b4f025c,
) {
  public class Builder {
    private var textValue: String? = null

    public var text: String
      get() = requireNotNull(textValue) { "text is required" }
      set(`value`) {
        textValue = value
      }

    private var typeValue: InlinePredictionContentTextTypeX2b4f025c? = null

    public var type: InlinePredictionContentTextTypeX2b4f025c
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): PredictionContentText {
      check(textValue != null) { "text is required" }
      check(typeValue != null) { "type is required" }
      return PredictionContentText(
        text = text,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PredictionContentText = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PredictionContentText> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PredictionContentText {
      val jsonDecoder = decoder.requireJsonDecoder("PredictionContentText")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PredictionContentText must be a JSON object")
      val text = json.decodeRequired<String>(rawObject, "text")
      val type = json.decodeRequired<InlinePredictionContentTextTypeX2b4f025c>(rawObject, "type")
      return PredictionContentText(
        text = text,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PredictionContentText) {
      val jsonEncoder = encoder.requireJsonEncoder("PredictionContentText")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("text", value.text)
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun predictionContentText(block: PredictionContentText.Builder.() -> Unit): PredictionContentText = PredictionContentText.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PredictionContentText is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
