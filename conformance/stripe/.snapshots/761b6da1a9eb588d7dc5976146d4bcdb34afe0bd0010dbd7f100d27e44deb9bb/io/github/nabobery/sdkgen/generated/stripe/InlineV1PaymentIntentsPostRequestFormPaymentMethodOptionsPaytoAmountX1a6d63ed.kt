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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX1a6d63edBranch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0f115ab7,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX1a6d63edDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX1a6d63edNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX1a6d63edDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX1a6d63edInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0f115ab7:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0f115ab7).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/payto/anyOf/0/properties/mandate_options/properties/amount.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/payto/anyOf/0/properties/mandate_options/properties/amount
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX1a6d63ed.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX1a6d63ed internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX1a6d63edInspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0f115ab7:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0f115ab7? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0f115ab7) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0f115ab7>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX1a6d63edBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX1a6d63edBranch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0f115ab7) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX1a6d63edBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0f115ab7)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX1a6d63ed {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX1a6d63ed(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX1a6d63edNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX1a6d63ed matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX1a6d63ed(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX1a6d63ed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX1a6d63ed {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX1a6d63ed")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX1a6d63ed) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX1a6d63ed").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX1a6d63ed(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX1a6d63edInspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0f115ab7 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0f115ab7>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAmountX1a6d63edInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0f115ab7 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0f115ab7,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0f115ab7) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0f115ab7: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X0f115ab7")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
