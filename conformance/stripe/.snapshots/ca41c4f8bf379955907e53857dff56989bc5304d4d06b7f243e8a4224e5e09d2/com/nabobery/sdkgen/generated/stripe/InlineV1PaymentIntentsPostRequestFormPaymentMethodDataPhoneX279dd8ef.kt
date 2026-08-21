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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX279dd8efBranch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X9cc83e05,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX279dd8efDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX279dd8efNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX279dd8efDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX279dd8efInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X9cc83e05: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X9cc83e05).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_data/properties/billing_details/properties/phone.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_data/properties/billing_details/properties/phone
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX279dd8ef.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX279dd8ef internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX279dd8efInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X9cc83e05:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X9cc83e05? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X9cc83e05) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X9cc83e05>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX279dd8efBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX279dd8efBranch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X9cc83e05) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX279dd8efBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X9cc83e05)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX279dd8ef {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX279dd8ef(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX279dd8efNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX279dd8ef matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX279dd8ef(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX279dd8ef> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX279dd8ef {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX279dd8ef")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX279dd8ef) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX279dd8ef").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX279dd8ef(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX279dd8efInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X9cc83e05 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X9cc83e05>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPhoneX279dd8efInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X9cc83e05 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X9cc83e05,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X9cc83e05) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X9cc83e05: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAnyOf2X9cc83e05")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
