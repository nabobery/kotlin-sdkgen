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

public enum class InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysXb3297a1cBranch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X15b8120f,
}

public sealed class InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysXb3297a1cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysXb3297a1cNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysXb3297a1cDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysXb3297a1cInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X15b8120f:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X15b8120f).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/konbini/anyOf/0/properties/expires_after_days.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/konbini/anyOf/0/properties/expires_after_days
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysXb3297a1c.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysXb3297a1c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysXb3297a1cInspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X15b8120f:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X15b8120f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X15b8120f) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X15b8120f>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysXb3297a1cBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysXb3297a1cBranch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X15b8120f) add(InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysXb3297a1cBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X15b8120f)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysXb3297a1c {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormExpiresAfterDaysXb3297a1c(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysXb3297a1cNoMatchException("InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysXb3297a1c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysXb3297a1c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysXb3297a1c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysXb3297a1c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysXb3297a1c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysXb3297a1c) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysXb3297a1c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormExpiresAfterDaysXb3297a1c(element: JsonElement): InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysXb3297a1cInspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X15b8120f = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X15b8120f>()
  return InlineV1PaymentIntentsPostRequestFormExpiresAfterDaysXb3297a1cInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X15b8120f = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X15b8120f,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X15b8120f) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X15b8120f: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X15b8120f")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
