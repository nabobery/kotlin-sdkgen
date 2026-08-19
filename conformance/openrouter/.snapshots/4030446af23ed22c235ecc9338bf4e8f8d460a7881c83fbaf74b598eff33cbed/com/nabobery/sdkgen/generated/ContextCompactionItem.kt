package com.nabobery.sdkgen.generated

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
 * A context compaction marker with an optional encrypted summary
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ContextCompactionItem
 */
@Serializable(with = ContextCompactionItem.Serializer::class)
public class ContextCompactionItem(
  public val type: InlineContextCompactionItemTypeXd4ac5c3e,
  public val encryptedContent: String? = null,
  public val id: String? = null,
  additionalProperties: Map<String, JsonElement> = emptyMap(),
) {
  /**
   * Additional JSON object members not declared as fixed properties.
   */
  public val additionalProperties: Map<String, JsonElement> =
      copyAndValidateContextCompactionItemAdditionalProperties(additionalProperties)

  public class Builder {
    private var typeValue: InlineContextCompactionItemTypeXd4ac5c3e? = null

    public var type: InlineContextCompactionItemTypeXd4ac5c3e
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var encryptedContent: String? = null

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

    public fun build(): ContextCompactionItem {
      check(typeValue != null) { "type is required" }
      return ContextCompactionItem(
        type = type,
        encryptedContent = encryptedContent,
        id = id,
        additionalProperties = additionalProperties,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ContextCompactionItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ContextCompactionItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ContextCompactionItem {
      val jsonDecoder = decoder.requireJsonDecoder("ContextCompactionItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ContextCompactionItem must be a JSON object")
      val type = json.decodeRequired<InlineContextCompactionItemTypeXd4ac5c3e>(rawObject, "type")
      return ContextCompactionItem(
        type = type,
        encryptedContent = rawObject["encrypted_content"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        id = rawObject["id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        additionalProperties = rawObject.filterKeys { key -> key !in setOf("encrypted_content", "id", "type") }.mapValues { (_, element) -> element }.toMap(),
      )
    }

    override fun serialize(encoder: Encoder, `value`: ContextCompactionItem) {
      val jsonEncoder = encoder.requireJsonEncoder("ContextCompactionItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.encryptedContent?.let { put("encrypted_content", it) }
        value.id?.let { put("id", it) }
        value.additionalProperties.keys.sorted().forEach { key ->
          val additionalValue = value.additionalProperties.getValue(key)
          check(key !in setOf("encrypted_content", "id", "type")) { "ContextCompactionItem additionalProperties key '" + key + "' collides with a fixed property" }
          put(key, additionalValue)
        }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

private fun copyAndValidateContextCompactionItemAdditionalProperties(additionalProperties: Map<String, JsonElement>): Map<String, JsonElement> {
  val copied = additionalProperties.toMap()
  val collision = copied.keys.sorted().firstOrNull { key -> key in setOf("encrypted_content", "id", "type") }
  require(collision == null) { "ContextCompactionItem additionalProperties key '" + collision + "' collides with a fixed property" }
  return copied
}

public fun contextCompactionItem(block: ContextCompactionItem.Builder.() -> Unit): ContextCompactionItem = ContextCompactionItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ContextCompactionItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
