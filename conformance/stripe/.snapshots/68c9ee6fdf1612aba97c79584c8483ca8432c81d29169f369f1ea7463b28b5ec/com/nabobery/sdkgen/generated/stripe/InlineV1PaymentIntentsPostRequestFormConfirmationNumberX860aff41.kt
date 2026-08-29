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

public enum class InlineV1PaymentIntentsPostRequestFormConfirmationNumberX860aff41Branch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xaa744b08,
}

public sealed class InlineV1PaymentIntentsPostRequestFormConfirmationNumberX860aff41DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormConfirmationNumberX860aff41NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormConfirmationNumberX860aff41DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormConfirmationNumberX860aff41Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xaa744b08:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xaa744b08).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/konbini/anyOf/0/properties/confirmation_number.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/konbini/anyOf/0/properties/confirmation_number
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormConfirmationNumberX860aff41.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormConfirmationNumberX860aff41 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormConfirmationNumberX860aff41Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xaa744b08:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xaa744b08? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xaa744b08) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xaa744b08>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormConfirmationNumberX860aff41Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormConfirmationNumberX860aff41Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xaa744b08) add(InlineV1PaymentIntentsPostRequestFormConfirmationNumberX860aff41Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xaa744b08)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormConfirmationNumberX860aff41 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormConfirmationNumberX860aff41(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormConfirmationNumberX860aff41NoMatchException("InlineV1PaymentIntentsPostRequestFormConfirmationNumberX860aff41 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormConfirmationNumberX860aff41(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormConfirmationNumberX860aff41> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormConfirmationNumberX860aff41 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormConfirmationNumberX860aff41")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormConfirmationNumberX860aff41) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormConfirmationNumberX860aff41").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormConfirmationNumberX860aff41(element: JsonElement): InlineV1PaymentIntentsPostRequestFormConfirmationNumberX860aff41Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xaa744b08 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xaa744b08>()
  return InlineV1PaymentIntentsPostRequestFormConfirmationNumberX860aff41Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xaa744b08 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xaa744b08,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xaa744b08) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xaa744b08: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2Xaa744b08")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
