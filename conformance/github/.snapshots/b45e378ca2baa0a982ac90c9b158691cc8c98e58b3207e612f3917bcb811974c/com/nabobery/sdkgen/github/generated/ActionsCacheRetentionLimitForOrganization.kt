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
 * GitHub Actions cache retention policy for an organization.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-cache-retention-limit-for-organization
 */
@Serializable(with = ActionsCacheRetentionLimitForOrganization.Serializer::class)
public class ActionsCacheRetentionLimitForOrganization(
  /**
   * For repositories in this organization, the maximum duration, in days, for which caches in a repository may be
   * retained.
   */
  public val maxCacheRetentionDays: Int? = null,
) {
  public class Builder {
    /**
     * For repositories in this organization, the maximum duration, in days, for which caches in a repository may be
     * retained.
     */
    public var maxCacheRetentionDays: Int? = null

    public fun build(): ActionsCacheRetentionLimitForOrganization = ActionsCacheRetentionLimitForOrganization(
      maxCacheRetentionDays = maxCacheRetentionDays,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ActionsCacheRetentionLimitForOrganization = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ActionsCacheRetentionLimitForOrganization> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ActionsCacheRetentionLimitForOrganization {
      val jsonDecoder = decoder.requireJsonDecoder("ActionsCacheRetentionLimitForOrganization")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ActionsCacheRetentionLimitForOrganization must be a JSON object")
      return ActionsCacheRetentionLimitForOrganization(
        maxCacheRetentionDays = rawObject["max_cache_retention_days"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ActionsCacheRetentionLimitForOrganization) {
      val jsonEncoder = encoder.requireJsonEncoder("ActionsCacheRetentionLimitForOrganization")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.maxCacheRetentionDays?.let { put("max_cache_retention_days", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun actionsCacheRetentionLimitForOrganization(block: ActionsCacheRetentionLimitForOrganization.Builder.() -> Unit): ActionsCacheRetentionLimitForOrganization = ActionsCacheRetentionLimitForOrganization.build(block)
