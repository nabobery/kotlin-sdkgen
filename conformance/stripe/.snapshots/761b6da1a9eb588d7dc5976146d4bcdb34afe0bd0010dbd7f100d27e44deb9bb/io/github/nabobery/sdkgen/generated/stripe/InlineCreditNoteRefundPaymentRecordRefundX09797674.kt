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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineCreditNoteRefundPaymentRecordRefundX09797674Branch {
  CreditNotesPaymentRecordRefund,
}

public sealed class InlineCreditNoteRefundPaymentRecordRefundX09797674DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCreditNoteRefundPaymentRecordRefundX09797674NoMatchException(
  message: String,
) : InlineCreditNoteRefundPaymentRecordRefundX09797674DecodingException(message)

internal data class InlineCreditNoteRefundPaymentRecordRefundX09797674Inspection(
  public val matchesCreditNotesPaymentRecordRefund: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesCreditNotesPaymentRecordRefund).count { it }
}

/**
 * The PaymentRecord refund details associated with this credit note refund.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/credit_note_refund/properties/payment_record_refund
 */
@Serializable(with = InlineCreditNoteRefundPaymentRecordRefundX09797674.Serializer::class)
public class InlineCreditNoteRefundPaymentRecordRefundX09797674 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCreditNoteRefundPaymentRecordRefundX09797674Inspection,
) {
  public val creditNotesPaymentRecordRefund: CreditNotesPaymentRecordRefundView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCreditNotesPaymentRecordRefund) json.decodeFromJsonElement<CreditNotesPaymentRecordRefundView>(raw) else null }

  public val matchedBranches: Set<InlineCreditNoteRefundPaymentRecordRefundX09797674Branch>
    get() = buildSet {
      if (inspection.matchesCreditNotesPaymentRecordRefund) add(InlineCreditNoteRefundPaymentRecordRefundX09797674Branch.CreditNotesPaymentRecordRefund)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCreditNoteRefundPaymentRecordRefundX09797674 {
      val inspection = inspectInlineCreditNoteRefundPaymentRecordRefundX09797674(raw)
      if (inspection.matchCount == 0) {
        throw InlineCreditNoteRefundPaymentRecordRefundX09797674NoMatchException("InlineCreditNoteRefundPaymentRecordRefundX09797674 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCreditNoteRefundPaymentRecordRefundX09797674(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineCreditNoteRefundPaymentRecordRefundX09797674> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCreditNoteRefundPaymentRecordRefundX09797674 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCreditNoteRefundPaymentRecordRefundX09797674")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCreditNoteRefundPaymentRecordRefundX09797674) {
      encoder.requireJsonEncoder("InlineCreditNoteRefundPaymentRecordRefundX09797674").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCreditNoteRefundPaymentRecordRefundX09797674(element: JsonElement): InlineCreditNoteRefundPaymentRecordRefundX09797674Inspection {
  val raw = element as? JsonObject ?: return InlineCreditNoteRefundPaymentRecordRefundX09797674Inspection(
    matchesCreditNotesPaymentRecordRefund = false,
    failures = listOf("CreditNotesPaymentRecordRefund: expected JSON object"),
  )
  val matchesCreditNotesPaymentRecordRefund = raw["payment_record"].isString() && raw["refund_group"].isString()
  return InlineCreditNoteRefundPaymentRecordRefundX09797674Inspection(
    matchesCreditNotesPaymentRecordRefund = matchesCreditNotesPaymentRecordRefund,
    failures = buildList {
      if (!matchesCreditNotesPaymentRecordRefund) add("CreditNotesPaymentRecordRefund: required properties 'payment_record', 'refund_group' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
