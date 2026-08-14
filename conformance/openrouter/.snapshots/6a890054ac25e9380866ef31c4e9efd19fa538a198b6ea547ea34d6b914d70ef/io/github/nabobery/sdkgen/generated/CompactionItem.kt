package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CompactionItem
 */
@Serializable(with = CompactionItem.Serializer::class)
public class CompactionItem(
  public val encryptedContent: String,
  public val type: InlineCompactionItemTypeX8d84b8a3,
  public val id: String? = null,
  additionalProperties: Map<String, JsonElement> = emptyMap(),
) {
  /**
   * Additional JSON object members not declared as fixed properties.
   */
  public val additionalProperties: Map<String, JsonElement> =
      copyAndValidateCompactionItemAdditionalProperties(additionalProperties)

  public class Builder {
    private var encryptedContentValue: String? = null

    public var encryptedContent: String
      get() = requireNotNull(encryptedContentValue) { "encryptedContent is required" }
      set(`value`) {
        encryptedContentValue = value
      }

    private var typeValue: InlineCompactionItemTypeX8d84b8a3? = null

    public var type: InlineCompactionItemTypeX8d84b8a3
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var id: String? = null

    private var additionalPropertiesValue: Map<String, JsonElement> = emptyMap()

    /**
     * Additional JSON object members not declared as fixed properties.
     */
    public var additionalProperties: Map<String, JsonElement>
      get() = additionalPropertiesValue.toMap()
      set(`value`) {
        additionalPropertiesValue = value.toMap()
      }

    public fun build(): CompactionItem {
      check(encryptedContentValue != null) { "encryptedContent is required" }
      check(typeValue != null) { "type is required" }
      return CompactionItem(
        encryptedContent = encryptedContent,
        type = type,
        id = id,
        additionalProperties = additionalProperties,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CompactionItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CompactionItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CompactionItem {
      val jsonDecoder = decoder.requireJsonDecoder("CompactionItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CompactionItem must be a JSON object")
      val encryptedContent = json.decodeRequired<String>(rawObject, "encrypted_content")
      val type = json.decodeRequired<InlineCompactionItemTypeX8d84b8a3>(rawObject, "type")
      return CompactionItem(
        encryptedContent = encryptedContent,
        type = type,
        id = rawObject["id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        additionalProperties = rawObject.filterKeys { key -> key !in setOf("encrypted_content", "id", "type") }.mapValues { (_, element) -> element }.toMap(),
      )
    }

    override fun serialize(encoder: Encoder, `value`: CompactionItem) {
      val jsonEncoder = encoder.requireJsonEncoder("CompactionItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("encrypted_content", value.encryptedContent)
        put("type", json.encodeToJsonElement(value.type))
        value.id?.let { put("id", it) }
        value.additionalProperties.keys.sorted().forEach { key ->
          val additionalValue = value.additionalProperties.getValue(key)
          check(key !in setOf("encrypted_content", "id", "type")) { "CompactionItem additionalProperties key '" + key + "' collides with a fixed property" }
          put(key, additionalValue)
        }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

private fun copyAndValidateCompactionItemAdditionalProperties(additionalProperties: Map<String, JsonElement>): Map<String, JsonElement> {
  val copied = additionalProperties.toMap()
  val collision = copied.keys.sorted().firstOrNull { key -> key in setOf("encrypted_content", "id", "type") }
  require(collision == null) { "CompactionItem additionalProperties key '" + collision + "' collides with a fixed property" }
  return copied
}

public fun compactionItem(block: CompactionItem.Builder.() -> Unit): CompactionItem = CompactionItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CompactionItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
