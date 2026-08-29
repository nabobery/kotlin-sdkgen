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

public enum class InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXc7f1bfd9Branch {
  InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1Xd0b1c082,
  InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xa53a49e5,
}

public sealed class InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXc7f1bfd9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXc7f1bfd9NoMatchException(
  message: String,
) : InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXc7f1bfd9DecodingException(message)

internal data class InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXc7f1bfd9Inspection(
  public val matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1Xd0b1c082:
      Boolean,
  public val matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xa53a49e5:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1Xd0b1c082, matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xa53a49e5).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/billing_details/properties/address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/billing_details/properties/address
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXc7f1bfd9.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXc7f1bfd9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXc7f1bfd9Inspection,
) {
  public val inlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1Xd0b1c082:
      InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1Xd0b1c082? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1Xd0b1c082) json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1Xd0b1c082>(raw) else null }

  public val inlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xa53a49e5:
      InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xa53a49e5? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xa53a49e5) json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xa53a49e5>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXc7f1bfd9Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1Xd0b1c082) add(InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXc7f1bfd9Branch.InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1Xd0b1c082)
      if (inspection.matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xa53a49e5) add(InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXc7f1bfd9Branch.InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xa53a49e5)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXc7f1bfd9 {
      val inspection = inspectInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXc7f1bfd9(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXc7f1bfd9NoMatchException("InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXc7f1bfd9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXc7f1bfd9(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXc7f1bfd9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXc7f1bfd9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXc7f1bfd9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXc7f1bfd9) {
      encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXc7f1bfd9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXc7f1bfd9(element: JsonElement): InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXc7f1bfd9Inspection {
  val matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1Xd0b1c082 = element.isJsonDecodable<InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1Xd0b1c082>()
  val matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xa53a49e5 = element.isJsonDecodable<InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xa53a49e5>()
  return InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXc7f1bfd9Inspection(
    matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1Xd0b1c082 = matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1Xd0b1c082,
    matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xa53a49e5 = matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xa53a49e5,
    failures = buildList {
      if (!matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1Xd0b1c082) add("InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1Xd0b1c082: value does not match InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1Xd0b1c082")
      if (!matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xa53a49e5) add("InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xa53a49e5: value does not match InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xa53a49e5")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
