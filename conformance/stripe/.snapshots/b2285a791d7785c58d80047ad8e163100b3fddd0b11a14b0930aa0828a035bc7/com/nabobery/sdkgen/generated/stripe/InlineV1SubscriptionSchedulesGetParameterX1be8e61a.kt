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

public enum class InlineV1SubscriptionSchedulesGetParameterX1be8e61aBranch {
  InlineV1SubscriptionSchedulesGetParameterAnyOf1Xc996ad31,
  Branch2,
}

public sealed class InlineV1SubscriptionSchedulesGetParameterX1be8e61aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesGetParameterX1be8e61aNoMatchException(
  message: String,
) : InlineV1SubscriptionSchedulesGetParameterX1be8e61aDecodingException(message)

internal data class InlineV1SubscriptionSchedulesGetParameterX1be8e61aInspection(
  public val matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1Xc996ad31: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1Xc996ad31, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/get/parameters/2/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/get/parameters/2/schema
 */
@Serializable(with = InlineV1SubscriptionSchedulesGetParameterX1be8e61a.Serializer::class)
public class InlineV1SubscriptionSchedulesGetParameterX1be8e61a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionSchedulesGetParameterX1be8e61aInspection,
) {
  public val inlineV1SubscriptionSchedulesGetParameterAnyOf1Xc996ad31:
      InlineV1SubscriptionSchedulesGetParameterAnyOf1Xc996ad31? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1Xc996ad31) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesGetParameterAnyOf1Xc996ad31>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1SubscriptionSchedulesGetParameterX1be8e61aBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1Xc996ad31) add(InlineV1SubscriptionSchedulesGetParameterX1be8e61aBranch.InlineV1SubscriptionSchedulesGetParameterAnyOf1Xc996ad31)
      if (inspection.matchesBranch2) add(InlineV1SubscriptionSchedulesGetParameterX1be8e61aBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionSchedulesGetParameterX1be8e61a {
      val inspection = inspectInlineV1SubscriptionSchedulesGetParameterX1be8e61a(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionSchedulesGetParameterX1be8e61aNoMatchException("InlineV1SubscriptionSchedulesGetParameterX1be8e61a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionSchedulesGetParameterX1be8e61a(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionSchedulesGetParameterX1be8e61a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesGetParameterX1be8e61a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesGetParameterX1be8e61a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesGetParameterX1be8e61a) {
      encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesGetParameterX1be8e61a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionSchedulesGetParameterX1be8e61a(element: JsonElement): InlineV1SubscriptionSchedulesGetParameterX1be8e61aInspection {
  val matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1Xc996ad31 = element.isJsonDecodable<InlineV1SubscriptionSchedulesGetParameterAnyOf1Xc996ad31>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1SubscriptionSchedulesGetParameterX1be8e61aInspection(
    matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1Xc996ad31 = matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1Xc996ad31,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1Xc996ad31) add("InlineV1SubscriptionSchedulesGetParameterAnyOf1Xc996ad31: value does not match InlineV1SubscriptionSchedulesGetParameterAnyOf1Xc996ad31")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
