package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/organization-create-issue-field.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/organization-create-issue-field
 */
@Serializable(with = OrganizationCreateIssueField.Serializer::class)
public class OrganizationCreateIssueField(
  /**
   * The data type of the issue field.
   */
  public val dataType: InlineOrganizationCreateIssueFieldDataTypeX8ce1c7c2,
  /**
   * Name of the issue field.
   */
  public val name: String,
  /**
   * Description of the issue field.
   */
  public val description: String? = null,
  options: List<InlineOrganizationCreateIssueFieldOptionsItemX4e01dac5>? = null,
  /**
   * The visibility of the issue field. Can be `organization_members_only` (visible only within the organization) or
   * `all` (visible to all users who can see issues). Only used when the visibility settings feature is enabled.
   * Defaults to `organization_members_only`.
   */
  public val visibility: InlineOrganizationCreateIssueFieldVisibilityX1ecd9997? = null,
) {
  /**
   * Options for select fields. Required when data_type is 'single_select' or 'multi_select'.
   */
  public val options: List<InlineOrganizationCreateIssueFieldOptionsItemX4e01dac5>? =
      options?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var dataTypeValue: InlineOrganizationCreateIssueFieldDataTypeX8ce1c7c2? = null

    public var dataType: InlineOrganizationCreateIssueFieldDataTypeX8ce1c7c2
      get() = requireNotNull(dataTypeValue) { "dataType is required" }
      set(`value`) {
        dataTypeValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    /**
     * Description of the issue field.
     */
    public var description: String? = null

    private var optionsValue: List<InlineOrganizationCreateIssueFieldOptionsItemX4e01dac5>? = null

    /**
     * Options for select fields. Required when data_type is 'single_select' or 'multi_select'.
     */
    public var options: List<InlineOrganizationCreateIssueFieldOptionsItemX4e01dac5>?
      get() = optionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        optionsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The visibility of the issue field. Can be `organization_members_only` (visible only within the organization) or
     * `all` (visible to all users who can see issues). Only used when the visibility settings feature is enabled.
     * Defaults to `organization_members_only`.
     */
    public var visibility: InlineOrganizationCreateIssueFieldVisibilityX1ecd9997? = null

    public fun build(): OrganizationCreateIssueField {
      check(dataTypeValue != null) { "dataType is required" }
      check(nameValue != null) { "name is required" }
      return OrganizationCreateIssueField(
        dataType = dataType,
        name = name,
        description = description,
        options = options,
        visibility = visibility,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OrganizationCreateIssueField = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<OrganizationCreateIssueField> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OrganizationCreateIssueField {
      val jsonDecoder = decoder.requireJsonDecoder("OrganizationCreateIssueField")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OrganizationCreateIssueField must be a JSON object")
      val dataType = json.decodeRequired<InlineOrganizationCreateIssueFieldDataTypeX8ce1c7c2>(rawObject, "data_type")
      val name = json.decodeRequired<String>(rawObject, "name")
      return OrganizationCreateIssueField(
        dataType = dataType,
        name = name,
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        options = rawObject["options"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineOrganizationCreateIssueFieldOptionsItemX4e01dac5>?>(element) },
        visibility = rawObject["visibility"]?.let { json.decodeFromJsonElement<InlineOrganizationCreateIssueFieldVisibilityX1ecd9997>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OrganizationCreateIssueField) {
      val jsonEncoder = encoder.requireJsonEncoder("OrganizationCreateIssueField")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data_type", json.encodeToJsonElement(value.dataType))
        put("name", value.name)
        value.description?.let { put("description", it) }
        value.options?.let { put("options", json.encodeToJsonElement(it)) }
        value.visibility?.let { put("visibility", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun organizationCreateIssueField(block: OrganizationCreateIssueField.Builder.() -> Unit): OrganizationCreateIssueField = OrganizationCreateIssueField.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OrganizationCreateIssueField is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
