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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayX08595034Branch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xd6c1131f,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X6a34cf7c,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayX08595034DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayX08595034NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayX08595034DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayX08595034Inspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xd6c1131f:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X6a34cf7c:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xd6c1131f, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X6a34cf7c).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/kakao_pay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/kakao_pay
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayX08595034.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayX08595034 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayX08595034Inspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xd6c1131f:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xd6c1131f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xd6c1131f) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xd6c1131f>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X6a34cf7c:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X6a34cf7c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X6a34cf7c) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X6a34cf7c>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayX08595034Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xd6c1131f) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayX08595034Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xd6c1131f)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X6a34cf7c) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayX08595034Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X6a34cf7c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayX08595034 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayX08595034(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayX08595034NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayX08595034 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayX08595034(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayX08595034> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayX08595034 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayX08595034")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayX08595034) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayX08595034").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayX08595034(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayX08595034Inspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xd6c1131f = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xd6c1131f>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X6a34cf7c = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X6a34cf7c>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayX08595034Inspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xd6c1131f = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xd6c1131f,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X6a34cf7c = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X6a34cf7c,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xd6c1131f) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xd6c1131f: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf1Xd6c1131f")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X6a34cf7c) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X6a34cf7c: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayAnyOf2X6a34cf7c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
