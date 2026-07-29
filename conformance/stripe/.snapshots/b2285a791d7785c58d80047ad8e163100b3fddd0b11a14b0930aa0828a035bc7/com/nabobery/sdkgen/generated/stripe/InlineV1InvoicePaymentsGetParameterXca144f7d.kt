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

public enum class InlineV1InvoicePaymentsGetParameterXca144f7dBranch {
  InlineV1InvoicePaymentsGetParameterAnyOf1X8182f68e,
  Branch2,
}

public sealed class InlineV1InvoicePaymentsGetParameterXca144f7dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicePaymentsGetParameterXca144f7dNoMatchException(
  message: String,
) : InlineV1InvoicePaymentsGetParameterXca144f7dDecodingException(message)

internal data class InlineV1InvoicePaymentsGetParameterXca144f7dInspection(
  public val matchesInlineV1InvoicePaymentsGetParameterAnyOf1X8182f68e: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1InvoicePaymentsGetParameterAnyOf1X8182f68e, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1invoice_payments/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1invoice_payments/get/parameters/0/schema
 */
@Serializable(with = InlineV1InvoicePaymentsGetParameterXca144f7d.Serializer::class)
public class InlineV1InvoicePaymentsGetParameterXca144f7d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1InvoicePaymentsGetParameterXca144f7dInspection,
) {
  public val inlineV1InvoicePaymentsGetParameterAnyOf1X8182f68e:
      InlineV1InvoicePaymentsGetParameterAnyOf1X8182f68e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicePaymentsGetParameterAnyOf1X8182f68e) json.decodeFromJsonElement<InlineV1InvoicePaymentsGetParameterAnyOf1X8182f68e>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1InvoicePaymentsGetParameterXca144f7dBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1InvoicePaymentsGetParameterAnyOf1X8182f68e) add(InlineV1InvoicePaymentsGetParameterXca144f7dBranch.InlineV1InvoicePaymentsGetParameterAnyOf1X8182f68e)
      if (inspection.matchesBranch2) add(InlineV1InvoicePaymentsGetParameterXca144f7dBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicePaymentsGetParameterXca144f7d {
      val inspection = inspectInlineV1InvoicePaymentsGetParameterXca144f7d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicePaymentsGetParameterXca144f7dNoMatchException("InlineV1InvoicePaymentsGetParameterXca144f7d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicePaymentsGetParameterXca144f7d(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicePaymentsGetParameterXca144f7d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicePaymentsGetParameterXca144f7d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicePaymentsGetParameterXca144f7d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicePaymentsGetParameterXca144f7d) {
      encoder.requireJsonEncoder("InlineV1InvoicePaymentsGetParameterXca144f7d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicePaymentsGetParameterXca144f7d(element: JsonElement): InlineV1InvoicePaymentsGetParameterXca144f7dInspection {
  val matchesInlineV1InvoicePaymentsGetParameterAnyOf1X8182f68e = element.isJsonDecodable<InlineV1InvoicePaymentsGetParameterAnyOf1X8182f68e>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1InvoicePaymentsGetParameterXca144f7dInspection(
    matchesInlineV1InvoicePaymentsGetParameterAnyOf1X8182f68e = matchesInlineV1InvoicePaymentsGetParameterAnyOf1X8182f68e,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1InvoicePaymentsGetParameterAnyOf1X8182f68e) add("InlineV1InvoicePaymentsGetParameterAnyOf1X8182f68e: value does not match InlineV1InvoicePaymentsGetParameterAnyOf1X8182f68e")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
