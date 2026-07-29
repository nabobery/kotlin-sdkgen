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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX28ffc4fdBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4415aac8,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfddd4aa3,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX28ffc4fdDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX28ffc4fdNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX28ffc4fdDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX28ffc4fdInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4415aac8:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfddd4aa3:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4415aac8, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfddd4aa3).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/bacs_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/bacs_debit
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX28ffc4fd.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX28ffc4fd internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX28ffc4fdInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4415aac8:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4415aac8? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4415aac8) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4415aac8>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfddd4aa3:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfddd4aa3? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfddd4aa3) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfddd4aa3>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX28ffc4fdBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4415aac8) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX28ffc4fdBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4415aac8)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfddd4aa3) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX28ffc4fdBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfddd4aa3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX28ffc4fd {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX28ffc4fd(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX28ffc4fdNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX28ffc4fd matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX28ffc4fd(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX28ffc4fd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX28ffc4fd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX28ffc4fd")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX28ffc4fd) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX28ffc4fd").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX28ffc4fd(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX28ffc4fdInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4415aac8 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4415aac8>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfddd4aa3 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfddd4aa3>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX28ffc4fdInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4415aac8 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4415aac8,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfddd4aa3 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfddd4aa3,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4415aac8) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4415aac8: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X4415aac8")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfddd4aa3) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfddd4aa3: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfddd4aa3")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
