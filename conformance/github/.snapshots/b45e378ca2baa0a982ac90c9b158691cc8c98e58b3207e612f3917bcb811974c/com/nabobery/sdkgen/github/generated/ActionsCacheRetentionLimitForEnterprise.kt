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
 * GitHub Actions cache retention policy for an enterprise.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-cache-retention-limit-for-enterprise
 */
@Serializable(with = ActionsCacheRetentionLimitForEnterprise.Serializer::class)
public class ActionsCacheRetentionLimitForEnterprise(
  /**
   * For repositories & organizations in an enterprise, the maximum duration, in days, for which caches in a repository
   * may be retained.
   */
  public val maxCacheRetentionDays: Int? = null,
) {
  public class Builder {
    /**
     * For repositories & organizations in an enterprise, the maximum duration, in days, for which caches in a
     * repository may be retained.
     */
    public var maxCacheRetentionDays: Int? = null

    public fun build(): ActionsCacheRetentionLimitForEnterprise = ActionsCacheRetentionLimitForEnterprise(
      maxCacheRetentionDays = maxCacheRetentionDays,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ActionsCacheRetentionLimitForEnterprise = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ActionsCacheRetentionLimitForEnterprise> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ActionsCacheRetentionLimitForEnterprise {
      val jsonDecoder = decoder.requireJsonDecoder("ActionsCacheRetentionLimitForEnterprise")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ActionsCacheRetentionLimitForEnterprise must be a JSON object")
      return ActionsCacheRetentionLimitForEnterprise(
        maxCacheRetentionDays = rawObject["max_cache_retention_days"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ActionsCacheRetentionLimitForEnterprise) {
      val jsonEncoder = encoder.requireJsonEncoder("ActionsCacheRetentionLimitForEnterprise")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.maxCacheRetentionDays?.let { put("max_cache_retention_days", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun actionsCacheRetentionLimitForEnterprise(block: ActionsCacheRetentionLimitForEnterprise.Builder.() -> Unit): ActionsCacheRetentionLimitForEnterprise = ActionsCacheRetentionLimitForEnterprise.build(block)
