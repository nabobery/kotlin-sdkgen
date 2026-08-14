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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanX64e4c023Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xdecc8354,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xfdaf2dcd,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanX64e4c023DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanX64e4c023NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanX64e4c023DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanX64e4c023Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xdecc8354:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xfdaf2dcd:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xdecc8354, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xfdaf2dcd).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/card/anyOf/0/properties/installments/properties/plan.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/card/anyOf/0/properties/installments/properties/plan
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanX64e4c023.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanX64e4c023 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanX64e4c023Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xdecc8354:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xdecc8354? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xdecc8354) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xdecc8354>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xfdaf2dcd:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xfdaf2dcd? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xfdaf2dcd) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xfdaf2dcd>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanX64e4c023Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xdecc8354) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanX64e4c023Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xdecc8354)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xfdaf2dcd) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanX64e4c023Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xfdaf2dcd)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanX64e4c023 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanX64e4c023(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanX64e4c023NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanX64e4c023 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanX64e4c023(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanX64e4c023> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanX64e4c023 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanX64e4c023")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanX64e4c023) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanX64e4c023").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanX64e4c023(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanX64e4c023Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xdecc8354 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xdecc8354>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xfdaf2dcd = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xfdaf2dcd>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1PlanX64e4c023Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xdecc8354 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xdecc8354,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xfdaf2dcd = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xfdaf2dcd,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xdecc8354) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xdecc8354: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf1Xdecc8354")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xfdaf2dcd) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xfdaf2dcd: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xfdaf2dcd")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
