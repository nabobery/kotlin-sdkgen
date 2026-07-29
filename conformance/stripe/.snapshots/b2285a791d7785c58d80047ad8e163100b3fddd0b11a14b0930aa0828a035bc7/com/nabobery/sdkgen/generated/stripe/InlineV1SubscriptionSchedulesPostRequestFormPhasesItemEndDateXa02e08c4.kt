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

public enum class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateXa02e08c4Branch {
  Branch1,
  InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateAnyOf2X219f8877,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateXa02e08c4DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateXa02e08c4NoMatchException(
  message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateXa02e08c4DecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateXa02e08c4Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateAnyOf2X219f8877:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateAnyOf2X219f8877).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/end_date.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/end_date
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateXa02e08c4.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateXa02e08c4 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateXa02e08c4Inspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateAnyOf2X219f8877:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateAnyOf2X219f8877? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateAnyOf2X219f8877) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateAnyOf2X219f8877>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateXa02e08c4Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateXa02e08c4Branch.Branch1)
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateAnyOf2X219f8877) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateXa02e08c4Branch.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateAnyOf2X219f8877)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateXa02e08c4 {
      val inspection = inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateXa02e08c4(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateXa02e08c4NoMatchException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateXa02e08c4 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateXa02e08c4(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateXa02e08c4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateXa02e08c4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateXa02e08c4")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateXa02e08c4) {
      encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateXa02e08c4").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateXa02e08c4(element: JsonElement): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateXa02e08c4Inspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateAnyOf2X219f8877 = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateAnyOf2X219f8877>()
  return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateXa02e08c4Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateAnyOf2X219f8877 = matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateAnyOf2X219f8877,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateAnyOf2X219f8877) add("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateAnyOf2X219f8877: value does not match InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateAnyOf2X219f8877")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
