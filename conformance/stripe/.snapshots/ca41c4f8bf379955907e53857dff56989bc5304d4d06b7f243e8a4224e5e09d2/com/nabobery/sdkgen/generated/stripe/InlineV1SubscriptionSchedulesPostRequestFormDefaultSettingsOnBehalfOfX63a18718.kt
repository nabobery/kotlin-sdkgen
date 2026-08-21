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

public enum class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfX63a18718Branch {
  Branch1,
  InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X80802d9f,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfX63a18718DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfX63a18718NoMatchException(
  message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfX63a18718DecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfX63a18718Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X80802d9f:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X80802d9f).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/default_settings/properties/on_behalf_of.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/default_settings/properties/on_behalf_of
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfX63a18718.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfX63a18718 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfX63a18718Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X80802d9f:
      InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X80802d9f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X80802d9f) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X80802d9f>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfX63a18718Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfX63a18718Branch.Branch1)
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X80802d9f) add(InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfX63a18718Branch.InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X80802d9f)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfX63a18718 {
      val inspection = inspectInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfX63a18718(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfX63a18718NoMatchException("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfX63a18718 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfX63a18718(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfX63a18718> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfX63a18718 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfX63a18718")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfX63a18718) {
      encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfX63a18718").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfX63a18718(element: JsonElement): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfX63a18718Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X80802d9f = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X80802d9f>()
  return InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsOnBehalfOfX63a18718Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X80802d9f = matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X80802d9f,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X80802d9f) add("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X80802d9f: value does not match InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAnyOf2X80802d9f")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
