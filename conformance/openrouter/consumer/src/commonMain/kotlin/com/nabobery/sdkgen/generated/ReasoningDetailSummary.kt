package com.nabobery.sdkgen.generated

import kotlin.Int
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Reasoning detail summary schema
 */
@Serializable(with = ReasoningDetailSummary.Serializer::class)
public class ReasoningDetailSummary(
  public val summary: String,
  public val type: InlineComponentsSchemasReasoningDetailSummaryPropertiesType,
  public val format: ReasoningFormat? = null,
  public val id: String? = null,
  public val index: Int? = null,
) {
  public class Builder {
    private var summaryValue: String? = null

    public var summary: String
      get() = requireNotNull(summaryValue) { "summary is required" }
      set(`value`) {
        summaryValue = value
      }

    private var typeValue: InlineComponentsSchemasReasoningDetailSummaryPropertiesType? = null

    public var type: InlineComponentsSchemasReasoningDetailSummaryPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var format: ReasoningFormat? = null

    public var id: String? = null

    public var index: Int? = null

    public fun build(): ReasoningDetailSummary {
      check(summaryValue != null) { "summary is required" }
      check(typeValue != null) { "type is required" }
      return ReasoningDetailSummary(
        summary = summary,
        type = type,
        format = format,
        id = id,
        index = index,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ReasoningDetailSummary = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ReasoningDetailSummary> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ReasoningDetailSummary {
      val jsonDecoder = decoder.requireJsonDecoder("ReasoningDetailSummary")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ReasoningDetailSummary must be a JSON object")
      val summary = json.decodeRequired<String>(raw, "summary")
      val type = json.decodeRequired<InlineComponentsSchemasReasoningDetailSummaryPropertiesType>(raw, "type")
      return ReasoningDetailSummary(
        summary = summary,
        type = type,
        format = raw["format"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<ReasoningFormat?>(element) },
        id = raw["id"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        index = raw["index"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ReasoningDetailSummary) {
      val jsonEncoder = encoder.requireJsonEncoder("ReasoningDetailSummary")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("summary", value.summary)
        put("type", json.encodeToJsonElement(value.type))
        value.format?.let { put("format", json.encodeToJsonElement(it)) }
        value.id?.let { put("id", it) }
        value.index?.let { put("index", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun reasoningDetailSummary(block: ReasoningDetailSummary.Builder.() -> Unit): ReasoningDetailSummary =
  ReasoningDetailSummary.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ReasoningDetailSummary is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
