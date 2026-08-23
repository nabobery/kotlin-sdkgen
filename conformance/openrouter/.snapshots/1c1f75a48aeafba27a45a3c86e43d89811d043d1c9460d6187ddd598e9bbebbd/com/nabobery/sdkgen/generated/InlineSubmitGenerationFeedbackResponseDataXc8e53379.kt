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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/SubmitGenerationFeedbackResponse/properties/data
 */
@Serializable(with = InlineSubmitGenerationFeedbackResponseDataXc8e53379.Serializer::class)
public class InlineSubmitGenerationFeedbackResponseDataXc8e53379(
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

    public fun build(): InlineSubmitGenerationFeedbackResponseDataXc8e53379 {
      check(successValue != null) { "success is required" }
      return InlineSubmitGenerationFeedbackResponseDataXc8e53379(
        success = success,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineSubmitGenerationFeedbackResponseDataXc8e53379 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineSubmitGenerationFeedbackResponseDataXc8e53379> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubmitGenerationFeedbackResponseDataXc8e53379 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubmitGenerationFeedbackResponseDataXc8e53379")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineSubmitGenerationFeedbackResponseDataXc8e53379 must be a JSON object")
      val success = json.decodeRequired<Boolean>(rawObject, "success")
      return InlineSubmitGenerationFeedbackResponseDataXc8e53379(
        success = success,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubmitGenerationFeedbackResponseDataXc8e53379) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineSubmitGenerationFeedbackResponseDataXc8e53379")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("success", json.encodeToJsonElement(value.success))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineSubmitGenerationFeedbackResponseDataXc8e53379(block: InlineSubmitGenerationFeedbackResponseDataXc8e53379.Builder.() -> Unit): InlineSubmitGenerationFeedbackResponseDataXc8e53379 = InlineSubmitGenerationFeedbackResponseDataXc8e53379.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineSubmitGenerationFeedbackResponseDataXc8e53379 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
