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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentX59c2a9ceBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xc72becfa,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentX59c2a9ceDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentX59c2a9ceNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentX59c2a9ceDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentX59c2a9ceInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xc72becfa:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xc72becfa).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card_present.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card_present
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentX59c2a9ce.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentX59c2a9ce internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentX59c2a9ceInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xc72becfa:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xc72becfa? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xc72becfa) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xc72becfa>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentX59c2a9ceBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentX59c2a9ceBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xc72becfa) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentX59c2a9ceBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xc72becfa)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentX59c2a9ce {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentX59c2a9ce(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentX59c2a9ceNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentX59c2a9ce matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentX59c2a9ce(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentX59c2a9ce> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentX59c2a9ce {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentX59c2a9ce")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentX59c2a9ce) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentX59c2a9ce").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentX59c2a9ce(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentX59c2a9ceInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xc72becfa = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xc72becfa>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentX59c2a9ceInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xc72becfa = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xc72becfa,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xc72becfa) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xc72becfa: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xc72becfa")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
