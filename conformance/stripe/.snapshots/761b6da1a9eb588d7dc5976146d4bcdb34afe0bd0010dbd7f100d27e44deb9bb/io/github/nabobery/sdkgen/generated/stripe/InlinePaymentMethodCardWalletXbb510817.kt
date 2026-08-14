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

public enum class InlinePaymentMethodCardWalletXbb510817Branch {
  PaymentMethodCardWallet,
}

public sealed class InlinePaymentMethodCardWalletXbb510817DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodCardWalletXbb510817NoMatchException(
  message: String,
) : InlinePaymentMethodCardWalletXbb510817DecodingException(message)

internal data class InlinePaymentMethodCardWalletXbb510817Inspection(
  public val matchesPaymentMethodCardWallet: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentMethodCardWallet).count { it }
}

/**
 * If this Card is part of a card wallet, this contains the details of the card wallet.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_card/properties/wallet
 */
@Serializable(with = InlinePaymentMethodCardWalletXbb510817.Serializer::class)
public class InlinePaymentMethodCardWalletXbb510817 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentMethodCardWalletXbb510817Inspection,
) {
  public val paymentMethodCardWallet: PaymentMethodCardWalletView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethodCardWallet) json.decodeFromJsonElement<PaymentMethodCardWalletView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentMethodCardWalletXbb510817Branch>
    get() = buildSet {
      if (inspection.matchesPaymentMethodCardWallet) add(InlinePaymentMethodCardWalletXbb510817Branch.PaymentMethodCardWallet)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodCardWalletXbb510817 {
      val inspection = inspectInlinePaymentMethodCardWalletXbb510817(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodCardWalletXbb510817NoMatchException("InlinePaymentMethodCardWalletXbb510817 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodCardWalletXbb510817(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodCardWalletXbb510817> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodCardWalletXbb510817 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodCardWalletXbb510817")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodCardWalletXbb510817) {
      encoder.requireJsonEncoder("InlinePaymentMethodCardWalletXbb510817").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodCardWalletXbb510817(element: JsonElement): InlinePaymentMethodCardWalletXbb510817Inspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodCardWalletXbb510817Inspection(
    matchesPaymentMethodCardWallet = false,
    failures = listOf("PaymentMethodCardWallet: expected JSON object"),
  )
  val matchesPaymentMethodCardWallet = raw["type"] != null
  return InlinePaymentMethodCardWalletXbb510817Inspection(
    matchesPaymentMethodCardWallet = matchesPaymentMethodCardWallet,
    failures = buildList {
      if (!matchesPaymentMethodCardWallet) add("PaymentMethodCardWallet: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
