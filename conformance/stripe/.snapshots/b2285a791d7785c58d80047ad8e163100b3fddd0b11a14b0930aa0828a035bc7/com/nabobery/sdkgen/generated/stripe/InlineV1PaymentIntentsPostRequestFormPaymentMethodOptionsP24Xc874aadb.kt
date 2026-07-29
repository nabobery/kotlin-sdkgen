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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24Xc874aadbBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xd728c88a,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24Xc874aadbDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24Xc874aadbNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24Xc874aadbDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24Xc874aadbInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xd728c88a:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xd728c88a).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/p24.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/p24
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24Xc874aadb.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24Xc874aadb internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24Xc874aadbInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xd728c88a:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xd728c88a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xd728c88a) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xd728c88a>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24Xc874aadbBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24Xc874aadbBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xd728c88a) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24Xc874aadbBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xd728c88a)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24Xc874aadb {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24Xc874aadb(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24Xc874aadbNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24Xc874aadb matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24Xc874aadb(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24Xc874aadb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24Xc874aadb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24Xc874aadb")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24Xc874aadb) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24Xc874aadb").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24Xc874aadb(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24Xc874aadbInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xd728c88a = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xd728c88a>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24Xc874aadbInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xd728c88a = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xd728c88a,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf1X4acd05ac")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xd728c88a) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xd728c88a: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24AnyOf2Xd728c88a")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
