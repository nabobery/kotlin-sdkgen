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

public enum class InlineCreditNoteRefundRefundXba063e78Branch {
  Branch1,
  Refund,
}

public sealed class InlineCreditNoteRefundRefundXba063e78DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCreditNoteRefundRefundXba063e78NoMatchException(
  message: String,
) : InlineCreditNoteRefundRefundXba063e78DecodingException(message)

internal data class InlineCreditNoteRefundRefundXba063e78Inspection(
  public val matchesBranch1: Boolean,
  public val matchesRefund: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesRefund).count { it }
}

/**
 * ID of the refund.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/credit_note_refund/properties/refund
 */
@Serializable(with = InlineCreditNoteRefundRefundXba063e78.Serializer::class)
public class InlineCreditNoteRefundRefundXba063e78 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCreditNoteRefundRefundXba063e78Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val refund: Refund? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesRefund) json.decodeFromJsonElement<Refund>(raw) else null }

  public val matchedBranches: Set<InlineCreditNoteRefundRefundXba063e78Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineCreditNoteRefundRefundXba063e78Branch.Branch1)
      if (inspection.matchesRefund) add(InlineCreditNoteRefundRefundXba063e78Branch.Refund)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCreditNoteRefundRefundXba063e78 {
      val inspection = inspectInlineCreditNoteRefundRefundXba063e78(raw)
      if (inspection.matchCount == 0) {
        throw InlineCreditNoteRefundRefundXba063e78NoMatchException("InlineCreditNoteRefundRefundXba063e78 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCreditNoteRefundRefundXba063e78(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineCreditNoteRefundRefundXba063e78> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCreditNoteRefundRefundXba063e78 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCreditNoteRefundRefundXba063e78")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCreditNoteRefundRefundXba063e78) {
      encoder.requireJsonEncoder("InlineCreditNoteRefundRefundXba063e78").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCreditNoteRefundRefundXba063e78(element: JsonElement): InlineCreditNoteRefundRefundXba063e78Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesRefund = element.isJsonDecodable<Refund>()
  return InlineCreditNoteRefundRefundXba063e78Inspection(
    matchesBranch1 = matchesBranch1,
    matchesRefund = matchesRefund,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesRefund) add("Refund: value does not match Refund")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
