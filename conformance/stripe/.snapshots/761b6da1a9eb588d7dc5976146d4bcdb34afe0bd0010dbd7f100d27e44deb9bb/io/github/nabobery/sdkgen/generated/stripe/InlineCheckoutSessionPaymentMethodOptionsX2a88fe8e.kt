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

public enum class InlineCheckoutSessionPaymentMethodOptionsX2a88fe8eBranch {
  CheckoutSessionPaymentMethodOptions,
}

public sealed class InlineCheckoutSessionPaymentMethodOptionsX2a88fe8eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineCheckoutSessionPaymentMethodOptionsX2a88fe8eNoMatchException(
  message: String,
) : InlineCheckoutSessionPaymentMethodOptionsX2a88fe8eDecodingException(message)

internal data class InlineCheckoutSessionPaymentMethodOptionsX2a88fe8eInspection(
  public val matchesCheckoutSessionPaymentMethodOptions: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesCheckoutSessionPaymentMethodOptions).count { it }
}

/**
 * Payment-method-specific configuration for the PaymentIntent or SetupIntent of this CheckoutSession.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/payment_method_options
 */
@Serializable(with = InlineCheckoutSessionPaymentMethodOptionsX2a88fe8e.Serializer::class)
public class InlineCheckoutSessionPaymentMethodOptionsX2a88fe8e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCheckoutSessionPaymentMethodOptionsX2a88fe8eInspection,
) {
  public val checkoutSessionPaymentMethodOptions: CheckoutSessionPaymentMethodOptionsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCheckoutSessionPaymentMethodOptions) json.decodeFromJsonElement<CheckoutSessionPaymentMethodOptionsView>(raw) else null }

  public val matchedBranches: Set<InlineCheckoutSessionPaymentMethodOptionsX2a88fe8eBranch>
    get() = buildSet {
      if (inspection.matchesCheckoutSessionPaymentMethodOptions) add(InlineCheckoutSessionPaymentMethodOptionsX2a88fe8eBranch.CheckoutSessionPaymentMethodOptions)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCheckoutSessionPaymentMethodOptionsX2a88fe8e {
      val inspection = inspectInlineCheckoutSessionPaymentMethodOptionsX2a88fe8e(raw)
      if (inspection.matchCount == 0) {
        throw InlineCheckoutSessionPaymentMethodOptionsX2a88fe8eNoMatchException("InlineCheckoutSessionPaymentMethodOptionsX2a88fe8e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCheckoutSessionPaymentMethodOptionsX2a88fe8e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutSessionPaymentMethodOptionsX2a88fe8e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCheckoutSessionPaymentMethodOptionsX2a88fe8e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCheckoutSessionPaymentMethodOptionsX2a88fe8e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutSessionPaymentMethodOptionsX2a88fe8e) {
      encoder.requireJsonEncoder("InlineCheckoutSessionPaymentMethodOptionsX2a88fe8e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCheckoutSessionPaymentMethodOptionsX2a88fe8e(element: JsonElement): InlineCheckoutSessionPaymentMethodOptionsX2a88fe8eInspection {
  val raw = element as? JsonObject ?: return InlineCheckoutSessionPaymentMethodOptionsX2a88fe8eInspection(
    matchesCheckoutSessionPaymentMethodOptions = false,
    failures = listOf("CheckoutSessionPaymentMethodOptions: expected JSON object"),
  )
  val matchesCheckoutSessionPaymentMethodOptions = true
  return InlineCheckoutSessionPaymentMethodOptionsX2a88fe8eInspection(
    matchesCheckoutSessionPaymentMethodOptions = matchesCheckoutSessionPaymentMethodOptions,
    failures = buildList {
      if (!matchesCheckoutSessionPaymentMethodOptions) add("CheckoutSessionPaymentMethodOptions: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
