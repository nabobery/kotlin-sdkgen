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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlinePaymentMethodDetailsPaymentRecordKlarnaPayerDetailsXfb9186aaBranch {
  PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetails,
}

public sealed class InlinePaymentMethodDetailsPaymentRecordKlarnaPayerDetailsXfb9186aaDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodDetailsPaymentRecordKlarnaPayerDetailsXfb9186aaNoMatchException(
  message: String,
) : InlinePaymentMethodDetailsPaymentRecordKlarnaPayerDetailsXfb9186aaDecodingException(message)

internal data class InlinePaymentMethodDetailsPaymentRecordKlarnaPayerDetailsXfb9186aaInspection(
  public val matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetails:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetails).count { it }
}

/**
 * The payer details for this transaction.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_klarna/properties/payer_detail
 * s
 */
@Serializable(with = InlinePaymentMethodDetailsPaymentRecordKlarnaPayerDetailsXfb9186aa.Serializer::class)
public class InlinePaymentMethodDetailsPaymentRecordKlarnaPayerDetailsXfb9186aa internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlinePaymentMethodDetailsPaymentRecordKlarnaPayerDetailsXfb9186aaInspection,
) {
  public val paymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetails:
      PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetails) json.decodeFromJsonElement<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentMethodDetailsPaymentRecordKlarnaPayerDetailsXfb9186aaBranch>
    get() = buildSet {
      if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetails) add(InlinePaymentMethodDetailsPaymentRecordKlarnaPayerDetailsXfb9186aaBranch.PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodDetailsPaymentRecordKlarnaPayerDetailsXfb9186aa {
      val inspection = inspectInlinePaymentMethodDetailsPaymentRecordKlarnaPayerDetailsXfb9186aa(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodDetailsPaymentRecordKlarnaPayerDetailsXfb9186aaNoMatchException("InlinePaymentMethodDetailsPaymentRecordKlarnaPayerDetailsXfb9186aa matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodDetailsPaymentRecordKlarnaPayerDetailsXfb9186aa(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePaymentMethodDetailsPaymentRecordKlarnaPayerDetailsXfb9186aa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsPaymentRecordKlarnaPayerDetailsXfb9186aa {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodDetailsPaymentRecordKlarnaPayerDetailsXfb9186aa")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsPaymentRecordKlarnaPayerDetailsXfb9186aa) {
      encoder.requireJsonEncoder("InlinePaymentMethodDetailsPaymentRecordKlarnaPayerDetailsXfb9186aa").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodDetailsPaymentRecordKlarnaPayerDetailsXfb9186aa(element: JsonElement): InlinePaymentMethodDetailsPaymentRecordKlarnaPayerDetailsXfb9186aaInspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodDetailsPaymentRecordKlarnaPayerDetailsXfb9186aaInspection(
    matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetails = false,
    failures = listOf("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetails: expected JSON object"),
  )
  val matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetails = true
  return InlinePaymentMethodDetailsPaymentRecordKlarnaPayerDetailsXfb9186aaInspection(
    matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetails = matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetails,
    failures = buildList {
      if (!matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetails) add("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetails: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
