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

public enum class InlineCheckoutSessionPaymentLinkX45e1bc7cBranch {
  Branch1,
  PaymentLink,
}

public sealed class InlineCheckoutSessionPaymentLinkX45e1bc7cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineCheckoutSessionPaymentLinkX45e1bc7cNoMatchException(
  message: String,
) : InlineCheckoutSessionPaymentLinkX45e1bc7cDecodingException(message)

internal data class InlineCheckoutSessionPaymentLinkX45e1bc7cInspection(
  public val matchesBranch1: Boolean,
  public val matchesPaymentLink: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesPaymentLink).count { it }
}

/**
 * The ID of the Payment Link that created this Session.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/payment_link
 */
@Serializable(with = InlineCheckoutSessionPaymentLinkX45e1bc7c.Serializer::class)
public class InlineCheckoutSessionPaymentLinkX45e1bc7c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCheckoutSessionPaymentLinkX45e1bc7cInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val paymentLink: PaymentLink? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentLink) json.decodeFromJsonElement<PaymentLink>(raw) else null }

  public val matchedBranches: Set<InlineCheckoutSessionPaymentLinkX45e1bc7cBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineCheckoutSessionPaymentLinkX45e1bc7cBranch.Branch1)
      if (inspection.matchesPaymentLink) add(InlineCheckoutSessionPaymentLinkX45e1bc7cBranch.PaymentLink)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCheckoutSessionPaymentLinkX45e1bc7c {
      val inspection = inspectInlineCheckoutSessionPaymentLinkX45e1bc7c(raw)
      if (inspection.matchCount == 0) {
        throw InlineCheckoutSessionPaymentLinkX45e1bc7cNoMatchException("InlineCheckoutSessionPaymentLinkX45e1bc7c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCheckoutSessionPaymentLinkX45e1bc7c(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineCheckoutSessionPaymentLinkX45e1bc7c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCheckoutSessionPaymentLinkX45e1bc7c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCheckoutSessionPaymentLinkX45e1bc7c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutSessionPaymentLinkX45e1bc7c) {
      encoder.requireJsonEncoder("InlineCheckoutSessionPaymentLinkX45e1bc7c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCheckoutSessionPaymentLinkX45e1bc7c(element: JsonElement): InlineCheckoutSessionPaymentLinkX45e1bc7cInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesPaymentLink = element.isJsonDecodable<PaymentLink>()
  return InlineCheckoutSessionPaymentLinkX45e1bc7cInspection(
    matchesBranch1 = matchesBranch1,
    matchesPaymentLink = matchesPaymentLink,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesPaymentLink) add("PaymentLink: value does not match PaymentLink")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
