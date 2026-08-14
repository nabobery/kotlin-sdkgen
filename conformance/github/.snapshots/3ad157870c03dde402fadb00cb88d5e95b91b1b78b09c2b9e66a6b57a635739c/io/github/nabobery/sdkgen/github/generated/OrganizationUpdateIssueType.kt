package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/organization-update-issue-type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/organization-update-issue-type
 */
@Serializable(with = OrganizationUpdateIssueType.Serializer::class)
public class OrganizationUpdateIssueType(
  /**
   * Whether or not the issue type is enabled at the organization level.
   */
  public val isEnabled: Boolean,
  /**
   * Name of the issue type.
   */
  public val name: String,
  /**
   * Color for the issue type.
   */
  public val color: InlineOrganizationUpdateIssueTypeColorX54e4eff9? = null,
  /**
   * Description of the issue type.
   */
  public val description: String? = null,
) {
  public class Builder {
    private var isEnabledValue: Boolean? = null

    public var isEnabled: Boolean
      get() = requireNotNull(isEnabledValue) { "isEnabled is required" }
      set(`value`) {
        isEnabledValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    /**
     * Color for the issue type.
     */
    public var color: InlineOrganizationUpdateIssueTypeColorX54e4eff9? = null

    /**
     * Description of the issue type.
     */
    public var description: String? = null

    public fun build(): OrganizationUpdateIssueType {
      check(isEnabledValue != null) { "isEnabled is required" }
      check(nameValue != null) { "name is required" }
      return OrganizationUpdateIssueType(
        isEnabled = isEnabled,
        name = name,
        color = color,
        description = description,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OrganizationUpdateIssueType = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OrganizationUpdateIssueType> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OrganizationUpdateIssueType {
      val jsonDecoder = decoder.requireJsonDecoder("OrganizationUpdateIssueType")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OrganizationUpdateIssueType must be a JSON object")
      val isEnabled = json.decodeRequired<Boolean>(rawObject, "is_enabled")
      val name = json.decodeRequired<String>(rawObject, "name")
      return OrganizationUpdateIssueType(
        isEnabled = isEnabled,
        name = name,
        color = rawObject["color"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineOrganizationUpdateIssueTypeColorX54e4eff9?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OrganizationUpdateIssueType) {
      val jsonEncoder = encoder.requireJsonEncoder("OrganizationUpdateIssueType")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("is_enabled", json.encodeToJsonElement(value.isEnabled))
        put("name", value.name)
        value.color?.let { put("color", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun organizationUpdateIssueType(block: OrganizationUpdateIssueType.Builder.() -> Unit): OrganizationUpdateIssueType = OrganizationUpdateIssueType.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OrganizationUpdateIssueType is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
