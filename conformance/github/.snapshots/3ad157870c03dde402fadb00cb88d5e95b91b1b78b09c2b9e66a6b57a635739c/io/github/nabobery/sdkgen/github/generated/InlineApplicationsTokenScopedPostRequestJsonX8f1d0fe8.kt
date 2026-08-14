package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1applications~1{client_id}~1token~1scoped/post/requestBody/content/application~1
 * json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1applications~1{client_id}~1token~1scoped/post/requestBody/content/application~1
 * json/schema
 */
@Serializable(with = InlineApplicationsTokenScopedPostRequestJsonX8f1d0fe8.Serializer::class)
public class InlineApplicationsTokenScopedPostRequestJsonX8f1d0fe8(
  /**
   * The access token used to authenticate to the GitHub API.
   */
  public val accessToken: String,
  public val permissions: AppPermissions? = null,
  repositories: List<String>? = null,
  repositoryIds: List<Int>? = null,
  /**
   * The name of the user or organization to scope the user access token to. **Required** unless `target_id` is
   * specified.
   */
  public val target: String? = null,
  /**
   * The ID of the user or organization to scope the user access token to. **Required** unless `target` is specified.
   */
  public val targetId: Int? = null,
) {
  /**
   * The list of repository names to scope the user access token to. `repositories` may not be specified if
   * `repository_ids` is specified.
   */
  public val repositories: List<String>? = repositories?.let { collection0 -> collection0.toList() }

  /**
   * The list of repository IDs to scope the user access token to. `repository_ids` may not be specified if
   * `repositories` is specified.
   */
  public val repositoryIds: List<Int>? = repositoryIds?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var accessTokenValue: String? = null

    public var accessToken: String
      get() = requireNotNull(accessTokenValue) { "accessToken is required" }
      set(`value`) {
        accessTokenValue = value
      }

    public var permissions: AppPermissions? = null

    private var repositoriesValue: List<String>? = null

    /**
     * The list of repository names to scope the user access token to. `repositories` may not be specified if
     * `repository_ids` is specified.
     */
    public var repositories: List<String>?
      get() = repositoriesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        repositoriesValue = value?.let { collection0 -> collection0.toList() }
      }

    private var repositoryIdsValue: List<Int>? = null

    /**
     * The list of repository IDs to scope the user access token to. `repository_ids` may not be specified if
     * `repositories` is specified.
     */
    public var repositoryIds: List<Int>?
      get() = repositoryIdsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        repositoryIdsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The name of the user or organization to scope the user access token to. **Required** unless `target_id` is
     * specified.
     */
    public var target: String? = null

    /**
     * The ID of the user or organization to scope the user access token to. **Required** unless `target` is specified.
     */
    public var targetId: Int? = null

    public fun build(): InlineApplicationsTokenScopedPostRequestJsonX8f1d0fe8 {
      check(accessTokenValue != null) { "accessToken is required" }
      return InlineApplicationsTokenScopedPostRequestJsonX8f1d0fe8(
        accessToken = accessToken,
        permissions = permissions,
        repositories = repositories,
        repositoryIds = repositoryIds,
        target = target,
        targetId = targetId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineApplicationsTokenScopedPostRequestJsonX8f1d0fe8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineApplicationsTokenScopedPostRequestJsonX8f1d0fe8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineApplicationsTokenScopedPostRequestJsonX8f1d0fe8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineApplicationsTokenScopedPostRequestJsonX8f1d0fe8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineApplicationsTokenScopedPostRequestJsonX8f1d0fe8 must be a JSON object")
      val accessToken = json.decodeRequired<String>(rawObject, "access_token")
      return InlineApplicationsTokenScopedPostRequestJsonX8f1d0fe8(
        accessToken = accessToken,
        permissions = rawObject["permissions"]?.let { json.decodeFromJsonElement<AppPermissions>(it) },
        repositories = rawObject["repositories"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        repositoryIds = rawObject["repository_ids"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
        target = rawObject["target"]?.let { json.decodeFromJsonElement<String>(it) },
        targetId = rawObject["target_id"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineApplicationsTokenScopedPostRequestJsonX8f1d0fe8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineApplicationsTokenScopedPostRequestJsonX8f1d0fe8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("access_token", value.accessToken)
        value.permissions?.let { put("permissions", json.encodeToJsonElement(it)) }
        value.repositories?.let { put("repositories", json.encodeToJsonElement(it)) }
        value.repositoryIds?.let { put("repository_ids", json.encodeToJsonElement(it)) }
        value.target?.let { put("target", it) }
        value.targetId?.let { put("target_id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineApplicationsTokenScopedPostRequestJsonX8f1d0fe8(block: InlineApplicationsTokenScopedPostRequestJsonX8f1d0fe8.Builder.() -> Unit): InlineApplicationsTokenScopedPostRequestJsonX8f1d0fe8 = InlineApplicationsTokenScopedPostRequestJsonX8f1d0fe8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineApplicationsTokenScopedPostRequestJsonX8f1d0fe8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
