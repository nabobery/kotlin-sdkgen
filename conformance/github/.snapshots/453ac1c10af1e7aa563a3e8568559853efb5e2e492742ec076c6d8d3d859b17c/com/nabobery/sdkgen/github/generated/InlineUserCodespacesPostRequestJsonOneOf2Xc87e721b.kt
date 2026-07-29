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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1user~1codespaces/post/requestBody/content/application~1json/schema/oneOf/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1user~1codespaces/post/requestBody/content/application~1json/schema/oneOf/1
 */
@Serializable(with = InlineUserCodespacesPostRequestJsonOneOf2Xc87e721b.Serializer::class)
public class InlineUserCodespacesPostRequestJsonOneOf2Xc87e721b(
  /**
   * Pull request number for this codespace
   */
  public val pullRequest: InlineUserCodespacesPostRequestJsonOneOf2PullRequestXf52f7811,
  /**
   * Path to devcontainer.json config to use for this codespace
   */
  public val devcontainerPath: String? = null,
  /**
   * The geographic area for this codespace. If not specified, the value is assigned by IP. This property replaces
   * `location`, which is closing down.
   */
  public val geo: InlineUserCodespacesPostRequestJsonOneOf2GeoXee3ab558? = null,
  /**
   * Time in minutes before codespace stops from inactivity
   */
  public val idleTimeoutMinutes: Int? = null,
  /**
   * The requested location for a new codespace. Best efforts are made to respect this upon creation. Assigned by IP if
   * not provided.
   */
  public val location: String? = null,
  /**
   * Machine type to use for this codespace
   */
  public val machine: String? = null,
  /**
   * Working directory for this codespace
   */
  public val workingDirectory: String? = null,
) {
  public class Builder {
    private var pullRequestValue: InlineUserCodespacesPostRequestJsonOneOf2PullRequestXf52f7811? =
        null

    public var pullRequest: InlineUserCodespacesPostRequestJsonOneOf2PullRequestXf52f7811
      get() = requireNotNull(pullRequestValue) { "pullRequest is required" }
      set(`value`) {
        pullRequestValue = value
      }

    /**
     * Path to devcontainer.json config to use for this codespace
     */
    public var devcontainerPath: String? = null

    /**
     * The geographic area for this codespace. If not specified, the value is assigned by IP. This property replaces
     * `location`, which is closing down.
     */
    public var geo: InlineUserCodespacesPostRequestJsonOneOf2GeoXee3ab558? = null

    /**
     * Time in minutes before codespace stops from inactivity
     */
    public var idleTimeoutMinutes: Int? = null

    /**
     * The requested location for a new codespace. Best efforts are made to respect this upon creation. Assigned by IP
     * if not provided.
     */
    public var location: String? = null

    /**
     * Machine type to use for this codespace
     */
    public var machine: String? = null

    /**
     * Working directory for this codespace
     */
    public var workingDirectory: String? = null

    public fun build(): InlineUserCodespacesPostRequestJsonOneOf2Xc87e721b {
      check(pullRequestValue != null) { "pullRequest is required" }
      return InlineUserCodespacesPostRequestJsonOneOf2Xc87e721b(
        pullRequest = pullRequest,
        devcontainerPath = devcontainerPath,
        geo = geo,
        idleTimeoutMinutes = idleTimeoutMinutes,
        location = location,
        machine = machine,
        workingDirectory = workingDirectory,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUserCodespacesPostRequestJsonOneOf2Xc87e721b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineUserCodespacesPostRequestJsonOneOf2Xc87e721b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUserCodespacesPostRequestJsonOneOf2Xc87e721b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUserCodespacesPostRequestJsonOneOf2Xc87e721b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUserCodespacesPostRequestJsonOneOf2Xc87e721b must be a JSON object")
      val pullRequest = json.decodeRequired<InlineUserCodespacesPostRequestJsonOneOf2PullRequestXf52f7811>(rawObject, "pull_request")
      return InlineUserCodespacesPostRequestJsonOneOf2Xc87e721b(
        pullRequest = pullRequest,
        devcontainerPath = rawObject["devcontainer_path"]?.let { json.decodeFromJsonElement<String>(it) },
        geo = rawObject["geo"]?.let { json.decodeFromJsonElement<InlineUserCodespacesPostRequestJsonOneOf2GeoXee3ab558>(it) },
        idleTimeoutMinutes = rawObject["idle_timeout_minutes"]?.let { json.decodeFromJsonElement<Int>(it) },
        location = rawObject["location"]?.let { json.decodeFromJsonElement<String>(it) },
        machine = rawObject["machine"]?.let { json.decodeFromJsonElement<String>(it) },
        workingDirectory = rawObject["working_directory"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUserCodespacesPostRequestJsonOneOf2Xc87e721b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUserCodespacesPostRequestJsonOneOf2Xc87e721b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("pull_request", json.encodeToJsonElement(value.pullRequest))
        value.devcontainerPath?.let { put("devcontainer_path", it) }
        value.geo?.let { put("geo", json.encodeToJsonElement(it)) }
        value.idleTimeoutMinutes?.let { put("idle_timeout_minutes", json.encodeToJsonElement(it)) }
        value.location?.let { put("location", it) }
        value.machine?.let { put("machine", it) }
        value.workingDirectory?.let { put("working_directory", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUserCodespacesPostRequestJsonOneOf2Xc87e721b(block: InlineUserCodespacesPostRequestJsonOneOf2Xc87e721b.Builder.() -> Unit): InlineUserCodespacesPostRequestJsonOneOf2Xc87e721b = InlineUserCodespacesPostRequestJsonOneOf2Xc87e721b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUserCodespacesPostRequestJsonOneOf2Xc87e721b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
