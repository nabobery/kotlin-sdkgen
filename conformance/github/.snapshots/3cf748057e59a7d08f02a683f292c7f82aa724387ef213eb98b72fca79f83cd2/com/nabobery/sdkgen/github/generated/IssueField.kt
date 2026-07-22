package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * A custom attribute defined at the organization level for attaching structured data to issues.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/issue-field
 */
@Serializable(with = IssueField.Serializer::class)
public class IssueField(
  /**
   * The data type of the issue field.
   */
  public val dataType: InlineIssueFieldDataTypeXad344c5b,
  /**
   * The unique identifier of the issue field.
   */
  public val id: Int,
  /**
   * The name of the issue field.
   */
  public val name: String,
  /**
   * The node identifier of the issue field.
   */
  public val nodeId: String,
  /**
   * The time the issue field was created.
   */
  public val createdAt: String? = null,
  /**
   * The description of the issue field.
   */
  public val description: String? = null,
  /**
   * Available options for single select and multi select fields.
   */
  public val options: List<InlineIssueFieldOptionsItemX25d2beb7>? = null,
  /**
   * The time the issue field was last updated.
   */
  public val updatedAt: String? = null,
  /**
   * The visibility of the issue field. Can be `organization_members_only` (visible only within the organization) or
   * `all` (visible to all users who can see issues).
   */
  public val visibility: InlineIssueFieldVisibilityX16818fb3? = null,
) {
  public class Builder {
    private var dataTypeValue: InlineIssueFieldDataTypeXad344c5b? = null

    public var dataType: InlineIssueFieldDataTypeXad344c5b
      get() = requireNotNull(dataTypeValue) { "dataType is required" }
      set(`value`) {
        dataTypeValue = value
      }

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
     * The time the issue field was created.
     */
    public var createdAt: String? = null

    /**
     * The description of the issue field.
     */
    public var description: String? = null

    /**
     * Available options for single select and multi select fields.
     */
    public var options: List<InlineIssueFieldOptionsItemX25d2beb7>? = null

    /**
     * The time the issue field was last updated.
     */
    public var updatedAt: String? = null

    /**
     * The visibility of the issue field. Can be `organization_members_only` (visible only within the organization) or
     * `all` (visible to all users who can see issues).
     */
    public var visibility: InlineIssueFieldVisibilityX16818fb3? = null

    public fun build(): IssueField {
      check(dataTypeValue != null) { "dataType is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      return IssueField(
        dataType = dataType,
        id = id,
        name = name,
        nodeId = nodeId,
        createdAt = createdAt,
        description = description,
        options = options,
        updatedAt = updatedAt,
        visibility = visibility,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssueField = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<IssueField> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssueField {
      val jsonDecoder = decoder.requireJsonDecoder("IssueField")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssueField must be a JSON object")
      val dataType = json.decodeRequired<InlineIssueFieldDataTypeXad344c5b>(rawObject, "data_type")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      return IssueField(
        dataType = dataType,
        id = id,
        name = name,
        nodeId = nodeId,
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        options = rawObject["options"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineIssueFieldOptionsItemX25d2beb7>?>(element) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
        visibility = rawObject["visibility"]?.let { json.decodeFromJsonElement<InlineIssueFieldVisibilityX16818fb3>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssueField) {
      val jsonEncoder = encoder.requireJsonEncoder("IssueField")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data_type", json.encodeToJsonElement(value.dataType))
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("node_id", value.nodeId)
        value.createdAt?.let { put("created_at", it) }
        value.description?.let { put("description", it) }
        value.options?.let { put("options", json.encodeToJsonElement(it)) }
        value.updatedAt?.let { put("updated_at", it) }
        value.visibility?.let { put("visibility", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issueField(block: IssueField.Builder.() -> Unit): IssueField = IssueField.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssueField is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
