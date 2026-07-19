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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A context compaction marker with encrypted summary
 */
@Serializable(with = CompactionItem.Serializer::class)
public class CompactionItem(
  public val encryptedContent: String,
  public val type: InlineComponentsSchemasCompactionItemPropertiesType,
  public val id: String? = null,
) {
  public class Builder {
    private var encryptedContentValue: String? = null

    public var encryptedContent: String
      get() = requireNotNull(encryptedContentValue) { "encryptedContent is required" }
      set(`value`) {
        encryptedContentValue = value
      }

    private var typeValue: InlineComponentsSchemasCompactionItemPropertiesType? = null

    public var type: InlineComponentsSchemasCompactionItemPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var id: String? = null

    public fun build(): CompactionItem {
      check(encryptedContentValue != null) { "encryptedContent is required" }
      check(typeValue != null) { "type is required" }
      return CompactionItem(
        encryptedContent = encryptedContent,
        type = type,
        id = id,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CompactionItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CompactionItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CompactionItem {
      val jsonDecoder = decoder.requireJsonDecoder("CompactionItem")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("CompactionItem must be a JSON object")
      val encryptedContent = json.decodeRequired<String>(raw, "encrypted_content")
      val type = json.decodeRequired<InlineComponentsSchemasCompactionItemPropertiesType>(raw, "type")
      return CompactionItem(
        encryptedContent = encryptedContent,
        type = type,
        id = raw["id"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CompactionItem) {
      val jsonEncoder = encoder.requireJsonEncoder("CompactionItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("encrypted_content", value.encryptedContent)
        put("type", json.encodeToJsonElement(value.type))
        value.id?.let { put("id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun compactionItem(block: CompactionItem.Builder.() -> Unit): CompactionItem = CompactionItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CompactionItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
