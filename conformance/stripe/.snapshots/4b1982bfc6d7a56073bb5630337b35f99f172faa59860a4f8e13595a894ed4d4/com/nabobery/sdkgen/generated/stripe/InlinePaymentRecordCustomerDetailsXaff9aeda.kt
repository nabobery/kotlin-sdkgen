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

public enum class InlinePaymentRecordCustomerDetailsXaff9aedaBranch {
  PaymentsPrimitivesPaymentRecordsResourceCustomerDetails,
}

public sealed class InlinePaymentRecordCustomerDetailsXaff9aedaDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentRecordCustomerDetailsXaff9aedaNoMatchException(
  message: String,
) : InlinePaymentRecordCustomerDetailsXaff9aedaDecodingException(message)

internal data class InlinePaymentRecordCustomerDetailsXaff9aedaInspection(
  public val matchesPaymentsPrimitivesPaymentRecordsResourceCustomerDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentsPrimitivesPaymentRecordsResourceCustomerDetails).count { it }
}

/**
 * Customer information for this payment.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_record/properties/customer_details
 */
@Serializable(with = InlinePaymentRecordCustomerDetailsXaff9aeda.Serializer::class)
public class InlinePaymentRecordCustomerDetailsXaff9aeda internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentRecordCustomerDetailsXaff9aedaInspection,
) {
  public val paymentsPrimitivesPaymentRecordsResourceCustomerDetails:
      PaymentsPrimitivesPaymentRecordsResourceCustomerDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourceCustomerDetails) json.decodeFromJsonElement<PaymentsPrimitivesPaymentRecordsResourceCustomerDetailsView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentRecordCustomerDetailsXaff9aedaBranch>
    get() = buildSet {
      if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourceCustomerDetails) add(InlinePaymentRecordCustomerDetailsXaff9aedaBranch.PaymentsPrimitivesPaymentRecordsResourceCustomerDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentRecordCustomerDetailsXaff9aeda {
      val inspection = inspectInlinePaymentRecordCustomerDetailsXaff9aeda(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentRecordCustomerDetailsXaff9aedaNoMatchException("InlinePaymentRecordCustomerDetailsXaff9aeda matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentRecordCustomerDetailsXaff9aeda(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentRecordCustomerDetailsXaff9aeda> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentRecordCustomerDetailsXaff9aeda {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentRecordCustomerDetailsXaff9aeda")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentRecordCustomerDetailsXaff9aeda) {
      encoder.requireJsonEncoder("InlinePaymentRecordCustomerDetailsXaff9aeda").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentRecordCustomerDetailsXaff9aeda(element: JsonElement): InlinePaymentRecordCustomerDetailsXaff9aedaInspection {
  val raw = element as? JsonObject ?: return InlinePaymentRecordCustomerDetailsXaff9aedaInspection(
    matchesPaymentsPrimitivesPaymentRecordsResourceCustomerDetails = false,
    failures = listOf("PaymentsPrimitivesPaymentRecordsResourceCustomerDetails: expected JSON object"),
  )
  val matchesPaymentsPrimitivesPaymentRecordsResourceCustomerDetails = true
  return InlinePaymentRecordCustomerDetailsXaff9aedaInspection(
    matchesPaymentsPrimitivesPaymentRecordsResourceCustomerDetails = matchesPaymentsPrimitivesPaymentRecordsResourceCustomerDetails,
    failures = buildList {
      if (!matchesPaymentsPrimitivesPaymentRecordsResourceCustomerDetails) add("PaymentsPrimitivesPaymentRecordsResourceCustomerDetails: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
