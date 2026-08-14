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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX6cc3fb8dBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1Xd4392d10,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X7b68a967,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX6cc3fb8dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX6cc3fb8dNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX6cc3fb8dDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX6cc3fb8dInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1Xd4392d10:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X7b68a967:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1Xd4392d10, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X7b68a967).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/paypal.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/paypal
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX6cc3fb8d.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX6cc3fb8d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX6cc3fb8dInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1Xd4392d10:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1Xd4392d10? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1Xd4392d10) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1Xd4392d10>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X7b68a967:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X7b68a967? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X7b68a967) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X7b68a967>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX6cc3fb8dBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1Xd4392d10) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX6cc3fb8dBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1Xd4392d10)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X7b68a967) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX6cc3fb8dBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X7b68a967)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX6cc3fb8d {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX6cc3fb8d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX6cc3fb8dNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX6cc3fb8d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX6cc3fb8d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX6cc3fb8d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX6cc3fb8d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX6cc3fb8d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX6cc3fb8d) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX6cc3fb8d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX6cc3fb8d(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX6cc3fb8dInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1Xd4392d10 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1Xd4392d10>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X7b68a967 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X7b68a967>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX6cc3fb8dInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1Xd4392d10 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1Xd4392d10,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X7b68a967 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X7b68a967,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1Xd4392d10) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1Xd4392d10: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf1Xd4392d10")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X7b68a967) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X7b68a967: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalAnyOf2X7b68a967")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
