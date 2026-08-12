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

public enum class InlinePaymentMethodDetailsCardNetworkTokenX290e6729Branch {
  PaymentMethodDetailsCardNetworkToken,
}

public sealed class InlinePaymentMethodDetailsCardNetworkTokenX290e6729DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodDetailsCardNetworkTokenX290e6729NoMatchException(
  message: String,
) : InlinePaymentMethodDetailsCardNetworkTokenX290e6729DecodingException(message)

internal data class InlinePaymentMethodDetailsCardNetworkTokenX290e6729Inspection(
  public val matchesPaymentMethodDetailsCardNetworkToken: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentMethodDetailsCardNetworkToken).count { it }
}

/**
 * If this card has network token credentials, this contains the details of the network token credentials.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_card/properties/network_token
 */
@Serializable(with = InlinePaymentMethodDetailsCardNetworkTokenX290e6729.Serializer::class)
public class InlinePaymentMethodDetailsCardNetworkTokenX290e6729 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentMethodDetailsCardNetworkTokenX290e6729Inspection,
) {
  public val paymentMethodDetailsCardNetworkToken: PaymentMethodDetailsCardNetworkTokenView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethodDetailsCardNetworkToken) json.decodeFromJsonElement<PaymentMethodDetailsCardNetworkTokenView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentMethodDetailsCardNetworkTokenX290e6729Branch>
    get() = buildSet {
      if (inspection.matchesPaymentMethodDetailsCardNetworkToken) add(InlinePaymentMethodDetailsCardNetworkTokenX290e6729Branch.PaymentMethodDetailsCardNetworkToken)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodDetailsCardNetworkTokenX290e6729 {
      val inspection = inspectInlinePaymentMethodDetailsCardNetworkTokenX290e6729(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodDetailsCardNetworkTokenX290e6729NoMatchException("InlinePaymentMethodDetailsCardNetworkTokenX290e6729 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodDetailsCardNetworkTokenX290e6729(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodDetailsCardNetworkTokenX290e6729> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsCardNetworkTokenX290e6729 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodDetailsCardNetworkTokenX290e6729")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsCardNetworkTokenX290e6729) {
      encoder.requireJsonEncoder("InlinePaymentMethodDetailsCardNetworkTokenX290e6729").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodDetailsCardNetworkTokenX290e6729(element: JsonElement): InlinePaymentMethodDetailsCardNetworkTokenX290e6729Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodDetailsCardNetworkTokenX290e6729Inspection(
    matchesPaymentMethodDetailsCardNetworkToken = false,
    failures = listOf("PaymentMethodDetailsCardNetworkToken: expected JSON object"),
  )
  val matchesPaymentMethodDetailsCardNetworkToken = raw["used"] != null
  return InlinePaymentMethodDetailsCardNetworkTokenX290e6729Inspection(
    matchesPaymentMethodDetailsCardNetworkToken = matchesPaymentMethodDetailsCardNetworkToken,
    failures = buildList {
      if (!matchesPaymentMethodDetailsCardNetworkToken) add("PaymentMethodDetailsCardNetworkToken: required properties 'used' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
