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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXbf4acc1cBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X344afa7f,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X9c5d8e13,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXbf4acc1cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXbf4acc1cNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXbf4acc1cDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXbf4acc1cInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X344afa7f:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X9c5d8e13:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X344afa7f, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X9c5d8e13).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/alma.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/alma
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXbf4acc1c.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXbf4acc1c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXbf4acc1cInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X344afa7f:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X344afa7f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X344afa7f) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X344afa7f>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X9c5d8e13:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X9c5d8e13? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X9c5d8e13) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X9c5d8e13>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXbf4acc1cBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X344afa7f) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXbf4acc1cBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X344afa7f)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X9c5d8e13) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXbf4acc1cBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X9c5d8e13)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXbf4acc1c {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXbf4acc1c(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXbf4acc1cNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXbf4acc1c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXbf4acc1c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXbf4acc1c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXbf4acc1c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXbf4acc1c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXbf4acc1c) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXbf4acc1c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXbf4acc1c(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXbf4acc1cInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X344afa7f = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X344afa7f>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X9c5d8e13 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X9c5d8e13>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXbf4acc1cInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X344afa7f = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X344afa7f,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X9c5d8e13 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X9c5d8e13,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X344afa7f) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X344afa7f: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf1X344afa7f")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X9c5d8e13) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X9c5d8e13: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaAnyOf2X9c5d8e13")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
