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

public enum class InlineV1SubscriptionsGetParameterXa8e001c1Branch {
  InlineV1SubscriptionsGetParameterAnyOf1Xc3c860aa,
  Branch2,
}

public sealed class InlineV1SubscriptionsGetParameterXa8e001c1DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsGetParameterXa8e001c1NoMatchException(
  message: String,
) : InlineV1SubscriptionsGetParameterXa8e001c1DecodingException(message)

internal data class InlineV1SubscriptionsGetParameterXa8e001c1Inspection(
  public val matchesInlineV1SubscriptionsGetParameterAnyOf1Xc3c860aa: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionsGetParameterAnyOf1Xc3c860aa, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/get/parameters/4/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/get/parameters/4/schema
 */
@Serializable(with = InlineV1SubscriptionsGetParameterXa8e001c1.Serializer::class)
public class InlineV1SubscriptionsGetParameterXa8e001c1 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionsGetParameterXa8e001c1Inspection,
) {
  public val inlineV1SubscriptionsGetParameterAnyOf1Xc3c860aa:
      InlineV1SubscriptionsGetParameterAnyOf1Xc3c860aa? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsGetParameterAnyOf1Xc3c860aa) json.decodeFromJsonElement<InlineV1SubscriptionsGetParameterAnyOf1Xc3c860aa>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1SubscriptionsGetParameterXa8e001c1Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionsGetParameterAnyOf1Xc3c860aa) add(InlineV1SubscriptionsGetParameterXa8e001c1Branch.InlineV1SubscriptionsGetParameterAnyOf1Xc3c860aa)
      if (inspection.matchesBranch2) add(InlineV1SubscriptionsGetParameterXa8e001c1Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsGetParameterXa8e001c1 {
      val inspection = inspectInlineV1SubscriptionsGetParameterXa8e001c1(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsGetParameterXa8e001c1NoMatchException("InlineV1SubscriptionsGetParameterXa8e001c1 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsGetParameterXa8e001c1(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsGetParameterXa8e001c1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsGetParameterXa8e001c1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsGetParameterXa8e001c1")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsGetParameterXa8e001c1) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsGetParameterXa8e001c1").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsGetParameterXa8e001c1(element: JsonElement): InlineV1SubscriptionsGetParameterXa8e001c1Inspection {
  val matchesInlineV1SubscriptionsGetParameterAnyOf1Xc3c860aa = element.isJsonDecodable<InlineV1SubscriptionsGetParameterAnyOf1Xc3c860aa>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1SubscriptionsGetParameterXa8e001c1Inspection(
    matchesInlineV1SubscriptionsGetParameterAnyOf1Xc3c860aa = matchesInlineV1SubscriptionsGetParameterAnyOf1Xc3c860aa,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1SubscriptionsGetParameterAnyOf1Xc3c860aa) add("InlineV1SubscriptionsGetParameterAnyOf1Xc3c860aa: value does not match InlineV1SubscriptionsGetParameterAnyOf1Xc3c860aa")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
