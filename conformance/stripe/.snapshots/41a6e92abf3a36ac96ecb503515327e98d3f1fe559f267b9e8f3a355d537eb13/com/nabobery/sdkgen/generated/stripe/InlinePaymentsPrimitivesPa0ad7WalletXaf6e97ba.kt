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

public enum class InlinePaymentsPrimitivesPa0ad7WalletXaf6e97baBranch {
  PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet,
}

public sealed class InlinePaymentsPrimitivesPa0ad7WalletXaf6e97baDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentsPrimitivesPa0ad7WalletXaf6e97baNoMatchException(
  message: String,
) : InlinePaymentsPrimitivesPa0ad7WalletXaf6e97baDecodingException(message)

internal data class InlinePaymentsPrimitivesPa0ad7WalletXaf6e97baInspection(
  public val matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet).count { it }
}

/**
 * If this Card is part of a card wallet, this contains the details of the card wallet.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_card_det
 * ails/properties/wallet
 */
@Serializable(with = InlinePaymentsPrimitivesPa0ad7WalletXaf6e97ba.Serializer::class)
public class InlinePaymentsPrimitivesPa0ad7WalletXaf6e97ba internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentsPrimitivesPa0ad7WalletXaf6e97baInspection,
) {
  public val paymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet:
      PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWalletView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet) json.decodeFromJsonElement<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWalletView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentsPrimitivesPa0ad7WalletXaf6e97baBranch>
    get() = buildSet {
      if (inspection.matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet) add(InlinePaymentsPrimitivesPa0ad7WalletXaf6e97baBranch.PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentsPrimitivesPa0ad7WalletXaf6e97ba {
      val inspection = inspectInlinePaymentsPrimitivesPa0ad7WalletXaf6e97ba(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentsPrimitivesPa0ad7WalletXaf6e97baNoMatchException("InlinePaymentsPrimitivesPa0ad7WalletXaf6e97ba matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentsPrimitivesPa0ad7WalletXaf6e97ba(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentsPrimitivesPa0ad7WalletXaf6e97ba> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentsPrimitivesPa0ad7WalletXaf6e97ba {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentsPrimitivesPa0ad7WalletXaf6e97ba")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentsPrimitivesPa0ad7WalletXaf6e97ba) {
      encoder.requireJsonEncoder("InlinePaymentsPrimitivesPa0ad7WalletXaf6e97ba").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentsPrimitivesPa0ad7WalletXaf6e97ba(element: JsonElement): InlinePaymentsPrimitivesPa0ad7WalletXaf6e97baInspection {
  val raw = element as? JsonObject ?: return InlinePaymentsPrimitivesPa0ad7WalletXaf6e97baInspection(
    matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet = false,
    failures = listOf("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet: expected JSON object"),
  )
  val matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet = raw["type"].isString()
  return InlinePaymentsPrimitivesPa0ad7WalletXaf6e97baInspection(
    matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet = matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet,
    failures = buildList {
      if (!matchesPaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet) add("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetailsResourceWallet: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
