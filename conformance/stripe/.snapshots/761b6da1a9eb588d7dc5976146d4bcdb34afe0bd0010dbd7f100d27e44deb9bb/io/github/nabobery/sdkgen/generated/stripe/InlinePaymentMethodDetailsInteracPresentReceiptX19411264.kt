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

public enum class InlinePaymentMethodDetailsInteracPresentReceiptX19411264Branch {
  PaymentMethodDetailsInteracPresentReceipt,
}

public sealed class InlinePaymentMethodDetailsInteracPresentReceiptX19411264DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodDetailsInteracPresentReceiptX19411264NoMatchException(
  message: String,
) : InlinePaymentMethodDetailsInteracPresentReceiptX19411264DecodingException(message)

internal data class InlinePaymentMethodDetailsInteracPresentReceiptX19411264Inspection(
  public val matchesPaymentMethodDetailsInteracPresentReceipt: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentMethodDetailsInteracPresentReceipt).count { it }
}

/**
 * A collection of fields required to be displayed on receipts. Only required for EMV transactions.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_interac_present/properties/receipt
 */
@Serializable(with = InlinePaymentMethodDetailsInteracPresentReceiptX19411264.Serializer::class)
public class InlinePaymentMethodDetailsInteracPresentReceiptX19411264 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentMethodDetailsInteracPresentReceiptX19411264Inspection,
) {
  public val paymentMethodDetailsInteracPresentReceipt:
      PaymentMethodDetailsInteracPresentReceiptView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethodDetailsInteracPresentReceipt) json.decodeFromJsonElement<PaymentMethodDetailsInteracPresentReceiptView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentMethodDetailsInteracPresentReceiptX19411264Branch>
    get() = buildSet {
      if (inspection.matchesPaymentMethodDetailsInteracPresentReceipt) add(InlinePaymentMethodDetailsInteracPresentReceiptX19411264Branch.PaymentMethodDetailsInteracPresentReceipt)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodDetailsInteracPresentReceiptX19411264 {
      val inspection = inspectInlinePaymentMethodDetailsInteracPresentReceiptX19411264(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodDetailsInteracPresentReceiptX19411264NoMatchException("InlinePaymentMethodDetailsInteracPresentReceiptX19411264 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodDetailsInteracPresentReceiptX19411264(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodDetailsInteracPresentReceiptX19411264> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsInteracPresentReceiptX19411264 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodDetailsInteracPresentReceiptX19411264")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsInteracPresentReceiptX19411264) {
      encoder.requireJsonEncoder("InlinePaymentMethodDetailsInteracPresentReceiptX19411264").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodDetailsInteracPresentReceiptX19411264(element: JsonElement): InlinePaymentMethodDetailsInteracPresentReceiptX19411264Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodDetailsInteracPresentReceiptX19411264Inspection(
    matchesPaymentMethodDetailsInteracPresentReceipt = false,
    failures = listOf("PaymentMethodDetailsInteracPresentReceipt: expected JSON object"),
  )
  val matchesPaymentMethodDetailsInteracPresentReceipt = true
  return InlinePaymentMethodDetailsInteracPresentReceiptX19411264Inspection(
    matchesPaymentMethodDetailsInteracPresentReceipt = matchesPaymentMethodDetailsInteracPresentReceipt,
    failures = buildList {
      if (!matchesPaymentMethodDetailsInteracPresentReceipt) add("PaymentMethodDetailsInteracPresentReceipt: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
