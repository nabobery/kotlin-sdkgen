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
import kotlinx.serialization.json.put

/**
 * Set repository secrets for GitHub Codespaces.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repo-codespaces-secret
 */
@Serializable(with = RepoCodespacesSecret.Serializer::class)
public class RepoCodespacesSecret(
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

    public fun build(): RepoCodespacesSecret {
      check(createdAtValue != null) { "createdAt is required" }
      check(nameValue != null) { "name is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      return RepoCodespacesSecret(
        createdAt = createdAt,
        name = name,
        updatedAt = updatedAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepoCodespacesSecret = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepoCodespacesSecret> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepoCodespacesSecret {
      val jsonDecoder = decoder.requireJsonDecoder("RepoCodespacesSecret")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepoCodespacesSecret must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val name = json.decodeRequired<String>(rawObject, "name")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      return RepoCodespacesSecret(
        createdAt = createdAt,
        name = name,
        updatedAt = updatedAt,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepoCodespacesSecret) {
      val jsonEncoder = encoder.requireJsonEncoder("RepoCodespacesSecret")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("name", value.name)
        put("updated_at", value.updatedAt)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repoCodespacesSecret(block: RepoCodespacesSecret.Builder.() -> Unit): RepoCodespacesSecret = RepoCodespacesSecret.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepoCodespacesSecret is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
