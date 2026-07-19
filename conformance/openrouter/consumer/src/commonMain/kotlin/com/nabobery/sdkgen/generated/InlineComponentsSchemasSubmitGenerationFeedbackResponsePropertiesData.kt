package com.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/SubmitGenerationFeedbackResponse/properties/data.
 */
@Serializable(with = InlineComponentsSchemasSubmitGenerationFeedbackResponsePropertiesData.Serializer::class)
public class InlineComponentsSchemasSubmitGenerationFeedbackResponsePropertiesData(
  /**
   * Whether the feedback was recorded
   */
  public val success: Boolean,
) {
  public class Builder {
    private var successValue: Boolean? = null

    public var success: Boolean
      get() = requireNotNull(successValue) { "success is required" }
      set(`value`) {
        successValue = value
      }

    public fun build(): InlineComponentsSchemasSubmitGenerationFeedbackResponsePropertiesData {
      check(successValue != null) { "success is required" }
      return InlineComponentsSchemasSubmitGenerationFeedbackResponsePropertiesData(
        success = success,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasSubmitGenerationFeedbackResponsePropertiesData = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasSubmitGenerationFeedbackResponsePropertiesData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasSubmitGenerationFeedbackResponsePropertiesData {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasSubmitGenerationFeedbackResponsePropertiesData")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasSubmitGenerationFeedbackResponsePropertiesData must be a " +
          "JSON object")
      val success = json.decodeRequired<Boolean>(raw, "success")
      return InlineComponentsSchemasSubmitGenerationFeedbackResponsePropertiesData(
        success = success,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasSubmitGenerationFeedbackResponsePropertiesData) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasSubmitGenerationFeedbackResponsePropertiesData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("success", json.encodeToJsonElement(value.success))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasSubmitGenerationFeedbackResponsePropertiesData(block: InlineComponentsSchemasSubmitGenerationFeedbackResponsePropertiesData.Builder.() -> Unit): InlineComponentsSchemasSubmitGenerationFeedbackResponsePropertiesData = InlineComponentsSchemasSubmitGenerationFeedbackResponsePropertiesData.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasSubmitGenerationFeedbackResponsePropertiesData is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
