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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaXa532cb7cBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X5e2ac01c,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaXa532cb7cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaXa532cb7cNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaXa532cb7cDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaXa532cb7cInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X5e2ac01c:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X5e2ac01c).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/klarna.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/klarna
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaXa532cb7c.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaXa532cb7c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaXa532cb7cInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X5e2ac01c:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X5e2ac01c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X5e2ac01c) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X5e2ac01c>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaXa532cb7cBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaXa532cb7cBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X5e2ac01c) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaXa532cb7cBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X5e2ac01c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaXa532cb7c {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaXa532cb7c(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaXa532cb7cNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaXa532cb7c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaXa532cb7c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaXa532cb7c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaXa532cb7c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaXa532cb7c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaXa532cb7c) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaXa532cb7c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaXa532cb7c(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaXa532cb7cInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X5e2ac01c = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X5e2ac01c>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaXa532cb7cInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X5e2ac01c = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X5e2ac01c,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf1X65ff0c2a")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X5e2ac01c) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X5e2ac01c: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X5e2ac01c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
