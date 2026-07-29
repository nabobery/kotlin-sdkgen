package com.nabobery.sdkgen.github.generated

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
 * The type of the referenced issue.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-issue-reference/properties/issue_type
 */
@Serializable(with = InlineNullableIssueReferenceIssueTypeX36162583.Serializer::class)
public class InlineNullableIssueReferenceIssueTypeX36162583(
  /**
   * The unique identifier of the issue type.
   */
  public val id: Int,
  /**
   * The name of the issue type.
   */
  public val name: String,
  /**
   * The node identifier of the issue type.
   */
  public val nodeId: String,
  /**
   * The color of the issue type.
   */
  public val color: String? = null,
) {
  public class Builder {
    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    /**
     * The color of the issue type.
     */
    public var color: String? = null

    public fun build(): InlineNullableIssueReferenceIssueTypeX36162583 {
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      return InlineNullableIssueReferenceIssueTypeX36162583(
        id = id,
        name = name,
        nodeId = nodeId,
        color = color,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineNullableIssueReferenceIssueTypeX36162583 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineNullableIssueReferenceIssueTypeX36162583> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineNullableIssueReferenceIssueTypeX36162583 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineNullableIssueReferenceIssueTypeX36162583")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineNullableIssueReferenceIssueTypeX36162583 must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      return InlineNullableIssueReferenceIssueTypeX36162583(
        id = id,
        name = name,
        nodeId = nodeId,
        color = rawObject["color"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineNullableIssueReferenceIssueTypeX36162583) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineNullableIssueReferenceIssueTypeX36162583")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("node_id", value.nodeId)
        value.color?.let { put("color", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineNullableIssueReferenceIssueTypeX36162583(block: InlineNullableIssueReferenceIssueTypeX36162583.Builder.() -> Unit): InlineNullableIssueReferenceIssueTypeX36162583 = InlineNullableIssueReferenceIssueTypeX36162583.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineNullableIssueReferenceIssueTypeX36162583 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
