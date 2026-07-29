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
 * GitHub Actions cache retention policy for a repository.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-cache-retention-limit-for-repository
 */
@Serializable(with = ActionsCacheRetentionLimitForRepository.Serializer::class)
public class ActionsCacheRetentionLimitForRepository(
  /**
   * The maximum number of days to keep caches in this repository.
   */
  public val maxCacheRetentionDays: Int? = null,
) {
  public class Builder {
    /**
     * The maximum number of days to keep caches in this repository.
     */
    public var maxCacheRetentionDays: Int? = null

    public fun build(): ActionsCacheRetentionLimitForRepository = ActionsCacheRetentionLimitForRepository(
      maxCacheRetentionDays = maxCacheRetentionDays,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ActionsCacheRetentionLimitForRepository = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ActionsCacheRetentionLimitForRepository> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ActionsCacheRetentionLimitForRepository {
      val jsonDecoder = decoder.requireJsonDecoder("ActionsCacheRetentionLimitForRepository")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ActionsCacheRetentionLimitForRepository must be a JSON object")
      return ActionsCacheRetentionLimitForRepository(
        maxCacheRetentionDays = rawObject["max_cache_retention_days"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ActionsCacheRetentionLimitForRepository) {
      val jsonEncoder = encoder.requireJsonEncoder("ActionsCacheRetentionLimitForRepository")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.maxCacheRetentionDays?.let { put("max_cache_retention_days", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun actionsCacheRetentionLimitForRepository(block: ActionsCacheRetentionLimitForRepository.Builder.() -> Unit): ActionsCacheRetentionLimitForRepository = ActionsCacheRetentionLimitForRepository.build(block)
