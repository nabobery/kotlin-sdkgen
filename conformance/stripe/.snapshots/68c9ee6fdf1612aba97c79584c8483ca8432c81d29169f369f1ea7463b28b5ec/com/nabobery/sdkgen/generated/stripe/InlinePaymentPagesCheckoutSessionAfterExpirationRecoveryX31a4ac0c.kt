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

public enum class InlinePaymentPagesCheckoutSessionAfterExpirationRecoveryX31a4ac0cBranch {
  PaymentPagesCheckoutSessionAfterExpirationRecovery,
}

public sealed class InlinePaymentPagesCheckoutSessionAfterExpirationRecoveryX31a4ac0cDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentPagesCheckoutSessionAfterExpirationRecoveryX31a4ac0cNoMatchException(
  message: String,
) : InlinePaymentPagesCheckoutSessionAfterExpirationRecoveryX31a4ac0cDecodingException(message)

internal data class InlinePaymentPagesCheckoutSessionAfterExpirationRecoveryX31a4ac0cInspection(
  public val matchesPaymentPagesCheckoutSessionAfterExpirationRecovery: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentPagesCheckoutSessionAfterExpirationRecovery).count { it }
}

/**
 * When set, configuration used to recover the Checkout Session on expiry.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_after_expiration/properties/recovery
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionAfterExpirationRecoveryX31a4ac0c.Serializer::class)
public class InlinePaymentPagesCheckoutSessionAfterExpirationRecoveryX31a4ac0c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlinePaymentPagesCheckoutSessionAfterExpirationRecoveryX31a4ac0cInspection,
) {
  public val paymentPagesCheckoutSessionAfterExpirationRecovery:
      PaymentPagesCheckoutSessionAfterExpirationRecoveryView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentPagesCheckoutSessionAfterExpirationRecovery) json.decodeFromJsonElement<PaymentPagesCheckoutSessionAfterExpirationRecoveryView>(raw) else null }

  public val matchedBranches:
      Set<InlinePaymentPagesCheckoutSessionAfterExpirationRecoveryX31a4ac0cBranch>
    get() = buildSet {
      if (inspection.matchesPaymentPagesCheckoutSessionAfterExpirationRecovery) add(InlinePaymentPagesCheckoutSessionAfterExpirationRecoveryX31a4ac0cBranch.PaymentPagesCheckoutSessionAfterExpirationRecovery)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentPagesCheckoutSessionAfterExpirationRecoveryX31a4ac0c {
      val inspection = inspectInlinePaymentPagesCheckoutSessionAfterExpirationRecoveryX31a4ac0c(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentPagesCheckoutSessionAfterExpirationRecoveryX31a4ac0cNoMatchException("InlinePaymentPagesCheckoutSessionAfterExpirationRecoveryX31a4ac0c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentPagesCheckoutSessionAfterExpirationRecoveryX31a4ac0c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionAfterExpirationRecoveryX31a4ac0c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionAfterExpirationRecoveryX31a4ac0c {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentPagesCheckoutSessionAfterExpirationRecoveryX31a4ac0c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentPagesCheckoutSessionAfterExpirationRecoveryX31a4ac0c) {
      encoder.requireJsonEncoder("InlinePaymentPagesCheckoutSessionAfterExpirationRecoveryX31a4ac0c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentPagesCheckoutSessionAfterExpirationRecoveryX31a4ac0c(element: JsonElement): InlinePaymentPagesCheckoutSessionAfterExpirationRecoveryX31a4ac0cInspection {
  val raw = element as? JsonObject ?: return InlinePaymentPagesCheckoutSessionAfterExpirationRecoveryX31a4ac0cInspection(
    matchesPaymentPagesCheckoutSessionAfterExpirationRecovery = false,
    failures = listOf("PaymentPagesCheckoutSessionAfterExpirationRecovery: expected JSON object"),
  )
  val matchesPaymentPagesCheckoutSessionAfterExpirationRecovery = raw["allow_promotion_codes"] != null && raw["enabled"] != null
  return InlinePaymentPagesCheckoutSessionAfterExpirationRecoveryX31a4ac0cInspection(
    matchesPaymentPagesCheckoutSessionAfterExpirationRecovery = matchesPaymentPagesCheckoutSessionAfterExpirationRecovery,
    failures = buildList {
      if (!matchesPaymentPagesCheckoutSessionAfterExpirationRecovery) add("PaymentPagesCheckoutSessionAfterExpirationRecovery: required properties 'allow_promotion_codes', 'enabled' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
