package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/issue/properties/labels/items/oneOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/issue/properties/labels/items/oneOf/1
 */
@Serializable(with = InlineIssueLabelsItemOneOf2Xb0d4e223.Serializer::class)
public class InlineIssueLabelsItemOneOf2Xb0d4e223(
  public val color: String? = null,
  public val default: Boolean? = null,
  public val description: String? = null,
  public val id: Long? = null,
  public val name: String? = null,
  public val nodeId: String? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String? = null,
) {
  public class Builder {
    public var color: String? = null

    public var default: Boolean? = null

    public var description: String? = null

    public var id: Long? = null

    public var name: String? = null

    public var nodeId: String? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var url: String? = null

    public fun build(): InlineIssueLabelsItemOneOf2Xb0d4e223 = InlineIssueLabelsItemOneOf2Xb0d4e223(
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
    public fun build(block: Builder.() -> Unit): InlineIssueLabelsItemOneOf2Xb0d4e223 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineIssueLabelsItemOneOf2Xb0d4e223> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssueLabelsItemOneOf2Xb0d4e223 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssueLabelsItemOneOf2Xb0d4e223")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineIssueLabelsItemOneOf2Xb0d4e223 must be a JSON object")
      return InlineIssueLabelsItemOneOf2Xb0d4e223(
        color = rawObject["color"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        default = rawObject["default"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Long>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssueLabelsItemOneOf2Xb0d4e223) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineIssueLabelsItemOneOf2Xb0d4e223")
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

public fun inlineIssueLabelsItemOneOf2Xb0d4e223(block: InlineIssueLabelsItemOneOf2Xb0d4e223.Builder.() -> Unit): InlineIssueLabelsItemOneOf2Xb0d4e223 = InlineIssueLabelsItemOneOf2Xb0d4e223.build(block)
