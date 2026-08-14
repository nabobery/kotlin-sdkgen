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
 * Secrets for a GitHub Codespace.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/codespaces-secret
 */
@Serializable(with = CodespacesSecret.Serializer::class)
public class CodespacesSecret(
  /**
   * The date and time at which the secret was created, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  /**
   * The name of the secret
   */
  public val name: String,
  /**
   * The API URL at which the list of repositories this secret is visible to can be retrieved
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val selectedRepositoriesUrl: String,
  /**
   * The date and time at which the secret was last updated, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * The type of repositories in the organization that the secret is visible to
   */
  public val visibility: InlineCodespacesSecretVisibilityX1fefb70d,
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

    private var selectedRepositoriesUrlValue: String? = null

    public var selectedRepositoriesUrl: String
      get() = requireNotNull(selectedRepositoriesUrlValue) { "selectedRepositoriesUrl is required" }
      set(`value`) {
        selectedRepositoriesUrlValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var visibilityValue: InlineCodespacesSecretVisibilityX1fefb70d? = null

    public var visibility: InlineCodespacesSecretVisibilityX1fefb70d
      get() = requireNotNull(visibilityValue) { "visibility is required" }
      set(`value`) {
        visibilityValue = value
      }

    public fun build(): CodespacesSecret {
      check(createdAtValue != null) { "createdAt is required" }
      check(nameValue != null) { "name is required" }
      check(selectedRepositoriesUrlValue != null) { "selectedRepositoriesUrl is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(visibilityValue != null) { "visibility is required" }
      return CodespacesSecret(
        createdAt = createdAt,
        name = name,
        selectedRepositoriesUrl = selectedRepositoriesUrl,
        updatedAt = updatedAt,
        visibility = visibility,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodespacesSecret = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CodespacesSecret> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodespacesSecret {
      val jsonDecoder = decoder.requireJsonDecoder("CodespacesSecret")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodespacesSecret must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val name = json.decodeRequired<String>(rawObject, "name")
      val selectedRepositoriesUrl = json.decodeRequired<String>(rawObject, "selected_repositories_url")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val visibility = json.decodeRequired<InlineCodespacesSecretVisibilityX1fefb70d>(rawObject, "visibility")
      return CodespacesSecret(
        createdAt = createdAt,
        name = name,
        selectedRepositoriesUrl = selectedRepositoriesUrl,
        updatedAt = updatedAt,
        visibility = visibility,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodespacesSecret) {
      val jsonEncoder = encoder.requireJsonEncoder("CodespacesSecret")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("name", value.name)
        put("selected_repositories_url", value.selectedRepositoriesUrl)
        put("updated_at", value.updatedAt)
        put("visibility", json.encodeToJsonElement(value.visibility))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codespacesSecret(block: CodespacesSecret.Builder.() -> Unit): CodespacesSecret = CodespacesSecret.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CodespacesSecret is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
