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
 * Reasoning detail text schema
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ReasoningDetailText
 */
@Serializable(with = ReasoningDetailText.Serializer::class)
public class ReasoningDetailText(
  public val type: InlineReasoningDetailTextTypeXff13c316,
  public val format: ReasoningFormat? = null,
  public val id: String? = null,
  public val index: Int? = null,
  public val signature: String? = null,
  public val text: String? = null,
) {
  public class Builder {
    private var typeValue: InlineReasoningDetailTextTypeXff13c316? = null

    public var type: InlineReasoningDetailTextTypeXff13c316
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var format: ReasoningFormat? = null

    public var id: String? = null

    public var index: Int? = null

    public var signature: String? = null

    public var text: String? = null

    public fun build(): ReasoningDetailText {
      check(typeValue != null) { "type is required" }
      return ReasoningDetailText(
        type = type,
        format = format,
        id = id,
        index = index,
        signature = signature,
        text = text,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ReasoningDetailText = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ReasoningDetailText> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ReasoningDetailText {
      val jsonDecoder = decoder.requireJsonDecoder("ReasoningDetailText")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ReasoningDetailText must be a JSON object")
      val type = json.decodeRequired<InlineReasoningDetailTextTypeXff13c316>(rawObject, "type")
      return ReasoningDetailText(
        type = type,
        format = rawObject["format"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<ReasoningFormat?>(element) },
        id = rawObject["id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        index = rawObject["index"]?.let { json.decodeFromJsonElement<Int>(it) },
        signature = rawObject["signature"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        text = rawObject["text"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ReasoningDetailText) {
      val jsonEncoder = encoder.requireJsonEncoder("ReasoningDetailText")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.format?.let { put("format", json.encodeToJsonElement(it)) }
        value.id?.let { put("id", it) }
        value.index?.let { put("index", json.encodeToJsonElement(it)) }
        value.signature?.let { put("signature", it) }
        value.text?.let { put("text", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun reasoningDetailText(block: ReasoningDetailText.Builder.() -> Unit): ReasoningDetailText = ReasoningDetailText.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ReasoningDetailText is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
