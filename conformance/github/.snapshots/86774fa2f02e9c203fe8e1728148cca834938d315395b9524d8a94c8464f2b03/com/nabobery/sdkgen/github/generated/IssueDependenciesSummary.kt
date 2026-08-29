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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/issue-dependencies-summary.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/issue-dependencies-summary
 */
@Serializable(with = IssueDependenciesSummary.Serializer::class)
public class IssueDependenciesSummary(
  public val blockedBy: Int,
  public val blocking: Int,
  public val totalBlockedBy: Int,
  public val totalBlocking: Int,
) {
  public class Builder {
    private var blockedByValue: Int? = null

    public var blockedBy: Int
      get() = requireNotNull(blockedByValue) { "blockedBy is required" }
      set(`value`) {
        blockedByValue = value
      }

    private var blockingValue: Int? = null

    public var blocking: Int
      get() = requireNotNull(blockingValue) { "blocking is required" }
      set(`value`) {
        blockingValue = value
      }

    private var totalBlockedByValue: Int? = null

    public var totalBlockedBy: Int
      get() = requireNotNull(totalBlockedByValue) { "totalBlockedBy is required" }
      set(`value`) {
        totalBlockedByValue = value
      }

    private var totalBlockingValue: Int? = null

    public var totalBlocking: Int
      get() = requireNotNull(totalBlockingValue) { "totalBlocking is required" }
      set(`value`) {
        totalBlockingValue = value
      }

    public fun build(): IssueDependenciesSummary {
      check(blockedByValue != null) { "blockedBy is required" }
      check(blockingValue != null) { "blocking is required" }
      check(totalBlockedByValue != null) { "totalBlockedBy is required" }
      check(totalBlockingValue != null) { "totalBlocking is required" }
      return IssueDependenciesSummary(
        blockedBy = blockedBy,
        blocking = blocking,
        totalBlockedBy = totalBlockedBy,
        totalBlocking = totalBlocking,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssueDependenciesSummary = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssueDependenciesSummary> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssueDependenciesSummary {
      val jsonDecoder = decoder.requireJsonDecoder("IssueDependenciesSummary")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssueDependenciesSummary must be a JSON object")
      val blockedBy = json.decodeRequired<Int>(rawObject, "blocked_by")
      val blocking = json.decodeRequired<Int>(rawObject, "blocking")
      val totalBlockedBy = json.decodeRequired<Int>(rawObject, "total_blocked_by")
      val totalBlocking = json.decodeRequired<Int>(rawObject, "total_blocking")
      return IssueDependenciesSummary(
        blockedBy = blockedBy,
        blocking = blocking,
        totalBlockedBy = totalBlockedBy,
        totalBlocking = totalBlocking,
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssueDependenciesSummary) {
      val jsonEncoder = encoder.requireJsonEncoder("IssueDependenciesSummary")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("blocked_by", json.encodeToJsonElement(value.blockedBy))
        put("blocking", json.encodeToJsonElement(value.blocking))
        put("total_blocked_by", json.encodeToJsonElement(value.totalBlockedBy))
        put("total_blocking", json.encodeToJsonElement(value.totalBlocking))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issueDependenciesSummary(block: IssueDependenciesSummary.Builder.() -> Unit): IssueDependenciesSummary = IssueDependenciesSummary.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssueDependenciesSummary is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
