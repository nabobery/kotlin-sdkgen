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

public enum class InlinePaymentsPrimitivesPa1a22BillingDetailsX93fd2d12Branch {
  PaymentsPrimitivesPaymentRecordsResourceBillingDetails,
}

public sealed class InlinePaymentsPrimitivesPa1a22BillingDetailsX93fd2d12DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentsPrimitivesPa1a22BillingDetailsX93fd2d12NoMatchException(
  message: String,
) : InlinePaymentsPrimitivesPa1a22BillingDetailsX93fd2d12DecodingException(message)

internal data class InlinePaymentsPrimitivesPa1a22BillingDetailsX93fd2d12Inspection(
  public val matchesPaymentsPrimitivesPaymentRecordsResourceBillingDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentsPrimitivesPaymentRecordsResourceBillingDetails).count { it }
}

/**
 * The billing details associated with the method of payment.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_details/
 * properties/billing_details
 */
@Serializable(with = InlinePaymentsPrimitivesPa1a22BillingDetailsX93fd2d12.Serializer::class)
public class InlinePaymentsPrimitivesPa1a22BillingDetailsX93fd2d12 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentsPrimitivesPa1a22BillingDetailsX93fd2d12Inspection,
) {
  public val paymentsPrimitivesPaymentRecordsResourceBillingDetails:
      PaymentsPrimitivesPaymentRecordsResourceBillingDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourceBillingDetails) json.decodeFromJsonElement<PaymentsPrimitivesPaymentRecordsResourceBillingDetailsView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentsPrimitivesPa1a22BillingDetailsX93fd2d12Branch>
    get() = buildSet {
      if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourceBillingDetails) add(InlinePaymentsPrimitivesPa1a22BillingDetailsX93fd2d12Branch.PaymentsPrimitivesPaymentRecordsResourceBillingDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentsPrimitivesPa1a22BillingDetailsX93fd2d12 {
      val inspection = inspectInlinePaymentsPrimitivesPa1a22BillingDetailsX93fd2d12(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentsPrimitivesPa1a22BillingDetailsX93fd2d12NoMatchException("InlinePaymentsPrimitivesPa1a22BillingDetailsX93fd2d12 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentsPrimitivesPa1a22BillingDetailsX93fd2d12(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentsPrimitivesPa1a22BillingDetailsX93fd2d12> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentsPrimitivesPa1a22BillingDetailsX93fd2d12 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentsPrimitivesPa1a22BillingDetailsX93fd2d12")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentsPrimitivesPa1a22BillingDetailsX93fd2d12) {
      encoder.requireJsonEncoder("InlinePaymentsPrimitivesPa1a22BillingDetailsX93fd2d12").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentsPrimitivesPa1a22BillingDetailsX93fd2d12(element: JsonElement): InlinePaymentsPrimitivesPa1a22BillingDetailsX93fd2d12Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentsPrimitivesPa1a22BillingDetailsX93fd2d12Inspection(
    matchesPaymentsPrimitivesPaymentRecordsResourceBillingDetails = false,
    failures = listOf("PaymentsPrimitivesPaymentRecordsResourceBillingDetails: expected JSON object"),
  )
  val matchesPaymentsPrimitivesPaymentRecordsResourceBillingDetails = raw["address"] != null
  return InlinePaymentsPrimitivesPa1a22BillingDetailsX93fd2d12Inspection(
    matchesPaymentsPrimitivesPaymentRecordsResourceBillingDetails = matchesPaymentsPrimitivesPaymentRecordsResourceBillingDetails,
    failures = buildList {
      if (!matchesPaymentsPrimitivesPaymentRecordsResourceBillingDetails) add("PaymentsPrimitivesPaymentRecordsResourceBillingDetails: required properties 'address' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
