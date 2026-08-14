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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXadb3736bBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5ce5e46a,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0d526626,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXadb3736bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXadb3736bNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXadb3736bDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXadb3736bInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5ce5e46a:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0d526626:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5ce5e46a, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0d526626).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/acss_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/acss_debit
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXadb3736b.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXadb3736b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXadb3736bInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5ce5e46a:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5ce5e46a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5ce5e46a) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5ce5e46a>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0d526626:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0d526626? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0d526626) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0d526626>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXadb3736bBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5ce5e46a) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXadb3736bBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5ce5e46a)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0d526626) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXadb3736bBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0d526626)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXadb3736b {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXadb3736b(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXadb3736bNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXadb3736b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXadb3736b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXadb3736b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXadb3736b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXadb3736b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXadb3736b) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXadb3736b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXadb3736b(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXadb3736bInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5ce5e46a = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5ce5e46a>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0d526626 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0d526626>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXadb3736bInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5ce5e46a = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5ce5e46a,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0d526626 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0d526626,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5ce5e46a) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5ce5e46a: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5ce5e46a")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0d526626) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0d526626: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0d526626")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
