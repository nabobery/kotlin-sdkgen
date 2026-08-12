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

public enum class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPlanX41da961cBranch {
  InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X758ad914,
  InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3477d78b,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPlanX41da961cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPlanX41da961cNoMatchException(
  message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPlanX41da961cDecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPlanX41da961cInspection(
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X758ad914:
      Boolean,
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3477d78b:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X758ad914, matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3477d78b).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/installments/properti
 * es/plan.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/installments/properti
 * es/plan
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPlanX41da961c.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPlanX41da961c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPlanX41da961cInspection,
) {
  public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X758ad914:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X758ad914? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X758ad914) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X758ad914>(raw) else null }

  public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3477d78b:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3477d78b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3477d78b) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3477d78b>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPlanX41da961cBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X758ad914) add(InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPlanX41da961cBranch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X758ad914)
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3477d78b) add(InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPlanX41da961cBranch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3477d78b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPlanX41da961c {
      val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPlanX41da961c(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPlanX41da961cNoMatchException("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPlanX41da961c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPlanX41da961c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPlanX41da961c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPlanX41da961c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPlanX41da961c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPlanX41da961c) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPlanX41da961c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPlanX41da961c(element: JsonElement): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPlanX41da961cInspection {
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X758ad914 = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X758ad914>()
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3477d78b = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3477d78b>()
  return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPlanX41da961cInspection(
    matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X758ad914 = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X758ad914,
    matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3477d78b = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3477d78b,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X758ad914) add("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X758ad914: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X758ad914")
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3477d78b) add("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3477d78b: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3477d78b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
