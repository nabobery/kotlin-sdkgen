package io.github.nabobery.sdkgen.github.generated

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
 * Secrets for GitHub Actions for an organization.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/organization-actions-secret
 */
@Serializable(with = OrganizationActionsSecret.Serializer::class)
public class OrganizationActionsSecret(
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  /**
   * The name of the secret.
   */
  public val name: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * Visibility of a secret
   */
  public val visibility: InlineOrganizationActionsSecretVisibilityXe8f2a597,
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

    private var visibilityValue: InlineOrganizationActionsSecretVisibilityXe8f2a597? = null

    public var visibility: InlineOrganizationActionsSecretVisibilityXe8f2a597
      get() = requireNotNull(visibilityValue) { "visibility is required" }
      set(`value`) {
        visibilityValue = value
      }

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var selectedRepositoriesUrl: String? = null

    public fun build(): OrganizationActionsSecret {
      check(createdAtValue != null) { "createdAt is required" }
      check(nameValue != null) { "name is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(visibilityValue != null) { "visibility is required" }
      return OrganizationActionsSecret(
        createdAt = createdAt,
        name = name,
        updatedAt = updatedAt,
        visibility = visibility,
        selectedRepositoriesUrl = selectedRepositoriesUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OrganizationActionsSecret = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OrganizationActionsSecret> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OrganizationActionsSecret {
      val jsonDecoder = decoder.requireJsonDecoder("OrganizationActionsSecret")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OrganizationActionsSecret must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val name = json.decodeRequired<String>(rawObject, "name")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val visibility = json.decodeRequired<InlineOrganizationActionsSecretVisibilityXe8f2a597>(rawObject, "visibility")
      return OrganizationActionsSecret(
        createdAt = createdAt,
        name = name,
        updatedAt = updatedAt,
        visibility = visibility,
        selectedRepositoriesUrl = rawObject["selected_repositories_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OrganizationActionsSecret) {
      val jsonEncoder = encoder.requireJsonEncoder("OrganizationActionsSecret")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("name", value.name)
        put("updated_at", value.updatedAt)
        put("visibility", json.encodeToJsonElement(value.visibility))
        value.selectedRepositoriesUrl?.let { put("selected_repositories_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun organizationActionsSecret(block: OrganizationActionsSecret.Builder.() -> Unit): OrganizationActionsSecret = OrganizationActionsSecret.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OrganizationActionsSecret is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
