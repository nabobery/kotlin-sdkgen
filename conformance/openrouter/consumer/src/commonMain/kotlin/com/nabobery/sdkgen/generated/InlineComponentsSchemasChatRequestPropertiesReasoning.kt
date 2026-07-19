package com.nabobery.sdkgen.generated

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Configuration options for reasoning models
 */
@Serializable(with = InlineComponentsSchemasChatRequestPropertiesReasoning.Serializer::class)
public class InlineComponentsSchemasChatRequestPropertiesReasoning(
  /**
   * Constrains effort on reasoning for reasoning models
   */
  public val effort: InlineComponentsSchemasChatRequestPropertiesReasoningPropertiesEffort? = null,
  public val summary: ChatReasoningSummaryVerbosityEnum? = null,
) {
  public class Builder {
    /**
     * Constrains effort on reasoning for reasoning models
     */
    public var effort: InlineComponentsSchemasChatRequestPropertiesReasoningPropertiesEffort? = null

    public var summary: ChatReasoningSummaryVerbosityEnum? = null

    public fun build(): InlineComponentsSchemasChatRequestPropertiesReasoning =
      InlineComponentsSchemasChatRequestPropertiesReasoning(
      effort = effort,
      summary = summary,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasChatRequestPropertiesReasoning = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatRequestPropertiesReasoning> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatRequestPropertiesReasoning {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasChatRequestPropertiesReasoning")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasChatRequestPropertiesReasoning must be a JSON object")
      return InlineComponentsSchemasChatRequestPropertiesReasoning(
        effort = raw["effort"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<InlineComponentsSchemasChatRequestPropertiesReasoningPropertiesEffort?>(element) },
        summary = raw["summary"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<ChatReasoningSummaryVerbosityEnum?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatRequestPropertiesReasoning) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasChatRequestPropertiesReasoning")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.effort?.let { put("effort", json.encodeToJsonElement(it)) }
        value.summary?.let { put("summary", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasChatRequestPropertiesReasoning(block: InlineComponentsSchemasChatRequestPropertiesReasoning.Builder.() -> Unit): InlineComponentsSchemasChatRequestPropertiesReasoning = InlineComponentsSchemasChatRequestPropertiesReasoning.build(block)
