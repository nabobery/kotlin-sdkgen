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

public enum class InlineV1InvoiceitemsGetParameterX80f313b4Branch {
  InlineV1InvoiceitemsGetParameterAnyOf1X473e4023,
  Branch2,
}

public sealed class InlineV1InvoiceitemsGetParameterX80f313b4DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoiceitemsGetParameterX80f313b4NoMatchException(
  message: String,
) : InlineV1InvoiceitemsGetParameterX80f313b4DecodingException(message)

internal data class InlineV1InvoiceitemsGetParameterX80f313b4Inspection(
  public val matchesInlineV1InvoiceitemsGetParameterAnyOf1X473e4023: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1InvoiceitemsGetParameterAnyOf1X473e4023, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1invoiceitems/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1invoiceitems/get/parameters/0/schema
 */
@Serializable(with = InlineV1InvoiceitemsGetParameterX80f313b4.Serializer::class)
public class InlineV1InvoiceitemsGetParameterX80f313b4 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1InvoiceitemsGetParameterX80f313b4Inspection,
) {
  public val inlineV1InvoiceitemsGetParameterAnyOf1X473e4023:
      InlineV1InvoiceitemsGetParameterAnyOf1X473e4023? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoiceitemsGetParameterAnyOf1X473e4023) json.decodeFromJsonElement<InlineV1InvoiceitemsGetParameterAnyOf1X473e4023>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1InvoiceitemsGetParameterX80f313b4Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1InvoiceitemsGetParameterAnyOf1X473e4023) add(InlineV1InvoiceitemsGetParameterX80f313b4Branch.InlineV1InvoiceitemsGetParameterAnyOf1X473e4023)
      if (inspection.matchesBranch2) add(InlineV1InvoiceitemsGetParameterX80f313b4Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoiceitemsGetParameterX80f313b4 {
      val inspection = inspectInlineV1InvoiceitemsGetParameterX80f313b4(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoiceitemsGetParameterX80f313b4NoMatchException("InlineV1InvoiceitemsGetParameterX80f313b4 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoiceitemsGetParameterX80f313b4(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoiceitemsGetParameterX80f313b4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoiceitemsGetParameterX80f313b4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoiceitemsGetParameterX80f313b4")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoiceitemsGetParameterX80f313b4) {
      encoder.requireJsonEncoder("InlineV1InvoiceitemsGetParameterX80f313b4").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoiceitemsGetParameterX80f313b4(element: JsonElement): InlineV1InvoiceitemsGetParameterX80f313b4Inspection {
  val matchesInlineV1InvoiceitemsGetParameterAnyOf1X473e4023 = element.isJsonDecodable<InlineV1InvoiceitemsGetParameterAnyOf1X473e4023>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1InvoiceitemsGetParameterX80f313b4Inspection(
    matchesInlineV1InvoiceitemsGetParameterAnyOf1X473e4023 = matchesInlineV1InvoiceitemsGetParameterAnyOf1X473e4023,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1InvoiceitemsGetParameterAnyOf1X473e4023) add("InlineV1InvoiceitemsGetParameterAnyOf1X473e4023: value does not match InlineV1InvoiceitemsGetParameterAnyOf1X473e4023")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
