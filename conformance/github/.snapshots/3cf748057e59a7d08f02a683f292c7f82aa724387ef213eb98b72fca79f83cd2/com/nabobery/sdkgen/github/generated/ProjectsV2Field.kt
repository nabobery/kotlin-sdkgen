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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A field inside a projects v2 project
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/projects-v2-field
 */
@Serializable(with = ProjectsV2Field.Serializer::class)
public class ProjectsV2Field(
  /**
   * The time when the field was created.
   */
  public val createdAt: String,
  /**
   * The field's data type.
   */
  public val dataType: InlineProjectsV2FieldDataTypeX5cea9560,
  /**
   * The unique identifier of the field.
   */
  public val id: Int,
  /**
   * The name of the field.
   */
  public val name: String,
  /**
   * The API URL of the project that contains the field.
   */
  public val projectUrl: String,
  /**
   * The time when the field was last updated.
   */
  public val updatedAt: String,
  /**
   * Configuration for iteration fields.
   */
  public val configuration: InlineProjectsV2FieldConfigurationXfe7e3639? = null,
  /**
   * The ID of the issue field.
   */
  public val issueFieldId: Int? = null,
  /**
   * The node ID of the field.
   */
  public val nodeId: String? = null,
  /**
   * The options available for single select fields.
   */
  public val options: List<ProjectsV2SingleSelectOptions>? = null,
) {
  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var dataTypeValue: InlineProjectsV2FieldDataTypeX5cea9560? = null

    public var dataType: InlineProjectsV2FieldDataTypeX5cea9560
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

    private var projectUrlValue: String? = null

    public var projectUrl: String
      get() = requireNotNull(projectUrlValue) { "projectUrl is required" }
      set(`value`) {
        projectUrlValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    /**
     * Configuration for iteration fields.
     */
    public var configuration: InlineProjectsV2FieldConfigurationXfe7e3639? = null

    /**
     * The ID of the issue field.
     */
    public var issueFieldId: Int? = null

    /**
     * The node ID of the field.
     */
    public var nodeId: String? = null

    /**
     * The options available for single select fields.
     */
    public var options: List<ProjectsV2SingleSelectOptions>? = null

    public fun build(): ProjectsV2Field {
      check(createdAtValue != null) { "createdAt is required" }
      check(dataTypeValue != null) { "dataType is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(projectUrlValue != null) { "projectUrl is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      return ProjectsV2Field(
        createdAt = createdAt,
        dataType = dataType,
        id = id,
        name = name,
        projectUrl = projectUrl,
        updatedAt = updatedAt,
        configuration = configuration,
        issueFieldId = issueFieldId,
        nodeId = nodeId,
        options = options,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ProjectsV2Field = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ProjectsV2Field> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ProjectsV2Field {
      val jsonDecoder = decoder.requireJsonDecoder("ProjectsV2Field")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ProjectsV2Field must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val dataType = json.decodeRequired<InlineProjectsV2FieldDataTypeX5cea9560>(rawObject, "data_type")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val projectUrl = json.decodeRequired<String>(rawObject, "project_url")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      return ProjectsV2Field(
        createdAt = createdAt,
        dataType = dataType,
        id = id,
        name = name,
        projectUrl = projectUrl,
        updatedAt = updatedAt,
        configuration = rawObject["configuration"]?.let { json.decodeFromJsonElement<InlineProjectsV2FieldConfigurationXfe7e3639>(it) },
        issueFieldId = rawObject["issue_field_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        options = rawObject["options"]?.let { json.decodeFromJsonElement<List<ProjectsV2SingleSelectOptions>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ProjectsV2Field) {
      val jsonEncoder = encoder.requireJsonEncoder("ProjectsV2Field")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("data_type", json.encodeToJsonElement(value.dataType))
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("project_url", value.projectUrl)
        put("updated_at", value.updatedAt)
        value.configuration?.let { put("configuration", json.encodeToJsonElement(it)) }
        value.issueFieldId?.let { put("issue_field_id", json.encodeToJsonElement(it)) }
        value.nodeId?.let { put("node_id", it) }
        value.options?.let { put("options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun projectsV2Field(block: ProjectsV2Field.Builder.() -> Unit): ProjectsV2Field = ProjectsV2Field.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ProjectsV2Field is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
