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

public enum class InlineV1InvoicesPostRequestFormDefaultSourceX1d88b167Branch {
  Branch1,
  InlineV1InvoicesPostRequestFormDefaultSourceAnyOf2Xf2ff13a6,
}

public sealed class InlineV1InvoicesPostRequestFormDefaultSourceX1d88b167DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormDefaultSourceX1d88b167NoMatchException(
  message: String,
) : InlineV1InvoicesPostRequestFormDefaultSourceX1d88b167DecodingException(message)

internal data class InlineV1InvoicesPostRequestFormDefaultSourceX1d88b167Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesPostRequestFormDefaultSourceAnyOf2Xf2ff13a6: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesPostRequestFormDefaultSourceAnyOf2Xf2ff13a6).count { it }
}

/**
 * ID of the default payment source for the invoice. It must belong to the customer associated with the invoice and be
 * in a chargeable state. If not set, defaults to the subscription's default source, if any, or to the customer's
 * default source.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/default_source
 */
@Serializable(with = InlineV1InvoicesPostRequestFormDefaultSourceX1d88b167.Serializer::class)
public class InlineV1InvoicesPostRequestFormDefaultSourceX1d88b167 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1InvoicesPostRequestFormDefaultSourceX1d88b167Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1InvoicesPostRequestFormDefaultSourceAnyOf2Xf2ff13a6:
      InlineV1InvoicesPostRequestFormDefaultSourceAnyOf2Xf2ff13a6? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormDefaultSourceAnyOf2Xf2ff13a6) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormDefaultSourceAnyOf2Xf2ff13a6>(raw) else null }

  public val matchedBranches: Set<InlineV1InvoicesPostRequestFormDefaultSourceX1d88b167Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesPostRequestFormDefaultSourceX1d88b167Branch.Branch1)
      if (inspection.matchesInlineV1InvoicesPostRequestFormDefaultSourceAnyOf2Xf2ff13a6) add(InlineV1InvoicesPostRequestFormDefaultSourceX1d88b167Branch.InlineV1InvoicesPostRequestFormDefaultSourceAnyOf2Xf2ff13a6)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesPostRequestFormDefaultSourceX1d88b167 {
      val inspection = inspectInlineV1InvoicesPostRequestFormDefaultSourceX1d88b167(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesPostRequestFormDefaultSourceX1d88b167NoMatchException("InlineV1InvoicesPostRequestFormDefaultSourceX1d88b167 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesPostRequestFormDefaultSourceX1d88b167(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormDefaultSourceX1d88b167> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormDefaultSourceX1d88b167 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormDefaultSourceX1d88b167")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormDefaultSourceX1d88b167) {
      encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormDefaultSourceX1d88b167").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesPostRequestFormDefaultSourceX1d88b167(element: JsonElement): InlineV1InvoicesPostRequestFormDefaultSourceX1d88b167Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1InvoicesPostRequestFormDefaultSourceAnyOf2Xf2ff13a6 = element.isJsonDecodable<InlineV1InvoicesPostRequestFormDefaultSourceAnyOf2Xf2ff13a6>()
  return InlineV1InvoicesPostRequestFormDefaultSourceX1d88b167Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesPostRequestFormDefaultSourceAnyOf2Xf2ff13a6 = matchesInlineV1InvoicesPostRequestFormDefaultSourceAnyOf2Xf2ff13a6,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1InvoicesPostRequestFormDefaultSourceAnyOf2Xf2ff13a6) add("InlineV1InvoicesPostRequestFormDefaultSourceAnyOf2Xf2ff13a6: value does not match InlineV1InvoicesPostRequestFormDefaultSourceAnyOf2Xf2ff13a6")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
