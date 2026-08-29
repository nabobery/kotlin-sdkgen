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

public enum class InlinePaymentLinkTransferDataX31f4137cBranch {
  PaymentLinksResourceTransferData,
}

public sealed class InlinePaymentLinkTransferDataX31f4137cDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentLinkTransferDataX31f4137cNoMatchException(
  message: String,
) : InlinePaymentLinkTransferDataX31f4137cDecodingException(message)

internal data class InlinePaymentLinkTransferDataX31f4137cInspection(
  public val matchesPaymentLinksResourceTransferData: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentLinksResourceTransferData).count { it }
}

/**
 * The account (if any) the payments will be attributed to for tax reporting, and where funds from each payment will be
 * transferred to.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_link/properties/transfer_data
 */
@Serializable(with = InlinePaymentLinkTransferDataX31f4137c.Serializer::class)
public class InlinePaymentLinkTransferDataX31f4137c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentLinkTransferDataX31f4137cInspection,
) {
  public val paymentLinksResourceTransferData: PaymentLinksResourceTransferDataView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentLinksResourceTransferData) json.decodeFromJsonElement<PaymentLinksResourceTransferDataView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentLinkTransferDataX31f4137cBranch>
    get() = buildSet {
      if (inspection.matchesPaymentLinksResourceTransferData) add(InlinePaymentLinkTransferDataX31f4137cBranch.PaymentLinksResourceTransferData)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentLinkTransferDataX31f4137c {
      val inspection = inspectInlinePaymentLinkTransferDataX31f4137c(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentLinkTransferDataX31f4137cNoMatchException("InlinePaymentLinkTransferDataX31f4137c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentLinkTransferDataX31f4137c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentLinkTransferDataX31f4137c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentLinkTransferDataX31f4137c {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentLinkTransferDataX31f4137c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinkTransferDataX31f4137c) {
      encoder.requireJsonEncoder("InlinePaymentLinkTransferDataX31f4137c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentLinkTransferDataX31f4137c(element: JsonElement): InlinePaymentLinkTransferDataX31f4137cInspection {
  val raw = element as? JsonObject ?: return InlinePaymentLinkTransferDataX31f4137cInspection(
    matchesPaymentLinksResourceTransferData = false,
    failures = listOf("PaymentLinksResourceTransferData: expected JSON object"),
  )
  val matchesPaymentLinksResourceTransferData = raw["destination"] != null
  return InlinePaymentLinkTransferDataX31f4137cInspection(
    matchesPaymentLinksResourceTransferData = matchesPaymentLinksResourceTransferData,
    failures = buildList {
      if (!matchesPaymentLinksResourceTransferData) add("PaymentLinksResourceTransferData: required properties 'destination' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
