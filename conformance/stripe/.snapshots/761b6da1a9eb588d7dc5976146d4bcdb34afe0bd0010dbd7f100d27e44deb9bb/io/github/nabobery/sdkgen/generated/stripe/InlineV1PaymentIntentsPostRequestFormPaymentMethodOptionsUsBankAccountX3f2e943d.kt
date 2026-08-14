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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX3f2e943dBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X183ab2e8,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX3f2e943dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX3f2e943dNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX3f2e943dDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX3f2e943dInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X183ab2e8:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X183ab2e8).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/us_bank_account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/us_bank_account
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX3f2e943d.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX3f2e943d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX3f2e943dInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X183ab2e8:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X183ab2e8? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X183ab2e8) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X183ab2e8>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX3f2e943dBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX3f2e943dBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X183ab2e8) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX3f2e943dBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X183ab2e8)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX3f2e943d {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX3f2e943d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX3f2e943dNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX3f2e943d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX3f2e943d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX3f2e943d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX3f2e943d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX3f2e943d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX3f2e943d) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX3f2e943d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX3f2e943d(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX3f2e943dInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X183ab2e8 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X183ab2e8>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX3f2e943dInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X183ab2e8 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X183ab2e8,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X2807e768")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X183ab2e8) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X183ab2e8: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X183ab2e8")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
