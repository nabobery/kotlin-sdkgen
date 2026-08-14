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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameX440b5d6aBranch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X97057edc,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameX440b5d6aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameX440b5d6aNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameX440b5d6aDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameX440b5d6aInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X97057edc: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X97057edc).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/name.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/name
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameX440b5d6a.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameX440b5d6a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameX440b5d6aInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X97057edc:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X97057edc? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X97057edc) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X97057edc>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameX440b5d6aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameX440b5d6aBranch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X97057edc) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameX440b5d6aBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X97057edc)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameX440b5d6a {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameX440b5d6a(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameX440b5d6aNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameX440b5d6a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameX440b5d6a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameX440b5d6a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameX440b5d6a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameX440b5d6a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameX440b5d6a) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameX440b5d6a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameX440b5d6a(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameX440b5d6aInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X97057edc = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X97057edc>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNameX440b5d6aInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X97057edc = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X97057edc,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X97057edc) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X97057edc: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X97057edc")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
