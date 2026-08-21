package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Organization variable for GitHub Actions.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/organization-actions-variable
 */
@Serializable(with = OrganizationActionsVariable.Serializer::class)
public class OrganizationActionsVariable(
  /**
   * The date and time at which the variable was created, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  /**
   * The name of the variable.
   */
  public val name: String,
  /**
   * The date and time at which the variable was last updated, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * The value of the variable.
   */
  public val `value`: String,
  /**
   * Visibility of a variable
   */
  public val visibility: InlineOrganizationActionsVariableVisibilityX1dc298e6,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val selectedRepositoriesUrl: String? = null,
) {
  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var valueValue: String? = null

    public var `value`: String
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    private var visibilityValue: InlineOrganizationActionsVariableVisibilityX1dc298e6? = null

    public var visibility: InlineOrganizationActionsVariableVisibilityX1dc298e6
      get() = requireNotNull(visibilityValue) { "visibility is required" }
      set(`value`) {
        visibilityValue = value
      }

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var selectedRepositoriesUrl: String? = null

    public fun build(): OrganizationActionsVariable {
      check(createdAtValue != null) { "createdAt is required" }
      check(nameValue != null) { "name is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(valueValue != null) { "value is required" }
      check(visibilityValue != null) { "visibility is required" }
      return OrganizationActionsVariable(
        createdAt = createdAt,
        name = name,
        updatedAt = updatedAt,
        value = value,
        visibility = visibility,
        selectedRepositoriesUrl = selectedRepositoriesUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OrganizationActionsVariable = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OrganizationActionsVariable> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OrganizationActionsVariable {
      val jsonDecoder = decoder.requireJsonDecoder("OrganizationActionsVariable")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OrganizationActionsVariable must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val name = json.decodeRequired<String>(rawObject, "name")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val value = json.decodeRequired<String>(rawObject, "value")
      val visibility = json.decodeRequired<InlineOrganizationActionsVariableVisibilityX1dc298e6>(rawObject, "visibility")
      return OrganizationActionsVariable(
        createdAt = createdAt,
        name = name,
        updatedAt = updatedAt,
        value = value,
        visibility = visibility,
        selectedRepositoriesUrl = rawObject["selected_repositories_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OrganizationActionsVariable) {
      val jsonEncoder = encoder.requireJsonEncoder("OrganizationActionsVariable")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("name", value.name)
        put("updated_at", value.updatedAt)
        put("value", value.value)
        put("visibility", json.encodeToJsonElement(value.visibility))
        value.selectedRepositoriesUrl?.let { put("selected_repositories_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun organizationActionsVariable(block: OrganizationActionsVariable.Builder.() -> Unit): OrganizationActionsVariable = OrganizationActionsVariable.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OrganizationActionsVariable is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
