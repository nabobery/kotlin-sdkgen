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
 * GitHub Actions cache storage policy for a repository.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-cache-storage-limit-for-repository
 */
@Serializable(with = ActionsCacheStorageLimitForRepository.Serializer::class)
public class ActionsCacheStorageLimitForRepository(
  /**
   * The maximum total cache size for this repository, in gigabytes.
   */
  public val maxCacheSizeGb: Int? = null,
) {
  public class Builder {
    /**
     * The maximum total cache size for this repository, in gigabytes.
     */
    public var maxCacheSizeGb: Int? = null

    public fun build(): ActionsCacheStorageLimitForRepository = ActionsCacheStorageLimitForRepository(
      maxCacheSizeGb = maxCacheSizeGb,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ActionsCacheStorageLimitForRepository = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ActionsCacheStorageLimitForRepository> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ActionsCacheStorageLimitForRepository {
      val jsonDecoder = decoder.requireJsonDecoder("ActionsCacheStorageLimitForRepository")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ActionsCacheStorageLimitForRepository must be a JSON object")
      return ActionsCacheStorageLimitForRepository(
        maxCacheSizeGb = rawObject["max_cache_size_gb"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ActionsCacheStorageLimitForRepository) {
      val jsonEncoder = encoder.requireJsonEncoder("ActionsCacheStorageLimitForRepository")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.maxCacheSizeGb?.let { put("max_cache_size_gb", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun actionsCacheStorageLimitForRepository(block: ActionsCacheStorageLimitForRepository.Builder.() -> Unit): ActionsCacheStorageLimitForRepository = ActionsCacheStorageLimitForRepository.build(block)
