package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1SubscriptionSchedulesGetParameterXaf4a9123Branch {
  InlineV1SubscriptionSchedulesGetParameterAnyOf1X6958cce1,
  Branch2,
}

public sealed class InlineV1SubscriptionSchedulesGetParameterXaf4a9123DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesGetParameterXaf4a9123NoMatchException(
  message: String,
) : InlineV1SubscriptionSchedulesGetParameterXaf4a9123DecodingException(message)

internal data class InlineV1SubscriptionSchedulesGetParameterXaf4a9123Inspection(
  public val matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1X6958cce1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1X6958cce1, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/get/parameters/1/schema
 */
@Serializable(with = InlineV1SubscriptionSchedulesGetParameterXaf4a9123.Serializer::class)
public class InlineV1SubscriptionSchedulesGetParameterXaf4a9123 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionSchedulesGetParameterXaf4a9123Inspection,
) {
  public val inlineV1SubscriptionSchedulesGetParameterAnyOf1X6958cce1:
      InlineV1SubscriptionSchedulesGetParameterAnyOf1X6958cce1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1X6958cce1) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesGetParameterAnyOf1X6958cce1>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1SubscriptionSchedulesGetParameterXaf4a9123Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1X6958cce1) add(InlineV1SubscriptionSchedulesGetParameterXaf4a9123Branch.InlineV1SubscriptionSchedulesGetParameterAnyOf1X6958cce1)
      if (inspection.matchesBranch2) add(InlineV1SubscriptionSchedulesGetParameterXaf4a9123Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionSchedulesGetParameterXaf4a9123 {
      val inspection = inspectInlineV1SubscriptionSchedulesGetParameterXaf4a9123(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionSchedulesGetParameterXaf4a9123NoMatchException("InlineV1SubscriptionSchedulesGetParameterXaf4a9123 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionSchedulesGetParameterXaf4a9123(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesGetParameterXaf4a9123> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesGetParameterXaf4a9123 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesGetParameterXaf4a9123")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesGetParameterXaf4a9123) {
      encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesGetParameterXaf4a9123").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionSchedulesGetParameterXaf4a9123(element: JsonElement): InlineV1SubscriptionSchedulesGetParameterXaf4a9123Inspection {
  val matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1X6958cce1 = element.isJsonDecodable<InlineV1SubscriptionSchedulesGetParameterAnyOf1X6958cce1>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1SubscriptionSchedulesGetParameterXaf4a9123Inspection(
    matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1X6958cce1 = matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1X6958cce1,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1X6958cce1) add("InlineV1SubscriptionSchedulesGetParameterAnyOf1X6958cce1: value does not match InlineV1SubscriptionSchedulesGetParameterAnyOf1X6958cce1")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
