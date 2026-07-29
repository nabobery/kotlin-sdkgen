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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/actions-cache-usage-org-enterprise.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-cache-usage-org-enterprise
 */
@Serializable(with = ActionsCacheUsageOrgEnterprise.Serializer::class)
public class ActionsCacheUsageOrgEnterprise(
  /**
   * The count of active caches across all repositories of an enterprise or an organization.
   */
  public val totalActiveCachesCount: Int,
  /**
   * The total size in bytes of all active cache items across all repositories of an enterprise or an organization.
   */
  public val totalActiveCachesSizeInBytes: Int,
) {
  public class Builder {
    private var totalActiveCachesCountValue: Int? = null

    public var totalActiveCachesCount: Int
      get() = requireNotNull(totalActiveCachesCountValue) { "totalActiveCachesCount is required" }
      set(`value`) {
        totalActiveCachesCountValue = value
      }

    private var totalActiveCachesSizeInBytesValue: Int? = null

    public var totalActiveCachesSizeInBytes: Int
      get() = requireNotNull(totalActiveCachesSizeInBytesValue) { "totalActiveCachesSizeInBytes is required" }
      set(`value`) {
        totalActiveCachesSizeInBytesValue = value
      }

    public fun build(): ActionsCacheUsageOrgEnterprise {
      check(totalActiveCachesCountValue != null) { "totalActiveCachesCount is required" }
      check(totalActiveCachesSizeInBytesValue != null) { "totalActiveCachesSizeInBytes is required" }
      return ActionsCacheUsageOrgEnterprise(
        totalActiveCachesCount = totalActiveCachesCount,
        totalActiveCachesSizeInBytes = totalActiveCachesSizeInBytes,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ActionsCacheUsageOrgEnterprise = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ActionsCacheUsageOrgEnterprise> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ActionsCacheUsageOrgEnterprise {
      val jsonDecoder = decoder.requireJsonDecoder("ActionsCacheUsageOrgEnterprise")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ActionsCacheUsageOrgEnterprise must be a JSON object")
      val totalActiveCachesCount = json.decodeRequired<Int>(rawObject, "total_active_caches_count")
      val totalActiveCachesSizeInBytes = json.decodeRequired<Int>(rawObject, "total_active_caches_size_in_bytes")
      return ActionsCacheUsageOrgEnterprise(
        totalActiveCachesCount = totalActiveCachesCount,
        totalActiveCachesSizeInBytes = totalActiveCachesSizeInBytes,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ActionsCacheUsageOrgEnterprise) {
      val jsonEncoder = encoder.requireJsonEncoder("ActionsCacheUsageOrgEnterprise")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("total_active_caches_count", json.encodeToJsonElement(value.totalActiveCachesCount))
        put("total_active_caches_size_in_bytes", json.encodeToJsonElement(value.totalActiveCachesSizeInBytes))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun actionsCacheUsageOrgEnterprise(block: ActionsCacheUsageOrgEnterprise.Builder.() -> Unit): ActionsCacheUsageOrgEnterprise = ActionsCacheUsageOrgEnterprise.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ActionsCacheUsageOrgEnterprise is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
