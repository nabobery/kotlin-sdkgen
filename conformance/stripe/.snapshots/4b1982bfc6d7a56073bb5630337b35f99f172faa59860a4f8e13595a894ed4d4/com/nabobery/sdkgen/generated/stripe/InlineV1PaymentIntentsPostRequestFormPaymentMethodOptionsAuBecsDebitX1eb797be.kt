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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitX1eb797beBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8c5f3d7b,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X34255121,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitX1eb797beDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitX1eb797beNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitX1eb797beDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitX1eb797beInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8c5f3d7b:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X34255121:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8c5f3d7b, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X34255121).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/au_becs_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/au_becs_debit
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitX1eb797be.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitX1eb797be internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitX1eb797beInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8c5f3d7b:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8c5f3d7b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8c5f3d7b) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8c5f3d7b>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X34255121:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X34255121? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X34255121) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X34255121>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitX1eb797beBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8c5f3d7b) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitX1eb797beBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8c5f3d7b)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X34255121) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitX1eb797beBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X34255121)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitX1eb797be {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitX1eb797be(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitX1eb797beNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitX1eb797be matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitX1eb797be(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitX1eb797be> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitX1eb797be {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitX1eb797be")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitX1eb797be) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitX1eb797be").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitX1eb797be(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitX1eb797beInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8c5f3d7b = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8c5f3d7b>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X34255121 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X34255121>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitX1eb797beInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8c5f3d7b = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8c5f3d7b,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X34255121 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X34255121,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8c5f3d7b) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8c5f3d7b: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X8c5f3d7b")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X34255121) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X34255121: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X34255121")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
