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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX3404f1a6Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xaa9c6fd6,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X26f68e66,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX3404f1a6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX3404f1a6NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX3404f1a6DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX3404f1a6Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xaa9c6fd6:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X26f68e66:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xaa9c6fd6, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X26f68e66).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/sepa_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/sepa_debit
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX3404f1a6.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX3404f1a6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX3404f1a6Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xaa9c6fd6:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xaa9c6fd6? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xaa9c6fd6) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xaa9c6fd6>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X26f68e66:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X26f68e66? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X26f68e66) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X26f68e66>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX3404f1a6Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xaa9c6fd6) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX3404f1a6Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xaa9c6fd6)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X26f68e66) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX3404f1a6Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X26f68e66)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX3404f1a6 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX3404f1a6(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX3404f1a6NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX3404f1a6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX3404f1a6(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX3404f1a6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX3404f1a6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX3404f1a6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX3404f1a6) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX3404f1a6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX3404f1a6(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX3404f1a6Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xaa9c6fd6 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xaa9c6fd6>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X26f68e66 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X26f68e66>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX3404f1a6Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xaa9c6fd6 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xaa9c6fd6,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X26f68e66 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X26f68e66,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xaa9c6fd6) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xaa9c6fd6: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xaa9c6fd6")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X26f68e66) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X26f68e66: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X26f68e66")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
