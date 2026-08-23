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

public enum class InlineV1PaymentIntentsConfirmPostRequestFormSatispayX67af2a9cBranch {
  InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e,
  InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X5c720fc0,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormSatispayX67af2a9cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormSatispayX67af2a9cNoMatchException(
  message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormSatispayX67af2a9cDecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormSatispayX67af2a9cInspection(
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e:
      Boolean,
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X5c720fc0:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e, matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X5c720fc0).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/satispay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/satispay
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormSatispayX67af2a9c.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormSatispayX67af2a9c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentIntentsConfirmPostRequestFormSatispayX67af2a9cInspection,
) {
  public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e>(raw) else null }

  public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X5c720fc0:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X5c720fc0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X5c720fc0) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X5c720fc0>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsConfirmPostRequestFormSatispayX67af2a9cBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e) add(InlineV1PaymentIntentsConfirmPostRequestFormSatispayX67af2a9cBranch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e)
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X5c720fc0) add(InlineV1PaymentIntentsConfirmPostRequestFormSatispayX67af2a9cBranch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X5c720fc0)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsConfirmPostRequestFormSatispayX67af2a9c {
      val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormSatispayX67af2a9c(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsConfirmPostRequestFormSatispayX67af2a9cNoMatchException("InlineV1PaymentIntentsConfirmPostRequestFormSatispayX67af2a9c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsConfirmPostRequestFormSatispayX67af2a9c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormSatispayX67af2a9c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormSatispayX67af2a9c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormSatispayX67af2a9c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormSatispayX67af2a9c) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormSatispayX67af2a9c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormSatispayX67af2a9c(element: JsonElement): InlineV1PaymentIntentsConfirmPostRequestFormSatispayX67af2a9cInspection {
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e>()
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X5c720fc0 = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X5c720fc0>()
  return InlineV1PaymentIntentsConfirmPostRequestFormSatispayX67af2a9cInspection(
    matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e,
    matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X5c720fc0 = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X5c720fc0,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e) add("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xb852eb7e")
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X5c720fc0) add("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X5c720fc0: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X5c720fc0")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
