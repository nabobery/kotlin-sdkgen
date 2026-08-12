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

public enum class InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXd68da5adBranch {
  InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1X2c72eb86,
  InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xeacb975b,
}

public sealed class InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXd68da5adDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXd68da5adNoMatchException(
  message: String,
) : InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXd68da5adDecodingException(message)

internal data class InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXd68da5adInspection(
  public val matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1X2c72eb86:
      Boolean,
  public val matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xeacb975b:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1X2c72eb86, matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xeacb975b).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/billing_details/properties/address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/billing_details/properties/address
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXd68da5ad.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXd68da5ad internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXd68da5adInspection,
) {
  public val inlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1X2c72eb86:
      InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1X2c72eb86? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1X2c72eb86) json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1X2c72eb86>(raw) else null }

  public val inlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xeacb975b:
      InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xeacb975b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xeacb975b) json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xeacb975b>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXd68da5adBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1X2c72eb86) add(InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXd68da5adBranch.InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1X2c72eb86)
      if (inspection.matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xeacb975b) add(InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXd68da5adBranch.InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xeacb975b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXd68da5ad {
      val inspection = inspectInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXd68da5ad(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXd68da5adNoMatchException("InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXd68da5ad matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXd68da5ad(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXd68da5ad> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXd68da5ad {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXd68da5ad")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXd68da5ad) {
      encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXd68da5ad").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXd68da5ad(element: JsonElement): InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXd68da5adInspection {
  val matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1X2c72eb86 = element.isJsonDecodable<InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1X2c72eb86>()
  val matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xeacb975b = element.isJsonDecodable<InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xeacb975b>()
  return InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressXd68da5adInspection(
    matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1X2c72eb86 = matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1X2c72eb86,
    matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xeacb975b = matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xeacb975b,
    failures = buildList {
      if (!matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1X2c72eb86) add("InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1X2c72eb86: value does not match InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf1X2c72eb86")
      if (!matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xeacb975b) add("InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xeacb975b: value does not match InlineV1PaymentMethodsPostRequestFormBillingDetailsAddressAnyOf2Xeacb975b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
