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

public enum class InlineV1InvoicesPostRequestFormTransferDataXbe331fccBranch {
  InlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf,
  InlineV1InvoicesPostRequestFormTransferDataAnyOf2X1dc9323f,
}

public sealed class InlineV1InvoicesPostRequestFormTransferDataXbe331fccDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormTransferDataXbe331fccNoMatchException(
  message: String,
) : InlineV1InvoicesPostRequestFormTransferDataXbe331fccDecodingException(message)

internal data class InlineV1InvoicesPostRequestFormTransferDataXbe331fccInspection(
  public val matchesInlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf: Boolean,
  public val matchesInlineV1InvoicesPostRequestFormTransferDataAnyOf2X1dc9323f: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf, matchesInlineV1InvoicesPostRequestFormTransferDataAnyOf2X1dc9323f).count { it }
}

/**
 * If specified, the funds from the invoice will be transferred to the destination and the ID of the resulting transfer
 * will be found on the invoice's charge. This will be unset if you POST an empty value.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/transfer_data
 */
@Serializable(with = InlineV1InvoicesPostRequestFormTransferDataXbe331fcc.Serializer::class)
public class InlineV1InvoicesPostRequestFormTransferDataXbe331fcc internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1InvoicesPostRequestFormTransferDataXbe331fccInspection,
) {
  public val inlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf:
      InlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf>(raw) else null }

  public val inlineV1InvoicesPostRequestFormTransferDataAnyOf2X1dc9323f:
      InlineV1InvoicesPostRequestFormTransferDataAnyOf2X1dc9323f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormTransferDataAnyOf2X1dc9323f) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormTransferDataAnyOf2X1dc9323f>(raw) else null }

  public val matchedBranches: Set<InlineV1InvoicesPostRequestFormTransferDataXbe331fccBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf) add(InlineV1InvoicesPostRequestFormTransferDataXbe331fccBranch.InlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf)
      if (inspection.matchesInlineV1InvoicesPostRequestFormTransferDataAnyOf2X1dc9323f) add(InlineV1InvoicesPostRequestFormTransferDataXbe331fccBranch.InlineV1InvoicesPostRequestFormTransferDataAnyOf2X1dc9323f)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesPostRequestFormTransferDataXbe331fcc {
      val inspection = inspectInlineV1InvoicesPostRequestFormTransferDataXbe331fcc(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesPostRequestFormTransferDataXbe331fccNoMatchException("InlineV1InvoicesPostRequestFormTransferDataXbe331fcc matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesPostRequestFormTransferDataXbe331fcc(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormTransferDataXbe331fcc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormTransferDataXbe331fcc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormTransferDataXbe331fcc")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormTransferDataXbe331fcc) {
      encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormTransferDataXbe331fcc").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesPostRequestFormTransferDataXbe331fcc(element: JsonElement): InlineV1InvoicesPostRequestFormTransferDataXbe331fccInspection {
  val matchesInlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf = element.isJsonDecodable<InlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf>()
  val matchesInlineV1InvoicesPostRequestFormTransferDataAnyOf2X1dc9323f = element.isJsonDecodable<InlineV1InvoicesPostRequestFormTransferDataAnyOf2X1dc9323f>()
  return InlineV1InvoicesPostRequestFormTransferDataXbe331fccInspection(
    matchesInlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf = matchesInlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf,
    matchesInlineV1InvoicesPostRequestFormTransferDataAnyOf2X1dc9323f = matchesInlineV1InvoicesPostRequestFormTransferDataAnyOf2X1dc9323f,
    failures = buildList {
      if (!matchesInlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf) add("InlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf: value does not match InlineV1InvoicesPostRequestFormTransferDataAnyOf1X605738cf")
      if (!matchesInlineV1InvoicesPostRequestFormTransferDataAnyOf2X1dc9323f) add("InlineV1InvoicesPostRequestFormTransferDataAnyOf2X1dc9323f: value does not match InlineV1InvoicesPostRequestFormTransferDataAnyOf2X1dc9323f")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
