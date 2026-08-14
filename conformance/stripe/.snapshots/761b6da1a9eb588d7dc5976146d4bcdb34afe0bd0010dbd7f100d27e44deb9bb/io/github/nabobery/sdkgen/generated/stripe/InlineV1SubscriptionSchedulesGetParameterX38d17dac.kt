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

public enum class InlineV1SubscriptionSchedulesGetParameterX38d17dacBranch {
  InlineV1SubscriptionSchedulesGetParameterAnyOf1Xc46da545,
  Branch2,
}

public sealed class InlineV1SubscriptionSchedulesGetParameterX38d17dacDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesGetParameterX38d17dacNoMatchException(
  message: String,
) : InlineV1SubscriptionSchedulesGetParameterX38d17dacDecodingException(message)

internal data class InlineV1SubscriptionSchedulesGetParameterX38d17dacInspection(
  public val matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1Xc46da545: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1Xc46da545, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/get/parameters/0/schema
 */
@Serializable(with = InlineV1SubscriptionSchedulesGetParameterX38d17dac.Serializer::class)
public class InlineV1SubscriptionSchedulesGetParameterX38d17dac internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionSchedulesGetParameterX38d17dacInspection,
) {
  public val inlineV1SubscriptionSchedulesGetParameterAnyOf1Xc46da545:
      InlineV1SubscriptionSchedulesGetParameterAnyOf1Xc46da545? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1Xc46da545) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesGetParameterAnyOf1Xc46da545>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1SubscriptionSchedulesGetParameterX38d17dacBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1Xc46da545) add(InlineV1SubscriptionSchedulesGetParameterX38d17dacBranch.InlineV1SubscriptionSchedulesGetParameterAnyOf1Xc46da545)
      if (inspection.matchesBranch2) add(InlineV1SubscriptionSchedulesGetParameterX38d17dacBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionSchedulesGetParameterX38d17dac {
      val inspection = inspectInlineV1SubscriptionSchedulesGetParameterX38d17dac(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionSchedulesGetParameterX38d17dacNoMatchException("InlineV1SubscriptionSchedulesGetParameterX38d17dac matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionSchedulesGetParameterX38d17dac(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesGetParameterX38d17dac> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesGetParameterX38d17dac {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesGetParameterX38d17dac")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesGetParameterX38d17dac) {
      encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesGetParameterX38d17dac").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionSchedulesGetParameterX38d17dac(element: JsonElement): InlineV1SubscriptionSchedulesGetParameterX38d17dacInspection {
  val matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1Xc46da545 = element.isJsonDecodable<InlineV1SubscriptionSchedulesGetParameterAnyOf1Xc46da545>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1SubscriptionSchedulesGetParameterX38d17dacInspection(
    matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1Xc46da545 = matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1Xc46da545,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1Xc46da545) add("InlineV1SubscriptionSchedulesGetParameterAnyOf1Xc46da545: value does not match InlineV1SubscriptionSchedulesGetParameterAnyOf1Xc46da545")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
