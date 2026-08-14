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

public enum class InlineCheckoutSessionAfterExpirationXdb3c322fBranch {
  PaymentPagesCheckoutSessionAfterExpiration,
}

public sealed class InlineCheckoutSessionAfterExpirationXdb3c322fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineCheckoutSessionAfterExpirationXdb3c322fNoMatchException(
  message: String,
) : InlineCheckoutSessionAfterExpirationXdb3c322fDecodingException(message)

internal data class InlineCheckoutSessionAfterExpirationXdb3c322fInspection(
  public val matchesPaymentPagesCheckoutSessionAfterExpiration: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentPagesCheckoutSessionAfterExpiration).count { it }
}

/**
 * When set, provides configuration for actions to take if this Checkout Session expires.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/after_expiration
 */
@Serializable(with = InlineCheckoutSessionAfterExpirationXdb3c322f.Serializer::class)
public class InlineCheckoutSessionAfterExpirationXdb3c322f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCheckoutSessionAfterExpirationXdb3c322fInspection,
) {
  public val paymentPagesCheckoutSessionAfterExpiration:
      PaymentPagesCheckoutSessionAfterExpirationView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentPagesCheckoutSessionAfterExpiration) json.decodeFromJsonElement<PaymentPagesCheckoutSessionAfterExpirationView>(raw) else null }

  public val matchedBranches: Set<InlineCheckoutSessionAfterExpirationXdb3c322fBranch>
    get() = buildSet {
      if (inspection.matchesPaymentPagesCheckoutSessionAfterExpiration) add(InlineCheckoutSessionAfterExpirationXdb3c322fBranch.PaymentPagesCheckoutSessionAfterExpiration)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCheckoutSessionAfterExpirationXdb3c322f {
      val inspection = inspectInlineCheckoutSessionAfterExpirationXdb3c322f(raw)
      if (inspection.matchCount == 0) {
        throw InlineCheckoutSessionAfterExpirationXdb3c322fNoMatchException("InlineCheckoutSessionAfterExpirationXdb3c322f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCheckoutSessionAfterExpirationXdb3c322f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutSessionAfterExpirationXdb3c322f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCheckoutSessionAfterExpirationXdb3c322f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCheckoutSessionAfterExpirationXdb3c322f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutSessionAfterExpirationXdb3c322f) {
      encoder.requireJsonEncoder("InlineCheckoutSessionAfterExpirationXdb3c322f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCheckoutSessionAfterExpirationXdb3c322f(element: JsonElement): InlineCheckoutSessionAfterExpirationXdb3c322fInspection {
  val raw = element as? JsonObject ?: return InlineCheckoutSessionAfterExpirationXdb3c322fInspection(
    matchesPaymentPagesCheckoutSessionAfterExpiration = false,
    failures = listOf("PaymentPagesCheckoutSessionAfterExpiration: expected JSON object"),
  )
  val matchesPaymentPagesCheckoutSessionAfterExpiration = true
  return InlineCheckoutSessionAfterExpirationXdb3c322fInspection(
    matchesPaymentPagesCheckoutSessionAfterExpiration = matchesPaymentPagesCheckoutSessionAfterExpiration,
    failures = buildList {
      if (!matchesPaymentPagesCheckoutSessionAfterExpiration) add("PaymentPagesCheckoutSessionAfterExpiration: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
