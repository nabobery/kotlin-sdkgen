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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodXf5ef3618Branch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0cc9b826,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodXf5ef3618DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodXf5ef3618NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodXf5ef3618DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodXf5ef3618Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0cc9b826:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0cc9b826).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/payto/anyOf/0/properties/mandate_options/properties/payments_per
 * _period.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/payto/anyOf/0/properties/mandate_options/properties/payments_per
 * _period
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodXf5ef3618.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodXf5ef3618 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodXf5ef3618Inspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0cc9b826:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0cc9b826? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0cc9b826) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0cc9b826>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodXf5ef3618Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodXf5ef3618Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0cc9b826) add(InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodXf5ef3618Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0cc9b826)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodXf5ef3618 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodXf5ef3618(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodXf5ef3618NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodXf5ef3618 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodXf5ef3618(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodXf5ef3618> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodXf5ef3618 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodXf5ef3618")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodXf5ef3618) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodXf5ef3618").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodXf5ef3618(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodXf5ef3618Inspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0cc9b826 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0cc9b826>()
  return InlineV1PaymentIntentsPostRequestFormPaymentsPerPeriodXf5ef3618Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0cc9b826 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0cc9b826,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0cc9b826) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0cc9b826: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0cc9b826")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
