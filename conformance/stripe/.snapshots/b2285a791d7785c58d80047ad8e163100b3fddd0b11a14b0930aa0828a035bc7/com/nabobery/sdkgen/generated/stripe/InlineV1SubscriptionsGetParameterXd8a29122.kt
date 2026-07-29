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

public enum class InlineV1SubscriptionsGetParameterXd8a29122Branch {
  InlineV1SubscriptionsGetParameterAnyOf1X7fdd0ed9,
  Branch2,
}

public sealed class InlineV1SubscriptionsGetParameterXd8a29122DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsGetParameterXd8a29122NoMatchException(
  message: String,
) : InlineV1SubscriptionsGetParameterXd8a29122DecodingException(message)

internal data class InlineV1SubscriptionsGetParameterXd8a29122Inspection(
  public val matchesInlineV1SubscriptionsGetParameterAnyOf1X7fdd0ed9: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionsGetParameterAnyOf1X7fdd0ed9, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/get/parameters/3/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/get/parameters/3/schema
 */
@Serializable(with = InlineV1SubscriptionsGetParameterXd8a29122.Serializer::class)
public class InlineV1SubscriptionsGetParameterXd8a29122 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionsGetParameterXd8a29122Inspection,
) {
  public val inlineV1SubscriptionsGetParameterAnyOf1X7fdd0ed9:
      InlineV1SubscriptionsGetParameterAnyOf1X7fdd0ed9? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsGetParameterAnyOf1X7fdd0ed9) json.decodeFromJsonElement<InlineV1SubscriptionsGetParameterAnyOf1X7fdd0ed9>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1SubscriptionsGetParameterXd8a29122Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionsGetParameterAnyOf1X7fdd0ed9) add(InlineV1SubscriptionsGetParameterXd8a29122Branch.InlineV1SubscriptionsGetParameterAnyOf1X7fdd0ed9)
      if (inspection.matchesBranch2) add(InlineV1SubscriptionsGetParameterXd8a29122Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsGetParameterXd8a29122 {
      val inspection = inspectInlineV1SubscriptionsGetParameterXd8a29122(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsGetParameterXd8a29122NoMatchException("InlineV1SubscriptionsGetParameterXd8a29122 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsGetParameterXd8a29122(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsGetParameterXd8a29122> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsGetParameterXd8a29122 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsGetParameterXd8a29122")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsGetParameterXd8a29122) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsGetParameterXd8a29122").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsGetParameterXd8a29122(element: JsonElement): InlineV1SubscriptionsGetParameterXd8a29122Inspection {
  val matchesInlineV1SubscriptionsGetParameterAnyOf1X7fdd0ed9 = element.isJsonDecodable<InlineV1SubscriptionsGetParameterAnyOf1X7fdd0ed9>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1SubscriptionsGetParameterXd8a29122Inspection(
    matchesInlineV1SubscriptionsGetParameterAnyOf1X7fdd0ed9 = matchesInlineV1SubscriptionsGetParameterAnyOf1X7fdd0ed9,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1SubscriptionsGetParameterAnyOf1X7fdd0ed9) add("InlineV1SubscriptionsGetParameterAnyOf1X7fdd0ed9: value does not match InlineV1SubscriptionsGetParameterAnyOf1X7fdd0ed9")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
