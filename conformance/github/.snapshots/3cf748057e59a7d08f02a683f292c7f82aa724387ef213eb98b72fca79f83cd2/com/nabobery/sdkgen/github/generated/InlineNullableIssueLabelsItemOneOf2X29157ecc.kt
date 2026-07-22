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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/nullable-issue/properties/labels/items/oneOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-issue/properties/labels/items/oneOf/1
 */
@Serializable(with = InlineNullableIssueLabelsItemOneOf2X29157ecc.Serializer::class)
public class InlineNullableIssueLabelsItemOneOf2X29157ecc(
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

    public fun build(): InlineNullableIssueLabelsItemOneOf2X29157ecc = InlineNullableIssueLabelsItemOneOf2X29157ecc(
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
    public fun build(block: Builder.() -> Unit): InlineNullableIssueLabelsItemOneOf2X29157ecc = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineNullableIssueLabelsItemOneOf2X29157ecc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineNullableIssueLabelsItemOneOf2X29157ecc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineNullableIssueLabelsItemOneOf2X29157ecc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineNullableIssueLabelsItemOneOf2X29157ecc must be a JSON object")
      return InlineNullableIssueLabelsItemOneOf2X29157ecc(
        color = rawObject["color"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        default = rawObject["default"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Long>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineNullableIssueLabelsItemOneOf2X29157ecc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineNullableIssueLabelsItemOneOf2X29157ecc")
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

public fun inlineNullableIssueLabelsItemOneOf2X29157ecc(block: InlineNullableIssueLabelsItemOneOf2X29157ecc.Builder.() -> Unit): InlineNullableIssueLabelsItemOneOf2X29157ecc = InlineNullableIssueLabelsItemOneOf2X29157ecc.build(block)
