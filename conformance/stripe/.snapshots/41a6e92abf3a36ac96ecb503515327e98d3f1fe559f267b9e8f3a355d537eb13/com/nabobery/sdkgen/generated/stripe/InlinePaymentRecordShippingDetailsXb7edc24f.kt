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

public enum class InlinePaymentRecordShippingDetailsXb7edc24fBranch {
  PaymentsPrimitivesPaymentRecordsResourceShippingDetails,
}

public sealed class InlinePaymentRecordShippingDetailsXb7edc24fDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentRecordShippingDetailsXb7edc24fNoMatchException(
  message: String,
) : InlinePaymentRecordShippingDetailsXb7edc24fDecodingException(message)

internal data class InlinePaymentRecordShippingDetailsXb7edc24fInspection(
  public val matchesPaymentsPrimitivesPaymentRecordsResourceShippingDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentsPrimitivesPaymentRecordsResourceShippingDetails).count { it }
}

/**
 * Shipping information for this payment.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_record/properties/shipping_details
 */
@Serializable(with = InlinePaymentRecordShippingDetailsXb7edc24f.Serializer::class)
public class InlinePaymentRecordShippingDetailsXb7edc24f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentRecordShippingDetailsXb7edc24fInspection,
) {
  public val paymentsPrimitivesPaymentRecordsResourceShippingDetails:
      PaymentsPrimitivesPaymentRecordsResourceShippingDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourceShippingDetails) json.decodeFromJsonElement<PaymentsPrimitivesPaymentRecordsResourceShippingDetailsView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentRecordShippingDetailsXb7edc24fBranch>
    get() = buildSet {
      if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourceShippingDetails) add(InlinePaymentRecordShippingDetailsXb7edc24fBranch.PaymentsPrimitivesPaymentRecordsResourceShippingDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentRecordShippingDetailsXb7edc24f {
      val inspection = inspectInlinePaymentRecordShippingDetailsXb7edc24f(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentRecordShippingDetailsXb7edc24fNoMatchException("InlinePaymentRecordShippingDetailsXb7edc24f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentRecordShippingDetailsXb7edc24f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentRecordShippingDetailsXb7edc24f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentRecordShippingDetailsXb7edc24f {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentRecordShippingDetailsXb7edc24f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentRecordShippingDetailsXb7edc24f) {
      encoder.requireJsonEncoder("InlinePaymentRecordShippingDetailsXb7edc24f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentRecordShippingDetailsXb7edc24f(element: JsonElement): InlinePaymentRecordShippingDetailsXb7edc24fInspection {
  val raw = element as? JsonObject ?: return InlinePaymentRecordShippingDetailsXb7edc24fInspection(
    matchesPaymentsPrimitivesPaymentRecordsResourceShippingDetails = false,
    failures = listOf("PaymentsPrimitivesPaymentRecordsResourceShippingDetails: expected JSON object"),
  )
  val matchesPaymentsPrimitivesPaymentRecordsResourceShippingDetails = raw["address"] != null
  return InlinePaymentRecordShippingDetailsXb7edc24fInspection(
    matchesPaymentsPrimitivesPaymentRecordsResourceShippingDetails = matchesPaymentsPrimitivesPaymentRecordsResourceShippingDetails,
    failures = buildList {
      if (!matchesPaymentsPrimitivesPaymentRecordsResourceShippingDetails) add("PaymentsPrimitivesPaymentRecordsResourceShippingDetails: required properties 'address' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
