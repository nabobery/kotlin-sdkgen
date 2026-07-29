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

public enum class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateX1bc3509eBranch {
  Branch1,
  InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateAnyOf2X5a812f8e,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateX1bc3509eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateX1bc3509eNoMatchException(
  message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateX1bc3509eDecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateX1bc3509eInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateAnyOf2X5a812f8e:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateAnyOf2X5a812f8e).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/start_date.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/start_date
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateX1bc3509e.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateX1bc3509e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateX1bc3509eInspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateAnyOf2X5a812f8e:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateAnyOf2X5a812f8e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateAnyOf2X5a812f8e) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateAnyOf2X5a812f8e>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateX1bc3509eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateX1bc3509eBranch.Branch1)
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateAnyOf2X5a812f8e) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateX1bc3509eBranch.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateAnyOf2X5a812f8e)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateX1bc3509e {
      val inspection = inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateX1bc3509e(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateX1bc3509eNoMatchException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateX1bc3509e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateX1bc3509e(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateX1bc3509e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateX1bc3509e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateX1bc3509e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateX1bc3509e) {
      encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateX1bc3509e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateX1bc3509e(element: JsonElement): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateX1bc3509eInspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateAnyOf2X5a812f8e = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateAnyOf2X5a812f8e>()
  return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateX1bc3509eInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateAnyOf2X5a812f8e = matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateAnyOf2X5a812f8e,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateAnyOf2X5a812f8e) add("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateAnyOf2X5a812f8e: value does not match InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateAnyOf2X5a812f8e")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
