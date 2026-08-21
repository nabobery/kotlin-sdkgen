package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/issue-search-result-item/properties/labels/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/issue-search-result-item/properties/labels/items
 */
@Serializable(with = InlineIssueSearchResultItemLabelsItemXa4bc3a16.Serializer::class)
public class InlineIssueSearchResultItemLabelsItemXa4bc3a16(
  public val color: String? = null,
  public val default: Boolean? = null,
  public val description: String? = null,
  public val id: Long? = null,
  public val name: String? = null,
  public val nodeId: String? = null,
  public val url: String? = null,
) {
  public class Builder {
    public var color: String? = null

    public var default: Boolean? = null

    public var description: String? = null

    public var id: Long? = null

    public var name: String? = null

    public var nodeId: String? = null

    public var url: String? = null

    public fun build(): InlineIssueSearchResultItemLabelsItemXa4bc3a16 = InlineIssueSearchResultItemLabelsItemXa4bc3a16(
      color = color,
      default = default,
      description = description,
      id = id,
      name = name,
      nodeId = nodeId,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineIssueSearchResultItemLabelsItemXa4bc3a16 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineIssueSearchResultItemLabelsItemXa4bc3a16> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssueSearchResultItemLabelsItemXa4bc3a16 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssueSearchResultItemLabelsItemXa4bc3a16")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineIssueSearchResultItemLabelsItemXa4bc3a16 must be a JSON object")
      return InlineIssueSearchResultItemLabelsItemXa4bc3a16(
        color = rawObject["color"]?.let { json.decodeFromJsonElement<String>(it) },
        default = rawObject["default"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Long>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssueSearchResultItemLabelsItemXa4bc3a16) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineIssueSearchResultItemLabelsItemXa4bc3a16")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.color?.let { put("color", it) }
        value.default?.let { put("default", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.nodeId?.let { put("node_id", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineIssueSearchResultItemLabelsItemXa4bc3a16(block: InlineIssueSearchResultItemLabelsItemXa4bc3a16.Builder.() -> Unit): InlineIssueSearchResultItemLabelsItemXa4bc3a16 = InlineIssueSearchResultItemLabelsItemXa4bc3a16.build(block)
