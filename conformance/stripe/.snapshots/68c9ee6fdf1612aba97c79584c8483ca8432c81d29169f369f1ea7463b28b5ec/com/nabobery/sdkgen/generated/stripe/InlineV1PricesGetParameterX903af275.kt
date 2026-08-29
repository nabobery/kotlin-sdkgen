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

public enum class InlineV1PricesGetParameterX903af275Branch {
  InlineV1PricesGetParameterAnyOf1X0dfb8bec,
  Branch2,
}

public sealed class InlineV1PricesGetParameterX903af275DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PricesGetParameterX903af275NoMatchException(
  message: String,
) : InlineV1PricesGetParameterX903af275DecodingException(message)

internal data class InlineV1PricesGetParameterX903af275Inspection(
  public val matchesInlineV1PricesGetParameterAnyOf1X0dfb8bec: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PricesGetParameterAnyOf1X0dfb8bec, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1prices/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1prices/get/parameters/1/schema
 */
@Serializable(with = InlineV1PricesGetParameterX903af275.Serializer::class)
public class InlineV1PricesGetParameterX903af275 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PricesGetParameterX903af275Inspection,
) {
  public val inlineV1PricesGetParameterAnyOf1X0dfb8bec: InlineV1PricesGetParameterAnyOf1X0dfb8bec?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PricesGetParameterAnyOf1X0dfb8bec) json.decodeFromJsonElement<InlineV1PricesGetParameterAnyOf1X0dfb8bec>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1PricesGetParameterX903af275Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PricesGetParameterAnyOf1X0dfb8bec) add(InlineV1PricesGetParameterX903af275Branch.InlineV1PricesGetParameterAnyOf1X0dfb8bec)
      if (inspection.matchesBranch2) add(InlineV1PricesGetParameterX903af275Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PricesGetParameterX903af275 {
      val inspection = inspectInlineV1PricesGetParameterX903af275(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PricesGetParameterX903af275NoMatchException("InlineV1PricesGetParameterX903af275 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PricesGetParameterX903af275(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PricesGetParameterX903af275> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PricesGetParameterX903af275 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PricesGetParameterX903af275")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PricesGetParameterX903af275) {
      encoder.requireJsonEncoder("InlineV1PricesGetParameterX903af275").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PricesGetParameterX903af275(element: JsonElement): InlineV1PricesGetParameterX903af275Inspection {
  val matchesInlineV1PricesGetParameterAnyOf1X0dfb8bec = element.isJsonDecodable<InlineV1PricesGetParameterAnyOf1X0dfb8bec>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1PricesGetParameterX903af275Inspection(
    matchesInlineV1PricesGetParameterAnyOf1X0dfb8bec = matchesInlineV1PricesGetParameterAnyOf1X0dfb8bec,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1PricesGetParameterAnyOf1X0dfb8bec) add("InlineV1PricesGetParameterAnyOf1X0dfb8bec: value does not match InlineV1PricesGetParameterAnyOf1X0dfb8bec")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
