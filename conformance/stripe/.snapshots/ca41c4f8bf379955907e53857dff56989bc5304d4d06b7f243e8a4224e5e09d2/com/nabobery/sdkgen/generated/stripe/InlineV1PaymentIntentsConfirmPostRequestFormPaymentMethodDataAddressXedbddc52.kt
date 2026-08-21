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

public enum class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAddressXedbddc52Branch {
  InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1Xb755588e,
  InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X5022bbbc,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAddressXedbddc52DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAddressXedbddc52NoMatchException(
  message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAddressXedbddc52DecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAddressXedbddc52Inspection(
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1Xb755588e:
      Boolean,
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X5022bbbc:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1Xb755588e, matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X5022bbbc).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/address
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAddressXedbddc52.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAddressXedbddc52 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAddressXedbddc52Inspection,
) {
  public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1Xb755588e:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1Xb755588e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1Xb755588e) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1Xb755588e>(raw) else null }

  public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X5022bbbc:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X5022bbbc? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X5022bbbc) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X5022bbbc>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAddressXedbddc52Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1Xb755588e) add(InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAddressXedbddc52Branch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1Xb755588e)
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X5022bbbc) add(InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAddressXedbddc52Branch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X5022bbbc)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAddressXedbddc52 {
      val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAddressXedbddc52(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAddressXedbddc52NoMatchException("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAddressXedbddc52 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAddressXedbddc52(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAddressXedbddc52> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAddressXedbddc52 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAddressXedbddc52")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAddressXedbddc52) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAddressXedbddc52").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAddressXedbddc52(element: JsonElement): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAddressXedbddc52Inspection {
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1Xb755588e = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1Xb755588e>()
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X5022bbbc = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X5022bbbc>()
  return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAddressXedbddc52Inspection(
    matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1Xb755588e = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1Xb755588e,
    matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X5022bbbc = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X5022bbbc,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1Xb755588e) add("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1Xb755588e: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1Xb755588e")
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X5022bbbc) add("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X5022bbbc: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X5022bbbc")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
