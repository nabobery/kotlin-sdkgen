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

public enum class InlinePaymentMethodInteracPresentNetworksX55abbf8bBranch {
  PaymentMethodCardPresentNetworks,
}

public sealed class InlinePaymentMethodInteracPresentNetworksX55abbf8bDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodInteracPresentNetworksX55abbf8bNoMatchException(
  message: String,
) : InlinePaymentMethodInteracPresentNetworksX55abbf8bDecodingException(message)

internal data class InlinePaymentMethodInteracPresentNetworksX55abbf8bInspection(
  public val matchesPaymentMethodCardPresentNetworks: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentMethodCardPresentNetworks).count { it }
}

/**
 * Contains information about card networks that can be used to process the payment.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_interac_present/properties/networks
 */
@Serializable(with = InlinePaymentMethodInteracPresentNetworksX55abbf8b.Serializer::class)
public class InlinePaymentMethodInteracPresentNetworksX55abbf8b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentMethodInteracPresentNetworksX55abbf8bInspection,
) {
  public val paymentMethodCardPresentNetworks: PaymentMethodCardPresentNetworksView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethodCardPresentNetworks) json.decodeFromJsonElement<PaymentMethodCardPresentNetworksView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentMethodInteracPresentNetworksX55abbf8bBranch>
    get() = buildSet {
      if (inspection.matchesPaymentMethodCardPresentNetworks) add(InlinePaymentMethodInteracPresentNetworksX55abbf8bBranch.PaymentMethodCardPresentNetworks)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodInteracPresentNetworksX55abbf8b {
      val inspection = inspectInlinePaymentMethodInteracPresentNetworksX55abbf8b(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodInteracPresentNetworksX55abbf8bNoMatchException("InlinePaymentMethodInteracPresentNetworksX55abbf8b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodInteracPresentNetworksX55abbf8b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodInteracPresentNetworksX55abbf8b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodInteracPresentNetworksX55abbf8b {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodInteracPresentNetworksX55abbf8b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodInteracPresentNetworksX55abbf8b) {
      encoder.requireJsonEncoder("InlinePaymentMethodInteracPresentNetworksX55abbf8b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodInteracPresentNetworksX55abbf8b(element: JsonElement): InlinePaymentMethodInteracPresentNetworksX55abbf8bInspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodInteracPresentNetworksX55abbf8bInspection(
    matchesPaymentMethodCardPresentNetworks = false,
    failures = listOf("PaymentMethodCardPresentNetworks: expected JSON object"),
  )
  val matchesPaymentMethodCardPresentNetworks = raw["available"].isStringArray()
  return InlinePaymentMethodInteracPresentNetworksX55abbf8bInspection(
    matchesPaymentMethodCardPresentNetworks = matchesPaymentMethodCardPresentNetworks,
    failures = buildList {
      if (!matchesPaymentMethodCardPresentNetworks) add("PaymentMethodCardPresentNetworks: required properties 'available' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
