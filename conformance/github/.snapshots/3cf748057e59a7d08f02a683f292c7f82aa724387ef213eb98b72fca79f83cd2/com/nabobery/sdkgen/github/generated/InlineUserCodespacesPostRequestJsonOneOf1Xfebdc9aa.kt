package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * sdkgen://source/openapi.yaml#/paths/~1user~1codespaces/post/requestBody/content/application~1json/schema/oneOf/0.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1user~1codespaces/post/requestBody/content/application~1json/schema/oneOf/0
 */
@Serializable(with = InlineUserCodespacesPostRequestJsonOneOf1Xfebdc9aa.Serializer::class)
public class InlineUserCodespacesPostRequestJsonOneOf1Xfebdc9aa(
  /**
   * Repository id for this codespace
   */
  public val repositoryId: Int,
  /**
   * IP for location auto-detection when proxying a request
   */
  public val clientIp: String? = null,
  /**
   * Path to devcontainer.json config to use for this codespace
   */
  public val devcontainerPath: String? = null,
  /**
   * Display name for this codespace
   */
  public val displayName: String? = null,
  /**
   * The geographic area for this codespace. If not specified, the value is assigned by IP. This property replaces
   * `location`, which is closing down.
   */
  public val geo: InlineUserCodespacesPostRequestJsonOneOf1GeoX45240f3e? = null,
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
   * Whether to authorize requested permissions from devcontainer.json
   */
  public val multiRepoPermissionsOptOut: Boolean? = null,
  /**
   * Git ref (typically a branch name) for this codespace
   */
  public val ref: String? = null,
  /**
   * Duration in minutes after codespace has gone idle in which it will be deleted. Must be integer minutes between 0
   * and 43200 (30 days).
   */
  public val retentionPeriodMinutes: Int? = null,
  /**
   * Working directory for this codespace
   */
  public val workingDirectory: String? = null,
) {
  public class Builder {
    private var repositoryIdValue: Int? = null

    public var repositoryId: Int
      get() = requireNotNull(repositoryIdValue) { "repositoryId is required" }
      set(`value`) {
        repositoryIdValue = value
      }

    /**
     * IP for location auto-detection when proxying a request
     */
    public var clientIp: String? = null

    /**
     * Path to devcontainer.json config to use for this codespace
     */
    public var devcontainerPath: String? = null

    /**
     * Display name for this codespace
     */
    public var displayName: String? = null

    /**
     * The geographic area for this codespace. If not specified, the value is assigned by IP. This property replaces
     * `location`, which is closing down.
     */
    public var geo: InlineUserCodespacesPostRequestJsonOneOf1GeoX45240f3e? = null

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
     * Whether to authorize requested permissions from devcontainer.json
     */
    public var multiRepoPermissionsOptOut: Boolean? = null

    /**
     * Git ref (typically a branch name) for this codespace
     */
    public var ref: String? = null

    /**
     * Duration in minutes after codespace has gone idle in which it will be deleted. Must be integer minutes between 0
     * and 43200 (30 days).
     */
    public var retentionPeriodMinutes: Int? = null

    /**
     * Working directory for this codespace
     */
    public var workingDirectory: String? = null

    public fun build(): InlineUserCodespacesPostRequestJsonOneOf1Xfebdc9aa {
      check(repositoryIdValue != null) { "repositoryId is required" }
      return InlineUserCodespacesPostRequestJsonOneOf1Xfebdc9aa(
        repositoryId = repositoryId,
        clientIp = clientIp,
        devcontainerPath = devcontainerPath,
        displayName = displayName,
        geo = geo,
        idleTimeoutMinutes = idleTimeoutMinutes,
        location = location,
        machine = machine,
        multiRepoPermissionsOptOut = multiRepoPermissionsOptOut,
        ref = ref,
        retentionPeriodMinutes = retentionPeriodMinutes,
        workingDirectory = workingDirectory,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUserCodespacesPostRequestJsonOneOf1Xfebdc9aa = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineUserCodespacesPostRequestJsonOneOf1Xfebdc9aa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUserCodespacesPostRequestJsonOneOf1Xfebdc9aa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUserCodespacesPostRequestJsonOneOf1Xfebdc9aa")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUserCodespacesPostRequestJsonOneOf1Xfebdc9aa must be a JSON object")
      val repositoryId = json.decodeRequired<Int>(rawObject, "repository_id")
      return InlineUserCodespacesPostRequestJsonOneOf1Xfebdc9aa(
        repositoryId = repositoryId,
        clientIp = rawObject["client_ip"]?.let { json.decodeFromJsonElement<String>(it) },
        devcontainerPath = rawObject["devcontainer_path"]?.let { json.decodeFromJsonElement<String>(it) },
        displayName = rawObject["display_name"]?.let { json.decodeFromJsonElement<String>(it) },
        geo = rawObject["geo"]?.let { json.decodeFromJsonElement<InlineUserCodespacesPostRequestJsonOneOf1GeoX45240f3e>(it) },
        idleTimeoutMinutes = rawObject["idle_timeout_minutes"]?.let { json.decodeFromJsonElement<Int>(it) },
        location = rawObject["location"]?.let { json.decodeFromJsonElement<String>(it) },
        machine = rawObject["machine"]?.let { json.decodeFromJsonElement<String>(it) },
        multiRepoPermissionsOptOut = rawObject["multi_repo_permissions_opt_out"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        ref = rawObject["ref"]?.let { json.decodeFromJsonElement<String>(it) },
        retentionPeriodMinutes = rawObject["retention_period_minutes"]?.let { json.decodeFromJsonElement<Int>(it) },
        workingDirectory = rawObject["working_directory"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUserCodespacesPostRequestJsonOneOf1Xfebdc9aa) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUserCodespacesPostRequestJsonOneOf1Xfebdc9aa")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("repository_id", json.encodeToJsonElement(value.repositoryId))
        value.clientIp?.let { put("client_ip", it) }
        value.devcontainerPath?.let { put("devcontainer_path", it) }
        value.displayName?.let { put("display_name", it) }
        value.geo?.let { put("geo", json.encodeToJsonElement(it)) }
        value.idleTimeoutMinutes?.let { put("idle_timeout_minutes", json.encodeToJsonElement(it)) }
        value.location?.let { put("location", it) }
        value.machine?.let { put("machine", it) }
        value.multiRepoPermissionsOptOut?.let { put("multi_repo_permissions_opt_out", json.encodeToJsonElement(it)) }
        value.ref?.let { put("ref", it) }
        value.retentionPeriodMinutes?.let { put("retention_period_minutes", json.encodeToJsonElement(it)) }
        value.workingDirectory?.let { put("working_directory", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUserCodespacesPostRequestJsonOneOf1Xfebdc9aa(block: InlineUserCodespacesPostRequestJsonOneOf1Xfebdc9aa.Builder.() -> Unit): InlineUserCodespacesPostRequestJsonOneOf1Xfebdc9aa = InlineUserCodespacesPostRequestJsonOneOf1Xfebdc9aa.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUserCodespacesPostRequestJsonOneOf1Xfebdc9aa is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
