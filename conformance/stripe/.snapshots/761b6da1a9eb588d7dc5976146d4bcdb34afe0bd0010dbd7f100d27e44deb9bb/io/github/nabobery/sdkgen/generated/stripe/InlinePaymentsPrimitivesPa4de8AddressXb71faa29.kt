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

public enum class InlinePaymentsPrimitivesPa4de8AddressXb71faa29Branch {
  PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress,
}

public sealed class InlinePaymentsPrimitivesPa4de8AddressXb71faa29DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentsPrimitivesPa4de8AddressXb71faa29NoMatchException(
  message: String,
) : InlinePaymentsPrimitivesPa4de8AddressXb71faa29DecodingException(message)

internal data class InlinePaymentsPrimitivesPa4de8AddressXb71faa29Inspection(
  public val matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress).count { it }
}

/**
 * The payer's address
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_klarna_d
 * etails_resource_payer_details/properties/address
 */
@Serializable(with = InlinePaymentsPrimitivesPa4de8AddressXb71faa29.Serializer::class)
public class InlinePaymentsPrimitivesPa4de8AddressXb71faa29 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentsPrimitivesPa4de8AddressXb71faa29Inspection,
) {
  public val paymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress:
      PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddressView?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress) json.decodeFromJsonElement<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddressView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentsPrimitivesPa4de8AddressXb71faa29Branch>
    get() = buildSet {
      if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress) add(InlinePaymentsPrimitivesPa4de8AddressXb71faa29Branch.PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentsPrimitivesPa4de8AddressXb71faa29 {
      val inspection = inspectInlinePaymentsPrimitivesPa4de8AddressXb71faa29(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentsPrimitivesPa4de8AddressXb71faa29NoMatchException("InlinePaymentsPrimitivesPa4de8AddressXb71faa29 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentsPrimitivesPa4de8AddressXb71faa29(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentsPrimitivesPa4de8AddressXb71faa29> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentsPrimitivesPa4de8AddressXb71faa29 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentsPrimitivesPa4de8AddressXb71faa29")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentsPrimitivesPa4de8AddressXb71faa29) {
      encoder.requireJsonEncoder("InlinePaymentsPrimitivesPa4de8AddressXb71faa29").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentsPrimitivesPa4de8AddressXb71faa29(element: JsonElement): InlinePaymentsPrimitivesPa4de8AddressXb71faa29Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentsPrimitivesPa4de8AddressXb71faa29Inspection(
    matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress = false,
    failures = listOf("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress: expected JSON object"),
  )
  val matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress = true
  return InlinePaymentsPrimitivesPa4de8AddressXb71faa29Inspection(
    matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress = matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress,
    failures = buildList {
      if (!matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress) add("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodKlarnaDetailsResourcePayerDetailsResourcePayerDetailsAddress: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
