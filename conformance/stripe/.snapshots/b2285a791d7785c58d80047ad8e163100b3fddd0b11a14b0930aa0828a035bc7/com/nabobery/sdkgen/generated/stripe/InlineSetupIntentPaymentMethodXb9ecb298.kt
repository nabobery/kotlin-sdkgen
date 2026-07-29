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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineSetupIntentPaymentMethodXb9ecb298Branch {
  Branch1,
  PaymentMethod,
}

public sealed class InlineSetupIntentPaymentMethodXb9ecb298DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSetupIntentPaymentMethodXb9ecb298NoMatchException(
  message: String,
) : InlineSetupIntentPaymentMethodXb9ecb298DecodingException(message)

internal data class InlineSetupIntentPaymentMethodXb9ecb298Inspection(
  public val matchesBranch1: Boolean,
  public val matchesPaymentMethod: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesPaymentMethod).count { it }
}

/**
 * ID of the payment method used with this SetupIntent. If the payment method is `card_present` and isn't a digital
 * wallet, then the
 * [generated_card](https://docs.stripe.com/api/setup_attempts/object#setup_attempt_object-payment_method_details-card_p
 * resent-generated_card) associated with the `latest_attempt` is attached to the Customer instead.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent/properties/payment_method
 */
@Serializable(with = InlineSetupIntentPaymentMethodXb9ecb298.Serializer::class)
public class InlineSetupIntentPaymentMethodXb9ecb298 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSetupIntentPaymentMethodXb9ecb298Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val paymentMethod: PaymentMethod? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethod) json.decodeFromJsonElement<PaymentMethod>(raw) else null }

  public val matchedBranches: Set<InlineSetupIntentPaymentMethodXb9ecb298Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineSetupIntentPaymentMethodXb9ecb298Branch.Branch1)
      if (inspection.matchesPaymentMethod) add(InlineSetupIntentPaymentMethodXb9ecb298Branch.PaymentMethod)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSetupIntentPaymentMethodXb9ecb298 {
      val inspection = inspectInlineSetupIntentPaymentMethodXb9ecb298(raw)
      if (inspection.matchCount == 0) {
        throw InlineSetupIntentPaymentMethodXb9ecb298NoMatchException("InlineSetupIntentPaymentMethodXb9ecb298 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSetupIntentPaymentMethodXb9ecb298(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineSetupIntentPaymentMethodXb9ecb298> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMethodXb9ecb298 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSetupIntentPaymentMethodXb9ecb298")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentPaymentMethodXb9ecb298) {
      encoder.requireJsonEncoder("InlineSetupIntentPaymentMethodXb9ecb298").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSetupIntentPaymentMethodXb9ecb298(element: JsonElement): InlineSetupIntentPaymentMethodXb9ecb298Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesPaymentMethod = element.isJsonDecodable<PaymentMethod>()
  return InlineSetupIntentPaymentMethodXb9ecb298Inspection(
    matchesBranch1 = matchesBranch1,
    matchesPaymentMethod = matchesPaymentMethod,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesPaymentMethod) add("PaymentMethod: value does not match PaymentMethod")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
