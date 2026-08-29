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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatRequest/properties/reasoning
 */
@Serializable(with = InlineChatRequestReasoningX1ef1b361.Serializer::class)
public class InlineChatRequestReasoningX1ef1b361(
  /**
   * Constrains effort on reasoning for reasoning models
   */
  public val effort: InlineChatRequestReasoningEffortX13ba2bc5? = null,
  public val summary: ChatReasoningSummaryVerbosityEnum? = null,
) {
  public class Builder {
    /**
     * Constrains effort on reasoning for reasoning models
     */
    public var effort: InlineChatRequestReasoningEffortX13ba2bc5? = null

    public var summary: ChatReasoningSummaryVerbosityEnum? = null

    public fun build(): InlineChatRequestReasoningX1ef1b361 = InlineChatRequestReasoningX1ef1b361(
      effort = effort,
      summary = summary,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineChatRequestReasoningX1ef1b361 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineChatRequestReasoningX1ef1b361> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChatRequestReasoningX1ef1b361 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChatRequestReasoningX1ef1b361")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineChatRequestReasoningX1ef1b361 must be a JSON object")
      return InlineChatRequestReasoningX1ef1b361(
        effort = rawObject["effort"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineChatRequestReasoningEffortX13ba2bc5?>(element) },
        summary = rawObject["summary"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<ChatReasoningSummaryVerbosityEnum?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineChatRequestReasoningX1ef1b361) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineChatRequestReasoningX1ef1b361")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.effort?.let { put("effort", json.encodeToJsonElement(it)) }
        value.summary?.let { put("summary", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineChatRequestReasoningX1ef1b361(block: InlineChatRequestReasoningX1ef1b361.Builder.() -> Unit): InlineChatRequestReasoningX1ef1b361 = InlineChatRequestReasoningX1ef1b361.build(block)
