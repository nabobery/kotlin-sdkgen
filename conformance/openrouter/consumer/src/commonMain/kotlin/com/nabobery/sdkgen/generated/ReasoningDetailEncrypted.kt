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
 * Reasoning detail encrypted schema
 */
@Serializable(with = ReasoningDetailEncrypted.Serializer::class)
public class ReasoningDetailEncrypted(
  public val `data`: String,
  public val type: InlineComponentsSchemasReasoningDetailEncryptedPropertiesType,
  public val format: ReasoningFormat? = null,
  public val id: String? = null,
  public val index: Int? = null,
) {
  public class Builder {
    private var dataValue: String? = null

    public var `data`: String
      get() = requireNotNull(dataValue) { "data is required" }
      set(`value`) {
        dataValue = value
      }

    private var typeValue: InlineComponentsSchemasReasoningDetailEncryptedPropertiesType? = null

    public var type: InlineComponentsSchemasReasoningDetailEncryptedPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var format: ReasoningFormat? = null

    public var id: String? = null

    public var index: Int? = null

    public fun build(): ReasoningDetailEncrypted {
      check(dataValue != null) { "data is required" }
      check(typeValue != null) { "type is required" }
      return ReasoningDetailEncrypted(
        data = data,
        type = type,
        format = format,
        id = id,
        index = index,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ReasoningDetailEncrypted = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ReasoningDetailEncrypted> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ReasoningDetailEncrypted {
      val jsonDecoder = decoder.requireJsonDecoder("ReasoningDetailEncrypted")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ReasoningDetailEncrypted must be a JSON object")
      val data = json.decodeRequired<String>(raw, "data")
      val type = json.decodeRequired<InlineComponentsSchemasReasoningDetailEncryptedPropertiesType>(raw, "type")
      return ReasoningDetailEncrypted(
        data = data,
        type = type,
        format = raw["format"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<ReasoningFormat?>(element) },
        id = raw["id"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        index = raw["index"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ReasoningDetailEncrypted) {
      val jsonEncoder = encoder.requireJsonEncoder("ReasoningDetailEncrypted")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", value.data)
        put("type", json.encodeToJsonElement(value.type))
        value.format?.let { put("format", json.encodeToJsonElement(it)) }
        value.id?.let { put("id", it) }
        value.index?.let { put("index", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun reasoningDetailEncrypted(block: ReasoningDetailEncrypted.Builder.() -> Unit): ReasoningDetailEncrypted =
  ReasoningDetailEncrypted.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ReasoningDetailEncrypted is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
