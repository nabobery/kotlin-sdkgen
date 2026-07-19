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
 * Confirmation that the feedback was recorded
 */
@Serializable(with = SubmitGenerationFeedbackResponse.Serializer::class)
public class SubmitGenerationFeedbackResponse(
  public val `data`: InlineComponentsSchemasSubmitGenerationFeedbackResponsePropertiesData,
) {
  public class Builder {
    private var dataValue: InlineComponentsSchemasSubmitGenerationFeedbackResponsePropertiesData? =
        null

    public var `data`: InlineComponentsSchemasSubmitGenerationFeedbackResponsePropertiesData
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    public fun build(): SubmitGenerationFeedbackResponse {
      check(dataValue != null) { "data is required" }
      return SubmitGenerationFeedbackResponse(
        data = data,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubmitGenerationFeedbackResponse = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SubmitGenerationFeedbackResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubmitGenerationFeedbackResponse {
      val jsonDecoder = decoder.requireJsonDecoder("SubmitGenerationFeedbackResponse")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("SubmitGenerationFeedbackResponse must be a JSON object")
      val data = json.decodeRequired<InlineComponentsSchemasSubmitGenerationFeedbackResponsePropertiesData>(raw, "data")
      return SubmitGenerationFeedbackResponse(
        data = data,
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubmitGenerationFeedbackResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("SubmitGenerationFeedbackResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun submitGenerationFeedbackResponse(block: SubmitGenerationFeedbackResponse.Builder.() ->
  Unit): SubmitGenerationFeedbackResponse = SubmitGenerationFeedbackResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("SubmitGenerationFeedbackResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
