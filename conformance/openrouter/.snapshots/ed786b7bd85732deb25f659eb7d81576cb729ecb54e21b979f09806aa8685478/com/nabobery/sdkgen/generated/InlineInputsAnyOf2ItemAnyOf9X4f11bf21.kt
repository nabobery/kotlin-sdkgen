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
 * An output item containing reasoning
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/Inputs/anyOf/1/items/anyOf/8
 */
@Serializable(with = InlineInputsAnyOf2ItemAnyOf9X4f11bf21.Serializer::class)
public class InlineInputsAnyOf2ItemAnyOf9X4f11bf21(
  public val id: String,
  summary: List<ReasoningSummaryText>,
  public val type: InlineOutputItemReasoningTypeX9f535a4f,
  content: List<ReasoningTextContent>? = null,
  public val encryptedContent: String? = null,
  public val format: ReasoningFormat? = null,
  /**
   * A signature for the reasoning content, used for verification
   */
  public val signature: String? = null,
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

    public var format: ReasoningFormat? = null

    /**
     * A signature for the reasoning content, used for verification
     */
    public var signature: String? = null

    public var status: InlineOutputItemReasoningStatusX42585cdd? = null

    public fun build(): InlineInputsAnyOf2ItemAnyOf9X4f11bf21 {
      check(idValue != null) { "id is required" }
      check(summaryValue != null) { "summary is required" }
      check(typeValue != null) { "type is required" }
      return InlineInputsAnyOf2ItemAnyOf9X4f11bf21(
        id = id,
        summary = summary,
        type = type,
        content = content,
        encryptedContent = encryptedContent,
        format = format,
        signature = signature,
        status = status,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineInputsAnyOf2ItemAnyOf9X4f11bf21 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineInputsAnyOf2ItemAnyOf9X4f11bf21> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInputsAnyOf2ItemAnyOf9X4f11bf21 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInputsAnyOf2ItemAnyOf9X4f11bf21")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineInputsAnyOf2ItemAnyOf9X4f11bf21 must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      val summary = json.decodeRequired<List<ReasoningSummaryText>>(rawObject, "summary")
      val type = json.decodeRequired<InlineOutputItemReasoningTypeX9f535a4f>(rawObject, "type")
      return InlineInputsAnyOf2ItemAnyOf9X4f11bf21(
        id = id,
        summary = summary,
        type = type,
        content = rawObject["content"]?.let { json.decodeFromJsonElement<List<ReasoningTextContent>>(it) },
        encryptedContent = rawObject["encrypted_content"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        format = rawObject["format"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<ReasoningFormat?>(element) },
        signature = rawObject["signature"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        status = rawObject["status"]?.let { json.decodeFromJsonElement<InlineOutputItemReasoningStatusX42585cdd>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineInputsAnyOf2ItemAnyOf9X4f11bf21) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineInputsAnyOf2ItemAnyOf9X4f11bf21")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        put("summary", json.encodeToJsonElement(value.summary))
        put("type", json.encodeToJsonElement(value.type))
        value.content?.let { put("content", json.encodeToJsonElement(it)) }
        value.encryptedContent?.let { put("encrypted_content", it) }
        value.format?.let { put("format", json.encodeToJsonElement(it)) }
        value.signature?.let { put("signature", it) }
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineInputsAnyOf2ItemAnyOf9X4f11bf21(block: InlineInputsAnyOf2ItemAnyOf9X4f11bf21.Builder.() -> Unit): InlineInputsAnyOf2ItemAnyOf9X4f11bf21 = InlineInputsAnyOf2ItemAnyOf9X4f11bf21.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineInputsAnyOf2ItemAnyOf9X4f11bf21 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
