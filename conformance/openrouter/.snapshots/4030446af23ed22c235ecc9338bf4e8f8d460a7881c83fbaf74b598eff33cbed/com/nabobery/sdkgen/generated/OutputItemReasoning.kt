package com.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OutputItemReasoning.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputItemReasoning
 */
@Serializable(with = OutputItemReasoning.Serializer::class)
public class OutputItemReasoning(
  public val id: String,
  summary: List<ReasoningSummaryText>,
  public val type: InlineOutputItemReasoningTypeX9f535a4f,
  content: List<ReasoningTextContent>? = null,
  public val encryptedContent: String? = null,
  public val status: InlineOutputItemReasoningStatusX42585cdd? = null,
) {
  public val summary: List<ReasoningSummaryText> = summary.toList()

  public val content: List<ReasoningTextContent>? =
      content?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var summaryValue: List<ReasoningSummaryText>? = null

    public var summary: List<ReasoningSummaryText>
      get() = requireNotNull(summaryValue) { "summary is required" }.toList()
      set(`value`) {
        summaryValue = value.toList()
      }

    private var typeValue: InlineOutputItemReasoningTypeX9f535a4f? = null

    public var type: InlineOutputItemReasoningTypeX9f535a4f
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var contentValue: List<ReasoningTextContent>? = null

    public var content: List<ReasoningTextContent>?
      get() = contentValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        contentValue = value?.let { collection0 -> collection0.toList() }
      }

    public var encryptedContent: String? = null

    public var status: InlineOutputItemReasoningStatusX42585cdd? = null

    public fun build(): OutputItemReasoning {
      check(idValue != null) { "id is required" }
      check(summaryValue != null) { "summary is required" }
      check(typeValue != null) { "type is required" }
      return OutputItemReasoning(
        id = id,
        summary = summary,
        type = type,
        content = content,
        encryptedContent = encryptedContent,
        status = status,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputItemReasoning = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OutputItemReasoning> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputItemReasoning {
      val jsonDecoder = decoder.requireJsonDecoder("OutputItemReasoning")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OutputItemReasoning must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      val summary = json.decodeRequired<List<ReasoningSummaryText>>(rawObject, "summary")
      val type = json.decodeRequired<InlineOutputItemReasoningTypeX9f535a4f>(rawObject, "type")
      return OutputItemReasoning(
        id = id,
        summary = summary,
        type = type,
        content = rawObject["content"]?.let { json.decodeFromJsonElement<List<ReasoningTextContent>>(it) },
        encryptedContent = rawObject["encrypted_content"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        status = rawObject["status"]?.let { json.decodeFromJsonElement<InlineOutputItemReasoningStatusX42585cdd>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputItemReasoning) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputItemReasoning")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        put("summary", json.encodeToJsonElement(value.summary))
        put("type", json.encodeToJsonElement(value.type))
        value.content?.let { put("content", json.encodeToJsonElement(it)) }
        value.encryptedContent?.let { put("encrypted_content", it) }
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputItemReasoning(block: OutputItemReasoning.Builder.() -> Unit): OutputItemReasoning = OutputItemReasoning.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputItemReasoning is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
