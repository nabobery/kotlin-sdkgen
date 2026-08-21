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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountXefc4c9d6Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa68122dc,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X693e2595,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountXefc4c9d6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountXefc4c9d6NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountXefc4c9d6DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountXefc4c9d6Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa68122dc:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X693e2595:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa68122dc, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X693e2595).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/nz_bank_account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/nz_bank_account
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountXefc4c9d6.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountXefc4c9d6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountXefc4c9d6Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa68122dc:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa68122dc? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa68122dc) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa68122dc>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X693e2595:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X693e2595? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X693e2595) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X693e2595>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountXefc4c9d6Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa68122dc) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountXefc4c9d6Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa68122dc)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X693e2595) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountXefc4c9d6Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X693e2595)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountXefc4c9d6 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountXefc4c9d6(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountXefc4c9d6NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountXefc4c9d6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountXefc4c9d6(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountXefc4c9d6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountXefc4c9d6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountXefc4c9d6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountXefc4c9d6) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountXefc4c9d6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountXefc4c9d6(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountXefc4c9d6Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa68122dc = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa68122dc>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X693e2595 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X693e2595>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountXefc4c9d6Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa68122dc = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa68122dc,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X693e2595 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X693e2595,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa68122dc) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa68122dc: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xa68122dc")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X693e2595) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X693e2595: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X693e2595")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
