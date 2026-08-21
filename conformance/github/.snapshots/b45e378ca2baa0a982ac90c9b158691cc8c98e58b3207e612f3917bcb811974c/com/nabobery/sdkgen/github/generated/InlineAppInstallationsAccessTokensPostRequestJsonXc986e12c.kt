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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1app~1installations~1{installation_id}~1access_tokens/post/requestBody/content/a
 * pplication~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1app~1installations~1{installation_id}~1access_tokens/post/requestBody/content/a
 * pplication~1json/schema
 */
@Serializable(with = InlineAppInstallationsAccessTokensPostRequestJsonXc986e12c.Serializer::class)
public class InlineAppInstallationsAccessTokensPostRequestJsonXc986e12c(
  public val permissions: AppPermissions? = null,
  repositories: List<String>? = null,
  repositoryIds: List<Int>? = null,
) {
  /**
   * List of repository names that the token should have access to
   */
  public val repositories: List<String>? = repositories?.let { collection0 -> collection0.toList() }

  /**
   * List of repository IDs that the token should have access to
   */
  public val repositoryIds: List<Int>? = repositoryIds?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var permissions: AppPermissions? = null

    private var repositoriesValue: List<String>? = null

    /**
     * List of repository names that the token should have access to
     */
    public var repositories: List<String>?
      get() = repositoriesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        repositoriesValue = value?.let { collection0 -> collection0.toList() }
      }

    private var repositoryIdsValue: List<Int>? = null

    /**
     * List of repository IDs that the token should have access to
     */
    public var repositoryIds: List<Int>?
      get() = repositoryIdsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        repositoryIdsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineAppInstallationsAccessTokensPostRequestJsonXc986e12c = InlineAppInstallationsAccessTokensPostRequestJsonXc986e12c(
      permissions = permissions,
      repositories = repositories,
      repositoryIds = repositoryIds,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAppInstallationsAccessTokensPostRequestJsonXc986e12c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAppInstallationsAccessTokensPostRequestJsonXc986e12c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAppInstallationsAccessTokensPostRequestJsonXc986e12c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAppInstallationsAccessTokensPostRequestJsonXc986e12c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAppInstallationsAccessTokensPostRequestJsonXc986e12c must be a JSON object")
      return InlineAppInstallationsAccessTokensPostRequestJsonXc986e12c(
        permissions = rawObject["permissions"]?.let { json.decodeFromJsonElement<AppPermissions>(it) },
        repositories = rawObject["repositories"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        repositoryIds = rawObject["repository_ids"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAppInstallationsAccessTokensPostRequestJsonXc986e12c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAppInstallationsAccessTokensPostRequestJsonXc986e12c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.permissions?.let { put("permissions", json.encodeToJsonElement(it)) }
        value.repositories?.let { put("repositories", json.encodeToJsonElement(it)) }
        value.repositoryIds?.let { put("repository_ids", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAppInstallationsAccessTokensPostRequestJsonXc986e12c(block: InlineAppInstallationsAccessTokensPostRequestJsonXc986e12c.Builder.() -> Unit): InlineAppInstallationsAccessTokensPostRequestJsonXc986e12c = InlineAppInstallationsAccessTokensPostRequestJsonXc986e12c.build(block)
