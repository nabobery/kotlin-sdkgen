package com.nabobery.sdkgen.github.generated

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
 * GitHub Actions cache storage policy for an enterprise.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-cache-storage-limit-for-enterprise
 */
@Serializable(with = ActionsCacheStorageLimitForEnterprise.Serializer::class)
public class ActionsCacheStorageLimitForEnterprise(
  /**
   * For repositories & organizations in an enterprise, the maximum size limit for the sum of all caches in a
   * repository, in gigabytes.
   */
  public val maxCacheSizeGb: Int? = null,
) {
  public class Builder {
    /**
     * For repositories & organizations in an enterprise, the maximum size limit for the sum of all caches in a
     * repository, in gigabytes.
     */
    public var maxCacheSizeGb: Int? = null

    public fun build(): ActionsCacheStorageLimitForEnterprise = ActionsCacheStorageLimitForEnterprise(
      maxCacheSizeGb = maxCacheSizeGb,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ActionsCacheStorageLimitForEnterprise = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ActionsCacheStorageLimitForEnterprise> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ActionsCacheStorageLimitForEnterprise {
      val jsonDecoder = decoder.requireJsonDecoder("ActionsCacheStorageLimitForEnterprise")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ActionsCacheStorageLimitForEnterprise must be a JSON object")
      return ActionsCacheStorageLimitForEnterprise(
        maxCacheSizeGb = rawObject["max_cache_size_gb"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ActionsCacheStorageLimitForEnterprise) {
      val jsonEncoder = encoder.requireJsonEncoder("ActionsCacheStorageLimitForEnterprise")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.maxCacheSizeGb?.let { put("max_cache_size_gb", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun actionsCacheStorageLimitForEnterprise(block: ActionsCacheStorageLimitForEnterprise.Builder.() -> Unit): ActionsCacheStorageLimitForEnterprise = ActionsCacheStorageLimitForEnterprise.build(block)
