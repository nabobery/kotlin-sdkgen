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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXe9f82caaBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xe2c4c46f,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2X21be80d1,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXe9f82caaDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXe9f82caaNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXe9f82caaDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXe9f82caaInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xe2c4c46f:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2X21be80d1:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xe2c4c46f, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2X21be80d1).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/kr_card.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/kr_card
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXe9f82caa.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXe9f82caa internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXe9f82caaInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xe2c4c46f:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xe2c4c46f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xe2c4c46f) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xe2c4c46f>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2X21be80d1:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2X21be80d1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2X21be80d1) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2X21be80d1>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXe9f82caaBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xe2c4c46f) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXe9f82caaBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xe2c4c46f)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2X21be80d1) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXe9f82caaBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2X21be80d1)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXe9f82caa {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXe9f82caa(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXe9f82caaNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXe9f82caa matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXe9f82caa(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXe9f82caa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXe9f82caa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXe9f82caa")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXe9f82caa) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXe9f82caa").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXe9f82caa(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXe9f82caaInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xe2c4c46f = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xe2c4c46f>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2X21be80d1 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2X21be80d1>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXe9f82caaInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xe2c4c46f = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xe2c4c46f,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2X21be80d1 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2X21be80d1,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xe2c4c46f) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xe2c4c46f: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf1Xe2c4c46f")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2X21be80d1) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2X21be80d1: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardAnyOf2X21be80d1")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
