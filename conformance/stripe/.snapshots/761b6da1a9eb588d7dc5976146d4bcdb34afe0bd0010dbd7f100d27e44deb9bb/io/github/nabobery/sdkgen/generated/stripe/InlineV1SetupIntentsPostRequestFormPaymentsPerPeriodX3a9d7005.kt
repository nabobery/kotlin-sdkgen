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

public enum class InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX3a9d7005Branch {
  Branch1,
  InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1a4ef782,
}

public sealed class InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX3a9d7005DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX3a9d7005NoMatchException(
  message: String,
) : InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX3a9d7005DecodingException(message)

internal data class InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX3a9d7005Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1a4ef782:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1a4ef782).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/payments_per_period.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/payments_per_period
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX3a9d7005.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX3a9d7005 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX3a9d7005Inspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1a4ef782:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1a4ef782? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1a4ef782) json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1a4ef782>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX3a9d7005Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX3a9d7005Branch.Branch1)
      if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1a4ef782) add(InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX3a9d7005Branch.InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1a4ef782)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX3a9d7005 {
      val inspection = inspectInlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX3a9d7005(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX3a9d7005NoMatchException("InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX3a9d7005 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX3a9d7005(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX3a9d7005> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX3a9d7005 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX3a9d7005")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX3a9d7005) {
      encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX3a9d7005").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX3a9d7005(element: JsonElement): InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX3a9d7005Inspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1a4ef782 = element.isJsonDecodable<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1a4ef782>()
  return InlineV1SetupIntentsPostRequestFormPaymentsPerPeriodX3a9d7005Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1a4ef782 = matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1a4ef782,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1a4ef782) add("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1a4ef782: value does not match InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X1a4ef782")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
