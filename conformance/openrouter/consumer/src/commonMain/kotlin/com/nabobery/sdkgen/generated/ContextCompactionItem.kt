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
 * A context compaction marker with an optional encrypted summary
 */
@Serializable(with = ContextCompactionItem.Serializer::class)
public class ContextCompactionItem(
  public val type: InlineComponentsSchemasContextCompactionItemPropertiesType,
  public val encryptedContent: String? = null,
  public val id: String? = null,
) {
  public class Builder {
    private var typeValue: InlineComponentsSchemasContextCompactionItemPropertiesType? = null

    public var type: InlineComponentsSchemasContextCompactionItemPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var encryptedContent: String? = null

    public var id: String? = null

    public fun build(): ContextCompactionItem {
      check(typeValue != null) { "type is required" }
      return ContextCompactionItem(
        type = type,
        encryptedContent = encryptedContent,
        id = id,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ContextCompactionItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ContextCompactionItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ContextCompactionItem {
      val jsonDecoder = decoder.requireJsonDecoder("ContextCompactionItem")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ContextCompactionItem must be a JSON object")
      val type = json.decodeRequired<InlineComponentsSchemasContextCompactionItemPropertiesType>(raw, "type")
      return ContextCompactionItem(
        type = type,
        encryptedContent = raw["encrypted_content"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        id = raw["id"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ContextCompactionItem) {
      val jsonEncoder = encoder.requireJsonEncoder("ContextCompactionItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.encryptedContent?.let { put("encrypted_content", it) }
        value.id?.let { put("id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun contextCompactionItem(block: ContextCompactionItem.Builder.() -> Unit): ContextCompactionItem =
  ContextCompactionItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ContextCompactionItem is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
