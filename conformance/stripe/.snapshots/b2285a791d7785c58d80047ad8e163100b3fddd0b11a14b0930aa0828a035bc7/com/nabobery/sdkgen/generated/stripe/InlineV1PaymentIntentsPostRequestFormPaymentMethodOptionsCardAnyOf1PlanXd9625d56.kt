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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanXd9625d56Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X57793046,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanXd9625d56DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanXd9625d56NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanXd9625d56DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanXd9625d56Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X57793046:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X57793046).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/installments/properties/plan.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/installments/properties/plan
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanXd9625d56.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanXd9625d56 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanXd9625d56Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X57793046:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X57793046? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X57793046) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X57793046>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanXd9625d56Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanXd9625d56Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X57793046) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanXd9625d56Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X57793046)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanXd9625d56 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanXd9625d56(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanXd9625d56NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanXd9625d56 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanXd9625d56(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanXd9625d56> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanXd9625d56 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanXd9625d56")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanXd9625d56) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanXd9625d56").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanXd9625d56(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanXd9625d56Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X57793046 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X57793046>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanXd9625d56Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X57793046 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X57793046,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xa69c130f")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X57793046) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X57793046: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2X57793046")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
