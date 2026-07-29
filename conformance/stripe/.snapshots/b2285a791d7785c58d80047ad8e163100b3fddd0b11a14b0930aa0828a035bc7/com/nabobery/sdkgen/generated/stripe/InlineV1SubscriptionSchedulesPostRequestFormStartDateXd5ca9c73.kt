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

public enum class InlineV1SubscriptionSchedulesPostRequestFormStartDateXd5ca9c73Branch {
  Branch1,
  InlineV1SubscriptionSchedulesPostRequestFormStartDateAnyOf2Xfee5bce1,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormStartDateXd5ca9c73DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormStartDateXd5ca9c73NoMatchException(
  message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormStartDateXd5ca9c73DecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormStartDateXd5ca9c73Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormStartDateAnyOf2Xfee5bce1: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionSchedulesPostRequestFormStartDateAnyOf2Xfee5bce1).count { it }
}

/**
 * When the subscription schedule starts. We recommend using `now` so that it starts the subscription immediately. You
 * can also use a Unix timestamp to backdate the subscription so that it starts on a past date, or set a future date for
 * the subscription to start on.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/start_date
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormStartDateXd5ca9c73.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormStartDateXd5ca9c73 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionSchedulesPostRequestFormStartDateXd5ca9c73Inspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1SubscriptionSchedulesPostRequestFormStartDateAnyOf2Xfee5bce1:
      InlineV1SubscriptionSchedulesPostRequestFormStartDateAnyOf2Xfee5bce1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormStartDateAnyOf2Xfee5bce1) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormStartDateAnyOf2Xfee5bce1>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionSchedulesPostRequestFormStartDateXd5ca9c73Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionSchedulesPostRequestFormStartDateXd5ca9c73Branch.Branch1)
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormStartDateAnyOf2Xfee5bce1) add(InlineV1SubscriptionSchedulesPostRequestFormStartDateXd5ca9c73Branch.InlineV1SubscriptionSchedulesPostRequestFormStartDateAnyOf2Xfee5bce1)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionSchedulesPostRequestFormStartDateXd5ca9c73 {
      val inspection = inspectInlineV1SubscriptionSchedulesPostRequestFormStartDateXd5ca9c73(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionSchedulesPostRequestFormStartDateXd5ca9c73NoMatchException("InlineV1SubscriptionSchedulesPostRequestFormStartDateXd5ca9c73 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionSchedulesPostRequestFormStartDateXd5ca9c73(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormStartDateXd5ca9c73> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormStartDateXd5ca9c73 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormStartDateXd5ca9c73")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormStartDateXd5ca9c73) {
      encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormStartDateXd5ca9c73").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormStartDateXd5ca9c73(element: JsonElement): InlineV1SubscriptionSchedulesPostRequestFormStartDateXd5ca9c73Inspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1SubscriptionSchedulesPostRequestFormStartDateAnyOf2Xfee5bce1 = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormStartDateAnyOf2Xfee5bce1>()
  return InlineV1SubscriptionSchedulesPostRequestFormStartDateXd5ca9c73Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionSchedulesPostRequestFormStartDateAnyOf2Xfee5bce1 = matchesInlineV1SubscriptionSchedulesPostRequestFormStartDateAnyOf2Xfee5bce1,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormStartDateAnyOf2Xfee5bce1) add("InlineV1SubscriptionSchedulesPostRequestFormStartDateAnyOf2Xfee5bce1: value does not match InlineV1SubscriptionSchedulesPostRequestFormStartDateAnyOf2Xfee5bce1")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
