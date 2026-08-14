package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndXcd12e5caBranch {
  Branch1,
  InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndAnyOf2Xde110929,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndXcd12e5caDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndXcd12e5caNoMatchException(
  message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndXcd12e5caDecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndXcd12e5caInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndAnyOf2Xde110929:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndAnyOf2Xde110929).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/trial_end.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/trial_end
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndXcd12e5ca.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndXcd12e5ca internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndXcd12e5caInspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndAnyOf2Xde110929:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndAnyOf2Xde110929? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndAnyOf2Xde110929) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndAnyOf2Xde110929>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndXcd12e5caBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndXcd12e5caBranch.Branch1)
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndAnyOf2Xde110929) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndXcd12e5caBranch.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndAnyOf2Xde110929)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndXcd12e5ca {
      val inspection = inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndXcd12e5ca(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndXcd12e5caNoMatchException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndXcd12e5ca matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndXcd12e5ca(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndXcd12e5ca> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndXcd12e5ca {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndXcd12e5ca")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndXcd12e5ca) {
      encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndXcd12e5ca").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndXcd12e5ca(element: JsonElement): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndXcd12e5caInspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndAnyOf2Xde110929 = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndAnyOf2Xde110929>()
  return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndXcd12e5caInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndAnyOf2Xde110929 = matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndAnyOf2Xde110929,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndAnyOf2Xde110929) add("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndAnyOf2Xde110929: value does not match InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndAnyOf2Xde110929")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
