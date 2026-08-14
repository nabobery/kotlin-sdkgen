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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX05efcaccBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X594e4f54,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa472804c,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX05efcaccDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX05efcaccNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX05efcaccDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX05efcaccInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X594e4f54:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa472804c:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X594e4f54, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa472804c).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/bacs_debit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/bacs_debit
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX05efcacc.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX05efcacc internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX05efcaccInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X594e4f54:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X594e4f54? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X594e4f54) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X594e4f54>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa472804c:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa472804c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa472804c) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa472804c>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX05efcaccBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X594e4f54) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX05efcaccBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X594e4f54)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa472804c) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX05efcaccBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa472804c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX05efcacc {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX05efcacc(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX05efcaccNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX05efcacc matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX05efcacc(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX05efcacc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX05efcacc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX05efcacc")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX05efcacc) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX05efcacc").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX05efcacc(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX05efcaccInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X594e4f54 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X594e4f54>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa472804c = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa472804c>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX05efcaccInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X594e4f54 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X594e4f54,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa472804c = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa472804c,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X594e4f54) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X594e4f54: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X594e4f54")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa472804c) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa472804c: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xa472804c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
