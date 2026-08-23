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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitXd59e6e33Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X403cb90a,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X8bbdb197,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitXd59e6e33DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitXd59e6e33NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitXd59e6e33DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitXd59e6e33Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X403cb90a:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X8bbdb197:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X403cb90a, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X8bbdb197).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/au_becs_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/au_becs_debit
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitXd59e6e33.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitXd59e6e33 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitXd59e6e33Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X403cb90a:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X403cb90a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X403cb90a) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X403cb90a>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X8bbdb197:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X8bbdb197? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X8bbdb197) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X8bbdb197>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitXd59e6e33Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X403cb90a) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitXd59e6e33Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X403cb90a)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X8bbdb197) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitXd59e6e33Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X8bbdb197)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitXd59e6e33 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitXd59e6e33(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitXd59e6e33NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitXd59e6e33 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitXd59e6e33(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitXd59e6e33> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitXd59e6e33 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitXd59e6e33")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitXd59e6e33) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitXd59e6e33").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitXd59e6e33(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitXd59e6e33Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X403cb90a = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X403cb90a>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X8bbdb197 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X8bbdb197>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitXd59e6e33Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X403cb90a = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X403cb90a,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X8bbdb197 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X8bbdb197,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X403cb90a) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X403cb90a: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X403cb90a")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X8bbdb197) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X8bbdb197: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X8bbdb197")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
