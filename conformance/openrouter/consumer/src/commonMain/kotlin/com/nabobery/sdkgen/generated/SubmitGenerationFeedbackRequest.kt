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
 * Structured feedback about a specific generation
 */
@Serializable(with = SubmitGenerationFeedbackRequest.Serializer::class)
public class SubmitGenerationFeedbackRequest(
  /**
   * The category of feedback being reported
   */
  public val category: InlineComponentsSchemasSubmitGenerationFeedbackRequestPropertiesCategory,
  /**
   * The generation to submit feedback on
   */
  public val generationId: String,
  /**
   * An optional free-text comment describing the feedback
   */
  public val comment: String? = null,
) {
  public class Builder {
    private var categoryValue:
        InlineComponentsSchemasSubmitGenerationFeedbackRequestPropertiesCategory? = null

    public var category: InlineComponentsSchemasSubmitGenerationFeedbackRequestPropertiesCategory
      get() = requireNotNull(categoryValue) { "category is required" }
      set(`value`) {
        categoryValue = value
      }

    private var generationIdValue: String? = null

    public var generationId: String
      get() = requireNotNull(generationIdValue) { "generationId is required" }
      set(`value`) {
        generationIdValue = value
      }

    /**
     * An optional free-text comment describing the feedback
     */
    public var comment: String? = null

    public fun build(): SubmitGenerationFeedbackRequest {
      check(categoryValue != null) { "category is required" }
      check(generationIdValue != null) { "generationId is required" }
      return SubmitGenerationFeedbackRequest(
        category = category,
        generationId = generationId,
        comment = comment,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubmitGenerationFeedbackRequest = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SubmitGenerationFeedbackRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubmitGenerationFeedbackRequest {
      val jsonDecoder = decoder.requireJsonDecoder("SubmitGenerationFeedbackRequest")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("SubmitGenerationFeedbackRequest must be a JSON object")
      val category = json.decodeRequired<InlineComponentsSchemasSubmitGenerationFeedbackRequestPropertiesCategory>(raw,
        "category")
      val generationId = json.decodeRequired<String>(raw, "generation_id")
      return SubmitGenerationFeedbackRequest(
        category = category,
        generationId = generationId,
        comment = raw["comment"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubmitGenerationFeedbackRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("SubmitGenerationFeedbackRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("category", json.encodeToJsonElement(value.category))
        put("generation_id", value.generationId)
        value.comment?.let { put("comment", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun submitGenerationFeedbackRequest(block: SubmitGenerationFeedbackRequest.Builder.() ->
  Unit): SubmitGenerationFeedbackRequest = SubmitGenerationFeedbackRequest.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("SubmitGenerationFeedbackRequest is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
