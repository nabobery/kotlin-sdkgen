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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceX6b127be7Branch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X62b163a3,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceX6b127be7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceX6b127be7NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceX6b127be7DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceX6b127be7Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X62b163a3:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X62b163a3).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/swish/anyOf/0/properties/reference.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/swish/anyOf/0/properties/reference
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceX6b127be7.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceX6b127be7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceX6b127be7Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X62b163a3:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X62b163a3? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X62b163a3) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X62b163a3>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceX6b127be7Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceX6b127be7Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X62b163a3) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceX6b127be7Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X62b163a3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceX6b127be7 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceX6b127be7(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceX6b127be7NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceX6b127be7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceX6b127be7(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceX6b127be7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceX6b127be7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceX6b127be7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceX6b127be7) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceX6b127be7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceX6b127be7(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceX6b127be7Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X62b163a3 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X62b163a3>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceX6b127be7Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X62b163a3 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X62b163a3,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X62b163a3) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X62b163a3: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf2X62b163a3")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
