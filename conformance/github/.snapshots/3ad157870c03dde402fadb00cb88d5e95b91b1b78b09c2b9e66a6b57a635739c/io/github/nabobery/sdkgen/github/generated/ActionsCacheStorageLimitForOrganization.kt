package io.github.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.Unit
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
 * GitHub Actions cache storage policy for an organization.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-cache-storage-limit-for-organization
 */
@Serializable(with = ActionsCacheStorageLimitForOrganization.Serializer::class)
public class ActionsCacheStorageLimitForOrganization(
  /**
   * For repositories in the organization, the maximum size limit for the sum of all caches in a repository, in
   * gigabytes.
   */
  public val maxCacheSizeGb: Int? = null,
) {
  public class Builder {
    /**
     * For repositories in the organization, the maximum size limit for the sum of all caches in a repository, in
     * gigabytes.
     */
    public var maxCacheSizeGb: Int? = null

    public fun build(): ActionsCacheStorageLimitForOrganization = ActionsCacheStorageLimitForOrganization(
      maxCacheSizeGb = maxCacheSizeGb,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ActionsCacheStorageLimitForOrganization = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ActionsCacheStorageLimitForOrganization> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ActionsCacheStorageLimitForOrganization {
      val jsonDecoder = decoder.requireJsonDecoder("ActionsCacheStorageLimitForOrganization")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ActionsCacheStorageLimitForOrganization must be a JSON object")
      return ActionsCacheStorageLimitForOrganization(
        maxCacheSizeGb = rawObject["max_cache_size_gb"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ActionsCacheStorageLimitForOrganization) {
      val jsonEncoder = encoder.requireJsonEncoder("ActionsCacheStorageLimitForOrganization")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.maxCacheSizeGb?.let { put("max_cache_size_gb", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun actionsCacheStorageLimitForOrganization(block: ActionsCacheStorageLimitForOrganization.Builder.() -> Unit): ActionsCacheStorageLimitForOrganization = ActionsCacheStorageLimitForOrganization.build(block)
