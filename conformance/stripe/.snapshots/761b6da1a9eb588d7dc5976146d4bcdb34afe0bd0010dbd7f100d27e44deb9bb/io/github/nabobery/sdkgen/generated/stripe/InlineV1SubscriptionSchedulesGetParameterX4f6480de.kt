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

public enum class InlineV1SubscriptionSchedulesGetParameterX4f6480deBranch {
  InlineV1SubscriptionSchedulesGetParameterAnyOf1X6c6d3061,
  Branch2,
}

public sealed class InlineV1SubscriptionSchedulesGetParameterX4f6480deDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesGetParameterX4f6480deNoMatchException(
  message: String,
) : InlineV1SubscriptionSchedulesGetParameterX4f6480deDecodingException(message)

internal data class InlineV1SubscriptionSchedulesGetParameterX4f6480deInspection(
  public val matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1X6c6d3061: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1X6c6d3061, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/get/parameters/8/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/get/parameters/8/schema
 */
@Serializable(with = InlineV1SubscriptionSchedulesGetParameterX4f6480de.Serializer::class)
public class InlineV1SubscriptionSchedulesGetParameterX4f6480de internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionSchedulesGetParameterX4f6480deInspection,
) {
  public val inlineV1SubscriptionSchedulesGetParameterAnyOf1X6c6d3061:
      InlineV1SubscriptionSchedulesGetParameterAnyOf1X6c6d3061? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1X6c6d3061) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesGetParameterAnyOf1X6c6d3061>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1SubscriptionSchedulesGetParameterX4f6480deBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1X6c6d3061) add(InlineV1SubscriptionSchedulesGetParameterX4f6480deBranch.InlineV1SubscriptionSchedulesGetParameterAnyOf1X6c6d3061)
      if (inspection.matchesBranch2) add(InlineV1SubscriptionSchedulesGetParameterX4f6480deBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionSchedulesGetParameterX4f6480de {
      val inspection = inspectInlineV1SubscriptionSchedulesGetParameterX4f6480de(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionSchedulesGetParameterX4f6480deNoMatchException("InlineV1SubscriptionSchedulesGetParameterX4f6480de matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionSchedulesGetParameterX4f6480de(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesGetParameterX4f6480de> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesGetParameterX4f6480de {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesGetParameterX4f6480de")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesGetParameterX4f6480de) {
      encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesGetParameterX4f6480de").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionSchedulesGetParameterX4f6480de(element: JsonElement): InlineV1SubscriptionSchedulesGetParameterX4f6480deInspection {
  val matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1X6c6d3061 = element.isJsonDecodable<InlineV1SubscriptionSchedulesGetParameterAnyOf1X6c6d3061>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1SubscriptionSchedulesGetParameterX4f6480deInspection(
    matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1X6c6d3061 = matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1X6c6d3061,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1SubscriptionSchedulesGetParameterAnyOf1X6c6d3061) add("InlineV1SubscriptionSchedulesGetParameterAnyOf1X6c6d3061: value does not match InlineV1SubscriptionSchedulesGetParameterAnyOf1X6c6d3061")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
